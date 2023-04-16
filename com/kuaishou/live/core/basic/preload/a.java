package com.kuaishou.live.core.basic.preload.a;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r12.i;
import gw1.a;
import com.kuaishou.ax2c.PreLoader;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import w51.a;
import xf6.l;
import r12.k;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.view.InflateException;
import com.kuaishou.ax2c.AX2C;
import com.kuaishou.live.core.basic.preload.a$b;
import com.kuaishou.live.core.basic.preload.a$a;
import android.os.SystemClock;
import i2b.a;
import java.util.ArrayList;
import com.kuaishou.ax2c.PreloadParam$Builder;
import r12.j;
import com.kuaishou.ax2c.PreloadParam;
import com.yxcorp.gifshow.activity.GifshowActivity;
import m02.v1;

public class a	// class@0008cf
{
    public static Integer[] a;

    static {
       Integer[] integerArray = new Integer[]{Integer.valueOf(0x7f0d0cf8),Integer.valueOf(0x7f0d0cfc),Integer.valueOf(0x7f0d0d04)};
       a.a = integerArray;
    }
    public void a(){
       super();
    }
    public static void a(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "15")) {
          return;
       }
       long l = i.a();
       if (a.a()) {
          PreLoader.getInstance().clear(p0);
       }
       i.b(l, "clear tag", p0);
       return;
    }
    public static View b(Context p0,int p1,ViewGroup p2,boolean p3,boolean p4,boolean p5){
       Object[] objArray;
       Integer[] obj1;
       boolean b;
       View view;
       object oobject = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       View obj = null;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[]{oobject,Integer.valueOf(p1),p2,Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5)};
          obj1 = PatchProxy.apply(objArray, obj, uoa, "20");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), obj, uoa, "19");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
             i = p1;
          }else {
          label_005b :
             obj1 = PatchProxy.apply(obj, obj, a.class, "3");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(a.c == null){
                a.c = Boolean.valueOf(a.t().d("enableLiveStartAudienceAx2cPk", 0));
                b.c0(LiveLogTag.LIVE_PRELOAD, "isLiveAudienceAx2cPKEnabled", "enable", a.c);
             }
             if (!a.c.booleanValue()) {
                Object obj2 = PatchProxy.apply(obj, obj, a.class, "47");
                b = (obj2 != patchProxyRe)? obj2.booleanValue(): l.c("liveAudienceStartAx2cPK", 0);
                if (!b) {
                   b = false;
                }
             }
             b = true;
             if (!b) {
                obj1 = a.a;
                int len = obj1.length;
                int i4 = 0;
                while (true) {
                   if (i4 < len) {
                      if (p1 == obj1[i4].intValue()) {
                         b = true;
                      }else {
                         i4 = i4 + 1;
                         i = 5;
                      }
                   }
                }
                return view;
             }
             b = false;
          }
       }else {
          goto label_005b ;
       }
       if (b) {
          return obj;
       }else if(a.a()){
          if (p4) {
             if (PatchProxy.isSupport(uoa)) {
                objArray = new Object[]{oobject,Integer.valueOf(p1),p2,Boolean.valueOf(p3),Boolean.valueOf(p5),obj};
                view = PatchProxy.apply(objArray, obj, uoa, "21");
                if (view != patchProxyRe) {
                   goto label_0156 ;
                }
             }
             try{
                obj = PreLoader.getInstance().getOrWait(p0, p1, p2, p3, p5, new k(obj, p5));
             }catch(android.view.InflateException e0){
                if (!("future is null").equals(e0.getMessage()) && !("InterruptedException").equals(e0.getMessage())) {
                   b.I(LiveLogTag.LIVE_PRELOAD, "getOrWaitInterceptNoCache", e0);
                   ExceptionHandler.handleCaughtException(e0);
                }
             }catch(java.lang.Exception e0){
                b.I(LiveLogTag.LIVE_PRELOAD, "getOrWaitInterceptNoCache", e0);
                ExceptionHandler.handleCaughtException(e0);
             }catch(java.lang.Error e0){
                b.I(LiveLogTag.LIVE_PRELOAD, "getOrWaitInterceptNoCache", e0);
                ExceptionHandler.handleCaughtException(e0);
             }
          label_0155 :
             view = obj;
             goto label_0156 ;
          }else {
             i3 = p5;
             try{
                return new AX2C(oobject).inflateSync(p1, p2, p3, p5, null);
             }catch(java.lang.Exception e0){
                b.I(LiveLogTag.LIVE_PRELOAD, v6, e0);
                ExceptionHandler.handleCaughtException(e0);
             }catch(java.lang.Error e0){
                b.I(LiveLogTag.LIVE_PRELOAD, v6, e0);
                ExceptionHandler.handleCaughtException(e0);
             }
          }
       }
    }
    public static View c(Context p0,int p1,ViewGroup p2,boolean p3,boolean p4,boolean p5,boolean p6,int p7,a$b p8,a$a p9){
       View obj;
       Boolean uBoolean;
       View view;
       View view1;
       int i2;
       View view2;
       long l2;
       int[] ointArray;
       int[] ointArray1;
       String str;
       int childCount;
       ArrayList uArrayList;
       int i3;
       object oobject = p0;
       object oobject1 = p2;
       boolean b = p3;
       object oobject2 = p8;
       object oobject3 = p9;
       a uoa = a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[10];
          objArray[i] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject1;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = oobject2;
          objArray[9] = oobject3;
          obj = PatchProxy.apply(objArray, null, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LiveLogTag lIVE_PRELOAD = LiveLogTag.LIVE_PRELOAD;
       b.Z(lIVE_PRELOAD, "layoutInflater");
       long l = (oobject3 != null)? SystemClock.elapsedRealtime(): i.a();
       long l1 = l;
       obj = a.b(p0, p1, p2, p3, p4, p5);
       if (obj == null) {
          b.Z(lIVE_PRELOAD, "layoutInflater cache not hit");
          int i1 = p7;
          uBoolean = (i1 != -1)? 1: null;
          if (!uBoolean) {
             i1 = p1;
          }
          view = a.d(oobject, i1, oobject1, b);
          view1 = null;
       }else {
          view = obj;
          uBoolean = null;
          view1 = 1;
       }
       if (p6 && !uBoolean) {
          if (PatchProxy.isSupport(uoa)) {
             i2 = view1;
             view2 = view;
             if (!PatchProxy.applyVoidThreeRefs(view, p2, Boolean.valueOf(p3), null, a.class, "9")) {
             }
          }else {
             i2 = view1;
             view2 = view;
          }
       }else {
          i2 = view1;
          view2 = view;
       }
    }
    public static void d(PreloadParam$Builder p0){
       int[] ointArray;
       a uoa = a.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uoa, "17")) {
          return;
       }
       long l = i.a();
       if (a.a() && !PatchProxy.applyVoidOneRefs(p0, obj, uoa, "18")) {
          try{
             PreLoader.getInstance().preload(p0.setInflateListener(new j()).build());
          }catch(java.lang.Exception e5){
             b.I(LiveLogTag.LIVE_PRELOAD, "preload", e5);
             ExceptionHandler.handleCaughtException(e5);
          }
       }
    }
    public static void e(GifshowActivity p0,int p1,ViewGroup p2,boolean p3,a$b p4,a$a p5){
       object oobject2;
       boolean b;
       object oobject = p0;
       object oobject1 = p4;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),oobject2,Boolean.valueOf(p3),oobject1,p5};
          oobject2 = null;
          if (PatchProxy.applyVoid(objArray, oobject2, uoa, "1")) {
             return;
          }
       }
       LiveLogTag lIVE_PRELOAD = LiveLogTag.LIVE_PRELOAD;
       b.Z(lIVE_PRELOAD, "setContentView");
       long l = (p5 != null)? SystemClock.elapsedRealtime(): i.a();
       long l1 = l;
       View view = a.b(p0, p1, null, p3, true, true);
       if (view == null) {
          b.Z(lIVE_PRELOAD, "setContentView cache not hit");
          p0.setContentView(p1);
          b = false;
       }else {
          p0.setContentView(view);
          b = true;
       }
       oobject1.a(b);
       if (p5 != null) {
          l = SystemClock.elapsedRealtime() - l1;
          p5.a(l);
          int[] ointArray = new int[]{p1};
          i.c(l, "setContentView", ointArray);
       }else {
          int[] ointArray1 = new int[]{p1};
          i.b(l1, "setContentView", ointArray1);
       }
       return;
    }
}
