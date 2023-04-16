package com.yxcorp.gifshow.ad.detail.AppInstalledReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import mxb.j0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mxb.i0;
import mxb.j;
import com.yxcorp.gifshow.photoad.o;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.photoad.download.h;
import java.lang.Throwable;
import yx.j0;
import android.content.Context;
import android.content.Intent;
import java.lang.Boolean;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.d;
import brd.t;
import nxb.z;
import java.util.concurrent.Callable;
import brd.z;
import t45.d;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import wl9.c;
import nxb.a0;
import com.yxcorp.gifshow.ad.detail.a;
import q2b.h$b;
import k2b.u1;
import com.yxcorp.gifshow.ad.detail.d;
import io.reactivex.g;
import com.yxcorp.gifshow.ad.detail.b;
import com.yxcorp.gifshow.ad.detail.c;

public class AppInstalledReceiver extends BroadcastReceiver	// class@001542
{
    public static final int a;

    public void AppInstalledReceiver(){
       super();
    }
    public static j0 a(PhotoApkDownloadTaskInfo p0,AdDataWrapper p1){
       j0 oj0;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AppInstalledReceiver.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null) {
          oj0 = i0.a().p(32, p1.getAdLogWrapper());
       }else if(p0.mPlcEntryStyleInfo != null){
          oj0 = o.z().j(32, p0.mPhoto.mEntity, p0.mPlcEntryStyleInfo);
       }else {
          oj0 = o.z().e(32, p0.mPhoto.mEntity);
       }
       return oj0;
    }
    public static h b(){
       Object obj = PatchProxy.apply(null, null, AppInstalledReceiver.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return h.n();
       }catch(java.lang.Exception e0){
          j0.b("AppInstalledReceiver", "cannot instance PhotoAdAPKDownloadTaskManager", e0);
          return v1;
       }
    }
    public void onReceive(Context p0,Intent p1){
       boolean b;
       t ot1;
       h oh = h.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AppInstalledReceiver.class, "1")) {
          return;
       }
       p0 = PatchProxy.applyOneRefs(p1, this, AppInstalledReceiver.class, "2");
       int i = 0;
       if (p0 != patchProxyRe) {
          b = p0.booleanValue();
       }else if(p1 != null && (p1.getAction() == null || p1.getData() == null)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          return;
       }else {
          String schemeSpecif = p1.getData().getSchemeSpecificPart();
          if (TextUtils.x(schemeSpecif)) {
             return;
          }else {
             String action = p1.getAction();
             Objects.requireNonNull(action);
             switch (action.hashCode()){
                 case 0xcfb12eee:
                   if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                   }
                   break;
                 case 0xa480416:
                   if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                      i = 1;
                   }
                   break;
                 case 0x1f50b9c2:
                   if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                      i = 2;
                   }
                   break;
                 case 0x52eac6fd:
                   if (action.equals("android.intent.action.PACKAGE_INSTALL")) {
                      i = 3;
                   }
                   break;
                 case 0x5c1076e2:
                   if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                      i = 4;
                   }
                   break;
                 case 0x5e33a4ad:
                   if (action.equals("android.intent.action.PACKAGE_FULLY_REMOVED")) {
                      i = 5;
                   }
                   break;
                 default:
                label_0057 :
                   i = -1;
             }
             Object obj = null;
             switch (i){
                 case 0:
                 case 1:
                   if (schemeSpecif.equals("com.smile.gifmaker")) {
                      SharedPreferences$Editor uEditor = e.a.edit();
                      uEditor.putLong("LastNotificationGuideDialogShowTime", 0);
                      g.a(uEditor);
                   label_0108 :
                      RxBus.f.b(new c(schemeSpecif));
                      if (!PatchProxy.applyVoidOneRefs(schemeSpecif, obj, AppInstalledReceiver.class, "8") && schemeSpecif != null) {
                         h oh1 = AppInstalledReceiver.b();
                         if (oh1 != null) {
                            ot1 = PatchProxy.applyOneRefs(schemeSpecif, oh1, oh, "20");
                            if (ot1 != patchProxyRe) {
                            }else {
                               ot1 = t.fromCallable(new a0(oh1, schemeSpecif)).subscribeOn(oh1.b).observeOn(d.a).map(oh1.h);
                            }
                            ot1.observeOn(d.b).subscribe(new a(schemeSpecif), Functions.d());
                         }
                      }
                      if (!action.equals("android.intent.action.PACKAGE_ADDED") || (!PatchProxy.applyVoidOneRefs(schemeSpecif, this, AppInstalledReceiver.class, "5") && ("com.tencent.qqpimsecure").equals(schemeSpecif))) {
                         u1.r0(h$b.d(10, 975));
                      }
                   }else {
                      goto label_0108 ;
                   }
                   break;
                 case 2:
                 case 5:
                   if (!PatchProxy.applyVoidOneRefs(schemeSpecif, obj, AppInstalledReceiver.class, "6") && schemeSpecif != null) {
                      RxBus.f.b(new d(schemeSpecif));
                      h oh2 = AppInstalledReceiver.b();
                      if (oh2 != null) {
                         ot1 = PatchProxy.applyOneRefs(schemeSpecif, oh2, oh, "21");
                         if (ot1 != patchProxyRe) {
                         }else {
                            ot1 = t.fromCallable(new z(oh2, schemeSpecif)).subscribeOn(oh2.b).observeOn(d.a).map(oh2.h);
                         }
                         ot1.subscribe(Functions.d(), Functions.d());
                      }
                   }
                   break;
                 case 3:
                 case 4:
                   goto label_0108 ;
                 default:
             }
          label_0183 :
             if (!PatchProxy.applyVoidOneRefs(schemeSpecif, this, AppInstalledReceiver.class, "3")) {
                z c = d.c;
                t ot = t.create(new d(this, schemeSpecif)).observeOn(c).subscribeOn(c);
                ot.subscribe(new b(this), new c(this));
             }
             return;
          }
       }
    }
}
