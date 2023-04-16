package com.google.gson.internal.bind.TypeAdapters$18;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.math.BigInteger;
import java.lang.String;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public class TypeAdapters$18 extends TypeAdapter	// class@000592
{

    public void TypeAdapters$18(){
       super();
    }
    public Object read(a p0){
       BigInteger uBigInteger;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uBigInteger = null;
       }else {
          try{
             uBigInteger = new BigInteger(p0.E());
          }catch(java.lang.NumberFormatException e3){
             throw new JsonSyntaxException(e3);
          }
       }
       return uBigInteger;
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
