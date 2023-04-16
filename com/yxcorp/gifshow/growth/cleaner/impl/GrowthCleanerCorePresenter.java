package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$e;
import gna.a;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qrd.l1;
import java.util.ArrayList;
import java.lang.String;
import kotlin.jvm.internal.a;
import fna.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ena.j;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import java.lang.CharSequence;
import android.widget.TextView;
import fna.g;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$1;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$2;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$3;
import fna.h;
import msd.l;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$5;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$6;
import msd.a;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$a;
import android.app.Activity;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$backward$1;
import pna.a;
import ena.h;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$a;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import android.app.Service;
import vma.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.widget.Toast;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1;
import com.yxcorp.gifshow.util.PermissionUtils;
import uf0.c;
import android.app.Dialog;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$checkPermissionToDo$onErrorOrComplete$1;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$b;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$c;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$d;
import erd.a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory;
import fna.j$e;
import java.util.List;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateTitleFileSize$1;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateTitleFileSize$2;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import gna.b$d;
import cra.c0;
import java.lang.Long;
import gna.b$a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import gna.b;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateTitleFileSizeList$1;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateTitleFileSizeList$2;
import java.util.Iterator;
import java.lang.Iterable;
import fna.j$h;
import fna.j$g;
import fna.j$d;
import fna.j$c;
import fna.j$a;
import fna.j$b;
import fna.j$f;
import androidx.recyclerview.widget.RecyclerView;
import gna.b$b;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import java.lang.ref.WeakReference;
import gna.d;
import gna.d$a;
import gna.c;
import nsd.r0;
import fna.f;
import java.util.Arrays;
import kotlin.Pair;
import ena.j$a;
import java.util.Objects;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerCircle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import io.reactivex.subjects.PublishSubject;

public final class GrowthCleanerCorePresenter extends PresenterV2	// class@001331
{
    public boolean A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public GrowthCleanerService$a F;
    public PublishSubject p;
    public ArrayList q;
    public ArrayList r;
    public final GrowthCleanerCorePresenter$e s;
    public j t;
    public a u;
    public final a v;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;

    public void GrowthCleanerCorePresenter(){
       super();
       GrowthCleanerCorePresenter$e uoe = new GrowthCleanerCorePresenter$e(this);
       this.s = uoe;
       a uoa = new a(new GrowthCleanerLayout());
       uoa.F0(uoe);
       this.v = uoa;
       this.w = true;
       this.y = -1;
       this.C = 0xbf800000;
       this.D = 0xbf800000;
       this.E = 0xbf800000;
    }
    public static final ArrayList P8(GrowthCleanerCorePresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mCleanerAdapterDataObservers");
       }
       return p0;
    }
    public static void b9(GrowthCleanerCorePresenter p0,j p1,int p2,Object p3){
       p0.a9(null);
    }
    public void E8(){
       j n;
       j a;
       GrowthCleanerCorePresenter growthCleane = GrowthCleanerCorePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, growthCleane, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, growthCleane, "8")) {
          growthCleane = this.t;
          if (growthCleane != null) {
             a = growthCleane.a;
             if (a != null) {
                n = growthCleane.b;
                if (n != null) {
                   n.setText(GrowthCleanerHelper.c(R.string.arg_RES_7f100594));
                   a.setOnClickListener(new g(this));
                }
             }
          }
       }
       growthCleane = this.t;
       if (growthCleane != null) {
          n = growthCleane.n;
          if (n != null) {
             n.setOnClickListener(new GrowthCleanerCorePresenter$onBind$1(this));
          }
       }
       growthCleane = this.t;
       if (growthCleane != null) {
          n = growthCleane.v;
          if (n != null) {
             n.setOnClickListener(new GrowthCleanerCorePresenter$onBind$2(this));
          }
       }
       GrowthCleanerCorePresenter.b9(this, objArray, 1, objArray);
       growthCleane = this.p;
       if (growthCleane == null) {
          a.S("mCleanerEventSubject");
       }
       b uob = growthCleane.subscribe(new h(new GrowthCleanerCorePresenter$onBind$3(this)));
       if (uob != null) {
          this.X7(uob);
       }
       growthCleane = this.q;
       if (growthCleane == null) {
          a.S("mCleanerBackwardListeners");
       }
       growthCleane.add(new GrowthCleanerCorePresenter$onBind$5(this));
       this.W8(new GrowthCleanerCorePresenter$onBind$6(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCorePresenter.class, "11")) {
          return;
       }
       this.V8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCorePresenter.class, "7")) {
          return;
       }
       this.V8();
       return;
    }
    public final boolean R8(Fragment p0){
       String str;
       p0 = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCorePresenter.class, "13");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       GrowthCleanerCorePresenter tF = this.F;
       GrowthCleanerService growthCleane = (tF != null)? tF.a(): null;
       Activity activity = this.getActivity();
       boolean b = true;
       if (activity != null && (growthCleane == null || (growthCleane.e == null && (!growthCleane.b() && this.x == null)))) {
          if (this.A != null && this.B == null) {
             h.d(this.getActivity(), b, this.z, this.D, this.C);
          }
          b = false;
       }else if(growthCleane.b()){
          str = GrowthCleanerHelper.c(R.string.arg_RES_7f100598);
       }else {
          str = GrowthCleanerHelper.c(R.string.arg_RES_7f100597);
       }
       a.b(activity, GrowthCleanerHelper.c(R.string.arg_RES_7f100594), str, GrowthCleanerHelper.c(R.string.arg_RES_7f1007e2), null, new GrowthCleanerCorePresenter$backward$1(this), 8, null);
       return b;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCorePresenter.class, "10")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "activity ?: return");
          a.a(activity, new Intent(activity, GrowthCleanerService.class), new GrowthCleanerCorePresenter$a(this), 1);
       }
       return;
    }
    public final boolean V8(){
       GrowthCleanerCorePresenter obj = PatchProxy.apply(null, this, GrowthCleanerCorePresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       if (obj != null) {
          GrowthCleanerService growthCleane = obj.a();
          if (growthCleane != null) {
             growthCleane.stopSelf();
          }
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return true;
    }
    public final void W8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerCorePresenter.class, "9")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "activity ?: return");
          if (!b.a()) {
             return;
          }else {
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             Toast toast = Toast.makeText(activity.getApplicationContext(), "", 0);
             a.o(toast, "Toast.makeText\(activity.бн \"\", Toast.LENGTH_SHORT \)");
             objectRef.element = toast;
             GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1 uocheckPermi = new GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1(activity, p0, objectRef);
             String str = "android.permission.WRITE_EXTERNAL_STORAGE";
             if (PermissionUtils.a(activity, str)) {
                uocheckPermi.invoke();
             }else {
                c uoc = new c(activity, 0x7f103bd6, 0x7f10059c);
                uoc.show();
                GrowthCleanerCorePresenter$checkPermissionToDo$onErrorOrComplete$1 uocheckPermi1 = new GrowthCleanerCorePresenter$checkPermissionToDo$onErrorOrComplete$1(uoc);
                this.X7(PermissionUtils.f(activity, str).subscribe(new GrowthCleanerCorePresenter$b(activity, uocheckPermi), new GrowthCleanerCorePresenter$c(uocheckPermi1), new GrowthCleanerCorePresenter$d(uocheckPermi1)));
             }
          }
       }
       return;
    }
    public final void X8(GrowthCleanerLayout p0,GrowthCleanerCategory p1,j$e p2){
       GrowthCleanerCategory growthCleane = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthCleanerCorePresenter.class, "19")) {
          return;
       }
       List list = p1.filterAppList(p2);
       b$d uod = GrowthCleanerLayout.a(p0, p1.getTitle(), null, null, false, p1.getDescription(p2), null, true, null, false, new GrowthCleanerCorePresenter$inflateTitleFileSize$1(list, growthCleane), new GrowthCleanerCorePresenter$inflateTitleFileSize$2(list, growthCleane), 430, null);
       uod.t(new c0(null, Long.valueOf(p1.getSize(p2)), Boolean.valueOf(uod.l()), GrowthCleanerTag.UNDEFINED));
       return;
    }
    public final void Y8(GrowthCleanerLayout p0,GrowthCleanerCategory p1,j$e p2){
       GrowthCleanerCategory growthCleane = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthCleanerCorePresenter.class, "20")) {
          return;
       }
       List list = p1.filterAppList(p2);
       b$d uod = GrowthCleanerLayout.a(p0, p1.getTitle(), null, null, false, p1.getDescription(p2), null, true, null, false, new GrowthCleanerCorePresenter$inflateTitleFileSizeList$1(list, growthCleane), new GrowthCleanerCorePresenter$inflateTitleFileSizeList$2(this, list, growthCleane), 430, null);
       uod.t(new c0(null, Long.valueOf(p1.getSize(p2)), Boolean.valueOf(uod.l()), GrowthCleanerTag.UNDEFINED));
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCorePresenter.class, "18")) {
          return;
       }
       GrowthCleanerCorePresenter tr = this.r;
       if (tr == null) {
          a.S("mCleanerAdapterDataObservers");
       }
       Iterator iterator = tr.iterator();
       while (iterator.hasNext()) {
          iterator.next().g();
       }
       return;
    }
    public final void a9(j p0){
       String str;
       GrowthCleanerCorePresenter growthCleane3;
       GrowthCleanerCorePresenter u1;
       GrowthCleanerCategory[] growthCleane4;
       int len1;
       a uoa = this;
       a obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, uoa, GrowthCleanerCorePresenter.class, "15")) {
          return;
       }
       GrowthCleanerCorePresenter t = uoa.t;
       if (t != null) {
          j s = t.s;
          if (s != null && t != null) {
             j n = t.n;
             if (n != null && t != null) {
                j j = t.j;
                if (j != null) {
                   object obj1 = null;
                   n.setTag(obj1);
                   v6 = obj instanceof j$h;
                   boolean b = false;
                   if (v6 || obj instanceof j$g) {
                      str = GrowthCleanerHelper.c(R.string.arg_RES_7f1005a1);
                   }else if(obj instanceof j$d || obj instanceof j$c){
                      str = GrowthCleanerHelper.c(R.string.arg_RES_7f100596);
                   }else if(obj instanceof j$a || obj instanceof j$b){
                      n.setTag(Integer.valueOf(b));
                      str = GrowthCleanerHelper.c(R.string.arg_RES_7f10059d);
                   }else {
                      n.setTag(Integer.valueOf(b));
                      str = GrowthCleanerHelper.c(R.string.arg_RES_7f1005a0);
                   }
                   n.setText(str);
                   GrowthCleanerCorePresenter growthCleane = (obj != null && (!obj instanceof j$f && (!obj instanceof j$a && !obj instanceof j$b)))? 1: null;
                   if (!growthCleane) {
                      n.setEnabled(true);
                      uoa.d9(0);
                      j.setVisibility(8);
                      s.setAdapter(uoa.v);
                      uoa.u = uoa.v;
                      this.Z8();
                      return;
                   }else {
                      n.setEnabled(b);
                      growthCleane = uoa.u;
                      b$b uob = (growthCleane != null)? growthCleane.J0(): obj1;
                      GrowthCleanerLayout growthCleane1 = new GrowthCleanerLayout(uob);
                      GrowthCleanerCategory[] growthCleane2 = GrowthCleanerCategory.values();
                      int len = growthCleane2.length;
                      int i = 0;
                      while (i < len) {
                         object oobject = growthCleane2[i];
                         String title = oobject.getTitle();
                         obj1 = oobject;
                         GrowthCleanerLayout.a(growthCleane1, title, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2046, 0).n(obj1.getSizeText(obj));
                         i = i + 1;
                         len = len;
                         growthCleane3 = null;
                      }
                      growthCleane3 = uoa.u;
                      if (growthCleane3 == null || a.g(growthCleane3, uoa.v)) {
                         obj = new a(growthCleane1);
                         obj.F0(uoa.s);
                         s.setAdapter(obj);
                         uoa.u = obj;
                         this.Z8();
                      }else if(v6 || obj instanceof j$d){
                         u1 = uoa.u;
                         if (u1 != null) {
                            u1.k0();
                         }
                      }
                      u1 = uoa.u;
                      if (u1 != null && !PatchProxy.applyVoidOneRefs(obj, u1, a.class, "2")) {
                         LinkedHashMap linkedHashMa = new LinkedHashMap();
                         Iterator iterator = u1.h.entrySet().iterator();
                         while (iterator.hasNext()) {
                            Map$Entry uEntry = iterator.next();
                            b key = uEntry.getKey();
                            d uod = uEntry.getValue().get();
                            b uob1 = (uod != null)? uod.e(): null;
                            if (a.g(key, uob1)) {
                               linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
                            }
                         }
                         iterator = linkedHashMa.entrySet().iterator();
                         while (iterator.hasNext()) {
                            Map$Entry uEntry1 = iterator.next();
                            growthCleane4 = GrowthCleanerCategory.values();
                            len1 = growthCleane4.length;
                            int i1 = 0;
                            while (i1 < len1) {
                               object oobject1 = growthCleane4[i1];
                               if (a.g(uEntry1.getKey().i(), oobject1.getTitle())) {
                                  d uod1 = uEntry1.getValue().get();
                                  if (uod1 != null && uod1 instanceof d$a) {
                                     uod1.o(oobject1.getSizeText(obj));
                                     if (u1.f != null) {
                                        uod1.n();
                                     }else {
                                        uod1.k();
                                     }
                                  }
                               }
                               i1 = i1 + 1;
                            }
                         }
                         a i2 = u1.i;
                         if (i2 != null) {
                            b uob2 = i2.e();
                            if (uob2 != null) {
                               growthCleane4 = GrowthCleanerCategory.values();
                               len1 = growthCleane4.length;
                               while (b < len1) {
                                  object oobject2 = growthCleane4[b];
                                  if (a.g(uob2.i(), oobject2.getTitle())) {
                                     i2.o(oobject2.getSizeText(obj));
                                  }
                                  b = b + 1;
                               }
                               if (u1.f != null) {
                                  i2.n();
                               }else {
                                  i2.k();
                               }
                            }
                         }
                      }
                   label_021e :
                      GrowthCleanerCorePresenter u = uoa.u;
                      if (u != null) {
                         u.M0(true);
                      }
                      j.setVisibility(8);
                   }
                }
             }
          }
       }
       return;
    }
    public final void c9(b$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerCorePresenter.class, "17")) {
          return;
       }
       GrowthCleanerCorePresenter tt = this.t;
       if (tt != null) {
          j n = tt.n;
          if (n != null) {
             long l = c.a(p0);
             int i = 1;
             if (l - null > 0) {
                Object[] objArray = new Object[i];
                objArray[0] = f.d(l);
                String str = String.format(GrowthCleanerHelper.c(R.string.arg_RES_7f100595), Arrays.copyOf(objArray, i));
                a.o(str, "java.lang.String.format\(format, *args\)");
                n.setText(str);
                n.setEnabled(i);
                n.setTag(Integer.valueOf(i));
             }else {
                n.setText(GrowthCleanerHelper.c(R.string.arg_RES_7f10059a));
                n.setEnabled(i);
                n.setTag(Integer.valueOf(2));
             }
          }
       }
       return;
    }
    public final void d9(long p0){
       GrowthCleanerCorePresenter growthCleane = GrowthCleanerCorePresenter.class;
       if (PatchProxy.isSupport(growthCleane) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, growthCleane, "22")) {
          return;
       }
       Pair pair = f.c(p0);
       String str = pair.component1();
       String str1 = pair.component2();
       growthCleane = this.t;
       if (growthCleane != null) {
          j g = growthCleane.g;
          if (g != null) {
             g.setText(str);
          }
       }
       GrowthCleanerCorePresenter tt = this.t;
       if (tt != null) {
          j h = tt.h;
          if (h != null) {
             h.setText(str1);
          }
       }
       return;
    }
    public void doBindView(View p0){
       j f;
       GrowthCleanerCorePresenter growthCleane = GrowthCleanerCorePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, growthCleane, "2")) {
          return;
       }
       a.p(p0, "rootView");
       j oj = j.y.a(p0);
       Objects.requireNonNull(oj);
       int i = 0;
       if (!PatchProxy.applyVoid(null, oj, j.class, "1")) {
          f = oj.e;
          if (f != null && oj.f == null) {
             GrowthCleanerCircle growthCleane1 = new GrowthCleanerCircle(f.getContext());
             f.addView(growthCleane1, i);
             oj.f = growthCleane1;
          }
       }
       oj.b();
       GrowthCleanerCorePresenter tt = this.t;
       if (tt != null) {
          f = tt.f;
          if (f != null) {
             f.setProgress(i);
          }
       }
       tt = this.t;
       if (tt != null) {
          f = tt.f;
          if (f != null) {
             f.setAnimating(i);
          }
       }
       this.d9(0);
       this.t = oj;
       oj = PatchProxy.apply(null, this, growthCleane, "3");
       if (oj != PatchProxyResult.class) {
          oj.booleanValue();
       }else {
          GrowthCleanerCorePresenter tt1 = this.t;
          if (tt1 != null) {
             oj = tt1.s;
             if (oj != null) {
                Activity activity = this.getActivity();
                if (activity != null) {
                   a.o(activity, "activity ?: return true");
                   oj.setLayoutManager(new LinearLayoutManager(activity));
                }
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCorePresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("CLEANER_EVENT_SUBJECT");
       a.o(obj, "inject\(CLEANER_EVENT_SUBJECT\)");
       this.p = obj;
       obj = this.r8("CLEANER_BACKWARD_LISTENERS");
       a.o(obj, "inject\(CLEANER_BACKWARD_LISTENERS\)");
       this.q = obj;
       obj = this.r8("CLEANER_ADAPTER_DATA_OBSERVERS");
       a.o(obj, "inject\(CLEANER_ADAPTER_DATA_OBSERVERS\)");
       this.r = obj;
       return;
    }
}
