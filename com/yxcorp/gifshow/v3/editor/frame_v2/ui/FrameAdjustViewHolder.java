package com.yxcorp.gifshow.v3.editor.frame_v2.ui.FrameAdjustViewHolder;
import pn9.a;
import android.view.View;
import zqc.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView;
import zqc.d;
import com.yxcorp.gifshow.v3.editor.frame_v2.ui.FrameAdjustViewHolder$a;
import com.yxcorp.gifshow.v3.editor.frame_v2.ui.FrameAdjustViewHolder$layoutManager$1;
import android.content.Context;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import java.util.List;
import g9c.a;
import java.util.Iterator;
import wqc.d;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import nn9.b;
import mn9.a;
import wqc.e;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import java.lang.Iterable;

public final class FrameAdjustViewHolder extends a	// class@000fa8
{
    public final int f;
    public final RecyclerView g;
    public final d h;
    public final FrameAdjustViewHolder$a i;
    public final View j;
    public final i k;
    public final boolean l;

    public void FrameAdjustViewHolder(View p0,i p1,boolean p2){
       String str = "itemView";
       a.p(p0, str);
       a.p(p1, "frameAdjustListener");
       super(p0);
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.f = a1.e(16.00f);
       View view = p0.findViewById(R.id.frame_adjust_recycler);
       a.o(view, "itemView.findViewById\(R.id.frame_adjust_recycler\)");
       this.g = view;
       d uod = new d(p2);
       this.h = uod;
       FrameAdjustViewHolder$a uoa = new FrameAdjustViewHolder$a(this);
       this.i = uoa;
       a.o(p0, str);
       FrameAdjustViewHolder$layoutManager$1 olayoutManag = new FrameAdjustViewHolder$layoutManager$1(this, p0.getContext(), 0, 0);
       Objects.requireNonNull(uod);
       if (PatchProxy.applyVoidOneRefs(uoa, uod, d.class, "3")) {
       }else {
          a.p(uoa, "l");
          uod.g = uoa;
       }
       a.o(p0, str);
       int i = n.z(p0.getContext());
       Iterator iterator = uod.Q0().iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          i1 = i1 + iterator.next().a();
       }
       this.g.addItemDecoration(new b(0, 0, (((i - i1) - (this.f * 2)) / (this.h.getItemCount() - 1))));
       this.g.setLayoutManager(olayoutManag);
       this.g.setAdapter(this.h);
       return;
    }
    public void f(b p0,b p1){
       e a;
       Object obj;
       FrameAdjustViewHolder uFrameAdjust = FrameAdjustViewHolder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uFrameAdjust, "2")) {
          return;
       }
       a.p(p1, "newState");
       a uoa = p1.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.frame_v2.model.EditFrameItem");
       a = uoa.a;
       Object[] objArray = new Object[0];
       a.D().w("FrameAdjustViewHolder", "onStateChanged newFrameType="+a, objArray);
       if (!PatchProxy.isSupport(uFrameAdjust) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(a), this, uFrameAdjust, "1")) {
          if (a < true || a > 7) {
             a = 1;
          }
          List list = this.h.Q0();
          a.o(list, "mAdapter.list");
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                Object obj1 = (obj.b() == a)? 1: null;
                if (!obj1) {
                   continue ;
                }
             }else {
                obj = null;
             }
             List list1 = this.h.Q0();
             a.o(list1, "mAdapter.list");
             Iterator iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                d uod = iterator1.next();
                uod.a = a.g(uod, obj);
             }
             this.h.k0();
          }
       }
       return;
    }
}
