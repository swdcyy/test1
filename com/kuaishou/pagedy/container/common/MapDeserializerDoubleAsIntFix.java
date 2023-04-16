package com.kuaishou.pagedy.container.common.MapDeserializerDoubleAsIntFix;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.google.gson.JsonArray;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.util.List;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Map$Entry;
import java.util.Map;
import zk.g;
import java.lang.Boolean;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Number;
import java.lang.Double;
import java.lang.Long;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.util.Objects;

public final class MapDeserializerDoubleAsIntFix implements b	// class@000a52
{

    public void MapDeserializerDoubleAsIntFix(){
       super();
    }
    public final Object a(JsonElement p0){
       Iterator iterator;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, MapDeserializerDoubleAsIntFix.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.B()) {
          obj = new ArrayList();
          JsonArray jsonArray = p0.q();
          a.o(jsonArray, "json.asJsonArray");
          iterator = jsonArray.iterator();
          while (iterator.hasNext()) {
             JsonElement jsonElement = iterator.next();
             a.o(jsonElement, "anArr");
             obj.add(this.a(jsonElement));
          }
          return obj;
       }else if(p0.E()){
          LinkedTreeMap linkedTreeMa = new LinkedTreeMap();
          JsonObject jsonObject = p0.r();
          a.o(jsonObject, "json.asJsonObject");
          Set set = jsonObject.entrySet();
          a.o(set, "obj.entrySet\(\)");
          iterator = set.iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             JsonElement value = uEntry.getValue();
             if (value != null) {
                String str = value.toString();
                if (str != null) {
                   str = str.toLowerCase();
                   a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
                }else {
                   str = null;
                }
                int i = a.g("null", str) ^ 0x01;
                if (i) {
                   linkedTreeMa.put(key, this.a(value));
                }
             }
          }
          return linkedTreeMa;
       }else if(p0.F()){
          g og = p0.s();
          a.o(og, "prim");
          if (og.G()) {
             return Boolean.valueOf(og.d());
          }else if(og.a0()){
             String str1 = og.w();
             a.o(str1, "prim.asString");
             return str1;
          }else if(og.N()){
             String str2 = og.toString();
             a.o(str2, "prim.toString\(\)");
             if (StringsKt__StringsKt.O2(str2, ".", false, 2, null)) {
                return Double.valueOf(og.u().doubleValue());
             }else {
                return Long.valueOf(og.u().longValue());
             }
          }
       }
       return new Object();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MapDeserializerDoubleAsIntFix.class, "1");
       if (p1 != PatchProxyResult.class) {
       }else {
          a.p(p0, "p0");
          p0 = this.a(p0);
          Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
          p1 = p0;
       }
       return p1;
    }
}
