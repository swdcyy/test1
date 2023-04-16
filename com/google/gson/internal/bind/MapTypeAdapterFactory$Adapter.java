package com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import bl.p;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.util.Map;
import com.google.gson.JsonSyntaxException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.gson.internal.a;
import com.google.gson.stream.b;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.ArrayList;
import com.google.gson.JsonElement;
import com.google.gson.internal.b;
import zk.g;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.AssertionError;

public final class MapTypeAdapterFactory$Adapter extends TypeAdapter	// class@00057a
{
    public final TypeAdapter a;
    public final TypeAdapter b;
    public final p c;
    public final MapTypeAdapterFactory d;

    public void MapTypeAdapterFactory$Adapter(MapTypeAdapterFactory p0,Gson p1,Type p2,TypeAdapter p3,Type p4,TypeAdapter p5,p p6){
       this.d = p0;
       super();
       this.a = new TypeAdapterRuntimeTypeWrapper(p1, p3, p2);
       this.b = new TypeAdapterRuntimeTypeWrapper(p1, p5, p4);
       this.c = p6;
    }
    public Object read(a p0){
       Map map;
       Object obj;
       JsonToken jsonToken = p0.J();
       if (jsonToken == JsonToken.NULL) {
          p0.A();
          map = null;
       }else {
          Map map1 = this.c.a();
          if (jsonToken == JsonToken.BEGIN_ARRAY) {
             p0.a();
             while (true) {
                if (p0.l()) {
                   p0.a();
                   obj = this.a.read(p0);
                   if (map1.put(obj, this.b.read(p0)) == null) {
                      p0.g();
                   }else {
                      throw new JsonSyntaxException("duplicate key: "+obj);
                   }
                }else {
                   p0.g();
                }
             }
          }else {
             p0.c();
             while (true) {
                if (p0.l()) {
                   a.a.a(p0);
                   obj = this.a.read(p0);
                   if (map1.put(obj, this.b.read(p0)) != null) {
                   label_0078 :
                      throw new JsonSyntaxException("duplicate key: "+obj);
                   }
                   continue ;
                }else {
                   p0.j();
                }
             }
          }
          map = map1;
       }
       return map;
    }
    public void write(b p0,Object p1){
       int i3;
       String str;
       if (p1 == null) {
          p0.u();
       }else if(this.d.c == null){
          p0.e();
          p1 = p1.entrySet().iterator();
          while (p1.hasNext()) {
             Map$Entry uEntry = p1.next();
             p0.r(String.valueOf(uEntry.getKey()));
             this.b.write(p0, uEntry.getValue());
          }
          p0.j();
       }else {
          ArrayList uArrayList = new ArrayList(p1.size());
          ArrayList uArrayList1 = new ArrayList(p1.size());
          p1 = p1.entrySet().iterator();
          int i = 0;
          int i1 = 0;
          while (p1.hasNext()) {
             Map$Entry uEntry1 = p1.next();
             JsonElement jsonElement = this.a.toJsonTree(uEntry1.getKey());
             uArrayList.add(jsonElement);
             uArrayList1.add(uEntry1.getValue());
             int i2 = (jsonElement.B() || jsonElement.E())? 1: 0;
             i1 = i1 | i2;
          }
          if (i1) {
             p0.c();
             i3 = uArrayList.size();
             for (; i < i3; i = i + 1) {
                p0.c();
                b.b(uArrayList.get(i), p0);
                this.b.write(p0, uArrayList1.get(i));
                p0.g();
             }
             p0.g();
          }else {
             p0.e();
             i3 = uArrayList.size();
             while (true) {
                if (i < i3) {
                   JsonElement jsonElement1 = uArrayList.get(i);
                   if (jsonElement1.F()) {
                      g og = jsonElement1.s();
                      if (og.N()) {
                         str = String.valueOf(og.u());
                      }else if(og.G()){
                         str = Boolean.toString(og.d());
                      }else if(og.a0()){
                         str = og.w();
                      }else {
                         throw new AssertionError();
                      }
                   }else if(jsonElement1.D()){
                      str = "null";
                   }else {
                      throw new AssertionError();
                   }
                   p0.r(str);
                   this.b.write(p0, uArrayList1.get(i));
                   i = i + 1;
                }else {
                   p0.j();
                   break ;
                }
             }
          }
       }
       return;
    }
}
