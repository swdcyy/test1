package com.kwai.framework.mvs.KSViewModelStore$b;
import androidx.fragment.app.c$b;
import com.kwai.framework.mvs.KSViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;

public final class KSViewModelStore$b extends c$b	// class@001788
{
    public final KSViewModelStore a;
    public final ViewModelStoreOwner b;

    public void KSViewModelStore$b(KSViewModelStore p0,ViewModelStoreOwner p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void d(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSViewModelStore$b.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       if (a.g(p1, this.b)) {
          Objects.toString(p1);
          p0.unregisterFragmentLifecycleCallbacks(this);
          this.a.c(p1);
       }
       return;
    }
}
