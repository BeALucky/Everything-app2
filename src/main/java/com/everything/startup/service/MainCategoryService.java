package com.everything.startup.service;

//import com.everything.Everything.entity.MainCategory;
//import com.everything.Everything.repo.MainCategoryRepo;
import com.everything.startup.entity.MainCategory;
import com.everything.startup.repo.MainCategoryRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MainCategoryService {
    @Autowired
    private MainCategoryRepo mainCategoryRepo;

    public void save(MainCategory mainCategory) {
        mainCategoryRepo.save(mainCategory);
        log.info("Saved MainCategory");
    }

    public List<MainCategory> getAll(){
        return mainCategoryRepo.findAll();
    }
}
