package com.google.gson.internal.bind.c;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.String;
import java.lang.reflect.Field;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import el.a;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.b;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import java.lang.reflect.Type;

public class c extends ReflectiveTypeAdapterFactory$a	// class@0005b5
{
    public final Field d;
    public final boolean e;
    public final TypeAdapter f;
    public final Gson g;
    public final a h;
    public final boolean i;
    public final ReflectiveTypeAdapterFactory j;

    public void c(ReflectiveTypeAdapterFactory p0,String p1,boolean p2,boolean p3,Field p4,boolean p5,TypeAdapter p6,Gson p7,a p8,boolean p9){
       this.j = p0;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       this.i = p9;
       super(p1, p2, p3);
    }
    public void a(a p0,Object p1){
       p0 = this.f.read(p0);
       if (p0 != null || this.i == null) {
          this.d.set(p1, p0);
       }
       return;
    }
    public void b(b p0,Object p1){
       p1 = this.d.get(p1);
       c tf = (this.e != null)? this.f: new TypeAdapterRuntimeTypeWrapper(this.g, this.f, this.h.getType());
       tf.write(p0, p1);
       return;
    }
    public boolean c(Object p0){
       boolean b = false;
       if (this.b == null) {
          return b;
       }
       if (this.d.get(p0) != p0) {
          b = true;
       }
       return b;
    }
}
