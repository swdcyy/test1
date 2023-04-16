package com.meizu.cloud.pushsdk.d.e.a;
import com.meizu.cloud.pushsdk.d.e.a$a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import com.meizu.cloud.pushsdk.d.e.b;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import com.meizu.cloud.pushsdk.d.f.b;
import com.meizu.cloud.pushsdk.d.f.c;
import java.lang.String;
import java.util.List;
import com.meizu.cloud.pushsdk.d.a.b;
import java.util.Map;
import com.meizu.cloud.pushsdk.d.e.c;
import java.util.LinkedList;
import java.util.Iterator;
import com.meizu.cloud.pushsdk.d.b.a;
import com.meizu.cloud.pushsdk.d.a.c;
import java.util.HashMap;
import com.meizu.cloud.pushsdk.d.a.a;
import com.meizu.cloud.pushsdk.d.c.b;
import com.meizu.cloud.pushsdk.d.c.a;

public abstract class a	// class@001521
{
    public final String a;
    public a b;
    public c c;
    public b d;
    public final String e;
    public final String f;
    public final boolean g;
    public final b h;
    public final boolean i;
    public final long j;
    public final int k;
    public final TimeUnit l;
    public final AtomicBoolean m;
    public static final String n = "a";

    public void a(a$a p0){
       super();
       this.a = "4.1.0";
       this.m = new AtomicBoolean(true);
       this.b = p0.a;
       this.f = p0.c;
       this.g = p0.f;
       this.e = p0.b;
       this.c = p0.e;
       this.h = p0.g;
       a$a h = p0.h;
       this.i = h;
       this.j = p0.k;
       a$a l = p0.l;
       if (l < 2) {
          l = 2;
       }
       this.k = l;
       a$a m = p0.m;
       this.l = m;
       if (h != null) {
          b uob = new b(p0.i, p0.j, m, p0.d);
          this.d = h;
       }
       c.a(p0.g);
       Object[] objArray = new Object[0];
       c.c(a.n, "Tracker created successfully.", objArray);
       return;
    }
    public final b a(List p0){
       if (this.i != null) {
          p0.add(this.d.a());
       }
       a tc = this.c;
       if (tc != null) {
          if (!tc.a().isEmpty()) {
             p0.add(new b("geolocation", this.c.a()));
          }
          if (!this.c.b().isEmpty()) {
             p0.add(new b("mobileinfo", this.c.b()));
          }
       }
       LinkedList linkedList = new LinkedList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          linkedList.add(iterator.next().a());
       }
       return new b("push_extra_info", linkedList);
    }
    public void a(){
       if (!this.m.get()) {
          return;
       }
       this.b().a();
       return;
    }
    public final void a(c p0,List p1,boolean p2){
       if (this.c != null) {
          p0.a(new HashMap(this.c.c()));
          p0.a("et", this.a(p1).a());
       }
       Object[] objArray = new Object[]{p0};
       c.c(a.n, "Adding new payload to event storage: %s", objArray);
       this.b.a(p0, p2);
       return;
    }
    public void a(b p0,boolean p1){
       if (!this.m.get()) {
          return;
       }
       this.a(p0.e(), p0.a(), p1);
       return;
    }
    public void a(c p0){
       this.c = p0;
    }
    public a b(){
       return this.b;
    }
}
