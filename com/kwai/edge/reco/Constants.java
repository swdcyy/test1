package com.kwai.edge.reco.Constants;
import com.kwai.edge.reco.Constants$initEdgeRecoEarlier$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class Constants	// class@000d29
{
    public static final p a;
    public static final Constants b;

    static {
       Constants.b = new Constants();
       Constants.a = s.c(Constants$initEdgeRecoEarlier$2.INSTANCE);
    }
    public void Constants(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, Constants.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = Constants.a.getValue();
       }
       return obj.booleanValue();
    }
}
