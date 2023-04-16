package com.oplus.ocs.base.common.api.CapabilityApiClient$1;
import com.oplus.ocs.base.common.api.i;
import com.oplus.ocs.base.common.api.Api;
import android.content.Context;
import com.oplus.ocs.base.common.CapabilityListener;
import java.lang.Object;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.AuthResult;
import com.oplus.ocs.base.common.api.CapabilityApiClient;
import java.lang.StringBuilder;
import java.lang.String;
import com.oplus.ocs.base.utils.a;
import java.util.Map;

public final class CapabilityApiClient$1 implements i	// class@000acb
{
    public final int[] a;
    public final int b;
    public final Api c;
    public final Context d;
    public final Api[] e;
    public final CapabilityListener f;

    public void CapabilityApiClient$1(int[] p0,int p1,Api p2,Context p3,Api[] p4,CapabilityListener p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public final void a(CapabilityInfo p0){
       if (p0 != null && p0.getAuthResult() != null) {
          this.a[this.b] = p0.getAuthResult().getErrrorCode();
       }else {
          a.a(CapabilityApiClient.TAG, this.c.getName()+" fail, capability is null");
          int i = 7;
          p0[this.b] = i;
          p0 = CapabilityApiClient.buildCapabilityInfo(this.d, i);
       }
       CapabilityApiClient.sApis.put(this.c, p0);
       CapabilityApiClient.callback(this.e, this.a, this.f);
       return;
    }
}
