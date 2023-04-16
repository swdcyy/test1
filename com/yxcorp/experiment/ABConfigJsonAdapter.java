package com.yxcorp.experiment.ABConfigJsonAdapter;
import com.google.gson.b;
import zk.i;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.yxcorp.experiment.ABConfig;
import com.google.gson.JsonObject;
import java.lang.String;
import yb7.h;
import zk.g;
import java.lang.Long;
import zk.h;
import java.lang.Integer;
import java.lang.Number;
import zk.f;

public class ABConfigJsonAdapter implements b, i	// class@00100c
{

    public void ABConfigJsonAdapter(){
       super();
    }
    public ABConfig deserialize(JsonElement p0,Type p1,a p2){
       ABConfig uABConfig = new ABConfig();
       uABConfig.setWorldType(h.e(p0, "hash", 0));
       uABConfig.setPolicyType(h.e(p0, "policy", 0));
       uABConfig.setValueJsonElement(h.d(p0, "value", 0));
       JsonElement jsonElement = h.d(p0, "gid", 0);
       Long longx = (jsonElement instanceof g)? Long.valueOf(jsonElement.t()): null;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.deserialize(p0, p1, p2);
    }
    public JsonElement serialize(ABConfig p0,Type p1,h p2){
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("hash", Integer.valueOf(p0.getWorldType()));
       jsonObject.a0("policy", Integer.valueOf(p0.getPolicyType()));
       f a = (p0.getValueJsonElement() == null)? f.a: p0.getValueJsonElement();
       jsonObject.G("value", a);
       jsonObject.a0("gid", p0.getGroupId());
       jsonObject.a0("swc", Integer.valueOf(p0.getLogPolicy()));
       jsonObject.a0("df", Integer.valueOf(p0.getDynamicFlag()));
       return jsonObject;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       return this.serialize(p0, p1, p2);
    }
}
