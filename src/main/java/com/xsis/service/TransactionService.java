package com.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.model.DetailTransaction;
import com.xsis.model.ModelTransaction;
import com.xsis.repository.TransactionRepo;
import com.xsis.viewmodel.TransactionViewModel;

@Service
@Transactional
public class TransactionService {
	@Autowired
	private TransactionRepo transaksi;
	ModelTransaction transaction=new ModelTransaction();
	DetailTransaction transactions=new DetailTransaction();
	
	public List<ModelTransaction> listall(){
		return transaksi.findAll();
	}
	
public boolean submit (TransactionViewModel detailtransaction) {
		
		try {
			transaction.setId(detailtransaction.getId());
			transaction.setNamakasir(detailtransaction.getNamakasir());
			transaction.setNofaktur(detailtransaction.getNofaktur());
			transaction.setTotal(detailtransaction.getTotal());
			transaction.setTglpenjualan(detailtransaction.getTglpenjualan());
			transaction.setReturncash(detailtransaction.getReturncash());
			transaksi.save(transaction);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}


}


