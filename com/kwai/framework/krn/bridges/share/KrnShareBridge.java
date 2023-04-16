package com.kwai.framework.krn.bridges.share.KrnShareBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import com.kwai.framework.krn.bridges.share.b;
import uo7.k;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.LinkInfo;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import mhc.o2;
import com.kwai.feature.api.social.message.imshare.model.IMShareLinkInfoObject;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.sharelib.jsshare.StartShareParam;
import java.lang.StringBuilder;
import ek0.d;
import com.kwai.framework.krn.bridges.share.KrnShareBridge$a;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import com.kwai.framework.krn.bridges.share.b$a;
import com.yxcorp.gifshow.share.KsShareBuilder;
import mhc.o0;
import com.kwai.framework.krn.bridges.share.a;
import com.kwai.framework.model.feed.BaseFeed;
import pj2.p;
import lnc.c3$a;
import lnc.c3;
import mhc.e0;
import m86.f;
import m86.c;
import mhc.u;
import m86.e;
import m86.b;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.utility.TextUtils;
import uo7.l;
import xo7.a;
import uo7.q;
import mhc.m2;
import uo7.b0;
import com.kwai.sharelib.a;
import uo7.u;
import gic.l;
import m86.a;
import gic.f;
import mhc.n1;
import uo7.h;
import mhc.c0;
import uo7.f0;
import com.kwai.framework.krn.bridges.share.KrnShareBridge$b;
import java.lang.CharSequence;
import com.kwai.framework.krn.bridges.share.JsKsShareResult;
import java.lang.Exception;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.Integer;
import m86.d;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;

public class KrnShareBridge extends KrnBridge	// class@0015d7
{

    public void KrnShareBridge(ReactApplicationContext p0){
       super(p0);
    }
    public static void a(KrnShareBridge p0,ReadableMap p1,Callback p2,Callback p3){
       p0.lambda$share$1(p1, p2, p3);
    }
    public static IMShareObject lambda$share$0(b p0,k p1){
       Objects.requireNonNull(p0);
       LinkInfo linkInfo = PatchProxy.applyOneRefs(p1, p0, b.class, "1");
       if (linkInfo != PatchProxyResult.class) {
       }else {
          ShareAnyResponse shareAnyResp = null;
          if (p1.r() != null && p1.r().mShareAnyData != null) {
             shareAnyResp = p1.r().mShareAnyData.mShareObject;
          }
          LinkInfo linkInfo1 = new LinkInfo();
          if (shareAnyResp != null) {
             linkInfo1.mTitle = shareAnyResp.mTitle;
             linkInfo1.mDesc = shareAnyResp.mSubTitle;
             linkInfo1.mUrl = shareAnyResp.mShareUrl;
             linkInfo1.mName = "";
             ShareAnyResponse$ShareObject mCoverUrls = shareAnyResp.mCoverUrls;
             if (mCoverUrls != null && mCoverUrls.length > 0) {
                linkInfo1.mIconUrl = mCoverUrls[0];
             }
          }
          linkInfo = linkInfo1;
       }
       return IMShareLinkInfoObject.ofShare(linkInfo, o2.j(p1));
    }
    private void lambda$share$1(ReadableMap p0,Callback p1,Callback p2){
       StartShareParam mParam1;
       KsShareBuilder ksShareBuild;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GifshowActivity gifshowActiv = (this.getCurrentActivity() instanceof GifshowActivity)? this.getCurrentActivity(): null;
       if (gifshowActiv != null && !gifshowActiv.isFinishing()) {
          if (p0 == null) {
             return;
          }else {
             Gson a = a.a;
             StartShareParam startSharePa = a.h(a.q(p0.toHashMap()), StartShareParam.class);
             if (startSharePa == null) {
                return;
             }else {
                d.e("share bridge invoked and params is :"+p0);
                StartShareParam mParam = startSharePa.mParam;
                b uob = new b(mParam, new KrnShareBridge$a(this, p1, p2));
                if (mParam.mShowSharePanel != null) {
                   mParam1 = startSharePa.mParam;
                   ksShareBuild = new KsShareBuilder(gifshowActiv, mParam1.mSubBiz, mParam1.mShareObjectId);
                   a uoa = PatchProxy.apply(null, uob, b.class, "2");
                   if (uoa != patchProxyRe) {
                   }else {
                      uoa = new a(uob, null);
                   }
                   c3.c(uoa, new p(ksShareBuild));
                   f uof = PatchProxy.apply(null, uob, b.class, "3");
                   if (uof != patchProxyRe) {
                   }else {
                      uof = new f(uob);
                   }
                   c3.c(uof, new c(ksShareBuild));
                   e uoe = PatchProxy.apply(null, uob, b.class, "4");
                   if (uoe != patchProxyRe) {
                   }else {
                      uoe = new e(uob);
                   }
                   c3.c(uoe, new b(ksShareBuild));
                }else {
                   mParam1 = startSharePa.mParam;
                   KsShareBuilder ksShareBuild1 = new KsShareBuilder(gifshowActiv, mParam1.mSubBiz, mParam1.mShareObjectId, o2.b(), null);
                }
                a uoa1 = new a(ksShareBuild.o(TextUtils.I(startSharePa.mParam.mShareResourceType)).m(startSharePa.mParam).p(TextUtils.I(startSharePa.mParam.mShareContent)).n(new a(startSharePa.mParam)).g(new m2()).a(), uob).j(new l(new a(uob), uob)).f("h5", new c0());
                if (this.disableCopyLink(startSharePa.mParam.mSubBiz)) {
                   uoa1.f("copyLink", new KrnShareBridge$b(this));
                }
                mParam1 = startSharePa.mParam;
                if (mParam1.mShowSharePanel != null) {
                   uoa1.l();
                }else if(TextUtils.x(mParam1.mActionUrl)){
                   if (!PatchProxy.applyVoidOneRefs("actionUrl is empty!", uob, b.class, "9") && uob.c != null) {
                      JsKsShareResult jsKsShareRes = new JsKsShareResult();
                      jsKsShareRes.mResult = -1;
                      try{
                         jsKsShareRes.mErrorMsg = "actionUrl is empty!";
                         uob.c.b(jsKsShareRes);
                      }catch(java.lang.Exception e11){
                         e11.printStackTrace();
                      }
                   }
                }else {
                   uoa1.c(startSharePa.mParam.mActionUrl);
                }
             }
          }
       }
    }
    public final boolean disableCopyLink(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnShareBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (("SHARE_KSCOIN_REWARD_PHOTO").equalsIgnoreCase(p0) && (SystemUtil.M(a.b(), "com.tencent.mm") || SystemUtil.M(a.b(), "com.tencent.mobileqq"))) {
          return true;
       }
       return false;
    }
    public String getName(){
       return "KSRCTBridgeShare";
    }
    public void share(int p0,ReadableMap p1,Callback p2,Callback p3){
       if (PatchProxy.isSupport(KrnShareBridge.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, KrnShareBridge.class, "1")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new d(this, p1, p2, p3));
       return;
    }
}
