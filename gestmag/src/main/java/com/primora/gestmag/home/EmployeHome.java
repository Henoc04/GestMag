package com.primora.gestmag.home;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.primora.gestmag.models.Employe;

@Named
@RequestScoped
public class EmployeHome {
	@PersistenceContext
    private EntityManager entityManager;

    public List<Employe> getEmployes() {
        return entityManager.createQuery("SELECT e FROM employes e", Employe.class).getResultList();
    }

}
