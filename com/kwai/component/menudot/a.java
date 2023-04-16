package com.kwai.component.menudot.a;
import java.lang.Object;
import com.yxcorp.gifshow.reddot.model.RedDot;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.yxcorp.gifshow.reddot.model.RedDotExtParams;
import com.google.gson.Gson;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.e0;
import java.lang.Integer;
import java.lang.Boolean;
import wkd.b;
import com.kwai.component.menudot.b;
import nc5.h;
import java.util.concurrent.Callable;
import brd.a0;
import t45.d;
import brd.z;
import nc5.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import nc5.g;
import nc5.e;

public class a	// class@0009b4
{

    public void a(){
       super();
    }
    public static String a(RedDot p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (TextUtils.isEmpty(p0.mExtParams)) {
          return null;
       }
       RedDotExtParams redDotExtPar = a.a.h(p0.mExtParams, RedDotExtParams.class);
       if (redDotExtPar == null) {
          return null;
       }
       if (!TextUtils.isEmpty(redDotExtPar.mText) && !TextUtils.isEmpty(redDotExtPar.mRightIconUrl)) {
          return "TEXT&ICON";
       }
       if (!TextUtils.isEmpty(redDotExtPar.mText)) {
          return "TEXT";
       }
       if (!TextUtils.isEmpty(redDotExtPar.mRightIconUrl)) {
          return "ICON";
       }
       return null;
    }
    public static void b(int p0,boolean p1,ClientEvent$UrlPackage p2,e0 p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, p3, null, a.class, "2")) {
          return;
       }
       RedDot redDot = b.a(0x34c80eb4).c(p0);
       if (redDot == null || (redDot.mLevel > 1 && redDot.mRealShow != null)) {
          int i = (int)(redDot.mTotal - redDot.mWaterline);
          if (i <= 0) {
             return;
          }else {
             a0.y(new h(redDot, i, p1)).T(d.c).G(d.a).R(new f(p2, p3), Functions.d());
          }
       }
       return;
    }
    public static void c(int p0,boolean p1,ClientEvent$UrlPackage p2,e0 p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, p3, null, a.class, "1")) {
          return;
       }
       RedDot redDot = b.a(0x34c80eb4).c(p0);
       if (redDot == null || (redDot.mLevel > 1 && redDot.mRealShow != null)) {
          int i = (int)(redDot.mTotal - redDot.mWaterline);
          if (i <= 0) {
             return;
          }else {
             a0.y(new g(redDot, i, p1)).T(d.c).G(d.a).R(new e(p2, p3), Functions.d());
          }
       }
       return;
    }
}
