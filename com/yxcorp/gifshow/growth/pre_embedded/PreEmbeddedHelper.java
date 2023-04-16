package com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager;
import java.lang.String;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper$SAVE_DIR$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import lnc.a1;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import qkd.b;
import cra.w;
import java.lang.StringBuilder;
import java.lang.System;
import q87.c;
import java.io.IOException;
import zsd.u;
import java.lang.CharSequence;
import e17.i;

public final class PreEmbeddedHelper	// class@001479
{
    public static final String a;
    public static final p b;
    public static final PreEmbeddedHelper c;

    static {
       PreEmbeddedHelper.c = new PreEmbeddedHelper();
       PreEmbeddedHelper.a = PreEmbeddedManager.l.d();
       PreEmbeddedHelper.b = s.c(PreEmbeddedHelper$SAVE_DIR$2.INSTANCE);
    }
    public void PreEmbeddedHelper(){
       super();
    }
    public final File a(String p0,boolean p1){
       File obj;
       PreEmbeddedHelper preEmbeddedH = PreEmbeddedHelper.class;
       if (PatchProxy.isSupport(preEmbeddedH)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, preEmbeddedH, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new File(p0);
       if (!obj.exists()) {
          if (p1) {
             File parentFile = obj.getParentFile();
             if (parentFile != null) {
                if (!parentFile.exists()) {
                   parentFile.mkdirs();
                }
                obj.createNewFile();
             }
          }else {
             obj.mkdirs();
          }
       }
       return obj;
    }
    public final boolean b(String p0,String p1){
       File parentFile;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PreEmbeddedHelper preEmbeddedH = PreEmbeddedHelper.class;
       File obj = PatchProxy.applyTwoRefs(p0, p1, this, preEmbeddedH, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "srcPath");
       a.p(p1, "desPath");
       obj = new File(p1);
       if (!obj.exists() || !obj.length() - null) {
          parentFile = obj.getParentFile();
          if (parentFile != null && !parentFile.exists()) {
             parentFile = obj.getParentFile();
             if (parentFile != null) {
                parentFile.mkdirs();
             }
          }
          obj.createNewFile();
       }
       parentFile = PatchProxy.applyTwoRefs(p0, obj, this, preEmbeddedH, "5");
       String str = "spend ms = ";
       char c = ' ';
       if (parentFile != patchProxyRe) {
          b = parentFile.booleanValue();
       }else {
          try{
             Context uContext = a1.c();
             a.o(uContext, "CommonUtil.context\(\)");
             InputStream inputStream = SplitAssetHelper.open(uContext.getAssets(), p0);
             a.o(inputStream, "assetManager.open\(srcPath\)");
             if (!b.l(inputStream, obj.getAbsolutePath())) {
                obj.delete();
             }else {
                Object[] objArray1 = new Object[0];
                w.C().w(PreEmbeddedHelper.a, "copyFile File length = "+obj.length()+c+str+(System.currentTimeMillis() - PreEmbeddedManager.l.c()), objArray1);
                b = true;
             }
          }catch(java.io.IOException e10){
             e10.printStackTrace();
             obj.delete();
          }
          b = false;
       }
       Object[] objArray = new Object[0];
       w.C().w(PreEmbeddedHelper.a, "File length = "+obj.length()+c+str+(System.currentTimeMillis() - PreEmbeddedManager.l.c()), objArray);
       return b;
    }
    public final String c(String[] p0,String p1){
       object oobject;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PreEmbeddedHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "files");
       a.p(p1, "suffix");
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return "";
          }
          oobject = p0[i];
          if (u.H1(oobject, p1, false, 2, null)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public final String d(){
       Object obj = PatchProxy.apply(null, this, PreEmbeddedHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PreEmbeddedHelper.b.getValue();
    }
    public final String[] e(String p0){
       String[] stringArray;
       Object obj = PatchProxy.applyOneRefs(p0, this, PreEmbeddedHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dir");
       try{
          obj = 0;
          Context uContext = a1.c();
          a.o(uContext, "CommonUtil.context\(\)");
          stringArray = SplitAssetHelper.list(uContext.getAssets(), p0);
          if (stringArray != null) {
             uContext = (!stringArray.length)? 1: 0;
             if (uContext) {
             label_0030 :
                stringArray = new String[obj];
             }
          }else {
             goto label_0030 ;
          }
       }catch(java.io.IOException e4){
          e4.printStackTrace();
          stringArray = new String[obj];
       }
       return stringArray;
    }
    public final void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PreEmbeddedHelper.class, "2")) {
          return;
       }
       a.p(p0, "msg");
       i.e(R.style.arg_RES_7f11066a, p0, 1);
       return;
    }
}
