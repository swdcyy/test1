package com.yxcorp.gifshow.activity.web.memory.a;
import ok.x;
import java.lang.Object;
import lx8.a;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.activity.web.memory.ActivityTabMemoryOptConfig;
import java.lang.String;
import java.lang.reflect.Type;

public final class a implements x	// class@0014bd
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return a.t().getValue("opt4TabWebViewMemConfig", ActivityTabMemoryOptConfig.class, null);
    }
}
