package com.kwai.video.wayne.player.util.LocalDebugConfigPreference;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import java.lang.Float;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Long;
import android.content.Context;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class LocalDebugConfigPreference	// class@000dbe
{
    public static SharedPreferences sPreference;

    public void LocalDebugConfigPreference(){
       super();
    }
    public static boolean getBoolean(String p0,boolean p1){
       LocalDebugConfigPreference localDebugCo = LocalDebugConfigPreference.class;
       if (PatchProxy.isSupport(localDebugCo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, localDebugCo, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return LocalDebugConfigPreference.sPreference.getBoolean(p0, p1);
    }
    public static float getFloat(String p0,float p1){
       LocalDebugConfigPreference localDebugCo = LocalDebugConfigPreference.class;
       if (PatchProxy.isSupport(localDebugCo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, localDebugCo, "5");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return LocalDebugConfigPreference.sPreference.getFloat(p0, p1);
    }
    public static int getInt(String p0,int p1){
       LocalDebugConfigPreference localDebugCo = LocalDebugConfigPreference.class;
       if (PatchProxy.isSupport(localDebugCo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, localDebugCo, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return LocalDebugConfigPreference.sPreference.getInt(p0, p1);
    }
    public static long getLong(String p0,long p1){
       LocalDebugConfigPreference localDebugCo = LocalDebugConfigPreference.class;
       if (PatchProxy.isSupport(localDebugCo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, localDebugCo, "4");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return LocalDebugConfigPreference.sPreference.getLong(p0, p1);
    }
    public static String getString(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LocalDebugConfigPreference.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalDebugConfigPreference.sPreference.getString(p0, p1);
    }
    public static void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LocalDebugConfigPreference.class, "1")) {
          return;
       }
       LocalDebugConfigPreference.sPreference = o.c(p0, "KpMidLocalDebugTestConfig", 4);
       return;
    }
    public static void putBoolean(String p0,boolean p1){
       LocalDebugConfigPreference localDebugCo = LocalDebugConfigPreference.class;
       if (PatchProxy.isSupport(localDebugCo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, localDebugCo, "7")) {
          return;
       }
       g.a(LocalDebugConfigPreference.sPreference.edit().putBoolean(p0, p1));
       return;
    }
    public static void putFloat(String p0,float p1){
       LocalDebugConfigPreference localDebugCo = LocalDebugConfigPreference.class;
       if (PatchProxy.isSupport(localDebugCo) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, localDebugCo, "10")) {
          return;
       }
       g.a(LocalDebugConfigPreference.sPreference.edit().putFloat(p0, p1));
       return;
    }
    public static void putInt(String p0,int p1){
       LocalDebugConfigPreference localDebugCo = LocalDebugConfigPreference.class;
       if (PatchProxy.isSupport(localDebugCo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, localDebugCo, "8")) {
          return;
       }
       g.a(LocalDebugConfigPreference.sPreference.edit().putInt(p0, p1));
       return;
    }
    public static void putLong(String p0,long p1){
       LocalDebugConfigPreference localDebugCo = LocalDebugConfigPreference.class;
       if (PatchProxy.isSupport(localDebugCo) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, localDebugCo, "9")) {
          return;
       }
       g.a(LocalDebugConfigPreference.sPreference.edit().putLong(p0, p1));
       return;
    }
    public static void putString(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LocalDebugConfigPreference.class, "11")) {
          return;
       }
       g.a(LocalDebugConfigPreference.sPreference.edit().putString(p0, p1));
       return;
    }
}
