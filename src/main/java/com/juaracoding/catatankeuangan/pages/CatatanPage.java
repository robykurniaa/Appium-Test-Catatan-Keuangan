package com.juaracoding.catatankeuangan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class CatatanPage {

AndroidDriver<MobileElement> driver;
	
	public CatatanPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By btnAllow = By.id("com.android.packageinstaller:id/permission_allow_button");
	By btnTutup = By.id("android:id/button2");
//	By btnAdd = By.id("com.chad.financialrecord:id/fabMenu ");
	By btnAdd = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageButton");
	By addDate = By.id("com.chad.financialrecord:id/tvDate");
	By inputKategori = By.id("com.chad.financialrecord:id/spCategory");
	By selectKategori = By.xpath("android.widget.TextView[contains(@text,'Mobil')]");
	By inputJumlah = By.id("com.chad.financialrecord:id/etAmount");
	By inputKeterangan = By.id("com.chad.financialrecord:id/etNote");
	By btnSimpan = By.id("com.chad.financialrecord:id/btSave");
	By txtPengeluaran = By.id("com.chad.financialrecord:id/tvName");
	By btnIncome = By.id("com.chad.financialrecord:id/btnIncome");
	By kliktgl = By.xpath("//android.view.View[@content-desc=\"07 April 2022\"]");
	By Okdate = By.id("android:id/button1");
	
	public void addNewPengeluaran(String jumlah, String keterangan) {
		tunggu(2);
		driver.findElement(btnAllow).click();
		tunggu(2);
		driver.findElement(btnTutup).click();
		tunggu(2);
		driver.findElement(btnAdd).click();
		tunggu(2);
		driver.findElement(addDate).click();
		tunggu(2);
		driver.findElementByAccessibilityId("07 April 2022").click();
//		driver.findElement(kliktgl);
		driver.findElement(Okdate).click();
		tunggu(2);
		driver.findElement(inputJumlah).sendKeys(jumlah);
		tunggu(2);
		driver.findElement(inputKeterangan).sendKeys(keterangan);
		tunggu(2);
		driver.findElement(btnSimpan).click();
		}
	
	public String getPengeluaranName() {
		return driver.findElement(txtPengeluaran).getText();
	}
	
	public void addNewPemasukkan(String jumlah, String keterangan) {
		tunggu(2);
		driver.findElement(btnAdd).click();
		tunggu(2);
		driver.findElement(btnIncome);
		tunggu(2);
		driver.findElement(addDate).click();
		tunggu(2);
		driver.findElementByAccessibilityId("07 April 2022").click();
		tunggu(2);
		driver.findElement(Okdate).click();
		tunggu(2);
		driver.findElement(inputJumlah).sendKeys(jumlah);
		tunggu(2);
		driver.findElement(inputKeterangan).sendKeys(keterangan);
		tunggu(2);
		driver.findElement(btnSimpan).click();
	}
	
	
	public void tunggu(int detik) {
		try {
			Thread.sleep(detik*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
