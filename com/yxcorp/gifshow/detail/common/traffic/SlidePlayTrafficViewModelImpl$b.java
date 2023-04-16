package com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl$b;
import java.lang.Object;
import nsd.u;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModel;
import java.lang.Number;
import qrd.p;

public final class SlidePlayTrafficViewModelImpl$b	// class@0014f4
{

    public void SlidePlayTrafficViewModelImpl$b(){
       super();
    }
    public void SlidePlayTrafficViewModelImpl$b(u p0){
       super();
    }
    public final SlidePlayTrafficViewModelImpl a(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlayTrafficViewModelImpl$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       ViewModel viewModel = new ViewModelProvider(p0, SlidePlayTrafficViewModelImpl.g).get(SlidePlayTrafficViewModelImpl.class);
       a.o(viewModel, "ViewModelProvider\(activi¡­iewModelImpl::class.java\)");
       return viewModel;
    }
    public final long b(){
       Object obj = PatchProxy.apply(null, this, SlidePlayTrafficViewModelImpl$b.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = SlidePlayTrafficViewModelImpl.f.getValue();
       }
       return obj.longValue();
    }
}
