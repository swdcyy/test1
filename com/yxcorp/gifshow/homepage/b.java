package com.yxcorp.gifshow.homepage.b;
import ok.x;
import java.lang.Object;
import gsa.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import so5.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import wkd.b;
import sb5.c;
import com.kwai.component.homepage_interface.skin.HomeBottomBarSkinConfig;
import no5.a;
import java.lang.System;
import java.lang.Long;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.net.Uri;
import kb.c;
import com.facebook.datasource.a;

public final class b implements x	// class@0016a9
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       HomeBottomBarSkinConfig obj = PatchProxy.apply(null, null, oi, "12");
       boolean b = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(a.a().booleanValue()){
          Log.g("NasaBottomTabIconUtils", "sEnableBottomTabIconSaveFile: "+i.a);
          obj = b.a(-1397878105).b();
          if (i.b() && obj != null) {
             if (obj.mVersionCode == a.a()) {
                Long obj1 = PatchProxy.apply(null, null, oi, "13");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                   obj1 = Long.valueOf(System.currentTimeMillis());
                   List list = i.f();
                   if (!q.f(list)) {
                      Iterator iterator = list.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            String str = iterator.next();
                            String obj2 = PatchProxy.applyOneRefs(str, null, oi, "20");
                            if (obj2 != patchProxyRe) {
                               b2 = obj2.booleanValue();
                            }else if(TextUtils.x(str)){
                               if (i.a.booleanValue()) {
                                  File uFile = i.d(str);
                                  if (uFile != null && uFile.exists()) {
                                     b2 = true;
                                  }
                               }else {
                                  c uoc = Fresco.getImagePipeline().isInDiskCache(Uri.parse(str));
                                  a.b(uoc);
                                  obj2 = (uoc.hasResult() && (uoc.getResult() != null && uoc.getResult().booleanValue()))? 1: null;
                                  uoc.close();
                                  b2 = obj2;
                               }
                            }
                            b2 = false;
                            if (b2) {
                               continue ;
                            }
                         }else {
                            Log.b("NasaBottomTabIconUtils", (System.currentTimeMillis() - obj1.longValue())+"");
                            b1 = true;
                         }
                      }
                   }
                   b1 = false;
                }
                if (b1) {
                label_0112 :
                   b = false;
                }
             }
          }else {
             goto label_0112 ;
          }
       }
       return Boolean.valueOf(b);
    }
}
