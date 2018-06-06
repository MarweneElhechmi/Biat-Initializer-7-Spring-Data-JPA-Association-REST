package tn.biat.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.biat.entities.Compte;

@RepositoryRestResource(collectionResourceRel="comptes",path="comptes")
public interface CompteRest extends JpaRepository<Compte, Long>{

}
