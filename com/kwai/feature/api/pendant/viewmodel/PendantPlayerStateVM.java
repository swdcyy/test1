package com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM;
import androidx.lifecycle.ViewModel;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM$a;
import nsd.u;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.a;

public final class PendantPlayerStateVM extends ViewModel	// class@00103b
{
    public final MutableLiveData mAutoPlayerStateLiveData;
    public static final PendantPlayerStateVM$a Companion;

    static {
       PendantPlayerStateVM.Companion = new PendantPlayerStateVM$a(null);
    }
    public void PendantPlayerStateVM(){
       super();
       this.mAutoPlayerStateLiveData = new MutableLiveData(Boolean.FALSE);
    }
    public static final PendantPlayerStateVM getInstance(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PendantPlayerStateVM.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PendantPlayerStateVM.Companion.a(p0);
    }
    public final Boolean getAutoPlayerState(){
       Object obj = PatchProxy.apply(null, this, PendantPlayerStateVM.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAutoPlayerStateLiveData.getValue();
    }
    public final void notifyAutoPlayerState(boolean p0){
       PendantPlayerStateVM pendantPlaye = PendantPlayerStateVM.class;
       if (PatchProxy.isSupport(pendantPlaye) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, pendantPlaye, "1")) {
          return;
       }
       this.mAutoPlayerStateLiveData.setValue(Boolean.valueOf(p0));
       return;
    }
    public final void observerAutoPlayerState(LifecycleOwner p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantPlayerStateVM.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       a.p(p1, "observer");
       this.mAutoPlayerStateLiveData.observe(p0, p1);
       return;
    }
}
