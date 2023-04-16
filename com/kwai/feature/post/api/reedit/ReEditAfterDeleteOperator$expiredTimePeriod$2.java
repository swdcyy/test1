package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$expiredTimePeriod$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Double;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class ReEditAfterDeleteOperator$expiredTimePeriod$2 extends Lambda implements a	// class@001431
{
    public static final ReEditAfterDeleteOperator$expiredTimePeriod$2 INSTANCE;

    static {
       ReEditAfterDeleteOperator$expiredTimePeriod$2.INSTANCE = new ReEditAfterDeleteOperator$expiredTimePeriod$2();
    }
    public void ReEditAfterDeleteOperator$expiredTimePeriod$2(){
       super(0);
    }
    public final Double invoke(){
       Object obj = PatchProxy.apply(null, this, ReEditAfterDeleteOperator$expiredTimePeriod$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("reeditAfterDeleteIntervalInHours", Double.TYPE, Double.valueOf(24.00f));
    }
    public Object invoke(){
       return this.invoke();
    }
}
