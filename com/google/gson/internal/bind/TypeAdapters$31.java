package com.google.gson.internal.bind.TypeAdapters$31;
import zk.j;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Object;
import com.google.gson.Gson;

public class TypeAdapters$31 implements j	// class@0005a2
{
    public final a b;
    public final TypeAdapter c;

    public void TypeAdapters$31(a p0,TypeAdapter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       TypeAdapters$31 tc = (p1.equals(this.b))? this.c: null;
       return tc;
    }
}
