package com.vivo.push.util.v;
import com.vivo.push.util.d;
import java.lang.Object;
import java.lang.String;
import android.content.ContentResolver;
import android.provider.Settings$System;
import java.lang.Exception;
import com.vivo.push.util.p;
import android.content.Context;
import com.vivo.push.util.j;

public final class v implements d	// class@0010c4
{
    public ContentResolver a;

    public void v(){
       super();
    }
    public final String a(String p0,String p1){
       try{
          p1 = Settings$System.getString(this.a, p0);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          p.b("SettingsCache", ("getString error by ").concat(String.valueOf(p0)));
       }
       return p1;
    }
    public final boolean a(Context p0){
       if (!j.b()) {
          return false;
       }
       this.a = p0.getContentResolver();
       return true;
    }
    public final void b(String p0,String p1){
       try{
          Settings$System.putString(this.a, p0, p1);
          return;
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          p.b("SettingsCache", ("putString error by ").concat(String.valueOf(p0)));
          return;
       }
    }
}
