package com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.AdLiveConversionObservable;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.AdLiveConversionObservable$mOpenLiveConsumer$2;
import qrd.p;
import qrd.s;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v19.d;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.AdLiveConversionObservable$a;
import crd.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import v19.e;
import androidx.lifecycle.ViewModel;
import io.reactivex.subjects.PublishSubject;
import v19.g;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import brd.t;
import io.reactivex.internal.functions.Functions;

public final class AdLiveConversionObservable	// class@0015a4
{
    public final p a;
    public final BaseFragment b;
    public final QPhoto c;
    public final a d;
    public final a e;
    public final a f;

    public void AdLiveConversionObservable(BaseFragment p0,QPhoto p1,a p2,a p3,a p4){
       a.p(p0, "mFragment");
       a.p(p1, "mCurPhoto");
       a.p(p2, "mFetchPhotoIndex");
       a.p(p3, "mFetchLogListener");
       a.p(p4, "mFetchLiveQPhoto");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.a = s.c(new AdLiveConversionObservable$mOpenLiveConsumer$2(this));
    }
    public final g a(){
       Object obj = PatchProxy.apply(null, this, AdLiveConversionObservable.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void b(d p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdLiveConversionObservable.class, "5")) {
          return;
       }
       if (p0.b != null) {
          j0 oj0 = (p1 == null || !p1.length())? 1: null;
          if (!oj0) {
             i0.a().e(124, this.c.getEntity()).d(new AdLiveConversionObservable$a(p1, p0)).a();
          }
       }
       return;
    }
    public final b c(){
       Object[] objArray = null;
       FragmentActivity obj = PatchProxy.apply(objArray, this, AdLiveConversionObservable.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.getActivity();
       if (obj != null) {
          objArray = ViewModelProviders.of(obj).get(e.class).o0().compose(this.b.ge()).subscribe(this.a(), Functions.d());
       }
       return objArray;
    }
}
