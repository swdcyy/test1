package com.kuaishou.android.security.internal.dispatch.e;
import java.lang.Object;
import com.kuaishou.android.security.internal.plugin.g;
import com.kuaishou.android.security.internal.dispatch.a;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.init.c;
import com.kuaishou.android.security.internal.init.a;
import com.kuaishou.android.security.internal.plugin.bundle.a;
import com.kuaishou.android.security.internal.plugin.c;
import java.lang.Integer;
import java.util.Map;
import java.lang.Exception;
import com.kuaishou.android.security.internal.plugin.bundle.b;
import com.kuaishou.android.security.internal.plugin.bundle.c;
import com.kuaishou.android.security.internal.plugin.bundle.f;
import com.kuaishou.android.security.internal.plugin.bundle.d;
import com.kuaishou.android.security.internal.plugin.bundle.e;

public class e	// class@0006e2
{
    public g a;
    public final Map b;
    public static e c;
    public static c d;
    public static final Object e;
    public static JSONObject f;
    public static Object g;

    static {
       e.e = new Object();
       e.g = new Object();
    }
    public void e(g p0){
       super();
       this.b = new a(this);
       this.a = p0;
    }
    public static e a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.a(p0, null);
    }
    public static e a(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.c == null || e.c.a == null) {
          _monitor_enter(e.class);
          if (p0 == null) {
             _monitor_exit(e.class);
             return null;
          }else if(e.c == null){
             e.c = new e(e.a(p1).a());
          }else if(e.c.a == null){
             p0.a = e.a(p1).a();
          }
          _monitor_exit(e.class);
       }
       return e.c;
    }
    public static c a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.d == null) {
          obj = e.e;
          _monitor_enter(obj);
          if (e.d == null) {
             e.d = new a(p0);
          }
          _monitor_exit(obj);
       }
       return e.d;
    }
    public static c b(){
       Object obj = PatchProxy.apply(null, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.a(null);
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, e.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a(a.e);
    }
    public c a(int p0){
       c obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = 0;
       try{
          obj = this.a(this.b.get(Integer.valueOf(p0)));
       }catch(com.kuaishou.android.security.base.exception.KSException e4){
          e4.printStackTrace();
       }
       return obj;
    }
    public Object a(Class p0){
       e obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          return null;
       }
       return obj.a(p0);
    }
    public g c(){
       return this.a;
    }
    public b d(){
       Object obj = PatchProxy.apply(null, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a(a.b);
    }
    public c e(){
       Object obj = PatchProxy.apply(null, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a(a.c);
    }
    public f f(){
       Object obj = PatchProxy.apply(null, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a(a.d);
    }
    public d g(){
       Object obj = PatchProxy.apply(null, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a(a.a);
    }
    public e h(){
       Object obj = PatchProxy.apply(null, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a(a.f);
    }
}
