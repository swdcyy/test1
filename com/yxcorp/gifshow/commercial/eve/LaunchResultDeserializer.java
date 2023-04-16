package com.yxcorp.gifshow.commercial.eve.LaunchResultDeserializer;
import com.google.gson.b;
import com.yxcorp.gifshow.commercial.eve.LaunchResultDeserializer$a;
import nsd.u;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vl9.a;
import com.google.gson.JsonObject;
import vl9.a$b;
import ekd.k0;
import tkd.b;
import tkd.d;
import gm9.c;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class LaunchResultDeserializer implements b	// class@001138
{
    public static final LaunchResultDeserializer$a a;

    static {
       LaunchResultDeserializer.a = new LaunchResultDeserializer$a(null);
    }
    public void LaunchResultDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       int i;
       a$b uob = PatchProxy.applyThreeRefs(p0, p1, p2, this, LaunchResultDeserializer.class, "1");
       if (uob != PatchProxyResult.class) {
       }else if(p0 == null || p2 == null){
          a uoa = new a(null, 0, 0, 0, 0, 31, null);
       }else {
          JsonObject jsonObject = p0.r();
          uob = p2.c(jsonObject, a$b.class);
          if (!k0.a(jsonObject, "will_launch")) {
             c uoc = d.a(0x943d4c1);
             if (uoc != null) {
                a.o(uob, "launchResult");
                i = uoc.r60(uob);
             }else {
                i = 0;
             }
             uob.willLaunch = i;
             Log.g("LaunchResultDeserializer", "deserialize launchProbability: "+uob.launchProbability+", "+"willLaunch: "+uob.willLaunch);
          }
          a.o(uob, "launchResult");
       }
       return uob;
    }
}
