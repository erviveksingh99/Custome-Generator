package com.practice.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import java.io.Serializable;
import org.hibernate.query.Query;

public class EmployeeIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "emp";
        String generatedId = null;

        try {
            // Using HQL to count the number of Employee entries in the database
            Query query = session.createQuery("SELECT COUNT(e) FROM Employee e");
            Long count = (Long) query.getSingleResult();
            Long nextId = count + 1;

            // Generate the ID with the prefix
            generatedId = prefix + nextId;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return generatedId;
    }
}
