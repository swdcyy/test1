package com.kuaishou.live.longconnection.connector.d;
import com.kuaishou.live.longconnection.connector.c;
import java.util.List;
import java.lang.Object;
import com.kuaishou.live.longconnection.connector.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.longconnection.connector.l$c;
import lf3.g;
import java.lang.Integer;
import java.lang.Boolean;
import lf3.d;
import com.kuaishou.android.live.model.Race;
import com.kuaishou.live.longconnection.connector.l;
import java.util.Objects;
import java.lang.Long;
import of3.l;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.k;
import lf3.a;

public class d implements c	// class@000c5f
{
    public final List a;
    public final b b;
    public l$c c;

    public void d(List p0){
       super();
       this.b = new b();
       this.a = p0;
    }
    public static List q(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(new l$c(iterator.next(), "none"));
       }
       return obj;
    }
    public void J(int p0,Class p1,g p2,boolean p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, d.class, "12")) {
          return;
       }
       this.b.p(p0, p1, p2, p3);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       this.b();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.b.e();
       return;
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       this.b.a(p0);
       return;
    }
    public void clearAllListener(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       this.b.b();
       return;
    }
    public void d(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "18")) {
          return;
       }
       uod = this.b;
       if (uod != null) {
          uod.t(p0);
       }
       return;
    }
    public void disconnect(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.b.c();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d.class, "14")) {
          return;
       }
       this.b.m();
       return;
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "19")) {
          return;
       }
       d tb = this.b;
       if (tb != null) {
          tb.s(p0);
       }
       return;
    }
    public void g(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       this.b.q(p0);
       return;
    }
    public Race h(){
       return null;
    }
    public void i(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "16")) {
          return;
       }
       this.b.r(p0);
       return;
    }
    public boolean isConnected(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.l();
    }
    public l$c j(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.g();
    }
    public void k(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       List list = d.q(this.a);
       if (list != null && !list.isEmpty()) {
          int i = 0;
          while (i < list.size()) {
             if ((list.get(i).c()).equals(this.c.c())) {
                this.c = list.get(((i + 1) % list.size()));
                break ;
             }
             i = i + 1;
          }
          d tb = this.b;
          long l = tb.k();
          Objects.requireNonNull(tb);
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), tb, uob, "11")) {
             tb.e.u(new l(l));
          }
          p0.l(this.c);
          this.p(p0);
       }
       return;
    }
    public void l(l p0,Race p1){
    }
    public void m(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "11")) {
          return;
       }
       this.b.u(p0);
       return;
    }
    public void n(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       List list = d.q(this.a);
       if (list != null && !list.isEmpty()) {
          if (this.c == null) {
             this.c = list.get(0);
          }
          p0.l(this.c);
          this.p(p0);
       }
       return;
    }
    public void o(int p0,g p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "13")) {
          return;
       }
       this.b.v(p0, p1);
       return;
    }
    public final void p(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "17")) {
          return;
       }
       this.b.n(p0);
       this.b.d();
       return;
    }
    public void pause(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       this.b.o(p0);
       return;
    }
}
