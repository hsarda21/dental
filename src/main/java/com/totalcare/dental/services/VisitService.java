package com.totalcare.dental.services;

import com.totalcare.dental.model.Visit;

import java.util.Date;
import java.util.Set;

public interface VisitService extends CrudService<Visit, Long>
{
    public Set<Visit> findAllByDate(Date date);
}
