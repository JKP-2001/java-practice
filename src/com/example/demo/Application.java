/**
 * 
 */
package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.model.IceCream;
import com.example.demo.model.Product;
import com.example.demo.services.IceCreamService;
import com.example.demo.services.ProductService;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Product tv;
		Product mobile;
		IceCream iceCream1;
		IceCream iceCream2;
		ProductService service=null;
		IceCreamService iceCreamService = null;
		try {
		
			tv = new Product(101,"sony tv",45000);
			mobile = new Product(102,"one plus",55000);
			iceCream1 = new IceCream(103,"Cornetto",130,"cone","vanilla", LocalDate.of(2023, 12, 31));
			iceCream2 = new IceCream(104,"TriColor",130,"family_pack","choclate", LocalDate.of(2023, 12, 31));
			iceCreamService = new IceCreamService();
			iceCreamService.add(iceCream1);
			iceCreamService.add(iceCream2);



			
			CrudRepository repo = new CrudRepositoryImpl();

			service = new ProductService(repo);
			
			  service.add(tv);
			  service.add(mobile);
		
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
		 
		
		
		  
		  
		  List<Product> list =service.findAll();
		  
		  
		  for(Product eachProduct:list) {
			  
				  System.out.println(eachProduct);
			  
		  }

		  iceCreamService.findAll().forEach(System.out::println);
		
	}

}
