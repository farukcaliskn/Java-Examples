package com.example.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			/*
			 * List<City> cities =
			 * session.createQuery("from City c ORDER BY c.population DESC").getResultList()
			 * ;
			 * 
			 * for (City city : cities) { System.out.println(city.getName() + "=>" +
			 * city.getPopulation()); }
			 */
			/*
			 * List<String> countryCodes = session .createQuery(
			 * "select c.countryCode from City c GROUP BY c.countryCode Having countryCode LIKE 'a%' "
			 * ) .getResultList(); for (String countryCode : countryCodes) {
			 * System.out.println(countryCode); }
			 */
			/*
			 * City city = new City(); city.setName("Düzce"); city.setCountryCode("TUR");
			 * city.setDistrict("Karadeniz"); city.setPopulation(100000);
			 * session.save(city);
			 */
			/*
			 * City city = session.get(City.class, 4080); city.setPopulation(150000);
			 * session.save(city);
			 */
			City city = session.get(City.class, 4080);
			session.delete(city);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}

	}

}
