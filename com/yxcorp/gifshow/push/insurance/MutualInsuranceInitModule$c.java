package com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule$c;
import brd.t;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule;
import java.util.List;
import com.yxcorp.gifshow.push.insurance.WakeupThirdPartyAppResponse$ApplicationInfo;
import brd.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;

public class MutualInsuranceInitModule$c extends t	// class@001670
{
    public final List b;
    public final WakeupThirdPartyAppResponse$ApplicationInfo c;
    public final List d;
    public final MutualInsuranceInitModule e;

    public void MutualInsuranceInitModule$c(MutualInsuranceInitModule p0,List p1,WakeupThirdPartyAppResponse$ApplicationInfo p2,List p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void subscribeActual(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutualInsuranceInitModule$c.class, "1")) {
          return;
       }
       this.b.add(this.c.mPackageName+"$"+"INVALID");
       this.e.o0(this.b, this.d);
       return;
    }
}