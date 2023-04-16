package z8c.a;
import androidx.recyclerview.widget.RecyclerView$n;
import android.util.SparseArray;
import java.util.HashSet;
import o56.c;
import o56.a;
import android.app.Application;
import zf6.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import r0.a;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Canvas;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$a;
import java.util.Collection;
import ekd.q;
import java.lang.Integer;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import g9c.d;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import a2.i0;
import java.lang.Math;
import br8.b;
import z8c.a$a;

public class a extends RecyclerView$n	// class@004c1d
{
    public final SparseArray a;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public int e;
    public boolean f;
    public boolean g;
    public SparseArray h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public Set n;

    public void a(){
       super(1, 1, 1);
    }
    public void a(int p0,boolean p1,boolean p2){
       super();
       this.a = new SparseArray();
       this.n = new HashSet();
       this.b = a.d(a.a().a(), l.m(0x7f080687, 0x7f080685));
       this.f = p1;
       this.g = p2;
       this.e = p0;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "8")) {
          return;
       }
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (!this.i(p2, childAdapter) && !this.j(p2, childAdapter)) {
          Drawable uDrawable = this.f(p2, childAdapter);
          if (this.e == 1) {
             if (this.f != null && !childAdapter) {
                Drawable uDrawable1 = this.g();
                int intrinsicHei = (uDrawable1 != null)? uDrawable1.getIntrinsicHeight(): 0;
                int intrinsicHei1 = (uDrawable != null)? uDrawable.getIntrinsicHeight(): 0;
                p0.set(0, intrinsicHei, 0, intrinsicHei1);
             }else if(uDrawable != null){
                p0.set(0, 0, 0, uDrawable.getIntrinsicHeight());
             }
          }else if(uDrawable != null){
             p0.set(0, 0, uDrawable.getIntrinsicWidth(), 0);
          }
          if (this.g == null && this.k(p2, childAdapter)) {
             p0.bottom = 0;
          }
       }
    label_0068 :
       return;
    }
    public void d(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       int i3;
       int i4;
       int childAdapter;
       int i5;
       int i6;
       a obj2;
       int i7;
       a j;
       View view;
       View childAt1;
       int childAt1;
       RecyclerView$Adapter this;
       a uoa = this;
       Object obj = p0;
       Object obj1 = p1;
       a uoa1 = a.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "4")) {
          return;
       }
       int i = 1;
       int i1 = 0;
       if (uoa.e == i) {
          if (!PatchProxy.applyVoidTwoRefs(obj, obj1, uoa, uoa1, "5")) {
             int i2 = p1.getPaddingLeft() + uoa.l;
             i3 = (p1.getWidth() - p1.getPaddingRight()) - uoa.m;
             int childCount = p1.getChildCount();
             RecyclerView$Adapter adapter = p1.getAdapter();
             i4 = 0;
             while (i4 < childCount) {
                childAdapter = obj1.getChildAdapterPosition(obj1.getChildAt(i4));
                if (uoa.i(obj1, childAdapter) || (!uoa.j(obj1, childAdapter) && !uoa instanceof MissUUserProfileAndNoticeFragment$a)) {
                   if (adapter != null && !q.f(uoa.n)) {
                      if (!uoa.n.contains(Integer.valueOf(adapter.f0(childAdapter)))) {
                         i5 = adapter.getItemCount() - i;
                         if (childAdapter < i5) {
                            i6 = childAdapter + 1;
                            if (!uoa.n.contains(Integer.valueOf(adapter.f0(i6)))) {
                            }
                         }else if(uoa.f != null){
                            if (PatchProxy.isSupport(uoa1)) {
                               obj2 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(childAdapter), uoa, uoa1, "12");
                               if (obj2 != PatchProxyResult.class) {
                                  i5 = obj2.booleanValue();
                               }else {
                               label_00bb :
                                  RecyclerView$Adapter adapter1 = p1.getAdapter();
                                  if (adapter1 instanceof d) {
                                     i5 = childAdapter - adapter1.b1();
                                     if (!i5) {
                                     label_00d0 :
                                        i5 = true;
                                     }
                                  }else if(!childAdapter){
                                     goto label_00d0 ;
                                  }
                                  i5 = false;
                               }
                            }else {
                               goto label_00bb ;
                            }
                            if (i5) {
                               View childAt = obj1.getChildAt(childAdapter);
                               i = childAdapter;
                               i7 = i4;
                               if (!PatchProxy.applyVoidThreeRefs(p0, p1, childAt, this, a.class, "6")) {
                                  Drawable uDrawable1 = this.g();
                                  if (uDrawable1 != null) {
                                     j = uoa.i;
                                     a j1 = uoa.j;
                                     this = p1.getAdapter();
                                     if (this != null && this.f0(i1) != uoa.k) {
                                        i6 = 0;
                                        j1 = 0;
                                     }
                                     childAdapter = p1.getWidth() - p1.getPaddingRight();
                                     int i8 = childAt.getTop() - childAt.getLayoutParams().topMargin;
                                     i4 = i8 + Math.round(i0.N(childAt));
                                     i1 = i4 - uDrawable1.getIntrinsicHeight();
                                     childAt1 = p1.getPaddingLeft() + i6;
                                     childAdapter = childAdapter - j1;
                                     uDrawable1.setBounds(childAt1, i1, childAdapter, i4);
                                     uDrawable1.draw(obj);
                                  }
                               }
                            }else {
                            label_0142 :
                               i = childAdapter;
                               i7 = i4;
                            }
                         }else {
                            goto label_0142 ;
                         }
                         obj2 = uoa.i;
                         j = uoa.j;
                         if (adapter != null && adapter.f0(i) != uoa.k) {
                            view = null;
                            j = 0;
                         }
                         b uob = null;
                         if (p1.getAdapter() instanceof b) {
                            uob = p1.getAdapter();
                         }else if(p1.getAdapter() instanceof d && p1.getAdapter().W0() instanceof b){
                            uob = p1.getAdapter().W0();
                         }
                         if (uob != null) {
                            childAdapter = i + 1;
                            if (uob.getItemCount() <= childAdapter || !uob.E(i) - uob.E(childAdapter)) {
                            label_019e :
                               if (uoa.g != null || !uoa.k(obj1, i)) {
                                  Drawable uDrawable = (uoa.a.size() > 0)? uoa.f(obj1, i): uoa.b;
                                  if (uoa.k(obj1, i)) {
                                     uDrawable = uoa.d;
                                     if (uDrawable == null) {
                                        uDrawable = uoa.b;
                                     }
                                  }
                                  if (uDrawable != null) {
                                     i1 = i7;
                                     childAt1 = obj1.getChildAt(i1);
                                     i4 = childAt1.getBottom() + childAt1.getLayoutParams().bottomMargin;
                                     i4 = i4 + Math.round(i0.N(childAt1));
                                     childAt1 = uDrawable.getIntrinsicHeight() + i4;
                                     i5 = view + i2;
                                     i6 = i3 - j;
                                     uDrawable.setBounds(i5, i4, i6, childAt1);
                                     uDrawable.draw(obj);
                                  label_01f5 :
                                     i4 = i1 + 1;
                                     i = 1;
                                     i1 = 0;
                                  }
                               }
                            }
                         }else {
                            goto label_019e ;
                         }
                         i1 = i7;
                         goto label_01f5 ;
                      }
                   }else {
                      goto label_009c ;
                   }
                }
             label_01f4 :
                i1 = i4;
                goto label_01f5 ;
             }
          }
       }else if(PatchProxy.applyVoidTwoRefs(obj, obj1, uoa, uoa1, "7")){
          i5 = p1.getPaddingTop();
          i6 = p1.getHeight() - p1.getPaddingBottom();
          int childCount1 = p1.getChildCount();
          this = p1.getAdapter();
          childAdapter = 0;
          while (childAdapter < childCount1) {
             i4 = obj1.getChildAdapterPosition(obj1.getChildAt(childAdapter));
             Drawable uDrawable2 = (uoa.a.size() > 0)? uoa.f(obj1, i4): uoa.b;
             a i9 = uoa.i;
             a j2 = uoa.j;
             if (this != null && this.f0(i4) != uoa.k) {
                i9 = null;
                j2 = null;
             }
             a h = uoa.h;
             if (h == null || (h.get(i4) == null && uDrawable2 != null)) {
                View childAt2 = obj1.getChildAt(childAdapter);
                i3 = childAt2.getRight() + childAt2.getLayoutParams().rightMargin;
                i3 = i3 + Math.round(i0.M(childAt2));
                i4 = uDrawable2.getIntrinsicHeight() + i3;
                i = i9 + i5;
                i1 = i6 - j2;
                uDrawable2.setBounds(i3, i, i4, i1);
                uDrawable2.draw(obj);
             }
             childAdapter = childAdapter + 1;
          }
       }
       return;
    }
    public final Drawable f(RecyclerView p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.a.size() > 0) {
          int i = p0.getAdapter().f0(p1);
          if (this.a.get(i) != null) {
             return this.a.get(i).a(p0, p1);
          }
       }
       return this.b;
    }
    public final Drawable g(){
       a tc = this.c;
       if (tc == null) {
          tc = this.b;
       }
       return tc;
    }
    public Drawable h(){
       return this.b;
    }
    public final boolean i(RecyclerView p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       RecyclerView$Adapter adapter = p0.getAdapter();
       if (adapter instanceof d) {
          return adapter.e1(p1);
       }else {
          return false;
       }
    }
    public final boolean j(RecyclerView p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       RecyclerView$Adapter adapter = p0.getAdapter();
       if (adapter instanceof d) {
          return adapter.g1(p1);
       }else {
          return false;
       }
    }
    public final boolean k(RecyclerView p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       RecyclerView$Adapter adapter = p0.getAdapter();
       boolean b = false;
       if (adapter instanceof d) {
          if (p1 == ((adapter.getItemCount() - 1) - adapter.Z0())) {
             b = true;
          }
          return b;
       }else if(p1 == (adapter.getItemCount() - 1)){
          b = true;
       }
       return b;
    }
    public void l(int p0,a$a p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "14")) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
    public a m(int p0){
       this.l = p0;
       return this;
    }
    public a n(int p0){
       this.m = p0;
       return this;
    }
    public void o(Drawable p0){
       this.b = p0;
    }
    public void p(boolean p0){
       this.f = p0;
    }
    public void q(boolean p0){
       this.g = p0;
    }
    public void r(int p0,int p1,int p2){
       this.i = p0;
       this.j = p1;
       this.k = p2;
    }
    public void s(Drawable p0){
       this.c = p0;
    }
}
