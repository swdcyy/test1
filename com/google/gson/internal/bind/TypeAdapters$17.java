package com.google.gson.internal.bind.TypeAdapters$17;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.lang.String;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public class TypeAdapters$17 extends TypeAdapter	// class@000591
{

    public void TypeAdapters$17(){
       super();
    }
    public Object read(a p0){
       BigDecimal uBigDecimal;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uBigDecimal = null;
       }else {
          try{
             uBigDecimal = new BigDecimal(p0.E());
          }catch(java.lang.NumberFormatException e3){
             throw new JsonSyntaxException(e3);
          }
       }
       return uBigDecimal;
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
