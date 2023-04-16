package com.facebook.react.common.DebugServerException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import cb.a;

public class DebugServerException extends RuntimeException	// class@001258
{

    public void DebugServerException(String p0){
       super(p0);
    }
    public void DebugServerException(String p0,String p1,int p2,int p3){
       super(p0+"\n  at "+p1+":"+p2+":"+p3);
    }
    public void DebugServerException(String p0,Throwable p1){
       super(p0, p1);
    }
    public static DebugServerException makeGeneric(String p0,String p1,String p2,Throwable p3){
       return new DebugServerException(p1+("\n\nTry the following to fix the issue:\n\x20\x02 Ensure that the packager server is running\n\x20\x02 Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run \'adb devices\' to see a list of connected devices\n\x20\x02 Ensure Airplane Mode is disabled\n\x20\x02 If you\'re on a physical device connected to the same machine, run \'adb reverse tcp:<PORT> tcp:<PORT>\' to forward requests from your device\n\x20\x02 If your device is on the same Wi-Fi network, set \'Debug server host & port for device\' in \'Dev settings\' to your machine\'s IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n\x00").replace("<PORT>", String.valueOf(Uri.parse(p0).getPort()))+p2, p3);
    }
    public static DebugServerException makeGeneric(String p0,String p1,Throwable p2){
       return DebugServerException.makeGeneric(p0, p1, "", p2);
    }
    public static DebugServerException parse(String p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          return null;
       }
       try{
          JSONObject jSONObject = new JSONObject(p1);
          String str = jSONObject.getString("message");
          String[] stringArray = (jSONObject.getString("filename")).split("/");
          int intx = jSONObject.getInt("lineNumber");
          return new DebugServerException(str, stringArray[(stringArray.length - 1)], intx, jSONObject.getInt("column"));
       }catch(org.json.JSONException e6){
          a.y("ReactNative", "Could not parse DebugServerException from: "+p1, e6);
          return v0;
       }
    }
}
