package com.meizu.cloud.pushsdk.d.b.a.a;
import com.meizu.cloud.pushsdk.d.b.a;
import com.meizu.cloud.pushsdk.d.b.a$a;
import com.meizu.cloud.pushsdk.d.d.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.d.d.d;
import com.meizu.cloud.pushsdk.d.d.c;
import java.lang.Object;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.f.c;
import com.meizu.cloud.pushsdk.c.c.i;
import java.util.concurrent.atomic.AtomicBoolean;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.d.b.c;
import java.util.LinkedList;
import java.util.Iterator;
import com.meizu.cloud.pushsdk.d.b.g;
import java.util.Collection;
import java.lang.Integer;
import com.meizu.cloud.pushsdk.d.b.f;
import java.lang.StringBuilder;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
import com.meizu.cloud.pushsdk.d.b.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import com.meizu.cloud.pushsdk.d.b.a.b;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.lang.Long;
import com.meizu.cloud.pushsdk.d.b.a.a$3;
import com.meizu.cloud.pushsdk.d.b.a.a$1;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.d.a.a;
import java.lang.Boolean;
import com.meizu.cloud.pushsdk.d.b.a.a$2;

public class a extends a	// class@001509
{
    public final String h;
    public d i;
    public int j;

    public void a(a$a p0){
       super(p0);
       this.h = "a";
       a uoa = new a(this.a, this.e);
       this.i = uoa;
       if (!uoa.a()) {
          this.i = new c(this.e);
          Object[] objArray = new Object[0];
          c.a("a", "init memory store", objArray);
       }
       return;
    }
    public static int a(a p0,i p1){
       return p0.a(p1);
    }
    public static AtomicBoolean a(a p0){
       return p0.g;
    }
    public static void b(a p0){
       p0.c();
    }
    public static d c(a p0){
       return p0.i;
    }
    private void c(){
       Object[] objArray2;
       a tb;
       int i = 1;
       int i1 = 0;
       if (e.a(this.a)) {
          if (this.i.c() - null > 0) {
             this.j = i1;
             Object[] objArray = new Object[i1];
             c.c(this.h, "Processing emitter results.", objArray);
             LinkedList linkedList = new LinkedList();
             Iterator iterator = this.a(this.a(this.i.d())).iterator();
             int i2 = 0;
             int i3 = 0;
             while (iterator.hasNext()) {
                g og = iterator.next();
                if (og.a()) {
                   linkedList.addAll(og.b());
                   i2 = i2 + og.b().size();
                }else {
                   i3 = i3 + og.b().size();
                   Object[] objArray1 = new Object[i1];
                   c.a(this.h, "Request sending failed but we will retry later.", objArray1);
                }
             }
             this.b(linkedList);
             objArray2 = new Object[i];
             objArray2[i1] = Integer.valueOf(i2);
             c.b(this.h, "Success Count: %s", objArray2);
             objArray2 = new Object[i];
             objArray2[i1] = Integer.valueOf(i3);
             c.b(this.h, "Failure Count: %s", objArray2);
             tb = this.b;
             if (tb != null) {
                if (i3) {
                   tb.a(i2, i3);
                }else {
                   tb.a(i2);
                }
             }
             if (i3 > 0 && !i2) {
                if (e.a(this.a)) {
                   objArray2 = new Object[i];
                   objArray2[i1] = this.b();
                   c.a(this.h, "Ensure collector path is valid: %s", objArray2);
                }
                objArray2 = new Object[i1];
                c.a(this.h, "Emitter loop stopping: failures.", objArray2);
             label_012f :
                this.g.compareAndSet(i, i1);
             }
          }else {
             tb = this.j;
             if (tb >= this.d) {
                objArray2 = new Object[i1];
                c.a(this.h, "Emitter loop stopping: empty limit reached.", objArray2);
                this.g.compareAndSet(i, i1);
                tb = this.b;
                if (tb != null) {
                   tb.a(i);
                }
             }else {
                this.j = tb + i;
                tb = this.h;
                String str = "Emitter database empty: "+this.j;
                objArray2 = new Object[i1];
                try{
                   c.a(tb, str, objArray2);
                   this.f.sleep((long)this.c);
                }catch(java.lang.InterruptedException e0){
                   Object[] objArray3 = new Object[i1];
                   c.a(this.h, "Emitter thread sleep interrupted: "+e0.toString(), objArray3);
                }
             }
          }
       }else {
          objArray2 = new Object[i1];
          c.a(this.h, "Emitter loop stopping: emitter offline.", objArray2);
          goto label_012f ;
       }
       return;
    }
    public final LinkedList a(LinkedList p0){
       LinkedList linkedList = new LinkedList();
       LinkedList linkedList1 = new LinkedList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          linkedList1.add(b.a(this.b(iterator.next().a())));
       }
       Object[] objArray = new Object[]{Integer.valueOf(linkedList1.size())};
       c.b(this.h, "Request Futures: %s", objArray);
       int i = 0;
       while (i < linkedList1.size()) {
          int i1 = -1;
          try{
             i1 = linkedList1.get(i).get(5, TimeUnit.SECONDS).intValue();
          }catch(java.lang.InterruptedException e5){
             Object[] objArray1 = new Object[]{e5.getMessage()};
             c.a(this.h, "Request Future was interrupted: %s", objArray1);
          }catch(java.util.concurrent.ExecutionException e5){
             objArray1 = new Object[]{e5.getMessage()};
             c.a(this.h, "Request Future failed: %s", objArray1);
          }catch(java.util.concurrent.TimeoutException e5){
             objArray1 = new Object[]{e5.getMessage()};
             c.a(this.h, "Request Future had a timeout: %s", objArray1);
          }
          if (p0.get(i).c()) {
             linkedList.add(new g(1, p0.get(i).b()));
          }else {
             linkedList.add(new g(this.a(i1), p0.get(i).b()));
          }
          i = i + 1;
       }
       return linkedList;
    }
    public final Callable a(Long p0){
       return new a$3(this, p0);
    }
    public void a(){
       b.a(new a$1(this));
    }
    public void a(a p0,boolean p1){
       this.i.a(p0);
       Object[] objArray = new Object[0];
       c.a(this.h, "isRunning "+this.g+" attemptEmit "+p1, objArray);
       if (!p1) {
          try{
             this.f.sleep(1);
          }catch(java.lang.InterruptedException e5){
             Object[] objArray1 = new Object[0];
             c.a(this.h, "Emitter add thread sleep interrupted: "+e5.toString(), objArray1);
          }
       }
    }
    public final LinkedList b(LinkedList p0){
       boolean b;
       LinkedList linkedList = new LinkedList();
       LinkedList linkedList1 = new LinkedList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          linkedList1.add(b.a(this.a(iterator.next())));
       }
       Object[] objArray = new Object[]{Integer.valueOf(linkedList1.size())};
       c.b(this.h, "Removal Futures: %s", objArray);
       for (int i = 0; i < linkedList1.size(); i++) {
          try{
             b = linkedList1.get(i).get(5, TimeUnit.SECONDS).booleanValue();
          }catch(java.lang.InterruptedException e3){
             Object[] objArray1 = new Object[]{e3.getMessage()};
             c.a(this.h, "Removal Future was interrupted: %s", objArray1);
          }catch(java.util.concurrent.ExecutionException e3){
             objArray1 = new Object[]{e3.getMessage()};
             c.a(this.h, "Removal Future failed: %s", objArray1);
          }catch(java.util.concurrent.TimeoutException e3){
             objArray1 = new Object[]{e3.getMessage()};
             c.a(this.h, "Removal Future had a timeout: %s", objArray1);
          }
          linkedList.add(Boolean.valueOf(b));
       }
       return linkedList;
    }
    public final Callable b(i p0){
       return new a$2(this, p0);
    }
}
