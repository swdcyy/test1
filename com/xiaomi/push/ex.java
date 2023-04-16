package com.xiaomi.push.ex;
import java.lang.Enum;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import ws8.x3;
import java.lang.Class;

public final class ex extends Enum	// class@001102
{
    public final String a;
    public static final ex a;
    public static final ex[] a;
    public static final ex b;
    public static final ex c;
    public static final ex d;
    public static final ex e;
    public static final ex f;
    public static final ex g;
    public static final ex h;
    public static final ex i;
    public static final ex j;

    static {
       ex uoex = new ex("COMMAND_REGISTER", 0, "register");
       ex.a = uoex;
       ex uoex1 = new ex("COMMAND_UNREGISTER", 1, "unregister");
       ex.b = uoex1;
       ex uoex2 = new ex("COMMAND_SET_ALIAS", 2, "set-alias");
       ex.c = uoex2;
       ex uoex3 = new ex("COMMAND_UNSET_ALIAS", 3, "unset-alias");
       ex.d = uoex3;
       ex uoex4 = new ex("COMMAND_SET_ACCOUNT", 4, "set-account");
       ex.e = uoex4;
       ex uoex5 = new ex("COMMAND_UNSET_ACCOUNT", 5, "unset-account");
       ex.f = uoex5;
       ex uoex6 = new ex("COMMAND_SUBSCRIBE_TOPIC", 6, "subscribe-topic");
       ex.g = uoex6;
       ex uoex7 = new ex("COMMAND_UNSUBSCRIBE_TOPIC", 7, "unsubscibe-topic");
       ex.h = uoex7;
       ex uoex8 = new ex("COMMAND_SET_ACCEPT_TIME", 8, "accept-time");
       ex.i = uoex8;
       ex uoex9 = new ex("COMMAND_CHK_VDEVID", 9, "check-vdeviceid");
       ex.j = uoex9;
       ex[] uoexArray = new ex[10];
       uoexArray[0] = uoex;
       uoexArray[1] = uoex1;
       uoexArray[2] = uoex2;
       uoexArray[3] = uoex3;
       uoexArray[4] = uoex4;
       uoexArray[5] = uoex5;
       uoexArray[6] = uoex6;
       uoexArray[7] = uoex7;
       uoexArray[8] = uoex8;
       uoexArray[9] = uoex9;
       ex.a = uoexArray;
    }
    public void ex(String p0,int p1,String p2){
       this.a = p2;
    }
    public static int a(String p0){
       int i = -1;
       if (TextUtils.isEmpty(p0)) {
          return i;
       }
       ex[] uoexArray = ex.values();
       int len = uoexArray.length;
       int i1 = 0;
       while (i1 < len) {
          object oobject = uoexArray[i1];
          if ((oobject.a).equals(p0)) {
             i = x3.b(oobject);
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public static ex valueOf(String p0){
       return Enum.valueOf(ex.class, p0);
    }
    public static ex[] values(){
       return ex.a.clone();
    }
}
