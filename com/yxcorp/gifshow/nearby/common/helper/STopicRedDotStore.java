package com.yxcorp.gifshow.nearby.common.helper.STopicRedDotStore;
import com.yxcorp.gifshow.nearby.common.helper.STopicRedDotStore$redDotData$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.nearby.startup.local.model.NearbyRedDot;
import fg6.a;
import com.google.gson.Gson;

public final class STopicRedDotStore	// class@00210a
{
    public static final p a;
    public static String b;
    public static String c;
    public static boolean d;
    public static final STopicRedDotStore e;

    static {
       STopicRedDotStore.e = new STopicRedDotStore();
       p op = s.c(STopicRedDotStore$redDotData$2.INSTANCE);
       STopicRedDotStore.a = op;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, STopicRedDotStore.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = op.getValue();
       }
       if (obj != null) {
          objArray = a.a.q(obj);
       }
       STopicRedDotStore.b = objArray;
    }
    public void STopicRedDotStore(){
       super();
    }
    public static final String a(){
       return STopicRedDotStore.b;
    }
}
