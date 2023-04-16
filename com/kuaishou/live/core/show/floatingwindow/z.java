package com.kuaishou.live.core.show.floatingwindow.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import java.lang.CharSequence;
import android.text.TextUtils;
import s82.n;
import java.util.Set;
import pm8.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import tkd.b;
import tkd.d;
import os5.l;
import us5.a;
import t02.a0;
import android.app.Activity;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import s91.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import xa2.k;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import ie2.j;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.core.show.floatingwindow.e$h;
import java.lang.StringBuilder;
import oe6.e;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.SystemUtil;
import java.lang.IllegalStateException;
import com.kwai.framework.activitycontext.ActivityContext;

public class z	// class@000b9e
{

    public void z(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, z.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i9.a(a.a().a());
    }
    public static boolean b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, z.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if (z.e()) {
          obj = PatchProxy.applyOneRefs(p0, null, n.class, "1");
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): n.a.contains(p0);
          if (!b1) {
          label_003f :
             return b;
          }
       }
       b = false;
       goto label_003f ;
    }
    public static boolean c(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z oz = z.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, oz, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object obj1 = PatchProxy.apply(objArray, objArray, oz, "3");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(a.f() && !a.c()){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1 || !z.a()) {
          b = false;
       }
       return b;
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, z.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.t().u("SOURCE_LIVE").d("float_window_use_bring_to_front", false) ^ 0x01);
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!d.a(-1492894991).H60().b())? true: false;
       return b;
    }
    public static boolean f(a0 p0,Activity p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a0 obj = PatchProxy.applyTwoRefs(p0, p1, null, z.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = p0.E;
       boolean b = false;
       if (!z.e()) {
          b.c0(LiveLogTag.FLOATING_WINDOW, "shouldShowFloatingWindowWhenActivityFinish", "-> false", "function unavailable");
          return b;
       }else if(!i9.a(a.a().a())){
          b.c0(LiveLogTag.FLOATING_WINDOW, "shouldShowFloatingWindowWhenActivityFinish", "-> false", "can not draw overlay");
          return b;
       }else {
          a0 c2 = p0.C2;
          c2 = (c2 != null && c2.b())? 1: null;
          if (c2) {
             b.c0(LiveLogTag.FLOATING_WINDOW, "shouldShowFloatingWindowWhenActivityFinish", "-> false", "kickedOutRoom");
             return b;
          }else if(k.c(p0.c)){
             b.c0(LiveLogTag.FLOATING_WINDOW, "shouldShowFloatingWindowWhenActivityFinish", "-> false", "privateLive");
             return b;
          }else if(j.a(p0.p)){
             return b;
          }else if(!obj.isPlaying()){
             b.c0(LiveLogTag.FLOATING_WINDOW, "shouldShowFloatingWindowWhenActivityFinish", "-> false", "isLivePlaying == false");
             return b;
          }else if(z.d() && p0.d1.b() == 3){
             b.Z(LiveLogTag.FLOATING_WINDOW, "shouldShowFloatingWindowWhenActivityFinish -> "+e.s());
             return e.s();
          }else {
             Object obj1 = PatchProxy.applyTwoRefs(p0, p1, null, z.class, "12");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(p0.d1.b() == 2){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1 || e.s()) {
                if (p1 != null) {
                   b1 = PatchProxy.applyOneRefs(p1, null, z.class, "10");
                   if (b1 != patchProxyRe) {
                      b1 = b1.booleanValue();
                   }else if(e.s(p1)){
                      QPhoto qPhoto = e.h(p1);
                      if (qPhoto != null && qPhoto.isLiveStream()) {
                         b1 = true;
                      }
                   }
                   b1 = false;
                   if (b1) {
                      b.c0(LiveLogTag.FLOATING_WINDOW, "shouldShowFloatingWindowWhenActivityFinish", "-> false", "backToSlideLive -> true");
                   }else if(!z.b(p1.getClass().getSimpleName())){
                      b.c0(LiveLogTag.FLOATING_WINDOW, "shouldShowFloatingWindowWhenActivityFinish", "-> false", "checkShowFloatingWindowEnabled -> disable");
                   }
                }
                b = true;
             }
             b.Z(LiveLogTag.FLOATING_WINDOW, "shouldShowFloatingWindowWhenActivityFinish -> "+b);
             return b;
          }
       }
    }
    public static boolean g(a0 p0,Activity p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, z.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p1.isFinishing()) {
          return z.f(p0, ActivityContext.g().e());
       }
       if (!SystemUtil.I()) {
          return false;
       }
       throw new IllegalStateException("只有当Activity退出时, 才能判断是否将展示小窗");
    }
}
