## Özellikler
- Java kullanılarak yazılmıştır.
- Selenium Amazon web otomasyon testi.
- Cucumber ile BDD (Behavior Driven Development) testi.
- TestNG entegrasyonu ile test yönetimi.
- Allure Raporlama desteği.
- Commons Email ile hata alınan sayfaların ekran görüntülerini e-posta ile gönderme.

## Gereksinimler
Projeyi çalıştırabilmek için aşağıdaki araçlara ihtiyacınız var:
- Java 23
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse vb.)

## Maven ve Allure Kurulum Adımları
### 1. Maven Kurulumu
1. Maven indirin.
2. Dosyaları açın ve sistem değişkenlerine MAVEN_HOME ekleyin.
3. PATH değişkenine MAVEN_HOME/bin yolunu ekleyin.
4. Maven'ın doğru kurulduğunu kontrol etmek için terminale şu komutu yazın:
    ```bash
    mvn -version

### 2. Allure Report Kurulumu
1. *Allure Report* indirin.
2. İndirilen dosyanın yolunu sistem değişkenlerinde path'e ekleyin.
3. Kurulumu kontrol etmek için terminale şu komutu yazın:
    ```bash
    allure --version

## Nasıl Çalıştırılır?
1. Projeyi klonlayın:
    ```bash
    git clone https://github.com/eneskaynakk/amazon-test-automation.git
    cd projeadi
    
2. Maven bağımlılıklarını yükleyin:
    ```bash
    mvn clean install
    
3. Testleri çalıştırın:
    ```bash
    mvn test
    
## Raporlama
Test çalıştırmalarından sonra Allure raporlarını görüntülemek için aşağıdaki adımları takip edin:  
1. Maven testleri tamamlandıktan sonra allure-results klasörüne rapor dosyaları oluşturulacaktır.  
2. Raporu görüntülemek için terminale şu komutu yazın:  
    ```bash
    allure serve allure-results

## Config Dosyası
Test çalıştırmadan önce aşağıdaki adımları takip edin:  
1. resources klasörünün altında qa.properties adında dosya oluşturun.
2. Dosyanın içerisine aşağıdaki değişkenlerin değerlerini kendi değerlerinize göre uyarlayın:
   ```bash
   url = https://www.amazon.com.tr/
   cartPageUrl = https://www.amazon.com.tr/gp/cart/view.html?ref_=nav_cart
   browser = chrome

   #Gmail Credentials
   your_email = your_email
   send_email = send_email
   app_passwords = app_passwords
