package com.totalcare.dental.repositories;

import com.totalcare.dental.model.Visit;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Set;

public interface VisitRepository extends CrudRepository<Visit, Long>
{
    public Set<Visit> findAllByDate(Date date);
}
