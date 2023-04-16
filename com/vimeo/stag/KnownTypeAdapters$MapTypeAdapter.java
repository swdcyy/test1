package com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.TypeAdapter;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.util.Map;
import com.google.gson.JsonSyntaxException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.gson.internal.a;
import com.google.gson.stream.b;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import com.google.gson.internal.b;
import zk.g;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.AssertionError;

public final class KnownTypeAdapters$MapTypeAdapter extends TypeAdapter	// class@000ff4
{
    public final p a;
    public final TypeAdapter b;
    public final TypeAdapter c;

    public void KnownTypeAdapters$MapTypeAdapter(TypeAdapter p0,TypeAdapter p1,p p2){
       super();
       this.c = p0;
       this.b = p1;
       this.a = p2;
    }
    public Object read(a p0){
       Map map;
       Object obj;
       JsonToken jsonToken = p0.J();
       if (jsonToken == JsonToken.NULL) {
          p0.A();
          map = null;
       }else {
          Map map1 = this.a.a();
          if (jsonToken == JsonToken.BEGIN_ARRAY) {
             p0.a();
             while (true) {
                if (p0.l()) {
                   p0.a();
                   obj = this.c.read(p0);
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
                   obj = this.c.read(p0);
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
       if (p1 == null) {
          p0.u();
       }else {
          ArrayList uArrayList = new ArrayList(p1.size());
          ArrayList uArrayList1 = new ArrayList(p1.size());
          p1 = p1.entrySet().iterator();
          int i = 0;
          int i1 = 0;
          while (p1.hasNext()) {
             Map$Entry uEntry = p1.next();
             JsonElement jsonElement = this.c.toJsonTree(uEntry.getKey());
             uArrayList.add(jsonElement);
             uArrayList1.add(uEntry.getValue());
             int i2 = (jsonElement.B() || jsonElement.E())? 1: 0;
             i1 = i1 | i2;
          }
          if (i1) {
             p0.c();
             for (; i < uArrayList.size(); i = i + 1) {
                p0.c();
                b.b(uArrayList.get(i), p0);
                this.b.write(p0, uArrayList1.get(i));
                p0.g();
             }
             p0.g();
          }else {
             p0.e();
             while (true) {
                if (i < uArrayList.size()) {
                   p1 = uArrayList.get(i);
                   if (p1.F()) {
                      p1 = p1.s();
                      if (p1.N()) {
                         p1 = String.valueOf(p1.u());
                      }else if(p1.G()){
                         p1 = Boolean.toString(p1.d());
                      }else if(p1.a0()){
                         p1 = p1.w();
                      }else {
                         throw new AssertionError();
                      }
                   }else if(p1.D()){
                      p1 = "null";
                   }else {
                      throw new AssertionError();
                   }
                   p0.r(p1);
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
