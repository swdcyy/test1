package com.kuaishou.tuna.plc_base.logic.a;
import u06.b;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import f4a.i0;
import java.lang.Object;
import lnc.a1;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger;
import java.lang.String;
import z1.a;
import f4a.b0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import java.lang.Integer;
import wkd.b;
import mxb.f0;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.util.Map;
import f4a.f0;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import java.util.Objects;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ju5.g;
import com.kuaishou.tuna.plc_base.logic.PlcMiniRecoLogger$b;
import o58.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import agc.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import az4.a;
import vs3.a;
import android.content.Intent;
import f4a.u;
import android.text.TextUtils;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;

public class a implements b	// class@001071
{
    public PlcEntryDataAdapter a;
    public QPhoto b;
    public Activity c;
    public i0 d;
    public PlcMiniRecoLogger e;

    public void a(PlcEntryDataAdapter p0,QPhoto p1,Activity p2,i0 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       if (a1.i(p2) && p2 instanceof LifecycleOwner) {
          this.e = new PlcMiniRecoLogger(p2, p1);
       }
       return;
    }
    public void a(PlcEntryDataAdapter p0,QPhoto p1,i0 p2){
       this.a = p0;
       this.b = p1;
       this.d = p2;
    }
    public void b(Activity p0,String p1,a p2,b0 p3){
       g this;
       PlcMiniRecoLogger b;
       PlcMiniRecoLogger d;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "2")) {
          return;
       }
       if (a1.i(p0) && !TextUtils.x(p1)) {
          HashMap hashMap = new HashMap();
          hashMap.put("QPhoto", this.b);
          if (p3 != null) {
             hashMap.put("SOURCE_PAGE_FROM_PLC", p3.z());
          }
          a ta = this.a;
          if (ta != null) {
             hashMap.put("PLC_VIEW_STYLE", Integer.valueOf(ta.getViewStyle()));
          }
          b.a(-762347696).t1(p1, k.B(this.b));
          ta = this.d;
          if (ta != null) {
             ta.a(p1, hashMap);
          }
          f0.b(p1, hashMap);
          if (!PatchProxy.applyVoidOneRefs(p1, this, a.class, "3")) {
             PlcMiniRecoLogger plcMiniRecoL = null;
             if (this.e != null) {
                ta = this.a;
                if (ta != null && (ta.getPlcEntryStyleInfo() != null && this.a.getPlcEntryStyleInfo().mPageType == PlcEntryStyleInfo$PageType.SINGLE.getPageType())) {
                   ta = 1;
                label_0090 :
                   if (ta) {
                      ta = this.e;
                      Objects.requireNonNull(ta);
                      if (!PatchProxy.applyVoidOneRefs(p1, ta, PlcMiniRecoLogger.class, "1")) {
                         String str = "miniUrl";
                         a.p(p1, str);
                         this = d.a(0x6ea0c3d0);
                         if (this != null && this.rM(p1)) {
                            b = ta.b;
                            d = ta.d;
                            Objects.requireNonNull(b);
                            if (!PatchProxy.applyVoidTwoRefs(p1, d, b, PlcMiniRecoLogger$b.class, "2")) {
                               a.p(p1, str);
                               g og = d.a(0x6ea0c3d0);
                               if (og != null) {
                                  b.b = p1;
                                  b.a = d;
                                  b.c = plcMiniRecoL;
                                  og.addMiniAppStatListener(p1, b);
                                  TunaPlcLogger.e("PlcMiniRecoLogger", "listenMiniLifecycle miniUrl:"+p1);
                               }
                            }
                            plcMiniRecoL = ta.c;
                            if (plcMiniRecoL != null) {
                               Lifecycle lifecycle = plcMiniRecoL.getLifecycle();
                               if (lifecycle != null) {
                                  lifecycle.addObserver(ta.a);
                               }
                            }
                         }
                      }
                   }
                }
             }
             ta = null;
             goto label_0090 ;
          }
       label_0103 :
          a.a(p0, p1, hashMap);
          if (p2 != null) {
             p2.accept(Integer.valueOf(3));
          }
       }
    label_0110 :
       return;
    }
    public boolean c(Activity p0,b0 p1,a p2){
       int[] ointArray;
       Object obj1;
       boolean b2;
       Uri uri;
       Intent intent;
       Intent intent1;
       a uoa = this;
       Activity uActivity = p0;
       b0 uob0 = p1;
       a uoa1 = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       try{
          ointArray = new int[]{0};
          super(ointArray);
          int actionType = uoa.a.getActionType();
          String str = null;
          boolean b = 4;
          int i = 2;
          u ou = 5;
          int i1 = 3;
          if (actionType != 1) {
             if (actionType != i) {
                if (actionType != i1) {
                   if (actionType == b || actionType == ou) {
                      if (uoa.a.getBizType() == i1) {
                         uActivity.startActivity(d.a(0x7074b578).SL(uActivity, uoa.a.getActionUrl(), str, ""));
                      }else {
                         u.e(uActivity, uoa.a.getActionUrl(), uoa.b, this);
                      }
                      if (uoa.a.getActionType() == ou) {
                         this.accept(Integer.valueOf(14));
                      }else {
                         this.accept(Integer.valueOf(13));
                      }
                   }
                }else {
                   uoa.b(uActivity, uoa.a.getActionUrl(), this, uob0);
                }
             }else {
                return 0;
             }
          }else {
             a c = uoa.c;
             String actionUrl = uoa.a.getActionUrl();
             String appLink = uoa.a.getAppLink();
             a b1 = uoa.b;
             if (PatchProxy.isSupport(u.class)) {
                Object[] objArray = new Object[]{c,actionUrl,appLink,b1,uob0,this};
                if (!PatchProxy.applyVoid(objArray, null, u.class, "1")) {
                }
             }else {
                Object obj2 = null;
             }
          }
       }catch(java.lang.Exception e0){
       }
    label_0148 :
       if (uoa1) {
          uoa1.accept(Integer.valueOf(ointArray[0]));
       }
       return 1;
    }
}
