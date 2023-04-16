package com.yxcorp.gifshow.homeroot.NasaSpeedUpInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Activity;
import wkd.b;
import lwb.l;
import java.util.Objects;
import java.util.Map;
import java.util.Collection;
import wjd.e;
import wjd.e$a;
import kotlin.jvm.internal.a;
import wjd.d;
import java.lang.Runnable;
import t45.c;
import tra.b;
import q87.c;
import android.os.Bundle;
import uv8.m1;
import com.yxcorp.gifshow.HomeActivity;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import lnc.k4;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ida.b;
import java.lang.Integer;
import wjd.c;
import android.content.res.Resources;
import com.yxcorp.gifshow.w;
import uv8.e1;
import yxb.b;
import sa5.c;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Set;
import java.lang.StringBuilder;
import lwb.k;
import lwb.l$a;
import oxa.a;
import android.os.Looper;
import android.os.HandlerThread;
import android.content.Context;
import oxa.i;
import oxa.b;
import lwb.d;
import android.view.ViewGroup;
import oxa.i$e;
import a1.a;
import lwb.c;
import a1.a$e;

public class NasaSpeedUpInitModule extends HomeCreateInitModule	// class@001814
{
    public boolean q;

    public void NasaSpeedUpInitModule(){
       super();
    }
    public int f0(){
       return 14;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, NasaSpeedUpInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void j0(Activity p0){
       e$a b;
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaSpeedUpInitModule.class, "2")) {
          return;
       }
       l ol = b.a(0x7adf6d3b);
       Objects.requireNonNull(ol);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ol, l.class, "6")) {
          ol.a.clear();
          if (ol.c != null) {
             ArrayList uArrayList = new ArrayList(ol.c.values());
             ol.c = objArray;
             if (!PatchProxy.applyVoidOneRefs(uArrayList, objArray, e.class, "3")) {
                b = e.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidOneRefs(uArrayList, b, e$a.class, "1")) {
                   a.p(uArrayList, "monitors");
                   c.a(new d(uArrayList));
                }
             }
          }
          Object[] objArray1 = new Object[0];
          b.C().y("LayoutAsyncFactory", "layout_async_clear", objArray1);
       }
       return;
    }
    public void l0(Activity p0,Bundle p1){
       boolean b1;
       Integer integer;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, NasaSpeedUpInitModule.class, "1")) {
          return;
       }
       if (!obj1 instanceof HomeActivity) {
          return;
       }
       int i = a.o0(obj1).p0();
       boolean b = 4;
       if (i != 3 && i != b) {
          return;
       }
       if (obj.q == null) {
          obj.q = true;
          ImmutableMap$b uob = ImmutableMap.builder();
          ImmutableMap$b uob1 = ImmutableMap.builder();
          String str = "featured";
          if (!k4.a()) {
             Integer obj2 = PatchProxy.apply(null, null, m1.class, "13");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else if(m1.l == null){
                b1 = (m1.c() & 0x02)? true: false;
                m1.l = Boolean.valueOf(b1);
             }
             Boolean l = m1.l;
             a.m(l);
             b1 = l.booleanValue();
             if (!b1) {
             label_00ae :
                obj2 = PatchProxy.apply(null, null, m1.class, "14");
                if (obj2 != PatchProxyResult.class) {
                   b = obj2.booleanValue();
                }else if(m1.m == null){
                   b = (b & m1.c())? true: false;
                   m1.m = Boolean.valueOf(b);
                }
                Boolean obj3 = m1.m;
                a.m(obj3);
                b = obj3.booleanValue();
                b1 = -430326918;
                if (b) {
                   b = d.a(b1).ma();
                   uob.c(Integer.valueOf(b), "NasaMilanoProgress");
                   integer = Integer.valueOf(b);
                   uob1.c(integer, new c(str, p0.getResources().getResourceEntryName(b)));
                   b.a(-1343064608).z().r();
                }
                b = d.a(b1).Uv();
                uob.c(Integer.valueOf(b), "NsDeSlidePlayVMLayout");
                obj2 = Integer.valueOf(b);
                uob1.c(obj2, new c(str, p0.getResources().getResourceEntryName(b)));
                c uoc = b.a(0x7adf6d3b);
                ImmutableMap immutableMap = uob.a();
                ImmutableMap immutableMap1 = uob1.a();
                Objects.requireNonNull(uoc);
                ImmutableMap immutableMap2 = immutableMap1;
                ImmutableMap immutableMap3 = immutableMap1;
                if (!PatchProxy.applyVoidThreeRefs(p0, immutableMap, immutableMap2, uoc, l.class, "2")) {
                   uoc.b = new c(immutableMap);
                   uoc.d = b.a(-1343064608);
                   uoc.c = immutableMap3;
                   Iterator iterator = immutableMap.keySet().iterator();
                   while (iterator.hasNext()) {
                      int i1 = iterator.next().intValue();
                      l ol = l.class;
                      if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(i1), uoc, ol, "4")) {
                         continue ;
                      }else {
                         Object[] objArray = new Object[0];
                         b.C().y("LayoutAsyncFactory", "layout_async_doing:"+i1, objArray);
                         ol = uoc.b;
                         if (ol != null) {
                            ol.b(i1);
                         }
                         uoc.c(i1, k.a);
                         obj3 = PatchProxy.apply(null, null, m1.class, "15");
                         if (obj3 != PatchProxyResult.class) {
                            b = obj3.booleanValue();
                         }else if(m1.n == null){
                            b = m1.c() & 0x08;
                            b = (b)? true: false;
                            m1.n = Boolean.valueOf(b);
                         }
                         obj3 = m1.n;
                         a.m(obj3);
                         b = obj3.booleanValue();
                         Object[] objArray1 = new Object[0];
                         b.C().w("LayoutAsyncFactory", "usePriorityAsyncInflater:"+b, objArray1);
                         if (b) {
                            b.a(obj1, a.a().getLooper()).a(i1, null, new d(uoc, i1));
                         }else {
                            new a(obj1).b(i1, null, new c(uoc, i1));
                         }
                      }
                   }
                }
             }
          }
          b1 = d.a(-859095268).zF();
          uob.c(Integer.valueOf(b1), "NasaSlidePlayFragment");
          integer = Integer.valueOf(b1);
          uob1.c(integer, new c(str, p0.getResources().getResourceEntryName(b1)));
          b.a(-1343064608).z().G();
          goto label_00ae ;
       }
       return;
    }
    public void n(){
    }
}
