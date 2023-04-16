package com.android.kwai.foundation.network.core.IRpcDelegate;
import java.lang.reflect.Method;
import java.lang.Object;
import okhttp3.Request$Builder;
import okhttp3.OkHttpClient$Builder;
import com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import java.util.Map;
import com.android.kwai.foundation.network.core.logicrecognize.ILogicRecognize;

public interface abstract IRpcDelegate	// class@0003d8
{

    Object makeTheRealCall(Method p0,Object[] p1,Request$Builder p2,OkHttpClient$Builder p3,IDeserializer p4,Map p5,ILogicRecognize p6);
}
