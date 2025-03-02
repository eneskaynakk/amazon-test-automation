# Java Selenium Cucumber Projesi

Bu proje, Java, **Selenium ve **Cucumber kullanarak test otomasyon senaryolarını yürütmek amacıyla geliştirilmiştir. Proje, Maven yapılandırması ile yönetilmekte ve Allure raporlama desteği sunmaktadır.

## Özellikler
- Java 23 kullanılarak yazılmıştır.
- Selenium 4.27.0 ile web otomasyon testi.
- Cucumber 7.20.1 ile BDD (Behavior Driven Development) testi.
- TestNG entegrasyonu ile test yönetimi.
- Allure Raporlama desteği.
- Commons Email ile hata alınan sayfaların ekran görüntülerini e-posta ile gönderme.

## Gereksinimler
Projeyi çalıştırabilmek için aşağıdaki araçlara ihtiyacınız var:
- Java 23 veya daha yeni bir sürüm
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
    

### 2. Allure Commandline Kurulumu
1. *Allure Report* indirin.
2. İndirilen dosyanın yolunu sistem değişkenlerinde path'e ekleyin.
3. Kurulumu kontrol etmek için terminale şu komutu yazın:
    ```bash
    allure --version

## Maven Bağımlılıkları
Projenin bağımlılıkları pom.xml dosyasında tanımlanmıştır:
- selenium-java: 4.27.0
- cucumber-java: 7.20.1
- cucumber-testng: 7.20.1
- testng: 7.10.2
- commons-email: 1.6.0
- allure-cucumber7-jvm: 2.29.1

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
