package com.xtg.employeeleave.service;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import com.xtg.employeeleave.dto.LeaveTypeDTO;

public interface LeaveTypeService {

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    List<LeaveTypeDTO> getAllLeaveTypes();

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    LeaveTypeDTO getLeaveTypeById(Long id);

    // only admin
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    LeaveTypeDTO createLeaveType(LeaveTypeDTO leaveTypeDTO);

    // only admin
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    LeaveTypeDTO updateLeaveType(LeaveTypeDTO leaveTypeDTO);

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    List<LeaveTypeDTO> searchOnLeaveType(String typeName);

}