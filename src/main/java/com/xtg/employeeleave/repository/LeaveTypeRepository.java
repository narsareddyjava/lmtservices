package com.xtg.employeeleave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtg.employeeleave.entity.LeaveType;

import java.util.List;

@Repository
public interface LeaveTypeRepository extends JpaRepository<LeaveType, Long> {

    LeaveType findByTypeName(String typeName);
    List<LeaveType> findAllByTypeNameContaining(String typeName);
}