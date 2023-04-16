package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyLocationPermissonDialogShowTime$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$nearbyLocationPermissonDialogShowTime$2 extends Lambda implements a	// class@002102
{
    public static final LocalConfigKeyHelper$nearbyLocationPermissonDialogShowTime$2 INSTANCE;

    static {
       LocalConfigKeyHelper$nearbyLocationPermissonDialogShowTime$2.INSTANCE = new LocalConfigKeyHelper$nearbyLocationPermissonDialogShowTime$2();
    }
    public void LocalConfigKeyHelper$nearbyLocationPermissonDialogShowTime$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$nearbyLocationPermissonDialogShowTime$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (SystemUtil.K()) {
          int i = i.g("KEY_NEARBY_LOCATION_PERMISSON_SHOW_DIALOG_TIME");
          if (i != b) {
             b = (i != 2)? f.a("enable_nearby_gps_card_time"): false;
          }
       }else {
          b = f.a("enable_nearby_gps_card_time");
       }
       return b;
    }
}
