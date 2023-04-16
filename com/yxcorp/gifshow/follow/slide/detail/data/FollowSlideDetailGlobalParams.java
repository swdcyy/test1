package com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import im8.g;
import com.yxcorp.gifshow.detail.DetailExtendParam;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams$a;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cha.a;
import bia.j;
import bia.g;
import bia.c;
import xl8.b;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import java.lang.Boolean;
import bia.d;
import lnc.a1;
import android.app.Activity;
import wha.e;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cia.p;
import java.util.Map;
import java.util.HashMap;

public final class FollowSlideDetailGlobalParams extends DetailExtendParam implements g	// class@001101
{
    public PublishSubject mCreateTimeState;
    public final j mFollowScreenState;
    public final int mFollowVersion;
    public final a mFollowViewPagerState;
    public c mItemSelectState;
    public final d mLiveTipsEntranceState;
    public boolean mLiveTipsShow;
    public final b mPymiContainerCollapseObservableData;
    public final b mPymiContainerExpandObservableData;
    public int mPymiContainerPadding;
    public final b mPymiContainerVisibleObservableData;
    public final b mPymiTipsShowResponseObservableData;
    public g mSwipeProfileState;
    public int mViewPagerTranslationYOffset;
    public static final FollowSlideDetailGlobalParams$a Companion;
    public static final long serialVersionUID;

    static {
       FollowSlideDetailGlobalParams.Companion = new FollowSlideDetailGlobalParams$a(null);
    }
    public void FollowSlideDetailGlobalParams(GifshowActivity p0){
       a.p(p0, "activity");
       super();
       this.mFollowViewPagerState = new a(p0);
       this.mFollowScreenState = new j(p0);
       this.mSwipeProfileState = new g(p0);
       this.mItemSelectState = new c(p0);
       this.mPymiTipsShowResponseObservableData = new b(new PymiTipsShowResponse());
       Boolean fALSE = Boolean.FALSE;
       this.mPymiContainerVisibleObservableData = new b(fALSE);
       this.mPymiContainerExpandObservableData = new b(fALSE);
       this.mPymiContainerCollapseObservableData = new b(fALSE);
       this.mLiveTipsEntranceState = new d(p0);
       this.mViewPagerTranslationYOffset = e.c(p0, a1.d(0x7f070285));
       this.mPymiContainerPadding = a1.d(0x7f070fdf);
       this.mFollowVersion = 2;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.mCreateTimeState = publishSubje;
    }
    public static void getMFollowVersion$annotations(){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideDetailGlobalParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, FollowSlideDetailGlobalParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(FollowSlideDetailGlobalParams.class, new p());
       }else {
          obj.put(FollowSlideDetailGlobalParams.class, null);
       }
       return obj;
    }
}
