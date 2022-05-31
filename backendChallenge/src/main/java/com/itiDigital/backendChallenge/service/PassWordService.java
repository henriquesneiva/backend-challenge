package com.itiDigital.backendChallenge.service;

import com.itiDigital.backendChallenge.domain.Password;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PasswordService {

    public Boolean checkPasswordIsValid(Password password) {
        String getPassword = password.getPassword();

        char[] passwordToCharArray = getPassword.toCharArray();
        Map<Character, List<?>> map = new HashMap<Character, List<?>>();

        for (char index : passwordToCharArray) {
            List<Character> characterList;
            if (Objects.isNull(map.get(index))) {
                characterList = new ArrayList<Character>();
            } else {
                characterList = (List<Character>) map.get(index);
            }
            characterList.add(index);
            map.put(index, characterList);
            if (map.get(index).size() > 1) return false;
        }

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{9,50}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(getPassword);
        return matcher.matches();
    }


}
