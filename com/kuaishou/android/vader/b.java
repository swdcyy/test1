package com.kuaishou.android.vader.b;
import android.content.Context;
import er.m;
import java.lang.String;
import tq.f;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import xq.c;
import com.kuaishou.android.vader.b$b;
import java.lang.Runnable;
import uq.a;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.vader.Channel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.vader.b$c;
import ar.b;
import com.kuaishou.android.vader.b$d;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.vader.b$e;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import xq.a;
import tq.d;
import xq.b;
import com.kuaishou.android.vader.b$a;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import java.lang.Exception;
import tq.g;
import com.kuaishou.android.vader.b$f;
import com.kuaishou.android.vader.b$h;
import com.kuaishou.android.vader.b$g;

public class b	// class@00070f
{
    public final ExecutorService a;
    public final m b;
    public final f c;
    public e d;
    public a e;

    public void b(Context p0,m p1,String p2,f p3){
       super();
       this.b = p1;
       this.a = c.a("vader");
       this.c = p3;
       this.f(new b$b(this, p0, p1, p2));
    }
    public static void a(b p0){
       p0.j();
    }
    private void j(){
       b te = this.e;
       if (te != null) {
          te.h();
       }
       return;
    }
    public void b(MessageNano p0,Channel p1,String p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, b.class, "1")) {
          return;
       }
       this.f(new b$c(this, p0, p1, p2));
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
    public void c(MessageNano p0,Channel p1,String p2,b p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, b.class, "2")) {
          return;
       }
       b$d uod = new b$d(this, p0, p1, p2, p3);
       this.f(v0);
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public boolean d(MessageNano p0,Channel p1,String p2,boolean p3,boolean p4){
       b$e obj;
       int i = 0;
       if (PatchProxy.isSupport2(b.class, "3")) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = new b$e(this, p0, p1, p2, p3, p4);
       Boolean uBoolean = this.i(this.e(v12), 1000);
       if (uBoolean != null && uBoolean.booleanValue()) {
          i = true;
       }
       PatchProxy.onMethodExit(b.class, "3");
       return i;
    }
    public final Future e(Callable p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(b.class, "11");
       return this.a.submit(new a(this.b.d(), p0));
    }
    public final void f(Runnable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "10")) {
          return;
       }
       this.a.execute(new b(this.b.d(), p0));
       PatchProxy.onMethodExit(b.class, "10");
       return;
    }
    public b g(Channel p0,String p1){
       b obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          PatchProxy.onMethodExit(b.class, "13");
          return obj.d(p0, p1);
       }else {
          PatchProxy.onMethodExit(b.class, "13");
          return null;
       }
    }
    public Future h(){
       Object obj = PatchProxy.applyWithListener(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(b.class, "9");
       return this.e(new b$a(this));
    }
    public Object i(Future p0,int p1){
       if (PatchProxy.isSupport2(b.class, "12")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(p0, Integer.valueOf(p1), this, b.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = (long)p1;
       try{
          PatchProxy.onMethodExit(b.class, "12");
          return p0.get(l, TimeUnit.MILLISECONDS);
       }catch(java.lang.Exception e5){
          this.b.d().a(e5);
          PatchProxy.onMethodExit(v0, v1);
          return null;
       }
    }
    public void k(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "7")) {
          return;
       }
       this.f(new g(this));
       PatchProxy.onMethodExit(b.class, "7");
       return;
    }
    public void l(Channel p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "5")) {
          return;
       }
       this.f(new b$f(this, p0));
       PatchProxy.onMethodExit(b.class, "5");
       return;
    }
    public void m(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "8")) {
          return;
       }
       this.f(new b$h(this, p0));
       PatchProxy.onMethodExit(b.class, "8");
       return;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "6")) {
          return;
       }
       this.f(new b$g(this));
       PatchProxy.onMethodExit(b.class, "6");
       return;
    }
}
