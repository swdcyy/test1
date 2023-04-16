package com.yxcorp.gifshow.photoad.k$a;
import zk.a;
import java.lang.Object;
import java.lang.Class;
import zk.b;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class k$a implements a	// class@000f97
{

    public void k$a(){
       super();
    }
    public boolean shouldSkipClass(Class p0){
       return false;
    }
    public boolean shouldSkipField(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!("mChargeInfo").equals(p0.b()) && (!("mExtMeta").equals(p0.b()) && (("mNegativeMenuInfo").equals(p0.b()) || ("mAdaptationSet").equals(p0.b()))))? true: false;
       return b;
    }
}
