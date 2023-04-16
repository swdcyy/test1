package com.google.gson.internal.bind.TypeAdapters$35;
import zk.j;
import java.lang.Class;
import com.google.gson.TypeAdapter;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.internal.bind.TypeAdapters$35$1;
import java.lang.String;
import java.lang.StringBuilder;

public class TypeAdapters$35 implements j	// class@0005a7
{
    public final Class b;
    public final TypeAdapter c;

    public void TypeAdapters$35(Class p0,TypeAdapter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Class rawType = p1.getRawType();
       if (!this.b.isAssignableFrom(rawType)) {
          return null;
       }
       return new TypeAdapters$35$1(this, rawType);
    }
    public String toString(){
       return "Factory[typeHierarchy="+this.b.getName()+",adapter="+this.c+"]";
    }
}
