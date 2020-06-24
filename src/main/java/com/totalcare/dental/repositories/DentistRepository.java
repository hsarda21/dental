package com.totalcare.dental.repositories;

import com.totalcare.dental.model.Dentist;
import org.springframework.data.repository.CrudRepository;

public interface DentistRepository extends CrudRepository<Dentist, Long>
{

}
