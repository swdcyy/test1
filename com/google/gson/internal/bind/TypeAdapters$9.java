package com.google.gson.internal.bind.TypeAdapters$9;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.gson.stream.b;

public class TypeAdapters$9 extends TypeAdapter	// class@0005ae
{

    public void TypeAdapters$9(){
       super();
    }
    public Object read(a p0){
       return new AtomicBoolean(p0.s());
    }
    public void write(b p0,Object p1){
       p0.P(p1.get());
    }
}
