package com.example.commercial.diversead.request.DiverseAdEncRequester$getDiverseAdApi$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class DiverseAdEncRequester$getDiverseAdApi$2 extends Lambda implements l	// class@001031
{
    public static final DiverseAdEncRequester$getDiverseAdApi$2 INSTANCE;

    static {
       DiverseAdEncRequester$getDiverseAdApi$2.INSTANCE = new DiverseAdEncRequester$getDiverseAdApi$2();
    }
    public void DiverseAdEncRequester$getDiverseAdApi$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       a.p(p0, "jsonObject");
       p0.c0("appId", "");
    }
}
