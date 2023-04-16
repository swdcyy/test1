package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$ItemTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$a;
import java.lang.Enum;
import fg6.a;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import java.lang.IllegalStateException;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Boolean;
import com.google.gson.stream.b;
import java.lang.Number;
import java.lang.StringBuilder;
import com.google.gson.JsonElement;

public class PersistentStorage$ItemTypeAdapter extends TypeAdapter	// class@00114c
{

    public void PersistentStorage$ItemTypeAdapter(){
       super();
    }
    public Object read(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PersistentStorage$ItemTypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = PersistentStorage$a.a[p0.J().ordinal()];
       if (i == 1) {
          return Boolean.valueOf(p0.s());
       }
       if (i != 2) {
          if (i == 3) {
             return Integer.valueOf(p0.v());
          }
          int i1 = 4;
          if (i != i1) {
             if (i == 5) {
                return a.a.e(p0, JsonObject.class);
             }else {
                throw new IllegalStateException("unsupported type");
             }
          }else {
             String str = p0.E();
             if (str.startsWith("__")) {
                if (str.startsWith("__l_")) {
                   return Long.valueOf(Long.parseLong(str.substring(i1)));
                }else if(str.startsWith("__f_")){
                   return Float.valueOf(Float.parseFloat(str.substring(i1)));
                }else if(str.startsWith("__d_")){
                   str = Double.valueOf(Double.parseDouble(str.substring(i1)));
                }
             }
             return str;
          }
       }else {
          p0.A();
          return null;
       }
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PersistentStorage$ItemTypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
       }else if(p1 instanceof Integer){
          p0.K(p1.longValue());
       }else if(p1 instanceof String){
          p0.O(p1);
       }else if(p1 instanceof Boolean){
          p0.L(p1);
       }else if(p1 instanceof Number){
          if (p1 instanceof Long) {
             p0.O("__l_"+p1);
          }else if(p1 instanceof Float){
             p0.O("__f_"+p1);
          }else {
             p0.O("__d_"+p1);
          }
       }else if(p1 instanceof JsonObject){
          a.a.s(p1, p0);
       }else {
          throw new IllegalStateException("not supported type for pstore: "+p1.getClass());
       }
       return;
    }
}
