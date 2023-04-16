package com.yxcorp.gifshow.postentrance.util.b;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.util.Map;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import java.lang.Long;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import java.util.Set;
import java.util.Iterator;
import an6.o;
import an6.e;
import a0c.g;
import q87.c;
import k2b.u1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import java.lang.Boolean;
import jzb.b;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil;
import java.util.List;
import com.yxcorp.gifshow.postentrance.util.d;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$a;
import java.lang.StringBuilder;
import o56.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import a0c.e;
import java.lang.Runnable;
import t45.c;

public class b	// class@00108d
{

    public void b(){
       super();
    }
    public static i3 a(PublishGuideInfo p0,Map p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       i3 obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uob, "6");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = i3.f();
       obj1.d("id", p0.mId);
       obj1.d("title", p0.mTitle);
       obj1.d("subTitle", p0.mSubTitle);
       obj1.c("type", Integer.valueOf(p0.mType));
       obj1.d("userId", QCurrentUser.ME.getId());
       obj1.c("currentTime", Long.valueOf(System.currentTimeMillis()));
       obj1.d("scheme", p0.mScheme);
       if (p0.isFromServer != null) {
          obj1.c("expireTime", Long.valueOf(p0.mExpireTime));
       }
       i3 oi3 = i3.f();
       oi3.c("publish_guide_type", Integer.valueOf(p0.mType));
       oi3.d("publish_guide", obj1.e());
       p0 = p0.mScheme;
       String str = PatchProxy.applyOneRefs(p0, obj, uob, "12");
       if (str != patchProxyRe) {
       }else if(TextUtils.x(p0)){
          str = "-1";
       }else {
          str = x0.a(Uri.parse(p0), "taskType");
       }
       oi3.d("task_type", str);
       if (p1 == null) {
          return oi3;
       }else {
          Iterator iterator = p1.keySet().iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             str = p1.get(str1);
             if (!TextUtils.x(str1) && !TextUtils.x(str)) {
                oi3.d(str1, str);
             }
          }
          return oi3;
       }
    }
    public static int b(o p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       int i1 = (p0.g() == null)? 0: p0.g().b();
       if (!i1) {
          Object[] objArray = new Object[i];
          g.C().w("home_entrance_bubble", "getBubbleReportId bubbleType is 0", objArray);
       }
       return (i1 + 20000);
    }
    public static void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "10")) {
          return;
       }
       if (TextUtils.x(p1)) {
          return;
       }
       u1.R(p0, p1, 2);
       return;
    }
    public static void d(String p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x7d02;
       uElementPack.params = p0;
       u1.M("", p1, 1, uElementPack, new ClientContent$ContentPackage(), null);
       return;
    }
    public static void e(String p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x7d01;
       uElementPack.params = p0;
       u1.D0("", p1, 7, uElementPack, new ClientContent$ContentPackage(), null);
       return;
    }
    public static void f(String p0,PublishGuideInfo p1){
       boolean b;
       long l;
       Activity uActivity;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uob, "9")) {
          return;
       }
       if (p1 != null) {
          i3 obj1 = PatchProxy.applyTwoRefs(p1, p0, obj, uob, "14");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             b uob1 = HomePostEntranceExpUtil.d();
             b = (uob1.enable != null && (uob1.supportAllBubble != null || (uob1.supportBubbleIds.contains(p1.mId) && !uob1.disabledStages.contains(p0))))? true: false;
          }
          if (b) {
             Object obj2 = PatchProxy.applyTwoRefs(p0, p1, obj, uob, "13");
             if (obj2 != patchProxyRe) {
                obj = obj2;
             }else {
                Map map = d.c();
                if (map != null) {
                   Integer integer = map.get(p1.mId);
                   if (integer == null || integer.intValue() <= HomePostEntranceExpUtil.d().maxDailyReportNum) {
                   }
                }else {
                }
             }
             b.c("BUBBLE_STAGE_REPORT", obj);
          }
       }
       return;
    }
    public static void g(String p0,int p1,String p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, b.class, "11")) {
          return;
       }
       c.a(new e(p1, p2, p0));
       return;
    }
}
