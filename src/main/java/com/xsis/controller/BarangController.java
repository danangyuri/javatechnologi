package com.xsis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.xsis.service.BarangService;
import com.xsis.service.TransactionService;
import com.xsis.viewmodel.TransactionViewModel;
import com.xsis.model.Barang;
import com.xsis.model.ModelTransaction;

@Controller
public class BarangController {

	@Autowired
	private BarangService brngsr;
	private TransactionService trnscsr;

	@RequestMapping("/barang")
	public String barang() {
		return ("barang/barang");
	}

	@RequestMapping("/listbarang")
	public String listbarang(Model mdl) {
		List<Barang> barangs = brngsr.listall();

		mdl.addAttribute("keybarang", barangs);
		return ("barang/listbarang");
	}

	@RequestMapping(value = "/NewBarang", method = RequestMethod.GET)
	public String NewBarang(Model model) {
		Barang barang = new Barang();
		model.addAttribute("barang", barang);
		return ("barang/NewBarang");
	}

	  @ResponseBody
	  
	  @RequestMapping(value="/savebarang",method=RequestMethod.POST) 
	  public Map<String,String> savebarang(@ModelAttribute ("barang") Barang barang, Model model){
		  System.out.println(barang);
		  System.out.println(barang.getNamabarang());
		  //brngsr.save(barangs);
		 
		  Map<String,String> map = new HashMap <>();
		 
		  if (brngsr.simpan(barang)) {
			  map.put("status", "Berhasil");
		}else {
			map.put("status", "Gagal");
		}
		  
		  
		  return map;
	  }
	  @ResponseBody
	  
	  @RequestMapping(value="/editbarang",method=RequestMethod.PUT) 
	  public Map<String,String> editbarang(@ModelAttribute ("barang") Barang barang, Model model){
		  System.out.println(barang);
		  System.out.println(barang.getNamabarang());
		  //brngsr.save(barangs);
		 
		  Map<String,String> map = new HashMap <>();
		 
		  if (brngsr.simpan(barang)) {
			  map.put("status", "Berhasil");
		}else {
			map.put("status", "Gagal");
		}
		  
		  
		  return map;
	  }
	 
	  @ResponseBody
	  
	  @RequestMapping(value="/deletebarang/{angka}",method=RequestMethod.DELETE) 
	  public Map<String,String> deletebarang(@PathVariable ("angka") Long angka, Model model){
		  System.out.println(angka);
		  brngsr.hapus(angka);
		  //brngsr.save(barangs);
		 
		  Map<String,String> map = new HashMap <>();
		  map.put("status", "Berhasil");
		 
		
		/*
		 * if (brngsr.hapus(angka)) { map.put("status", "Berhasil"); }else {
		 * map.put("status", "Gagal");
		 * 
		 * }
		 */
		
		  
		  return map;
	  }
	  
	  @RequestMapping("/transaction")
		public String transaction() {
		  return ("barang/transaction");
			
	  }
	  @RequestMapping("/listtransaction")
		public String listtransaction(Model mdl) {
			List<Barang> barangs = brngsr.listall();

			mdl.addAttribute("keybarang", barangs);
			return ("barang/listtransaction");
		}
	  
	  @ResponseBody
	  
	  @RequestMapping(value="/savetransaction",method=RequestMethod.POST) 
	  public Map<String,String> savetransaction(@ModelAttribute ("transaction") ModelTransaction transaction, Model model){
		  
		  System.out.println(transaction.getNofaktur());
		  System.out.println(transaction.getTglpenjualan());
		  //brngsr.save(barangs);
		 
		  Map<String,String> map = new HashMap <>();
		 
		/*
		 * if (brngsr.simpan(transaction)) { map.put("status", "Berhasil"); }else {
		 * map.put("status", "Gagal"); }
		 */
		  
		  
		  return map;
	  }
	  @ResponseBody
	  
	  @RequestMapping(value="/submit",method=RequestMethod.POST) 
	  public Map<String,String> submit(@ModelAttribute ("transaction") TransactionViewModel transaction, Model model){
		  
		  System.out.println(transaction.getNofaktur());
		  System.out.println(transaction.getTglpenjualan());
		  System.out.println(transaction.getReturncash());
		  System.out.println(transaction.getNamakasir());
		  
		  //brngsr.save(barangs);
		 
		  Map<String,String> map = new HashMap <>();
		 
		
		 if (trnscsr.submit(transaction)) { map.put("status", "Berhasil"); 
		 }else {
		  map.put("status", "Gagal");
		  }
		 
		  
		  
		  return map;
	  }

	  	
}