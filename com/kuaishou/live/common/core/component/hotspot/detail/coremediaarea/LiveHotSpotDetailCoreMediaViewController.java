package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import un1.d;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import hn1.f;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController$a;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import android.text.TextPaint;
import androidx.lifecycle.LifecycleOwner;
import xh3.g;
import androidx.recyclerview.widget.RecyclerView;
import hn1.h0;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter;
import android.app.Activity;
import hn1.e;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import hn1.a;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.Objects;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController$b;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewParent;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveHotSpotDetailCoreMediaViewController extends ViewController	// class@001388
{
    public final p j;
    public h0 k;
    public RecyclerView l;
    public final float m;
    public final LiveHotSpotDetailCoreMediaViewController$a n;
    public final LiveData o;
    public final d p;
    public final k q;

    public void LiveHotSpotDetailCoreMediaViewController(LiveData p0,d p1,k p2){
       a.p(p0, "dataProvider");
       a.p(p1, "contentVCDelegate");
       a.p(p2, "detailMainVCDelegate");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.j = new ViewModelLazy(m0.d(f.class), new LiveHotSpotDetailCoreMediaViewController$$special$$inlined$viewModels$2(new LiveHotSpotDetailCoreMediaViewController$$special$$inlined$viewModels$1(this)), new LiveHotSpotDetailCoreMediaViewController$viewModel$2(this));
       this.m = 0x3f2aaaab;
       this.n = new LiveHotSpotDetailCoreMediaViewController$a(this);
    }
    public void F2(){
       LiveHotSpotDetailCoreMediaViewController liveHotSpotD = LiveHotSpotDetailCoreMediaViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveHotSpotD, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c18);
       if (!PatchProxy.applyVoid(objArray, this, liveHotSpotD, "7")) {
          TextView textView = this.A2(R.id.title);
          TextPaint paint = textView.getPaint();
          a.o(paint, "textView.paint");
          paint.setFakeBoldText(true);
          g.a(textView, this, this.W2().b);
          RecyclerView recyclerView = this.A2(R.id.recyclerview);
          this.l = recyclerView;
          String str = "recyclerView";
          if (recyclerView == null) {
             a.S(str);
          }
          this.k = new h0(recyclerView, this.q.D1(), this.q.H1());
          Activity uActivity = this.B2();
          LiveHotSpotDetailCoreMediaViewController tk = this.k;
          if (tk == null) {
             a.S("playManager");
          }
          LiveHotSpotDetailCoreMediaAdapter liveHotSpotD1 = new LiveHotSpotDetailCoreMediaAdapter(this, uActivity, tk, this.q.D1(), this.q);
          this.W2().c.observe(this, new e(this, recyclerView));
          LiveHotSpotDetailCoreMediaViewController tl = this.l;
          if (tl == null) {
             a.S(str);
          }
          tl.setAdapter(recyclerView);
          LiveHotSpotDetailCoreMediaViewController tl1 = this.l;
          if (tl1 == null) {
             a.S(str);
          }
          if (!PatchProxy.applyVoidOneRefs(tl1, this, liveHotSpotD, "8")) {
             tl1.setLayoutManager(new LinearLayoutManager(this.D2(), 0, 0));
             tl1.addItemDecoration(new a());
             tl1.setItemAnimator(objArray);
          }
          this.p.C0().addOnScrollListener(this.n);
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHotSpotDetailCoreMediaViewController.class, "3")) {
          return;
       }
       LiveHotSpotDetailCoreMediaViewController tk = this.k;
       if (tk == null) {
          a.S("playManager");
       }
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, h0.class, "3")) {
          tk.e.removeOnScrollListener(tk.c);
       }
       this.p.C0().removeOnScrollListener(this.n);
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailCoreMediaViewController.class, "5")) {
          return;
       }
       this.P2().addOnLayoutChangeListener(new LiveHotSpotDetailCoreMediaViewController$b(this));
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailCoreMediaViewController.class, "4")) {
          return;
       }
       LiveHotSpotDetailCoreMediaViewController tk = this.k;
       if (tk == null) {
          a.S("playManager");
       }
       tk.d();
       return;
    }
    public final void V2(){
       LiveHotSpotDetailCoreMediaViewController tk;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHotSpotDetailCoreMediaViewController.class, "6")) {
          return;
       }
       if (this.P2().getHeight() <= 0) {
          return;
       }
       ViewParent parent = this.P2().getParent();
       if (!parent instanceof ViewGroup) {
          parent = objArray;
       }
       if (parent != null) {
          LiveHotSpotDetailCoreMediaViewController tl = this.l;
          String str = "recyclerView";
          if (tl == null) {
             a.S(str);
          }
          int height = tl.getHeight();
          int height1 = this.p.C0().getHeight();
          int top = parent.getTop();
          LiveHotSpotDetailCoreMediaViewController tl1 = this.l;
          if (tl1 == null) {
             a.S(str);
          }
          top = (top + tl1.getTop()) - this.q.R1();
          str = "playManager";
          if (top >= 0 || ((float)top - (- ((float)height * this.m)) < 0 || (float)(top - height1) - ((float)height * (0x3f800000 - this.m)) > 0)) {
             tk = this.k;
             if (tk == null) {
                a.S(str);
             }
             tk.d();
          }else {
             tk = this.k;
             if (tk == null) {
                a.S(str);
             }
             Objects.requireNonNull(tk);
             if (!PatchProxy.applyVoid(objArray, tk, h0.class, "1") && tk.f != null) {
                tk.b();
             }
          }
       }
    label_009a :
       return;
    }
    public final f W2(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailCoreMediaViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
