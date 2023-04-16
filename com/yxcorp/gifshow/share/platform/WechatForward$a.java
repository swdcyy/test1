package com.yxcorp.gifshow.share.platform.WechatForward$a;
import com.yxcorp.gifshow.share.platform.WechatForward;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.io.IOException;
import java.lang.RuntimeException;
import java.io.File;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import wkd.b;
import mhc.y;
import mhc.f2;
import kotlin.jvm.internal.a;
import java.lang.Number;
import fz6.a;
import com.yxcorp.gifshow.share.KwaiOperator;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.KwaiOperator$a;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import fz6.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.yxcorp.gifshow.share.platform.WechatForward$a$a;
import erd.r;
import com.yxcorp.gifshow.share.platform.WechatForward$a$b;
import erd.g;
import crd.b;
import o56.c;
import o56.a;
import android.app.Application;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req;
import java.lang.System;
import com.yxcorp.gifshow.share.platform.WechatForward$a$c;
import com.yxcorp.gifshow.share.platform.WechatForward$a$d;

public final class WechatForward$a	// class@001c1d
{

    public static IWXAPI a(WechatForward p0,IWXAPI p1,Context p2,int p3,String p4){
       WechatForward$a uoa = WechatForward$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, null, uoa, "9");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       if (p2 != null) {
          if (p1.isWXAppInstalled()) {
             if (p3 != 1 || p1.getWXAppSupportAPI() >= 0x21020001) {
                if (p1.registerApp(p4)) {
                   return p1;
                }else {
                   throw new IOException(p2.getString(0x7f105186));
                }
             }else {
                throw new IOException(p2.getString(0x7f105187));
             }
          }else {
             throw new IOException(p2.getString(0x7f10518b));
          }
       }else {
          throw new RuntimeException("app context is null");
       }
    }
    public static byte[] b(WechatForward p0,File p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, null, WechatForward$a.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (p1 != null && p1.exists()) {
          Bitmap uBitmap = BitmapUtil.r(p1, 160, 160, false);
          if (uBitmap != null) {
             return BitmapUtil.B(uBitmap);
          }
       }
       return null;
    }
    public static String c(WechatForward p0,SharePlatformData$ShareConfig p1){
       SharePlatformData$ShareConfig mShareAppId;
       p0 = PatchProxy.applyTwoRefs(p0, p1, null, WechatForward$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (!TextUtils.x(p1.mShareAppId)) {
          mShareAppId = p1.mShareAppId;
       }else if(p1.mAppIdKeyIndex == null){
          mShareAppId = WechatForward.n0.b();
       }else {
          y oy = b.a(0x91df3e4);
          if (oy != null) {
             f2 uof2 = oy.a();
             if (uof2 != null) {
                mShareAppId = uof2.b(p1.mAppIdKeyIndex);
                if (mShareAppId == null) {
                }
             }else {
             }
          }else {
          }
       }
       a.o(mShareAppId, "with\(shareConfig\) {\n    \x20\x02\) ?: APP_ID\n      }\n    }\x00");
       return mShareAppId;
    }
    public static int d(WechatForward p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WechatForward$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (p0.m() ^ 0x01);
    }
    public static void e(WechatForward p0,String p1,String p2,String p3,a p4,KwaiOperator p5){
       WechatForward$a uoa = WechatForward$a.class;
       IWXAPI obj = null;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "6")) {
             return;
          }
       }
       obj = WechatForward$a.a(p0, WechatForward.n0.f(), KwaiOperator.q.b(), WechatForward$a.d(p0), WechatForward$a.c(p0, p0.e0(p5.i())));
       WXOpenBusinessView$Req req = new WXOpenBusinessView$Req();
       req.businessType = p1;
       req.extInfo = p2;
       p1 = String.valueOf(0);
       req.transaction = p1;
       c.a(p1, WechatForward$a.d(p0), p3, p4);
       p5.c().m().filter(WechatForward$a$a.b).subscribe(new WechatForward$a$b(req));
       if (obj.sendReq(req)) {
          obj.unregisterApp();
          return;
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          throw new IOException(uoc.a().getString(0x7f10518e));
       }
    }
    public static void f(WechatForward p0,WXMediaMessage p1,int p2,String p3,a p4,KwaiOperator p5){
       WechatForward$a uoa = WechatForward$a.class;
       IWXAPI obj = null;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "7")) {
             return;
          }
       }
       obj = WechatForward$a.a(p0, WechatForward.n0.f(), KwaiOperator.q.b(), p2, WechatForward$a.c(p0, p0.e0(p5.i())));
       SendMessageToWX$Req req = new SendMessageToWX$Req();
       String str = String.valueOf(System.currentTimeMillis());
       req.transaction = str;
       req.message = p1;
       req.scene = p2;
       c.a(str, p2, p3, p4);
       p5.c().m().filter(WechatForward$a$c.b).subscribe(new WechatForward$a$d(req));
       if (obj.sendReq(req)) {
          obj.unregisterApp();
          return;
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          throw new IOException(uoc.a().getString(0x7f10518e));
       }
    }
}
