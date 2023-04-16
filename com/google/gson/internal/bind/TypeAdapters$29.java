package com.google.gson.internal.bind.TypeAdapters$29;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import com.google.gson.JsonElement;
import com.google.gson.internal.bind.TypeAdapters$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import com.google.gson.JsonObject;
import java.lang.String;
import com.google.gson.JsonArray;
import zk.f;
import zk.g;
import java.lang.Boolean;
import com.google.gson.internal.LazilyParsedNumber;
import java.lang.Number;
import com.google.gson.stream.b;
import java.util.Iterator;
import java.lang.Object;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import java.lang.Class;

public class TypeAdapters$29 extends TypeAdapter	// class@00059f
{

    public void TypeAdapters$29(){
       super();
    }
    public JsonElement a(a p0){
       switch (TypeAdapters$a.a[p0.J().ordinal()]){
           case 1:
             return new g(new LazilyParsedNumber(p0.E()));
           case 2:
             return new g(Boolean.valueOf(p0.s()));
           case 3:
             return new g(p0.E());
           case 4:
             p0.A();
             return f.a;
           case 5:
             JsonArray jsonArray = new JsonArray();
             p0.a();
             while (p0.l()) {
                jsonArray.G(this.a(p0));
             }
             p0.g();
             return jsonArray;
             break;
           case 6:
             JsonObject jsonObject = new JsonObject();
             p0.c();
             while (p0.l()) {
                jsonObject.G(p0.y(), this.a(p0));
             }
             p0.j();
             return jsonObject;
             break;
           default:
             throw new IllegalArgumentException();
       }
    }
    public void b(b p0,JsonElement p1){
       Iterator iterator;
       if (p1 == null || p1.D()) {
          p0.u();
       }else if(p1.F()){
          g og = p1.s();
          if (og.N()) {
             p0.M(og.u());
          }else if(og.G()){
             p0.P(og.d());
          }else {
             p0.O(og.w());
          }
       }else if(p1.B()){
          p0.c();
          iterator = p1.q().iterator();
          while (iterator.hasNext()) {
             this.b(p0, iterator.next());
          }
          p0.g();
       }else if(p1.E()){
          p0.e();
          iterator = p1.r().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             p0.r(uEntry.getKey());
             this.b(p0, uEntry.getValue());
          }
          p0.j();
       }else {
          throw new IllegalArgumentException("Couldn\'t write "+p1.getClass());
       }
       return;
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
