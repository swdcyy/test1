package com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewModel$ksCoin$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KsCoinPendantViewModel$ksCoin$1 extends Lambda implements p	// class@001613
{
    public static final KsCoinPendantViewModel$ksCoin$1 INSTANCE;

    static {
       KsCoinPendantViewModel$ksCoin$1.INSTANCE = new KsCoinPendantViewModel$ksCoin$1();
    }
    public void KsCoinPendantViewModel$ksCoin$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final String invoke(Map p0,UserInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KsCoinPendantViewModel$ksCoin$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ksCoinInfo");
       p1 = (p1 != null)? p1.mId: null;
       String str = p0.get(p1);
       if (str == null) {
          str = "0";
       }
       return str;
    }
}
