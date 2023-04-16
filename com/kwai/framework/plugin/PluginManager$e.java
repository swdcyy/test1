package com.kwai.framework.plugin.PluginManager$e;
import qi7.a;
import java.lang.Object;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.PluginManager;
import java.util.Objects;
import java.lang.System;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import zi7.a;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import android.content.Context;
import com.kwai.plugin.dva.feature.core.repository.config.ApkData;
import com.kwai.robust2.patchmanager.c;
import com.kwai.framework.plugin.log.PluginLogger;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import ikd.d;
import ikd.c;
import ikd.b;

public final class PluginManager$e implements a	// class@000c65
{
    public static final PluginManager$e a;

    static {
       PluginManager$e.a = new PluginManager$e();
    }
    public void PluginManager$e(){
       super();
    }
    public final void a(String p0,ClassLoader p1){
       String str;
       String str2;
       String str3;
       String str5;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PluginManager$e.class, "1")) {
          return;
       }
       a.p(p0, "pluginName");
       a.p(p1, "_classloader");
       PluginManager h = PluginManager.H;
       Objects.requireNonNull(h);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, h, PluginManager.class, "25")) {
          long l = System.currentTimeMillis();
          FeatureDetails uFeatureDeta = FeatureManager.a.a().d();
          if (uFeatureDeta != null) {
             List splits = uFeatureDeta.getSplits();
             if (splits != null) {
                Iterator iterator = splits.iterator();
                while (true) {
                   String str1 = null;
                   if (iterator.hasNext()) {
                      str2 = iterator.next();
                      if (!a.g(str2.getSplitName(), p0)) {
                         continue ;
                      }
                   }else {
                      str2 = str1;
                   }
                   if (str2 != null) {
                      uFeatureDeta = FeatureManager.a.a().h();
                      if (uFeatureDeta != null) {
                         splits = uFeatureDeta.getSplits();
                         if (splits != null) {
                            iterator = splits.iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  str3 = iterator.next();
                                  if (!a.g(str3.getSplitName(), p0)) {
                                     continue ;
                                  }
                               }else {
                                  str3 = str1;
                               }
                               if (str3 != null) {
                                  Context b = PluginManager.b;
                                  String str4 = "mContext";
                                  if (b == null) {
                                     a.S(str4);
                                  }
                                  splits = str2.getApkDataList(b);
                                  str2 = "master";
                                  if (splits != null) {
                                     iterator = splits.iterator();
                                     while (true) {
                                        if (iterator.hasNext()) {
                                           str5 = iterator.next();
                                           if (!a.g(str5.getAbi(), str2)) {
                                              continue ;
                                           }
                                        }else {
                                           str5 = str1;
                                        }
                                        if (str5 != null) {
                                           str = str5.getMd5();
                                        label_00ca :
                                           Context b1 = PluginManager.b;
                                           if (b1 == null) {
                                              a.S(str4);
                                           }
                                           List apkDataList = str3.getApkDataList(b1);
                                           if (apkDataList != null) {
                                              Iterator iterator1 = apkDataList.iterator();
                                              while (true) {
                                                 if (iterator1.hasNext()) {
                                                    str4 = iterator1.next();
                                                    if (!a.g(str4.getAbi(), str2)) {
                                                       continue ;
                                                    }
                                                 }else {
                                                    str4 = str1;
                                                 }
                                                 if (str4 != null) {
                                                    str1 = str4.getMd5();
                                                 }
                                              }
                                              _monitor_exit(d.class);
                                              return;
                                           }
                                           if (!(a.g(str, str1) ^ 1)) {
                                              c.a().f(p0, p1);
                                              h.r().k(p0, (System.currentTimeMillis() - l));
                                           }
                                        }
                                     }
                                  }
                                  str = str1;
                                  goto label_00ca ;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_0134 :
       _monitor_enter(d.class);
       int i = 2;
       Object[] objArray = new Object[i];
       objArray[0] = "com.kwai.asuka.ioc.IOCProviderImpl";
       objArray[1] = p0;
       str = String.format("%s$%s", objArray);
       c uoc = (p1 != null)? p1.loadClass(str).newInstance(): d.class.getClassLoader().loadClass(str).newInstance();
       d.d.add(uoc);
       Object[] objArray1 = new Object[i];
       objArray1[0] = "com.kwai.asuka.ioc.IOCMapperImpl";
       objArray1[1] = p0;
       str = String.format("%s$%s", objArray1);
       b uob = (p1 != null)? p1.loadClass(str).newInstance(): d.class.getClassLoader().loadClass(str).newInstance();
       d.c.add(uob);
       goto label_01d1 ;
    }
}
