package com.everything.startup.controller;

//import com.everything.Everything.entity.MainCategory;
//import com.everything.Everything.entity.ServiceProvider;
//import com.everything.Everything.service.MainCategoryService;
//import com.everything.Everything.service.ServiceProviderService;
import com.everything.startup.entity.MainCategory;
import com.everything.startup.entity.ServiceProvider;
import com.everything.startup.service.MainCategoryService;
import com.everything.startup.service.ServiceProviderService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
@Slf4j
public class CategoryController {

    //    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);
    @Autowired
    private ServiceProviderService serviceProviderService;

    @Autowired
    private MainCategoryService mainCategoryService;

    @PostMapping
    public ResponseEntity<?> CategoryController(@RequestBody ServiceProvider serviceProvider) {
        serviceProviderService.saveNewSP(serviceProvider);
        log.info("saving service provider");
        return ResponseEntity.ok("Success");
    }

    @GetMapping
    public List<ServiceProvider> getServiceProvider() {
        log.info("retrieving service providers");
        return serviceProviderService.getAllServiceProvider();

    }

    @PostMapping("main")
    public ResponseEntity<?> CategoryController(@RequestBody MainCategory mainCategory) {
        mainCategoryService.save(mainCategory);
        log.info("saving main category");
        return ResponseEntity.ok("Success");
    }

    @GetMapping("main")
    public List<MainCategory> getMainCategory() {
        log.info("retrieving main category");
        return mainCategoryService.getAll();
    }
}