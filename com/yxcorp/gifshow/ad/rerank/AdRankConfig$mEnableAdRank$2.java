package com.yxcorp.gifshow.ad.rerank.AdRankConfig$mEnableAdRank$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.experiment.c;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.abtest.f;

public final class AdRankConfig$mEnableAdRank$2 extends Lambda implements a	// class@0017bf
{
    public static final AdRankConfig$mEnableAdRank$2 INSTANCE;

    static {
       AdRankConfig$mEnableAdRank$2.INSTANCE = new AdRankConfig$mEnableAdRank$2();
    }
    public void AdRankConfig$mEnableAdRank$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       c obj = PatchProxy.apply(null, this, AdRankConfig$mEnableAdRank$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c.h();
       a.o(obj, "ABManager.getInstance\(\)");
       boolean b = false;
       if (obj.k() && a.t().d("enableAdRerank", b)) {
          b = f.a("enableAdRank");
       }
       return b;
    }
}
