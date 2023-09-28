package Data;

public class SocialMedia {
    String name;
}

//Final class digunakan ketika class tersebut tidak ingin diwarikan kepada class manapun
final class Facebook extends SocialMedia {

}

//Error
// class FakeFacebook extends Facebook {

// }

//Ketika sebuh method di inisialisasi sebagai final maka method tersebut tidak akan bisa
//di override oleh method child nya
class Twitter extends SocialMedia {
    final void login(String username, String password){

    }
}


class Xmedia extends Twitter {
    //ERROR
    // void login(String usrename, String Password){

    // }
}