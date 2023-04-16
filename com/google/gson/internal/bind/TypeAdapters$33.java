package com.google.gson.internal.bind.TypeAdapters$33;
import zk.j;
import java.lang.Class;
import com.google.gson.TypeAdapter;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import java.lang.String;
import java.lang.StringBuilder;

public class TypeAdapters$33 implements j	// class@0005a4
{
    public final Class b;
    public final Class c;
    public final TypeAdapter d;

    public void TypeAdapters$33(Class p0,Class p1,TypeAdapter p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Class rawType = p1.getRawType();
       TypeAdapters$33 td = (rawType == this.b || rawType == this.c)? this.d: null;
       return td;
    }
    public String toString(){
       return "Factory[type="+this.c.getName()+"+"+this.b.getName()+",adapter="+this.d+"]";
    }
}
