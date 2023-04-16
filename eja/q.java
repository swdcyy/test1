package eja.q;
import im8.g;
import com.smile.gifmaker.mvps.presenter.a;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x99.s0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import lv5.c;
import lv5.b;
import tm5.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import java.lang.Boolean;
import java.util.Objects;
import qrd.p;
import xia.n;
import com.yxcorp.gifshow.model.LivePlayConfig;
import xia.h;
import xf6.i;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.entity.QPhoto;
import z99.c;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import u99.d;
import android.view.ViewStub;
import android.view.View;
import com.yxcorp.utility.n;
import ekd.m1;
import com.kwai.library.widget.textview.AdjustSizeTextView;
import eja.t;
import java.util.Map;
import java.util.HashMap;

public class q extends a implements g	// class@0026ee
{
    public LivePlayConfig r;
    public QPhoto s;
    public PhotoItemViewParam t;
    public Boolean u;
    public View v;
    public AdjustSizeTextView w;

    public void q(CardStyle p0){
       boolean b;
       super();
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "3")) {
       }else {
          this.U7(new s0());
          this.U7(d.a(-242212848).nm(p0));
          if (!CardStyle.isFollowCardStyle(p0.mBottomType)) {
             this.U7(d.a(0x2bcad739).QL(p0));
          }
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, q.class, "4")) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, q.class, "5");
          if (presenterV2 != patchProxyRe) {
          }else {
             presenterV2 = new PresenterV2();
             FollowConfigUtil obj = PatchProxy.apply(objArray, objArray, FollowConfigUtil.class, "45");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                obj = FollowConfigUtil.z;
                Objects.requireNonNull(obj);
                Boolean uBoolean = PatchProxy.apply(objArray, obj, FollowConfigUtil.class, "1");
                if (uBoolean == patchProxyRe) {
                   uBoolean = FollowConfigUtil.a.getValue();
                }
                b = uBoolean.booleanValue();
             }
             if (b) {
                presenterV2.U7(new n());
             }
             if (FollowConfigUtil.o() != null && FollowConfigUtil.o().mStrategy == 2) {
                presenterV2.U7(new h());
             }
             PatchProxy.onMethodExit(q.class, "5");
          }
          if (presenterV2 != null) {
             this.U7(presenterV2);
          }
       }
       return;
    }
    public void E8(){
       boolean b1;
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "6")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(objArray, this, oq, "9");
       boolean b = false;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          int i = i.d();
          if (i == 1) {
             b = true;
          }else if(i == 2){
             if (b.a(-404437045).g()) {
                Object obj1 = PatchProxy.apply(objArray, this, oq, "8");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else if(this.t.mPage == 16 && a.t().d("enableFollowLiveAutoPlay", b)){
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (b1) {
                label_0063 :
                   b = c.c(this.s, this.r);
                }
             }else {
                goto label_0063 ;
             }
          }
       }
       this.u = Boolean.valueOf(b);
       d.g("FollowLiveCoverAnnexLazyGroupPresenter", "onBind", r1.V1(this.s.mEntity)+" enableAutoPlay", String.valueOf(this.u));
       if (this.u.booleanValue()) {
          oq = this.v;
          if (oq instanceof ViewStub) {
             oq.setLayoutResource(R.layout.arg_RES_7f0d05de);
             this.v = this.v.inflate();
          }
          this.P8(true);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "7")) {
          return;
       }
       View[] viewArray = new View[]{this.w};
       n.Z(8, viewArray);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a30e5);
       this.w = m1.f(p0, 0x7f0a3bd9);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, q.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(q.class, new t());
       }else {
          obj.put(q.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.r = this.t8("HOME_LIVE_PLAY_CONFIG");
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("FEED_ITEM_VIEW_PARAM");
       return;
    }
}
