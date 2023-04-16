package com.meizu.cloud.pushsdk.d.e.b;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.f.e;
import java.lang.Integer;
import java.lang.Exception;
import com.meizu.cloud.pushsdk.d.f.c;
import com.meizu.cloud.pushsdk.d.a.b;
import java.lang.System;
import java.util.HashMap;
import com.meizu.cloud.pushsdk.d.f.a;

public class b	// class@001522
{
    public String b;
    public String c;
    public String d;
    public int e;
    public final String f;
    public final AtomicBoolean g;
    public long h;
    public final long i;
    public final long j;
    public final Context k;
    public static final String a = "b";

    public void b(long p0,long p1,TimeUnit p2,Context p3){
       try{
          super();
          this.c = null;
          this.e = 0;
          this.f = "SQLITE";
          this.g = new AtomicBoolean(0);
          this.i = p2.toMillis(p0);
          this.j = p2.toMillis(p1);
          this.k = p3;
          Map map = this.f();
          if (map != null) {
             this.b = map.get("userId").toString();
             this.e = map.get("sessionIndex").intValue();
             this.c = map.get("sessionId").toString();
          label_0068 :
             this.d();
             this.g();
             Object[] objArray = new Object[0];
             c.c(b.a, "Tracker Session Object created.", objArray);
             return;
          }
       }catch(java.lang.Exception e3){
          Object[] objArray1 = new Object[]{e3.getMessage()};
          c.a(b.a, "Exception occurred retrieving session info from file: %s", objArray1);
       }
       this.b = e.b();
       goto label_0068 ;
    }
    public b a(){
       Object[] objArray = new Object[0];
       c.c(b.a, "Getting session context...", objArray);
       this.g();
       return new b("client_session", this.c());
    }
    public void b(){
       Object[] objArray = new Object[0];
       c.b(b.a, "Checking and updating session information.", objArray);
       long l = System.currentTimeMillis();
       b tj = (this.g.get())? this.j: this.i;
       if (!e.a(this.h, l, tj)) {
          this.d();
          this.g();
       }
       return;
    }
    public Map c(){
       HashMap hashMap = new HashMap(8);
       hashMap.put("userId", this.b);
       hashMap.put("sessionId", this.c);
       hashMap.put("previousSessionId", this.d);
       hashMap.put("sessionIndex", Integer.valueOf(this.e));
       hashMap.put("storageMechanism", "SQLITE");
       return hashMap;
    }
    public final void d(){
       this.d = this.c;
       this.c = e.b();
       this.e = this.e + 1;
       String a = b.a;
       Object[] objArray = new Object[0];
       c.b(a, "Session information is updated:", objArray);
       objArray = new Object[]{this.c};
       c.b(a, " + Session ID: %s", objArray);
       objArray = new Object[]{this.d};
       c.b(a, " + Previous Session ID: %s", objArray);
       Object[] objArray1 = new Object[]{Integer.valueOf(this.e)};
       c.b(a, " + Session Index: %s", objArray1);
       this.e();
    }
    public final boolean e(){
       return a.a("snowplow_session_vars", this.c(), this.k);
    }
    public final Map f(){
       return a.a("snowplow_session_vars", this.k);
    }
    public final void g(){
       this.h = System.currentTimeMillis();
    }
}
