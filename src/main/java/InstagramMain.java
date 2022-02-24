import helpers.IdGenerator;

public class InstagramMain {
    public static void main(String[] args) throws Exception {
        InstagramAccount aza = new InstagramAccount("aza2001", "Azamat2001!", "1");
        Instagram.setUserToDataBase(aza);
        InstagramAccount azi = new InstagramAccount("azi2001", "Azi2001!","2");
        InstagramAccount aziret = new InstagramAccount("aziret2001", "Aziret2001!","3");
        InstagramAccount adik = new InstagramAccount("adik2020", "Adik2020!","4");
        Instagram.setUserToDataBase(azi);
        Instagram.setUserToDataBase(aziret);
        Instagram.setUserToDataBase(adik);
//        Instagram.subscribe(aza,azi);
//        Instagram.subscribe(aza,aziret);
        Instagram.subscribe(aza, adik);
        System.out.println(aza.getSubscribers());
        System.out.println(Instagram.dataBase);
        System.out.println(aza.getUserId()+" id");
        System.out.println(azi.getUserId()+" id");
        System.out.println(adik.getUserId()+ " id");

        Instagram.unsubscribe(aza, adik.getUserId());


        System.out.println(aza.getSubscribers());

    }
}
