package com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.b;
import java.lang.reflect.TypeVariable;
import java.lang.Class;
import el.a;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter;

public final class TypeAdapterRuntimeTypeWrapper extends TypeAdapter	// class@000589
{
    public final Gson a;
    public final TypeAdapter b;
    public final Type c;

    public void TypeAdapterRuntimeTypeWrapper(Gson p0,TypeAdapter p1,Type p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public Object read(a p0){
       return this.b.read(p0);
    }
    public void write(b p0,Object p1){
       TypeAdapterRuntimeTypeWrapper tb = this.b;
       TypeAdapterRuntimeTypeWrapper tc = this.c;
       if (p1 != null && (tc != Object.class && (tc instanceof TypeVariable || tc instanceof Class))) {
          tc = p1.getClass();
       }
       if (tc != this.c) {
          tb = this.a.j(a.get(tc));
          if (tb instanceof ReflectiveTypeAdapterFactory$Adapter) {
             tc = this.b;
             if (!tc instanceof ReflectiveTypeAdapterFactory$Adapter) {
                tb = tc;
             }
          }
       }
       tb.write(p0, p1);
       return;
    }
}
