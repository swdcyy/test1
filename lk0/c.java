package lk0.c;
import java.lang.Object;
import java.lang.Number;
import java.math.BigInteger;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Byte;
import com.google.gson.JsonObject;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import zk.g;
import java.lang.Boolean;
import java.lang.Double;

public final class c	// class@002f85
{

    public void c(){
       super();
    }
    public static boolean a(Number p0){
       boolean b = (!p0 instanceof BigInteger && (!p0 instanceof Long && (!p0 instanceof Integer && (p0 instanceof Short || p0 instanceof Byte))))? true: false;
       return b;
    }
    public static Bundle b(JsonObject p0){
       Bundle obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          JsonElement value = uEntry.getValue();
          if (value.E()) {
             obj.putBundle(key, c.b(value.r()));
          }else if(value.D()){
             obj.putString(key, null);
          }else if(value.B()){
             SerializableHook.putSerializable(obj, key, c.c(value.q()));
          }else if(value.F()){
             if (value.G()) {
                obj.putBoolean(key, value.d());
             }else if(value.N()){
                Number number = value.u();
                if (c.a(number)) {
                   obj.putInt(key, number.intValue());
                }else {
                   obj.putDouble(key, number.doubleValue());
                }
             }else if(value.a0()){
                obj.putString(key, value.w());
             }
          }
       }
       return obj;
    }
    public static ArrayList c(JsonArray p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          JsonElement jsonElement = iterator.next();
          if (jsonElement.E()) {
             obj.add(c.b(jsonElement.r()));
          }else if(jsonElement.D()){
             obj.add(null);
          }else if(jsonElement.B()){
             obj.add(c.c(jsonElement.q()));
          }else if(jsonElement.F()){
             if (jsonElement.G()) {
                obj.add(Boolean.valueOf(jsonElement.d()));
             }else if(jsonElement.N()){
                Number number = jsonElement.u();
                if (c.a(number)) {
                   obj.add(Integer.valueOf(number.intValue()));
                }else {
                   obj.add(Double.valueOf(number.doubleValue()));
                }
             }else if(jsonElement.a0()){
                obj.add(jsonElement.w());
             }
          }
       }
       return obj;
    }
}
