package wathsapp.service.impl;

import wathsapp.classes.Profile;
import wathsapp.classes.Status;
import wathsapp.myExp.MyExp;
import wathsapp.service.ProfileService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ProfileServiceImpl implements ProfileService {
    private static Long counter;

    public void installWhatsapp(List<Profile> profiles) {
        try {

            System.out.print("Enter your number : ");
            int number = new Scanner(System.in).nextInt();
            for (Profile pr : profiles) {
                if (pr.getNumber() == number) {
                    throw new MyExp("mynday nomer bar ");
                }


            }
            System.out.print("Enter your name : ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Enter your password : ");
            String password = new Scanner(System.in).nextLine();
            if (counter == null) {
                counter = 1L;
            }
            Profile profile = new Profile(counter++, name, number, password, " default   ", new ArrayList<>(), Status.AT_WORK);
            profiles.add(profile);
            System.out.println(profile);

        } catch (MyExp e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public Profile goToProfile(List<Profile> profiles) {
        //  Profile p = new Profile();
        System.out.print("Enter your name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter your password : ");
        String password = new Scanner(System.in).nextLine();
        for (Profile prof : profiles) {
            if (prof.getName().equalsIgnoreCase(name)) {
                if (prof.getPassword().equalsIgnoreCase(password)) {
                    return prof;
                }
            }
        }
        System.out.println("Mynday polzavatel jok");
        return null;
    }


    @Override
    public void getaAllWhatsappStatus() {
        List<Status> statusList = new ArrayList<>(Arrays.asList(Status.HELLO_I_USE_WHATSAPP, Status.AT_WORK, Status.BUSY, Status.TO_THE_CINEMA));
        System.out.println(" *** All whatsapp status ***");
        for (Status s : statusList) {
            System.out.println(s + " ");
            System.out.println("--------------------");

        }


    }

    @Override
    public Profile changeWhatsappStatus(List<Profile> profiles) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Statustu almashtyravyz :");
            System.out.print("Your profil name : ");
            String name = sc.nextLine();
            System.out.print("Enter your password : ");
            String password = sc.nextLine();
            for (Profile p : profiles) {
                if (p.getName().equalsIgnoreCase(name) && p.getPassword().equalsIgnoreCase(password)) {
                    System.out.println(p);
                    System.out.println("   *** status almahtyrynyz *** ");
                    System.out.println("1 :  AT_WORK \n" +
                            "2 :  HELLO_I_USE_WHATSAPP \n" +
                            "3 :  TO_THE_CINEMA \n" +
                            "4 :  BUSY ");

                    String status = new Scanner(System.in).nextLine();
                    p.setStatus(Status.valueOf(status));
                    System.out.println(p);
//                    int num = new Scanner(System.in).nextInt();
//                    switch (num) {
//                        case 1:
//                            System.out.println(Status.AT_WORK);
//                            break;
//                        case 2:
//                            System.out.println(Status.HELLO_I_USE_WHATSAPP);
//                            break;
//                        case 3:
//                            System.out.println(Status.TO_THE_CINEMA);
//                        case 4:
//                            System.out.println(Status.BUSY);
//                            break;
//
//                    }
                } else {
                    throw new MyExp("mynday profil jok");
                }
            }

        } catch (MyExp e) {
            System.out.println(e.getMessage());
        }


        return null;
    }


    @Override
    public Profile changeProfilePhoto(List<Profile> profiles) {
        Profile profile = new Profile();
        try {
            System.out.println(" image ");
            System.out.print("Enter name : ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Enter password : ");
            String password = new Scanner(System.in).nextLine();
            for (Profile pr : profiles) {
                if (pr.getName().equalsIgnoreCase(name)) {
                    if (pr.getPassword().equalsIgnoreCase(password)) {
                        System.out.println(pr);
                        System.out.print("Izmenit image :");
                        String image = new Scanner(System.in).nextLine();
                        pr.setImege(image);
                        System.out.println(pr);

                    }
                } else {
                    throw new MyExp("not this profile :");
                }


            }

        } catch (MyExp e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public void addContact(List<Profile> profiles) {

    }

    @Override
    public void sendMassage() {

    }

    @Override
    public void deleteWhatsapp() {

    }


}
