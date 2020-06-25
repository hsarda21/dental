package com.totalcare.dental.services.springdatajpa;

import com.totalcare.dental.model.Visit;
import com.totalcare.dental.repositories.VisitRepository;
import com.totalcare.dental.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Service
public class VisitJpaService implements VisitService
{
    VisitRepository visitRepository;

    @Override
    public Set<Visit> findAllByDate(Date date) {
        return null;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);

        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object)
    {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong)
    {
        visitRepository.deleteById(aLong);
    }
}
