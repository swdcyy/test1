package com.yxcorp.gifshow.follow.stagger.post.MockUITransitionPresenter$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.post.MockUITransitionPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bja.f0;
import java.lang.Enum;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment$a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class MockUITransitionPresenter$a implements Observer	// class@0011c8
{
    public final MockUITransitionPresenter b;

    public void MockUITransitionPresenter$a(MockUITransitionPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockUITransitionPresenter$a.class, "1")) {
       }else if(p0 == null){
          int i = f0.a[p0.ordinal()];
          if (i == 1 || i == 2) {
             i = this.b;
             Objects.requireNonNull(i);
             if (!PatchProxy.applyVoid(null, i, MockUITransitionPresenter.class, "5")) {
                k1.m(i.r);
                k1.r(i.r, 200);
             }
          }
       }
       p0 = this.b.getActivity();
       if (p0 != null) {
          k1.m(this.b.r);
          TopSnackBarFragment$a m = TopSnackBarFragment.m;
          a.o(p0, "host");
          Objects.requireNonNull(m);
          if (!PatchProxy.applyVoidOneRefs(p0, m, TopSnackBarFragment$a.class, "3")) {
             a.p(p0, "activity");
             if (p0 instanceof FragmentActivity) {
                p0 = p0.getSupportFragmentManager().findFragmentByTag("Top_SNACK_BAR_FRAGMENT_TAG");
                if (p0 instanceof TopSnackBarFragment) {
                   p0.ch();
                }
             }
          }
       }
    label_007f :
       return;
    }
}
