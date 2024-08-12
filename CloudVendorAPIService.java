package com.thinkconstructive.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.restdemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {
	
	CloudVendor cloudvendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId)
	{
		if (cloudvendor != null && cloudvendor.getVendorId().equals(vendorId)) {
            return cloudvendor;
        }
        return null; // Return null if the vendorId doesn't match or if cloudvendor is not set
    }
	
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
	{
		this.cloudvendor = cloudvendor;
		return "Cloud Vendor Created Successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
	{
		this.cloudvendor = cloudvendor;
		return "Cloud Vendor Updated Successfully";
	}
	
	

}
