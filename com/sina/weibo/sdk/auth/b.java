package com.sina.weibo.sdk.auth.b;
import java.lang.Object;
import java.util.HashMap;
import com.sina.weibo.sdk.auth.b$a;
import java.lang.String;
import com.sina.weibo.sdk.auth.WbAuthListener;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;

public final class b	// class@000bb2
{
    public Map e;

    public void b(){
       super();
       this.e = new HashMap();
    }
    public void b(byte p0){
       super();
    }
    public static synchronized b b(){
       _monitor_enter(b.class);
       _monitor_exit(b.class);
       return b$a.c();
    }
    public synchronized final WbAuthListener a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       return this.e.get(p0);
    }
    public synchronized final void a(String p0,WbAuthListener p1){
       if (TextUtils.isEmpty(p0) || p1 == null) {
          return;
       }
       this.e.put(p0, p1);
       return;
    }
    public synchronized final void b(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.e.remove(p0);
       return;
    }
}
