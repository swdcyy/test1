package com.kuaishou.merchant.bowl.BundlePreloadUtil;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import android.net.Uri;
import pv.b;
import com.kuaishou.bowl.event.utils.StageName;
import com.kuaishou.merchant.bowl.BundlePreloadUtil$3;
import java.util.Map;
import fv.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.bowl.BundlePreloadUtil$2;
import tx4.f;
import com.kuaishou.pagedy.PageDy;
import ja4.b;
import su.o;
import rt3.c;
import java.lang.Integer;
import com.kuaishou.tk.api.a;
import rt3.b;
import android.os.Build$VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import rt3.a;
import android.os.MessageQueue$IdleHandler;
import js6.a;
import hu4.j;
import java.lang.Exception;
import nv.c;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import wu4.a;

public class BundlePreloadUtil	// class@001606
{

    public void BundlePreloadUtil(){
       super();
    }
    public static void a(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, BundlePreloadUtil.class, "8")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          c.l(StageName.pgy_bundle_preload_start, p0, b.a().b(p0, "PageDy"), new BundlePreloadUtil$3(Uri.parse(str).getQueryParameter("bundleId")));
          if (PatchProxy.applyVoidTwoRefs(str, p0, null, BundlePreloadUtil.class, "5") || TextUtils.isEmpty(str)) {
             continue ;
          }else {
             BundlePreloadUtil.b(str, new BundlePreloadUtil$2(p0));
          }
       }
       return;
    }
    public static void b(String p0,f p1){
       BundlePreloadUtil uBundlePrelo = BundlePreloadUtil.class;
       String obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uBundlePrelo, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(obj, obj, uBundlePrelo, "1")) {
          if (PageDy.e().b == null) {
             b.a().b();
          }
          if (o.c().h == null) {
             c.a().b();
          }
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }else {
          Uri uri = Uri.parse(p0);
          String queryParamet = uri.getQueryParameter("bundleId");
          obj = uri.getQueryParameter("minVersion");
          if (TextUtils.isEmpty(obj)) {
             obj = uri.getQueryParameter("minBundleVersion");
          }
          int i = (TextUtils.isEmpty(obj))? -1: Integer.parseInt(obj);
          if (TextUtils.isEmpty(queryParamet)) {
             return;
          }else {
             a.a(queryParamet, i, true, p1);
             return;
          }
       }
    }
    public static void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, BundlePreloadUtil.class, "7")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (PatchProxy.applyVoidOneRefs(str, null, BundlePreloadUtil.class, "4")) {
             continue ;
          }else {
             BundlePreloadUtil.b(str, new b());
          }
       }
       return;
    }
    public static void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, BundlePreloadUtil.class, "3")) {
          return;
       }
       if (p0.size()) {
          try{
             if (Build$VERSION.SDK_INT >= 23) {
                Looper.getMainLooper().getQueue().addIdleHandler(new a(p0));
             }else {
                a.b.L6(j.c(p0));
             }
          }catch(java.lang.Exception e3){
             String str = (TextUtils.isEmpty(e3.getMessage()))? "‘§º”‘ÿ ß∞‹": e3.getMessage();
             c.b(str);
          }
       }
    }
    public static void e(FragmentActivity p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, BundlePreloadUtil.class, "2")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          a a = uoa.a;
          if (a != null && a.startsWith("kwai://tk")) {
             uArrayList.add(uoa.a);
          }else {
             uArrayList1.add(uoa);
          }
       }
       BundlePreloadUtil.c(uArrayList);
       BundlePreloadUtil.d(uArrayList1);
       return;
    }
}
