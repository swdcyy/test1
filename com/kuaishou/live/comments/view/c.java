package com.kuaishou.live.comments.view.c;
import com.kuaishou.live.comments.view.a;
import android.view.ViewGroup;
import com.kuaishou.live.comments.view.LiveCommentsView;
import g81.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k81.b;
import java.lang.Object;
import android.util.SparseIntArray;
import androidx.collection.ArraySet;
import java.util.HashSet;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager;
import android.content.Context;
import q81.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import com.kuaishou.live.comments.view.b;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$ScrollSpeed;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import java.lang.Integer;
import com.kuaishou.live.comments.view.c$a;
import java.lang.Enum;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import android.view.View;
import java.lang.Number;
import p81.e;
import java.util.Set;
import et5.a;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$a;
import java.util.Objects;
import com.yxcorp.utility.n;
import p81.d;
import java.util.Iterator;
import ekd.k1;
import android.view.View$OnTouchListener;
import q81.e;
import java.util.Collection;
import ekd.q;

public class c implements a	// class@000e4f
{
    public ViewGroup b;
    public final LiveCommentsView c;
    public final RecyclerView$Adapter d;
    public boolean e;
    public final c f;
    public final a g;
    public final SparseIntArray h;
    public final SparseIntArray i;
    public final SparseIntArray j;
    public final SparseIntArray k;
    public final LiveCommentLinearLayoutManager l;
    public final Set m;
    public final Set n;
    public Set o;

    public void c(ViewGroup p0,LiveCommentsView p1,a p2,RecyclerView$Adapter p3,b p4){
       super();
       this.h = new SparseIntArray();
       this.i = new SparseIntArray();
       this.j = new SparseIntArray();
       this.k = new SparseIntArray();
       this.m = new ArraySet(2);
       this.n = new ArraySet();
       this.o = new HashSet();
       if (p0 == null) {
          p0 = p1;
       }
       this.b = p0;
       this.c = p1;
       this.g = p2;
       LiveCommentLinearLayoutManager liveCommentL = new LiveCommentLinearLayoutManager(p0.getContext());
       this.l = liveCommentL;
       this.d = p3;
       RecyclerView$l ol = null;
       this.f = (p4 != null)? new c(p1, p4): ol;
       if (!PatchProxy.applyVoidTwoRefs(p1, p3, this, c.class, "21")) {
          liveCommentL.M0(true);
          p1.setLayoutManager(liveCommentL);
          p1.setItemAnimator(ol);
          p1.setAdapter(p3);
          p1.addOnScrollListener(new b(this));
       }
       return;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, c.class, "31")) {
          return;
       }
       this.d.k0();
       return;
    }
    public void Fm(){
       if (PatchProxy.applyVoid(null, this, c.class, "19")) {
          return;
       }
       c tf = this.f;
       if (tf != null) {
          tf.c();
       }
       return;
    }
    public void If(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "16")) {
          return;
       }
       if (!p0) {
          Object obj = PatchProxy.apply(null, this, uoc, "34");
          if (obj != PatchProxyResult.class) {
             obj = obj.booleanValue();
          }else if(this.l.v == LiveCommentLinearLayoutManager$ScrollSpeed.SLOW){
             obj = true;
          }else {
             obj = false;
          }
          if (obj || this.Zb()) {
             return;
          }
       }
       int itemCount = this.d.getItemCount();
       if (itemCount > 0) {
          this.c.smoothScrollToPosition((itemCount - 1));
       }
       return;
    }
    public void K0(LayoutParamsType p0,int p1,int p2){
       ViewGroup$MarginLayoutParams layoutParams;
       ViewGroup$MarginLayoutParams height;
       ViewGroup$MarginLayoutParams bottomMargin;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "1")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       int i = c$a.a[p0.ordinal()];
       String str = null;
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5 && this.g.b == null) {
                      b.d0(LiveLogTag.COMMENT, "LiveCommentsViewServiceImpl updateHeight", "biz", Integer.valueOf(p1), "height", Integer.valueOf(p2));
                      if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), this, uoc, "23")) {
                         layoutParams = this.b.getLayoutParams();
                         height = layoutParams.height;
                         if (p2 != height) {
                            layoutParams.height = p2;
                            this.b.requestLayout();
                            this.w(LayoutParamsType.HEIGHT, height, p2);
                         }
                      }
                   }
                }else if(PatchProxy.isSupport(uoc) && (PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(p2), this, uoc, "25") || this.g.c != null)){
                   if (p2) {
                      this.j.put(p1, p2);
                   }else {
                      this.j.delete(p1);
                   }
                   i = 0;
                   for (; str < this.j.size(); str = str + 1) {
                      i = i + this.j.valueAt(str);
                   }
                   p1 = this.c.getCustomFadingEdgeTop();
                   if (i != p1) {
                      this.c.setCustomFadingEdgeTop(i);
                      this.w(LayoutParamsType.FADING_EDGE_TOP, p1, i);
                   }
                }
             }else if(PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(p2), this, uoc, "24")){
                if (p2) {
                   this.i.put(p1, p2);
                }else {
                   this.i.delete(p1);
                }
                i = 0;
                for (; str < this.i.size(); str = str + 1) {
                   i = Math.max(this.i.valueAt(str), i);
                }
                height = this.b.getLayoutParams();
                bottomMargin = height.bottomMargin;
                if (i != bottomMargin) {
                   height.bottomMargin = i;
                   this.b.requestLayout();
                   this.w(LayoutParamsType.BOTTOM_MARGIN, bottomMargin, i);
                }
             }
          }else if(PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(p2), this, uoc, "22")){
             if (p2) {
                this.h.put(p1, p2);
             }else {
                this.h.delete(p1);
             }
             p1 = 0;
             for (i = 0; i < this.h.size(); i++) {
                p1 = Math.max(this.h.valueAt(i), p1);
             }
             layoutParams = this.b.getLayoutParams();
             bottomMargin = layoutParams.rightMargin;
             if (p1 != bottomMargin) {
                layoutParams.setMarginEnd(p1);
                layoutParams.rightMargin = p1;
                for (; str < this.c.getChildCount(); str = str + 1) {
                   this.c.getChildAt(str).forceLayout();
                }
                this.b.setLayoutParams(layoutParams);
                this.w(LayoutParamsType.RIGHT_MARGIN, bottomMargin, p1);
                this.E();
             }
          }
       }else if(PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(p2), this, uoc, "27")){
          this.k.put(p1, p2);
          i = 0;
          for (; str < this.k.size(); str = str + 1) {
             i = Math.max(i, this.k.valueAt(str));
          }
          p1 = this.b.getVisibility();
          if (i != p1) {
             this.b.setVisibility(i);
             this.w(LayoutParamsType.VISIBILITY, p1, i);
          }
       }
    label_01df :
       return;
    }
    public void Nl(){
       if (PatchProxy.applyVoid(null, this, c.class, "29")) {
          return;
       }
       this.r();
       return;
    }
    public void Pa(){
       if (PatchProxy.applyVoid(null, this, c.class, "33")) {
          return;
       }
       c tf = this.f;
       if (tf != null) {
          tf.a();
       }
       return;
    }
    public int Tl(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getHeight();
    }
    public void Wa(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "11")) {
          return;
       }
       this.o.remove(p0);
       return;
    }
    public void Wd(){
       if (PatchProxy.applyVoid(null, this, c.class, "32")) {
          return;
       }
       c tf = this.f;
       if (tf != null) {
          tf.b();
       }
       return;
    }
    public void X1(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       c tn = this.n;
       if (tn != null && p0 != null) {
          tn.remove(p0);
       }
       return;
    }
    public boolean Zb(){
       c obj = PatchProxy.apply(null, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       boolean b = (obj != null && obj.f != null)? true: false;
       return b;
    }
    public ViewGroup a2(){
       c tb = this.b;
       if (tb != null) {
          return tb;
       }
       return this.c;
    }
    public void c4(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       if (p0 != null) {
          this.n.add(p0);
       }
       return;
    }
    public void cn(LiveCommentLinearLayoutManager$ScrollSpeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       this.l.v = p0;
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void db(LiveCommentLinearLayoutManager$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "14")) {
          return;
       }
       c tl = this.l;
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoidOneRefs(p0, tl, LiveCommentLinearLayoutManager.class, "1")) {
          LiveCommentLinearLayoutManager$a a = p0.a;
          tl.s = a;
          tl.t = p0.b;
          tl.u = p0.c;
          b.e0(LiveLogTag.COMMENT, "updateComments, setLiveCommentScrollConfig", "mEnableNewSpeedStrategy", Boolean.valueOf(a), "mFastScrollSpeedPx", Integer.valueOf(tl.t), "mSlowScrollSpeedPx", Integer.valueOf(tl.u));
       }
       return;
    }
    public void de(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "35")) {
          return;
       }
       this.c.setCustomFadingEdgeLength(p0);
       return;
    }
    public void destroy(){
       b.b(this);
    }
    public void do(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "17")) {
          return;
       }
       uoc = this.f;
       if (uoc != null) {
          uoc.g = p0;
       }
       return;
    }
    public int f8(LayoutParamsType p0){
       ViewGroup$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == LayoutParamsType.FADING_EDGE_TOP) {
          return this.c.getCustomFadingEdgeTop();
       }
       if (p0 == LayoutParamsType.VISIBILITY) {
          return this.b.getVisibility();
       }
       obj = this.b.getLayoutParams();
       if (obj instanceof ViewGroup$MarginLayoutParams) {
          if (p0 == LayoutParamsType.BOTTOM_MARGIN) {
             return obj.bottomMargin;
          }else if(p0 == LayoutParamsType.RIGHT_MARGIN){
             return obj.rightMargin;
          }else if(p0 == LayoutParamsType.HEIGHT){
             return this.b.getHeight();
          }
       }
       return -1;
    }
    public boolean ga(){
       Object obj = PatchProxy.apply(null, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return n.J(this.c, true);
    }
    public void ho(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       if (p0 != null) {
          this.m.add(p0);
       }
       return;
    }
    public void ic(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       if (p0 != null) {
          this.m.remove(p0);
       }
       return;
    }
    public void mc(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "10")) {
          return;
       }
       if (p0 != null) {
          this.o.add(p0);
       }
       return;
    }
    public void oj(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "12")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          if (p0) {
             uoe.b();
          }else {
             uoe.a();
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, c.class, "30")) {
          return;
       }
       k1.n(this);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, c.class, "20")) {
          return;
       }
       this.Nl();
       c tf = this.f;
       if (tf != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(null, tf, c.class, "7")) {
             tf.c();
             tf.b.setOnTouchListener(null);
             tf.d.clear();
          }
       }
       this.n.clear();
       this.o.clear();
       this.m.clear();
       this.c.clearOnScrollListeners();
       this.i.clear();
       this.h.clear();
       this.j.clear();
       this.k.clear();
       return;
    }
    public void sm(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       c tf = this.f;
       if (tf != null && p0 != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(p0, tf, c.class, "4")) {
             tf.d.add(p0);
          }
       }
       return;
    }
    public final void w(LayoutParamsType p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "26")) {
          return;
       }
       if (q.f(this.n)) {
          return;
       }
       Iterator iterator = this.n.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1, p2);
       }
       return;
    }
    public void wf(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       c tf = this.f;
       if (tf != null && p0 != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(p0, tf, c.class, "5")) {
             tf.d.remove(p0);
          }
       }
       return;
    }
    public void xj(boolean p0){
       this.e = p0;
    }
}
