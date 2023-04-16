package com.kuaishou.krn.c$a;
import if.a$b;
import com.kuaishou.krn.c;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.experiment.ExpConfigKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import ek0.d;
import lj0.c;
import lj0.d;
import com.kuaishou.krn.log.model.KrnCoreReportDataModel;
import com.facebook.react.views.text.a;
import qrd.p;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.google.gson.Gson;
import java.util.Map;
import java.util.Objects;
import kj0.l;
import com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox;
import mi0.a;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import android.content.ContextWrapper;
import ik0.m;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import sj0.b;
import com.facebook.react.bridge.CatalystInstance;
import java.util.HashMap;
import com.kuaishou.krn.apm.screencapture.CaptureConfigMeta;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import java.lang.Number;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox$a;
import java.util.WeakHashMap;
import java.util.ArrayList;
import qrd.l1;
import java.util.Iterator;
import java.lang.Iterable;
import bk0.j;

public class c$a implements a$b	// class@00084c
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1,String p2,Object p3){
       Boolean this;
       c$a a;
       KrnReactRootView krnReactRoot;
       CaptureConfigMeta uCaptureConf;
       String uoc11;
       int i = p1;
       String str = p2;
       a obj = p3;
       ExpConfigKt uExpConfigKt = ExpConfigKt.class;
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, c$a.class, "3")) {
          return;
       }
       if (i <= 0) {
          d.i("reportCustomEventWithTags: rootTag="+i+" key="+str);
          return;
       }else {
          c uoc = d.b(p1);
          if (uoc == null) {
             d.i("reportCustomEventWithTags: rootTag "+i+" context is null");
             return;
          }else {
             KrnCoreReportDataModel krnCoreRepor = new KrnCoreReportDataModel(uoc, obj);
             if (obj instanceof a) {
                Object[] objArray = null;
                Boolean uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "59");
                if (uBoolean == PatchProxyResult.class) {
                   uBoolean = ExpConfigKt.d0.getValue();
                }
                int b = uBoolean.booleanValue();
                String str1 = "enableViewShot";
                this = Boolean.valueOf(b);
                if (!PatchProxy.applyVoidTwoRefs(str1, this, krnCoreRepor, KrnCoreReportDataModel.class, "1")) {
                   a.p(str1, "key");
                   a.p(this, "value");
                   uoc11 = new Gson().q(this);
                   a.o(uoc11, "Gson\(\).toJson\(value\)");
                   krnCoreRepor.mExtra.put(str1, uoc11);
                }
                if (b) {
                   d.e("reportCustomEventWithTags: textContent="+obj.mTextContent);
                   a = this.a;
                   Objects.requireNonNull(a);
                   c a uoc1 = c.class;
                   if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(p0), a, uoc1, "5")) {
                      if (a.c.c()) {
                         d.i("saveScreenIfCould: give up for LowDisMode");
                      }else {
                         ScreenCaptureToolbox g = ScreenCaptureToolbox.g;
                         uoc1 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "60");
                         if (uoc1 == PatchProxyResult.class) {
                            uoc1 = ExpConfigKt.e0.getValue();
                         }
                         Objects.requireNonNull(g);
                         ScreenCaptureToolbox screenCaptur = ScreenCaptureToolbox.class;
                         if (!PatchProxy.isSupport(screenCaptur) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), Integer.valueOf(p0), uoc1, g, ScreenCaptureToolbox.class, "4")) {
                            if (i <= 0) {
                               d.i("ScreenCaptureToolbox captureViewToFile: invalid rootTag:"+i);
                            }else {
                               c uoc2 = d.b(p1);
                               if (uoc2 == null) {
                                  d.i("ScreenCaptureToolbox captureViewToFile: KrnContext is null for rootTag="+i);
                               }else {
                                  obj = uoc2.r();
                                  ReactContext reactContext = (obj != null)? obj.n(): objArray;
                                  if (reactContext == null) {
                                     d.i("ScreenCaptureToolbox captureViewToFile: ReactContext is null for rootTag="+i);
                                  }else if(ScreenCaptureToolbox.f == null){
                                     String str2 = reactContext.getFilesDir().toString();
                                     a.o(str2, "reactContext.filesDir.toString\(\)");
                                     ScreenCaptureToolbox.f = str2;
                                  }
                                  m om = uoc2.l();
                                  if (om != null) {
                                     KrnDelegate krnDelegate = om.getKrnDelegate();
                                     if (krnDelegate != null) {
                                        krnReactRoot = krnDelegate.g();
                                     label_01b5 :
                                        if (krnReactRoot == null) {
                                           d.i("ScreenCaptureToolbox captureViewToFile: ReactRootView is null for rootTag="+i);
                                        }else {
                                           CatalystInstance uCatalystIns = uoc2.i().b();
                                           if (uCatalystIns == null) {
                                              d.i("ScreenCaptureToolbox captureViewToFile: current catalystInstance is null");
                                           }else if(uoc1 != null){
                                              a bundleConfig = uoc1.bundleConfigs;
                                              if (bundleConfig != null) {
                                                 uCaptureConf = bundleConfig.get(uoc2.b());
                                                 if (uCaptureConf != null) {
                                                 label_01f7 :
                                                    if (uCaptureConf == null) {
                                                       uCaptureConf = g.b().defaultConfig;
                                                    }
                                                    a.o(uCaptureConf, "captureConfig?.bundleCon\x20\x02localConfig.defaultConfig\x00");
                                                    NativeModule nativeModule = uCatalystIns.getNativeModule(UIManagerModule.class);
                                                    String str3 = uoc2.p();
                                                    a.o(str3, "krnContext.pageIdentify");
                                                    Iterator obj1 = PatchProxy.applyTwoRefs(str3, uCaptureConf, g, screenCaptur, "5");
                                                    if (obj1 != PatchProxyResult.class) {
                                                       i = obj1.intValue();
                                                    }else {
                                                       Integer integer = g.c().get(str3);
                                                       if (integer == null) {
                                                          integer = Integer.valueOf(0);
                                                       }
                                                       a.o(integer, "pageTimesRecord[pageId] ?: 0");
                                                       i = integer.intValue();
                                                       g.c().put(str3, Integer.valueOf((i + 1)));
                                                       i = i % uCaptureConf.timesLimit;
                                                    }
                                                    int i1 = i;
                                                    a.o(nativeModule, "uiManager");
                                                    ScreenCaptureToolbox$a uoa = new ScreenCaptureToolbox$a(nativeModule, p0, str3, i1, uCaptureConf.maxHeight, uCaptureConf.viewDepth, uCaptureConf.quality);
                                                    uoc11 = ScreenCaptureToolbox.c;
                                                    _monitor_enter(uoc11);
                                                    Boolean uBoolean1 = g.a().get(krnReactRoot);
                                                    if (uBoolean1 == null) {
                                                       uBoolean1 = Boolean.FALSE;
                                                    }
                                                    a.o(uBoolean1, "fmpFinishedRecord[rootView] ?: false");
                                                    if (uBoolean1.booleanValue()) {
                                                       objArray = ScreenCaptureToolbox.e;
                                                       ScreenCaptureToolbox.e = new ArrayList();
                                                    }else {
                                                       ScreenCaptureToolbox.e.add(i);
                                                    }
                                                    _monitor_exit(uoc11);
                                                    if (objArray != null) {
                                                       obj1 = objArray.iterator();
                                                       while (obj1.hasNext()) {
                                                          obj1.next().run();
                                                       }
                                                    }
                                                 }
                                              }
                                           }
                                           if (uoc1 != null) {
                                              uCaptureConf = uoc1.defaultConfig;
                                              goto label_01f7 ;
                                           }else {
                                              uCaptureConf = objArray;
                                              goto label_01f7 ;
                                           }
                                        }
                                     }
                                  }
                                  krnReactRoot = objArray;
                                  goto label_01b5 ;
                               }
                            }
                         }
                      }
                   }
                }else {
                label_02b5 :
                   b = this;
                }
             }else {
                goto label_02b5 ;
             }
             j.b.b(str, krnCoreRepor);
             return;
          }
       }
    }
    public void b(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "1")) {
          return;
       }
       j.b.b(p0, p1);
       return;
    }
    public void c(int p0,String p1,Object p2){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c$a.class, "2")) {
          return;
       }
       if (p0 <= 0) {
          d.i("reportCustomEventWithRootTag: rootTag="+p0+" key="+p1);
          return;
       }else {
          c uoc = d.b(p0);
          if (uoc == null) {
             d.i("reportCustomEventWithRootTag: rootTag "+p0+" context is null");
             return;
          }else {
             j.b.b(p1, new KrnCoreReportDataModel(uoc, p2));
             return;
          }
       }
    }
}
