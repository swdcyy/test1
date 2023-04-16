package com.yxcorp.gifshow.share.platform.a;
import com.yxcorp.gifshow.share.platform.QQForward;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import com.yxcorp.gifshow.share.platform.QQForward$a;
import com.yxcorp.gifshow.share.OperationModel;
import java.io.File;
import com.yxcorp.gifshow.util.BitmapUtil;
import qrd.l1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import android.content.Intent;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.share.platform.a$a;
import io.reactivex.g;
import yic.n0;

public final class a	// class@001c21
{

    static {
    }
    public static t a(QQForward p0,KwaiOperator p1){
       a.p(p1, "operator");
       Bundle uBundle = QQForward$a.a(p0);
       uBundle.putInt("req_type", 5);
       File uFile = p1.i().l();
       a.m(uFile);
       BitmapUtil.K(uFile, 0x500000);
       uBundle.putString("imageLocalUrl", uFile.getAbsolutePath());
       return QQForward$a.d(p0, p1.i(), p1.c(), uBundle, true);
    }
    public static t b(QQForward p0,KwaiOperator p1){
       a.p(p1, "operator");
       return QQForward$a.e(p0, p1.i(), p1.c(), QQForward$a.b(p0, p1.i()), false, 8, null);
    }
    public static t c(QQForward p0,KwaiOperator p1,String p2){
       a.p(p1, "operator");
       Bundle uBundle = QQForward$a.a(p0);
       OperationModel operationMod = p1.i();
       SharePlatformData$ShareConfig shareConfig = operationMod.c(p0.getForward());
       uBundle.putInt("req_type", 7);
       uBundle.putString("title", shareConfig.mSubTitle);
       uBundle.putString("summary", shareConfig.mTitle);
       uBundle.putString("targetUrl", shareConfig.mShareUrl);
       uBundle.putString("mini_program_appid", shareConfig.mAppId);
       uBundle.putString("mini_program_path", shareConfig.mSharePath);
       uBundle.putString("mini_program_type", "3");
       QQForward$a.c(p0, uBundle, p2, operationMod.d());
       return QQForward$a.e(p0, p1.i(), p1.c(), uBundle, false, 8, null);
    }
    public static t d(QQForward p0,KwaiOperator p1){
       a.p(p1, "operator");
       t ot = (p0.m())? p0.G0(p1.i(), p1.c()): QQForward$a.e(p0, p1.i(), p1.c(), QQForward$a.b(p0, p1.i()), false, 8, null);
       return ot;
    }
    public static t e(QQForward p0,OperationModel p1,GifshowActivity p2){
       a.p(p1, "model");
       a.p(p2, "activity");
       Intent intent = new Intent();
       SharePlatformData$ShareConfig shareConfig = p1.c(p0.getForward());
       intent.setAction("android.intent.action.SEND");
       intent.setType("text/plain");
       SharePlatformData$ShareConfig mH5MaxTitleL = shareConfig.mH5MaxTitleLength;
       String str = (mH5MaxTitleL > null)? TextUtils.b(shareConfig.mTitle, mH5MaxTitleL, "...")+10+shareConfig.mShareUrl: shareConfig.mTitle+shareConfig.mShareUrl;
       intent.putExtra("android.intent.extra.TEXT", str);
       intent.setClassName("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity");
       t ot = t.create(new a$a(p2, intent, p1));
       a.o(ot, "Observable.create { emit¡­Next\(model\)\n      }\n    }");
       return ot;
    }
    public static void f(QQForward p0,OperationModel p1){
       a.p(p1, "model");
       SharePlatformData$ShareConfig shareConfig = p1.c(p0.getForward());
       if (n0.f(shareConfig) != null) {
          shareConfig.mCoverUrl = n0.f(shareConfig);
       }
       return;
    }
}
