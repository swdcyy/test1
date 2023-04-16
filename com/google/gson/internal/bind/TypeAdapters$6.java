package com.google.gson.internal.bind.TypeAdapters$6;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.Short;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public class TypeAdapters$6 extends TypeAdapter	// class@0005ab
{

    public void TypeAdapters$6(){
       super();
    }
    public Object read(a p0){
       Short shortx;
       try{
          if (p0.J() == JsonToken.NULL) {
             p0.A();
             shortx = null;
          }else {
             shortx = Short.valueOf((short)p0.v());
          }
          return shortx;
       }catch(java.lang.NumberFormatException e3){
          throw new JsonSyntaxException(e3);
       }
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
