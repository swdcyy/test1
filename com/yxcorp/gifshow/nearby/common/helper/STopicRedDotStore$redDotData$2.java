package com.yxcorp.gifshow.nearby.common.helper.STopicRedDotStore$redDotData$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.nearby.startup.local.model.NearbyRedDot;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kn4.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class STopicRedDotStore$redDotData$2 extends Lambda implements a	// class@002109
{
    public static final STopicRedDotStore$redDotData$2 INSTANCE;

    static {
       STopicRedDotStore$redDotData$2.INSTANCE = new STopicRedDotStore$redDotData$2();
    }
    public void STopicRedDotStore$redDotData$2(){
       super(0);
    }
    public final NearbyRedDot invoke(){
       Object[] objArray = null;
       NearbyRedDot obj = PatchProxy.apply(objArray, this, STopicRedDotStore$redDotData$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NearbyRedDot.class;
       String str = a.a.getString("nearbyRedDot", "null");
       Object[] objArray1 = (str == null || str == "")? objArray: b.a(str, obj);
       if (objArray1 != null) {
          objArray = objArray1;
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
