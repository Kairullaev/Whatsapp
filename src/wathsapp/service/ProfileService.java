package wathsapp.service;

import wathsapp.classes.Profile;

import java.util.List;

public interface ProfileService {

    void installWhatsapp(List<Profile> profiles);
    Profile goToProfile(List<Profile> profiles);
    void getaAllWhatsappStatus();

    Profile changeWhatsappStatus(List<Profile>profiles);

    Profile changeProfilePhoto(List<Profile> profiles);


    void addContact(List<Profile>profiles);
    void sendMassage();
    void deleteWhatsapp();

}
