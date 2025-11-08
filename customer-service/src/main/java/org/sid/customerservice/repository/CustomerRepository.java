package org.sid.customerservice.repository;

import org.sid.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource // il permet a spring de demarrer automatiquement un webservice restful qui permet d'acceder a toutes les methodes dans l'interface
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
