package com.kuaishou.live.ad.social.b;
import zl0.t0;
import zl0.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import cm0.f;
import nl9.i0$b;
import nl9.i0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.ad.social.b$a;
import mxb.i;
import tkd.b;
import tkd.d;
import nl9.u;
import zl9.c;
import zl0.e;
import com.kwai.framework.model.feed.BaseFeed;
import erd.g;
import androidx.fragment.app.DialogFragment;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$SCLiveCommonStateSignal;
import com.kuaishou.live.ad.social.a;
import lf3.g;
import com.kwai.robust.PatchProxyResult;
import zl0.d;
import com.kuaishou.live.ad.social.b$b;
import java.util.Map;
import km9.a;
import com.kuaishou.live.ad.social.l$b;

public class b extends t0	// class@000a0a
{
    public a v;
    public l$b w;

    public void b(){
       super();
    }
    public void C6(a1 p0,int p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b.class, "5")) {
          return;
       }
       b.B(LiveLogTag.AD, "cannot report task show on anchor side");
       return;
    }
    public void D4(a1 p0,LiveAdConversionTaskDetail p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "3")) {
          return;
       }
       b.B(LiveLogTag.AD, "conversion task on anchor side");
       i0$b uob = i0.a();
       uob.b(this.getActivity());
       uob.g(this.p.b().getChildFragmentManager());
       uob.c(new b$a(this, f.a(p0)));
       uob.h(p1.mH5Url);
       i0 oi0 = uob.a();
       this.s = d.a(-1694791652).lp(oi0, this.P8(p0), null, new e(this));
       return;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
          this.p.u().u0(641, LiveExtraMessages$SCLiveCommonStateSignal.class, new a(this));
       }
       return;
    }
    public void I0(a1 p0,int p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b.class, "4")) {
          return;
       }
       b.B(LiveLogTag.AD, "cannot report task clicked on anchor side");
       return;
    }
    public final c P8(a1 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this, p0);
    }
    public void X3(a1 p0,String p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "6")) {
          return;
       }
       i0$b uob = i0.a();
       uob.b(this.getActivity());
       uob.g(this.p.b().getChildFragmentManager());
       uob.h(p1);
       uob.c(new b$b(this, p0));
       i0 oi0 = uob.a();
       d.a(-1694791652).lp(oi0, this.P8(p0), null, null);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(b.class, null);
       return objectsByTag;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.v = this.q8(a.class);
       this.w = this.q8(l$b.class);
       return;
    }
    public String k2(){
       return "";
    }
}
