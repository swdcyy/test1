package eia.w;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import cia.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import jta.c;
import hf5.e;
import df5.b;
import hf5.b;
import cia.w$a;
import hf5.g;
import brd.t;
import cia.v;
import erd.g;
import crd.b;
import im8.a;
import lnc.b9;
import fia.y;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter;
import fia.k0;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter;
import fia.l;
import fia.m;
import com.kwai.feature.component.entry.a;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import lga.a;
import tkd.b;
import tkd.d;
import hv5.b;
import mv5.b;
import com.kwai.robust.PatchProxyResult;
import eia.z;
import java.util.Map;
import java.util.HashMap;

public class w extends PresenterV2 implements g	// class@00269f
{
    public final w p;

    public void w(NasaSlideParam p0){
       super();
       this.p = new w();
       this.P8(p0);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, w.class, "2")) {
          return;
       }
       w tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, w.class, "15")) {
          w f = tp.f;
          if (f != null) {
             f.D0(tp.o);
          }
          f = tp.g;
          if (f != null) {
             f.De(tp.p);
          }
          f = tp.h;
          if (f != null) {
             w$a uoa = new w$a(f);
             tp.l = uoa;
             if (!PatchProxy.applyVoid(objArray, uoa, w$a.class, "2")) {
                uoa.a = uoa.c.m().subscribe(new v(uoa));
             }
          }
       }
    label_0053 :
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.W7(this.p);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, w.class, "3")) {
          return;
       }
       w tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, w.class, "16")) {
          w f = tp.f;
          if (f != null) {
             f.w0(tp.o);
          }
          f = tp.g;
          if (f != null) {
             f.c3(tp.p);
          }
          tp = tp.l;
          if (tp != null && !PatchProxy.applyVoid(objArray, tp, w$a.class, "3")) {
             b9.a(tp.a);
          }
       }
    label_0040 :
       return;
    }
    public void P8(NasaSlideParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "4")) {
          return;
       }
       this.U7(new y());
       if (p0.mIsFollowAcquaintanceSlideDetail != null) {
          this.U7(new FollowSlideAcquaintanceRecordPresenter());
       }
       this.U7(new FollowSlideUnFollowPresenter());
       this.U7(new k0());
       if (p0.mEnableFollowSlideRecoFeedRecord != null) {
          this.U7(new FollowSlideRecoFeedRecordPresenter());
       }
       this.U7(new l());
       this.U7(new m());
       int i = a.n(p0.mEntrySource);
       if (d.v() >= 0) {
          i = d.v();
       }
       int i1 = 1;
       int i2 = a.t().a("detailTopBarWithSearchBoxStyle", i1);
       if (d.w() > 0) {
          i2 = d.w();
       }
       if (i > 0 && i2 != 2) {
          i1 = 0;
       }
       if (!a.a() && (p0.mEnableFollowSlidePymiV2 != null && i1)) {
          d.a(-1327213102).TF(this);
       }
    label_0090 :
       this.U7(d.a(0x3ee97dc2).r3());
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new z();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, w.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(w.class, new z());
       }else {
          obj.put(w.class, null);
       }
       return obj;
    }
}
