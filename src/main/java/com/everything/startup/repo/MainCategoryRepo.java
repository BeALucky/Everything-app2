package com.everything.startup.repo;

//import com.everything.Everything.entity.MainCategory;
import com.everything.startup.entity.MainCategory;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MainCategoryRepo extends MongoRepository<MainCategory, ObjectId> {
}
