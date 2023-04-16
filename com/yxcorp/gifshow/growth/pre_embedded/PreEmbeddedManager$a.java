package com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.HomeActivity;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager;
import cra.w;
import java.lang.StringBuilder;
import java.lang.System;
import q87.c;
import java.util.Objects;
import vqa.k;
import java.lang.Boolean;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import android.content.Context;
import lnc.a1;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper;
import java.io.IOException;
import android.os.Bundle;

public final class PreEmbeddedManager$a implements ActivityContext$b	// class@00147b
{

    public void PreEmbeddedManager$a(){
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       PreEmbeddedManager l;
       Context uContext;
       AssetManager assets;
       String[] stringArray;
       String str1;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, PreEmbeddedManager$a.class, str)) {
          return;
       }
       int i = 0;
       int b = true;
       if (p0 instanceof HomeActivity) {
          l = PreEmbeddedManager.l;
          if (!PreEmbeddedManager.i) {
             Object[] objArray = new Object[i];
             w.C().w(l.d(), "HomeActivity onResume spend ms = "+(System.currentTimeMillis() - l.c()), objArray);
             PreEmbeddedManager.i = b;
          }
       }
       try{
          l = PreEmbeddedManager.l;
          Objects.requireNonNull(l);
          Object[] objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, l, PreEmbeddedManager.class, str)) {
             k b1 = k.b;
             str = "KEY_PRE_EMBEDDED_VIDEO_RESOURCES_EXISTS_TOAST";
             Boolean fALSE = Boolean.FALSE;
             if (!u.S1(str)) {
                try{
                   d uod = m0.d(fALSE.getClass());
                   if (a.g(uod, m0.d(Boolean.TYPE))) {
                      fALSE = Boolean.valueOf(b1.a().getBoolean(str, i));
                   }else if(a.g(uod, m0.d(String.class))){
                      if (fALSE instanceof String) {
                         objArray1 = fALSE;
                      }
                      if (objArray1 == null) {
                         objArray1 = "";
                      }
                      str1 = b1.a().getString(str, objArray1);
                      str = (str1 == null || !str1.length())? 1: null;
                      if (!str) {
                         if (str1 != null) {
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                         }
                      }
                   }else if(a.g(uod, m0.d(Integer.TYPE))){
                      if (fALSE instanceof Integer) {
                         objArray1 = fALSE;
                      }
                      uod = Integer.MIN_VALUE;
                      int i1 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                      int intx = b1.a().getInt(str, i1);
                      if (intx != uod) {
                         str1 = Integer.valueOf(intx);
                      }
                   }else if(a.g(uod, m0.d(Long.TYPE))){
                      if (fALSE instanceof Long) {
                         objArray1 = fALSE;
                      }
                      uod = Long.MIN_VALUE;
                      long l1 = (objArray1 != null)? objArray1.longValue(): uod;
                      l1 = b1.a().getLong(str, l1);
                      if (l1 - uod) {
                         str1 = Long.valueOf(l1);
                      }
                   }else if(a.g(uod, m0.d(Float.TYPE))){
                      if (fALSE instanceof Float) {
                         objArray1 = fALSE;
                      }
                      uod = 1;
                      float f = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                      float floatx = b1.a().getFloat(str, f);
                      if (floatx - uod) {
                         str1 = Float.valueOf(floatx);
                      }
                   }
                   fALSE = str1;
                }catch(java.lang.Exception e0){
                }
             }
          }
       }catch(java.io.IOException e11){
          e11.printStackTrace();
          PreEmbeddedHelper.c.f("No pre embedded resources with exception: "+e11.getMessage());
       }
    label_01d4 :
       return;
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PreEmbeddedManager$a.class, "1")) {
          return;
       }
       if (p0 instanceof HomeActivity) {
          PreEmbeddedManager l = PreEmbeddedManager.l;
          String str = l.d();
          Object[] objArray = new Object[0];
          w.C().w(str, "HomeActivity onCreate spend ms = "+(System.currentTimeMillis() - l.c()), objArray);
       }
       return;
    }
    public void onBackground(){
       a.e(this);
    }
    public void onForeground(){
       a.f(this);
    }
}
