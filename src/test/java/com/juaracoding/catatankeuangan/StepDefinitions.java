package com.juaracoding.catatankeuangan;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class StepDefinitions extends BaseTestClass {

	@Test(priority = 1, description = "User menambahkan Pengeluaran")
	public void testAddPengeluaran() {
		logger = reports.startTest("Aplikasi Catatan Keuangan Tambah Pengeluaran");
		catatanPage.addNewPengeluaran("100000", "Bayar Makanan");
		tunggu(1);
		assertEquals(catatanPage.getPengeluaranName(), "Makanan");	
	}
	
	@Test(priority = 2, description = "User menambah pemasukkan")
	public void testAddPemasukkan() {
		logger = reports.startTest("Aplikasi Catatan Keuangan Tambah Pemasukkan");
		catatanPage.addNewPemasukkan("200000", "Jual Makanan");
		tunggu(1);
		assertEquals(catatanPage.getPengeluaranName(), "Makanan");
	}
	
	
}
