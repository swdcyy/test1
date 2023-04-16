package com.kwai.framework.kxb.plugins.KwaiStatisticalService$mKxbLogDeviceSample$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e96.a;
import java.util.Objects;
import o56.a;
import o56.c;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Math;

public final class KwaiStatisticalService$mKxbLogDeviceSample$2 extends Lambda implements a	// class@001623
{
    public static final KwaiStatisticalService$mKxbLogDeviceSample$2 INSTANCE;

    static {
       KwaiStatisticalService$mKxbLogDeviceSample$2.INSTANCE = new KwaiStatisticalService$mKxbLogDeviceSample$2();
    }
    public void KwaiStatisticalService$mKxbLogDeviceSample$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       a obj = PatchProxy.apply(objArray, this, KwaiStatisticalService$mKxbLogDeviceSample$2.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = a.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a.class, str);
       StringBuilder str1 = null;
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(a.q == 0x1869f){
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             b1 = true;
          }
       }
       b1 = false;
       if (b1) {
          return b;
       }else {
          f uof = a.t().f("kxb_log_device_sample");
          if (uof != null) {
             b1 = uof.a(b);
             Log.g("KwaiStatisticalService", "use kswitch sample ratio: "+b1);
          }else if(Math.random() - 0x3f847ae147ae147b <= 0){
             str1 = true;
          }
          Log.g("KwaiStatisticalService", "use local sample ratio: "+str1);
          StringBuilder str2 = str1;
          return b1;
       }
    }
}
