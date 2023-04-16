package com.kwai.edge.reco.Constants$initEdgeRecoEarlier$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class Constants$initEdgeRecoEarlier$2 extends Lambda implements a	// class@000d28
{
    public static final Constants$initEdgeRecoEarlier$2 INSTANCE;

    static {
       Constants$initEdgeRecoEarlier$2.INSTANCE = new Constants$initEdgeRecoEarlier$2();
    }
    public void Constants$initEdgeRecoEarlier$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, Constants$initEdgeRecoEarlier$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("initEdgeRecoEarlier", false);
    }
}
