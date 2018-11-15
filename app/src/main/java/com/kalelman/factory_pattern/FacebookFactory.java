package com.kalelman.factory_pattern;

public class FacebookFactory {

    public Facebook getFacebookProfiles(String facebookProfileType) {
        if (facebookProfileType == null) {
            return null;
        }
        if (facebookProfileType == "Erick") {
            return new Erick();
        } else if (facebookProfileType == "Mimotes") {
            return new Noemi();
        } else if (facebookProfileType == "Monch") {
            return  new Montsecita();
        }

        return null;
    }
}
