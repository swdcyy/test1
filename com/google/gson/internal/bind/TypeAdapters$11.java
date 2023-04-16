package com.google.gson.internal.bind.TypeAdapters$11;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.Long;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public class TypeAdapters$11 extends TypeAdapter	// class@00058b
{

    public void TypeAdapters$11(){
       super();
    }
    public Object read(a p0){
       Long longx;
       try{
          if (p0.J() == JsonToken.NULL) {
             p0.A();
             longx = null;
          }else {
             longx = Long.valueOf(p0.x());
          }
          return longx;
       }catch(java.lang.NumberFormatException e3){
          throw new JsonSyntaxException(e3);
       }
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
