package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class SbaAdvancedApplicationJpaApplicationTests {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private CustomerRepository customers;

	@Test
	public void testFindByLastName() {
		Customer customer = new Customer("first", "last");
		entityManager.persist(customer);

		List<Customer> findByLastName = customers.findByLastName(customer.getLastName());

		assertThat(findByLastName).extracting(Customer::getLastName).containsOnly(customer.getLastName());
	}
}