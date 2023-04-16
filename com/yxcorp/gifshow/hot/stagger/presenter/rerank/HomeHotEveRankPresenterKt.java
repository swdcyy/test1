package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenterKt;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import lnc.y9;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenterKt$enterTime$2;
import msd.l;
import nsd.u;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenterKt$leaveTime$2;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenterKt$coverShowCount$2;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenterKt$clickCount$2;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.z9;
import com.kwai.sdk.eve.proto.ContentType;

public final class HomeHotEveRankPresenterKt	// class@0018c7
{
    public static final n[] a;
    public static final y9 b;
    public static final y9 c;
    public static final y9 d;
    public static final y9 e;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(HomeHotEveRankPresenterKt.class, "enterTime", "getEnterTime\(Lcom/yxcorp/gifshow/entity/QPhoto;\)J", 1)),m0.j(new MutablePropertyReference1Impl(HomeHotEveRankPresenterKt.class, "leaveTime", "getLeaveTime\(Lcom/yxcorp/gifshow/entity/QPhoto;\)J", 1)),m0.j(new MutablePropertyReference1Impl(HomeHotEveRankPresenterKt.class, "coverShowCount", "getCoverShowCount\(Lcom/yxcorp/gifshow/entity/QPhoto;\)I", 1)),m0.j(new MutablePropertyReference1Impl(HomeHotEveRankPresenterKt.class, "clickCount", "getClickCount\(Lcom/yxcorp/gifshow/entity/QPhoto;\)I", 1))};
       HomeHotEveRankPresenterKt.a = onArray;
       y9 oy9 = new y9("eve", false, HomeHotEveRankPresenterKt$enterTime$2.INSTANCE, 2, null);
       HomeHotEveRankPresenterKt.b = v0;
       y9 oy91 = new y9("eve", false, HomeHotEveRankPresenterKt$leaveTime$2.INSTANCE, 2, null);
       HomeHotEveRankPresenterKt.c = v0;
       y9 oy92 = new y9("eve", false, HomeHotEveRankPresenterKt$coverShowCount$2.INSTANCE, 2, null);
       HomeHotEveRankPresenterKt.d = v0;
       y9 oy93 = new y9("eve", false, HomeHotEveRankPresenterKt$clickCount$2.INSTANCE, 2, null);
       HomeHotEveRankPresenterKt.e = v0;
    }
    public static final int a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HomeHotEveRankPresenterKt.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeHotEveRankPresenterKt.e.e(p0, HomeHotEveRankPresenterKt.a[3]).intValue();
    }
    public static final int b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HomeHotEveRankPresenterKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeHotEveRankPresenterKt.d.e(p0, HomeHotEveRankPresenterKt.a[2]).intValue();
    }
    public static final ContentType c(QPhoto p0){
       ContentType lIVE;
       Object obj = PatchProxy.applyOneRefs(p0, null, HomeHotEveRankPresenterKt.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isLiveStream()) {
          lIVE = ContentType.LIVE;
       }else if(p0.isVideoType()){
          lIVE = ContentType.PHOTO;
       }else {
          lIVE = ContentType.UNKNOWN1;
       }
       return lIVE;
    }
}
