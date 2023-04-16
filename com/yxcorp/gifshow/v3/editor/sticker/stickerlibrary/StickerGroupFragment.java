package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import android.util.Pair;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import i2b.a;
import rwc.j;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.lang.Math;
import androidx.recyclerview.widget.GridLayoutManager;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment$c;
import androidx.recyclerview.widget.RecyclerView$n;
import h9c.i;
import rtc.f;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.j;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import h9c.j;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;

public class StickerGroupFragment extends BaseFragment	// class@001294
{
    public RecyclerView j;
    public StickerGroupInfo k;
    public Set l;
    public List m;
    public int n;
    public int o;
    public int p;
    public j q;
    public e$d r;
    public boolean s;
    public final int t;
    public final int u;
    public int v;
    public static final int w;

    public void StickerGroupFragment(){
       super();
       this.n = -1;
       this.o = -1;
       this.p = -1;
       this.s = false;
       this.t = a1.e(80.00f);
       this.u = a1.e(65.00f);
       this.v = 4;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, StickerGroupFragment.class, "8")) {
          return;
       }
       if (this.j != null) {
          StickerGroupFragment tk = this.k;
          if (tk == null || (!tk.getStickerInfos().isEmpty() && this.m != null)) {
             this.j.getViewTreeObserver().addOnGlobalLayoutListener(new StickerGroupFragment$b(this));
          }
       }
       return;
    }
    public void dh(){
       int i3;
       if (PatchProxy.applyVoid(null, this, StickerGroupFragment.class, "9")) {
          return;
       }
       if (this.j != null) {
          StickerGroupFragment tk = this.k;
          if (tk == null || (!tk.getStickerInfos().isEmpty() && this.m != null)) {
             RecyclerView$LayoutManager layoutManage = this.j.getLayoutManager();
             if (!layoutManage instanceof LinearLayoutManager) {
                return;
             }else {
                int i = layoutManage.i0();
                int i1 = layoutManage.c();
                StickerGroupFragment to = this.o;
                int i2 = -1;
                if (i >= to || i1 >= to) {
                   i2 = to + 1;
                   i3 = i1;
                }else {
                   to = this.n;
                   if (i1 <= to || i <= to) {
                      i2 = to - 1;
                      i3 = i2;
                      i2 = i;
                   }else {
                      i3 = -1;
                   }
                }
                while (i2 <= i3) {
                   if (i2 > this.o || i2 < this.n) {
                      this.m.add(Pair.create(Integer.valueOf(i2), this.k.getStickerInfos().get(i2)));
                   }
                   i2 = i2 + 1;
                }
                this.n = i;
                this.o = i1;
             }
          }
       }
       return;
    }
    public void eh(List p0){
       this.m = p0;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, StickerGroupFragment.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.d(this.getActivity(), 0x7f0d0514, p1, false);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, StickerGroupFragment.class, "3")) {
          return;
       }
       super.onResume();
       StickerGroupFragment tq = this.q;
       if (tq != null && (tq.getValue() != null && (this.q.getValue()).equals(this.k.mGroupId))) {
          this.ch();
       }
    label_002e :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerGroupFragment.class, "2")) {
          return;
       }
       StickerGroupFragment obj = PatchProxy.apply(null, this, StickerGroupFragment.class, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.k != null && !q.f(this.l)){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          return;
       }else {
          super.onViewCreated(p0, p1);
          RecyclerView recyclerView = p0.findViewById(R.id.recycler_view);
          this.j = recyclerView;
          GridLayoutManager gridLayoutMa = PatchProxy.apply(null, this, StickerGroupFragment.class, "5");
          if (gridLayoutMa != patchProxyRe) {
          }else {
             i = a1.g();
             obj = (this.s != null)? this.t: this.u;
             i = i / obj;
             if (i > 0) {
                this.v = Math.min(i, this.v);
             }
             if (this.s != null) {
                this.v = Math.min(this.v, 3);
             }
             gridLayoutMa = new GridLayoutManager(this.getActivity(), this.v);
          }
          recyclerView.setLayoutManager(gridLayoutMa);
          StickerGroupFragment tj = this.j;
          if (!PatchProxy.applyVoidOneRefs(tj, this, StickerGroupFragment.class, "7")) {
             i = a1.h();
             obj = (this.s != null)? this.t: this.u;
             StickerGroupFragment tv = this.v;
             tj.addItemDecoration(new StickerGroupFragment$c(tv, ((i - (obj * tv)) / tv)));
             tj.setHasFixedSize(true);
          }
          tj = this.j;
          f uof = PatchProxy.apply(null, this, StickerGroupFragment.class, "6");
          if (uof != patchProxyRe) {
          }else {
             uof = new f(this.l);
             uof.i = this.s;
             uof.h = this.r;
             uof.L0(Lists.c(y.h(this.k.getStickerInfos(), j.b)));
          }
          tj.setAdapter(uof);
          this.j.addOnScrollListener(new StickerGroupFragment$a(this));
          return;
       }
    }
}
