package com.kuaishou.growth.pendant.viewmodel.PendantApiVM;
import androidx.lifecycle.ViewModel;
import com.kuaishou.growth.pendant.viewmodel.PendantApiVM$a;
import nsd.u;
import androidx.lifecycle.MutableLiveData;
import androidx.fragment.app.FragmentActivity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.kuaishou.growth.pendant.model.PendantStartupResponseV2;

public final class PendantApiVM extends ViewModel	// class@0006fc
{
    public final MutableLiveData mStartUpResponseLiveData;
    public static final PendantApiVM$a Companion;

    static {
       PendantApiVM.Companion = new PendantApiVM$a(null);
    }
    public void PendantApiVM(){
       super();
       this.mStartUpResponseLiveData = new MutableLiveData();
    }
    public static final PendantApiVM getInstance(FragmentActivity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PendantApiVM$a obj = PatchProxy.applyOneRefs(p0, null, PendantApiVM.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PendantApiVM.Companion;
       Objects.requireNonNull(obj);
       ViewModel viewModel = PatchProxy.applyOneRefs(p0, obj, PendantApiVM$a.class, "1");
       if (viewModel != patchProxyRe) {
       }else {
          a.p(p0, "activity");
          ViewModel viewModel1 = ViewModelProviders.of(p0).get(PendantApiVM.class);
          a.o(viewModel1, "ViewModelProviders.of\(ac¡­ntApiVM::class.java\n    \)");
          viewModel = viewModel1;
       }
       return viewModel;
    }
    public final void observeStartup(FragmentActivity p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantApiVM.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "observer");
       this.mStartUpResponseLiveData.observe(p0, p1);
       return;
    }
    public final void startupConsumerAccept(PendantStartupResponseV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantApiVM.class, "1")) {
          return;
       }
       a.p(p0, "pendantStartupResponseV2");
       this.mStartUpResponseLiveData.setValue(p0);
       return;
    }
}
