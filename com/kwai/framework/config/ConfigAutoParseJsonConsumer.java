package com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import erd.g;
import java.lang.String;
import ok.x;
import java.lang.Object;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer$1;
import java.lang.Class;
import com.google.common.reflect.TypeToken;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.reflect.Type;
import java.util.Objects;
import java.lang.reflect.ParameterizedType;
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;
import ekd.k0;
import com.google.gson.Gson;

public abstract class ConfigAutoParseJsonConsumer implements g	// class@0014f6
{
    public final String b;
    public final x c;
    public Type d;

    public void ConfigAutoParseJsonConsumer(String p0,x p1){
       super();
       this.b = p0;
       this.c = p1;
       this.d = new ConfigAutoParseJsonConsumer$1(this, this.getClass()).getRawType();
       return;
    }
    public void ConfigAutoParseJsonConsumer(x p0){
       super(null, p0);
    }
    public final void a(JsonObject p0){
       JsonElement jsonElement;
       if (PatchProxy.applyVoidOneRefs(p0, this, ConfigAutoParseJsonConsumer.class, "1")) {
          return;
       }
       this.c(p0);
       ConfigAutoParseJsonConsumer tb = this.b;
       if (tb != null) {
          jsonElement = k0.e(p0, tb);
       }
       try{
          this.b(this.c.get().d(jsonElement, this.d));
          return;
       }catch(java.lang.Exception e3){
          Log.e("ConfigAutoParseJsonConsumer "+this.d.getSimpleName(), "accept: ", e3);
          throw e3;
       }
    }
    public void accept(Object p0){
       this.a(p0);
    }
    public abstract void b(Object p0);
    public void c(JsonObject p0){
    }
}
