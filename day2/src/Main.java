public class Main {
    public static void main(String[] args) {


        String mesaj = "Merhaba";

        //constructor ile bir ürün oluştur
        Product product1 = new Product(1,"Kahve makinesi",3000,3,"fotograf.jpg",1);

        //constructor olmadan bir ürün oluştur
        Product product2 = new Product();
        //set etmek (ayarlamak, değer atamak)
        product2.setName("Çamaşır makinesi");
        product2.setDiscount(3);
        product2.setId(2);
        product2.setPrice(10000);
        product2.setImageUrl("camasir.jpg");
        product2.setUnitsInStock(10);

        //constructor olmadan bir ürün oluştur
        Product product3 = new Product();
        //set etmek (ayarlamak, değer atamak)
        product3.setName("Çay makinesi");
        product3.setDiscount(5);
        product3.setId(3);
        product3.setPrice(200);
        product3.setImageUrl("cay.jpg");
        product3.setUnitsInStock(10);

        Product[] products = {product1, product2, product3};

        //get etmek (almak, değer okumak)
        for (Product product:products) {
            System.out.println(product.getName() + " Fiyatı: "+ product.getPrice());
        }



        //constructor olmadan bireysel kullanıcı oluştur
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("55");
        individualCustomer.setFirstName("Yusuf");
        individualCustomer.setLastName("Açmacı");
        individualCustomer.setCustomerNumber("5555555");
        individualCustomer.setNationalityNumber("111111111");

        //constructor olmadan kurumsal kullanıcı oluştur
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("56");
        corporateCustomer.setCompanyName("YTU");
        corporateCustomer.setTaxNumber("1911");

        System.out.println(individualCustomer.getFirstName());
        System.out.println(corporateCustomer.getCompanyName());

        //polymorphism: iki farklı sınıfı (IndividualCustomer, CorporateCustomer) Customer sınıfı altında aynı arrayde tutabiliyoruz.
        //Customer nesnesi hem IndividualCustomer hem de CorporateCustomer nesnelerinin referanslarını tutabiliyor.
        Customer[] customers = {individualCustomer, corporateCustomer};




    }
}