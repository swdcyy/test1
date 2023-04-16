package com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM$a;
import java.lang.Object;
import nsd.u;
import androidx.fragment.app.FragmentActivity;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public final class PendantPlayerStateVM$a	// class@00103a
{

    public void PendantPlayerStateVM$a(){
       super();
    }
    public void PendantPlayerStateVM$a(u p0){
       super();
    }
    public final PendantPlayerStateVM a(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantPlayerStateVM$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       ViewModel viewModel = ViewModelProviders.of(p0).get(PendantPlayerStateVM.class);
       a.o(viewModel, "ViewModelProviders.of\(ac¡­StateVM::class.java\n    \)");
       return viewModel;
    }
}
