package com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.String;
import zk.f;
import java.lang.Object;
import java.lang.Boolean;
import zk.g;
import java.lang.Character;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.AbstractMap;
import com.google.gson.JsonArray;

public final class JsonObject extends JsonElement	// class@000557
{
    public final LinkedTreeMap a;

    public void JsonObject(){
       super();
       this.a = new LinkedTreeMap();
    }
    public void G(String p0,JsonElement p1){
       f a;
       JsonObject ta = this.a;
       if (p1 == null) {
          a = f.a;
       }
       ta.put(p0, a);
       return;
    }
    public void H(String p0,Boolean p1){
       f a = (p1 == null)? f.a: new g(p1);
       this.G(p0, a);
       return;
    }
    public void N(String p0,Character p1){
       f a = (p1 == null)? f.a: new g(p1);
       this.G(p0, a);
       return;
    }
    public void a0(String p0,Number p1){
       f a = (p1 == null)? f.a: new g(p1);
       this.G(p0, a);
       return;
    }
    public JsonElement b(){
       return this.d0();
    }
    public void c0(String p0,String p1){
       f a = (p1 == null)? f.a: new g(p1);
       this.G(p0, a);
       return;
    }
    public JsonObject d0(){
       JsonObject jsonObject = new JsonObject();
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          jsonObject.G(key, uEntry.getValue().b());
       }
       return jsonObject;
    }
    public JsonElement e0(String p0){
       return this.a.get(p0);
    }
    public Set entrySet(){
       return this.a.entrySet();
    }
    public boolean equals(Object p0){
       boolean b = (p0 == this || (p0 instanceof JsonObject && p0.a.equals(this.a)))? true: false;
       return b;
    }
    public JsonArray g0(String p0){
       return this.a.get(p0);
    }
    public int hashCode(){
       return this.a.hashCode();
    }
    public JsonObject m0(String p0){
       return this.a.get(p0);
    }
    public g r0(String p0){
       return this.a.get(p0);
    }
    public boolean s0(String p0){
       return this.a.containsKey(p0);
    }
    public int size(){
       return this.a.size();
    }
    public Set w0(){
       return this.a.keySet();
    }
    public JsonElement z0(String p0){
       return this.a.remove(p0);
    }
}
