package com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment$c;
import erd.g;
import com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity;
import java.util.Objects;
import jy4.a;
import android.os.SystemClock;
import com.kuaishou.tuna.plc.dynamic_container.logger.model.PlcDynamicPerformanceInfo;

public final class AbsPlcDynamicMVPsFragment$c implements g	// class@000fc2
{
    public final AbsPlcDynamicMVPsFragment b;

    public void AbsPlcDynamicMVPsFragment$c(AbsPlcDynamicMVPsFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPlcDynamicMVPsFragment$c.class, "1")) {
       }else if(FragmentEvent.CREATE == p0){
          p0 = this.b.getActivity();
          if (!p0 instanceof PlcDynamicContainerActivity) {
             p0 = null;
          }
          if (p0 != null && !PatchProxy.applyVoid(null, p0, PlcDynamicContainerActivity.class, "4")) {
             p0 = p0.I;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, a.class, "5")) {
                p0.mBizContainerCreateStartTimestamp = SystemClock.elapsedRealtime();
             }
          }
       }
       return;
    }
}
