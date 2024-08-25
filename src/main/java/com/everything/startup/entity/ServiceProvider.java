package com.everything.startup.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "service_provider")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceProvider {
    @Id
    private ObjectId id;
    private String name;
    private String location;
    private String contactNo;
    private Integer chargesForOneDay;
    private String rating;
}