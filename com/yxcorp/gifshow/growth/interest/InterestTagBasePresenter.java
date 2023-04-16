package com.yxcorp.gifshow.growth.interest.InterestTagBasePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.interest.InterestLayoutManager;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yna.g;
import android.content.Context;
import com.google.android.flexbox.FlexboxLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.growth.interest.InterestTagBasePresenter$a;
import androidx.recyclerview.widget.RecyclerView$n;
import aoa.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.Result;
import com.kwai.feature.api.feed.growth.model.InterestTagResponse;
import java.util.List;
import com.kwai.feature.api.feed.growth.model.InterestTagResponse$InterestTagItem;
import java.lang.Throwable;
import qrd.j0;
import cra.w;
import q87.c;
import aoa.a;
import java.util.Iterator;
import qrd.l1;
import com.yxcorp.gifshow.growth.interest.InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Collection;
import java.lang.Boolean;
import android.view.View;
import ekd.m1;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.growth.interest.InterestChangeEvent;

public abstract class InterestTagBasePresenter extends PresenterV2	// class@0013be
{
    public RecyclerView p;
    public g q;
    public a r;
    public List s;

    public void InterestTagBasePresenter(){
       super();
       this.s = new ArrayList();
    }
    public void E8(){
       InterestTagBasePresenter interestTagB = InterestTagBasePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, interestTagB, "11")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, interestTagB, "12")) {
          InterestTagBasePresenter tq = this.q;
          if (tq == null) {
             a.S("mCallerContext");
          }
          InterestLayoutManager interestLayo = new InterestLayoutManager(tq.a(), 0);
          interestLayo.setFlexWrap(1);
          interestLayo.setAlignItems(4);
          interestLayo.setJustifyContent(0);
          tq = this.p;
          if (tq == null) {
             a.S("mRecyclerView");
          }
          InterestTagBasePresenter tp = this.p;
          if (tp == null) {
             a.S("mRecyclerView");
          }
          tp.setLayoutManager(interestLayo);
          tq.addItemDecoration(new InterestTagBasePresenter$a());
       }
       return;
    }
    public final int P8(a$a p0){
       InterestTagBasePresenter obj = PatchProxy.applyOneRefs(p0, this, InterestTagBasePresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a9(p0.b());
       if (i >= 0) {
          obj = this.q;
          if (obj == null) {
             a.S("mCallerContext");
          }
          InterestTagResponse interestTagR = obj.d();
          if (interestTagR != null) {
             interestTagR = interestTagR.mUserTagList;
             if (interestTagR != null) {
                interestTagR.remove(i);
             }
          }
       }
    label_0038 :
       return i;
    }
    public final a R8(){
       InterestTagBasePresenter obj = PatchProxy.apply(null, this, InterestTagBasePresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mAdapter");
       }
       return obj;
    }
    public final g S8(){
       InterestTagBasePresenter obj = PatchProxy.apply(null, this, InterestTagBasePresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mCallerContext");
       }
       return obj;
    }
    public final RecyclerView V8(){
       InterestTagBasePresenter obj = PatchProxy.apply(null, this, InterestTagBasePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mRecyclerView");
       }
       return obj;
    }
    public abstract int W8();
    public abstract String X8();
    public final InterestTagResponse$InterestTagItem Y8(a$a p0){
       InterestTagResponse$InterestTagItem obj = PatchProxy.applyOneRefs(p0, this, InterestTagBasePresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new InterestTagResponse$InterestTagItem();
       obj.mTagId = p0.b();
       obj.mTagName = p0.c();
       return obj;
    }
    public a$a Z8(String p0){
       l1 a;
       Object obj = PatchProxy.applyOneRefs(p0, this, InterestTagBasePresenter.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          Iterator iterator = this.s.iterator();
          while (true) {
             if (iterator.hasNext()) {
                a$a uoa = iterator.next();
                if (a.g(uoa.b(), p0)) {
                   return uoa;
                }
                continue ;
             }else {
                a = l1.a;
             }
          }
          return null;
       }else {
          a = null;
       }
       Result.constructor-impl(a);
       goto label_0043 ;
    }
    public final int a9(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InterestTagBasePresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int b = false;
       if (p0 != null) {
          InterestTagBasePresenter tq = this.q;
          if (tq == null) {
             a.S("mCallerContext");
          }
          InterestTagResponse interestTagR = tq.d();
          if (interestTagR != null) {
             interestTagR = interestTagR.mUserTagList;
             if (interestTagR != null) {
                if (interestTagR.isEmpty()) {
                   return -1;
                }else {
                   b = 0;
                   int i = interestTagR.size();
                   while (true) {
                      if (b < i) {
                         if (a.g(interestTagR.get(b).mTagId, p0)) {
                            break ;
                         }else {
                            b = b + 1;
                         }
                      }else {
                         b = l1.a;
                      }
                   }
                   return b;
                }
             }
          }
       }
    label_004f :
       Result.constructor-impl(b);
       return -1;
    }
    public void b9(){
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, InterestTagBasePresenter.class, "13")) {
          return;
       }
       List list = this.l9();
       this.s.clear();
       if (list.isEmpty()) {
          this.b9();
       }else {
          a uoa = new a();
          uoa.f = new InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1(this);
          this.r = uoa;
          String str = "mRecyclerView";
          if (this.p == null) {
             a.S(str);
          }
          InterestTagBasePresenter tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.setVisibility(0);
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          InterestTagBasePresenter tr = this.r;
          String str1 = "mAdapter";
          if (tr == null) {
             a.S(str1);
          }
          tp.setAdapter(tr);
          this.s.addAll(list);
          InterestTagBasePresenter tr1 = this.r;
          if (tr1 == null) {
             a.S(str1);
          }
          tr1.K0(this.s);
       }
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          w.C().e("interestEdit", "TagBasePresenter initTagList", obj);
       }
       return;
    }
    public final boolean d9(String p0){
       l1 a;
       InterestTagBasePresenter obj = PatchProxy.applyOneRefs(p0, this, InterestTagBasePresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       if (obj == null) {
          a.S("mCallerContext");
       }
       InterestTagResponse interestTagR = obj.d();
       if (interestTagR != null) {
          interestTagR = interestTagR.mUserTagList;
          if (interestTagR != null) {
             Iterator iterator = interestTagR.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (a.g(iterator.next().mTagId, p0)) {
                      return true;
                   }
                   continue ;
                }else {
                   a = l1.a;
                label_0046 :
                   Result.constructor-impl(a);
                   break ;
                }
             }
             return false;
          }
       }
       a = null;
       goto label_0046 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InterestTagBasePresenter.class, "10")) {
          return;
       }
       p0 = m1.f(p0, this.q7());
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, getRecyclerViewId\(\)\)");
       this.p = p0;
       return;
    }
    public final boolean e9(String p0){
       l1 a;
       InterestTagBasePresenter obj = PatchProxy.applyOneRefs(p0, this, InterestTagBasePresenter.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "currentId");
       obj = this.q;
       if (obj == null) {
          a.S("mCallerContext");
       }
       InterestTagResponse interestTagR = obj.d();
       if (interestTagR != null) {
          interestTagR = interestTagR.mUserTagList;
          if (interestTagR != null) {
             Iterator iterator = interestTagR.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (a.g(p0, iterator.next().mTagId)) {
                      return true;
                   }
                   continue ;
                }else {
                   a = l1.a;
                label_004b :
                   Result.constructor-impl(a);
                   break ;
                }
             }
             return false;
          }
       }
       a = null;
       goto label_004b ;
    }
    public void h9(a$a p0,int p1){
       if (PatchProxy.isSupport(InterestTagBasePresenter.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, InterestTagBasePresenter.class, "8")) {
          return;
       }
       a.p(p0, "model");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, InterestTagBasePresenter.class, "9")) {
          return;
       }
       Object obj = this.q8(g.class);
       a.o(obj, "inject\(InterestTagEditCallerContext::class.java\)");
       this.q = obj;
       return;
    }
    public void j9(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InterestTagBasePresenter.class, "7")) {
          return;
       }
       a.p(p0, "model");
       return;
    }
    public final void k9(a$a p0){
       int b;
       InterestTagBasePresenter tq;
       InterestTagBasePresenter interestTagB = InterestTagBasePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, interestTagB, "14")) {
          return;
       }
       this.j9(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, interestTagB, "17")) {
          b = -1;
          String str = "mCallerContext";
          if (p0.a()) {
             b = this.P8(p0);
          }else if(!this.d9(p0.b())){
             tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             InterestTagResponse interestTagR = tq.d();
             if (interestTagR != null) {
                interestTagR = interestTagR.mUserTagList;
                if (interestTagR != null) {
                   interestTagR.add(this.Y8(p0));
                }
             }
             tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             interestTagR = tq.d();
             if (interestTagR != null) {
                interestTagR.mUserTagList = new ArrayList();
             }
             tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             interestTagR = tq.d();
             if (interestTagR != null) {
                interestTagR = interestTagR.mUserTagList;
                if (interestTagR != null) {
                   interestTagR.add(this.Y8(p0));
                }
             }
          }
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          tq.c().onNext(new InterestChangeEvent(4, String.valueOf(b)));
          Throwable obj = Result.constructor-impl(l1.a);
          obj = Result.exceptionOrNull-impl(obj);
          if (obj != null) {
             w.C().e("interestEdit", "TagBasePresenter handleAddEvent", obj);
          }
       }
       b = (!p0.a())? true: false;
       p0.e(b);
       InterestTagBasePresenter tr = this.r;
       if (tr == null) {
          a.S("mAdapter");
       }
       tr.K0(this.s);
       Result.constructor-impl(l1.a);
       return;
    }
    public abstract List l9();
    public final void m9(String p0){
       a$a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, InterestTagBasePresenter.class, "25")) {
          return;
       }
       boolean b = false;
       if (p0 != null) {
          uoa = this.Z8(p0);
          if (uoa != null) {
             b = (!uoa.a())? true: false;
             uoa.e(b);
             InterestTagBasePresenter tr = this.r;
             if (tr == null) {
                a.S("mAdapter");
             }
             tr.L0(uoa);
             b = l1.a;
          }
       }
       uoa = Result.constructor-impl(b);
       Throwable throwable = Result.exceptionOrNull-impl(uoa);
       if (throwable != null) {
          w.C().e("interestEdit", "TagBasePresenter updateModelSelect", throwable);
       }
       return;
    }
    public abstract int q7();
}
