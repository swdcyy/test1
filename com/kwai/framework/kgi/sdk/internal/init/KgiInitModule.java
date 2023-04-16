package com.kwai.framework.kgi.sdk.internal.init.KgiInitModule;
import com.kwai.framework.kgi.sdk.internal.init.KgiBaseInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import trd.t;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.framework.kgi.sdk.internal.init.KgiInitModule$onBackground$1;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.kwai.framework.kgi.sdk.internal.init.KgiInitModule$onForeground$1;
import android.app.Activity;
import com.kwai.framework.kgi.sdk.internal.init.KgiInitModule$onHomeActivityDestroy$1;
import b76.a;
import s76.a;
import yb6.d;
import java.util.Objects;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import x76.a;
import android.os.Bundle;
import com.kwai.framework.kgi.sdk.internal.init.KgiInitModule$onHomeActivityCreate$1;
import y76.b;
import java.lang.Boolean;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import java.lang.StringBuilder;
import com.kwai.framework.kgi.sdk.internal.config.KgiSwitchConfig;
import u76.a;
import u76.a$a;
import y76.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import java.lang.Integer;
import com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigItem;

public final class KgiInitModule extends KgiBaseInitModule	// class@00159f
{

    public void KgiInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Object obj = PatchProxy.apply(null, this, KgiInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt___CollectionsKt.J5(t.k(SwitchConfigInitModule.class));
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, KgiInitModule.class, "7")) {
          return;
       }
       Kgi.c(KgiInitModule$onBackground$1.INSTANCE);
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, KgiInitModule.class, "8")) {
          return;
       }
       Kgi.c(KgiInitModule$onForeground$1.INSTANCE);
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KgiInitModule.class, "6")) {
          return;
       }
       Kgi.c(KgiInitModule$onHomeActivityDestroy$1.INSTANCE);
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KgiInitModule.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, KgiInitModule.class, "2")) {
          Objects.requireNonNull(a.e);
          a.c = d.a();
          KgiConfig.j();
       }
       a.b();
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KgiInitModule.class, "5")) {
          return;
       }
       Kgi.c(KgiInitModule$onHomeActivityCreate$1.INSTANCE);
       return;
    }
    public void n(){
    }
    public void n0(){
       boolean b;
       KgiChannelConfigItem kgiChannelCo;
       KgiSwitchConfig a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KgiInitModule.class, "4")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KgiConfig kgiConfig = KgiConfig.class;
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "5")) {
          int i = 2;
          b.b("KgiInit#initByFirstStartUpConfig  ==> ==>", false, i, objArray);
          KgiConfig g = KgiConfig.g;
          Objects.requireNonNull(g);
          a$a obj = PatchProxy.apply(objArray, g, kgiConfig, "6");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(KgiConfig.d == null){
             KgiConfig.d = g.h();
             b.e("KgiConfig#mCurrentStartUpConfig : = "+KgiConfig.d, false, i, objArray);
             KgiConfig.a = g.i();
             a = KgiConfig.a;
             if (a != null && a.enable == true) {
                b = true;
             }
          }
          b = false;
          b.b("KgiInit#initByFirstStartUpConfig : update = "+b, false, i, objArray);
          if (b) {
             if (!a.e()) {
                a.b();
             }else {
                obj = a.a;
                Objects.requireNonNull(obj);
                if (!PatchProxy.applyVoid(objArray, obj, a$a.class, "3")) {
                   boolean b1 = g.e();
                   b.e("KgiTerminate#handleStartUpConfigChanged : KgiConfig.isEnable = "+b1, false, i, objArray);
                   if (!b1) {
                      a.c(true);
                      c.e("NORMAL", "终止框架：StartUp主动关闭");
                   }else {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = a.d.a().iterator();
                      while (iterator.hasNext()) {
                         Object obj1 = iterator.next();
                         int i1 = obj1.intValue();
                         if (PatchProxy.isSupport(kgiConfig)) {
                            kgiChannelCo = PatchProxy.applyOneRefs(Integer.valueOf(i1), objArray, kgiConfig, "20");
                            if (kgiChannelCo != patchProxyRe) {
                            label_0101 :
                               Object obj2 = (kgiChannelCo.channelId != i1)? 1: null;
                               if (obj2) {
                                  uArrayList.add(obj1);
                               }
                            }
                         }
                         kgiChannelCo = KgiConfig.g.g(KgiConfig.d, i1);
                         goto label_0101 ;
                      }
                      Iterator iterator1 = uArrayList.iterator();
                      while (iterator1.hasNext()) {
                         int i2 = iterator1.next().intValue();
                         a.a.d(i2);
                         c.a(i2, "NORMAL", "终止通道：StartUp主动关闭");
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
