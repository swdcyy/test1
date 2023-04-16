package com.kwai.chat.kwailink.client.d0;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.util.Set;
import o75.b0;
import m75.h;
import f85.f;
import java.util.concurrent.ScheduledExecutorService;
import f85.b;
import java.lang.Runnable;
import com.kwai.chat.kwailink.client.c0;
import java.util.Objects;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.client.u;

public class d0	// class@000a2c
{
    public static final Set a;

    static {
       d0.a = new CopyOnWriteArraySet();
    }
    public void d0(){
       super();
    }
    public static void a(int p0){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uod0, "9")) {
          return;
       }
       Iterator iterator = d0.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().A(p0);
       }
       return;
    }
    public static void b(int p0,int p1){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uod0, "5")) {
          return;
       }
       Iterator iterator = d0.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().C(p0, p1);
       }
       h.c(p0, p1);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uof, "5")) {
          f.a().execute(new b(p1));
       }
       return;
    }
    public static void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, d0.class, "3")) {
          return;
       }
       c0 uoc0 = c0.e();
       Objects.requireNonNull(uoc0);
       if (!PatchProxy.applyVoid(objArray, uoc0, c0.class, "59")) {
          b.c().execute(u.b);
       }
       return;
    }
    public static void d(){
       if (PatchProxy.applyVoid(null, null, d0.class, "4")) {
          return;
       }
       Iterator iterator = d0.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().v();
       }
       return;
    }
    public static void e(){
       if (PatchProxy.applyVoid(null, null, d0.class, "6")) {
          return;
       }
       Iterator iterator = d0.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       return;
    }
    public static void f(int p0,String p1){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uod0, "7")) {
          return;
       }
       Iterator iterator = d0.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().i(p0, p1);
       }
       return;
    }
    public static void g(b0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d0.class, "1")) {
          return;
       }
       d0.a.add(p0);
       return;
    }
}
