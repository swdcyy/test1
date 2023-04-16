package com.kwai.live.gzone.accompanyplay.anchor.z;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import h37.f0;
import com.kwai.live.gzone.accompanyplay.anchor.z$d;
import android.app.Activity;
import d61.y;
import com.kwai.live.gzone.accompanyplay.anchor.z$a;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import h37.g0;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import oq5.a;
import com.kwai.live.gzone.accompanyplay.anchor.z$b;
import oq5.c;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.kwai.live.gzone.accompanyplay.anchor.z$c;
import erd.g;
import brd.t;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import f37.o0;
import lnc.a1;

public class z extends c implements PopupInterface$f	// class@000b4a
{
    public View p;
    public f0 q;
    public b r;
    public LiveGzoneAnchorAccompanyFleetStateFragment s;
    public d t;
    public a u;
    public c v;
    public boolean w;

    public void z(c$b p0,f0 p1){
       super(p0);
       this.w = false;
       p0.L(this);
       this.q = p1;
       boolean b = y.d(this.b.G);
       p0.F(new z$a(this, b));
       p0.N(new g0(b));
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "4")) {
          return;
       }
       b9.a(this.r);
       return;
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       boolean b = this.u.H2();
       this.w = b;
       this.b0(b);
       z$b uob = new z$b(this);
       this.v = uob;
       this.u.H6(uob);
       e uoe = this.b.G.getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.live_gzone_anchor_accompany_fleet_state_layout, this.s);
       uoe.o();
       b9.a(this.r);
       this.r = this.q.d.subscribe(new z$c(this));
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, z.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.p = a.g(p1, 0x7f0d0b7e, p2, false);
       LiveGzoneAnchorAccompanyFleetStateFragment liveGzoneAnc = new LiveGzoneAnchorAccompanyFleetStateFragment();
       z tq = this.q;
       liveGzoneAnc.L = tq.d;
       liveGzoneAnc.P = this.t;
       liveGzoneAnc.Q = this;
       liveGzoneAnc.M = tq.e;
       liveGzoneAnc.N = tq.f;
       Bundle uBundle = new Bundle();
       String str = "arg_layout_id";
       if (this.q.g != null) {
          uBundle.putInt(str, R.layout.arg_RES_7f0d0b7b);
       }else {
          uBundle.putInt(str, R.layout.arg_RES_7f0d0b7d);
       }
       uBundle.putString("arg_accompany_id", this.q.b);
       uBundle.putString("arg_fleet_title", this.q.a);
       uBundle.putString("arg_live_stream_id", this.q.c);
       liveGzoneAnc.setArguments(uBundle);
       this.s = liveGzoneAnc;
       return this.p;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "5")) {
          return;
       }
       if (this.s != null) {
          this.b.G.getSupportFragmentManager().beginTransaction().u(this.s).m();
       }
       this.u.Q0(this.v);
       return;
    }
    public void b0(boolean p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "3")) {
          return;
       }
       int i = -1;
       if (p0) {
          Activity uActivity = this.u();
          ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = n.k(uActivity) / 2;
             layoutParams.height = i;
          }
          o0.p(this.p, true);
       }else {
          p0.height = a1.e(0x43f00000);
          p0.width = i;
          o0.p(this.p, false);
       }
       return;
    }
}
