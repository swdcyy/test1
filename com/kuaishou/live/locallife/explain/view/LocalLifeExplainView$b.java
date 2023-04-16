package com.kuaishou.live.locallife.explain.view.LocalLifeExplainView$b;
import df3.b$a;
import com.kuaishou.live.locallife.explain.view.LocalLifeExplainView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.locallife.explain.view.LocalLifeExplainView$a;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import df3.b;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;

public final class LocalLifeExplainView$b implements b$a	// class@000c22
{
    public final LocalLifeExplainView a;

    public void LocalLifeExplainView$b(LocalLifeExplainView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LocalLifeExplainView$b.class, "5")) {
          return;
       }
       LocalLifeExplainView e = this.a.e;
       if (e != null) {
          e.a();
       }
       return;
    }
    public void b(LocalLifeLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeExplainView$b.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       LocalLifeExplainView e = this.a.e;
       if (e != null) {
          e.b(p0);
       }
       return;
    }
    public void c(LocalLifeLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeExplainView$b.class, "4")) {
          return;
       }
       a.p(p0, "viewModel");
       LocalLifeExplainView e = this.a.e;
       if (e != null) {
          e.c(p0);
       }
       return;
    }
    public void d(int p0,Throwable p1){
    }
    public void e(b p0){
       ViewGroup$MarginLayoutParams marginLayout;
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeExplainView$b.class, "1")) {
          return;
       }
       LocalLifeExplainView$b ta = this.a;
       View contentView = (p0 != null)? p0.getContentView(): null;
       ta.b = contentView;
       LocalLifeExplainView b = this.a.b;
       if (b != null) {
          if (p0 != null) {
             marginLayout = p0.b();
             if (marginLayout != null) {
             label_002c :
                this.a.removeAllViews();
                this.a.addView(b, marginLayout);
                LocalLifeExplainView$b ta1 = this.a;
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
    public void f(LocalLifeLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeExplainView$b.class, "3")) {
          return;
       }
       a.p(p0, "viewModel");
       LocalLifeExplainView e = this.a.e;
       if (e != null) {
          e.b(p0);
       }
       return;
    }
}
