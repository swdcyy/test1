package com.kwai.framework.mvs.KSViewModelStore;
import com.kwai.framework.mvs.KSViewModelStore$a;
import nsd.u;
import java.lang.Object;
import com.kwai.framework.mvs.KSViewModelStore$viewModelWithOwnerMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.lifecycle.ViewModelStoreOwner;
import com.kwai.framework.mvs.BaseViewModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import java.util.WeakHashMap;
import java.lang.StringBuilder;
import androidx.fragment.app.c;
import com.kwai.framework.mvs.KSViewModelStore$b;
import androidx.fragment.app.c$b;
import java.util.Map;
import android.app.Activity;
import android.app.Application;
import sa6.e;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Iterator;

public final class KSViewModelStore	// class@00178a
{
    public final p a;
    public Application b;
    public static final KSViewModelStore c;
    public static final KSViewModelStore$a d;

    static {
       KSViewModelStore.d = new KSViewModelStore$a(null);
       KSViewModelStore.c = new KSViewModelStore();
    }
    public void KSViewModelStore(){
       super();
       this.a = s.c(KSViewModelStore$viewModelWithOwnerMap$2.INSTANCE);
    }
    public final void a(ViewModelStoreOwner p0,BaseViewModel p1){
       KSViewModelStore kSViewModelS = KSViewModelStore.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, kSViewModelS, "3")) {
          return;
       }
       a.p(p0, "vmStoreOwner");
       a.p(p1, "vm");
       if (p0 instanceof Fragment) {
          if (!this.b().containsValue(p0)) {
             StringBuilder str = "registerFragmentLifecycleCallbacks: "+p0;
             c fragmentMana = p0.getFragmentManager();
             if (fragmentMana != null) {
                fragmentMana.registerFragmentLifecycleCallbacks(new KSViewModelStore$b(this, p0), false);
             }
          }
          this.b().put(p1, p0);
       }else if(p0 instanceof Activity){
          Application application = p0.getApplication();
          a.o(application, "vmStoreOwner.application");
          if (!PatchProxy.applyVoidOneRefs(application, this, kSViewModelS, "4") && this.b == null) {
             this.b = application;
             application.registerActivityLifecycleCallbacks(new e(this));
          }
          this.b().put(p1, p0);
       }
       return;
    }
    public final WeakHashMap b(){
       Object obj = PatchProxy.apply(null, this, KSViewModelStore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void c(ViewModelStoreOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSViewModelStore.class, "5")) {
          return;
       }
       StringBuilder str = "removeViewModelWithTargetOwner: "+p0;
       Iterator iterator = this.b().keySet().iterator();
       while (iterator.hasNext()) {
          if (a.g(this.b().get(iterator.next()), p0)) {
             iterator.remove();
          }
       }
       return;
    }
}
