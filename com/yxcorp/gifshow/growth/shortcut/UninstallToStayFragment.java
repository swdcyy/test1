package com.yxcorp.gifshow.growth.shortcut.UninstallToStayFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import sqa.a;
import java.lang.String;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import i2b.a;
import kotlin.Result;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import k2b.u1;
import qrd.l1;
import java.lang.NullPointerException;
import java.lang.Throwable;
import qrd.j0;
import android.util.Log;
import xh7.b;
import android.content.Context;
import qh7.b;
import qh7.a;
import android.app.Activity;

public final class UninstallToStayFragment extends BaseFragment	// class@0014c2
{
    public PresenterV2 j;
    public final a k;

    public void UninstallToStayFragment(){
       super(null, null, null, null, 15, null);
       this.k = super();
    }
    public int M(){
       return 4;
    }
    public String o(){
       return "UNLOAD_HOLD";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UninstallToStayFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "it");
          this.k.a().show(activity.getSupportFragmentManager(), "progress");
       }
       return a.g(p0, 0x7f0d0581, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UninstallToStayFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.j = presenterV2;
       presenterV2.U7(new UninstallToStayPresenter(this));
       presenterV2.f(p0);
       UninstallToStayFragment tk = this.k;
       FragmentActivity activity = this.getActivity();
       if (activity == null) {
          throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       }
       tk.a = activity;
       Object[] objArray = new Object[]{this.k};
       presenterV2.i(objArray);
       u1.L0(this);
       objArray = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(objArray);
       if (throwable != null) {
          u1.R("U2SERROR", Log.getStackTraceString(throwable), 9);
          FragmentActivity activity1 = this.getActivity();
          if (activity1 != null) {
             a.b(new b(activity1, "kwai://featured"), null);
             activity1.finish();
          }
       }
       return;
    }
}
