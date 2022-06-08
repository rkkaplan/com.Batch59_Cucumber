package pages;

public class junitNotlar {
    /*
    JUnit annotations: @Test @BeforeClass @AfterClass @Before  @After @Ignore
    CheckBox : Checkbox kullanıcıya seçenekler sunarak bunlardan birini, birkaçını
                ya da tamamını seçebilmesi istenen durumlar için kullanılır.
    RadioButton: 2 yada daha fazla seçenek içinde bir seçim yapmayı sağlayan kontroldür. Örn: Cinsiyet sorulduğunda 2
                seçenekten birinin seçilmesi gerekir
    En cok kullandigimiz 3 Assert metodu;   1 ) Assert.assertTrue(koşul)
                                            2) Assert.assertFalse(koşul)
                                            3) Assert.assertEqual(expected , actual)
    DROPDOWN menu (DDM) denilince aklimiza SELECT gelmeli. DDM2yi handle edebilmemiz icin
        1- ddm'yi locate etmeliyiz
        2- Select class'indan select objesi olusturmaliyi: Select select =new Select(ddm); PARAMETRE girilmeli!!!
        3- obje uzerinden 3 sekilde isteidgimiz secenegi secebiliriz selectByIndex();selectByValue();selectByVisibleText();

    ALERTS:
    1-)  inspect yapilamayan, ekstra isleme ihtiyac duyan alert turu: ..... (Java Script ALERT)
    2-)  kullanıcıdan bazı girdilerin girilmesini isteyen ve selenium webdriver metni sendkeys ("input….") kullanarak girebilen alert turu:..... (Prpmpt Alert)
    3-) işlem yapma izni isteyen,  Alert onaylaniyorsa OK, onaylanmiyorsa Cancel butonuna basilan Alert turu:......(Confirmation Alert)
    4-) Ok denilerek kapatilabilen JS Alert turu: ........  (Simple Alert)
     Handle alert methods:
     ---   driver.switchTo().alert().accept();
     ---   driver.switchTo().alert().dismiss();
     ---   driver.switchTo().alert().getText();
     ---   driver.switchTo().alert().sendKeys();

     */
}
