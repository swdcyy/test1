package com.kuaishou.live.basic.liveslide.a;
import cw6.f;
import c51.d;
import androidx.fragment.app.c;
import d51.a;
import jw6.a;
import pw6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import cw6.b;
import java.util.List;
import dw6.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.Number;
import com.kwai.library.widget.viewpager.VerticalViewPager$e;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.framework.viewitem.GrootEmptyFragment;
import bw6.a;
import wg3.b;
import b51.e;
import java.lang.Runnable;
import ekd.k1;
import h3.a;

public class a extends f	// class@000cce
{
    public final d N;
    public final a O;
    public boolean P;
    public int Q;

    public void a(d p0,c p1,a p2){
       super(p1, p2);
       this.N = p0;
       this.O = p2;
    }
    public a J(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.O.e(p1);
    }
    public final void K0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "10")) {
          return;
       }
       if (this.l0(p0) >= (this.k0() - 3) && this.N.j0()) {
          this.N.b0();
       }
       return;
    }
    public void P(List p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "5")) {
          return;
       }
       super.P(p0, p1, p2);
       this.K0(this.C);
       return;
    }
    public void T(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       r1.g5(p0.b(LiveStreamFeed.class), p0.d);
       return;
    }
    public void Y(List p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "4")) {
          return;
       }
       this.Q = p2;
       super.Y(p0, p1, p2);
       this.K0(this.C);
       return;
    }
    public int c0(){
       return 0x7a120;
    }
    public int j(){
       return 0xf4240;
    }
    public int k(Object p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.Q > null && p0 instanceof VerticalViewPager$e) {
          obj = this.r.iterator();
          while (obj.hasNext()) {
             VerticalViewPager$e uoe = obj.next();
             if (p0.a instanceof a) {
                uoe = uoe.a;
                if (uoe != null && (uoe.yb() && !uoe.a() instanceof GrootEmptyFragment)) {
                   uoe.U();
                }
             }
          }
       }
       if (this.P != null) {
          return -2;
       }else {
          return super.k(p0);
       }
    }
    public void o0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
       }else {
          super.o0(p0);
          k1.r(new e(this), 0);
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       super.q();
       this.Q = 0;
       return;
    }
    public void t0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       b tC = this.C;
       if (p0 > tC) {
          this.K0(tC);
       }
       super.t0(p0);
       return;
    }
}
