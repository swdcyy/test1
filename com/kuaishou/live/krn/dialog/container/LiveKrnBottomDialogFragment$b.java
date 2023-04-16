package com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$b;
import zj0.x;
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment;
import java.lang.Object;
import java.lang.Throwable;
import zj0.w;
import rj0.c;
import rj0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import androidx.fragment.app.Fragment;
import fk0.l;
import rj0.b;
import com.kuaishou.krn.model.LaunchModel;
import kotlin.jvm.internal.a;
import com.kuaishou.live.jsbridge.LiveKrnPageController;
import o63.d;
import msd.l;
import qrd.l1;

public final class LiveKrnBottomDialogFragment$b implements x	// class@001d47
{
    public final LiveKrnBottomDialogFragment a;

    public void LiveKrnBottomDialogFragment$b(LiveKrnBottomDialogFragment p0){
       this.a = p0;
       super();
    }
    public void A(Throwable p0){
       w.a(this, p0);
    }
    public void B(){
       w.k(this);
    }
    public void H(){
       w.s(this);
    }
    public void J(){
       w.v(this);
    }
    public void a(c p0,a p1,long p2){
       w.w(this, p0, p1, p2);
    }
    public void b(long p0){
       w.n(this, p0);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveKrnBottomDialogFragment$b.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_KRN_DIALOG, "onJSPageSuccess");
       LiveKrnBottomDialogFragment$b ta = this.a;
       if (ta.A != null) {
          ta.A = false;
          ta.Eh(ta.getView());
       }
       return;
    }
    public void d(long p0){
       w.m(this, p0);
    }
    public void e(long p0,Throwable p1){
       w.i(this, p0, p1);
    }
    public void f(long p0){
       w.f(this, p0);
    }
    public void g(long p0,Throwable p1){
       w.e(this, p0, p1);
    }
    public void i(){
       w.b(this);
    }
    public void j(){
       w.p(this);
    }
    public void m(){
       w.t(this);
    }
    public void o(l p0){
       w.u(this, p0);
    }
    public void p(b p0){
       w.d(this, p0);
    }
    public void r(){
       w.c(this);
    }
    public void s(LaunchModel p0){
       w.r(this, p0);
    }
    public void t(long p0,long p1){
       w.h(this, p0, p1);
    }
    public void u(long p0){
       w.o(this, p0);
    }
    public void v(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnBottomDialogFragment$b.class, "2")) {
          return;
       }
       a.p(p0, "throwable");
       b.I(LiveLogTag.LIVE_KRN_DIALOG, "onJSPageError", p0);
       LiveKrnBottomDialogFragment$b ta = this.a;
       ta.A = true;
       View view = ta.getView();
       if (view != null) {
          view.setBackgroundColor(-1);
       }
       ta = this.a;
       LiveKrnBottomDialogFragment g = ta.G;
       if (g != null) {
          g.invoke(new LiveKrnPageController(ta));
       }
       return;
    }
    public void w(){
       w.g(this);
    }
    public void y(LaunchModel p0,long p1,long p2){
       w.q(this, p0, p1, p2);
    }
}
