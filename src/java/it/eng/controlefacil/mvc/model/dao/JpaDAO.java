package it.eng.controlefacil.mvc.model.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.support.JpaDaoSupport;

/**
 *
 * @author Manuel Guerrero
 */

public abstract class JpaDAO<K, E> extends JpaDaoSupport {
    protected Class<E> entityClass;

    @SuppressWarnings("unchecked")
    public JpaDAO() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
    }

    public E findById(K id) {
        return getJpaTemplate().find(entityClass, id);
    }

    public List<E> findAll() {
        return (List<E>) getJpaTemplate().execute(
                new JpaCallback() {
                    @Override
                    public Object doInJpa(EntityManager em) throws PersistenceException {
                        return em.createQuery("SELECT h FROM "+entityClass.getName()+" h")
                                .getResultList();
                    }
        });
    }
}
