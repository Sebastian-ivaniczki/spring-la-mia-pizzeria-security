package group.java.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import group.java.demo.entity.Ingredient;
import group.java.demo.entity.Pizza;
import group.java.demo.entity.SpecialOffer;
import group.java.demo.service.IngredientService;
import group.java.demo.service.PizzaService;
import group.java.demo.service.SpecialOfferServ;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
		
		
	}
	
	@Autowired
	private PizzaService pizzaService;
	@Autowired
	private SpecialOfferServ specialsev;
	
	@Autowired
	private IngredientService ingredientService;
	
	@Override
	public void run(String... args) throws Exception {
		//Offer
		
		SpecialOffer o1 = new SpecialOffer(LocalDate.now(), LocalDate.now(), "fast", 10);
		SpecialOffer o2 = new SpecialOffer(LocalDate.now(), LocalDate.now(), "super", 15);
		SpecialOffer o3 = new SpecialOffer(LocalDate.now(), LocalDate.now(), "pippo", 20);
		specialsev.save(o1);
		specialsev.save(o2);
		specialsev.save(o3);
		
		//ingredients 
				Ingredient i = new Ingredient("peperoni");
				Ingredient i1 = new Ingredient("salsiccia");
				Ingredient i2 = new Ingredient("salame");
				Ingredient i3 = new Ingredient("mozzarella");
				ingredientService.save(i);
				ingredientService.save(i1);
				ingredientService.save(i2);
				ingredientService.save(i3);
		
		//Pizza
		Pizza p = new Pizza("margherita 1", "buona buona" ,"https://www.unmondodisapori.it/wp-content/uploads/2017/10/margherita.jpg", 5.00f, o1);
		Pizza p1 = new Pizza("margherita 2", "buona buona" ,"https://www.unmondodisapori.it/wp-content/uploads/2017/10/margherita.jpg", 5.00f, o1);
		Pizza p2 = new Pizza("margherita 3", "buona buona" ,"https://www.unmondodisapori.it/wp-content/uploads/2017/10/margherita.jpg", 5.00f,o2);
		Pizza p3 = new Pizza("margherita 4", "buona buona" ,"https://www.unmondodisapori.it/wp-content/uploads/2017/10/margherita.jpg", 5.00f,o3);
		Pizza p4 = new Pizza("margherita 5", "buona buona" ,"https://www.unmondodisapori.it/wp-content/uploads/2017/10/margherita.jpg", 5.00f,o3);
		pizzaService.save(p);
		pizzaService.save(p1);
		pizzaService.save(p2);
		pizzaService.save(p3);
		pizzaService.save(p4);
		
		
		
	}

}
