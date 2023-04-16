package com.yxcorp.gifshow.share.platform.QQForward$a;
import com.yxcorp.gifshow.share.platform.QQForward;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.KwaiOperator;
import android.content.Context;
import com.yxcorp.gifshow.share.KwaiOperator$a;
import com.yxcorp.gifshow.share.OperationModel;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.io.File;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import java.lang.Boolean;
import com.yxcorp.gifshow.share.platform.QQForward$a$a;
import io.reactivex.g;
import kotlin.jvm.internal.a;

public final class QQForward$a	// class@001c12
{

    public static Bundle a(QQForward p0){
       Bundle obj = PatchProxy.applyOneRefs(p0, null, QQForward$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putString("appName", KwaiOperator.q.b().getString(R.string.arg_RES_7f101c05));
       obj.putInt("cflag", (p0.m() ^ 0x01));
       return obj;
    }
    public static Bundle b(QQForward p0,OperationModel p1){
       Bundle obj = PatchProxy.applyTwoRefs(p0, p1, null, QQForward$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QQForward$a.a(p0);
       SharePlatformData$ShareConfig shareConfig = p1.c(p0.getForward());
       obj.putInt("req_type", 1);
       obj.putString("title", shareConfig.mTitle);
       obj.putString("summary", shareConfig.mSubTitle);
       obj.putString("targetUrl", shareConfig.mShareUrl);
       QQForward$a.c(p0, obj, shareConfig.mCoverUrl, p1.d());
       return obj;
    }
    public static void c(QQForward p0,Bundle p1,String p2,File p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, QQForward$a.class, "2")) {
          return;
       }
       if (p0.m()) {
          if (p2 != null) {
             p1.putString("imageUrl", p2);
          }
          if (p3 != null) {
             String absolutePath = p3.getAbsolutePath();
             if (absolutePath != null) {
                p1.putString("imageLocalUrl", absolutePath);
             }
          }
       }else if(p2 != null){
          p2 = (p3 != null)? p3.getAbsolutePath(): null;
       }
    label_0036 :
       String[] stringArray = new String[]{p2};
       p1.putStringArrayList("imageUrl", CollectionsKt__CollectionsKt.r(stringArray));
       return;
    }
    public static t d(QQForward p0,OperationModel p1,GifshowActivity p2,Bundle p3,boolean p4){
       QQForward$a uoa = QQForward$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          p0 = PatchProxy.apply(objArray, null, uoa, "4");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       t ot = t.create(new QQForward$a$a(p1, p2, p4, p3));
       a.o(ot, "Observable.create<Operat¡­      }\n        }\n      }");
       return ot;
    }
    public static t e(QQForward p0,OperationModel p1,GifshowActivity p2,Bundle p3,boolean p4,int p5,Object p6){
       if (p5 & 0x08) {
          p4 = p0.m();
       }
       return QQForward$a.d(p0, p1, p2, p3, p4);
    }
}
