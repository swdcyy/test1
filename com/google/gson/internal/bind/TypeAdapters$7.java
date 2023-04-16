package com.google.gson.internal.bind.TypeAdapters$7;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.Integer;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public class TypeAdapters$7 extends TypeAdapter	// class@0005ac
{

    public void TypeAdapters$7(){
       super();
    }
    public Object read(a p0){
       Integer integer;
       try{
          if (p0.J() == JsonToken.NULL) {
             p0.A();
             integer = null;
          }else {
             integer = Integer.valueOf(p0.v());
          }
          return integer;
       }catch(java.lang.NumberFormatException e3){
          throw new JsonSyntaxException(e3);
       }
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
