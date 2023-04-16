package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$a;
import ixa.g;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ixa.f;
import bxa.b;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import bxa.a;
import java.lang.Runnable;
import t45.c;
import dc5.c;
import java.lang.StringBuilder;
import gxa.c;
import w4d.a;
import java.util.Iterator;
import java.util.List;
import zwa.v;
import java.nio.ByteBuffer;
import hxa.b;
import java.lang.System;
import mw5.c;
import hxa.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class IMRTCCenter$a implements g	// class@001922
{
    public final IMRTCCenter a;

    public void IMRTCCenter$a(IMRTCCenter p0){
       this.a = p0;
       super();
    }
    public void J2(int p0,String p1){
       boolean b;
       IMRTCCenter$a uoa = IMRTCCenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       f.h(this, p0, p1);
       if (p0 == 1 && p1 != null) {
          Object obj = null;
          if (!PatchProxy.applyVoidOneRefs(p1, obj, b.class, "1")) {
             IMConfigInfo obj1 = PatchProxy.apply(obj, obj, IMConfigUtil.class, "21");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                obj1 = IMConfigUtil.i.r();
                b = (obj1 != null)? obj1.mEnableIMRTCQosLog: null;
             }
             if (b != null) {
                c.a(new a(p1));
             }
          }
       }
       return;
    }
    public void K2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter$a.class, "9")) {
          return;
       }
       f.i(this, p0);
       c.c("IMRTCCenter", "onRTCConnectionDidTimeout");
       this.a.interruptRTCCall(p0);
       return;
    }
    public void L2(String p0,int p1,int p2){
       if (PatchProxy.isSupport(IMRTCCenter$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, IMRTCCenter$a.class, "4")) {
          return;
       }
       c.c("IMRTCCenter", "snow onError roomId="+p0+" error="+p1+", originReason="+p2);
       if (p1 != 5) {
          this.a.interruptRTCCall(p0);
       }
       if (p1 == 4 && !PatchProxy.applyVoid(null, null, c.class, "2")) {
          c.g("IMRTCToken", "clear token");
          a.a("");
       }
       return;
    }
    public void M2(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(IMRTCCenter$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, IMRTCCenter$a.class, "8")) {
          return;
       }
       f.e(this, p0, p1, p2, p3);
       c.g("IMRTCCenter", "onConnectionStateChanged: state="+p1+", reason="+p2+", originReason="+p3);
       if (p1 == 5 && p2 != 6) {
          this.a.interruptRTCCall(p0);
       }
       return;
    }
    public void N2(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(IMRTCCenter$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, IMRTCCenter$a.class, "2")) {
          return;
       }
       f.f(this, p0, p1, p2, p3);
       Iterator iterator = this.a.mListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().N2(p0, p1, p2, p3);
       }
       return;
    }
    public void O2(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMRTCCenter$a.class, "1")) {
          return;
       }
       f.a(this, p0, p1);
       Iterator iterator = this.a.mListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().O2(p0, p1);
       }
       return;
    }
    public void P2(String p0,String p1,ByteBuffer p2,int p3,int p4,int p5,int p6){
       IMRTCCenter$a uoa = this;
       object oobject = p1;
       IMRTCCenter$a uoa1 = IMRTCCenter$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{p0,oobject,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "7")) {
             return;
          }
       }
       f.j(this, p0, p1, p2, p3, p4, p5, p6);
       if (uoa.a.mVideoPipe != null) {
          b uob = new b(p3, p4, System.currentTimeMillis(), false, p5, false, 0, p2);
          uoa.a.mVideoPipe.a(oobject, uoa1);
       }
       return;
    }
    public void Q2(String p0){
       f.d(this, p0);
    }
    public void R2(String p0,int p1){
       IMRTCCenter$a uoa = IMRTCCenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5")) {
          return;
       }
       f.l(this, p0, p1);
       c.c("IMRTCCenter", "onSnowVerifyError roomId="+p0+" error="+p1);
       if (p1 != 1 && (p1 != 2 && (p1 == 3 || p1 == 4))) {
          this.a.interruptRTCCall(p0);
       }
       return;
    }
    public void S2(String p0,String p1,boolean p2,int p3,int p4){
       f.k(this, p0, p1, p2, p3, p4);
    }
    public void T2(List p0,int p1){
       f.c(this, p0, p1);
    }
    public void U2(String p0,List p1){
       f.g(this, p0, p1);
    }
    public void V2(String p0,int p1){
       IMRTCCenter$a uoa = IMRTCCenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       f.b(this, p0, p1);
       c.c("IMRTCCenter", "onAudioDeviceInterrupt roomId: "+p0+"; type = "+p1);
       if (!TextUtils.n(this.a.getCurState(), "CALLING")) {
          return;
       }
       if (p1 == 2019 || p1 == 2017) {
          c.c("IMRTCCenter", "onAudioDeviceInterrupt roomId: "+p0+"; CurState = "+this.a.getCurState());
          this.a.interruptRTCCall(p0);
       }
       return;
    }
    public void a(String p0,String p1,int p2){
       f.n(this, p0, p1, p2);
    }
    public void b(String p0,String p1,int p2){
       f.m(this, p0, p1, p2);
    }
}
