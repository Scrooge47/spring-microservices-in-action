package com.avseenkov.licensingserver.repository;

import com.avseenkov.licensingserver.model.License;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LicenseRepository extends CrudRepository<License, String> {
    public List<License> findByOrganizationId
            (String organizationId);

    public License findByOrganizationIdAndLicenseId
            (String organizationId,
             String licenseId);
}
