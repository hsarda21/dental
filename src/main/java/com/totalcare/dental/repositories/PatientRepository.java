package com.totalcare.dental.repositories;

import com.totalcare.dental.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long>
{

}
