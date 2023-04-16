package com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import bl.p;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.util.Collection;
import com.google.gson.stream.b;
import java.util.Iterator;

public final class CollectionTypeAdapterFactory$Adapter extends TypeAdapter	// class@000575
{
    public final TypeAdapter a;
    public final p b;

    public void CollectionTypeAdapterFactory$Adapter(Gson p0,Type p1,TypeAdapter p2,p p3){
       super();
       this.a = new TypeAdapterRuntimeTypeWrapper(p0, p2, p1);
       this.b = p3;
    }
    public Object read(a p0){
       Collection uCollection;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uCollection = null;
       }else {
          Collection uCollection1 = this.b.a();
          p0.a();
          while (p0.l()) {
             uCollection1.add(this.a.read(p0));
          }
          p0.g();
          uCollection = uCollection1;
       }
       return uCollection;
    }
    public void write(b p0,Object p1){
       if (p1 == null) {
          p0.u();
       }else {
          p0.c();
          p1 = p1.iterator();
          while (p1.hasNext()) {
             this.a.write(p0, p1.next());
          }
          p0.g();
       }
       return;
    }
}
