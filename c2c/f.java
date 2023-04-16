package c2c.f;
import mx6.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import c2c.f$c;
import erd.g;
import crd.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import px6.b;
import mx6.a;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import tx6.a;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.kwai.framework.model.feed.BaseFeed;
import v5a.a$b;
import com.yxcorp.gifshow.entity.QPhoto;
import v5a.a;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import c2c.f$a;
import rx6.b;
import msd.l;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;
import java.util.Collection;
import hc6.b;
import java.util.Objects;
import rx6.d;
import nsd.u;
import c2c.f$b;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import java.lang.Boolean;
import android.view.View;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.video.player.IMediaPlayer;
import mx6.b;
import com.kwai.video.wayne.player.main.PlayerState;
import c2c.e;
import java.lang.Enum;

public class f extends PresenterV2 implements c	// class@0004fe
{
    public KwaiPlayerKitView p;
    public View q;
    public LottieAnimationView r;
    public View s;
    public ProfileBgVideoInfo t;
    public PublishSubject u;
    public BaseFragment v;
    public boolean w;

    public void f(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       this.X8();
       f tv = this.v;
       if (tv == null) {
          a.S("mFragment");
       }
       this.X7(tv.m().subscribe(new f$c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "12")) {
          return;
       }
       this.W8();
       f tp = this.p;
       if (tp == null) {
          a.S("mPlayerKitView");
       }
       tp.release();
       return;
    }
    public boolean P8(){
       return false;
    }
    public l1 R8(){
       Object[] objArray = null;
       IWaynePlayer obj = PatchProxy.apply(objArray, this, f.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.V8();
       if (obj != null) {
          obj.pause();
          objArray = l1.a;
       }
       return objArray;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, f.class, "17")) {
          return;
       }
       this.Z8(false);
       IWaynePlayer iWaynePlayer = this.V8();
       if (iWaynePlayer != null && iWaynePlayer.isPrepared() == true) {
          iWaynePlayer = this.V8();
          if (iWaynePlayer != null) {
             iWaynePlayer.start();
          }
       }
       return;
    }
    public final IWaynePlayer V8(){
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPlayerKitView");
       }
       a uoa = obj.getPlayerKitContext().e(a.class);
       if (uoa != null) {
          objArray = uoa.getPlayer();
       }
       return objArray;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, f.class, "13")) {
          return;
       }
       f tr = this.r;
       String str = "mLoadingView";
       if (tr == null) {
          a.S(str);
       }
       if (tr.p()) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          tr.f();
       }
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       tr.setVisibility(8);
       return;
    }
    public void X8(){
       f tt;
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       f tp = this.p;
       String str = "mPlayerKitView";
       if (tp == null) {
          a.S(str);
       }
       tp.c();
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       a uoa = tp.getPlayerKitContext().d(c.class);
       if (uoa != null) {
          uoa.d(this);
       }
       tp = this.t;
       String str1 = "mVideoInfo";
       if (tp == null) {
          a.S(str1);
       }
       if (tp.getUseFeedPlay()) {
          tp = this.t;
          if (tp == null) {
             a.S(str1);
          }
          if (tp.getFeed() != null) {
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             tt = this.t;
             if (tt == null) {
                a.S(str1);
             }
             BaseFeed feed = tt.getFeed();
             a.m(feed);
             QPhotoPlayerKitDataSource qPhotoPlayer = QPhotoPlayerKitDataSource.g(new a$b(new QPhoto(feed)).a());
             a.o(qPhotoPlayer, "QPhotoPlayerKitDataSourc¡­deoInfo.feed!!\)\).build\(\)\)");
             tp.g(qPhotoPlayer, new f$a());
          label_00d2 :
             IWaynePlayer iWaynePlayer = this.V8();
             if (iWaynePlayer != null) {
                iWaynePlayer.setScreenOnWhilePlaying(this.Y8());
                f tt1 = this.t;
                if (tt1 == null) {
                   a.S(str1);
                }
                tt1.checkCropParamForPlayer();
                tt1 = this.t;
                if (tt1 == null) {
                   a.S(str1);
                }
                if (!tt1.getLocalVideo()) {
                   tt1 = this.t;
                   if (tt1 == null) {
                      a.S(str1);
                   }
                   if (!tt1.getUseFeedPlay()) {
                      this.w = true;
                      iWaynePlayer.setLooping(true);
                   }
                }else {
                   tp = this.t;
                   if (tp == null) {
                      a.S(str1);
                   }
                   if (tp.getDuration() > 0) {
                      this.w = true;
                      this.a9(0);
                   }
                }
             }
          label_011f :
             tp = this.r;
             if (tp == null) {
                a.S("mLoadingView");
             }
             tp.s();
             tp = this.r;
             if (tp == null) {
                a.S("mLoadingView");
             }
             tp.setVisibility(0);
             return;
          }
       }
       CDNUrl[] uCDNUrlArray = new CDNUrl[true];
       tt = this.t;
       if (tt == null) {
          a.S(str1);
       }
       uCDNUrlArray[0] = new CDNUrl("", tt.getPath());
       ArrayList uArrayList = CollectionsKt__CollectionsKt.r(uCDNUrlArray);
       f tt2 = this.t;
       if (tt2 == null) {
          a.S(str1);
       }
       uArrayList.addAll(tt2.getExtraPaths());
       tt2 = this.p;
       if (tt2 == null) {
          a.S(str);
       }
       CDNUrl[] uCDNUrlArray1 = new CDNUrl[0];
       Object[] objArray = uArrayList.toArray(uCDNUrlArray1);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       b uob = new b(objArray, false, 0, null, 14, null);
       tt2.g(str, new f$b());
       goto label_00d2 ;
    }
    public boolean Y8(){
       return this instanceof ProfilePreviewVideoStatusPresenter;
    }
    public final void Z8(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "14")) {
          return;
       }
       uof = this.s;
       if (uof == null) {
          a.S("mLoadFailView");
       }
       int i = 0;
       int i1 = (p0)? 0: 8;
       uof.setVisibility(i1);
       uof = this.q;
       if (uof == null) {
          a.S("mShadowView");
       }
       if (!p0) {
          i = 8;
       }
       uof.setVisibility(i);
       return;
    }
    public final void a9(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "11")) {
          return;
       }
       uof = this.t;
       String str = "mVideoInfo";
       if (uof == null) {
          a.S(str);
       }
       if (!uof.getClipStart()) {
          uof = this.t;
          if (uof == null) {
             a.S(str);
          }
          long clipDuration = uof.getClipDuration();
          uof = this.t;
          if (uof == null) {
             a.S(str);
          }
          if (!clipDuration - uof.getDuration()) {
             IWaynePlayer iWaynePlayer = this.V8();
             if (iWaynePlayer != null) {
                iWaynePlayer.setLooping(true);
             }
          }else {
          label_004d :
             IWaynePlayer iWaynePlayer1 = this.V8();
             if (iWaynePlayer1 != null) {
                f tt = this.t;
                if (tt == null) {
                   a.S(str);
                }
                clipDuration = tt.getClipStart();
                f tt1 = this.t;
                if (tt1 == null) {
                   a.S(str);
                }
                long clipStart = tt1.getClipStart();
                f tt2 = this.t;
                if (tt2 == null) {
                   a.S(str);
                }
                iWaynePlayer1.setAbLoop(clipDuration, (clipStart + tt2.getClipDuration()), -1, p0);
             }
          }
       }else {
          goto label_004d ;
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.texture_view);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.texture_view\)");
       this.p = view;
       view = m1.f(p0, R.id.load_fail);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.load_fail\)");
       this.s = view;
       view = m1.f(p0, R.id.shadow_view);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.shadow_view\)");
       this.q = view;
       p0 = m1.f(p0, R.id.loading_view);
       a.o(p0, "ViewBindUtils.bindWidget\(view, R.id.loading_view\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       Object obj = this.r8("PROFILE_PREVIEW_VIDEO_INFO");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_VIDEO_INFO\)");
       this.t = obj;
       obj = this.r8("PROFILE_PREVIEW_MEDIA_PREPARED");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_MEDIA_PREPARED\)");
       this.u = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.v = obj;
       return;
    }
    public void onInfo(IMediaPlayer p0,int p1,int p2){
       b.a(this, p0, p1, p2);
    }
    public void r0(PlayerState p0){
       boolean b;
       IWaynePlayer iWaynePlayer;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       a.p(p0, "state");
       b.c(this, p0);
       int i = e.a[p0.ordinal()];
       b = false;
       if (i != 1) {
          if (i != 2 && i != 3) {
             if (i == 4) {
                this.W8();
                this.Z8(true);
                iWaynePlayer = this.V8();
                if (iWaynePlayer != null) {
                   iWaynePlayer.start();
                }
             }
          }else {
             this.W8();
             this.Z8(b);
          }
       }else {
          f tt = this.t;
          if (tt == null) {
             a.S("mVideoInfo");
          }
          IWaynePlayer iWaynePlayer1 = this.V8();
          int videoWidth = (iWaynePlayer1 != null)? iWaynePlayer1.getVideoWidth(): 0;
          tt.setVideoWidth(videoWidth);
          tt = this.t;
          if (tt == null) {
             a.S("mVideoInfo");
          }
          iWaynePlayer1 = this.V8();
          if (iWaynePlayer1 != null) {
             b = iWaynePlayer1.getVideoHeight();
          }
          tt.setVideoHeight(b);
          tt = this.u;
          if (tt == null) {
             a.S("mMediaPreparedSubject");
          }
          tt.onNext(Boolean.TRUE);
          if (this.w == null) {
             tt = this.t;
             if (tt == null) {
                a.S("mVideoInfo");
             }
             IWaynePlayer iWaynePlayer2 = this.V8();
             long duration = (iWaynePlayer2 != null)? iWaynePlayer2.getDuration(): 0;
             tt.setDuration(duration);
             tt = this.t;
             if (tt == null) {
                a.S("mVideoInfo");
             }
             tt.checkCropParamForPlayer();
             this.w = true;
             this.a9(this.P8());
          }
          iWaynePlayer = this.V8();
          if (iWaynePlayer != null) {
             iWaynePlayer.start();
          }
       }
    label_00b4 :
       return;
    }
    public void w(boolean p0){
       b.b(this, p0);
    }
}
