package com.totalcare.dental.services.springdatajpa;

import com.totalcare.dental.model.Patient;
import com.totalcare.dental.repositories.PatientRepository;
import com.totalcare.dental.services.PatientService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PatientJpaService implements PatientService
{
    private final PatientRepository patientRepository;

    public PatientJpaService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Set<Patient> findAll() {
        Set<Patient> patients = new HashSet<>();
        patientRepository.findAll().forEach(patients::add);

        return patients;
    }

    @Override
    public Patient findById(Long aLong) {
        return patientRepository.findById(aLong).orElse(null);
    }

    @Override
    public Patient save(Patient object) {
        return patientRepository.save(object);
    }

    @Override
    public void delete(Patient object)
    {
        patientRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong)
    {
        patientRepository.deleteById(aLong);
    }
}
