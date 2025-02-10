import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

println("DEBUG: Windows test modu aktif! Masaüstü testleri başlıyor....")

// Notepad (veya kendi masaüstü uygulaman) açılıyor
String command = "powershell.exe -ExecutionPolicy Bypass -NoProfile -Command Start-Process notepad"
Process process = Runtime.getRuntime().exec(command)
process.waitFor()

println("DEBUG: Notepad açıldı!")

// 5 saniye bekle
Windows.delay(5)

// Masaüstü testleri tamamlandı
println("DEBUG: Windows testleri tamamlandı!")

// Web testlerine geçmek için TEST_MODE'u değiştir
GlobalVariable.TEST_MODE = 'Web'
println("DEBUG: TEST_MODE artık Web olarak değiştirildi!!!")
