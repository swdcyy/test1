package com.kuaishou.live.lite.anchorinfo.recommendtag.f;
import yh3.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import xp5.i;
import e93.b;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Object;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.kuaishou.live.lite.anchorinfo.recommendtag.e;
import erd.o;
import t45.d;
import brd.z;
import u83.h;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import ekd.k1;
import lnc.b9;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag;
import com.kuaishou.live.lite.anchorinfo.recommendtag.LiveFollowTagType;
import com.kuaishou.live.lite.anchorinfo.recommendtag.d;
import com.kuaishou.live.lite.anchorinfo.recommendtag.d$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import u83.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import com.kuaishou.live.lite.anchorinfo.recommendtag.d$a;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import java.util.HashMap;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$TextInfo;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.util.Map;
import va3.a;

public class f extends a	// class@001e77
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final LiveStreamModel c;
    public final LiveStreamFeed d;
    public final User e;
    public final b f;
    public final i g;
    public final b h;

    public void f(User p0,LiveStreamModel p1,LiveStreamFeed p2,i p3,b p4){
       super();
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.a = mutableLiveD;
       this.b = new MutableLiveData();
       b.Z(LiveLiteLogTag.LITE_ANCHOR_INFO, "recoReason-vm-create");
       this.e = p0;
       this.c = p1;
       this.d = p2;
       this.g = p3;
       this.h = p4;
       mutableLiveD.setValue(p1.mCoverReasonTag);
       this.u0(p0);
       this.f = p0.observable().distinctUntilChanged(e.b).observeOn(d.a).subscribe(new h(this));
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.onCleared();
       b.Z(LiveLiteLogTag.LITE_ANCHOR_INFO, "recoReason-vm-onCleared");
       k1.n(this);
       b9.a(this.f);
       return;
    }
    public final void u0(User p0){
       boolean b;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "2")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_ANCHOR_INFO, "reco follow "+p0.isFollowingOrFollowRequesting());
       LiveStreamModel mCoverReason = this.c.mCoverReasonTag;
       Object obj = PatchProxy.applyOneRefs(mCoverReason, this, uof, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(mCoverReason != null && LiveFollowTagType.isFollowTags(mCoverReason.mTagType)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          this.b.setValue(Boolean.valueOf(p0.isFollowingOrFollowRequesting()));
       }
       return;
    }
    public void v0(d p0){
       ClientContent$LiveStreamPackage liveStreamPa;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       LiveStreamModel mCoverReason = this.c.mCoverReasonTag;
       String str = "";
       String str1 = (mCoverReason == null)? str: String.valueOf(mCoverReason.mTagType);
       LiveStreamModel mCoverReason1 = this.c.mCoverReasonTag;
       if (mCoverReason1 != null) {
          str = mCoverReason1.mExtraInfo;
       }
       String str2 = "extra_info";
       String str3 = "tag_type";
       if (p0 instanceof d$b) {
          liveStreamPa = this.g.a();
          if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, str1, str, null, g.class, "1")) {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_LITE_RECO_REASON_TAG";
             i3 oi3 = i3.f();
             oi3.d(str3, TextUtils.k(str1));
             oi3.d(str2, TextUtils.k(str));
             uElementPack.params = oi3.e();
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack));
          }
       }else if(p0 instanceof d$a){
          liveStreamPa = this.g.a();
          if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, str1, str, null, g.class, "2")) {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_LITE_RECO_REASON_TAG";
             i3 oi31 = i3.f();
             oi31.d(str3, TextUtils.k(str1));
             oi31.d(str2, TextUtils.k(str));
             uElementPack.params = oi31.e();
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setIsRealTime(false));
          }
          HashMap hashMap = new HashMap();
          LiveStreamModel mCoverReason2 = this.c.mCoverReasonTag;
          if (mCoverReason2 != null) {
             LiveSimpleCoverReasonTag mTextInfo = mCoverReason2.mTextInfo;
             if (mTextInfo != null) {
                hashMap.put("recoReasonContent", mTextInfo.mContent);
             }
          }
          a.b(this.g.getPage(), this.d, this.g.c0(), "OTHER", this.g.a(), hashMap);
          this.h.qc(null, false);
       }
       return;
    }
}
