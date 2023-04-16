package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$pageLoadBlockedTime$2;
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

public final class LocalConfigKeyHelper$pageLoadBlockedTime$2 extends Lambda implements a	// class@002104
{
    public static final LocalConfigKeyHelper$pageLoadBlockedTime$2 INSTANCE;

    static {
       LocalConfigKeyHelper$pageLoadBlockedTime$2.INSTANCE = new LocalConfigKeyHelper$pageLoadBlockedTime$2();
    }
    public void LocalConfigKeyHelper$pageLoadBlockedTime$2(){
       super(0);
    }
    public final int invoke(){
       int i;
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$pageLoadBlockedTime$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (SystemUtil.K()) {
          i = i.g("nearbyPageLoadBlockedTime");
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   i = (i != 4)? f.e("nearbyPageLoadBlockedTime"): 400;
                }else {
                   i = 300;
                }
             }else {
                i = 200;
             }
          }else {
             i = 100;
          }
       }else {
          i = f.e("nearbyPageLoadBlockedTime");
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
