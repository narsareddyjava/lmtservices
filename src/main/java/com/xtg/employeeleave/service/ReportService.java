package com.xtg.employeeleave.service;

import java.util.List;

import com.xtg.employeeleave.dto.LeaveReportDTO;

public interface ReportService {

    List<LeaveReportDTO> retrieveLeaveReports();
}