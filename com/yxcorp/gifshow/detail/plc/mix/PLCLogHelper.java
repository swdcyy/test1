package com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$a;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$2;
import mxb.j0;
import mxb.i0;
import h4a.b;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$b;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import v3a.e;
import android.app.Activity;
import java.lang.Number;
import vy6.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import f4a.b0;
import com.yxcorp.gifshow.entity.QPhoto;
import ok.x;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import h4a.a;
import f4a.i;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import com.yxcorp.gifshow.detail.plc.helper.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f4a.n;
import f4a.s;
import f4a.z;
import h4a.i;
import j4a.a;
import m4a.c;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.detail.plc.mix.f$b;
import k2b.e0;
import com.yxcorp.gifshow.detail.plc.mix.f;
import java.lang.Long;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.plc.helper.ad.a;
import ekd.y0;

public class PLCLogHelper	// class@001685
{
    public boolean A;
    public boolean B;
    public a C;
    public QPhoto a;
    public b b;
    public x c;
    public z d;
    public long e;
    public long f;
    public boolean g;
    public Activity h;
    public i i;
    public f j;
    public a k;
    public a l;
    public PlcEntryStyleInfo$PageType m;
    public String n;
    public BaseFragment o;
    public b0 p;
    public DefaultLifecycleObserver q;
    public PlcEntryStyleInfo r;
    public final j0 s;
    public final IMediaPlayer$OnInfoListener t;
    public final Runnable u;
    public boolean v;
    public long w;
    public long x;
    public b y;
    public y0 z;

    public void PLCLogHelper(){
       super();
       this.p = new PLCLogHelper$a(this);
       this.q = new PLCLogHelper$2(this);
       this.s = i0.a();
       this.t = new b(this);
       this.u = new PLCLogHelper$b(this);
       this.C = new PLCLogHelper$c(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper.class, "5")) {
          return;
       }
       this.o();
       this.z = null;
       return;
    }
    public String b(PlcEntryStyleInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PLCLogHelper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.a(p0, this.m);
    }
    public Activity c(){
       return this.h;
    }
    public int d(){
       int i;
       PlcEntryStyleInfo obj = PatchProxy.apply(null, this, PLCLogHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.i();
       obj = (obj != null)? obj.mBizType: 0;
       return obj;
    }
    public a e(){
       return this.C;
    }
    public DefaultLifecycleObserver f(){
       return this.q;
    }
    public IMediaPlayer$OnInfoListener g(){
       return this.t;
    }
    public b0 h(){
       return this.p;
    }
    public PlcEntryStyleInfo i(){
       PLCLogHelper obj = PatchProxy.apply(null, this, PLCLogHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          PlcEntryStyleInfo plcEntryStyl = this.a.getPlcEntryStyleInfo();
       }
       return obj;
    }
    public void j(Activity p0,QPhoto p1,x p2,b p3,BaseFragment p4,a p5,PlcEntryStyleInfo$PageType p6){
       PlcEntryStyleInfo$StyleInfo mPackageName;
       PlcEntryStyleInfo$StyleInfo mAppIconUrl;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PLCLogHelper pLCLogHelper = PLCLogHelper.class;
       if (PatchProxy.isSupport(pLCLogHelper)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, pLCLogHelper, "1")) {
             return;
          }
       }
       this.n = p4.o();
       this.m = p6;
       this.h = p0;
       this.c = p2;
       this.a = p1;
       this.b = p3;
       this.o = p4;
       Object[] objArray1 = null;
       if (p1 != null) {
          PlcEntryStyleInfo plcEntryStyl = p1.getPlcEntryStyleInfo();
          this.r = plcEntryStyl;
          n on = PatchProxy.applyOneRefs(plcEntryStyl, this, pLCLogHelper, "14");
          if (on != patchProxyRe) {
          }else {
             GameCenterPlugin gameCenterPl = d.a(-1986139969);
             String str = this.b(plcEntryStyl);
             String str1 = "";
             if (plcEntryStyl != null) {
                PlcEntryStyleInfo mStyleInfo = plcEntryStyl.mStyleInfo;
                if (mStyleInfo != null) {
                   mPackageName = mStyleInfo.mPackageName;
                label_006a :
                   if (plcEntryStyl != null) {
                      PlcEntryStyleInfo mStyleInfo1 = plcEntryStyl.mStyleInfo;
                      if (mStyleInfo1 != null) {
                         mAppIconUrl = mStyleInfo1.mAppIconUrl;
                      label_0074 :
                         if (plcEntryStyl != null) {
                            plcEntryStyl = plcEntryStyl.mStyleInfo;
                            if (plcEntryStyl != null) {
                               str1 = plcEntryStyl.mAppName;
                            }
                         }
                         GameCenterDownloadParams gameCenterDo = i.m(str, mPackageName, mAppIconUrl, str1);
                         if (gameCenterPl.isAvailable() && !TextUtils.x(gameCenterDo.mDownloadId)) {
                            on = new n(gameCenterDo);
                         }else {
                            on = new s();
                         }
                      }
                   }
                   mAppIconUrl = str1;
                   goto label_0074 ;
                }
             }
             mPackageName = str1;
             goto label_006a ;
          }
          this.i = on;
          i oi = PatchProxy.apply(objArray1, this, pLCLogHelper, "15");
          if (oi != patchProxyRe) {
          }else {
             oi = new i(this);
          }
          this.d = oi;
       }
       this.l = p5;
       if (p5 != null) {
          this.k = p5.M7(this.a, this.d());
       }
       PLCLogHelper tc = this.c;
       Object[] objArray2 = (tc == null)? objArray1: tc.get();
       c uoc = new c(objArray2, this.b, this.m);
       Activity uActivity = this.c();
       pLCLogHelper = this.a;
       PLCLogHelper tl = this.l;
       tc = this.c;
       if (tc != null) {
          objArray1 = tc.get();
       }
       this.j = f.d(uActivity, pLCLogHelper, uoc, p4, tl, objArray1);
       return;
    }
    public void k(long p0){
       PLCLogHelper pLCLogHelper = PLCLogHelper.class;
       if (PatchProxy.isSupport(pLCLogHelper) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, pLCLogHelper, "2")) {
          return;
       }
       pLCLogHelper = this.j;
       if (pLCLogHelper != null) {
          pLCLogHelper.u(p0);
       }
       return;
    }
    public boolean l(){
       PLCLogHelper obj = PatchProxy.apply(null, this, PLCLogHelper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.p(this.r)) {
          return false;
       }
       obj = this.d;
       if (obj == null) {
          return false;
       }
       return obj.b();
    }
    public boolean m(){
       PLCLogHelper obj = PatchProxy.apply(null, this, PLCLogHelper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (obj.a() && this.g != null) {
          b = true;
       }
       return b;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper.class, "3")) {
          return;
       }
       PLCLogHelper tz = this.z;
       if (tz != null) {
          tz.a();
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper.class, "4")) {
          return;
       }
       PLCLogHelper tz = this.z;
       if (tz != null) {
          tz.e();
       }
       return;
    }
}
