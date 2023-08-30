package com.shop.spring_boot.config;


import com.shop.spring_boot.database.CommonDatabase;
import com.shop.spring_boot.database.Database;
import com.shop.spring_boot.repository.CommonRepository;
import com.shop.spring_boot.repository.Repository;
import org.springframework.boot.autoconfigure.AutoConfiguration;

public class AppConfig {

    public Database database() {
        return new CommonDatabase();
    }
    public Repository repository() {
        return new CommonRepository();
    }
}
