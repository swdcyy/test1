package h92.s;
import im8.g;
import c12.f;
import java.util.HashSet;
import h92.h;
import h92.i;
import io.reactivex.subjects.PublishSubject;
import h92.s$a;
import h92.k;
import h92.s$b;
import h92.g;
import h92.m;
import h92.l;
import h92.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h92.i0;
import mrd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import cm1.b;
import ih1.l;
import t02.a0;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import m91.b;
import lf3.g;
import hf3.a;
import i92.l;
import java.util.Iterator;
import h92.c;
import crd.b;
import lnc.b9;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.models.Gift;
import java.util.List;
import java.lang.Integer;
import cm1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import i92.l$a;
import h92.j;
import ok.x;
import brd.t;
import ry1.b;
import h92.o;
import sfc.a;
import erd.g;
import java.util.Collections;
import com.kuaishou.live.core.basic.model.LiveGiftOutsideConfigResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j;
import h92.z;
import java.util.Map;
import java.util.HashMap;
import i92.b;
import h92.i0$d;
import android.view.View$OnClickListener;
import h92.p;
import com.kuaishou.livestream.message.nano.LiveGiftOutsideMessages$LiveGiftOutsideConfig;

public class s extends f implements g	// class@002d27
{
    public a0 K;
    public l L;
    public b M;
    public i0$d N;
    public SparseIntArray O;
    public Gift P;
    public String Q;
    public String R;
    public LiveGiftGuideConfig S;
    public b T;
    public b U;
    public s$c U0;
    public b V;
    public l V0;
    public final HashSet W;
    public b W0;
    public x X;
    public final s$d X0;
    public x Y;
    public View$OnClickListener Y0;
    public c Z;
    public b Z0;
    public g a1;
    public static String sLivePresenterClassName = "LiveAudienceGiftGuidePresenter";

    public void s(){
       super();
       this.W = new HashSet();
       this.X = new h(this);
       this.Y = new i(this);
       this.Z = PublishSubject.g();
       this.U0 = new s$a(this);
       this.W0 = new k(this);
       this.X0 = new s$b(this);
       this.Y0 = new g(this);
       this.Z0 = new m(this);
       this.a1 = new l(this);
       this.U7(new a0());
       this.U7(new i0(this.Z));
    }
    public void Q(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "3")) {
          return;
       }
       this.b9();
       this.a9();
       if (!PatchProxy.applyVoid(null, this, os, "6")) {
          this.V0.e(this.W0);
       }
       a[] uoaArray = new a[]{AudienceBizRelation.RECHARGE_ACTIVITY};
       this.K.Y0.G5(this.Z0, uoaArray);
       this.K.C.o(771, this.a1);
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, s.class, "10")) {
          return;
       }
       this.L.d(false);
       Iterator iterator = this.W.iterator();
       while (iterator.hasNext()) {
          iterator.next().e();
       }
       return;
    }
    public final void b9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "9")) {
          return;
       }
       this.P = objArray;
       this.Q = objArray;
       this.R = objArray;
       b9.a(this.T);
       b9.a(this.V);
       b9.a(this.U);
       Iterator iterator = this.W.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public final void c9(){
       Iterator iterator;
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "12")) {
          return;
       }
       s tS = this.S;
       if (tS == null || tS.mEnableLiveExplicitGift == null) {
          b.c0(LiveLogTag.GIFT_GUIDE, "[LiveAudienceGiftGuidePresenter][showGuideGiftBottomIconIfNecessary]", "giftGuideInfo", tS);
          return;
       }else {
          Gift gift = PatchProxy.apply(objArray, this, os, "18");
          if (gift != PatchProxyResult.class) {
          }else {
             tS = this.S;
             if (tS != null) {
                LiveGiftGuideConfig mExplicitGif1 = tS.mExplicitGiftIds;
                if (mExplicitGif1 != null) {
                   iterator = mExplicitGif1.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         int i = iterator.next().intValue();
                         if (a.a(i) != null) {
                            gift = a.a(i);
                            break ;
                         }
                      }
                   }
                }
             }
             gift = objArray;
          }
          this.P = gift;
          s tS1 = this.S;
          this.R = tS1.mRecoGiftLlsid;
          this.Q = tS1.mGiftToken;
          if (gift == null || gift.mImageUrl == null) {
             LiveGiftGuideConfig mExplicitGif = tS1.mExplicitGiftIds;
             if (mExplicitGif == null) {
                mExplicitGif = Collections.emptyList();
             }
             b.e0(LiveLogTag.GIFT_GUIDE, "[LiveAudienceGiftGuidePresenter][showGuideGiftBottomIconIfNecessary]attach gift info", "list", mExplicitGif, "success", Boolean.FALSE, "explicitGift", this.P);
             return;
          }else if(this.K.Y0.r2(AudienceBizRelation.RECHARGE_ACTIVITY)){
             b.Z(LiveLogTag.GIFT_GUIDE, "[LiveAudienceGiftGuidePresenter][showGuideGiftBottomIconIfNecessary]hide bottom icon, because the RECHARGE_ACTIVITY is shown");
             return;
          }else {
             b.e0(LiveLogTag.GIFT_GUIDE, "[LiveAudienceGiftGuidePresenter][showGuideGiftBottomIconIfNecessary]attach gift info", "list", this.S.mExplicitGiftIds, "success", Boolean.TRUE, "id", Integer.valueOf(this.P.mId));
             this.L.a().e(this.P.mImageUrl);
             this.L.c(new j(this));
             this.L.e(this.R);
             if (!PatchProxy.applyVoid(objArray, this, os, "13")) {
                this.L.d(true);
                iterator = this.W.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b();
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, os, "14")) {
                this.V = this.K.b3.W().subscribe(new o(this), new a());
             }
             return;
          }
       }
    }
    public final void d9(LiveGiftOutsideConfigResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "16")) {
          return;
       }
       if (p0 == null || (this.L.f() && this.P != null)) {
          if (TextUtils.x(p0.mShowContent)) {
             this.L.a().z(false);
          }else if(j.g(p0.mGiftIdArray)){
             this.L.a().z(true);
             this.L.a().s(p0.mShowContent);
          }else if(j.c(p0.mGiftIdArray, this.P.mId)){
             this.L.a().z(true);
             this.L.a().s(p0.mShowContent);
          }else {
             this.L.a().z(false);
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new z();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, s.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(s.class, new z());
       }else {
          obj.put(s.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.q8(l.class);
       this.M = this.q8(b.class);
       this.V0 = this.q8(l.class);
       this.N = this.q8(i0$d.class);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, s.class, "4")) {
          return;
       }
       this.b9();
       return;
    }
    public void x(boolean p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, os, "2")) {
          return;
       }
       this.L.b(this.Y0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, os, "7")) {
          this.T = this.K.b3.W().subscribe(new p(this), new a());
       }
       if (!PatchProxy.applyVoid(objArray, this, os, "5")) {
          this.V0.d(this.W0);
       }
       this.K.C.u0(771, LiveGiftOutsideMessages$LiveGiftOutsideConfig.class, this.a1);
       return;
    }
}
