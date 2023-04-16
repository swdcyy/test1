package com.ut.device.UTDevice;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import com.ut.device.AidCallback;
import com.ta.utdid2.device.UTDevice;

public class UTDevice	// class@001019
{

    public void UTDevice(){
       super();
    }
    public static String getAid(String p0,String p1,Context p2){
       return "";
    }
    public static void getAidAsync(String p0,String p1,Context p2,AidCallback p3){
    }
    public static String getUtdid(Context p0){
       return UTDevice.getUtdid(p0);
    }
    public static String getUtdidForUpdate(Context p0){
       return UTDevice.getUtdidForUpdate(p0);
    }
}
