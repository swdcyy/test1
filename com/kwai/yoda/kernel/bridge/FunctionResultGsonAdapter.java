package com.kwai.yoda.kernel.bridge.FunctionResultGsonAdapter;
import zk.i;
import com.kwai.yoda.kernel.bridge.FunctionResultGsonAdapter$a;
import nsd.u;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import ny7.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import tb7.a;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.IllegalArgumentException;

public final class FunctionResultGsonAdapter implements i	// class@001281
{
    public static final FunctionResultGsonAdapter$a a;

    static {
       FunctionResultGsonAdapter.a = new FunctionResultGsonAdapter$a(null);
    }
    public void FunctionResultGsonAdapter(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, FunctionResultGsonAdapter.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else if(p0 != null && p1 != null){
          Boolean uBoolean = null;
          JsonElement jsonElement = (p2 != null)? p2.a(p0.c): uBoolean;
          jsonObject = new JsonObject();
          jsonObject.a0("result", Integer.valueOf(p0.a));
          p0 = p0.b;
          if (p0 != null) {
             jsonObject.c0("message", p0);
          }
          if (jsonElement != null) {
             uBoolean = Boolean.valueOf(jsonElement.E());
          }
          if (a.c(uBoolean) && jsonElement != null) {
             p0 = jsonElement.r().entrySet();
             if (p0 != null) {
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   Map$Entry uEntry = p0.next();
                   String key = uEntry.getKey();
                   jsonObject.G(key, uEntry.getValue());
                }
             }
          }
       }else {
          throw new IllegalArgumentException("The data is invalid");
       }
       return jsonObject;
    }
}
