package com.loc.z$1;
import java.lang.Thread;
import com.loc.z;
import java.lang.String;
import com.loc.af;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.content.Context;
import android.provider.Settings$System;
import android.content.ContentResolver;
import com.loc.ab;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class z$1 extends Thread	// class@001473
{
    public final String a;
    public final int b;
    public final z c;

    public void z$1(z p0,String p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void run(){
       SharedPreferences$Editor uEditor;
       ContentResolver contentResol;
       String str1;
       String str = af.b(this.a);
       if (!TextUtils.isEmpty(str)) {
          if ((this.b & 0x01) > 0) {
             try{
                if (Build$VERSION.SDK_INT >= 23) {
                   if (Settings$System.canWrite(z.a(this.c))) {
                      contentResol = z.a(this.c).getContentResolver();
                      str1 = z.b(this.c);
                   }
                }else {
                   contentResol = z.a(this.c).getContentResolver();
                   str1 = z.b(this.c);
                }
                Settings$System.putString(contentResol, str1, str);
             }catch(java.lang.Exception e0){
             }
          }
       }
    label_0082 :
       return;
    }
}
