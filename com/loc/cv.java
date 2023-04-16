package com.loc.cv;
import com.loc.ec;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import android.util.Base64;
import com.loc.cm;
import java.lang.StringBuilder;
import com.loc.ee;
import com.loc.dq;
import com.loc.ed;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.lang.Throwable;
import com.loc.eb;

public final class cv	// class@0013ce
{

    public static boolean a(byte[] p0){
       ec uoec;
       String str;
       boolean b = false;
       if (p0 != null) {
          ed uoed = null;
          try{
             uoec = new ec();
             uoec.b.put("Content-Type", "application/octet-stream");
             uoec.b.put("aps_c_src", Base64.encodeToString((ec.a()).getBytes(), 2));
             uoec.b.put("aps_c_key", Base64.encodeToString((ec.b()).getBytes(), 2));
             uoec.d = p0;
             if (cm.a) {
                str = "http://cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
             }else if(cm.b){
                str = "https://";
             }else {
                str = "http://";
             }
             str = str+"cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
          }catch(java.lang.Exception e7){
             eb.a(e7);
          }
             uoec.a = str;
             ed uoed1 = dq.b().a(uoec);
             if (uoed1 != null && uoed1.a == 200) {
                uoed = uoed1.c;
             }
             if (uoed != null && ("true").equals(new String(uoed, StandardCharsets.UTF_8))) {
                b = true;
             }
       }
    }
}
