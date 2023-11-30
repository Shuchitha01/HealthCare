package com.project.staragile;
//package com.project.staragile;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface MedicureRepository extends JpaRepository<Doctor,String>{
//
//}
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<String, Long> {
    // No additional methods required for a simple "Hello World" string repository
}
