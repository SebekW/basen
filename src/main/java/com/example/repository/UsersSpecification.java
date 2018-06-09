package com.example.repository;

import com.example.entity.Users;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;


public class UsersSpecification implements Specification<Users> {

    private final Users criteria;

    public UsersSpecification(Users criteria) {
        this.criteria = criteria;
    }

}
