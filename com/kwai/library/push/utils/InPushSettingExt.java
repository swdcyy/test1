package com.kwai.library.push.utils.InPushSettingExt;
import com.kwai.library.push.utils.InPushSettingExt$bizCallbackMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.Context;
import my6.g;
import oy6.a;
import android.app.Activity;
import java.lang.String;
import my6.f;
import java.util.Map;

public final class InPushSettingExt	// class@0008d9
{
    public static a a;
    public static e b;
    public static final p c;
    public static final InPushSettingExt d;

    static {
       InPushSettingExt.d = new InPushSettingExt();
       InPushSettingExt.c = s.c(InPushSettingExt$bizCallbackMap$2.INSTANCE);
    }
    public void InPushSettingExt(){
       super();
    }
    public static final Context a(){
       Context uContext;
       a a = InPushSettingExt.a;
       if (a != null) {
          g og = a.b();
          if (og != null) {
             uContext = og.a();
          label_0010 :
             return uContext;
          }
       }
       uContext = null;
       goto label_0010 ;
    }
    public static final Activity c(){
       Activity uActivity;
       a a = InPushSettingExt.a;
       if (a != null) {
          g og = a.b();
          if (og != null) {
             uActivity = og.c();
          label_0010 :
             return uActivity;
          }
       }
       uActivity = null;
       goto label_0010 ;
    }
    public static final a d(){
       return InPushSettingExt.a;
    }
    public static final String e(){
       String str;
       a a = InPushSettingExt.a;
       if (a != null) {
          g og = a.b();
          if (og != null) {
             str = og.b();
             if (str != null) {
             label_0013 :
                return str;
             }
          }
       }
       str = "";
       goto label_0013 ;
    }
    public static final String f(){
       String currentUserI;
       a a = InPushSettingExt.a;
       if (a != null) {
          a = a.c;
          if (a != null) {
             currentUserI = a.getCurrentUserId();
             if (currentUserI != null) {
             label_0011 :
                return currentUserI;
             }
          }
       }
       currentUserI = "0";
       goto label_0011 ;
    }
    public static final boolean g(){
       boolean b;
       a a = InPushSettingExt.a;
       if (a != null) {
          g og = a.b();
          if (og != null) {
             b = og.isAppOnForeground();
          label_0010 :
             return b;
          }
       }
       b = false;
       goto label_0010 ;
    }
    public final Map b(){
       return InPushSettingExt.c.getValue();
    }
}
