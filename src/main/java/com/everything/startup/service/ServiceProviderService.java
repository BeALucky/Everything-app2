package com.everything.startup.service;

//import com.everything.Everything.entity.ServiceProvider;
//import com.everything.Everything.repo.ServiceProviderRepo;
import com.everything.startup.entity.ServiceProvider;
import com.everything.startup.repo.ServiceProviderRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ServiceProviderService {

    @Autowired
    private ServiceProviderRepo serviceProviderRepo;

    public void saveNewSP(ServiceProvider serviceProvider){
        ServiceProvider savedSP = serviceProviderRepo.save(serviceProvider);
        log.info("ServiceProvider saved: " + savedSP);
    }

    public List<ServiceProvider> getAllServiceProvider(){
        return serviceProviderRepo.findAll();
    }
}
