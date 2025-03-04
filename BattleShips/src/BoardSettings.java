public class BoardSettings {
    public static String[] placeId = new String[100];
    public static String[] changePossiblilityId = new String[100];
    public static boolean[] checking = new boolean[100];

    public BoardSettings(String[] placeId, String[] changePossiblilityId, boolean[] checking) {
        BoardSettings.placeId = placeId;
        BoardSettings.changePossiblilityId = changePossiblilityId;
        BoardSettings.checking = checking;

    }

    public static void  giveAnChecking(){
        for(int i = 0; i < 100; i++){
            checking[i] = false;

            if(i == 0||i == 1|| i == 2|| i == 3|| i == 4|| i == 5|| i == 6|| i == 7|| i == 8|| i == 9|| i == 10|| i == 20|| i == 30|| i == 40|| i == 50|| i == 60|| i == 70|| i == 80|| i == 90){
                ;
            }
            else{
                checking[i] = true;
            }
        }
    }


    public static void giveAnValue(){
        for(int i = 0; i < 100; i++){
            placeId[i] = " ";
        }
        for(int i = 1; i<10;i++){
            placeId[i] = String.valueOf(i);
        }
        placeId[10] = "1";
        placeId[20] = "2";
        placeId[30] = "3";
        placeId[40] = "4";
        placeId[50] = "5";
        placeId[60] = "6";
        placeId[70] = "7";
        placeId[80] = "8";
        placeId[90] = "9";
        placeId[0] ="#";
    }

    public static void giveAnId(){
        for(int i = 0; i < 100; i++){
            if(i == 0||i == 1|| i == 2|| i == 3|| i == 4|| i == 5|| i == 6|| i == 7|| i == 8|| i == 9|| i == 10|| i == 20|| i == 30|| i == 40|| i == 50|| i == 60|| i == 70|| i == 80|| i == 90){
                ;
            }
            else{
                changePossiblilityId[i] = String.valueOf(i);
            }
        }
    }
}
