package com.yxcorp.gifshow.location.a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.location.LocationActivity;
import android.view.View;
import vw8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import tyc.g;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import j2b.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.k1;
import java.util.Locale;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import java.io.InputStream;
import java.util.HashMap;
import fg6.a;
import java.io.InputStreamReader;
import tyc.f;
import java.lang.reflect.Type;
import el.a;
import java.io.Reader;
import com.google.gson.Gson;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import tyc.g$a;
import java.util.ArrayList;
import java.util.Map$Entry;
import java.util.Comparator;
import java.util.Collections;
import ekd.p;
import ba.a;
import tyc.e;
import android.content.Context;
import ea.e;
import com.yxcorp.gifshow.widget.a;
import ea.a;
import android.view.Window;
import android.view.ViewGroup;
import tyc.d;
import ea.d;
import ga.o;
import android.app.Dialog;
import ga.l;
import tyc.c;
import ea.c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.i5;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class a extends m	// class@001adf
{
    public final LocationActivity c;

    public void a(LocationActivity p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       int i;
       int i1;
       boolean b1;
       Iterator iterator;
       InputStream inputStream;
       Object obj = this;
       a uoa = a.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, a.class, str)) {
          return;
       }
       a c = obj.c;
       Objects.requireNonNull(c);
       String str1 = 1;
       if (!PatchProxy.applyVoid(null, c, LocationActivity.class, "14")) {
          g og = new g(c);
          og.m = false;
          og.n = false;
          if (!TextUtils.x(c.K)) {
             og.e = c.K;
          }
          og.h = new i(c);
          g og1 = g.class;
          if (!PatchProxy.applyVoid(null, og, og1, str)) {
             if (og.g == null) {
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (!PatchProxy.applyVoid(null, og, og1, "2")) {
                   String obj1 = PatchProxy.apply(null, og, og1, "10");
                   String str2 = 2;
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else {
                      Locale locale = 0x7f0f0007;
                      try{
                         if (k1.f()) {
                            obj1 = (Locale.getDefault().getCountry()).toUpperCase();
                            locale = (obj1.contains("TW") || obj1.contains("HK"))? 0x7f0f0009: 0x7f0f0008;
                         }
                      label_0099 :
                         inputStream = a.b().getResources().openRawResource(locale);
                         try{
                            HashMap hashMap = new HashMap();
                            Map map = a.a.g(new InputStreamReader(inputStream), new f(og).getType());
                            Iterator iterator2 = map.keySet().iterator();
                            while (iterator2.hasNext()) {
                               String str4 = iterator2.next();
                               List list2 = map.get(str4);
                               String str5 = list2.get(false);
                               g$a uoa2 = new g$a(list2.get(str1), str4);
                               List list3 = hashMap.get(str5);
                               if (list3 == null) {
                                  list3 = new ArrayList();
                                  hashMap.put(str5, list3);
                               }
                               list3.add(uoa2);
                               i1 = 1;
                            }
                            iterator = hashMap.entrySet().iterator();
                            while (iterator.hasNext()) {
                               Map$Entry uEntry = iterator.next();
                               og.b.add(new g$a(uEntry.getKey(), (uEntry.getValue().get(false).c).substring(false, str2)));
                               Collections.sort(uEntry.getValue(), og.a);
                            }
                            Collections.sort(og.b, og.a);
                            iterator = og.b.iterator();
                            while (iterator.hasNext()) {
                               og.c.add(hashMap.get(iterator.next().b));
                            }
                            if (inputStream != null) {
                               p.c(inputStream);
                            }
                            b = true;
                         }catch(java.lang.Exception e0){
                         }
                         if (inputStream) {
                            p.c(inputStream);
                         }
                         b = false;
                      }catch(java.lang.Exception e0){
                         inputStream = null;
                         goto label_017d ;
                      }
                   }
                   if (b) {
                      if (!PatchProxy.applyVoid(null, og, og1, "3")) {
                         if (og.m == null && !PatchProxy.applyVoid(null, og, og1, "4")) {
                            iterator = og.b.iterator();
                            String str3 = "--";
                            while (iterator.hasNext()) {
                               if (TextUtils.n(og.a(iterator.next().b), str3)) {
                                  iterator.remove();
                               }
                            }
                            iterator = og.c.iterator();
                            while (iterator.hasNext()) {
                               List list1 = iterator.next();
                               Iterator iterator1 = list1.iterator();
                               while (iterator1.hasNext()) {
                                  if (TextUtils.n(og.a(iterator1.next().b), str3)) {
                                     iterator1.remove();
                                  }
                               }
                               if (list1.isEmpty()) {
                                  iterator.remove();
                               }
                            }
                         }
                         if (og.n == null && !PatchProxy.applyVoid(null, og, og1, "5")) {
                            i1 = 0;
                            while (i1 < og.b.size()) {
                               g$a uoa1 = og.b.get(i1);
                               g$a c1 = uoa1.c;
                               String[] obj2 = PatchProxy.applyOneRefs(c1, og, og1, "6");
                               if (obj2 != patchProxyRe) {
                                  b1 = obj2.booleanValue();
                               }else {
                                  obj2 = g.o;
                                  int len = obj2.length;
                                  int i2 = 0;
                                  while (true) {
                                     if (i2 < len) {
                                        if (TextUtils.n(obj2[i2], c1)) {
                                           b1 = true;
                                        }else {
                                           i2 = i2 + 1;
                                        }
                                     }else {
                                        b1 = false;
                                     }
                                  }
                               }
                               if (b1) {
                                  List list = og.c.get(i1);
                                  list.clear();
                                  list.add(uoa1);
                               }
                               i1 = i1 + 1;
                            }
                         }
                      }
                      if (!PatchProxy.applyVoid(null, og, og1, "9")) {
                         str1 = "";
                         if (TextUtils.x(og.e)) {
                            if (og.i == null || og.j == null) {
                               i = og.b.indexOf(new g$a(str1, "11"));
                               og.i = i;
                               og.j = og.c.get(i).indexOf(new g$a(str1, "110108"));
                            }
                         }else if((og.e).length() > 1){
                            obj1 = (og.e).substring(false, str2);
                         }else {
                            obj1 = str1;
                         }
                         i = og.b.indexOf(new g$a(str1, obj1));
                         og.i = i;
                         if (i >= 0) {
                            og.j = og.c.get(i).indexOf(new g$a(str1, og.e));
                         }else {
                            og.i = 0;
                            og.j = 0;
                         }
                      }
                      if (!PatchProxy.applyVoid(null, og, og1, "8")) {
                         c = new a(og.d, new e(og));
                         c.h(R.layout.arg_RES_7f0d114b, new a(og));
                         c.d(20);
                         c.o(og.d.getResources().getColor(R.color.arg_RES_7f0607de));
                         c.p(og.d.getResources().getColor(R.color.arg_RES_7f0607de));
                         c.f(og.d.getResources().getColor(R.color.arg_RES_7f062006));
                         c.q(false, false, false);
                         c.i(2.60f);
                         c.e(og.d.getWindow().getDecorView());
                         c.l(og.i, og.j);
                         c.j(new d(og));
                         c.c(og.l);
                         o oo = c.a();
                         og.g = oo;
                         if (og.l != null) {
                            Window window = oo.e().getWindow();
                            if (window != null) {
                               window.setDimAmount(0.30f);
                               window.setGravity(80);
                               window.setWindowAnimations(R.style.arg_RES_7f1105dd);
                            }
                         }
                         og.g.c(R.id.optionspicker).setBackgroundResource(R.drawable.arg_RES_7f081ac7);
                         og.g.s(og.b, og.c);
                         og.g.m(new c(og));
                         ViewGroup$MarginLayoutParams layoutParams = og.g.f().getLayoutParams();
                         i = i5.b(og.d);
                         if (og.l != null) {
                            layoutParams.leftMargin = 0;
                            layoutParams.rightMargin = 0;
                         }else if(i){
                            layoutParams.bottomMargin = layoutParams.bottomMargin + i;
                         }
                         og.g.f().setLayoutParams(layoutParams);
                      }
                   }
                }
             }
          label_03bf :
             og1 = og.g;
             if (og1 != null) {
                og1.o();
             }
          }
       }
    label_03c6 :
       if (!PatchProxy.applyVoid(null, null, uoa, "71")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SELECT_CITY";
          u1.u0(4, uElementPack, null);
       }
       LocationActivity l = obj.c.L;
       if (!PatchProxy.applyVoidOneRefs(l, null, uoa, "70")) {
          u1.u(1, a.g(l), new ClientContent$ContentPackage());
       }
       return;
    }
}
