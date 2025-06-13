package com.learn.CloudVendor.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.CloudVendor.Model.CloudVendorModel;

@RestController
@RequestMapping("/API/Learn")
public class CloudVendorService {
	
	private CloudVendorModel cloudVendor;
    
	@GetMapping("/{vendorId}")
	public ResponseEntity<CloudVendorModel> getCloudVendor(@PathVariable String vendorId) {
		if(cloudVendor == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(cloudVendor);
	}
	
	@PostMapping
	public ResponseEntity<String> createCloudVendor(@RequestBody CloudVendorModel model) {
		this.cloudVendor = model;
		return ResponseEntity.ok("Created model");
	}
	
	@PutMapping
	public ResponseEntity<String> upadateCloudVendor(@RequestBody CloudVendorModel model) {
		this.cloudVendor = model;
		return ResponseEntity.ok("vendor updated");
	}
	
	@DeleteMapping("/{vendorId}")
	public ResponseEntity<String> deleteCloudVendor(@PathVariable String vendorId) {
		this.cloudVendor = null;
		return ResponseEntity.ok("Deleted");
	}
	
}
