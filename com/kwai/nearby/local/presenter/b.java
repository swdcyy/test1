package com.kwai.nearby.local.presenter.b;
import e9c.f;
import y8c.q;
import uc7.c;
import com.kwai.nearby.local.presenter.b$a;
import com.kwai.nearby.local.presenter.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import tkd.b;
import tkd.d;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import com.yxcorp.gifshow.util.rx.RxBus;
import qc7.a;
import brd.t;
import dd7.h;
import com.kwai.imsdk.internal.util.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sc7.b0;
import dd7.g;
import io.reactivex.internal.functions.Functions;
import tw5.d;
import dd7.f;
import qvb.q;
import qvb.a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import g9c.a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Math;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.lang.Boolean;
import com.yxcorp.gifshow.nearby.common.model.NearbyVideoCacheConfig;
import java.lang.System;
import java.util.HashMap;
import java.util.Collection;
import trd.y;
import com.yxcorp.gifshow.entity.QPhoto;
import ekd.q;
import java.util.Iterator;
import java.lang.Integer;

public class b extends f	// class@000fab
{
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public RecyclerView$r F;
    public final q G;
    public c u;
    public b0 v;
    public RecyclerView w;
    public q x;
    public d y;
    public boolean z;

    public void b(q p0){
       super(p0);
       this.u = new c();
       this.F = new b$a(this);
       this.G = new b$b(this);
       this.x = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.E8();
       if (LocalConfigKeyHelper.l() && !d.a(0xded02ea).PL()) {
          this.X7(RxBus.f.f(a.class).subscribe(new h(this), new e()));
          g e = Functions.e;
          this.X7(this.v.I.subscribe(new g(this), e));
          this.X7(this.y.a().distinctUntilChanged().subscribe(new f(this), e));
       }
       this.v.h(this.G);
       this.w.addOnScrollListener(this.F);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.v.f(this.G);
       this.w.removeOnScrollListener(this.F);
       return;
    }
    public int P8(){
       return this.E;
    }
    public void R8(b0 p0,g p1){
       c c;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = this.w.getLayoutManager();
       if (p0 != null && (layoutManage == null || (p1 != null && (layoutManage.getChildCount() > 0 && !p1.e1())))) {
          boolean itemCount = p1.getItemCount();
          View childAt = layoutManage.getChildAt((layoutManage.getChildCount() - 1));
          if (childAt == null) {
             return;
          }else {
             int viewLayoutPo = childAt.getLayoutParams().getViewLayoutPosition();
             this.C = Math.max(viewLayoutPo, this.C);
             if (viewLayoutPo >= itemCount && (this.z != null && this.D == null)) {
                this.A = true;
                if (this.u.a()) {
                   b tu = this.u;
                   Objects.requireNonNull(tu);
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   c uoc = c.class;
                   Object[] objArray = null;
                   ArrayList uArrayList = PatchProxy.apply(objArray, tu, uoc, "4");
                   if (uArrayList != patchProxyRe) {
                   }else {
                      uArrayList = new ArrayList();
                      Object obj = PatchProxy.apply(objArray, tu, uoc, "7");
                      if (obj != patchProxyRe) {
                         itemCount = obj.booleanValue();
                      }else {
                         c = tu.c;
                         itemCount = (c.mCacheSize <= null || (c.mCacheValidInterval != -1 && ((System.currentTimeMillis() - tu.d) / (long)0xea60) - (long)tu.c.mCacheValidInterval > 0))? true: false;
                      }
                      if (itemCount) {
                         tu.a.clear();
                         tu.b.clear();
                         tu.e = true;
                      }else {
                         itemCount = tu.a.isEmpty() ^ 1;
                         while (itemCount) {
                            uArrayList.add(y.N0(tu.a));
                            tu.e = true;
                            if (uArrayList.size() != tu.c.mCachePopSize) {
                            }
                         }
                      }
                   }
                   if (!q.f(uArrayList)) {
                      this.w.stopScroll();
                      this.B = true;
                      if (!PatchProxy.applyVoidOneRefs(uArrayList, p0, b0.class, "39")) {
                         Iterator iterator = uArrayList.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().setEnableV4Head(p0.W0);
                         }
                         p0.b.addAll(uArrayList);
                      }
                      p1.Y0(false);
                   }
                }
             }
          }
       }
    label_0110 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.E = this.v8("LOAD_MORE_OFFSET", Integer.class).intValue();
       this.v = this.r8("PAGE_LIST");
       this.w = this.q8(RecyclerView.class);
       this.y = this.r8("local_current_city");
       return;
    }
}
