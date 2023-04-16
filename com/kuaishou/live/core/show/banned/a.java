package com.kuaishou.live.core.show.banned.a;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.banned.a$a;
import o32.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o32.n;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.video.waynelive.LivePlayerController;
import ds5.e;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCSuspectedViolation;
import lf3.g;
import hf3.a;
import java.util.Objects;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.view.TextureView$SurfaceTextureListener;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback;
import java.lang.Boolean;
import android.util.SparseIntArray;
import android.view.TextureView;
import com.yxcorp.gifshow.util.rx.RxBus;
import o32.m;
import f66.d;
import pp.a;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.banned.c;
import java.util.Map;
import java.util.HashMap;

public class a extends c implements g	// class@0009e2
{
    public a0 p;
    public a$b q;
    public n r;
    public boolean s;
    public final g t;
    public static String sLivePresenterClassName = "LiveAudienceViolationPresenter";

    public void a(){
       super();
       this.q = new a$a(this);
       this.s = false;
       this.t = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tp = this.p;
       this.r = new n(this.p.Z2.b(), tp.E, tp.J, this.m8());
       a0 c = this.p.C;
       if (c != null) {
          c.u0(355, LiveStreamMessages$SCSuspectedViolation.class, this.t);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, a.class, str)) {
          return;
       }
       a0 c = this.p.C;
       if (c != null) {
          c.o(355, this.t);
       }
       a tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, n.class, str)) {
          n h = tr.h;
          if (h instanceof LivePlayTextureView) {
             h.g(tr.m);
          }else {
             h.getHolder().removeCallback(tr.l);
          }
       }
       return;
    }
    public final void P8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.s = p0;
       uoa = this.r;
       Objects.requireNonNull(uoa);
       n on = n.class;
       if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoa, on, "2")) {
          int i = 4;
          String str = "Violation";
          int i1 = 0;
          if (p0) {
             uoa.d.stopPlay(str);
             uoa.j.setVisibility(i1);
             uoa.f.setVisibility(i1);
             uoa.g.setVisibility(i1);
             n h = uoa.h;
             if (h instanceof LivePlayTextureView) {
                h.g(uoa.m);
                uoa.h.a(uoa.m);
             }else {
                h.getHolder().removeCallback(uoa.l);
                uoa.h.getHolder().addCallback(uoa.l);
             }
             uoa.k.put(uoa.h.getId(), uoa.h.getVisibility());
             uoa.h.setVisibility(i1);
             uoa.k.put(uoa.i.getId(), uoa.i.getVisibility());
             uoa.i.setVisibility(i);
             on = uoa.e;
             if (on != null) {
                on.G7();
             }
          }else {
             uoa.d.startPlay(str);
             uoa.j.setVisibility(i);
             uoa.f.setVisibility(8);
             uoa.g.setVisibility(8);
             on = uoa.h;
             if (on instanceof TextureView) {
                on.g(uoa.m);
             }else {
                on.getHolder().removeCallback(uoa.l);
             }
             on = uoa.h;
             on.setVisibility(uoa.k.get(on.getId(), uoa.h.getVisibility()));
             on = uoa.i;
             on.setVisibility(uoa.k.get(on.getId(), uoa.i.getVisibility()));
          }
          RxBus.f.b(new m(p0));
          int i2 = 2;
          if (d.e()) {
             Object[] objArray = new Object[i2];
             objArray[i1] = "receive";
             objArray[1] = Boolean.valueOf(p0);
             a.C().s("ks://live", "suspected_violation", objArray);
          }
          if (p0 != uoa.b) {
             uoa.b = p0;
             if (d.e()) {
                Object[] objArray1 = new Object[i2];
                objArray1[i1] = "change";
                objArray1[1] = Boolean.valueOf(p0);
                a.C().s("ks://live", "suspected_violation", objArray1);
             }
             if (!p0) {
                uoa.c.b2(1);
             }
          }
       }
    label_0157 :
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new c());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       return;
    }
}
