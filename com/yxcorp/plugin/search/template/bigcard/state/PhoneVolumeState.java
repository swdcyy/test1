package com.yxcorp.plugin.search.template.bigcard.state.PhoneVolumeState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import com.yxcorp.plugin.search.template.bigcard.state.PhoneVolumeState$VolumeChangedReceiver;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import kfd.a;
import erd.g;
import crd.b;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import androidx.fragment.app.Fragment;
import uy5.a;
import q87.c;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class PhoneVolumeState	// class@00077b
{
    public b a;
    public boolean b;
    public BaseFragment c;
    public List d;
    public PhoneVolumeState$VolumeChangedReceiver e;

    public void PhoneVolumeState(BaseFragment p0){
       super();
       this.e = new PhoneVolumeState$VolumeChangedReceiver(this);
       this.c = p0;
       this.a = p0.Vg().j().subscribe(new a(this));
       this.d = new ArrayList();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, PhoneVolumeState.class, "5")) {
          return;
       }
       if (this.c.getContext() != null && this.b != null) {
          Object[] objArray = new Object[0];
          a.C().t("PhoneVolumeState", "unregisterReceiver", objArray);
          UniversalReceiver.f(this.c.getContext(), this.e);
          this.b = false;
       }
       return;
    }
}
