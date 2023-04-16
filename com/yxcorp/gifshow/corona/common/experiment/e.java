package com.yxcorp.gifshow.corona.common.experiment.e;
import ok.x;
import java.lang.Object;
import gq9.a;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonObject;
import java.lang.String;
import java.lang.reflect.Type;

public final class e implements x	// class@0011ee
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object get(){
       return a.t().getValue("coronaTripleAnimationFile", JsonObject.class, null);
    }
}
