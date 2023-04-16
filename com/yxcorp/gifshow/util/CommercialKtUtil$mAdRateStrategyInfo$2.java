package com.yxcorp.gifshow.util.CommercialKtUtil$mAdRateStrategyInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ty8.d;
import com.yxcorp.experiment.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;

public final class CommercialKtUtil$mAdRateStrategyInfo$2 extends Lambda implements a	// class@001edb
{
    public static final CommercialKtUtil$mAdRateStrategyInfo$2 INSTANCE;

    static {
       CommercialKtUtil$mAdRateStrategyInfo$2.INSTANCE = new CommercialKtUtil$mAdRateStrategyInfo$2();
    }
    public void CommercialKtUtil$mAdRateStrategyInfo$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final d invoke(){
       d uod;
       d uod1;
       c uoc = c.h();
       a.o(uoc, "ABManager.getInstance\(\)");
       if (uoc.k()) {
          uod = new d(0, 0, 0, 7, null);
          uod1 = f.b("adRateStrategyInfo", d.class, v7);
       }else {
          uod = new d(0, 0, 0, 7, null);
       }
       return uod1;
    }
}
