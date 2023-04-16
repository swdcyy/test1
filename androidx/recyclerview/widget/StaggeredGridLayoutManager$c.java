package androidx.recyclerview.widget.StaggeredGridLayoutManager$c;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.ViewGroup$LayoutParams;

public class StaggeredGridLayoutManager$c	// class@0008d8
{
    public ArrayList a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public final StaggeredGridLayoutManager f;

    public void StaggeredGridLayoutManager$c(StaggeredGridLayoutManager p0,int p1){
       this.f = p0;
       super();
       this.a = new ArrayList();
       this.b = Integer.MIN_VALUE;
       this.c = Integer.MIN_VALUE;
       this.d = 0;
       this.e = p1;
    }
    public void A(int p0){
       this.b = p0;
       this.c = p0;
    }
    public void a(View p0){
       StaggeredGridLayoutManager$LayoutParams layoutParams = this.s(p0);
       layoutParams.a = this;
       this.a.add(p0);
       int i = Integer.MIN_VALUE;
       this.c = i;
       if (this.a.size() == 1) {
          this.b = i;
       }
       if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
          this.d = this.d + this.f.mPrimaryOrientation.e(p0);
       }
       return;
    }
    public void b(boolean p0,int p1){
       int i = (p0)? this.q(Integer.MIN_VALUE): this.u(Integer.MIN_VALUE);
       this.e();
       if (i == Integer.MIN_VALUE) {
          return;
       }else if(!p0 || (i < this.f.mPrimaryOrientation.i() || (!p0 && i > this.f.mPrimaryOrientation.n()))){
          return;
       }else if(p1 != Integer.MIN_VALUE){
          i = i + p1;
       }
       this.c = i;
       this.b = i;
       return;
    }
    public void c(){
       StaggeredGridLayoutManager$c ta = this.a;
       int i = 1;
       View view = ta.get((ta.size() - i));
       StaggeredGridLayoutManager$LayoutParams layoutParams = this.s(view);
       this.c = this.f.mPrimaryOrientation.d(view);
       if (layoutParams.b != null) {
          StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = this.f.mLazySpanLookup.f(layoutParams.getViewLayoutPosition());
          if (lazySpanLook != null && lazySpanLook.c == i) {
             this.c = this.c + lazySpanLook.a(this.e);
          }
       }
       return;
    }
    public void d(){
       View view = this.a.get(0);
       StaggeredGridLayoutManager$LayoutParams layoutParams = this.s(view);
       this.b = this.f.mPrimaryOrientation.g(view);
       if (layoutParams.b != null) {
          StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem lazySpanLook = this.f.mLazySpanLookup.f(layoutParams.getViewLayoutPosition());
          if (lazySpanLook != null && lazySpanLook.c == -1) {
             this.b = this.b - lazySpanLook.a(this.e);
          }
       }
       return;
    }
    public void e(){
       this.a.clear();
       this.v();
       this.d = 0;
    }
    public int f(){
       int i = (this.f.mReverseLayout != null)? this.n((this.a.size() - 1), -1, 1): this.n(0, this.a.size(), 1);
       return i;
    }
    public int g(){
       int i = (this.f.mReverseLayout != null)? this.m((this.a.size() - 1), -1, 1): this.m(0, this.a.size(), 1);
       return i;
    }
    public int h(){
       int i = (this.f.mReverseLayout != null)? this.n((this.a.size() - 1), -1, false): this.n(false, this.a.size(), false);
       return i;
    }
    public int i(){
       int i = (this.f.mReverseLayout != null)? this.n(0, this.a.size(), true): this.n((this.a.size() - true), -1, true);
       return i;
    }
    public int j(){
       int i = (this.f.mReverseLayout != null)? this.m(0, this.a.size(), true): this.m((this.a.size() - true), -1, true);
       return i;
    }
    public int k(){
       int i = (this.f.mReverseLayout != null)? this.n(0, this.a.size(), 0): this.n((this.a.size() - 1), -1, 0);
       return i;
    }
    public int l(int p0,int p1,boolean p2,boolean p3,boolean p4){
       View view;
       int i6;
       int i = this.f.mPrimaryOrientation.n();
       int i1 = this.f.mPrimaryOrientation.i();
       int i2 = (p1 > p0)? 1: -1;
       while (true) {
          if (p0 == p1) {
             return -1;
          }
          view = this.a.get(p0);
          int i3 = this.f.mPrimaryOrientation.g(view);
          int i4 = this.f.mPrimaryOrientation.d(view);
          int i5 = 0;
          if (p4) {
             if (i3 <= i1) {
             label_0039 :
                i6 = 1;
             label_003c :
                if (p4) {
                   if (i4 >= i) {
                   label_0043 :
                      i5 = 1;
                   }
                }else if(i4 > i){
                   goto label_0043 ;
                }
                if (i6 && i5) {
                   if (p2 && p3) {
                      if (i3 >= i && i4 <= i1) {
                         break ;
                      }
                   }else if(p3){
                      return this.f.getPosition(view);
                   }else if(i3 < i || i4 > i1){
                      return this.f.getPosition(view);
                   }
                }
                p0 = p0 + i2;
             }
          }else if(i3 < i1){
             goto label_0039 ;
          }
          i6 = 0;
          goto label_003c ;
       }
       return this.f.getPosition(view);
    }
    public int m(int p0,int p1,boolean p2){
       return this.l(p0, p1, false, false, p2);
    }
    public int n(int p0,int p1,boolean p2){
       return this.l(p0, p1, p2, true, false);
    }
    public int o(){
       return this.d;
    }
    public int p(){
       StaggeredGridLayoutManager$c tc = this.c;
       if (tc != Integer.MIN_VALUE) {
          return tc;
       }
       this.c();
       return this.c;
    }
    public int q(int p0){
       StaggeredGridLayoutManager$c tc = this.c;
       if (tc != Integer.MIN_VALUE) {
          return tc;
       }
       if (!this.a.size()) {
          return p0;
       }
       this.c();
       return this.c;
    }
    public View r(int p0,int p1){
       View view = null;
       if (p1 == -1) {
          p1 = this.a.size();
          int i = 0;
          while (i < p1) {
             View view1 = this.a.get(i);
             StaggeredGridLayoutManager$c tf = this.f;
             if (tf.mReverseLayout == null || tf.getPosition(view1) > p0) {
                tf = this.f;
                if (tf.mReverseLayout == null && (tf.getPosition(view1) < p0 && view1.hasFocusable())) {
                   i = i + 1;
                   view = view1;
                }
             }
          }
       }else {
          p1 = this.a.size() - 1;
          while (p1 >= 0) {
             View view2 = this.a.get(p1);
             StaggeredGridLayoutManager$c tf1 = this.f;
             if (tf1.mReverseLayout == null || tf1.getPosition(view2) < p0) {
                tf1 = this.f;
                if (tf1.mReverseLayout == null && (tf1.getPosition(view2) > p0 && view2.hasFocusable())) {
                   p1--;
                   view = view2;
                }
             }
          }
       }
       return view;
    }
    public StaggeredGridLayoutManager$LayoutParams s(View p0){
       return p0.getLayoutParams();
    }
    public int t(){
       StaggeredGridLayoutManager$c tb = this.b;
       if (tb != Integer.MIN_VALUE) {
          return tb;
       }
       this.d();
       return this.b;
    }
    public int u(int p0){
       StaggeredGridLayoutManager$c tb = this.b;
       if (tb != Integer.MIN_VALUE) {
          return tb;
       }
       if (!this.a.size()) {
          return p0;
       }
       this.d();
       return this.b;
    }
    public void v(){
       this.b = Integer.MIN_VALUE;
       this.c = Integer.MIN_VALUE;
    }
    public void w(int p0){
       StaggeredGridLayoutManager$c tb = this.b;
       if (tb != Integer.MIN_VALUE) {
          this.b = tb + p0;
       }
       tb = this.c;
       if (tb != Integer.MIN_VALUE) {
          this.c = tb + p0;
       }
       return;
    }
    public void x(){
       int i = this.a.size();
       View view = this.a.remove((i - 1));
       StaggeredGridLayoutManager$LayoutParams layoutParams = this.s(view);
       layoutParams.a = null;
       if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
          this.d = this.d - this.f.mPrimaryOrientation.e(view);
       }
       if (i == 1) {
          this.b = Integer.MIN_VALUE;
       }
       this.c = Integer.MIN_VALUE;
       return;
    }
    public void y(){
       View view = this.a.remove(0);
       StaggeredGridLayoutManager$LayoutParams layoutParams = this.s(view);
       layoutParams.a = null;
       if (!this.a.size()) {
          this.c = Integer.MIN_VALUE;
       }
       if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
          this.d = this.d - this.f.mPrimaryOrientation.e(view);
       }
       this.b = Integer.MIN_VALUE;
       return;
    }
    public void z(View p0){
       StaggeredGridLayoutManager$LayoutParams layoutParams = this.s(p0);
       layoutParams.a = this;
       this.a.add(0, p0);
       int i = Integer.MIN_VALUE;
       this.b = i;
       if (this.a.size() == 1) {
          this.c = i;
       }
       if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
          this.d = this.d + this.f.mPrimaryOrientation.e(p0);
       }
       return;
    }
}
