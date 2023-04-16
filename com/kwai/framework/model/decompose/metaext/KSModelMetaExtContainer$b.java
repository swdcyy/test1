package com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$b;
import com.google.gson.JsonObject;
import ha6.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class KSModelMetaExtContainer$b	// class@0016a6
{
    public final JsonObject a;
    public final e b;

    public void KSModelMetaExtContainer$b(JsonObject p0,e p1){
       a.p(p0, "jsonObject");
       a.p(p1, "host");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final e a(){
       return this.b;
    }
    public final JsonObject b(){
       return this.a;
    }
}
