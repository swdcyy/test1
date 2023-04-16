package com.kuaishou.growth.pendant.viewmodel.PendantPlayerVM$a;
import java.lang.Object;
import nsd.u;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.growth.pendant.viewmodel.PendantPlayerVM;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public final class PendantPlayerVM$a	// class@0006ff
{

    public void PendantPlayerVM$a(){
       super();
    }
    public void PendantPlayerVM$a(u p0){
       super();
    }
    public final PendantPlayerVM a(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantPlayerVM$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       ViewModel viewModel = ViewModelProviders.of(p0).get(PendantPlayerVM.class);
       a.o(viewModel, "ViewModelProviders.of\(ac¡­layerVM::class.java\n    \)");
       return viewModel;
    }
}
