package com.kuaishou.weapon.jni.W;
import java.lang.Object;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.String;
import com.kuaishou.weapon.ks.bu;
import java.util.HashMap;
import com.kuaishou.weapon.ks.br;
import com.kuaishou.weapon.ks.d;
import java.util.Map;
import com.kuaishou.weapon.ks.bs;
import java.lang.System;
import java.lang.Throwable;

public class W	// class@0011ba
{
    public static String c;
    public static W instance;
    public static int loadSoCount;
    public static boolean loadSuccess;
    public static String soVersion;

    public void W(){
       super();
    }
    public static W getInstance(Context p0){
       String str1;
       if (!TextUtils.isEmpty(W.soVersion) && (!W.loadSuccess && W.instance == null)) {
          _monitor_enter(W.class);
          if (W.instance == null) {
             W.instance = new W();
          }
          boolean b = true;
          boolean b1 = false;
          if (!bu.a(p0, "w"+(W.soVersion).replace(".", "")+".so")) {
             HashMap hashMap = new HashMap();
             hashMap.put("l", "so not found");
             hashMap.put("v", W.soVersion);
             hashMap.put("m", br.a(p0));
             hashMap.put("p", d.a(p0).b("plc001_k_v_w", "", b));
             String str = "n";
             str1 = (d.a(p0).f("a1_p_s_p_s"))? "0": "1";
             hashMap.put(str, str1);
             bs.a(p0, "1002001", hashMap);
             W.loadSuccess = b1;
             _monitor_exit(W.class);
             return W.instance;
          }else {
             d uod = d.a(p0);
             str1 = uod.a("plc001_lss_v_s", "");
             if (TextUtils.isEmpty(str1)) {
                str1 = W.soVersion;
                uod.a("plc001_lss_v_s", str1, b1);
             }
             W.loadSoCount = uod.b("plc001_lss_t_s");
             if (!TextUtils.equals(str1, W.soVersion)) {
                W.loadSoCount = b1;
                uod.a("plc001_lss_v_s", W.soVersion, b1);
             }
             if ((W.loadSoCount + b) < 10) {
                W.loadSuccess = b1;
                W.loadSoCount = W.loadSoCount + b;
                uod.a("plc001_lss_t_s", W.loadSoCount, b1);
                System.loadLibrary("w"+(W.soVersion).replace(".", ""));
                W.loadSoCount = b1;
                W.loadSuccess = b;
             }
             uod.a("plc001_lss_t_s", W.loadSoCount, b);
             _monitor_exit(W.class);
          }
       }
    label_015e :
       return W.instance;
    }
    public native byte[] ac(byte[] p0,byte[] p1);
    public native byte[] ar(byte[] p0,byte[] p1);
    public native byte[] dc(byte[] p0,byte[] p1);
    public native byte[] dr(byte[] p0,byte[] p1);
}
