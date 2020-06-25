package com.totalcare.dental.services.springdatajpa;

import com.totalcare.dental.model.Dentist;
import com.totalcare.dental.repositories.DentistRepository;
import com.totalcare.dental.services.DentistService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DentistJpaService implements DentistService
{
    private final DentistRepository dentistRepository;

    public DentistJpaService(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public Set<Dentist> findAll() {
        Set<Dentist> dentists = new HashSet<>();
        dentistRepository.findAll().forEach(dentists::add);

        return dentists;
    }

    @Override
    public Dentist findById(Long aLong) {
        return dentistRepository.findById(aLong).orElse(null);
    }

    @Override
    public Dentist save(Dentist object) {
        return dentistRepository.save(object);
    }

    @Override
    public void delete(Dentist object)
    {
        dentistRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong)
    {
        dentistRepository.deleteById(aLong);
    }
}
