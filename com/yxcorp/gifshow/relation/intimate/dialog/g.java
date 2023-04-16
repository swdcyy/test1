package com.yxcorp.gifshow.relation.intimate.dialog.g;
import ok.x;
import java.lang.Object;
import lt7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.social.startup.relation.model.IntimateRelationConfig;
import java.lang.reflect.Type;
import mw4.a;

public final class g implements x	// class@0018f0
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final Object get(){
       boolean b;
       IntimateRelationConfig obj = PatchProxy.apply(null, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = a.k(IntimateRelationConfig.class);
          b = (obj != null && obj.mEnableInviteOptimizeV2 == 1)? true: false;
       }
       return Boolean.valueOf(b);
    }
}
