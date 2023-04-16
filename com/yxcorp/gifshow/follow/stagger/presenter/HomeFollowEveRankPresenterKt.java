package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenterKt;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import lnc.y9;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenterKt$enterTime$2;
import msd.l;
import nsd.u;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenterKt$leaveTime$2;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.sdk.eve.proto.ContentType;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HomeFollowEveRankPresenterKt	// class@0011f4
{
    public static final n[] a;
    public static final y9 b;
    public static final y9 c;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(HomeFollowEveRankPresenterKt.class, "enterTime", "getEnterTime\(Lcom/yxcorp/gifshow/entity/QPhoto;\)J", 1)),m0.j(new MutablePropertyReference1Impl(HomeFollowEveRankPresenterKt.class, "leaveTime", "getLeaveTime\(Lcom/yxcorp/gifshow/entity/QPhoto;\)J", 1))};
       HomeFollowEveRankPresenterKt.a = onArray;
       y9 oy9 = new y9("eve", false, HomeFollowEveRankPresenterKt$enterTime$2.INSTANCE, 2, null);
       HomeFollowEveRankPresenterKt.b = v0;
       y9 oy91 = new y9("eve", false, HomeFollowEveRankPresenterKt$leaveTime$2.INSTANCE, 2, null);
       HomeFollowEveRankPresenterKt.c = v0;
    }
    public static final ContentType a(QPhoto p0){
       ContentType lIVE;
       Object obj = PatchProxy.applyOneRefs(p0, null, HomeFollowEveRankPresenterKt.class, "5");
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
