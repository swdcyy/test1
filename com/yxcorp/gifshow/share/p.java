package com.yxcorp.gifshow.share.p;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.plugin.kwaitoken.KwaiToken;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import com.yxcorp.plugin.kwaitoken.exception.KwaiTokenException;
import android.content.Intent;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.app.Activity;
import java.lang.Throwable;

public final class p	// class@001c09
{

    public static final boolean a(ShareToken p0){
       String str;
       ShareToken obj = PatchProxy.applyOneRefs(p0, null, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "token");
       obj = p0.mShareMessage;
       if (!TextUtils.x(p0.mDownloadMessage)) {
          str = obj+"\n"+p0.mDownloadMessage;
       }
       return KwaiToken.k().B1(str);
    }
    public static final void b(int p0,GifshowActivity p1){
       String str;
       p op = p.class;
       Object obj = null;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, obj, op, "1")) {
          return;
       }
       a.p(p1, "activity");
       if (p0 != 1 && p0 != 2) {
          if (p0 != 3 && p0 != 4) {
             if (p0 == 5) {
                return;
             }else {
                throw new KwaiTokenException(0, "platform not supported");
             }
          }else {
             str = "com.tencent.mobileqq";
          }
       }else {
          str = "com.tencent.mm";
       }
       new Intent("android.intent.action.MAIN", obj).addCategory("android.intent.category.LAUNCHER");
       PackageManager packageManag = p1.getPackageManager();
       a.o(packageManag, "activity.getPackageManager\(\)");
       Intent launchIntent = packageManag.getLaunchIntentForPackage(str);
       if (launchIntent != null) {
          try{
             launchIntent.addFlags(0x10000000);
             p1.startActivity(launchIntent);
          }catch(android.content.ActivityNotFoundException e4){
             throw new KwaiTokenException(1, e4);
          }
       }
       return;
    }
}
