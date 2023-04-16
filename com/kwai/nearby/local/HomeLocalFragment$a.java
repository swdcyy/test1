package com.kwai.nearby.local.HomeLocalFragment$a;
import ha5.e;
import com.kwai.nearby.local.HomeLocalFragment;
import java.lang.Object;
import java.lang.String;
import ha5.d;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import ab5.a;
import kp.r1;
import java.util.Objects;
import com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper$Stage;
import rw5.a;
import com.yxcorp.gifshow.nearby.common.rubas.LocalDetailStageRubasHelper;
import urb.a;
import vm5.h$a;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;

public class HomeLocalFragment$a implements e	// class@000f7a
{
    public final HomeLocalFragment a;

    public void HomeLocalFragment$a(HomeLocalFragment p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,boolean p4,int p5){
       d.d(this, p0, p1, p2, p3, p4, p5);
    }
    public void b(BaseFeed p0,int p1){
       d.c(this, p0, p1);
    }
    public void c(BaseFeed p0,int p1){
       HomeLocalFragment v0;
       NearbyZeroPlayTraceHelper nearbyZeroPl = NearbyZeroPlayTraceHelper.class;
       HomeLocalFragment$a uoa = HomeLocalFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.H.i = p1;
       if (!r1.V2(p0) && !r1.U2(p0)) {
          v0 = this.a.V0;
          Objects.requireNonNull(v0);
          if (!PatchProxy.applyVoid(null, v0, nearbyZeroPl, "2")) {
             v0.a(NearbyZeroPlayTraceHelper$Stage.USER_INTERACT);
             v0.a(NearbyZeroPlayTraceHelper$Stage.CLICK);
          }
       }
       if (r1.D3(p0)) {
          LocalDetailStageRubasHelper.d(a.a.intValue());
       }
       if (r1.S2(p0)) {
          LocalDetailStageRubasHelper.d(a.b.intValue());
          v0 = this.a.V0;
          Objects.requireNonNull(v0);
          if (!PatchProxy.applyVoid(null, v0, nearbyZeroPl, "3")) {
             v0.a(NearbyZeroPlayTraceHelper$Stage.PLAY);
          }
       }
       v0.d = p0.getId();
       return;
    }
    public void d(h$a p0,int p1){
       d.e(this, p0, p1);
    }
    public int[] e(CoverMeta p0,CommonMeta p1){
       return d.a(this, p0, p1);
    }
}
