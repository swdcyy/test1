package com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager;
import java.lang.System;
import cra.w;
import q87.c;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper;
import java.lang.StringBuilder;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.CharSequence;
import android.text.TextUtils;
import zsd.u;
import dqa.e;
import java.lang.Runnable;
import com.kwai.framework.init.c;

public final class PreEmbeddedInitModule extends a	// class@00147a
{

    public void PreEmbeddedInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public void n(){
       Object[] objArray2;
       String str2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PreEmbeddedInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, PreEmbeddedManager.class, "3")) {
          PreEmbeddedManager.e = System.currentTimeMillis();
          String d = PreEmbeddedManager.d;
          int i = 0;
          Object[] objArray1 = new Object[i];
          w.C().w(d, "onAppInit\(\) start perform", objArray1);
          if (PreEmbeddedManager.l.f()) {
             objArray2 = new Object[i];
             w.C().w(d, "onAppInit\(\) isHitDisableConditions\(\)", objArray2);
          }else {
             objArray1 = new Object[i];
             w.C().w(d, "onAppInit\(\) obtainFileList\(pre_embedded/feeds\)", objArray1);
             PreEmbeddedHelper c = PreEmbeddedHelper.c;
             String[] stringArray = c.e("pre_embedded/feeds");
             String str = 1;
             int i1 = (!stringArray.length)? 1: 0;
             if (i1) {
                objArray2 = new Object[i];
                w.C().w(d, "onAppInit\(\) feedList.isEmpty\(\)", objArray2);
             }else {
                i1 = (int)(System.currentTimeMillis() % (long)stringArray.length);
                Object[] objArray3 = new Object[i];
                w.C().w(d, "selected index = "+i1, objArray3);
                String str1 = "pre_embedded/feeds/"+stringArray[i1];
                String[] stringArray1 = c.e(str1);
                if (stringArray1.length < 2) {
                   str2 = (stringArray1.length == str)? ArraysKt___ArraysKt.ob(stringArray1): "empty";
                   objArray2 = new Object[i];
                   w.C().w(d, "onAppInit\(\) feedFiles.size < 2 & feedFile = "+str2, objArray2);
                }else {
                   String str3 = c.c(stringArray1, ".json");
                   char c1 = '/';
                   str = str1+c1+str3;
                   str2 = str1+c1+c.c(stringArray1, ".mp4");
                   if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                      objArray2 = new Object[i];
                      w.C().w(d, "onAppInit\(\) TextUtils.isEmpty\(jsonPath\) || TextUtils.isEmpty\(videoPath\)", objArray2);
                   }else {
                      PreEmbeddedManager.k = u.g2(str3, ".json", "", false, 4, null);
                      objArray2 = new Object[i];
                      w.C().w(d, "selected json = "+str+"; videoPath = "+str2, objArray2);
                      c.c(new e(str, str2));
                   }
                }
             }
          }
       }
       return;
    }
}
