package com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$e;
import fw8.r$a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import fw8.q;
import android.content.Intent;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.KeyEvent;

public final class ThanosAdAutoJumpMonitorPresenter$e implements r$a	// class@0016c5
{
    public final ThanosAdAutoJumpMonitorPresenter b;

    public void ThanosAdAutoJumpMonitorPresenter$e(ThanosAdAutoJumpMonitorPresenter p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0,View p1,ViewGroup$LayoutParams p2){
       q.k(this, p0, p1, p2);
    }
    public void b(Activity p0,View p1){
       q.j(this, p0, p1);
    }
    public String c(Intent p0){
       return q.h(this, p0);
    }
    public void d(Intent p0,View p1){
       q.l(this, p0, p1);
    }
    public void e(Intent p0){
       q.a(this, p0);
    }
    public void f(FragmentActivity p0,Bundle p1){
       q.d(this, p0, p1);
    }
    public void g(FragmentActivity p0,Bundle p1){
       q.f(this, p0, p1);
    }
    public void h(FragmentActivity p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ThanosAdAutoJumpMonitorPresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "fragmentActivity");
       a.p(p1, "motionEvent");
       if (a.g(p0, this.b.getActivity())) {
          ThanosAdAutoJumpMonitorPresenter$e tb = this.b;
          if (tb.t == null) {
             tb.P8("touch activity");
             tb.t = true;
          }
       }
       return;
    }
    public void i(FragmentActivity p0,Intent p1){
       q.e(this, p0, p1);
    }
    public void j(Activity p0,int p1){
       q.i(this, p0, p1);
    }
    public void k(FragmentActivity p0,KeyEvent p1){
       q.b(this, p0, p1);
    }
    public void onSaveInstanceState(Bundle p0){
       q.g(this, p0);
    }
}
