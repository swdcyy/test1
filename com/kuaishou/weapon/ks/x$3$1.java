package com.kuaishou.weapon.ks.x$3$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.x$3;
import java.lang.String;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.x;

public class x$3$1 implements Runnable	// class@001232
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final x$3 f;

    public void x$3$1(x$3 p0,String p1,String p2,String p3,String p4,String p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void run(){
       String str3;
       x$3$1 td;
       JSONObject jSONObject = new JSONObject();
       int i = Integer.parseInt(this.a);
       String str = "t";
       if (i != 2) {
          String str1 = "v";
          String str2 = "u";
          if (i != 3) {
             if (i != 4) {
                if (i != 9) {
                   if (i != 11) {
                      switch (i){
                          case 18:
                            if (!TextUtils.isEmpty(this.b)) {
                               jSONObject.put("u1", this.b);
                            }
                            if (!TextUtils.isEmpty(this.c)) {
                               str3 = "u2";
                            label_0040 :
                               jSONObject.put(str3, this.c);
                            }
                            break;
                          case 19:
                            if (!TextUtils.isEmpty(this.b)) {
                               jSONObject.put("d1", this.b);
                            }
                            if (!TextUtils.isEmpty(this.c)) {
                               str3 = "d2";
                               goto label_0040 ;
                            }
                            break;
                          case 20:
                            break;
                          default:
                      }
                   }
                }else if(!TextUtils.isEmpty(this.b)){
                   jSONObject.put(str2, this.b);
                }
             }
             if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put(str2, this.b);
             }
             if (!TextUtils.isEmpty(this.c)) {
                jSONObject.put(str1, this.c);
             }
          }else if(!TextUtils.isEmpty(this.b)){
             jSONObject.put(str2, this.b);
          }
          if (!TextUtils.isEmpty(this.c)) {
             jSONObject.put(str1, this.c);
          }
          if (!TextUtils.isEmpty(this.d)) {
             td = this.d;
          label_00ae :
             jSONObject.put(str, td);
          }
       }else if(!TextUtils.isEmpty(this.b)){
          td = this.b;
          goto label_00ae ;
       }
       x$3 a = this.f.a;
       x$3$1 ta = this.a;
       x$3$1 te = this.e;
       String str4 = (jSONObject.length() <= 0)? "": jSONObject.toString();
       a.a(ta, null, te, null, str4);
       return;
    }
}
