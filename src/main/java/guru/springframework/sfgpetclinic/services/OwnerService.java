package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);

    void delete(Owner object);

    void deleteById(Long aLong);

    Set<Owner> findAll();
}
