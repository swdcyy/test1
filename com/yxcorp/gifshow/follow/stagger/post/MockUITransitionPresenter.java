package com.yxcorp.gifshow.follow.stagger.post.MockUITransitionPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.post.MockUITransitionPresenter$b;
import dja.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.follow.stagger.post.MockUITransitionPresenter$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public final class MockUITransitionPresenter extends PresenterV2 implements LifecycleObserver	// class@0011ca
{
    public BaseFragment p;
    public a q;
    public final Runnable r;

    public void MockUITransitionPresenter(){
       super();
       this.r = new MockUITransitionPresenter$b(this);
    }
    public static final a P8(MockUITransitionPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mockFeedViewModel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MockUITransitionPresenter.class, "4")) {
          return;
       }
       MockUITransitionPresenter tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       tp.getLifecycle().addObserver(this);
       tp = this.q;
       if (tp == null) {
          a.S("mockFeedViewModel");
       }
       MutableLiveData mutableLiveD = tp.p0();
       MockUITransitionPresenter tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       mutableLiveD.observe(tp1, new MockUITransitionPresenter$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MockUITransitionPresenter.class, "6")) {
          return;
       }
       MockUITransitionPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.getLifecycle().removeObserver(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MockUITransitionPresenter.class, "3")) {
          return;
       }
       ViewModel obj = this.r8("FRAGMENT");
       a.o(obj, "inject<BaseFragment>\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = ViewModelProviders.of(obj).get(a.class);
       a.o(obj, "ViewModelProviders.of\(it¡­eedViewModel::class.java\)");
       this.q = obj;
       return;
    }
}
