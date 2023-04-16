package androidx.viewpager2.widget.ViewPager2$i;
import androidx.viewpager2.widget.ViewPager2$e;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$a;
import androidx.viewpager2.widget.ViewPager2$i$a;
import androidx.viewpager2.widget.ViewPager2$i$b;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$i;
import java.lang.String;
import java.lang.IllegalStateException;
import androidx.viewpager2.widget.a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import a2.i0;
import androidx.viewpager2.widget.ViewPager2$i$c;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import java.lang.CharSequence;
import b2.d;
import b2.d$b;
import java.lang.Object;
import b2.d$a;
import b2.g;

public class ViewPager2$i extends ViewPager2$e	// class@000a39
{
    public final g b;
    public final g c;
    public RecyclerView$i d;
    public final ViewPager2 e;

    public void ViewPager2$i(ViewPager2 p0){
       this.e = p0;
       super(p0, null);
       this.b = new ViewPager2$i$a(this);
       this.c = new ViewPager2$i$b(this);
    }
    public boolean c(int p0,Bundle p1){
       boolean b = (p0 == 8192 || p0 == 4096)? true: false;
       return b;
    }
    public void e(RecyclerView$Adapter p0){
       this.v();
       if (p0 != null) {
          p0.F0(this.d);
       }
       return;
    }
    public void f(RecyclerView$Adapter p0){
       if (p0 != null) {
          p0.I0(this.d);
       }
       return;
    }
    public String g(){
       if (this.a()) {
          return "androidx.viewpager.widget.ViewPager";
       }
       throw new IllegalStateException();
    }
    public void h(a p0,RecyclerView p1){
       i0.D0(p1, 2);
       this.d = new ViewPager2$i$c(this);
       if (!i0.z(this.e)) {
          i0.D0(this.e, 1);
       }
       return;
    }
    public void i(AccessibilityNodeInfo p0){
       this.s(p0);
       this.t(p0);
    }
    public boolean l(int p0,Bundle p1){
       if (!this.c(p0, p1)) {
          throw new IllegalStateException();
       }
       p0 = (p0 == 8192)? this.e.getCurrentItem() - 1: this.e.getCurrentItem() + 1;
       this.u(p0);
       return 1;
    }
    public void m(){
       this.v();
    }
    public void o(){
       this.v();
    }
    public void onRvInitializeAccessibilityEvent(AccessibilityEvent p0){
       p0.setSource(this.e);
       this.g();
       p0.setClassName("androidx.viewpager.widget.ViewPager");
    }
    public void p(){
       this.v();
    }
    public void q(){
       this.v();
    }
    public void r(){
       this.v();
    }
    public final void s(AccessibilityNodeInfo p0){
       int itemCount;
       int i;
       if (this.e.getAdapter() != null) {
          if (this.e.getOrientation() == 1) {
             itemCount = this.e.getAdapter().getItemCount();
          }else {
             i = this.e.getAdapter().getItemCount();
             itemCount = 0;
          label_002c :
             d.G0(p0).c0(d$b.a(itemCount, i, false, false));
             return;
          }
       }else {
          itemCount = 0;
       }
       i = 0;
       goto label_002c ;
    }
    public final void t(AccessibilityNodeInfo p0){
       RecyclerView$Adapter adapter = this.e.getAdapter();
       if (adapter == null) {
          return;
       }
       int itemCount = adapter.getItemCount();
       if (itemCount && this.e.h()) {
          if (this.e.e > null) {
             p0.addAction(8192);
          }
          if (this.e.e < (itemCount - 1)) {
             p0.addAction(4096);
          }
          p0.setScrollable(1);
       }
       return;
    }
    public void u(int p0){
       if (this.e.h()) {
          this.e.n(p0, true);
       }
       return;
    }
    public void v(){
       ViewPager2$i te = this.e;
       int i = 0x1020048;
       i0.m0(te, i);
       i0.m0(te, 0x1020049);
       boolean i1 = 0x1020046;
       i0.m0(te, i1);
       int i2 = 0x1020047;
       i0.m0(te, i2);
       if (this.e.getAdapter() == null) {
          return;
       }
       int itemCount = this.e.getAdapter().getItemCount();
       if (!itemCount) {
          return;
       }
       if (!this.e.h()) {
          return;
       }
       if (!this.e.getOrientation()) {
          i1 = this.e.g();
          i2 = (i1)? 0x1020048: 0x1020049;
          if (i1) {
             i = 0x1020049;
          }
          if (this.e.e < (itemCount - 1)) {
             i0.o0(te, new d$a(i2, null), null, this.b);
          }
          if (this.e.e > null) {
             i0.o0(te, new d$a(i, null), null, this.c);
          }
       }else if(this.e.e < (itemCount - 1)){
          i0.o0(te, new d$a(i2, null), null, this.b);
       }
       if (this.e.e > null) {
          i0.o0(te, new d$a(i1, null), null, this.c);
       }
       return;
    }
}
