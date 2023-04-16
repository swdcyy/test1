package com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import zk.j;
import bl.g;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import al.b;
import java.lang.annotation.Annotation;
import bl.p;
import zk.i;
import com.google.gson.b;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.gson.internal.bind.TreeTypeAdapter;

public final class JsonAdapterAnnotationTypeAdapterFactory implements j	// class@000579
{
    public final g b;

    public void JsonAdapterAnnotationTypeAdapterFactory(g p0){
       super();
       this.b = p0;
    }
    public TypeAdapter a(Gson p0,a p1){
       b annotation = p1.getRawType().getAnnotation(b.class);
       if (annotation == null) {
          return null;
       }
       return this.b(this.b, p0, p1, annotation);
    }
    public TypeAdapter b(g p0,Gson p1,a p2,b p3){
       TypeAdapter typeAdapter = p0.a(a.get(p3.value())).a();
       if (typeAdapter instanceof TypeAdapter) {
       }else if(typeAdapter instanceof j){
          typeAdapter = typeAdapter.a(p1, p2);
       }else if((v0 = typeAdapter instanceof i) || typeAdapter instanceof b){
          Object obj = null;
          Object obj1 = (v0)? typeAdapter: obj;
          if (typeAdapter instanceof b) {
             obj = typeAdapter;
          }
          TreeTypeAdapter treeTypeAdap = new TreeTypeAdapter(obj1, obj, p1, p2, null);
       }else {
          throw new IllegalArgumentException("Invalid attempt to bind an instance of "+typeAdapter.getClass().getName()+" as a @JsonAdapter for "+p2.toString()+". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
       }
       if (typeAdapter != null && p3.nullSafe()) {
          typeAdapter = typeAdapter.nullSafe();
       }
       return typeAdapter;
    }
}
