package com.luistrujillo.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.luistrujillo.document.Credit;

public interface ICreditRepo  extends ReactiveMongoRepository<Credit,String> {

}
