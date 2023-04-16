package com.yxcorp.gifshow.share.platform.b;
import com.yxcorp.gifshow.share.platform.WechatForward;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import java.io.File;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.share.KwaiOperator;
import android.content.Context;
import com.yxcorp.gifshow.share.KwaiOperator$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.platform.WechatForward$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yic.m;
import java.util.Objects;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import java.lang.Boolean;
import java.lang.Integer;
import android.net.Uri;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import pic.f;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import wkd.b;
import mhc.y;
import mhc.f2;
import java.io.FileInputStream;
import java.io.InputStream;
import qkd.c;
import qrd.l1;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import mhc.x;
import brd.t;
import com.yxcorp.gifshow.share.platform.b$a;
import io.reactivex.g;
import com.yxcorp.gifshow.share.platform.b$b;

public final class b	// class@001c26
{

    static {
    }
    public static WXMediaMessage a(WechatForward p0,OperationModel p1){
       boolean b;
       a.p(p1, "model");
       WXImageObject wXImageObjec = new WXImageObject();
       File uFile = p1.l();
       if (uFile != null) {
          BitmapUtil.K(uFile, 0xa00000);
          Context uContext = KwaiOperator.q.b();
          String str = PatchProxy.applyThreeRefs(p0, uFile, uContext, null, WechatForward$a.class, "5");
          if (str != PatchProxyResult.class) {
          }else if(m.a()){
             WechatForward$Companion n0 = WechatForward.n0;
             Objects.requireNonNull(n0);
             Object obj = PatchProxy.apply(null, n0, WechatForward$Companion.class, "6");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                Integer integer = n0.g();
                a.m(integer);
                b = (integer.intValue() >= 0x27000d00)? true: false;
             }
             if (b) {
                str = m.c(uFile, uContext, "com.tencent.mm").toString();
             }
          }
          str = uFile.getAbsolutePath();
          wXImageObjec.imagePath = str;
       }
       WXMediaMessage wXMediaMessa = new WXMediaMessage(wXImageObjec);
       SharePlatformData$ShareConfig shareConfig = p0.e0(p1);
       wXMediaMessa.title = f.a(shareConfig.mTitle, 500);
       wXMediaMessa.description = f.a(shareConfig.mSubTitle, 1000);
       wXMediaMessa.thumbData = WechatForward$a.b(p0, p1.d());
       return wXMediaMessa;
    }
    public static WXMediaMessage b(WechatForward p0,OperationModel p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       WechatForward$a uoa = WechatForward$a.class;
       a.p(p1, "model");
       SharePlatformData$ShareConfig shareConfig = p0.e0(p1);
       Object obj = null;
       WXMiniProgramObject wXMiniProgra = PatchProxy.applyTwoRefs(p0, shareConfig, obj, uoa, "8");
       if (wXMiniProgra != patchProxyRe) {
       }else {
          wXMiniProgra = new WXMiniProgramObject();
          wXMiniProgra.webpageUrl = shareConfig.mShareUrl;
          wXMiniProgra.userName = shareConfig.mAppId;
          wXMiniProgra.path = shareConfig.mSharePath;
          f2 obj2 = b.a(0x91df3e4);
          a.o(obj2, "Singleton.get\(ForwardService::class.java\)");
          obj2 = obj2.a();
          a.o(obj2, "Singleton.get\(ForwardSer¡­::class.java\).shareConfig");
          int i = (obj2.e())? 2: 0;
          wXMiniProgra.miniprogramType = i;
       }
       WXMediaMessage wXMediaMessa = new WXMediaMessage(wXMiniProgra);
       wXMediaMessa.title = f.a(shareConfig.mTitle, 500);
       wXMediaMessa.description = f.a(shareConfig.mSubTitle, 1000);
       File uFile = p1.d();
       Object obj1 = PatchProxy.applyTwoRefs(p0, uFile, obj, uoa, "4");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else if(uFile == null || !uFile.exists()){
          BitmapUtil.K(uFile, 0x20000);
          obj = c.q(new FileInputStream(uFile));
       }
       wXMediaMessa.thumbData = obj;
       return wXMediaMessa;
    }
    public static WXMediaMessage c(WechatForward p0,OperationModel p1){
       a.p(p1, "model");
       return p0.a0(p1);
    }
    public static WXMediaMessage d(WechatForward p0,OperationModel p1){
       a.p(p1, "model");
       WXImageObject wXImageObjec = new WXImageObject();
       File uFile = p1.l();
       String absolutePath = (uFile != null)? uFile.getAbsolutePath(): null;
       wXImageObjec.imagePath = absolutePath;
       WXMediaMessage wXMediaMessa = new WXMediaMessage(wXImageObjec);
       wXMediaMessa.thumbData = WechatForward$a.b(p0, p1.l());
       return wXMediaMessa;
    }
    public static WXMediaMessage e(WechatForward p0,OperationModel p1){
       a.p(p1, "model");
       SharePlatformData$ShareConfig shareConfig = p0.e0(p1);
       SharePlatformData$ShareConfig mH5MaxTitleL = shareConfig.mH5MaxTitleLength;
       WXTextObject wXTextObject = new WXTextObject();
       String str = (mH5MaxTitleL <= null)? shareConfig.mTitle+shareConfig.mShareUrl: TextUtils.b(shareConfig.mTitle, mH5MaxTitleL, "...")+10+shareConfig.mShareUrl;
       wXTextObject.text = str;
       WXMediaMessage wXMediaMessa = new WXMediaMessage(wXTextObject);
       wXMediaMessa.title = f.a(shareConfig.mTitle, 500);
       wXMediaMessa.description = f.a(shareConfig.mTitle, 1000);
       return wXMediaMessa;
    }
    public static WXMediaMessage f(WechatForward p0,OperationModel p1,ShareToken p2){
       a.p(p1, "model");
       a.p(p2, "token");
       String str = TextUtils.k(p2.mShareMessage)+"\n"+p2.mDownloadMessage;
       WXTextObject wXTextObject = new WXTextObject();
       wXTextObject.text = str;
       WXMediaMessage wXMediaMessa = new WXMediaMessage(wXTextObject);
       wXMediaMessa.title = f.a(p0.e0(p1).mTitle, 500);
       wXMediaMessa.description = f.a(str, 1000);
       return wXMediaMessa;
    }
    public static WXMediaMessage g(WechatForward p0,OperationModel p1){
       a.p(p1, "model");
       SharePlatformData$ShareConfig shareConfig = p0.e0(p1);
       WXWebpageObject wXWebpageObj = new WXWebpageObject();
       wXWebpageObj.webpageUrl = shareConfig.mShareUrl;
       WXMediaMessage wXMediaMessa = new WXMediaMessage(wXWebpageObj);
       wXMediaMessa.title = f.a(shareConfig.mTitle, 500);
       wXMediaMessa.description = f.a(shareConfig.mSubTitle, 1000);
       wXMediaMessa.thumbData = WechatForward$a.b(p0, p1.d());
       return wXMediaMessa;
    }
    public static SharePlatformData$ShareConfig h(WechatForward p0,OperationModel p1){
       a.p(p1, "model");
       return p1.c(p0.getForward());
    }
    public static t i(WechatForward p0,String p1,String p2,KwaiOperator p3,String p4){
       a.p(p1, "businessType");
       a.p(p2, "extInfo");
       a.p(p3, "operator");
       b$a uoa = new b$a(p0, p3, p1, p2, p4);
       t ot = t.create(v0);
       a.o(ot, "Observable.create { emit¡­.onError\(e\)\n      }\n    }");
       return ot;
    }
    public static t j(WechatForward p0,WXMediaMessage p1,KwaiOperator p2,String p3){
       a.p(p1, "mediaMessage");
       a.p(p2, "operator");
       t ot = t.create(new b$b(p0, p2, p1, p3));
       a.o(ot, "Observable.create { emit¡­.onError\(e\)\n      }\n    }");
       return ot;
    }
    public static x k(){
       return WechatForward.n0.c();
    }
}
