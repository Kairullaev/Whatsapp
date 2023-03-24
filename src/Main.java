import wathsapp.classes.Profile;
import wathsapp.service.impl.ProfileServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProfileServiceImpl profileService = new ProfileServiceImpl();
        List<Profile> profiles = new ArrayList<>();
        while (true) {
            System.out.println("""
                    1-> Install Whatsapp
                    2-> Go to Profie
                    3-> Get all whatsapp status
                    4-> Change profile photo
                    5-> Change whatsapp status
                    6-> Add contact
                    7-> Send message
                    8-> Delete whatsapp""");


            Scanner sc = new Scanner(System.in);

                switch (sc.nextInt()){
                    case 1 -> profileService.installWhatsapp(profiles);
                    case 2 -> System.out.println(profileService.goToProfile(profiles));
                    case 3 -> profileService.getaAllWhatsappStatus();
                    case 4 -> System.out.println(profileService.changeProfilePhoto(profiles));
                    case 5 -> profileService.changeWhatsappStatus(profiles);

                }
        }
    }
}