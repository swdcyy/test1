package com.kuaishou.live.preview.item.presenter.k;
import dk3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.kuaishou.android.live.model.LiveStreamModel;
import rl3.c;
import brd.t;
import jl3.b;
import dl3.r;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import dl3.s;
import wk3.b;
import wk3.a;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$TextInfo;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$ReasonTextInfo;
import com.kuaishou.live.preview.item.model.CardItemModel.LivePreviewCoverWidgetTypeParam;
import com.kuaishou.live.preview.item.model.CardItemModel.LivePreviewRequestFeedInfoParam;
import com.yxcorp.gifshow.entity.QPhoto;
import zk.d;
import com.google.gson.Gson;
import ck3.q;
import ok.x;
import com.kwai.framework.model.user.QCurrentUser;
import cjd.e;
import erd.o;
import dl3.t;
import com.kuaishou.live.preview.item.presenter.k$a;
import io.reactivex.subjects.PublishSubject;

public class k extends b	// class@000e2d
{
    public LiveStreamModel A;
    public PublishSubject B;
    public PublishSubject C;
    public PublishSubject D;
    public b E;
    public b F;
    public boolean G;
    public boolean H;
    public b y;
    public QPhoto z;

    public void k(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       super.E8();
       if (this.A.getLiveCoverWidgetModel(1) == null) {
          c.a("original LiveStreamModel\'s mCoverWidgets is empty !");
          return;
       }else {
          this.X7(this.y.c().distinctUntilChanged().subscribe(new r(this), Functions.e));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "7")) {
          return;
       }
       super.J8();
       this.W8();
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, k.class, "10")) {
          return;
       }
       this.H = false;
       b9.a(this.F);
       b9.a(this.E);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, k.class, "9")) {
          return;
       }
       b9.a(this.E);
       this.E = t.timer(this.A.mLiveCoverWidgetUpdateIntervalMills, TimeUnit.MILLISECONDS).subscribe(new s(this));
       return;
    }
    public void Y4(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       a.d(this);
       int i = 1;
       if (this.A.getLiveCoverWidgetModel(i) == null) {
          c.a("original LiveStreamModel or mCoverWidgets is empty !");
       }else {
          this.G = i;
          this.Y8(this.A, false);
       }
       return;
    }
    public final void Y8(LiveStreamModel p0,boolean p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ok, "8")) {
          return;
       }
       this.H = true;
       ArrayList uArrayList = new ArrayList();
       LiveCoverWidgetModel liveCoverWid = p0.getLiveCoverWidgetModel(true);
       LiveCoverWidgetModel mTextInfo = liveCoverWid.mTextInfo;
       LiveCoverWidgetModel$ReasonTextInfo reasonTextIn = null;
       LiveCoverWidgetModel$TextInfo mTextType = (mTextInfo != null)? mTextInfo.mTextType: 0;
       LiveCoverWidgetModel mReasonTextI = liveCoverWid.mReasonTextInfo;
       if (mReasonTextI != null) {
          reasonTextIn = mReasonTextI.mTextType;
       }
       LivePreviewRequestFeedInfoParam livePreviewR = new LivePreviewRequestFeedInfoParam(p0.mLiveStreamId, this.z.getUserId(), this.z.getExpTag(), p0.mFeedDispatchTimestampMs, p1, new LivePreviewCoverWidgetTypeParam(liveCoverWid.mType, liveCoverWid.mLiveIconType, mTextType, reasonTextIn));
       uArrayList.add(liveCoverWid);
       d uod = new d();
       uod.c();
       b9.a(this.F);
       this.F = q.a.get().a(QCurrentUser.me().getId(), uod.b().q(uArrayList)).map(new e()).subscribe(new t(this, p0), new k$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       super.j8();
       this.y = this.r8("LIVE_PLAY_STATE");
       this.z = this.q8(QPhoto.class);
       this.A = this.q8(LiveStreamModel.class);
       this.B = this.r8("LIVE_LIVING_LABEL_PUBLISHER");
       this.C = this.r8("LIVE_PREVIEW_PENDANT_PUBLISHER");
       this.D = this.r8("LIVE_PREVIEW_GENERAL_ENTRY_PUBLISHER");
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       a.b(this);
       this.W8();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       a.c(this);
       if (this.G != null && this.H == null) {
          this.Y8(this.A, false);
       }
       return;
    }
    public void t7(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       a.f(this);
       this.G = false;
       this.W8();
       return;
    }
}
