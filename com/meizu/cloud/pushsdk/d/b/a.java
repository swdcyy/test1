package com.meizu.cloud.pushsdk.d.b.a;
import com.meizu.cloud.pushsdk.d.b.a$a;
import java.lang.Object;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.g;
import java.util.concurrent.atomic.AtomicBoolean;
import com.meizu.cloud.pushsdk.d.f.c;
import com.meizu.cloud.pushsdk.c.c.i;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.c.a;
import java.lang.Throwable;
import android.util.Log;
import com.meizu.cloud.pushsdk.d.a.a;
import android.net.Uri$Builder;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import android.net.Uri;
import com.meizu.cloud.pushsdk.c.c.i$a;
import java.util.ArrayList;
import com.meizu.cloud.pushsdk.d.a.b;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.d.b.c;
import java.util.LinkedList;
import com.meizu.cloud.pushsdk.d.b.d;
import com.meizu.cloud.pushsdk.d.b.e;
import com.meizu.cloud.pushsdk.d.b.b;
import com.meizu.cloud.pushsdk.c.c.l;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.d.b.h;

public abstract class a	// class@00150b
{
    public final Context a;
    public final f b;
    public final int c;
    public final int d;
    public final int e;
    public final TimeUnit f;
    public final AtomicBoolean g;
    public final String h;
    public final g i;
    public Uri$Builder j;
    public d k;
    public b l;
    public h m;
    public final SSLSocketFactory n;
    public final HostnameVerifier o;
    public String p;
    public final long q;
    public final long r;
    public final a s;

    public void a(a$a p0){
       super();
       this.h = "a";
       this.i = g.a("application/json; charset=utf-8");
       this.g = new AtomicBoolean(false);
       this.k = p0.d;
       this.b = p0.c;
       this.a = p0.b;
       this.l = p0.e;
       this.m = p0.f;
       this.n = p0.m;
       this.o = p0.n;
       this.c = p0.g;
       this.d = p0.i;
       this.e = p0.h;
       this.q = p0.j;
       this.r = p0.k;
       this.p = p0.a;
       this.f = p0.l;
       this.s = p0.o;
       this.c();
       Object[] objArray = new Object[false];
       c.c("a", "Emitter created successfully!", objArray);
    }
    public int a(i p0){
       k ok = null;
       try{
          Object[] objArray = new Object[]{p0};
          c.b(this.h, "Sending request: %s", objArray);
          ok = this.s.a(p0);
          this.a(ok);
          return ok.a();
       }catch(java.io.IOException e7){
          Object[] objArray1 = new Object[v1];
          objArray1[v0] = Log.getStackTraceString(e7);
          c.a(this.h, "Request sending failed: %s", objArray1);
          this.a(ok);
          return -1;
       }
    }
    public final i a(a p0){
       this.a(p0, "");
       this.j.clearQuery();
       HashMap hashMap = p0.a();
       Iterator iterator = hashMap.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          this.j.appendQueryParameter(str, hashMap.get(str));
       }
       return new i$a().a(this.j.build().toString()).a().c();
    }
    public final i a(ArrayList p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().a());
       }
       b uob = new b("push_group_data", uArrayList);
       Object[] objArray = new Object[0];
       c.b(this.h, "final SelfDescribingJson "+uob, objArray);
       return new i$a().a(this.j.build().toString()).a(j.a(this.i, uob.toString())).c();
    }
    public LinkedList a(c p0){
       int i1;
       LinkedList linkedList2;
       long l1;
       a uoa = this;
       int i = p0.a().size();
       LinkedList linkedList = p0.b();
       LinkedList linkedList1 = new LinkedList();
       long l = 22;
       if (uoa.k == d.a) {
          for (i1 = 0; i1 < i; i1 = i1 + 1) {
             linkedList2 = new LinkedList();
             linkedList2.add(linkedList.get(i1));
             a uoa1 = p0.a().get(i1);
             l1 = uoa1.b() + l;
             boolean b = (l1 - uoa.q > 0)? true: false;
             linkedList1.add(new e(b, uoa.a(uoa1), linkedList2));
          }
       }else {
          i1 = 0;
          while (i1 < i) {
             linkedList2 = new LinkedList();
             ArrayList uArrayList = new ArrayList();
             l1 = 0;
             int i2 = i1;
             int i3 = uoa.l.a() + i1;
             while (i2 < i3 && i2 < i) {
                a uoa2 = p0.a().get(i2);
                long l2 = uoa2.b() + l;
                long l3 = 88;
                long l4 = l2 + l3;
                if (l4 - uoa.r > 0) {
                   ArrayList uArrayList1 = new ArrayList();
                   LinkedList linkedList3 = new LinkedList();
                   uArrayList1.add(uoa2);
                   linkedList3.add(linkedList.get(i2));
                   linkedList1.add(new e(true, uoa.a(uArrayList1), linkedList3));
                }else {
                   l1 = l1 + l2;
                   l3 = l1 + l3;
                   int i4 = uArrayList.size() - true;
                   l3 = l3 + (long)i4;
                   if (l3 - uoa.r > 0) {
                      linkedList1.add(new e(false, uoa.a(uArrayList), linkedList2));
                      ArrayList uArrayList2 = new ArrayList();
                      LinkedList linkedList4 = new LinkedList();
                      uArrayList2.add(uoa2);
                      linkedList4.add(linkedList.get(i2));
                      uArrayList = uArrayList2;
                      linkedList2 = linkedList4;
                      l1 = l2;
                   }else {
                      uArrayList.add(uoa2);
                      linkedList2.add(linkedList.get(i2));
                   }
                }
                i2 = i2 + 1;
                l = 22;
             }
             if (!uArrayList.isEmpty()) {
                linkedList1.add(new e(false, uoa.a(uArrayList), linkedList2));
             }
             i1 = i1 + uoa.l.a();
             l = 22;
          }
       }
       return linkedList1;
    }
    public abstract void a();
    public final void a(k p0){
       try{
          if (p0 != null && p0.b() != null) {
             p0.b().close();
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          c.b(this.h, "Unable to close source data", objArray);
       }
       return;
    }
    public final void a(a p0,String p1){
       if (("").equals(p1)) {
          p1 = e.a();
       }
       p0.a("stm", p1);
       return;
    }
    public abstract void a(a p0,boolean p1);
    public boolean a(int p0){
       boolean b = (p0 >= 200 && p0 < 300)? true: false;
       return b;
    }
    public String b(){
       return this.j.clearQuery().build().toString();
    }
    public final void c(){
       StringBuilder str;
       String str1;
       Object[] objArray = new Object[0];
       c.a(this.h, "security "+this.m, objArray);
       if (this.m == h.a) {
          str = "";
          str1 = "http://";
       }else {
          str = "";
          str1 = "https://";
       }
       this.j = Uri.parse(str+str1+this.p).buildUpon();
       if (this.k == d.a) {
          this.j.appendPath("i");
       }else {
          this.j.appendEncodedPath("push_data_report/mobile");
       }
       return;
    }
}
