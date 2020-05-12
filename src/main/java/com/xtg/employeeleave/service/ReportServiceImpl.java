package com.xtg.employeeleave.service;

import org.springframework.stereotype.Service;

import com.xtg.employeeleave.dto.LeaveReportDTO;
import com.xtg.employeeleave.repository.LeaveRepository;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    private final LeaveRepository leaveRepository;

    public ReportServiceImpl(final LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }

    @Override
    public List<LeaveReportDTO> retrieveLeaveReports() {
        return leaveRepository.generateLeaveReport();
    }
}
