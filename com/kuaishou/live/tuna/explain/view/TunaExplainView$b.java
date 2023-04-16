package com.kuaishou.live.tuna.explain.view.TunaExplainView$b;
import up3.b$a;
import com.kuaishou.live.tuna.explain.view.TunaExplainView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.tuna.explain.view.TunaExplainView$a;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Throwable;
import java.lang.Integer;
import com.kuaishou.live.tuna.explain.performance.TunaLiveExplainPerfLogger;
import sp3.a;
import com.kuaishou.live.tuna.performance.model.TunaLiveExplainPerfInfo$RenderInfo;
import np3.a;
import up3.b;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;

public final class TunaExplainView$b implements b$a	// class@000fa4
{
    public final TunaExplainView a;

    public void TunaExplainView$b(TunaExplainView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TunaExplainView$b.class, "5")) {
          return;
       }
       TunaExplainView e = this.a.e;
       if (e != null) {
          e.a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, TunaExplainView$b.class, "7")) {
          return;
       }
       TunaExplainView e = this.a.e;
       if (e != null) {
          e.b();
       }
       return;
    }
    public void c(TunaLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaExplainView$b.class, "4")) {
          return;
       }
       a.p(p0, "viewModel");
       TunaExplainView e = this.a.e;
       if (e != null) {
          e.c(p0);
       }
       return;
    }
    public void d(TunaLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaExplainView$b.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       TunaExplainView e = this.a.e;
       if (e != null) {
          e.d(p0);
       }
       return;
    }
    public void e(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaExplainView$b.class, "6")) {
          return;
       }
       a.p(p0, "scheme");
       TunaExplainView e = this.a.e;
       if (e != null) {
          e.e(p0, p1);
       }
       return;
    }
    public void f(int p0,Throwable p1,String p2){
       TunaLiveExplainPerfLogger tunaLiveExpl;
       if (PatchProxy.isSupport(TunaExplainView$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TunaExplainView$b.class, "8")) {
          return;
       }
       a.p(p2, "errorCode");
       TunaExplainView f = this.a.f;
       if (f != null) {
          tunaLiveExpl = f.c();
          if (tunaLiveExpl != null && !PatchProxy.applyVoidOneRefs(p2, tunaLiveExpl, TunaLiveExplainPerfLogger.class, "4")) {
             a.p(p2, "code");
             tunaLiveExpl = tunaLiveExpl.a;
             tunaLiveExpl.mRenderResult = p2;
             String str = (tunaLiveExpl.mRenderType == 1)? "TK‰÷»æ": "Native‰÷»æ";
             a.o(p2, "mRenderInfo.mRenderResult");
             a.a(str, p2);
          }
       }
       f = this.a.f;
       if (f != null) {
          tunaLiveExpl = f.c();
          if (tunaLiveExpl != null) {
             tunaLiveExpl.a();
          }
       }
       f = this.a.e;
       if (f != null) {
          f.f();
       }
       if (p0 == 1) {
          TunaExplainView d = this.a.d;
          if (d != null) {
             d.destroy();
          }
          d.d = null;
       }
       return;
    }
    public void g(b p0){
       TunaLiveExplainPerfLogger tunaLiveExpl;
       ViewGroup$MarginLayoutParams marginLayout;
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaExplainView$b.class, "1")) {
          return;
       }
       TunaExplainView f = this.a.f;
       if (f != null) {
          tunaLiveExpl = f.c();
          if (tunaLiveExpl != null) {
             tunaLiveExpl.d();
          }
       }
       f = this.a.f;
       if (f != null) {
          tunaLiveExpl = f.c();
          if (tunaLiveExpl != null) {
             tunaLiveExpl.f();
          }
       }
       f = this.a.f;
       if (f != null) {
          tunaLiveExpl = f.c();
          if (tunaLiveExpl != null) {
             tunaLiveExpl.a();
          }
       }
       TunaExplainView$b ta = this.a;
       View contentView = (p0 != null)? p0.getContentView(): null;
       ta.b = contentView;
       f = this.a.b;
       if (f != null) {
          if (p0 != null) {
             marginLayout = p0.b();
             if (marginLayout != null) {
             label_0059 :
                this.a.removeAllViews();
                this.a.addView(f, marginLayout);
                TunaExplainView$b ta1 = this.a;
                if (ta1.g == null) {
                   f = ta1.e;
                   if (f != null) {
                      f.g(ta1);
                   }
                }else {
                   TunaExplainView e = ta1.e;
                   if (e != null) {
                      e.a();
                   }
                }
             }
          }
          marginLayout = new ViewGroup$MarginLayoutParams(-2, -2);
          goto label_0059 ;
       }
    label_0078 :
       return;
    }
    public void h(TunaLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaExplainView$b.class, "3")) {
          return;
       }
       a.p(p0, "viewModel");
       TunaExplainView e = this.a.e;
       if (e != null) {
          e.d(p0);
       }
       return;
    }
}
