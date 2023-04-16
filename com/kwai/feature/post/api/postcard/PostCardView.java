package com.kwai.feature.post.api.postcard.PostCardView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import java.util.ArrayList;
import k46.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.feature.post.api.postcard.PostCardView$a;
import java.util.Objects;
import com.kwai.feature.post.api.postcard.PostCardView$b;
import com.kwai.feature.post.api.postcard.PostCardView$c;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.List;
import lnc.p3;
import q87.c;
import android.app.Activity;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import brd.t;
import com.kwai.feature.post.api.postcard.PostCardView$h;
import erd.o;
import om6.d;
import lnc.x6;
import lnc.y6;
import com.kwai.feature.post.api.postcard.PostCardView$f;
import com.kwai.feature.post.api.postcard.PostCardView$g;
import t45.d;
import brd.z;
import brd.w;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import brd.a0;
import com.kwai.feature.post.api.postcard.PostCardView$d;
import com.kwai.feature.post.api.postcard.PostCardView$e;
import erd.g;
import crd.b;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewParent;
import java.lang.Math;

public final class PostCardView extends LinearLayout	// class@001427
{
    public RecyclerView b;
    public List c;
    public List d;
    public final b e;
    public final List f;
    public int g;
    public int h;
    public final GifshowActivity i;
    public HashMap j;

    public void PostCardView(GifshowActivity p0){
       PostCardView tb;
       a.p(p0, "activity");
       super(p0);
       this.i = p0;
       this.c = new ArrayList();
       this.d = new ArrayList();
       b uob = new b();
       this.e = uob;
       this.f = new ArrayList();
       if (PatchProxy.applyVoid(null, this, PostCardView.class, "3")) {
       }else {
          a.d(this.getContext(), R.layout.arg_RES_7f0d1185, this, true);
          View view = this.findViewById(R.id.post_card_recyclerview);
          a.o(view, "findViewById\(R.id.post_card_recyclerview\)");
          this.b = view;
          if (view == null) {
             a.S("mRecyclerView");
          }
          view.setLayoutManager(new LinearLayoutManager(p0, 0, 0));
          tb = this.b;
          if (tb == null) {
             a.S("mRecyclerView");
          }
          tb.addItemDecoration(new b(0, a1.d(R.dimen.arg_RES_7f07034b), a1.d(R.dimen.arg_RES_7f07034b)));
       }
       PostCardView$a uoa = new PostCardView$a(this);
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(uoa, uob, b.class, "2")) {
          a.p(uoa, "<set-?>");
          uob.e = uoa;
       }
       tb = this.b;
       if (tb == null) {
          a.S("mRecyclerView");
       }
       tb.addItemDecoration(new PostCardView$b(this));
       tb = this.b;
       if (tb == null) {
          a.S("mRecyclerView");
       }
       tb.addOnScrollListener(new PostCardView$c(this));
       return;
    }
    public final void a(List p0){
       t ot2;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostCardView.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostCardView", "combineDataAndShow", objArray);
       String str = this.i.getString(R.string.arg_RES_7f10363f);
       a.o(str, "activity.getString\(R.string.missu_list_draft\)");
       if (p0 == null) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       t ot = t.fromIterable(p0).map(PostCardView$h.b);
       d uod = y6.r(d.class);
       if (uod != null) {
          t ot1 = uod.l5();
          if (ot1 != null) {
             ot1 = ot1.flatMap(PostCardView$f.b);
             if (ot1 != null) {
                ot2 = ot1.map(new PostCardView$g(str));
                if (ot2 != null) {
                   ot2 = ot2.observeOn(d.a);
                   if (ot2 != null) {
                      ot2 = ot2.subscribeOn(d.c);
                      if (ot2 != null) {
                      label_0070 :
                         t.concat(ot2, ot).compose(this.i.ge()).take(6).toList().R(new PostCardView$d(this), PostCardView$e.b);
                         return;
                      }
                   }
                }
             }
          }
       }
       ot2 = t.empty();
       goto label_0070 ;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       ViewParent parent;
       Integer obj = PatchProxy.applyOneRefs(p0, this, PostCardView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = (p0 != null)? Integer.valueOf(p0.getAction()): null;
       boolean b = true;
       if (obj != null && !obj.intValue()) {
          parent = this.getParent();
          if (parent != null) {
             parent.requestDisallowInterceptTouchEvent(b);
          }
       }else {
          float f = 0.00f;
          if (obj != null && obj.intValue() == f) {
             if (Math.abs((this.g - (int)p0.getX())) > Math.abs((this.h - (int)p0.getY()))) {
                parent = this.getParent();
                if (parent != null) {
                   parent.requestDisallowInterceptTouchEvent(b);
                }
             }else {
                parent = this.getParent();
                if (parent != null) {
                   parent.requestDisallowInterceptTouchEvent(false);
                }
             }
          }else if(obj == null){
             obj.intValue();
          }
       }
       if (p0 != null) {
          this.g = (int)p0.getX();
          this.h = (int)p0.getY();
       }
       return super.dispatchTouchEvent(p0);
    }
    public final GifshowActivity getActivity(){
       return this.i;
    }
    public final int getMLastX(){
       return this.g;
    }
    public final int getMLastY(){
       return this.h;
    }
    public final RecyclerView getMRecyclerView(){
       PostCardView obj = PatchProxy.apply(null, this, PostCardView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("mRecyclerView");
       }
       return obj;
    }
    public final void setMLastX(int p0){
       this.g = p0;
    }
    public final void setMLastY(int p0){
       this.h = p0;
    }
    public final void setMRecyclerView(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostCardView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
}
