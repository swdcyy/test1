package com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper;
import com.kwai.nearby.local.HomeLocalFragment;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper$Stage;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import kd7.g;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import qc7.f;
import kd7.e;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Enum;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper$a;
import com.kwai.soc.arch.rubas.base.Rubas;

public class NearbyZeroPlayTraceHelper	// class@001000
{
    public final HashMap a;
    public final HashMap b;
    public NearbyZeroPlayTraceHelper$Stage c;
    public final HomeLocalFragment d;
    public b e;
    public final b f;
    public final b g;
    public boolean h;

    public void NearbyZeroPlayTraceHelper(HomeLocalFragment p0){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
       this.c = NearbyZeroPlayTraceHelper$Stage.HIDE;
       this.d = p0;
       p0.getLifecycle().addObserver(new NearbyZeroPlayTraceHelper$1(this));
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       g e = Functions.e;
       this.f = f.g(l.class, mAIN).subscribe(new g(this), e);
       this.g = f.g(f.class, mAIN).subscribe(new e(this), e);
    }
    public final void a(NearbyZeroPlayTraceHelper$Stage p0){
       boolean b;
       NearbyZeroPlayTraceHelper nearbyZeroPl = NearbyZeroPlayTraceHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, nearbyZeroPl, "6")) {
          return;
       }
       if (this.c.ordinal() != (p0.ordinal() - 1)) {
          this.b.put(p0, Boolean.TRUE);
          return;
       }else {
          NearbyZeroPlayTraceHelper ta = this.a;
          Object obj = PatchProxy.applyTwoRefs(ta, p0, this, nearbyZeroPl, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             Boolean uBoolean = ta.get(p0);
             b = (uBoolean != null)? uBoolean.booleanValue(): false;
          }
          if (!b) {
             this.a.put(p0, Boolean.TRUE);
             this.c = p0;
             int[] a = NearbyZeroPlayTraceHelper$a.a;
             int i = a[p0.ordinal()];
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i != 4) {
                         if (i == 5) {
                            Rubas.c("local_zero_start_play");
                         }
                      }else {
                         Rubas.c("local_zero_click_feed");
                      }
                   }else {
                      Rubas.c("local_zero_user_interact");
                   }
                }else {
                   Rubas.c("local_zero_display_feed");
                }
             }else {
                Rubas.c("local_zero_enter");
                i = NearbyZeroPlayTraceHelper$Stage.ENTER;
                if (!PatchProxy.applyVoidOneRefs(i, this, nearbyZeroPl, "9") && a[i.ordinal()] == 1) {
                   NearbyZeroPlayTraceHelper$Stage dATA_INIT = NearbyZeroPlayTraceHelper$Stage.DATA_INIT;
                   if (this.b.get(dATA_INIT) != null) {
                      this.a(dATA_INIT);
                   }
                }
             }
          }
          return;
       }
    }
}
