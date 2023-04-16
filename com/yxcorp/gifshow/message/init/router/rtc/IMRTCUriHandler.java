package com.yxcorp.gifshow.message.init.router.rtc.IMRTCUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import xh7.a;
import dc5.c;
import com.kwai.framework.activitycontext.ActivityContext;
import wkd.b;
import com.yxcorp.gifshow.im_rtc.media.a;
import java.util.Objects;
import cxa.c;
import java.lang.Runnable;
import yb7.p;
import yh7.a;
import lnc.o5;
import zwa.b;
import zwa.a;
import dxa.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import e17.i;
import android.content.Context;
import android.app.Activity;
import com.yxcorp.gifshow.im.RtcCallStartParam$a;
import com.yxcorp.gifshow.im.RtcCallStartParam;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import o56.a;
import java.util.Map;
import tkd.b;
import tkd.d;
import pu5.a;
import qu5.r;
import java.lang.StringBuilder;
import hw5.e;
import vv5.l1;

public class IMRTCUriHandler extends AnnotationUriHandler	// class@001d69
{

    public void IMRTCUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       IMRTCUriHandler iMRTCUriHand = IMRTCUriHandler.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, iMRTCUriHand, "1")) {
          return;
       }
       Uri uri = p0.g();
       if (("/rtc/silent").equals(uri.getPath())) {
          if (!PatchProxy.applyVoidOneRefs(uri, this, iMRTCUriHand, "3")) {
             c.g("IMRTCUriHandler", "processSilent");
             String queryParamet = uri.getQueryParameter("scene");
             boolean b = ActivityContext.g().h();
             if (!("foreground").equals(queryParamet) || (b || (("background").equals(queryParamet) && !b))) {
                a uoa = b.a(-711209703);
                Objects.requireNonNull(uoa);
                if (!PatchProxy.applyVoid(null, uoa, a.class, "5")) {
                   p.d(new c(uoa));
                }
             }
          }
          p1.a(new a(200));
       }else if(("/rtc/Dial").equals(uri.getPath())){
          this.f(uri);
          p1.a(new a(200));
       }else {
          this.e(p0, p1);
       }
       return;
    }
    public final void e(b p0,c p1){
       a uoa1;
       Object obj = this;
       Activity obj1 = p0;
       Object obj2 = p1;
       IMRTCUriHandler iMRTCUriHand = IMRTCUriHandler.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, iMRTCUriHand, "2")) {
          return;
       }
       Uri uri = p0.g();
       boolean b = obj1.a("com.kwai.platform.krouter.return_intent", false);
       int i = o5.b(uri.getQueryParameter("targetType"), false);
       String queryParamet = uri.getQueryParameter("targetId");
       String queryParamet1 = uri.getQueryParameter("roomId");
       String queryParamet2 = uri.getQueryParameter("inviteId");
       String queryParamet3 = uri.getQueryParameter("behavior");
       int i1 = o5.b(uri.getQueryParameter("callType"), 1);
       int i2 = o5.b(uri.getQueryParameter("chatMode"), 1);
       int i3 = 0x7f11066a;
       if (i || i2 != 1) {
          c.c("IMRTCUriHandler", "needUpdate, targetType="+i+" callType="+i1+" chatMode="+i2);
          i.a(i3, R.string.arg_RES_7f101a5c);
          obj2.a(new a(200));
          return;
       }else {
          b curRTCCallDe = a.a().getCurRTCCallDetail();
          if (curRTCCallDe != null && !TextUtils.equals(curRTCCallDe.f(), queryParamet1)) {
             i.a(i3, R.string.arg_RES_7f101925);
             obj2.a(new a(200));
             return;
          }else if(p0.b() instanceof Activity){
             obj1 = p0.b();
          }else {
             obj1 = ActivityContext.g().e();
          }
          RtcCallStartParam$a uoa = new RtcCallStartParam$a(i, queryParamet, queryParamet1, queryParamet3, i1);
          i3.c(queryParamet2);
          i3.b(1);
          RtcCallStartParam rtcCallStart = i3.a();
          queryParamet2 = uri.getPath();
          Objects.requireNonNull(queryParamet2);
          uoa = -1;
          i = queryParamet2.hashCode();
          if (i != -128570244) {
             if (i != 0x11894cd) {
                if (i == 0x1ee3aeac && queryParamet2.equals("/rtc/page")) {
                   uoa = 2;
                }
             }else if(!queryParamet2.equals("/rtc/window")){
                uoa = 1;
             }
          }else if(!queryParamet2.equals("/rtc/reject")){
             uoa = 0;
          }
          if (uoa) {
             if (uoa != 1) {
                if (uoa != 2) {
                   p1.b();
                }else if(b){
                   uoa1 = new a(201);
                   a b1 = uoa1.b;
                   Intent intent = PatchProxy.applyOneRefs(uri, obj, iMRTCUriHand, "6");
                   if (intent != PatchProxyResult.class) {
                   }else {
                      intent = new Intent();
                      intent.setPackage(a.v);
                      intent.setData(uri);
                      intent.setAction("android.intent.action.VIEW");
                      intent.addCategory("android.intent.category.DEFAULT");
                   }
                   b1.put("com.kwai.platform.krouter.return_intent", intent);
                }else {
                   a uoa2 = new a(200);
                   if (obj1 != null) {
                      d.a(-1497343380).pi(obj1, rtcCallStart);
                   }
                   uoa1 = uoa2;
                }
                obj2.a(uoa1);
             }else if(obj1 != null){
                d.a(-1497343380).dR(obj1, rtcCallStart);
             }
             obj2.a(new a(200));
          }else {
             obj.g(uri);
             obj2.a(new a(200));
          }
          return;
       }
    }
    public final void f(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCUriHandler.class, "4")) {
          return;
       }
       if (a.a().isIMRTCCallBusy()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101925);
          return;
       }else {
          Activity uActivity = ActivityContext.g().e();
          if (uActivity == null) {
             c.c("IMRTCUriHandler", "processDial failed, no activity");
             return;
          }else {
             d.a(-854594802).iP(uActivity, o5.b(p0.getQueryParameter("conversationType"), 0), p0.getQueryParameter("conversationId"), o5.b(p0.getQueryParameter("callType"), 1));
             return;
          }
       }
    }
    public final void g(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCUriHandler.class, "5")) {
          return;
       }
       a.a().rejectRTCCall(p0.getQueryParameter("roomId"));
       return;
    }
}
