package com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment$d;
import java.lang.Runnable;
import com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import im8.c;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import lnc.g2;
import java.lang.Throwable;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;

public final class AbsPlcDynamicMVPsFragment$d implements Runnable	// class@000fc3
{
    public final AbsPlcDynamicMVPsFragment b;

    public void AbsPlcDynamicMVPsFragment$d(AbsPlcDynamicMVPsFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AbsPlcDynamicMVPsFragment$d.class, "1")) {
          return;
       }
       int i = 2;
       if (this.b.getView() != null) {
          AbsPlcDynamicMVPsFragment$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, AbsPlcDynamicMVPsFragment.class, "7")) {
             AbsPlcDynamicMVPsFragment j = tb.j;
             if (j != null) {
                ArrayList uArrayList = PatchProxy.apply(objArray, tb, AbsPlcDynamicMVPsFragment.class, "8");
                if (uArrayList != PatchProxyResult.class) {
                }else {
                   Object[] objArray1 = new Object[i];
                   objArray1[0] = tb;
                   objArray1[1] = c.a("FRAGMENT", tb);
                   uArrayList = new ArrayList(CollectionsKt__CollectionsKt.L(objArray1));
                   ArrayList uArrayList1 = tb.ih();
                   if (uArrayList1 != null) {
                      uArrayList.addAll(uArrayList1);
                   }
                }
                j.b(uArrayList);
             }
          }
       }else {
          PlcDynamicLogger.k("fragment.getView is null!", objArray, i, objArray);
          this.b.hh();
       }
       return;
    }
}
