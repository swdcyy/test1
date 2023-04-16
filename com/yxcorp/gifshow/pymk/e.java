package com.yxcorp.gifshow.pymk.e;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.yxcorp.gifshow.pymk.f;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;

public final class e implements Callable	// class@0016b2
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object call(){
       RecommendUserResponseV2 recommendUse = new RecommendUserResponseV2();
       recommendUse.afterDeserialize();
       return recommendUse;
    }
}
