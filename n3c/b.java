package n3c.b;
import l3c.a0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;
import z5c.l3;
import android.view.ViewParent;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import lkd.b;
import java.lang.Integer;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;

public abstract class b	// class@00369f
{
    public final a0 a;
    public final RecyclerFragment b;
    public final BaseFragment c;
    public final RxPageBus d;

    public void b(a0 p0,RecyclerFragment p1,BaseFragment p2,RxPageBus p3){
       a.p(p0, "tipsHelper");
       a.p(p1, "fragment");
       a.p(p2, "baseFragment");
       a.p(p3, "rxPageBus");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public abstract void a();
    public final RecyclerFragment b(){
       return this.b;
    }
    public final RxPageBus c(){
       return this.d;
    }
    public final a0 d(){
       return this.a;
    }
    public abstract void e();
    public abstract boolean f();
    public final boolean g(View p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null) {
          return b;
       }
       RecyclerView recyclerView = this.b.h0();
       a.o(recyclerView, "fragment.recyclerView");
       RecyclerView$Adapter adapter = recyclerView.getAdapter();
       if (!adapter instanceof d) {
          adapter = null;
       }
       if (adapter != null) {
          b = adapter.U0(p0);
       }
       return b;
    }
    public abstract boolean h(l3 p0);
    public final void i(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0.getParent() != null) {
          RecyclerView recyclerView = this.b.h0();
          a.o(recyclerView, "fragment.recyclerView");
          RecyclerView$Adapter adapter = recyclerView.getAdapter();
          if (!adapter instanceof d) {
             adapter = null;
          }
          if (adapter != null) {
             adapter.m1(p0);
          }
       }
       return;
    }
    public final void j(View p0,ViewTreeObserver$OnGlobalLayoutListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       if (p0 != null && p1 != null) {
          ViewTreeObserver viewTreeObse = p0.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.removeOnGlobalLayoutListener(p1);
          }
       }
       return;
    }
    public final void k(View p0,ViewTreeObserver$OnGlobalLayoutListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       if (p0 != null && p1 != null) {
          if (p0.getWidth() > 0 && p0.getHeight() > 0) {
             p1.onGlobalLayout();
             return;
          }else {
             ViewTreeObserver viewTreeObse = p0.getViewTreeObserver();
             if (viewTreeObse != null) {
                viewTreeObse.addOnGlobalLayoutListener(p1);
             }
          }
       }
       return;
    }
    public final void l(View p0){
       int i;
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "view");
       a0 r = this.a.r;
       Integer integer = null;
       if (r != null) {
          Integer integer1 = r.get();
          if (integer1 != null) {
             i = integer1.intValue();
             if (i > 0) {
                integer = Integer.valueOf(i);
             }
          }
       }
       i = (integer != null)? integer.intValue(): n.c(a.b(), 250.00f);
       p0.setMinimumHeight(i);
       if (p0.getLayoutParams() != null) {
          p0.getLayoutParams().width = -1;
          p0.getLayoutParams().height = -2;
          layoutParams = p0.getLayoutParams();
       }else {
          layoutParams = new ViewGroup$LayoutParams(-1, -2);
       }
       p0.setLayoutParams(layoutParams);
       return;
    }
    public abstract void m();
    public abstract boolean n(l3 p0);
}
