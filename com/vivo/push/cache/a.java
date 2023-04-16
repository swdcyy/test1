package com.vivo.push.cache.a;
import com.vivo.push.cache.c;
import android.content.Context;
import java.lang.String;
import com.vivo.push.util.z;
import java.lang.Object;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import com.vivo.push.model.a;
import com.vivo.push.util.p;
import java.lang.Integer;
import com.vivo.push.util.f;
import android.util.Base64;
import java.util.Iterator;

public final class a extends c	// class@001052
{

    public void a(Context p0){
       super(p0);
    }
    public static boolean a(int p0){
       if (p0 == -1) {
          return (z.b("persist.sys.log.ctrl", "no")).equals("yes");
       }
       if (p0 & 1) {
          return 1;
       }
       return false;
    }
    public final String a(){
       return "com.vivo.pushservice.back_up";
    }
    public final List a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       if (!TextUtils.isEmpty(p0)) {
          String[] stringArray = (p0.trim()).split("@#");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             String str = (stringArray[i]).trim();
             String[] stringArray1 = (str.trim()).split(",");
             if (stringArray1.length >= 2) {
                try{
                   int i1 = (stringArray1[0]).length() + 1;
                   uArrayList.add(new a(stringArray1[0], str.substring(i1)));
                }catch(java.lang.Exception e4){
                   p.d("AppConfigSettings", ("str2Clients E: ").concat(String.valueOf(e4)));
                }
             }
             i = i + 1;
          }
       }
       return uArrayList;
    }
    public final int b(){
       a uoa = this.c("push_mode");
       if (uoa == null || TextUtils.isEmpty(uoa.b())) {
          return -1;
       }
       try{
          return Integer.parseInt(uoa.b());
       }catch(java.lang.Exception e0){
       }
    }
    public final String b(String p0){
       return new String(f.a(f.a(this.e()), f.a(this.f()), Base64.decode(p0, 2)), "utf-8");
    }
    public final a c(String p0){
       a uoa;
       Object a = c.a;
       _monitor_enter(a);
       Iterator iterator = this.b.iterator();
       while (true) {
          if (iterator.hasNext()) {
             uoa = iterator.next();
             if (!TextUtils.isEmpty(uoa.a()) && (uoa.a()).equals(p0)) {
                break ;
             }
          }else {
             _monitor_exit(a);
             return null;
          }
       }
       _monitor_exit(a);
       return uoa;
    }
}
