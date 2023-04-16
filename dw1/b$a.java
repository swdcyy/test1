package dw1.b$a;
import cw1.s;
import dw1.b;
import java.lang.Object;
import oq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jv1.b;
import h47.b;
import j47.d;
import lt5.b;
import lt5.a;
import java.lang.Boolean;
import w37.a;
import w37.b;
import mw1.d;
import mw1.b;
import com.kwai.robust.PatchProxyResult;
import mw1.c;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import p91.m;
import lp3.e;
import hz1.a;
import lp3.c;

public class b$a implements s	// class@002040
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void Q0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "5")) {
          return;
       }
       b q = this.a.q;
       if (q != null) {
          q.Q0(p0);
       }
       return;
    }
    public void Q1(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       b x = this.a.x;
       if (x != null) {
          x.Q1(p0);
       }
       return;
    }
    public void R1(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "9")) {
          return;
       }
       b v = this.a.v;
       if (v != null) {
          v.R1(p0);
       }
       return;
    }
    public void W0(c p0,boolean p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "4")) {
          return;
       }
       b q = this.a.q;
       if (q != null) {
          q.W0(p0, true);
       }
       return;
    }
    public void W3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "10")) {
          return;
       }
       b u = this.a.u;
       if (u != null) {
          u.W3(p0);
       }
       return;
    }
    public void X0(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "7")) {
          return;
       }
       b w = this.a.w;
       if (w != null) {
          w.X0(p0);
       }
       return;
    }
    public boolean X3(){
       b obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.t;
       boolean b = (obj != null && obj.X3())? true: false;
       return b;
    }
    public void Y3(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "6")) {
          return;
       }
       b w = this.a.w;
       if (w != null) {
          w.Y3(p0);
       }
       return;
    }
    public boolean Z3(){
       boolean b = (this.a.t != null)? true: false;
       return b;
    }
    public boolean l(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a.p.u5() == LiveSceneType.Audience && this.a.p.t5() != null) {
          return this.a.p.t5().a(a.class).l();
       }
       return false;
    }
    public void x2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "11")) {
          return;
       }
       b u = this.a.u;
       if (u != null) {
          u.x2(p0);
       }
       return;
    }
    public void y2(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "8")) {
          return;
       }
       b v = this.a.v;
       if (v != null) {
          v.y2(p0);
       }
       return;
    }
}
