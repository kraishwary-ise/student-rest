package com.springLocation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Locorepository extends JpaRepository<LocationModel, Integer>  {

}
