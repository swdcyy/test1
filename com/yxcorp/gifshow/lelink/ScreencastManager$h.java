package com.yxcorp.gifshow.lelink.ScreencastManager$h;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import xza.a;
import trd.u;
import com.yxcorp.gifshow.lelink.LelinkDeviceState;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.os.Handler;
import java.lang.Runnable;
import wza.c;
import ekd.k1;

public final class ScreencastManager$h implements IBrowseListener	// class@001a38
{
    public final ScreencastManager a;

    public void ScreencastManager$h(ScreencastManager p0){
       this.a = p0;
       super();
    }
    public final void onBrowse(int p0,List p1){
       String obj2;
       String name;
       Iterator obj3;
       String ip;
       Object obj4;
       ScreencastManager g2;
       a b;
       ScreencastManager$h oh = ScreencastManager$h.class;
       String str = "1";
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, str)) {
          return;
       }
       oh = this.a;
       Objects.requireNonNull(oh);
       ScreencastManager screencastMa = ScreencastManager.class;
       if (!PatchProxy.isSupport(screencastMa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, oh, screencastMa, "11")) {
          KLogLelink$a e = KLogLelink.e;
          Object[] objArray = new Object[0];
          e.a().w(oh.a, "onSearchDevicesResult: "+p0, objArray);
          if (p0 == -1) {
             Object[] objArray1 = new Object[0];
             e.a().w(oh.a, "投屏功能鉴权失败", objArray1);
          }else if(p0 == 1){
             ArrayList uArrayList = (p1 == null || p1.isEmpty())? 1: null;
             if (!uArrayList) {
                uArrayList = new ArrayList();
                Iterator iterator = p1.iterator();
                ScreencastManager obj = null;
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   obj2 = obj1;
                   name = obj2.getName();
                   a.o(name, "serviceInfo.name");
                   if (!StringsKt__StringsKt.O2(name, "云视听快TV", 0, 2, obj)) {
                      obj = oh.f;
                      if (!obj instanceof Collection || !obj.isEmpty()) {
                         obj3 = obj.iterator();
                         while (true) {
                            if (obj3.hasNext()) {
                               a uoa = obj3.next();
                               name = (a.g(uoa.a().getIp(), obj2.getIp()) && a.g(uoa.a().getName(), obj2.getName()))? 1: null;
                               if (name) {
                                  obj3 = 1;
                                  break ;
                               }
                            }
                         }
                         if (!obj) {
                            obj3 = 1;
                         label_00eb :
                            if (obj3) {
                               uArrayList.add(obj1);
                            }
                         }
                      }
                      obj = 0;
                      goto label_00e6 ;
                   }
                   obj3 = null;
                   goto label_00eb ;
                }
                ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   uArrayList1.add(new a(iterator1.next(), LelinkDeviceState.Normal));
                }
                oh.f.addAll(CollectionsKt___CollectionsKt.J5(uArrayList1));
                iterator1 = oh.f.iterator();
                while (iterator1.hasNext()) {
                   uArrayList1 = iterator1.next();
                   obj2 = uArrayList1;
                   name = obj2.a().getIp();
                   ScreencastManager g = oh.g;
                   if (g != null) {
                      LelinkServiceInfo lelinkServic = g.a();
                      if (lelinkServic != null) {
                         ip = lelinkServic.getIp();
                      label_014b :
                         if (a.g(name, ip)) {
                            obj2 = obj2.a().getName();
                            ScreencastManager g1 = oh.g;
                            if (g1 != null) {
                               LelinkServiceInfo lelinkServic1 = g1.a();
                               if (lelinkServic1 != null) {
                                  name = lelinkServic1.getName();
                               label_0169 :
                                  if (a.g(obj2, name)) {
                                     obj4 = 1;
                                  label_0172 :
                                     if (obj4) {
                                        obj = uArrayList1;
                                        break ;
                                     }
                                  }
                               }
                            }
                            name = obj;
                            goto label_0169 ;
                         }
                         obj4 = null;
                         goto label_0172 ;
                      }
                   }
                   ip = obj;
                   goto label_014b ;
                }
                if (obj != null) {
                   g2 = oh.g;
                   if (g2 != null) {
                      b = g2.b;
                      if (b != null) {
                      label_0184 :
                         if (!PatchProxy.applyVoidOneRefs(b, obj, a.class, str)) {
                            a.p(b, "<set-?>");
                            obj.b = b;
                         }
                      }
                   }
                   b = LelinkDeviceState.Normal;
                   goto label_0184 ;
                }
                g2 = oh.f;
                uArrayList1 = new ArrayList(u.Y(g2, 10));
                iterator1 = g2.iterator();
                while (iterator1.hasNext()) {
                   uArrayList1.add(iterator1.next().a().getName());
                }
                Object[] objArray2 = new Object[0];
                KLogLelink.e.a().w(oh.a, "searched devices: "+oh.f, objArray2);
                oh.f().removeCallbacks(oh.v);
                k1.o(new c(oh));
             }
          }
       }
       return;
    }
}
