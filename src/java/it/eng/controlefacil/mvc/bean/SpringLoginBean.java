package it.eng.controlefacil.mvc.bean;

/**
 *
 * @author Manuel Guerrero
 */

import java.io.IOException;
import javax.faces.bean.ManagedBean;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.context.annotation.Scope;

@ManagedBean
@Scope("request")
public class SpringLoginBean {
    private String user;
    private String password;
    private boolean storeUser = false;
    private boolean logIn = false;

    public boolean isLogIn() {
        return logIn;
    }

    public void setLogIn(boolean logIn) {
        this.logIn = logIn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStoreUser() {
        return storeUser;
    }

    public void setStoreUser(boolean storeUser) {
        this.storeUser = storeUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getWarf() {
        return "wARf";
    }

    public String loginAction() throws IOException, ServletException {
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();

        RequestDispatcher dispatcher = ((ServletRequest) context.getRequest()).getRequestDispatcher("/j_spring_security_check");
        dispatcher.forward((ServletRequest) context.getRequest(), (ServletResponse) context.getResponse());

        FacesContext.getCurrentInstance().responseComplete();
        
        return null;
    }
}
