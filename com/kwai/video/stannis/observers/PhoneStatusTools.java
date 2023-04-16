package com.kwai.video.stannis.observers.PhoneStatusTools;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.stannis.utils.Log;
import android.telephony.TelephonyManager;
import java.lang.Integer;
import com.kwai.video.stannis.observers.ReflecterHelper;
import java.lang.Throwable;
import java.lang.StringBuilder;
import android.media.AudioManager;
import android.telephony.PhoneStateListener;

public class PhoneStatusTools	// class@000c62
{

    public void PhoneStatusTools(){
       super();
    }
    public static boolean isCalling(Context p0){
       Class tYPE;
       String[] stringArray;
       TelephonyManager systemServic1;
       Object[] objArray1;
       String str = "getCallState";
       Object[] obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, PhoneStatusTools.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          Log.i("PhoneStatusTools", "context is null");
          return b;
       }else {
          try{
             TelephonyManager systemServic = p0.getSystemService("phone");
             if (systemServic != null) {
                if (!systemServic.getCallState()) {
                   try{
                      Class[] uClassArray = new Class[]{tYPE};
                      tYPE = Integer.TYPE;
                      Object[] objArray = new Object[]{Integer.valueOf(b)};
                      if (!ReflecterHelper.invokeMethod(systemServic, "getCallStateGemini", uClassArray, objArray).intValue()) {
                         uClassArray = new Class[]{tYPE};
                         Object[] objArray2 = new Object[]{Integer.valueOf(1)};
                         if (!ReflecterHelper.invokeMethod(systemServic, "getCallStateGemini", uClassArray, objArray2).intValue()) {
                         }
                      }
                   }catch(java.lang.Exception e4){
                      Log.i("PhoneStatusTools", "1 isCalling Exception", e4);
                   }
                }
             }
             b = true;
          }catch(java.lang.Exception e11){
             Log.i("PhoneStatusTools", "3 isCalling Exception", e11);
          }
       label_00f6 :
          Log.i("PhoneStatusTools", "isCalling: "+b);
          return b;
       }
    }
    public static boolean isRingEqualsZero(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhoneStatusTools.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       AudioManager systemServic = p0.getSystemService("audio");
       boolean b = (systemServic != null && !systemServic.getStreamVolume(2))? true: false;
       return b;
    }
    public static boolean isRingerNormal(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhoneStatusTools.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       AudioManager systemServic = p0.getSystemService("audio");
       boolean b = (systemServic != null && systemServic.getRingerMode() == 2)? true: false;
       return b;
    }
    public static boolean isRingerSilent(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhoneStatusTools.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       AudioManager systemServic = p0.getSystemService("audio");
       boolean b = (systemServic != null && !systemServic.getRingerMode())? true: false;
       return b;
    }
    public static boolean isRingerVibrate(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhoneStatusTools.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       AudioManager systemServic = p0.getSystemService("audio");
       boolean b = true;
       if (systemServic == null || systemServic.getRingerMode() != b) {
          b = false;
       }
       return b;
    }
    public static void listen(Context p0,PhoneStateListener p1,int p2){
       Class tYPE;
       Object[] objArray2;
       String[] stringArray;
       TelephonyManager systemServic1;
       Object[] objArray3;
       Class[] uClassArray1;
       Object[] objArray4;
       if (PatchProxy.isSupport(PhoneStatusTools.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, PhoneStatusTools.class, "5")) {
          return;
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       String str = "listenGemini";
       int i = 3;
       if (systemServic != null) {
          try{
             Class[] uClassArray = new Class[]{PhoneStateListener.class,tYPE};
             tYPE = Integer.TYPE;
             Object[] objArray = new Object[]{p1,Integer.valueOf(p2)};
             ReflecterHelper.invokeMethod(systemServic, "listen", uClassArray, objArray);
             uClassArray = new Class[i];
             uClassArray[0] = tYPE;
             uClassArray[1] = PhoneStateListener.class;
             uClassArray[2] = tYPE;
             objArray = new Object[i];
             objArray[0] = Integer.valueOf(0);
             objArray[1] = p1;
             objArray[2] = Integer.valueOf(p2);
             ReflecterHelper.invokeMethod(systemServic, str, uClassArray, objArray);
             uClassArray = new Class[i];
             uClassArray[0] = tYPE;
             uClassArray[1] = PhoneStateListener.class;
             uClassArray[2] = tYPE;
             Object[] objArray1 = new Object[i];
             objArray1[0] = Integer.valueOf(1);
             objArray1[1] = p1;
             objArray1[2] = Integer.valueOf(p2);
             ReflecterHelper.invokeMethod(systemServic, str, uClassArray, objArray1);
          }catch(java.lang.Exception e0){
             Log.i("PhoneStatusTools", "1 listen Exception", e0);
          }
       }
    }
}
