package com.itiDigital.backendChallenge.service;

import com.itiDigital.backendChallenge.domain.Password;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PasswordService {

    public Boolean checkPassword(Password password) {
        String pswd = password.getPassword();

        char[] pswToCharArray = pswd.toCharArray();
        Map<Character, List<?>> map = new HashMap<Character, List<?>>();

        for (int i = 0; i < pswToCharArray.length; i++) {
            if (map.get(pswToCharArray[i]) == null) {
                List<Character> characterList = new ArrayList<Character>();
                characterList.add(pswToCharArray[i]);
                map.put(pswToCharArray[i], characterList);
            } else {
                List<Character> characters = (List<Character>) map.get(pswToCharArray[i]);
                characters.add(pswToCharArray[i]);
                map.put(pswToCharArray[i], characters);
            }

            if (map.get(pswToCharArray[i]).size() > 1) return false;
        }

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{9,50}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pswd);
        return matcher.matches();
    }


}
