package com.meizu.cloud.pushsdk.b;
import android.content.Context;
import java.util.List;
import com.meizu.cloud.pushsdk.handler.a;
import java.lang.Object;
import android.util.SparseArray;
import java.util.HashMap;
import com.meizu.cloud.pushsdk.b$a;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.a.f.a;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.handler.a.a.a;
import com.meizu.cloud.pushsdk.handler.a.c;
import com.meizu.cloud.pushsdk.handler.c;
import com.meizu.cloud.pushsdk.handler.a.b;
import com.meizu.cloud.pushsdk.handler.a.e;
import com.meizu.cloud.pushsdk.handler.a.d.b;
import com.meizu.cloud.pushsdk.handler.a.d;
import com.meizu.cloud.pushsdk.handler.a.f;
import com.meizu.cloud.pushsdk.handler.a.d.d;
import com.meizu.cloud.pushsdk.handler.a.e.a;
import com.meizu.cloud.pushsdk.handler.a.e.c;
import com.meizu.cloud.pushsdk.handler.a.e.f;
import com.meizu.cloud.pushsdk.handler.a.e.d;
import com.meizu.cloud.pushsdk.handler.a.e.e;
import com.meizu.cloud.pushsdk.handler.a.f.c;
import com.meizu.cloud.pushsdk.handler.a.e.b;
import com.meizu.cloud.pushsdk.handler.a.d.e;
import com.meizu.cloud.pushsdk.handler.a.b.a;
import com.meizu.cloud.pushsdk.handler.a.d.a;
import com.meizu.cloud.pushsdk.handler.a.d.f;
import com.meizu.cloud.pushsdk.handler.a.f.b;
import com.meizu.cloud.pushsdk.handler.a.d.c;
import java.lang.IllegalArgumentException;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.util.Map;
import java.util.Iterator;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.Exception;

public class b	// class@0014b7
{
    public final SparseArray a;
    public Map c;
    public a d;
    public a e;
    public static b b;

    public void b(Context p0){
       super(p0, null);
    }
    public void b(Context p0,List p1){
       super(p0, p1, null);
    }
    public void b(Context p0,List p1,a p2){
       super();
       this.a = new SparseArray();
       if (p0 == null) {
          throw new IllegalArgumentException("Context must not be null.");
       }
       p0 = p0.getApplicationContext();
       this.c = new HashMap();
       b$a uoa = new b$a(this);
       if (("com.meizu.cloud").equalsIgnoreCase(p0.getPackageName())) {
          this.d = new a(p0);
          if (MinSdkChecker.isSupportNotificationSort()) {
             this.e = new a(p0);
          }
       }
       if (p1 == null) {
          this.a(new c(p0, uoa));
          this.a(new b(p0, uoa));
          this.a(new e(p0, uoa));
          this.a(new b(p0, uoa));
          this.a(new d(p0, uoa));
          this.a(new f(p0, uoa));
          this.a(new d(p0, uoa));
          this.a(new a(p0, uoa));
          this.a(new c(p0, uoa));
          this.a(new f(p0, uoa));
          this.a(new d(p0, uoa));
          this.a(new e(p0, uoa));
          this.a(new c(p0, uoa));
          this.a(new b(p0, uoa));
          this.a(new e(p0, uoa));
          this.a(new a(p0, uoa));
          this.a(new a(p0, uoa));
          this.a(new f(p0, uoa));
          this.a(new b(p0, uoa));
          this.a(new c(p0, uoa));
       }else {
          this.a(p1);
       }
       return;
    }
    public static b a(Context p0){
       if (b.b == null) {
          _monitor_enter(b.class);
          if (b.b == null) {
             DebugLogger.i("PushMessageProxy", "PushMessageProxy init");
             b.b = new b(p0);
          }
          _monitor_exit(b.class);
       }
       return b.b;
    }
    public static Map a(b p0){
       return p0.c;
    }
    public b a(c p0){
       this.a.put(p0.a(), p0);
       return this;
    }
    public b a(String p0,a p1){
       this.c.put(p0, p1);
       return this;
    }
    public b a(List p0){
       if (p0 == null) {
          throw new IllegalArgumentException("messageManagerList must not be null.");
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.a(iterator.next());
       }
       return this;
    }
    public a a(){
       return this.d;
    }
    public void a(Intent p0){
       String str = "process message start";
       try{
          DebugLogger.e("PushMessageProxy", str);
          DebugLogger.i("PushMessageProxy", "receive action "+p0.getAction()+" method "+p0.getStringExtra("method"));
          int i = 0;
          while (i < this.a.size() && !this.a.valueAt(i).b(p0)) {
             i = i + 1;
          }
       }catch(java.lang.Exception e5){
          DebugLogger.e("PushMessageProxy", "process message error "+e5.getMessage());
       }
       return;
    }
    public a b(){
       return this.e;
    }
}
