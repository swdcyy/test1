package androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.m$e;
import java.util.ArrayList;
import androidx.recyclerview.widget.m$a;
import androidx.recyclerview.widget.m$b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewParent;
import androidx.recyclerview.widget.m$f;
import a2.f;
import android.content.Context;
import android.view.ViewGroup;
import android.view.GestureDetector$OnGestureListener;
import a2.i0;
import java.lang.Math;
import android.view.MotionEvent;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView$y;
import android.graphics.Canvas;
import java.util.List;
import android.content.res.Resources;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView$q;
import java.lang.Object;
import androidx.recyclerview.widget.m$g;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Integer;
import androidx.recyclerview.widget.m$d;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView$j;
import java.lang.System;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.recyclerview.widget.m$c;
import android.view.ViewConfiguration;

public class m extends RecyclerView$n implements RecyclerView$o	// class@000929
{
    public f A;
    public m$f B;
    public final RecyclerView$q C;
    public Rect D;
    public long E;
    public final List b;
    public final float[] c;
    public RecyclerView$ViewHolder d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;
    public m$e n;
    public int o;
    public int p;
    public List q;
    public int r;
    public RecyclerView s;
    public final Runnable t;
    public VelocityTracker u;
    public List v;
    public List w;
    public RecyclerView$j x;
    public View y;
    public int z;

    public void m(m$e p0){
       super();
       this.b = new ArrayList();
       float[] uofloatArray = new float[2];
       this.c = uofloatArray;
       this.d = null;
       this.m = -1;
       this.o = 0;
       this.q = new ArrayList();
       this.t = new m$a(this);
       this.x = null;
       this.y = null;
       this.z = -1;
       this.C = new m$b(this);
       this.n = p0;
    }
    public static boolean r(View p0,float p1,float p2,float p3,float p4){
       boolean b = (p1 - p3 >= 0 && (p1 - (p3 + (float)p0.getWidth()) <= 0 && (p2 - p4 >= 0 && p2 - (p4 + (float)p0.getHeight()) <= 0)))? true: false;
       return b;
    }
    public void A(RecyclerView$ViewHolder p0){
       if (!this.n.n(this.s, p0)) {
          return;
       }
       if (p0.itemView.getParent() != this.s) {
          return;
       }
       this.t();
       this.j = 0;
       this.i = 0;
       this.y(p0, 2);
       return;
    }
    public final void B(){
       this.B = new m$f(this);
       this.A = new f(this.s.getContext(), this.B);
    }
    public final void C(){
       m tB = this.B;
       if (tB != null) {
          tB.a();
          this.B = null;
       }
       if (this.A != null) {
          this.A = null;
       }
       return;
    }
    public final int D(RecyclerView$ViewHolder p0){
       int i3;
       if (this.o == 2) {
          return 0;
       }
       int i = this.n.j(this.s, p0);
       int i1 = 0xff00;
       int i2 = (this.n.d(i, i0.B(this.s)) & i1) >> 8;
       if (!i2) {
          return 0;
       }
       i = (i & i1) >> 8;
       if (Math.abs(this.i) - Math.abs(this.j) > 0) {
          i1 = this.g(p0, i2);
          if (i1 > 0) {
             if (!(i & i1)) {
                return m$e.e(i1, i0.B(this.s));
             }else {
                return i1;
             }
          }else {
             i3 = this.i(p0, i2);
             if (i3 > 0) {
                return i3;
             }
          }
       }else {
          i1 = this.i(p0, i2);
          if (i1 > 0) {
             return i1;
          }else {
             i3 = this.g(p0, i2);
             if (i3 > 0) {
                if (!(i & i3)) {
                   i3 = m$e.e(i3, i0.B(this.s));
                }
                return i3;
             }
          }
       }
       return 0;
    }
    public void E(MotionEvent p0,int p1,int p2){
       float f = p0.getX(p2) - this.e;
       this.i = f;
       this.j = p0.getY(p2) - this.f;
       if (!(p1 & 0x04)) {
          this.i = Math.max(0, f);
       }
       if (!(p1 & 0x08)) {
          this.i = Math.min(0, this.i);
       }
       if (!(p1 & 0x01)) {
          this.j = Math.max(0, this.j);
       }
       if (!(p1 & 0x02)) {
          this.j = Math.min(0, this.j);
       }
       return;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       p0.setEmpty();
    }
    public void d(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       int i;
       int i1;
       this.z = -1;
       if (this.d != null) {
          this.p(this.c);
          m tc = this.c;
          i = tc[1];
          i1 = tc[0];
       }else {
          i1 = 0;
          i = 0;
       }
       this.n.v(p0, p1, this.d, this.q, this.o, i1, i);
       return;
    }
    public void e(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       int i;
       int i1;
       if (this.d != null) {
          this.p(this.c);
          m tc = this.c;
          i = tc[1];
          i1 = tc[0];
       }else {
          i1 = 0;
          i = 0;
       }
       this.n.w(p0, p1, this.d, this.q, this.o, i1, i);
       return;
    }
    public void f(RecyclerView p0){
       m ts = this.s;
       if (ts == p0) {
          return;
       }
       if (ts != null) {
          this.j();
       }
       this.s = p0;
       if (p0 != null) {
          Resources resources = p0.getResources();
          this.g = resources.getDimension(0x7f070479);
          this.h = resources.getDimension(0x7f070478);
          this.z();
       }
       return;
    }
    public final int g(RecyclerView$ViewHolder p0,int p1){
       if (p1 & 0x0c) {
          int i = 8;
          int i1 = 0;
          int i2 = (this.i - i1 > 0)? 8: 4;
          m tu = this.u;
          if (tu != null && this.m > -1) {
             tu.computeCurrentVelocity(1000, this.n.m(this.h));
             float xVelocity = this.u.getXVelocity(this.m);
             float yVelocity = this.u.getYVelocity(this.m);
             if (xVelocity - i1 <= 0) {
                i = 4;
             }
             float f = Math.abs(xVelocity);
             if ((i & p1) && (i2 == i && (f - this.n.k(this.g) >= 0 && f - Math.abs(yVelocity) > 0))) {
                return i;
             }
          }
       label_005d :
          float f1 = (float)this.s.getWidth() * this.n.l(p0);
          if ((p1 & i2) && Math.abs(this.i) - f1 > 0) {
             return i2;
          }
       }
    label_007b :
       return 0;
    }
    public void h(int p0,MotionEvent p1,int p2){
       if (this.d != null || (p0 != 2 || (this.o != 2 && this.n.p()))) {
          if (this.s.getScrollState() == 1) {
             return;
          }else {
             RecyclerView$ViewHolder viewHolder = this.o(p1);
             if (viewHolder == null) {
                return;
             }else {
                int i = (this.n.f(this.s, viewHolder) & 0xff00) >> 8;
                if (!i) {
                   return;
                }else {
                   float f = p1.getX(p2) - this.e;
                   float f1 = p1.getY(p2) - this.f;
                   float f2 = Math.abs(f);
                   float f3 = Math.abs(f1);
                   float f4 = (float)this.r;
                   if (f2 - f4 < 0 && f3 - f4 < 0) {
                      return;
                   }else if(f2 - f3 > 0){
                      if (f < 0 && !(i & 0x04)) {
                         return;
                      }else if(f > 0 && !(i & 0x08)){
                         return;
                      }
                   }else if(f1 < 0 && !(i & 0x01)){
                      return;
                   }else if(f1 > 0 && !(i & 0x02)){
                      return;
                   }
                   this.j = 0;
                   this.i = 0;
                   this.m = p1.getPointerId(0);
                   this.y(viewHolder, 1);
                }
             }
          }
       }
       return;
    }
    public final int i(RecyclerView$ViewHolder p0,int p1){
       if (p1 & 0x03) {
          int i = 2;
          int i1 = 0;
          int i2 = (this.j - i1 > 0)? 2: 1;
          m tu = this.u;
          if (tu != null && this.m > -1) {
             tu.computeCurrentVelocity(1000, this.n.m(this.h));
             float xVelocity = this.u.getXVelocity(this.m);
             float yVelocity = this.u.getYVelocity(this.m);
             if (yVelocity - i1 <= 0) {
                i = 1;
             }
             float f = Math.abs(yVelocity);
             if ((i & p1) && (i == i2 && (f - this.n.k(this.g) >= 0 && f - Math.abs(xVelocity) > 0))) {
                return i;
             }
          }
       label_005b :
          float f1 = (float)this.s.getHeight() * this.n.l(p0);
          if ((p1 & i2) && Math.abs(this.j) - f1 > 0) {
             return i2;
          }
       }
    label_0079 :
       return 0;
    }
    public final void j(){
       this.s.removeItemDecoration(this);
       this.s.removeOnItemTouchListener(this.C);
       this.s.removeOnChildAttachStateChangeListener(this);
       for (int i = this.q.size() - 1; i >= 0; i = i - 1) {
          m$g og = this.q.get(0);
          og.a();
          this.n.c(this.s, og.e);
       }
       this.q.clear();
       this.y = null;
       this.z = -1;
       this.v();
       this.C();
       return;
    }
    public void k(RecyclerView$ViewHolder p0,boolean p1){
       int i = this.q.size() - 1;
       while (true) {
          if (i < 0) {
             return;
          }
          m$g og = this.q.get(i);
          if (og.e == p0) {
             og.l = og.l | p1;
             if (og.m == null) {
                og.a();
                break ;
             }
             break ;
          }else {
             i = i - 1;
          }
       }
       this.q.remove(i);
       return;
    }
    public m$g l(MotionEvent p0){
       m$g og;
       if (this.q.isEmpty()) {
          return null;
       }
       View view = this.m(p0);
       int i = this.q.size();
       while (true) {
          i = i - 1;
          if (i < 0) {
             return null;
          }
          og = this.q.get(i);
          if (og.e.itemView == view) {
             break ;
          }
       }
       return og;
    }
    public View m(MotionEvent p0){
       RecyclerView$ViewHolder itemView1;
       float x = p0.getX();
       float y = p0.getY();
       m td = this.d;
       if (td != null) {
          RecyclerView$ViewHolder itemView = td.itemView;
          if (m.r(itemView, x, y, (this.k + this.i), (this.l + this.j))) {
             return itemView;
          }
       }
       int i = this.q.size() - 1;
       while (true) {
          if (i < 0) {
             return this.s.findChildViewUnder(x, y);
          }
          m$g og = this.q.get(i);
          itemView1 = og.e.itemView;
          if (m.r(itemView1, x, y, og.j, og.k)) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return itemView1;
    }
    public void m3(View p0){
       this.w(p0);
       RecyclerView$ViewHolder childViewHol = this.s.getChildViewHolder(p0);
       if (childViewHol == null) {
          return;
       }
       m td = this.d;
       int i = 0;
       if (td != null && childViewHol == td) {
          this.y(null, i);
       }else {
          this.k(childViewHol, i);
          if (this.b.remove(childViewHol.itemView)) {
             this.n.c(this.s, childViewHol);
          }
       }
       return;
    }
    public final List n(RecyclerView$ViewHolder p0){
       m om = this;
       RecyclerView$ViewHolder viewHolder = p0;
       m v = om.v;
       if (v == null) {
          om.v = new ArrayList();
          om.w = new ArrayList();
       }else {
          v.clear();
          om.w.clear();
       }
       Objects.requireNonNull(om.n);
       int i = 0;
       int i1 = Math.round((om.k + om.i)) - i;
       int i2 = Math.round((om.l + om.j)) - i;
       int i3 = (viewHolder.itemView.getWidth() + i1) + i;
       int i4 = (viewHolder.itemView.getHeight() + i2) + i;
       int i5 = (i1 + i3) / 2;
       int i6 = (i2 + i4) / 2;
       RecyclerView$LayoutManager layoutManage = om.s.getLayoutManager();
       int childCount = layoutManage.getChildCount();
       int i7 = 0;
       while (i7 < childCount) {
          View childAt = layoutManage.getChildAt(i7);
          if (childAt == viewHolder.itemView || (childAt.getBottom() < i2 || (childAt.getTop() > i4 || (childAt.getRight() >= i1 && childAt.getLeft() <= i3)))) {
             RecyclerView$ViewHolder childViewHol = om.s.getChildViewHolder(childAt);
             if (om.n.a(om.s, om.d, childViewHol)) {
                i = (Math.abs((i5 - ((childAt.getLeft() + childAt.getRight()) / 2))) * Math.abs((i5 - ((childAt.getLeft() + childAt.getRight()) / 2)))) + (Math.abs((i6 - ((childAt.getTop() + childAt.getBottom()) / 2))) * Math.abs((i6 - ((childAt.getTop() + childAt.getBottom()) / 2))));
                int i8 = om.v.size();
                int i9 = 0;
                int i10 = 0;
                while (i9 < i8 && i > om.w.get(i9).intValue()) {
                   i10 = i10 + 1;
                   i9 = i9 + 1;
                   int i11 = p0;
                }
                om.v.add(i10, childViewHol);
                om.w.add(i10, Integer.valueOf(i));
             }
          }
       label_00e7 :
          i7 = i7 + 1;
          viewHolder = p0;
          m om1 = null;
       }
       return om.v;
    }
    public final RecyclerView$ViewHolder o(MotionEvent p0){
       RecyclerView$LayoutManager layoutManage = this.s.getLayoutManager();
       m tm = this.m;
       if (tm == -1.#Rf) {
          return null;
       }
       int i = p0.findPointerIndex(tm);
       float f = Math.abs((p0.getX(i) - this.e));
       float f1 = Math.abs((p0.getY(i) - this.f));
       m tr = this.r;
       if (f - (float)tr < 0 && f1 - (float)tr < 0) {
          return null;
       }
       if (f - f1 > 0 && layoutManage.canScrollHorizontally()) {
          return null;
       }
       if (f1 - f > 0 && layoutManage.canScrollVertically()) {
          return null;
       }
       View view = this.m(p0);
       if (view == null) {
          return null;
       }
       return this.s.getChildViewHolder(view);
    }
    public final void p(float[] p0){
       int i = 0;
       p0[i] = (this.p & 0x0c)? (this.k + this.i) - (float)this.d.itemView.getLeft(): this.d.itemView.getTranslationX();
       p0[1] = (this.p & 0x03)? (this.l + this.j) - (float)this.d.itemView.getTop(): this.d.itemView.getTranslationY();
       return;
    }
    public boolean q(){
       int i = this.q.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          if (this.q.get(i1).m == null) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
    public void s(RecyclerView$ViewHolder p0){
       if (this.s.isLayoutRequested()) {
          return;
       }
       if (this.o != 2) {
          return;
       }
       float f = this.n.i(p0);
       int i = (int)(this.k + this.i);
       int i1 = (int)(this.l + this.j);
       if ((float)Math.abs((i1 - p0.itemView.getTop())) - ((float)p0.itemView.getHeight() * f) < 0 && (float)Math.abs((i - p0.itemView.getLeft())) - ((float)p0.itemView.getWidth() * f) < 0) {
          return;
       }
       List list = this.n(p0);
       if (!list.size()) {
          return;
       }
       RecyclerView$ViewHolder viewHolder = this.n.b(p0, list, i, i1);
       if (viewHolder == null) {
          this.v.clear();
          this.w.clear();
          return;
       }else {
          int absoluteAdap = viewHolder.getAbsoluteAdapterPosition();
          int absoluteAdap1 = p0.getAbsoluteAdapterPosition();
          if (this.n.x(this.s, p0, viewHolder)) {
             this.n.y(this.s, p0, absoluteAdap1, viewHolder, absoluteAdap, i, i1);
          }
          return;
       }
    }
    public void t(){
       m tu = this.u;
       if (tu != null) {
          tu.recycle();
       }
       this.u = VelocityTracker.obtain();
       return;
    }
    public void u(m$g p0,int p1){
       this.s.post(new m$d(this, p0, p1));
    }
    public final void v(){
       m tu = this.u;
       if (tu != null) {
          tu.recycle();
          this.u = null;
       }
       return;
    }
    public void w(View p0){
       if (p0 == this.y) {
          this.y = null;
          if (this.x != null) {
             this.s.setChildDrawingOrderCallback(null);
          }
       }
       return;
    }
    public void w6(View p0){
    }
    public boolean x(){
       int i4;
       int i5;
       m om = this;
       boolean b = false;
       if (om.d == null) {
          om.E = Long.MIN_VALUE;
          return b;
       }else {
          long l = System.currentTimeMillis();
          m e = om.E;
          int i = (!e - Long.MIN_VALUE)? 0: l - e;
          RecyclerView$LayoutManager layoutManage = om.s.getLayoutManager();
          if (om.D == null) {
             om.D = new Rect();
          }
          layoutManage.calculateItemDecorationsForChild(om.d.itemView, om.D);
          m om1 = null;
          if (layoutManage.canScrollHorizontally()) {
             int i1 = (int)(om.k + om.i);
             int i2 = (i1 - om.D.left) - om.s.getPaddingLeft();
             m i3 = om.i;
             if (i3 - om1 < 0 && i2 < 0) {
                i4 = i2;
             label_007e :
                if (layoutManage.canScrollVertically()) {
                   i5 = (int)(om.l + om.j);
                   i1 = (i5 - om.D.top) - om.s.getPaddingTop();
                   m j = om.j;
                   if (j - om1 < 0 && i1 < 0) {
                      i5 = i1;
                   label_00c5 :
                      if (i4) {
                         i4 = om.n.o(om.s, om.d.itemView.getWidth(), i4, om.s.getWidth(), i);
                      }
                      int i6 = i4;
                      if (i5) {
                         i4 = i6;
                         i5 = om.n.o(om.s, om.d.itemView.getHeight(), i5, om.s.getHeight(), i);
                      }else {
                         i4 = i6;
                      }
                      if (i4 || i5) {
                         if (!om.E - Long.MIN_VALUE) {
                            om.E = l;
                         }
                         om.s.scrollBy(i4, i5);
                         return true;
                      }else {
                         om.E = Long.MIN_VALUE;
                         return b;
                      }
                   }else if(j - om1 > 0){
                      i5 = ((i5 + om.d.itemView.getHeight()) + om.D.bottom) - (om.s.getHeight() - om.s.getPaddingBottom());
                      if (i5 > 0) {
                         goto label_00c5 ;
                      }
                   }
                }
                i5 = 0;
                goto label_00c5 ;
             }else if(i3 - om1 > 0){
                i1 = ((i1 + om.d.itemView.getWidth()) + om.D.right) - (om.s.getWidth() - om.s.getPaddingRight());
                if (i1 > 0) {
                   i4 = i1;
                   goto label_007e ;
                }
             }
          }
          i4 = 0;
          goto label_007e ;
       }
    }
    public void y(RecyclerView$ViewHolder p0,int p1){
       m om1;
       float f;
       float f1;
       int i6;
       m om = this;
       RecyclerView$ViewHolder viewHolder = p0;
       int i = p1;
       if (viewHolder == om.d && i == om.o) {
          return;
       }
       om.E = Long.MIN_VALUE;
       m o = om.o;
       boolean b = true;
       om.k(viewHolder, b);
       om.o = i;
       int i1 = 2;
       if (i == i1) {
          if (viewHolder != null) {
             om.y = viewHolder.itemView;
          }else {
             throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
          }
       }
       int i2 = 8;
       int i3 = (b << ((i * 8) + i2)) - 1;
       m d = om.d;
       int i4 = 0;
       if (d != null) {
          if (d.itemView.getParent() != null) {
             int i5 = (o == i1)? 0: om.D(d);
             this.v();
             om1 = 4;
             if (i5 != b && i5 != i1) {
                f = (i5 != om1 && (i5 != i2 && (i5 != 16 && i5 != 32)))? 0: Math.signum(om.i) * (float)om.s.getWidth();
                f1 = 0;
             }else {
                f1 = Math.signum(om.j) * (float)om.s.getHeight();
                f = 0;
             }
             if (o == i1) {
                i6 = 8;
             }else if(i5 > 0){
                i6 = 2;
             }else {
                i6 = 4;
             }
             om.p(om.c);
             om1 = om.c;
             int i7 = om1[i4];
             int i8 = om1[b];
             m$c uoc = v5;
             m$c uoc1 = v5;
             uoc = new m$c(this, d, i6, o, i7, i8, f, f1, i5, d);
             uoc1.b(om.n.g(om.s, i6, (f - i7), (f1 - i8)));
             om.q.add(uoc1);
             uoc1.d();
             i4 = 1;
          }else {
             om1 = d;
             om.w(om1.itemView);
             om.n.c(om.s, om1);
             i4 = 0;
          }
          om.d = null;
       }else {
          i4 = 0;
       }
       if (viewHolder != null) {
          om.p = (om.n.f(om.s, viewHolder) & i3) >> (om.o * 8);
          om.k = (float)viewHolder.itemView.getLeft();
          om.l = (float)viewHolder.itemView.getTop();
          om.d = viewHolder;
          if (i == 2) {
             viewHolder.itemView.performHapticFeedback(0);
          label_0120 :
             ViewParent parent = om.s.getParent();
             if (parent != null) {
                b = (om.d != null)? true: false;
                parent.requestDisallowInterceptTouchEvent(b);
             }
             if (!i4) {
                om.s.getLayoutManager().requestSimpleAnimationsInNextLayout();
             }
             om.n.z(om.d, om.o);
             om.s.invalidate();
             return;
          }
       }
       m om2 = null;
       goto label_0120 ;
    }
    public final void z(){
       this.r = ViewConfiguration.get(this.s.getContext()).getScaledTouchSlop();
       this.s.addItemDecoration(this);
       this.s.addOnItemTouchListener(this.C);
       this.s.addOnChildAttachStateChangeListener(this);
       this.B();
    }
}
