package f72.o;
import im8.g;
import k51.c;
import f72.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f72.o$a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xl8.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.kwai.feature.api.live.base.model.LiveStyleParams$a;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import java.lang.Number;
import android.graphics.Rect;
import xa5.a;
import uh5.e;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import foc.p;
import android.graphics.Bitmap;
import foc.z;
import tkd.b;
import tkd.d;
import os5.l;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import os5.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import im8.f;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import wkd.b;
import l66.a;
import dda.d;
import m66.a;
import k2b.e0;
import za2.x;
import ekd.m1;
import f72.r;
import java.util.Map;
import java.util.HashMap;

public class o extends c implements g	// class@0028d5
{
    public o$b A;
    public QPhoto p;
    public f q;
    public RecyclerFragment r;
    public LiveDoubleListParam s;
    public PublishSubject t;
    public PublishSubject u;
    public LiveAutoPlayModule v;
    public View w;
    public b x;
    public Boolean y;
    public String z;
    public static String sLivePresenterClassName = "LiveDoubleListFeedClickPresenter";

    public void o(){
       super();
       this.A = new n(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       this.m8().setOnClickListener(new o$a(this, true));
       return;
    }
    public final boolean P8(){
       o obj = PatchProxy.apply(null, this, o.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       boolean b = (obj != null && obj.a().booleanValue())? true: false;
       return b;
    }
    public final void R8(LiveStreamFeed p0,String p1){
       String str;
       int b;
       LiveAudienceParam$a obj;
       int i;
       Rect rect1;
       o oo = o.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oo, "5")) {
          return;
       }
       i oi = this.r.q();
       Object[] objArray = null;
       if (oi != null) {
          str = f.b(this.r);
          b.g(j.b(oi, str, SlideMediaType.LIVE));
       }else {
          str = objArray;
       }
       o oo1 = -1492894991;
       if (!TextUtils.x(str) && !r1.l1(this.p.mEntity)) {
          if (!PatchProxy.applyVoidTwoRefs(p1, str, this, oo, "7")) {
             LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
             uob.C(this.p);
             b = true;
             uob.d(b);
             uob.f(b);
             if (this.s.mType == 4) {
                uob.F(str);
                uob.o(94);
             }else {
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(this.p);
                uob.w(uArrayList);
                uob.n(52);
                uob.o(52);
                uob.v("/rest/n/live/feed/double/hotPage/slide/more");
             }
             if (this.y.booleanValue() && (this.v.isPlaying() && !TextUtils.x(this.z))) {
                LiveStyleParams$a uoa = new LiveStyleParams$a();
                uoa.d(b);
                uoa.c(b);
                uob.x(this.z);
                uob.r(uoa.a());
                obj = PatchProxy.apply(objArray, this, oo, "8");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else if(this.r.getView() != null){
                   Rect rect = new Rect();
                   this.r.getView().getGlobalVisibleRect(rect);
                   if (a.g(this.r)) {
                      rect.bottom = rect.bottom - e.c();
                   }
                   rect1 = rect;
                }else {
                   rect1 = objArray;
                }
                oo = this.w;
                boolean b1 = (oo != null && !oo.getVisibility())? true: false;
                int[] ointArray = new int[2];
                if (this.P8()) {
                   objArray = this.k8(R.id.live_surface);
                }
                if (objArray != null) {
                   objArray.getLocationOnScreen(ointArray);
                }
                if (this.P8()) {
                   i = p.u(this.getActivity(), this.w, rect1, b1, ointArray);
                }else {
                   i = z.u(this.getActivity(), this.w, rect1, b1, ointArray, null);
                }
                uob.B = i;
             }else if(d.a(oo1).Hy() && (!d.a(oo1).Du() && this.p.isLiveStream())){
                LiveBizParam liveBizParam = new LiveBizParam();
                d.a(oo1).Fv(liveBizParam, this.p.mEntity);
                liveBizParam = liveBizParam.mPlayerReuseToken;
                this.z = liveBizParam;
                uob.x(liveBizParam);
             }
             if (!TextUtils.x(p1)) {
                obj = new LiveAudienceParam$a();
                obj.o(p1);
                LiveAudienceParam liveAudience = obj.a();
                uob.k(this.p.getUserId(), liveAudience.mInternalJumpSchema);
             }
             d.a(-1835681758).b1(this.getActivity(), uob.a());
          }
       }else if(PatchProxy.applyVoidTwoRefs(p0, p1, this, oo, "6")){
          Activity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             b = 88;
             LiveAudienceParam$a uoa1 = new LiveAudienceParam$a();
             if (!TextUtils.x(p1)) {
                uoa1.o(p1);
             }
             uoa1.j(p0);
             uoa1.g(d.a(oo1).KL(b));
             uoa1.d(this.q.get().intValue());
             uoa1.k = 12;
             d.a(oo1).wV(activity, uoa1.a(), 1025);
          }
       }
       return;
    }
    public void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "4")) {
          return;
       }
       if (!this.r.isResumed()) {
          return;
       }
       QPhoto mEntity = this.p.mEntity;
       if (!mEntity instanceof LiveStreamFeed) {
          return;
       }
       if (mEntity.mConfig == null) {
          return;
       }
       this.R8(mEntity, p0);
       o tt = this.t;
       if (tt != null) {
          tt.onNext(Boolean.TRUE);
       }
       this.u.onNext(Boolean.TRUE);
       b.a(0x6d2a4fdd).b(new d(mEntity));
       x.d(mEntity, this.r);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a1c85);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(o.class, new r());
       }else {
          obj.put(o.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.x8("ADAPTER_POSITION");
       this.r = this.r8("FRAGMENT");
       this.s = this.r8("LIVE_EXPLORE_PARAM");
       this.t = this.t8("LIVE_CLICK_SUBJECT");
       this.u = this.r8("FRAGMENT_CLICK_SUBJECT");
       this.v = this.r8("AUTO_PLAY_LIVE_MODULE");
       this.x = this.t8("SHOULD_CACHE_LIVE_PLAYER_CONTROLLER");
       this.z = this.t8("PLAYER_REUSE_SESSION_ID");
       this.y = this.r8("ENABLE_AUTO_PLAY");
       return;
    }
}
