package com.kuaishou.live.ad.social.r;
import zl0.p1;
import im8.g;
import zl0.s0;
import java.lang.Object;
import com.kuaishou.live.ad.social.r$b;
import com.kuaishou.live.ad.social.r$a;
import com.kuaishou.live.ad.social.o;
import androidx.fragment.app.DialogFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import lf3.g;
import android.app.Dialog;
import java.lang.Boolean;
import java.lang.System;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.lang.Runnable;
import ekd.k1;
import crd.b;
import lnc.b9;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import z1.a;
import zl0.a1;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$ControlInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import e17.i;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import tkd.b;
import tkd.d;
import os5.d;
import zl0.b1;
import zl0.a;
import brd.t;
import cjd.e;
import erd.o;
import zl0.j0;
import zl0.i0;
import erd.g;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import zl0.q0;
import java.util.HashMap;
import t45.d;
import brd.z;
import com.kuaishou.live.ad.social.p;
import com.kuaishou.live.ad.social.q;
import mxb.j0;
import mxb.i0;
import java.util.List;

public class r implements p1, g	// class@000a20
{
    public a1 b;
    public b c;
    public b d;
    public final r$b e;
    public long f;
    public final s0 g;
    public final int h;
    public final a i;
    public final g j;

    public void r(s0 p0,int p1){
       super();
       this.e = new r$b(this);
       this.i = new r$a(this);
       this.j = new o(this);
       this.g = p0;
       this.h = p1;
    }
    public void a(DialogFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "12")) {
          return;
       }
       this.g.u().o(510, this.j);
       if (p0 != null && (p0.getDialog() != null && p0.getDialog().isShowing())) {
          p0.dismissAllowingStateLoss();
       }
    label_002d :
       this.c();
       return;
    }
    public void b(boolean p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, or, "11")) {
          return;
       }
       this.f = System.currentTimeMillis();
       this.g.u().u0(510, SCActionSignal.class, this.j);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, r.class, "14")) {
          return;
       }
       k1.m(this.e);
       b9.a(this.c);
       b9.a(this.d);
       this.b = null;
       this.e.c(null, true, null, true);
       return;
    }
    public String d(a1 p0){
       p0 = p0.k;
       if (p0 != null) {
          LiveAdConversionTaskDetail mH5Data = p0.mH5Data;
          if (mH5Data != null) {
             return mH5Data;
          }
       }
       return "";
    }
    public void e(long p0,int p1,a p2){
       r or = this;
       int i = p1;
       a uoa = p2;
       r or1 = r.class;
       if (PatchProxy.isSupport(or1) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), p2, this, r.class, "1")) {
          return;
       }
       r b = or.b;
       int i1 = 4;
       if (b == null) {
          or.f(uoa, i1);
          return;
       }else if(b.k != null){
          if (!PatchProxy.isSupport(or1) || !PatchProxy.applyVoidFourRefs(b, Long.valueOf(p0), Integer.valueOf(p1), p2, this, r.class, "7")) {
             if (b != null) {
                a1 k = b.k;
                if (k != null && k.mControlInfo != null) {
                   if (b.a == null || b.b - p0) {
                      i.a(R.style.arg_RES_7f11066a, 0x7f101d09);
                      b.h0(LiveLogTag.AD, "conversion task is unavailable", ImmutableMap.of("taskEnable", Boolean.valueOf(b.a), "mTaskId", Long.valueOf(b.b)));
                      or.f(uoa, i1);
                   }else if(PatchProxy.isSupport(or1) && PatchProxy.applyVoidFourRefs(b, k, Integer.valueOf(p1), p2, this, r.class, "8")){
                      LiveAdConversionTaskDetail mControlInfo = k.mControlInfo;
                      LiveAdConversionTaskDetail$ControlInfo mCode = mControlInfo.mCode;
                      if (mCode != 1) {
                         if (mCode != 2) {
                            if (mCode != 3) {
                               if (!TextUtils.isEmpty(mControlInfo.mUrl)) {
                                  or.g.X3(b, mControlInfo.mUrl, i);
                               }else if(!TextUtils.isEmpty(mControlInfo.mDetailMessage)){
                                  i.d(R.style.arg_RES_7f11066a, mControlInfo.mDetailMessage);
                               }else {
                                  b.Z(LiveLogTag.AD, "cannot deal with control");
                               }
                               or.f(uoa, 1);
                            }else {
                               i.a(R.style.arg_RES_7f11066a, 0x7f101869);
                               or.f(uoa, 3);
                            }
                         }else {
                            i.d(R.style.arg_RES_7f11066a, mControlInfo.mDetailMessage);
                            or.f(uoa, 1);
                         }
                      }else {
                         or.g.D4(b, k, i);
                         or.h(b, k);
                         or.f(uoa, 1);
                      }
                   }
                }
             }
             b.B(LiveLogTag.AD, "has no task when handle Task");
             or.f(uoa, i1);
          }
          or.g.I0(or.b, i);
          return;
       }else if(PatchProxy.isSupport(or1) && PatchProxy.applyVoidFourRefs(b, Long.valueOf(p0), Integer.valueOf(p1), p2, this, r.class, "2")){
          b.Z(LiveLogTag.AD, "retry fetch task detail when click!");
          b9.a(or.d);
          a uoa1 = new a(or.g.getLiveStreamId(), or.g.k2(), b.b, b.h, or.g.d6(), or.g.I6(), b.l, Integer.valueOf(or.h), Integer.valueOf(0));
          j0 oj0 = new j0(this, b, p0, p1, p2);
          or.d = d.a(-2004767397).L8().a(v1.a()).map(new e()).subscribe(uoa1, new i0(or, uoa));
       }
       return;
    }
    public final void f(a p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, or, "4")) {
          return;
       }
       if (p0 != null) {
          p0.accept(Integer.valueOf(p1));
       }
       return;
    }
    public final void g(a p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "3")) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f101869);
       String str = "error";
       ImmutableMap immutableMap = (p1 != null)? ImmutableMap.of(str, p1): ImmutableMap.of(str, "null");
       b.J(LiveLogTag.AD, "fetch task error when click", immutableMap);
       this.f(p0, 2);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, r.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(r.class, new q0());
       }else {
          obj.put(r.class, null);
       }
       return obj;
    }
    public final void h(a1 p0,LiveAdConversionTaskDetail p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "9")) {
          return;
       }
       a1 k = p0.k;
       if (k != null) {
          LiveAdConversionTaskDetail mControlInfo = k.mControlInfo;
          if (mControlInfo != null) {
             if (mControlInfo.mNeedNativeSubmitCount == null) {
                b.J(LiveLogTag.AD, "no submit count", ImmutableMap.of("needNativeSubmitCount", Boolean.FALSE));
                return;
             }else {
                d.a(-2004767397).L8().c(this.g.getLiveStreamId(), p0.b, p0.h).subscribeOn(d.b).subscribe(p.b, q.b);
                i0.a().k(550, p1.mTracks);
                return;
             }
          }
       }
       LiveLogTag aD = LiveLogTag.AD;
       b = (k == null)? true: false;
       b.J(aD, "no submit count£¬data is null", ImmutableMap.of("detailIsNull", Boolean.valueOf(b)));
       return;
    }
}
