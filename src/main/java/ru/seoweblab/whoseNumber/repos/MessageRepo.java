package ru.seoweblab.whoseNumber.repos;


import org.springframework.data.repository.CrudRepository;

import ru.seoweblab.whoseNumber.domain.Message;

import java.math.BigInteger;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByPhoneNumber(BigInteger phoneNumber);
}

