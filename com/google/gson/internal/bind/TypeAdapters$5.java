package com.google.gson.internal.bind.TypeAdapters$5;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.Byte;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public class TypeAdapters$5 extends TypeAdapter	// class@0005aa
{

    public void TypeAdapters$5(){
       super();
    }
    public Object read(a p0){
       Byte uByte;
       try{
          if (p0.J() == JsonToken.NULL) {
             p0.A();
             uByte = null;
          }else {
             uByte = Byte.valueOf((byte)p0.v());
          }
          return uByte;
       }catch(java.lang.NumberFormatException e3){
          throw new JsonSyntaxException(e3);
       }
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
