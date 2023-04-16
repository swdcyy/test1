package com.kwai.component.bifrost.BifrostEntryDeserializerRegister$BifrostCommonResourceEntryDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.bifrost.res.BifrostCommonResourceEntry;
import com.google.gson.JsonObject;
import ekd.k0;
import com.kwai.component.bifrost.res.BifrostZipResourceEntry;
import com.kwai.component.bifrost.res.BifrostImageResourceEntry;
import com.kwai.component.bifrost.res.BifrostVideoResourceEntry;

public class BifrostEntryDeserializerRegister$BifrostCommonResourceEntryDeserializer implements b	// class@000a80
{

    public void BifrostEntryDeserializerRegister$BifrostCommonResourceEntryDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BifrostEntryDeserializerRegister$BifrostCommonResourceEntryDeserializer.class, "1");
       if (p1 != PatchProxyResult.class) {
       }else {
          int i = k0.f(p0, "type", 0);
          if (i) {
             if (i != 1) {
                if (i != 2) {
                   i = (i != 3)? p2.c(p0, BifrostCommonResourceEntry.class): p2.c(p0, BifrostZipResourceEntry.class);
                }else {
                   i = p2.c(p0, BifrostImageResourceEntry.class);
                }
             }else {
                i = p2.c(p0, BifrostVideoResourceEntry.class);
             }
          }else {
             i = p2.c(p0, BifrostCommonResourceEntry.class);
          }
       }
       return p1;
    }
}
