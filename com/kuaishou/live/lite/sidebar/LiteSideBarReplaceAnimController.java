package com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController;
import fd3.v;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.util.List;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$a;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$autoRecoverStatus$1;
import java.lang.Boolean;
import android.animation.Animator;
import android.view.ViewGroup;
import com.kuaishou.live.lite.sidebar.e$a;
import msd.a;
import com.kuaishou.live.lite.sidebar.e$b;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import android.view.ViewParent;
import java.util.ArrayList;
import android.widget.FrameLayout;
import android.content.Context;
import android.animation.AnimatorSet;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$1;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$1;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$2;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$b;
import android.animation.Animator$AnimatorListener;

public final class LiteSideBarReplaceAnimController	// class@000b30
{
    public Animator a;
    public final v b;

    public void LiteSideBarReplaceAnimController(v p0){
       a.p(p0, "sideBarItemViewFetcher");
       super();
       this.b = p0;
    }
    public final void a(View p0,List p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiteSideBarReplaceAnimController.class, "13")) {
          return;
       }
       LiteSideBarReplaceAnimController$a uoa = PatchProxy.applyOneRefs(p0, this, LiteSideBarReplaceAnimController.class, "14");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new LiteSideBarReplaceAnimController$a(p0.getAlpha(), p0.getScaleX(), p0.getScaleY());
       }
       p2.invoke(p0);
       p1.add(new LiteSideBarReplaceAnimController$autoRecoverStatus$1(this, p0, uoa));
       return;
    }
    public final boolean b(){
       LiteSideBarReplaceAnimController obj = PatchProxy.apply(null, this, LiteSideBarReplaceAnimController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = true;
       if (obj == null || obj.isRunning() != b) {
          b = false;
       }
       return b;
    }
    public final void c(ViewGroup p0,e$a p1,e$a p2,a p3){
       int this;
       LiteSideBarReplaceAnimController$b obj3;
       int b;
       FrameLayout uFrameLayout;
       AnimatorSet uAnimatorSet1;
       ArrayList this1;
       AnimatorSet uAnimatorSet2;
       ArrayList uArrayList3;
       AnimatorSet uAnimatorSet3;
       List list;
       ArrayList uArrayList4;
       Iterator iterator;
       Object obj4;
       View obj5;
       View view3;
       LiteSideBarReplaceAnimController liteSideBarR = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       LiteSideBarReplaceAnimController liteSideBarR1 = LiteSideBarReplaceAnimController.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiteSideBarReplaceAnimController.class, "2")) {
          return;
       }
       a.p(obj, "sideBarContainer");
       a.p(obj1, "disappearItem");
       a.p(obj2, "appearItem");
       a.p(p3, "finishCallback");
       View view = liteSideBarR.b.a(obj1);
       View view1 = liteSideBarR.b.a(obj2);
       int i = 2;
       int i1 = 4;
       this = 0;
       if (PatchProxy.isSupport(liteSideBarR1)) {
          Object[] objArray = new Object[]{obj,obj1,view,obj2,view1};
          obj3 = PatchProxy.apply(objArray, liteSideBarR, liteSideBarR1, "4");
          if (obj3 != patchProxyRe) {
             b = obj3.booleanValue();
          }else if(!this.b() && (p1.g().isEmpty() || (p2.g().isEmpty() || (!SequencesKt___SequencesKt.Y(ViewGroupKt.b(p0), view) || view1.getParent() != null)))){
             b = false;
          }else {
             b = true;
          }
       }else {
          goto label_006b ;
       }
       if (!b) {
          p3.invoke();
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          obj3 = PatchProxy.applyTwoRefs(view, obj, liteSideBarR, liteSideBarR1, "7");
          if (obj3 != patchProxyRe) {
             uFrameLayout = obj3;
          }else {
             b = obj.indexOfChild(view);
             FrameLayout uFrameLayout1 = new FrameLayout(view.getContext());
             obj.removeViewAt(b);
             obj.addView(uFrameLayout1, b);
             uFrameLayout = uFrameLayout1;
          }
          ArrayList uArrayList1 = uArrayList;
          AnimatorSet uAnimatorSet = new AnimatorSet();
          obj3 = PatchProxy.applyFourRefs(p1, uFrameLayout, view, uArrayList, this, LiteSideBarReplaceAnimController.class, "6");
          String str = "it";
          String str1 = "animIconView";
          if (obj3 != patchProxyRe) {
             uAnimatorSet1 = obj3;
             this1 = uArrayList1;
          }else {
             p1.i();
             uFrameLayout.addView(view);
             uAnimatorSet3 = new AnimatorSet();
             list = p1.g();
             a.o(list, str1);
             uArrayList4 = new ArrayList();
             iterator = CollectionsKt___CollectionsKt.d2(list).iterator();
             while (iterator.hasNext()) {
                obj4 = iterator.next();
                Object obj6 = (!obj4.getVisibility())? 1: null;
                if (obj6) {
                   uArrayList4.add(obj4);
                }
             }
             iterator = uArrayList4.iterator();
             while (iterator.hasNext()) {
                this1 = uArrayList1;
                liteSideBarR.a(iterator.next(), this1, new LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$1(liteSideBarR, this1, uAnimatorSet3));
             }
             this1 = uArrayList1;
             view3 = p1.f();
             if (view3 != null) {
                a.o(view3, str);
                LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2 oprepareDisa = (!view3.getVisibility())? 1: null;
                if (!oprepareDisa) {
                   view3 = null;
                }
                if (view3 != null) {
                   a.o(view3, str);
                   liteSideBarR.a(view3, this1, new LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2(liteSideBarR, this1, uAnimatorSet3));
                }
             }
             uAnimatorSet1 = uAnimatorSet3;
          }
          ArrayList uArrayList2 = this1;
          String str2 = str1;
          String str3 = str;
          obj3 = PatchProxy.applyFourRefs(p2, uFrameLayout, view1, this1, this, LiteSideBarReplaceAnimController.class, "5");
          if (obj3 != patchProxyRe) {
             uAnimatorSet2 = obj3;
             uArrayList3 = uArrayList2;
          }else {
             p2.i();
             view1.setVisibility(0);
             uFrameLayout.addView(view1, 0);
             uAnimatorSet3 = new AnimatorSet();
             list = p2.g();
             a.o(list, str2);
             uArrayList4 = new ArrayList();
             iterator = CollectionsKt___CollectionsKt.d2(list).iterator();
             while (iterator.hasNext()) {
                obj4 = iterator.next();
                obj5 = (!obj4.getVisibility())? 1: null;
                if (obj5) {
                   uArrayList4.add(obj4);
                }
             }
             iterator = uArrayList4.iterator();
             while (iterator.hasNext()) {
                View view2 = iterator.next();
                view2.setVisibility(4);
                uArrayList3 = uArrayList2;
                liteSideBarR.a(view2, uArrayList3, super(liteSideBarR, uArrayList3, uAnimatorSet3));
             }
             uArrayList3 = uArrayList2;
             int i2 = 4;
             view3 = p2.f();
             if (view3 != null) {
                String str4 = str3;
                a.o(view3, str4);
                obj5 = (!view3.getVisibility())? 1: null;
                if (!obj5) {
                   view3 = null;
                }
                if (view3 != null) {
                   a.o(view3, str4);
                   view3.setVisibility(i2);
                   liteSideBarR.a(view3, uArrayList3, new LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$2(liteSideBarR, uArrayList3, uAnimatorSet3));
                }
             }
             uAnimatorSet2 = uAnimatorSet3;
          }
          obj3 = str1;
          LiteSideBarReplaceAnimController$b uob = str1;
          obj3 = new LiteSideBarReplaceAnimController$b(this, p0, uFrameLayout, view, view1, uArrayList3, p1, p2, p3);
          uAnimatorSet3 = uAnimatorSet;
          uAnimatorSet3.addListener(uob);
          liteSideBarR.a = uAnimatorSet3;
          Animator[] uAnimatorArr = new Animator[]{uAnimatorSet1,uAnimatorSet2};
          uAnimatorSet3.playTogether(uAnimatorArr);
          uAnimatorSet3.start();
          return;
       }
    }
}
