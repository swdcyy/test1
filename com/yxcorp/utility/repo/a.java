package com.yxcorp.utility.repo.a;
import android.app.Application;
import java.lang.Object;
import hkd.c;
import java.util.HashMap;
import java.util.HashSet;
import com.yxcorp.utility.repo.a$a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import java.lang.Integer;
import java.util.Map;
import com.yxcorp.utility.repo.ParamsHolder;
import java.lang.String;
import java.util.Set;
import vkd.b;
import java.lang.Runnable;
import t45.c;

public class a	// class@0009d6
{
    public final c a;
    public final Map b;
    public final Set c;
    public final Map d;
    public Application$ActivityLifecycleCallbacks e;
    public static a f;

    public void a(Application p0){
       super();
       this.a = new c(true);
       this.b = new HashMap();
       this.c = new HashSet();
       this.d = new HashMap();
       this.e = new a$a(this);
       this.d();
       p0.registerActivityLifecycleCallbacks(this.e);
    }
    public static a b(Application p0){
       if (a.f == null) {
          _monitor_enter(a.class);
          if (a.f == null) {
             a.f = new a(p0);
          }
          _monitor_exit(a.class);
       }
       return a.f;
    }
    public Object a(int p0,Activity p1){
       a ta = this.a;
       _monitor_enter(ta);
       ParamsHolder paramsHolder = this.b.get(Integer.valueOf(p0));
       if (paramsHolder == null) {
          _monitor_exit(ta);
          return null;
       }else {
          this.a.a();
          String str = String.valueOf(p1.hashCode());
          if (paramsHolder.mOwners == null) {
             paramsHolder.mOwners = new HashSet();
          }
          paramsHolder.mOwners.add(str);
          Set set = this.d.get(str);
          if (set == null) {
             set = new HashSet();
             this.d.put(str, set);
          }
          set.add(paramsHolder);
          _monitor_exit(ta);
          return paramsHolder.mParams;
       }
    }
    public int c(Object p0){
       a ta = this.a;
       _monitor_enter(ta);
       this.a.a();
       ParamsHolder paramsHolder = new ParamsHolder(p0);
       int i = paramsHolder.mParams.hashCode();
       this.b.put(Integer.valueOf(i), paramsHolder);
       _monitor_exit(ta);
       return i;
    }
    public void d(){
       c.a(new b(this));
    }
}
