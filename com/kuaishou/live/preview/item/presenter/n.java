package com.kuaishou.live.preview.item.presenter.n;
import im8.g;
import k51.c;
import lnc.a1;
import com.kuaishou.live.preview.item.presenter.n$a;
import com.kuaishou.live.preview.item.presenter.n$b;
import com.kuaishou.live.preview.item.presenter.n$c;
import com.kuaishou.live.preview.item.presenter.n$d;
import com.kuaishou.live.preview.item.presenter.n$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.autoplay.live.g;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import vy6.a;
import ll3.q;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.live.preview.item.presenter.m;
import erd.r;
import dl3.u;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Collection;
import ekd.q;
import java.util.List;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.kuaishou.android.live.model.AdaptationSet;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import android.view.ViewGroup;
import java.lang.System;
import u53.b;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCameraFaceDataMessage;
import com.kwai.video.waynelive.LivePlayerController;
import android.graphics.SurfaceTexture;
import java.lang.Boolean;
import com.kuaishou.android.live.model.QLivePlayConfig$Stat;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Number;
import java.util.Iterator;
import com.kuaishou.android.live.model.AdaptationUrl;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.Set;
import java.util.Map$Entry;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rl3.a;
import k2b.u1;
import android.util.Pair;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.widget.FrameLayout;
import com.kuaishou.live.preview.item.presenter.n$f;
import android.view.ViewOutlineProvider;
import com.kuaishou.live.preview.item.presenter.n$g;
import android.view.TextureView$SurfaceTextureListener;
import java.lang.Math;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import dl3.w;
import cl3.m;

public class n extends c implements g	// class@000e39
{
    public int A;
    public List B;
    public boolean C;
    public float D;
    public int E;
    public long F;
    public boolean G;
    public LiveFlvStream$LiveCameraFaceDataMessage H;
    public n$h I;
    public final LiveAutoPlay$b J;
    public final IKwaiMediaPlayer$OnLiveInterActiveListener K;
    public final a L;
    public final LiveAutoPlay$d M;
    public QPhoto p;
    public BaseFragment q;
    public g r;
    public m s;
    public ViewStub t;
    public ViewGroup u;
    public ViewGroup v;
    public LivePlayTextureView w;
    public Pair x;
    public SurfaceTexture y;
    public boolean z;
    public static final int N;
    public static final int O;
    public static final int P;

    static {
       n.N = a1.e(100.00f);
       n.O = a1.e(160.00f);
       n.P = a1.e(50.00f);
    }
    public void n(){
       super();
       this.C = false;
       this.D = 0;
       this.E = 0;
       this.I = new n$a(this);
       this.J = new n$b(this);
       this.K = new n$c(this);
       this.L = new n$d(this);
       this.M = new n$e(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       boolean b = a.t().d("SimplifiedGameLivestreamCaremaNew", false);
       boolean b1 = a.t().d("liveMateMobileLiveStreamCamera", false);
       Object[] objArray = new Object[false];
       a.C().s("LiveSimplePlayGzoneCameraPresenter", "onBind\(\) showFace£º"+b+" mobile:"+b1, objArray);
       if (b && (!b1 && (!this.V8() && Build$VERSION.SDK_INT >= 23))) {
          this.r.b0(true);
          this.r.O(this.M);
          q.a(this.q, this.L);
          this.X7(this.q.m().filter(m.b).subscribe(new u(this), Functions.d()));
       }
    label_0086 :
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "14")) {
          return;
       }
       if (!q.f(this.B)) {
          this.B.clear();
          this.B = objArray;
       }
       this.G = false;
       q.b(this.q, this.L);
       this.r.Y(this.M);
       k1.n(this);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, n.class, "13")) {
          return;
       }
       QPhoto mEntity = this.p.mEntity;
       LiveStreamFeed mConfig = mEntity.mConfig;
       if (mConfig != null && (!q.f(mConfig.mLiveAdaptiveManifests) && mEntity.mConfig.mLiveAdaptiveManifests.get(0).mAdaptationSet != null)) {
          this.B = mEntity.mConfig.mLiveAdaptiveManifests.get(0).mAdaptationSet.mRepresentation;
       }
    label_003d :
       return;
    }
    public Map R8(){
       HashMap obj = PatchProxy.apply(null, this, n.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       String str = "1";
       String str1 = (this.C != null)? str: "0";
       obj.put("is_author_camera_open", str1);
       n tu = this.u;
       str1 = (tu != null && tu.getVisibility() != 8)? str: "0";
       obj.put("is_author_camera_show", str1);
       obj.put("camera_ratio", String.valueOf(this.D));
       obj.put("camera_play_definition", String.valueOf(this.E));
       long l = 0;
       if (this.F - l) {
          l = System.currentTimeMillis() - this.F;
       }
       obj.put("outside_live_stay_length", String.valueOf(l));
       if (!b.f(this.p.mEntity.mConfig)) {
          str = "0";
       }
       obj.put("is_game_live", str);
       tu = this.H;
       if (tu != null) {
          obj.put("author_camera_type", String.valueOf(tu.type));
       }
       return obj;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       n tu = this.u;
       if (tu != null) {
          tu.setVisibility(8);
          if (this.r.Q() != null) {
             this.r.Q().setExtSurfaceTexture(null);
          }
       }
       return;
    }
    public final boolean V8(){
       QPhoto obj = PatchProxy.apply(null, this, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p.mEntity;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       QLivePlayConfig mStat = obj.mConfig.mStat;
       if (mStat != null && (TextUtils.n("ANDROID_LIVE_MATE", mStat.mClientId) || TextUtils.n("IPHONE_LIVE_MATE", mStat.mClientId))) {
          b = true;
       }
       return b;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, n.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.r.Q() != null) {
          return this.r.Q().isSideBySideStream();
       }
       return false;
    }
    public final boolean X8(){
       LiveQualityItem obj1;
       int i;
       AdaptationUrl mLevel;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object[] objArray = null;
       LiveQualityItem obj = PatchProxy.apply(objArray, this, on, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       String str = "]";
       if (this.r.Q() != null) {
          int currentLiveM = this.r.Q().getCurrentLiveManifestRepId();
          if (PatchProxy.isSupport(on)) {
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(currentLiveM), this, on, "11");
             if (obj1 != patchProxyRe) {
                currentLiveM = obj1.intValue();
             }else if(q.f(this.B)){
                this.P8();
             }
             if (!q.f(this.B)) {
                Iterator iterator1 = this.B.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      AdaptationUrl uAdaptationU = iterator1.next();
                      if (!uAdaptationU.mId - (long)currentLiveM) {
                         mLevel = uAdaptationU.mLevel;
                      }
                   }
                }
                return 1;
             }
             mLevel = 0;
          }else {
             goto label_0044 ;
          }
          Object[] objArray1 = new Object[0];
          a.C().s("LiveSimplePlayGzoneCameraPresenter", "currentQualityLevel = ["+currentLiveM+str, objArray1);
          if (!currentLiveM && this.B == null) {
             obj1 = this.r.Q().getCurrentLiveQualityItem().mLevel;
             if (obj1 > null) {
                obj = obj1;
             }
          }
       }else {
          mLevel = 0;
       }
    label_00a8 :
       this.E = obj;
       AdaptationUrl obj2 = PatchProxy.apply(objArray, this, on, "12");
       if (obj2 != patchProxyRe) {
          i = obj2.intValue();
       }else if(q.f(this.B)){
          this.P8();
       }
       if (!q.f(this.B)) {
          Iterator iterator = this.B.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj2 = iterator.next();
                if (("STANDARD").equals(obj2.mQualityType)) {
                   i = obj2.mLevel;
                }else {
                   continue ;
                }
             }
          }
       }
       i = 30;
       int i1 = a.t().a("SimplifiedGameLivestreamDefinitionNew", 1);
       Object[] objArray2 = new Object[0];
       a.C().s("LiveSimplePlayGzoneCameraPresenter", "definition ab = ["+i1+str, objArray2);
       if (i1 == 1 && obj > i) {
          goto label_0119 ;
       }else if(i1 == 2 && obj >= i){
          return 1;
       }else {
          return 0;
       }
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, n.class, "16")) {
          return;
       }
       if (this.G == null) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUTHOR_CAMERA_PICURE_LEAVE";
       i3 oi3 = i3.f();
       Iterator iterator = this.R8().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          oi3.d(key, uEntry.getValue());
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = a.a(this.p.mEntity, 1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, n.class, "15")) {
          return;
       }
       if (this.G != null) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUTHOR_CAMERA_PICURE";
       i3 oi3 = i3.f();
       Iterator iterator = this.R8().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          oi3.d(key, uEntry.getValue());
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = a.a(this.p.mEntity, 1);
       u1.u0(3, uElementPack, uContentPack);
       this.G = true;
       return;
    }
    public void a9(LiveFlvStream$LiveCameraFaceDataMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "4")) {
          return;
       }
       LiveFlvStream$LiveCameraFaceDataMessage showFace = p0.showFace;
       this.C = showFace;
       if (showFace != null && (this.z != null && (this.x != null && (!this.X8() || this.W8())))) {
          this.S8();
          return;
       }else {
          float f = (float)this.x.first.intValue();
          float f1 = p0.facePositionLeft * f;
          float f2 = (float)this.x.second.intValue();
          float f3 = p0.facePositionTop * f2;
          f = (f * p0.facePositionRight) - f1;
          f2 = (f2 * p0.facePositionBottom) - f3;
          float f4 = f / f2;
          this.D = f4;
          if (this.u == null) {
             ViewGroup viewGroup = this.t.inflate();
             this.u = viewGroup;
             this.w = viewGroup.findViewById(0x7f0a258b);
             this.b9(this.D);
             if (Build$VERSION.SDK_INT > 21) {
                this.w.setClipToOutline(true);
                this.w.setOutlineProvider(new n$f(this, a1.d(R.dimen.arg_RES_7f07042b)));
             }
             this.w.a(new n$g(this));
          }else {
             this.b9(f4);
          }
          if (this.u.getVisibility() == -0.00f) {
             this.u.setVisibility(0);
             if (this.r.Q() != null && this.y != null) {
                this.r.Q().setExtSurfaceTexture(this.y);
             }
          }
          if (this.r.Q() != null) {
             this.r.Q().setExtSurfaceCrop((int)Math.ceil((double)f1), (int)Math.ceil((double)f3), (int)Math.floor((double)f), (int)Math.floor((double)f2));
          }
          this.Z8();
          return;
       }
    }
    public final void b9(float p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, on, "8")) {
          return;
       }
       on = this.A;
       int i = (int)(p0 * (float)on);
       ConstraintLayout$LayoutParams layoutParams = this.w.getLayoutParams();
       if (layoutParams.width != i) {
          layoutParams.width = i;
          layoutParams.height = on;
          this.w.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a258c);
       this.v = m1.f(p0, 0x7f0a25a0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(n.class, new w());
       }else {
          obj.put(n.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.q = this.r8("DETAIL_FRAGMENT");
       this.p = this.q8(QPhoto.class);
       this.r = this.r8("LIVE_SIMPLE_PLAY_MODULE");
       this.s = this.r8("LIVE_PREVIEW_PLAY_VIEW_SERVICE");
       return;
    }
}
