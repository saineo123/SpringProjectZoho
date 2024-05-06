package projectManagementSystem.projectManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projectManagementSystem.projectManagement.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long>{
    
}