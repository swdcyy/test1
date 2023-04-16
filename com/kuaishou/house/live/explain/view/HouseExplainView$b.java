package com.kuaishou.house.live.explain.view.HouseExplainView$b;
import zg0.d$a;
import com.kuaishou.house.live.explain.view.HouseExplainView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.house.live.explain.view.HouseExplainView$a;
import com.kuaishou.live.house.model.HouseLiveExplainMessage;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import zg0.d;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;

public final class HouseExplainView$b implements d$a	// class@000787
{
    public final HouseExplainView a;

    public void HouseExplainView$b(HouseExplainView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, HouseExplainView$b.class, "5")) {
          return;
       }
       HouseExplainView e = this.a.e;
       if (e != null) {
          e.a();
       }
       return;
    }
    public void b(HouseLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseExplainView$b.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       HouseExplainView e = this.a.e;
       if (e != null) {
          e.b(p0);
       }
       return;
    }
    public void c(HouseLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseExplainView$b.class, "4")) {
          return;
       }
       a.p(p0, "viewModel");
       HouseExplainView e = this.a.e;
       if (e != null) {
          e.c(p0);
       }
       return;
    }
    public void d(int p0,Throwable p1){
    }
    public void e(d p0){
       ViewGroup$MarginLayoutParams marginLayout;
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseExplainView$b.class, "1")) {
          return;
       }
       HouseExplainView$b ta = this.a;
       View contentView = (p0 != null)? p0.getContentView(): null;
       ta.b = contentView;
       HouseExplainView b = this.a.b;
       if (b != null) {
          if (p0 != null) {
             marginLayout = p0.b();
             if (marginLayout != null) {
             label_002c :
                this.a.removeAllViews();
                this.a.addView(b, marginLayout);
                HouseExplainView$b ta1 = this.a;
                b = ta1.e;
                if (b != null) {
                   b.d(ta1);
                }
             }
          }
          marginLayout = new ViewGroup$MarginLayoutParams(-2, -2);
          goto label_002c ;
       }
       return;
    }
    public void f(HouseLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseExplainView$b.class, "3")) {
          return;
       }
       a.p(p0, "viewModel");
       HouseExplainView e = this.a.e;
       if (e != null) {
          e.b(p0);
       }
       return;
    }
}
