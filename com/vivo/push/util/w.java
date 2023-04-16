package com.vivo.push.util.w;
import com.vivo.push.util.b;
import java.lang.String;
import java.lang.Byte;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.vivo.push.util.p;
import android.content.Context;

public final class w extends b	// class@0010c5
{
    public static w b;

    public void w(){
       super();
    }
    public static synchronized w b(){
       _monitor_enter(w.class);
       if (w.b == null) {
          w.b = new w();
       }
       _monitor_exit(w.class);
       return w.b;
    }
    public static byte[] c(String p0){
       int len;
       byte[] uobyteArray = null;
       try{
          String[] stringArray = p0.split(",");
          int i = 0;
          if (stringArray.length > 0) {
             uobyteArray = new byte[stringArray.length];
             len = stringArray.length;
          }else {
             len = 0;
          }
          while (i < len) {
             uobyteArray[i] = Byte.parseByte((stringArray[i]).trim());
             i = i + 1;
          }
       }catch(java.lang.Exception e4){
          p.a("SharePreferenceManager", "getCodeBytes error:"+e4.getMessage());
       }
       return uobyteArray;
    }
    public synchronized final void a(Context p0){
       if (this.a == null) {
          this.a = p0;
          this.a(p0, "com.vivo.push_preferences");
       }
       return;
    }
    public final byte[] c(){
       byte[] uobyteArray = w.c(this.b("com.vivo.push.secure_cache_iv", ""));
       if (uobyteArray == null || uobyteArray.length <= 0) {
          uobyteArray = new byte[16]{'"',0x20,'!','%','!','"',0x20,'!','!','!','"',')','#',0x20,0x20,0x20};
       }
       return uobyteArray;
    }
    public final byte[] d(){
       byte[] uobyteArray = w.c(this.b("com.vivo.push.secure_cache_key", ""));
       if (uobyteArray == null || uobyteArray.length <= 0) {
          uobyteArray = new byte[16]{'!','"','#','$','%','&',0x27,'(',')',0x20,'&','%','$','#','"','!'};
       }
       return uobyteArray;
    }
}
