package uv8.r1;
import com.kwai.feature.api.platform.tracker.plugin.LeaveApplicationTracker;
import java.lang.Object;
import com.kuaishou.common.encryption.model.stats.LeaveAppStats$a;
import com.kuaishou.common.encryption.model.stats.LeaveAppStats;
import java.util.HashMap;
import k2b.h3;
import android.app.Activity;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hn5.n;
import hn5.m;
import android.content.Context;
import hn5.c;
import kn5.c;
import id5.u;
import com.yxcorp.utility.n;
import android.view.View;
import com.kwai.library.widget.deprecated.UnScrollableGridView;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import i27.b;
import androidx.fragment.app.Fragment;
import android.widget.AbsListView;
import android.widget.ScrollView;
import a2.i0;
import android.view.ViewGroup;
import android.os.SystemClock;
import crd.b;
import lnc.b9;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AppUsageStatEvent;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import android.view.Window;
import android.widget.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.kuaishou.common.encryption.model.a$a;
import java.lang.Math;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import java.lang.System;
import com.kuaishou.common.encryption.model.a;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.feature.api.platform.tracker.plugin.LeaveApplicationTracker$PageStay;
import com.google.gson.Gson;
import com.kwai.feature.api.platform.tracker.plugin.LeaveApplicationTracker$AppUsage;
import java.util.List;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.yxcorp.gifshow.z;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.yxcorp.gifshow.activity.x;

public class r1 implements LeaveApplicationTracker	// class@00263e
{
    public final LeaveAppStats$a a;
    public long b;
    public b c;
    public final Map d;
    public h3 e;
    public final Map f;
    public h3 g;
    public h3 h;

    public void r1(){
       super();
       this.a = LeaveAppStats.newBuilder();
       this.b = -1;
       this.d = new HashMap();
       this.f = new HashMap();
       this.h = new h3();
    }
    public static Float f(Activity p0){
       int i1;
       float f;
       c obj = PatchProxy.applyOneRefs(p0, null, r1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (m.a().U3(p0)) {
          obj = p0.I();
          if (obj != null) {
             i1 = obj.r();
          }else {
             f = 0;
          label_0037 :
             if (f - i < 0) {
                return null;
             }else {
                int i2 = n.j(p0);
                if (i2 <= 0) {
                   return null;
                }else {
                   return Float.valueOf((f / (float)i2));
                }
             }
          }
       }else if(p0 instanceof u){
          i1 = p0.r();
       }else {
          return null;
       }
       f = (float)i1;
       goto label_0037 ;
    }
    public static View g(View p0){
       Object obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r1 or1 = r1.class;
       Object obj = null;
       View obj1 = PatchProxy.applyOneRefs(p0, obj, or1, "14");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       try{
          if (p0 instanceof UnScrollableGridView) {
             return obj;
          }
          if (p0 instanceof ViewPager) {
             obj2 = PatchProxy.applyOneRefs(p0, obj, or1, "16");
             if (obj2 != patchProxyRe) {
                obj = obj2;
             }else {
                a adapter = p0.getAdapter();
                if (adapter instanceof b) {
                   Fragment uFragment = adapter.t();
                   if (uFragment != null && uFragment.getView() != null) {
                      obj = r1.g(uFragment.getView());
                   }
                }
             }
             return obj;
          }else if(p0 instanceof AbsListView || (!p0 instanceof ScrollView && (i0.e(p0, -1) || i0.e(p0, 1)))){
             return p0;
          }else if(p0 instanceof ViewGroup){
             obj2 = PatchProxy.applyOneRefs(p0, obj, or1, "15");
             if (obj2 != patchProxyRe) {
                obj = obj2;
             }else {
                int childCount = p0.getChildCount();
                int i = 0;
                while (i < childCount) {
                   obj1 = p0.getChildAt(i);
                   if (!obj1.getVisibility()) {
                      obj1 = r1.g(obj1);
                      if (obj1 != null) {
                         obj = obj1;
                         break ;
                      }
                   }
                   i = i + 1;
                }
             }
             return obj;
          }else {
             return obj;
          }
       }catch(java.lang.RuntimeException e0){
       }
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, r1.class, "10")) {
          return;
       }
       if (!this.b - -1) {
          this.b = SystemClock.elapsedRealtime();
       }
       return;
    }
    public void b(Context p0){
       boolean i1;
       long l;
       Object obj = this;
       a$a obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r1 or1 = r1.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, or1, "3")) {
          return;
       }
       if (!obj.b - -1) {
          return;
       }
       b9.a(obj.c);
       ClientStat$AppUsageStatEvent uAppUsageSta = new ClientStat$AppUsageStatEvent();
       if (obj1 instanceof GifshowActivity) {
          Integer integer = PatchProxy.applyOneRefs(obj1, null, or1, "13");
          int i = 0;
          if (integer != patchProxyRe) {
          }else {
             View view = r1.g(obj1.getWindow().getDecorView());
             if (view instanceof AbsListView) {
                integer = (view.getAdapter() == null)? Integer.valueOf(i): Integer.valueOf(view.getLastVisiblePosition());
             }else if(view instanceof RecyclerView){
                RecyclerView$LayoutManager layoutManage = view.getLayoutManager();
                integer = (layoutManage == null || layoutManage.getChildCount() <= 0)? Integer.valueOf(i): Integer.valueOf(layoutManage.getChildAt((layoutManage.getChildCount() - 1)).getLayoutParams().getViewAdapterPosition());
             }else {
                integer = null;
             }
          }
          Float uFloat = r1.f(obj1);
          r1 a = obj.a;
          String str = PatchProxy.applyOneRefs(obj1, null, or1, "11");
          if (str != patchProxyRe) {
          }else if(obj1 instanceof GifshowActivity){
             str = obj1.getUrl();
          }else {
             str = "ks://"+(obj1.getClass().getSimpleName()).replace("Activity", "");
          }
          obj1 = a.a;
          obj1.lastPageUri = str;
          obj1.scrollOutItemCount = integer;
          obj1.scrollOutScreenCount = uFloat;
          i1 = (integer == null)? 0: integer.intValue();
          uAppUsageSta.itemCountScrolled = i1;
          if (uFloat != null) {
             i = Math.round(uFloat.floatValue());
          }
          uAppUsageSta.screenCountScrolled = i;
          uAppUsageSta.urlPackage = u1.k();
       }
       i1 = false;
       try{
          l = Long.valueOf(QCurrentUser.me().getId()).longValue();
       }catch(java.lang.NumberFormatException e0){
          l = i1;
       }
       or1 = e0.a;
       a$a a1 = or1.a;
       a1.seqId = System.currentTimeMillis();
       a1.visitorId = l;
       or1.a.clientTimestamp = System.currentTimeMillis();
       or1.a.usageTime = TimeUnit.MILLISECONDS.toMillis((SystemClock.elapsedRealtime() - e0.b));
       uAppUsageSta.appUseTimeStart = e0.b;
       uAppUsageSta.appUseDuration = SystemClock.elapsedRealtime() - e0.b;
       ArrayList uArrayList = new ArrayList();
       e0.d.put("ks://system_invoke", e0.h);
       Iterator iterator = e0.d.entrySet().iterator();
       long l1 = i1;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          uEntry.getValue().a();
          l = uEntry.getValue().b();
          uArrayList.add(new LeaveApplicationTracker$PageStay(uEntry.getKey(), l));
          l1 = l1 + l;
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = e0.f.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry1 = iterator1.next();
          uEntry1.getValue().a();
          uArrayList1.add(new LeaveApplicationTracker$PageStay(uEntry1.getKey(), uEntry1.getValue().b()));
       }
       LeaveApplicationTracker$AppUsage uAppUsage = new LeaveApplicationTracker$AppUsage(l1, uAppUsageSta.appUseDuration, uArrayList, uArrayList1);
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       uAppUsageSta.detail = new Gson().q(iterator);
       statPackage.appUsageStatEvent = uAppUsageSta;
       u1.j0(statPackage);
       c.k(z.b);
       e0.f.clear();
       e0.d.clear();
       e0.g = null;
       e0.e = null;
       e0.h = new h3();
       e0.b = -1;
       return;
    }
    public long c(){
       return this.b;
    }
    public void d(Activity p0){
    }
    public final h3 e(Activity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r1 or1 = r1.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, or1, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = PatchProxy.applyOneRefs(p0, this, or1, "4");
       if (str != patchProxyRe) {
       }else if(p0 instanceof GifshowActivity){
          x ox = p0.N2();
          str = ox.M()+"/"+ox.getPage();
       }else if(p0 == null){
          str = "background";
       }else {
          str = p0.getClass().getSimpleName();
       }
       h3 oh3 = this.d.get(str);
       if (oh3 == null) {
          oh3 = new h3();
          this.d.put(str, oh3);
       }
       return oh3;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "9")) {
          return;
       }
       this.h.c();
       this.e(p0).a();
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "8")) {
          return;
       }
       r1 te = this.e;
       if (te != null) {
          te.a();
       }
       h3 oh3 = this.e(p0);
       oh3.c();
       this.h.a();
       this.e = oh3;
       return;
    }
}
