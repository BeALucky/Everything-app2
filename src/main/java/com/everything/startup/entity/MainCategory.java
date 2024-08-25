package com.everything.startup.entity;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Document(collection = "main_categories")
@NoArgsConstructor
@AllArgsConstructor
public class MainCategory {
    @Id
    private ObjectId id;
    @Indexed(unique = true) //first enable this in properties file
    @NonNull    //
    private String category;
    private String rating ;
    private Integer ratingCount;
    private String reachingTime;
    @DBRef      //it means it save the ref id of journal
    private List<ServiceProvider> serviceProviders = new ArrayList<>();

}