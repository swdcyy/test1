package com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment;
import com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment$b;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qpc.d;
import java.lang.Runnable;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import ypc.a;
import nuc.a;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment$a;
import java.util.Map;
import java.util.Objects;
import qpc.g;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qpc.h;
import java.util.Comparator;
import trd.x;
import qpc.f;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import rwc.j;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.c;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.b;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import qpc.e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import qpc.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.LibraryLoadingView;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import crd.b;
import android.view.View;
import java.util.Collections;

public class CoverTextLibraryFragment extends FlyWheelTabHostFragment	// class@000e50
{
    public final List E;
    public List F;
    public LibraryLoadingView G;
    public final CoverTextLibraryFragment$b H;
    public final DynamicTextViewModel I;
    public final Map J;
    public final List K;
    public j L;
    public int M;
    public b N;
    public static final int O;

    public void CoverTextLibraryFragment(CoverTextLibraryFragment$b p0,DynamicTextViewModel p1){
       super();
       this.E = new ArrayList();
       this.J = new HashMap();
       this.K = new ArrayList();
       this.M = 1;
       this.H = p0;
       this.I = p1;
    }
    public String E7(){
       return "CoverTextLibrary";
    }
    public void Qh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoverTextLibraryFragment.class, "8")) {
          return;
       }
       this.Rh(p0);
       this.Sh(new d(this));
       return;
    }
    public void Rh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoverTextLibraryFragment.class, "4")) {
          return;
       }
       this.E.clear();
       this.E.addAll(p0);
       return;
    }
    public final void Sh(Runnable p0){
       a uoa1;
       CoverTextLibraryFragment$a uoa3;
       Iterator iterator2;
       CoverTextLibraryFragment tG;
       if (PatchProxy.applyVoidOneRefs(p0, this, CoverTextLibraryFragment.class, "2")) {
          return;
       }
       CoverTextLibraryFragment tE = this.E;
       if (tE == null) {
          return;
       }
       Object[] objArray = null;
       if (!q.f(tE)) {
          if (!PatchProxy.applyVoid(objArray, this, CoverTextLibraryFragment.class, "3") && this.E != null) {
             HashMap hashMap = new HashMap();
             Iterator iterator1 = this.E.iterator();
             while (iterator1.hasNext()) {
                uoa1 = iterator1.next();
                a uoa2 = uoa1.l();
                if (uoa2 == null || uoa2.h() == null) {
                   continue ;
                }else {
                   String str = uoa2.h();
                   if (hashMap.get(str) == null) {
                      hashMap.put(str, new CoverTextLibraryFragment$a(str, uoa2.i(), uoa2.j(), uoa2.e));
                      this.J.put(uoa2.i(), str);
                   }
                   uoa3 = hashMap.get(str);
                   Objects.requireNonNull(uoa3);
                   if (PatchProxy.applyVoidOneRefs(uoa1, uoa3, CoverTextLibraryFragment$a.class, "1")) {
                      continue ;
                   }
                }
                uoa3.f.add(uoa1);
             }
             Collection uCollection = hashMap.values();
             String str1 = "6";
             ArrayList uArrayList1 = PatchProxy.applyOneRefs(uCollection, objArray, g.class, str1);
             PagerSlidingTabStrip$d uod = 1;
             if (uArrayList1 != PatchProxyResult.class) {
             }else {
                a.p(uCollection, "groupInfoList");
                uArrayList1 = new ArrayList();
                uArrayList1.addAll(uCollection);
                if (uArrayList1.size() > uod) {
                   x.p0(uArrayList1, new h());
                }
                iterator2 = uArrayList1.iterator();
                while (iterator2.hasNext()) {
                   List list = iterator2.next().a();
                   a.o(list, "it.coverTextInfos");
                   if (list.size() > uod) {
                      x.p0(list, new f());
                   }
                }
             }
             this.F = uArrayList1;
             if (!PatchProxy.applyVoidOneRefs(uArrayList1, this, CoverTextLibraryFragment.class, str1)) {
                iterator2 = this.E.iterator();
                while (iterator2.hasNext()) {
                   uoa1 = iterator2.next();
                   if (uoa1.s()) {
                   }else {
                      Iterator iterator3 = uArrayList1.iterator();
                      while (iterator3.hasNext()) {
                         CoverTextLibraryFragment$a uoa4 = iterator3.next();
                         if (uoa4.b == uod && !uoa4.f.contains(uoa1)) {
                            uoa4.f.add(0, uoa1);
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, CoverTextLibraryFragment.class, "5") && this.F != null) {
             ArrayList uArrayList = Lists.b();
             if (q.f(this.F)) {
                this.Kh(uArrayList);
             }else if(!this.F.isEmpty()){
                this.L = new j(this.F.get(0).a);
             }
             if (!PatchProxy.applyVoid(objArray, this, CoverTextLibraryFragment.class, "13")) {
                this.Oh(new c(this));
             }
             Iterator iterator = this.F.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                b uob = new b(this, new PagerSlidingTabStrip$d(obj.a, obj.c), CoverTextGroupFragment.class, new Bundle(), obj);
                uArrayList.add(v3);
             }
             if (!q.f(this.F) && this.F.size() > g.c()) {
                CoverTextLibraryFragment$a uoa = this.F.get(g.c());
                g.a(uoa.c, uoa.a);
             }
             this.Kh(uArrayList);
             this.u.setCurrentItem(g.c(), 0);
             this.u.getViewTreeObserver().addOnGlobalLayoutListener(new e(this, p0));
             this.M = 0;
          }
       }else if(PatchProxy.applyVoid(objArray, this, CoverTextLibraryFragment.class, "15")){
          tG = this.G;
          if (tG != null) {
             tG.L(new c(this));
          }
       }
       tG = this.G;
       if (tG != null) {
          tG.setVisibility(0);
       }
    label_020b :
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d04b3;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CoverTextLibraryFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       CoverTextLibraryFragment tN = this.N;
       if (tN != null) {
          tN.dispose();
          this.N = null;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverTextLibraryFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.G = p0.findViewById(0x7f0a0a03);
       this.Sh(null);
       return;
    }
    public List wh(){
       Object obj = PatchProxy.apply(null, this, CoverTextLibraryFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.emptyList();
    }
}
