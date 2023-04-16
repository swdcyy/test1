package com.kwai.edge.reco.ctr.CTRPredictor$initDataProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Integer;

public final class CTRPredictor$initDataProvider$2 extends Lambda implements a	// class@000d3d
{
    public static final CTRPredictor$initDataProvider$2 INSTANCE;

    static {
       CTRPredictor$initDataProvider$2.INSTANCE = new CTRPredictor$initDataProvider$2();
    }
    public void CTRPredictor$initDataProvider$2(){
       super(0);
    }
    public final Object invoke(){
       QCurrentUser obj = PatchProxy.apply(null, this, CTRPredictor$initDataProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       return Integer.valueOf(obj.getOwnerCount().mFollow);
    }
}
