package com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import pn9.h;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$d;
import jn9.e;
import androidx.lifecycle.LifecycleOwner;
import jn9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Objects;
import pn9.b;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.y;
import pn9.g;
import pn9.c;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$c;
import pn9.g$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import jn9.b$b;
import com.kwai.robust.PatchProxyResult;

public final class PostListComponentView extends FrameLayout	// class@0011ce
{
    public View b;
    public View c;
    public b d;
    public RecyclerView e;
    public g f;
    public e g;
    public b h;
    public final h i;
    public final PostListComponentView$d j;

    public void PostListComponentView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void PostListComponentView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.i = new h();
       this.j = new PostListComponentView$d(this);
    }
    public final void a(e p0,LifecycleOwner p1,b p2){
       PostListComponentView ti;
       RecyclerView recyclerView;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostListComponentView.class, "2")) {
          return;
       }
       a.p(p0, "viewConfig");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "componentAdapter");
       this.g = p0;
       e d = p0.d;
       this.d = d;
       this.h = p2;
       Object[] objArray = null;
       if (d == null) {
          if (!PatchProxy.applyVoid(objArray, this, PostListComponentView.class, "7")) {
             a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0253, this, true);
             this.c = this.findViewById(0x7f0a0d89);
             this.b = this.findViewById(0x7f0a2909);
             recyclerView = this.findViewById(R.id.recycler_view);
             this.e = recyclerView;
             if (recyclerView != null) {
                recyclerView.addItemDecoration(new e(false, n.c(this.getContext(), 11.00f), false));
             }
             ti = this.e;
             if (ti != null) {
                ti.setLayoutManager(new LinearLayoutManager(this.getContext()));
             }
          }
       }else {
          a.m(d);
          this.c = objArray;
          ti = this.d;
          a.m(ti);
          Objects.requireNonNull(ti);
          this.b = objArray;
          ti = this.d;
          a.m(ti);
          this.e = ti.D();
       }
       ti = this.i;
       PostListComponentView te = this.e;
       a.m(te);
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoidOneRefs(te, ti, h.class, "1")) {
          a.p(te, "recyclerView");
          ti.c(te);
          te.addOnScrollListener(ti);
       }
       ti = this.e;
       RecyclerView$l itemAnimator = (ti != null)? ti.getItemAnimator(): objArray;
       if (itemAnimator instanceof g) {
          ti = this.e;
          if (ti != null) {
             objArray = ti.getItemAnimator();
          }
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
          objArray.K(false);
       }
       g og = new g(p0.a);
       this.f = og;
       og.W0(p2.j());
       PostListComponentView tf = this.f;
       if (tf != null) {
          tf.Y0(new PostListComponentView$c(this, p2));
       }
       tf = this.e;
       if (tf != null) {
          tf.setAdapter(this.f);
       }
       p2.a(this.j, true);
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PostListComponentView.class, "5")) {
          return;
       }
       PostListComponentView ti = this.i;
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoid(objArray, ti, h.class, "4")) {
          ti.a.clear();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, PostListComponentView.class, "4")) {
          return;
       }
       PostListComponentView te = this.e;
       if (te != null) {
          this.i.c(te);
       }
       return;
    }
    public final List getShowedItemPositionList(){
       Object obj = PatchProxy.apply(null, this, PostListComponentView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.a;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, PostListComponentView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       PostListComponentView th = this.h;
       if (th != null) {
          th.B(this.j);
       }
       th = this.e;
       if (th != null) {
          PostListComponentView ti = this.i;
          Objects.requireNonNull(ti);
          if (!PatchProxy.applyVoidOneRefs(th, ti, h.class, "3")) {
             a.p(th, "recyclerView");
             th.removeOnScrollListener(ti);
          }
       }
       th = this.f;
       if (th != null) {
          th.Y0(null);
       }
       return;
    }
}
