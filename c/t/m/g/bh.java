package c.t.m.g.bh;
import java.util.HashMap;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Object;
import java.lang.ThreadLocal;
import java.util.Locale;
import java.lang.System;

public class bh	// class@000be5
{
    public static HashMap a;

    static {
       bh.a = new HashMap();
    }
    public static String a(String p0,long p1){
       return bh.a(p0).format(new Date(p1));
    }
    public static synchronized SimpleDateFormat a(String p0){
       _monitor_enter(bh.class);
       ThreadLocal threadLocal = bh.a.get(p0);
       if (threadLocal == null) {
          threadLocal = new ThreadLocal();
          bh.a.put(p0, threadLocal);
       }
       SimpleDateFormat simpleDateFo = threadLocal.get();
       if (simpleDateFo == null) {
          simpleDateFo = new SimpleDateFormat(p0, Locale.ENGLISH);
          threadLocal.set(simpleDateFo);
       }
       _monitor_exit(bh.class);
       return simpleDateFo;
    }
    public static String b(String p0){
       return bh.a(p0, System.currentTimeMillis());
    }
}
