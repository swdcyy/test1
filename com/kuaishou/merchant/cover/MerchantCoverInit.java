package com.kuaishou.merchant.cover.MerchantCoverInit;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rt3.c;
import java.util.Objects;
import yb6.d;
import su.o;
import android.app.Activity;
import mv3.c;
import kv.c;
import android.content.SharedPreferences;
import java.util.Set;
import vid.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import yz7.e;
import kv.b;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import com.kuaishou.bowl.data.center.data.model.ControlInfoItem;
import java.lang.System;
import java.lang.StringBuilder;
import nv.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Exception;
import java.util.HashMap;
import pv.a;
import java.util.Map;
import b76.a;
import ja4.b;
import com.kuaishou.merchant.cover.c;
import com.kuaishou.merchant.cover.c$a;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import com.kuaishou.merchant.cover.b;
import t08.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zf6.h;
import brd.t;
import t45.d;
import brd.z;
import mv3.a;
import erd.g;
import crd.b;
import eda.n;
import com.kuaishou.merchant.cover.a;
import qv.c;

public class MerchantCoverInit extends a	// class@0008e7
{
    public static final int q;

    public void MerchantCoverInit(){
       super();
    }
    public int f0(){
       return 7;
    }
    public void i0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantCoverInit.class, "6")) {
          return;
       }
       c uoc = c.a();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "5") && ((d.a() - uoc.a) - 0x493e0 > 0 && o.c().a != null)) {
          o.c().r(false);
          uoc.a = d.a();
       }
    label_0042 :
       return;
    }
    public void j0(Activity p0){
       int i;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantCoverInit.class, "5")) {
          return;
       }
       c.d().g(p0);
       if (!PatchProxy.applyVoid(null, null, c.class, "3") && c.c() != null) {
          try{
             Set set = b.a(c.c());
             if (set != null && set.size()) {
                ArrayList uArrayList = new ArrayList();
                i = 0;
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   if (TextUtils.x(str)) {
                      continue ;
                   }else {
                      String str1 = c.b(str);
                      if (TextUtils.x(str1)) {
                         continue ;
                      }else {
                         List list = e.c().i(str1, new b().getType());
                         if (list == null || !list.size()) {
                         }else {
                            Iterator iterator1 = list.iterator();
                            while (true) {
                               if (iterator1.hasNext()) {
                                  ControlInfoItem uControlInfo = iterator1.next();
                                  if (uControlInfo != null && uControlInfo.cacheDuration - System.currentTimeMillis() > 0) {
                                     b = false;
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  b = true;
                               }
                               if (b && !TextUtils.x(str)) {
                                  uArrayList.add(str);
                               }
                            }
                         }
                      }
                   }
                }
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   String str2 = iterator.next();
                   c.f("removeControlInfo£¬ key: "+str2);
                   g.a(c.c().edit().remove(str2));
                }
             }
          }catch(java.lang.Exception e11){
             String[] stringArray = new String[]{"msg"};
             String[] stringArray1 = new String[1];
             stringArray1[i] = e11.getMessage();
             c.d("removeControlInfo error", a.a(stringArray, stringArray1));
          }
       }
    }
    public void k0(a p0){
       Application b;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantCoverInit.class, "3")) {
          return;
       }
       c uoc = c.a();
       Objects.requireNonNull(uoc);
       Object[] objArray = null;
       String str = "1";
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, str)) {
          uoc.b();
       }
       b uob = b.a();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, str)) {
          uob.b();
       }
       if (!PatchProxy.applyVoid(objArray, this, MerchantCoverInit.class, "4")) {
          c.d().e();
       }
       c$a a = c.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, c$a.class, str)) {
          TroubleShooting a1 = TroubleShooting.a;
          b = a.B;
          Objects.requireNonNull(a1);
          a.p(b, "application");
          TroubleShooting.e = a.d();
          a1.H(b);
          a1.I(new b());
       }
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantCoverInit.class, "1")) {
          return;
       }
       c uoc = c.d();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "8")) {
          RxBus f = RxBus.f;
          z a = d.a;
          f.f(h.class).observeOn(a).subscribe(new a(uoc));
          f.f(n.class).observeOn(a).subscribe(a.b);
       }
       uoc = c.a();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "2")) {
          c.f("MerchantBowlInit execute");
          o oo = o.c();
          c uoc1 = new c();
          Objects.requireNonNull(oo);
          if (!PatchProxy.applyVoidOneRefs(uoc1, oo, o.class, "3")) {
             oo.k = uoc1;
             c.f("SuperBowl-registerSpbLive");
          }
       }
       return;
    }
}
