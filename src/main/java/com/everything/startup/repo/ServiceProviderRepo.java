package com.everything.startup.repo;


import com.everything.startup.entity.ServiceProvider;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServiceProviderRepo extends MongoRepository<ServiceProvider, ObjectId> {
}
