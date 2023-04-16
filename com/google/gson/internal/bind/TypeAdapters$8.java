package com.google.gson.internal.bind.TypeAdapters$8;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;

public class TypeAdapters$8 extends TypeAdapter	// class@0005ad
{

    public void TypeAdapters$8(){
       super();
    }
    public Object read(a p0){
       try{
          return new AtomicInteger(p0.v());
       }catch(java.lang.NumberFormatException e2){
          throw new JsonSyntaxException(e2);
       }
    }
    public void write(b p0,Object p1){
       p0.K((long)p1.get());
    }
}
