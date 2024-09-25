package Session;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class session {

    private static int userId;
    private static String name;

    public static void setuserId(int id) {
        userId = id;
    }

    public static int getuserId() {
        return userId;
    }


    public static void setUsername(String username) {
        name = username;
    }

    public static String getName() {
        return name;
    }

    public static void logout() {
        userId = 0;
        name = null;
    }
}
