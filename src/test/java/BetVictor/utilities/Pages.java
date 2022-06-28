package BetVictor.utilities;

import BetVictor.pages.*;

public class Pages {
    Login login;
    GenericFunctions genericFunctions;
    SmartClient smartClient;


    public GenericFunctions genericFunctions() {
        if (genericFunctions == null) {
            genericFunctions = new GenericFunctions();
        }
        return genericFunctions;
    }
    public Login login() {
        if (login == null) {
            login = new Login();
        }
        return login;
    }
    public SmartClient smartClient() {
        if (smartClient == null) {
            smartClient = new SmartClient();
        }
        return smartClient;

    }
}
