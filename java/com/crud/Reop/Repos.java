package com.crud.Reop;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.Model.EmpModel;

public interface Repos  extends  JpaRepository<EmpModel,String>{

}
