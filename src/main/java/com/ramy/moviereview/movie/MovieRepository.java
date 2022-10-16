package com.ramy.moviereview.movie;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //This layer will provide the mechanism for storage, retrieval, updating, deleting, and searching operations on objects.
public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {//JpaRepository provides a bunch of crud methods like- findAll(), saveAll(). getById(), etc.

//    MovieEntity findByName(String name);

}
