package com.google.gson.internal.bind.TypeAdapters$32;
import zk.j;
import java.lang.Class;
import com.google.gson.TypeAdapter;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import java.lang.String;
import java.lang.StringBuilder;

public class TypeAdapters$32 implements j	// class@0005a3
{
    public final Class b;
    public final TypeAdapter c;

    public void TypeAdapters$32(Class p0,TypeAdapter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       TypeAdapters$32 tc = (p1.getRawType() == this.b)? this.c: null;
       return tc;
    }
    public String toString(){
       return "Factory[type="+this.b.getName()+",adapter="+this.c+"]";
    }
}
