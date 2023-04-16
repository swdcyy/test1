package com.kwai.framework.util.gson.MapDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Map$Entry;
import java.util.Map;
import zk.g;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Math;
import java.lang.Long;
import java.lang.Double;
import java.lang.reflect.Type;
import com.google.gson.a;

public class MapDeserializer implements b	// class@000ce7
{

    public void MapDeserializer(){
       super();
    }
    public Object a(JsonElement p0){
       Iterator iterator;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, MapDeserializer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.B()) {
          obj = new ArrayList();
          iterator = p0.q().iterator();
          while (iterator.hasNext()) {
             obj.add(this.a(iterator.next()));
          }
          return obj;
       }else if(p0.E()){
          LinkedTreeMap linkedTreeMa = new LinkedTreeMap();
          iterator = p0.r().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             linkedTreeMa.put(key, this.a(uEntry.getValue()));
          }
          return linkedTreeMa;
       }else if(p0.F()){
          g og = p0.s();
          if (og.G()) {
             return Boolean.valueOf(og.d());
          }else if(og.a0()){
             return og.w();
          }else if(og.N()){
             Number number = og.u();
             if (!Math.ceil(number.doubleValue()) - (double)number.longValue()) {
                return Long.valueOf(number.longValue());
             }else {
                return Double.valueOf(number.doubleValue());
             }
          }
       }
       return null;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MapDeserializer.class, "2");
       if (p1 != PatchProxyResult.class) {
       }else {
          p1 = this.a(p0);
       }
       return p1;
    }
}
