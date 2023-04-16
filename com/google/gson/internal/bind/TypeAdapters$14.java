package com.google.gson.internal.bind.TypeAdapters$14;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import com.google.gson.internal.bind.TypeAdapters$a;
import java.lang.Enum;
import com.google.gson.JsonSyntaxException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.b;
import java.lang.Number;

public class TypeAdapters$14 extends TypeAdapter	// class@00058e
{

    public void TypeAdapters$14(){
       super();
    }
    public Object read(a p0){
       LazilyParsedNumber lazilyParsed;
       JsonToken jsonToken = p0.J();
       int i = TypeAdapters$a.a[jsonToken.ordinal()];
       if (i != 1 && i != 3) {
          if (i == 4) {
             p0.A();
             lazilyParsed = null;
          }else {
             throw new JsonSyntaxException("Expecting number, got: "+jsonToken);
          }
       }else {
          lazilyParsed = new LazilyParsedNumber(p0.E());
       }
       return lazilyParsed;
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
