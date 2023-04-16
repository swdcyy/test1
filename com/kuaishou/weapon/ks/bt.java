package com.kuaishou.weapon.ks.bt;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.g;
import java.lang.StringBuilder;
import com.kuaishou.weapon.ks.f;
import com.kuaishou.weapon.ks.m;
import com.kuaishou.weapon.ks.h;
import com.kuaishou.weapon.jni.W;

public class bt	// class@0011f3
{
    public Context b;
    public static String a;

    public void bt(Context p0){
       this.b = p0;
    }
    public static String b(String p0){
       try{
          int i = 2;
          String a = (!TextUtils.isEmpty(bt.a))? bt.a: new String(g.a(("a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=").getBytes(), i));
          if (a == null || a.length() < 16) {
             int i1 = a.length();
             String str = a;
             int i2 = 0;
             int i3 = i1 - 16;
             while (i2 < i3) {
                str = str+"0";
                i2 = i2 + 1;
             }
             a = str;
          }else if(a.length() > 16){
             a = a.substring(0, 16);
          }
          return new String(h.b(m.a(f.b(a.substring(0, 16), a.substring(0, 16), g.a(p0.getBytes(), i)), a.substring(0, 16))));
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public String a(String p0){
       return this.a(p0, new String(g.a(("a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=").getBytes(), 2)));
    }
    public final String a(String p0,String p1){
       int i = 0;
       if (p1 == null || p1.length() < 16) {
          int i1 = p1.length();
          String str = p1;
          int i2 = 0;
          int i3 = i1 - 16;
          while (i2 < i3) {
             str = str+"0";
             i2++;
          }
          i2 = str;
       }else if(p1.length() > 16){
          p1 = p1.substring(i, 16);
       }
       byte[] uobyteArray = g.a(p0.getBytes(), 2);
       W.getInstance(this.b);
       uobyteArray = (W.loadSuccess)? W.getInstance(this.b).dr(W.getInstance(this.b).dc(uobyteArray, (i2.substring(i, 16)).getBytes()), i2.getBytes()): m.a(f.b(i2.substring(i, 16), i2.substring(i, 16), uobyteArray), i2.substring(i, 16));
       return new String(h.b(uobyteArray));
    }
    public final String b(String p0,String p1){
       int i = 0;
       if (p1 == null || p1.length() < 16) {
          int i1 = p1.length();
          String str = p1;
          int i2 = 0;
          int i3 = i1 - 16;
          while (i2 < i3) {
             str = str+"0";
             i2++;
          }
          i2 = str;
       }else if(p1.length() > 16){
          p1 = p1.substring(i, 16);
       }
       byte[] uobyteArray = h.a(p0.getBytes());
       W.getInstance(this.b);
       uobyteArray = (W.loadSuccess)? W.getInstance(this.b).ac(W.getInstance(this.b).ar(uobyteArray, i2.getBytes()), (i2.substring(i, 16)).getBytes()): f.a(i2.substring(i, 16), i2.substring(i, 16), m.b(uobyteArray, i2));
    label_0076 :
       if (uobyteArray == null || uobyteArray.length < 1) {
          return null;
       }else {
          return g.b(uobyteArray, 2);
       }
    }
    public String c(String p0){
       return this.b(p0, new String(g.a(("a3NyaXNrY3RsYnVzaW5zc3Z4cHprd3NwYWlvcXBrc3M=").getBytes(), 2)));
    }
}
