package com.yxcorp.login.userlogin.presenter.accountsecurity.k;
import u07.u;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter;
import java.lang.String;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import o1d.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import f2d.l;
import com.yxcorp.login.userlogin.presenter.accountsecurity.m;
import erd.g;
import crd.b;

public final class k implements u	// class@001baf
{
    public final BindThirdPlatformPresenter b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public void k(BindThirdPlatformPresenter p0,String p1,String p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void a(t p0,View p1){
       k tb = this.b;
       k td = this.d;
       k te = this.e;
       k tf = this.f;
       Objects.requireNonNull(tb);
       d.b(this.c, true);
       if (PatchProxy.applyVoidThreeRefs(td, te, tf, tb, BindThirdPlatformPresenter.class, "9")) {
       }else {
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.setCancelable(false);
          if (tb.getActivity() != null) {
             progressFrag.show(tb.getActivity().getSupportFragmentManager(), "BindThirdPlatform");
          }
          tb.X7(b.a(0x5cfaafff).f0(td, te, tf).map(new e()).subscribe(new l(progressFrag, td), new m(tb, progressFrag, td)));
       }
       return;
    }
}
