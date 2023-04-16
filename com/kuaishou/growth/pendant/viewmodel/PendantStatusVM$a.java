package com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$a;
import java.lang.Object;
import nsd.u;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public final class PendantStatusVM$a	// class@000701
{

    public void PendantStatusVM$a(){
       super();
    }
    public void PendantStatusVM$a(u p0){
       super();
    }
    public final PendantStatusVM a(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantStatusVM$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       ViewModel viewModel = ViewModelProviders.of(p0).get(PendantStatusVM.class);
       a.o(viewModel, "ViewModelProviders.of\(ac¡­tatusVM::class.java\n    \)");
       return viewModel;
    }
}
