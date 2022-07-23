package com.michelon.vacations.destiny.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.michelon.vacations.destiny.mongo.api.domain.Destiny;

public interface DestinyRepository extends MongoRepository<Destiny, String> {

}
