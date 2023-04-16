package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$d;
import fw8.r$a;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import fw8.q;
import android.content.Intent;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import fp5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.UriRouterActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.kwai.sdk.switchconfig.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import o56.f;
import android.view.MotionEvent;
import android.view.KeyEvent;

public final class PictureInPicturePresenter$d implements r$a	// class@0016b5
{
    public final PictureInPicturePresenter b;

    public void PictureInPicturePresenter$d(PictureInPicturePresenter p0){
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PictureInPicturePresenter$d.class, "1")) {
          return;
       }
       q.d(this, p0, p1);
       boolean i = 0x31a55ac8;
       if (d.a(i).s0(this.b.getActivity())) {
          String str = null;
          String name = (p0 != null)? p0.getClass().getName(): str;
          Object[] objArray = new Object[0];
          o.C().w("PictureInPicturePresent", "onCreate activityName "+name, objArray);
          if (p0 instanceof UriRouterActivity) {
             d.a(i).YO(this.b.getActivity());
          }else if(p0 instanceof KwaiYodaWebViewActivity){
             p0.finish();
          }
          i = a.t().d("disableResumeHomeActivityAfterWxShare", 0);
          if (p0 != null) {
             str = p0.getClass().getSimpleName();
          }
          if (a.g(str, "WXEntryActivity") && (!i && f.b(this.b.getActivity()))) {
             Object[] objArray1 = new Object[0];
             o.C().w("PictureInPicturePresent", "wechat share finish, restore home activity", objArray1);
             f.d(this.b.getActivity());
          }
       }
    label_00a6 :
       return;
    }
    public void g(FragmentActivity p0,Bundle p1){
       q.f(this, p0, p1);
    }
    public void h(FragmentActivity p0,MotionEvent p1){
       q.c(this, p0, p1);
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
