package com.kuaishou.commercial.splash.presenter.j$a;
import yy.x0;
import com.kuaishou.commercial.splash.presenter.j;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import yy.w0;
import java.lang.StringBuilder;
import yx.j0;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import android.view.View;
import android.os.SystemClock;

public class j$a implements x0	// class@0015f2
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public final ClientEvent$ElementPackage A(String p0,String p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, this, j$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       if (!TextUtils.x(p1)) {
          obj.params = p1;
       }
       return obj;
    }
    public final ClientEvent$UrlPackage B(){
       ClientEvent$UrlPackage obj = PatchProxy.apply(null, this, j$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$UrlPackage();
       obj.page2 = "LAUNCH_PHOTO";
       return obj;
    }
    public void a(int p0){
       w0.k(this, p0);
    }
    public void b(double[] p0){
       w0.t(this, p0);
    }
    public void c(){
       w0.f(this);
    }
    public void d(){
       w0.b(this);
    }
    public void e(){
       w0.l(this);
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashClientPresenter", "logSplashShowFail: "+p0, objArray);
       return;
    }
    public void g(){
       w0.d(this);
    }
    public void h(int p0){
       w0.v(this, p0);
    }
    public void i(int p0,int p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "6")) {
          return;
       }
       this.t(0, p0, p1);
       return;
    }
    public void j(){
       w0.i(this);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashClientPresenter", "report SkipBtn Show", objArray);
       if (this.a.R8()) {
          return;
       }
       u1.y0(this.B(), 1, this.A("SKIP_BIRTHDAY_PHOTO_BUTTON", ""), null);
       return;
    }
    public void l(int p0,int p1,int p2,int p3,int p4){
       w0.p(this, p0, p1, p2, p3, p4);
    }
    public void m(){
       w0.o(this);
    }
    public void n(int p0,int p1){
       w0.c(this, p0, p1);
    }
    public void o(){
       w0.j(this);
    }
    public void p(int p0){
       w0.w(this, p0);
    }
    public String q(){
       return w0.a(this);
    }
    public void r(int p0,int p1){
       w0.g(this, p0, p1);
    }
    public void s(){
       w0.e(this);
    }
    public void t(int p0,int p1,int p2){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, j$a.class, "7")) {
          return;
       }
       long l = this.a.P8();
       Object[] objArray = new Object[0];
       j0.f("SplashClientPresenter", "report logSkipBtnClick stay time: "+l, objArray);
       i3 oi3 = i3.f();
       oi3.c("watch_duration", Long.valueOf(l));
       String str = oi3.e();
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.elementPackage = this.A("SKIP_BIRTHDAY_PHOTO_BUTTON", str);
       u1.z(this.B(), uClickEvent);
       return;
    }
    public void u(int p0,int p1,int p2){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, j$a.class, "4")) {
          return;
       }
       long l = this.a.P8();
       Object[] objArray = new Object[0];
       j0.f("SplashClientPresenter", "report SplashClick stay time: "+l, objArray);
       i3 oi3 = i3.f();
       oi3.c("watch_duration", Long.valueOf(l));
       oi3.d("jump_type", "CLICK");
       String str = oi3.e();
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.elementPackage = this.A("BIRTHDAY_PHOTO_CARD", str);
       u1.z(this.B(), uClickEvent);
       return;
    }
    public void v(float p0){
       w0.u(this, p0);
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "8")) {
          return;
       }
       long l = this.a.P8();
       Object[] objArray = new Object[0];
       j0.f("SplashClientPresenter", "report Splash PlayEnd stay time: "+l, objArray);
       if (this.a.R8()) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("watch_duration", Long.valueOf(l));
       oi3.d("jump_type", "AUTO");
       String str = oi3.e();
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.elementPackage = this.A("BIRTHDAY_PHOTO_CARD", str);
       u1.z(this.B(), uClickEvent);
       return;
    }
    public void x(View p0,int p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashClientPresenter", "logSplashShow £º mDisplayStartTime£º"+this.a.s, objArray);
       if (this.a.R8()) {
          return;
       }
       j$a ta = this.a;
       ta.t = true;
       if (ta.s >= 0) {
          ta.s = SystemClock.elapsedRealtime();
       }
       u1.y0(this.B(), true, this.A("BIRTHDAY_PHOTO_CARD", ""), null);
       return;
    }
    public void y(){
       w0.h(this);
    }
    public void z(int p0,int p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       this.u(0, p0, p1);
       return;
    }
}
