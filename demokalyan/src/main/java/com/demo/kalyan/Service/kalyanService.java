package com.demo.kalyan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.kalyan.Entity.kalyanEntity;
import com.demo.kalyan.Repository.kalyanRepoInt;

@Service
public class kalyanService implements kalyanServiceInt {
	@Autowired
	public kalyanRepoInt hi;

	@Override
	public List<kalyanEntity> get() {
		return hi.findAll();
	}

}
