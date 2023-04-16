package com.kuaishou.live.widget.page2.ViewPager2$h;
import com.kuaishou.live.widget.page2.ViewPager2$d;
import com.kuaishou.live.widget.page2.ViewPager2;
import com.kuaishou.live.widget.page2.ViewPager2$a;
import com.kuaishou.live.widget.page2.ViewPager2$h$a;
import com.kuaishou.live.widget.page2.ViewPager2$h$b;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$i;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.widget.page2.a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import a2.i0;
import com.kuaishou.live.widget.page2.ViewPager2$h$c;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.IllegalStateException;
import android.view.accessibility.AccessibilityEvent;
import java.lang.CharSequence;
import b2.d;
import b2.d$b;
import b2.d$a;
import b2.g;

public class ViewPager2$h extends ViewPager2$d	// class@001036
{
    public final g b;
    public final g c;
    public RecyclerView$i d;
    public final ViewPager2 e;

    public void ViewPager2$h(ViewPager2 p0){
       this.e = p0;
       super(p0, null);
       this.b = new ViewPager2$h$a(this);
       this.c = new ViewPager2$h$b(this);
    }
    public boolean b(int p0,Bundle p1){
       boolean b = (p0 == 8192 || p0 == 4096)? true: false;
       return b;
    }
    public void c(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2$h.class, "4")) {
          return;
       }
       this.t();
       if (p0 != null) {
          p0.F0(this.d);
       }
       return;
    }
    public void d(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2$h.class, "5")) {
          return;
       }
       if (p0 != null) {
          p0.I0(this.d);
       }
       return;
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, ViewPager2$h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "androidx.viewpager.widget.ViewPager";
    }
    public void f(a p0,RecyclerView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewPager2$h.class, "1")) {
          return;
       }
       i0.D0(p1, 2);
       this.d = new ViewPager2$h$c(this);
       if (!i0.z(this.e)) {
          i0.D0(this.e, 1);
       }
       return;
    }
    public void g(AccessibilityNodeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2$h.class, "10")) {
          return;
       }
       this.q(p0);
       this.r(p0);
       return;
    }
    public boolean j(int p0,Bundle p1){
       ViewPager2$h oh = ViewPager2$h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oh, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.b(p0, p1)) {
          p0 = (p0 == 8192)? this.e.getCurrentItem() - 1: this.e.getCurrentItem() + 1;
          this.s(p0);
          return 1;
       }else {
          throw new IllegalStateException();
       }
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, ViewPager2$h.class, "3")) {
          return;
       }
       this.t();
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, ViewPager2$h.class, "9")) {
          return;
       }
       this.t();
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, ViewPager2$h.class, "7")) {
          return;
       }
       this.t();
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, ViewPager2$h.class, "6")) {
          return;
       }
       this.t();
       return;
    }
    public void onRvInitializeAccessibilityEvent(AccessibilityEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2$h.class, "12")) {
          return;
       }
       p0.setSource(this.e);
       p0.setClassName(this.e());
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, ViewPager2$h.class, "8")) {
          return;
       }
       this.t();
       return;
    }
    public final void q(AccessibilityNodeInfo p0){
       int itemCount;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2$h.class, "15")) {
          return;
       }
       if (this.e.getAdapter() != null) {
          if (this.e.getOrientation() == 1) {
             itemCount = this.e.getAdapter().getItemCount();
          }else {
             i = this.e.getAdapter().getItemCount();
             itemCount = 0;
          label_0037 :
             d.G0(p0).c0(d$b.a(itemCount, i, false, false));
             return;
          }
       }else {
          itemCount = 0;
       }
       i = 0;
       goto label_0037 ;
    }
    public final void r(AccessibilityNodeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2$h.class, "16")) {
          return;
       }
       RecyclerView$Adapter adapter = this.e.getAdapter();
       if (adapter == null) {
          return;
       }
       int itemCount = adapter.getItemCount();
       if (itemCount && this.e.d()) {
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
    public void s(int p0){
       ViewPager2$h oh = ViewPager2$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "13")) {
          return;
       }
       if (this.e.d()) {
          this.e.g(p0, true);
       }
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, ViewPager2$h.class, "14")) {
          return;
       }
       ViewPager2$h te = this.e;
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
       if (!this.e.d()) {
          return;
       }
       if (!this.e.getOrientation()) {
          i1 = this.e.c();
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
