package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$refreshLocateType$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class LocalConfigKeyHelper$refreshLocateType$2 extends Lambda implements a	// class@002106
{
    public static final LocalConfigKeyHelper$refreshLocateType$2 INSTANCE;

    static {
       LocalConfigKeyHelper$refreshLocateType$2.INSTANCE = new LocalConfigKeyHelper$refreshLocateType$2();
    }
    public void LocalConfigKeyHelper$refreshLocateType$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$refreshLocateType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 3;
       if (SystemUtil.K()) {
          int i1 = i.g("nearbyRefreshLocateType");
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != i) {
                   i = f.e("nearbyRefreshLocateType");
                }
             }else {
                i = 2;
             }
          }else {
             i = 1;
          }
       }else {
          i = f.e("nearbyRefreshLocateType");
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
