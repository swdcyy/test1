package com.kwai.library.kwaiplayerkit.log.AbrGothamTraceImpl$mLazyConfig$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import org.json.JSONObject;
import ay6.a;
import java.util.HashMap;
import ay6.f;
import java.util.Objects;
import java.lang.String;
import java.lang.reflect.Type;
import ay6.c;
import java.util.Map;

public final class AbrGothamTraceImpl$mLazyConfig$1 extends Lambda implements a	// class@000899
{
    public static final AbrGothamTraceImpl$mLazyConfig$1 INSTANCE;

    static {
       AbrGothamTraceImpl$mLazyConfig$1.INSTANCE = new AbrGothamTraceImpl$mLazyConfig$1();
    }
    public void AbrGothamTraceImpl$mLazyConfig$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final JSONObject invoke(){
       Objects.requireNonNull(f.c);
       Map value = a.b.getValue("gothamTraceRatioConfig", HashMap.class, f.b);
       JSONObject jSONObject = (value != null)? new JSONObject(value): null;
       return jSONObject;
    }
}
