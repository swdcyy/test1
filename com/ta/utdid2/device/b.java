package com.ta.utdid2.device.b;
import java.lang.Object;
import com.ta.utdid2.device.a;
import java.lang.String;
import java.lang.Long;
import com.ta.utdid2.a.a.g;
import java.util.zip.Adler32;
import android.content.Context;
import com.ta.utdid2.device.c;
import java.lang.System;
import com.ta.utdid2.a.a.e;

public class b	// class@000cd3
{
    public static a a;
    public static final Object d;

    static {
       b.d = new Object();
    }
    public static long a(a p0){
       if (p0 != null) {
          Object[] objArray = new Object[]{p0.f(),p0.getDeviceId(),Long.valueOf(p0.a()),p0.getImsi(),p0.e()};
          String str = String.format("%s%s%s%s%s", objArray);
          if (!g.a(str)) {
             Adler32 uAdler32 = new Adler32();
             uAdler32.reset();
             uAdler32.update(str.getBytes());
             return uAdler32.getValue();
          }
       }
       return 0;
    }
    public static a a(Context p0){
       if (p0 != null) {
          Object d = b.d;
          _monitor_enter(d);
          String value = c.a(p0).getValue();
          if (!g.a(value)) {
             if (value.endsWith("\n")) {
                value = value.substring(0, (value.length() - 1));
             }
             a uoa = new a();
             String str = e.a(p0);
             uoa.d(str);
             uoa.b(str);
             uoa.b(System.currentTimeMillis());
             uoa.c(e.c(p0));
             uoa.e(value);
             uoa.a(b.a(uoa));
             _monitor_exit(d);
             return uoa;
          }else {
             _monitor_exit(d);
          }
       }
       return null;
    }
    public static synchronized a b(Context p0){
       _monitor_enter(b.class);
       a a = b.a;
       if (a != null) {
          _monitor_exit(b.class);
          return a;
       }else if(p0 != null){
          a uoa = b.a(p0);
          b.a = uoa;
          _monitor_exit(b.class);
          return uoa;
       }else {
          _monitor_exit(b.class);
          return null;
       }
    }
}
