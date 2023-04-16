package bw5.r;
import dw5.a;
import java.lang.Object;
import bw5.s;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xv5.c;
import xv5.a;
import tkd.b;
import tkd.d;
import bw5.u;
import java.util.ArrayList;
import com.kwai.feature.api.social.message.imshare.model.IMShareRecoRequest;
import brd.a0;
import bw5.d;
import erd.o;
import java.lang.Integer;
import bw5.i;
import z1.a;
import xv5.e;
import brd.t;
import bw5.h;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import bw5.k;
import com.yxcorp.gifshow.activity.GifshowActivity;
import bw5.l;
import android.app.Activity;
import bw5.g;
import com.kwai.imsdk.msg.KwaiMsg;
import bw5.a;
import bw5.e;
import bw5.n;
import bw5.f;
import zv5.h;
import bw5.j;
import zv5.b;
import bw5.b;
import bw5.o;
import bw5.m;
import java.lang.ref.WeakReference;
import bw5.q;
import zv5.i;
import bw5.p;
import bw5.c;

public class r implements a	// class@000623
{
    public final Class b;

    public void r(){
       super();
       this.b = s.class;
    }
    public List AI(){
       List obj = PatchProxy.apply(null, this, r.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!c.d()) {
          a.d("IMSharePlugin", "getIMShareTargetsFromReco");
       }
       obj = d.a(0x351e19a5).AI();
       if (obj == null) {
          ArrayList uArrayList = new ArrayList();
       }
       return obj;
    }
    public a0 Ai(IMShareRecoRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().u(new d(p0));
    }
    public void C40(int p0,String p1,int p2){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, r.class, "18")) {
          return;
       }
       this.F(new i(p0, p1, p2));
       return;
    }
    public final void F(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       e.k(s.class, p0);
       return;
    }
    public t Fe(){
       Object obj = PatchProxy.apply(null, this, r.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().w(h.b);
    }
    public void LB(IMShareRequest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "10")) {
          return;
       }
       this.F(new k(p0));
       return;
    }
    public void S40(GifshowActivity p0,IMShareRequest p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "12")) {
          return;
       }
       e.e(p0, this.b, new l(p0, p1));
       return;
    }
    public t Sv(){
       Object obj = PatchProxy.apply(null, this, r.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().w(g.b);
    }
    public void cG(int p0,KwaiMsg p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, or, "21")) {
          return;
       }
       this.F(new a(p0, p1));
       return;
    }
    public t fL(IMShareRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().w(new e(p0));
    }
    public void fP(GifshowActivity p0,IMShareRequest p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "15")) {
          return;
       }
       e.e(p0, this.b, new n(p0, p1));
       return;
    }
    public t hM(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().w(new f(p0));
    }
    public List hS(int p0){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, or, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!c.d()) {
          a.d("IMSharePlugin", "getIMShareTargets");
       }
       List list = d.a(0x351e19a5).hS(p0);
       if (list == null) {
          list = new ArrayList();
       }
       return list;
    }
    public void hl(int p0,String p1,int p2,h p3){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, r.class, "19")) {
          return;
       }
       this.F(new j(p0, p1, p2, p3));
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void lG(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "8")) {
          return;
       }
       this.F(new b(p0, p1));
       return;
    }
    public void mo(GifshowActivity p0,IMShareRequest p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "17")) {
          return;
       }
       e.e(p0, this.b, new o(p0, p1));
       return;
    }
    public final a0 n(){
       Object obj = PatchProxy.apply(null, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(s.class);
    }
    public void rr(GifshowActivity p0,IMShareRequest p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "14")) {
          return;
       }
       e.e(p0, this.b, new m(p0, p1));
       return;
    }
    public void vL(GifshowActivity p0,IMShareRequest p1,String p2,WeakReference p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, r.class, "16")) {
          return;
       }
       e.e(p0, this.b, new q(p0, p1, p2, p3));
       return;
    }
    public void vu(GifshowActivity p0,IMShareRequest p1,i p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, r.class, "13")) {
          return;
       }
       e.e(p0, this.b, new p(p0, p1, p2));
       return;
    }
    public void xp(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "9")) {
          return;
       }
       this.F(new c(p0, p1));
       return;
    }
}
