package com.google.gson.internal.bind.TypeAdapters$20;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.StringBuffer;
import java.lang.String;
import com.google.gson.stream.b;

public class TypeAdapters$20 extends TypeAdapter	// class@000595
{

    public void TypeAdapters$20(){
       super();
    }
    public Object read(a p0){
       String str;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          str = null;
       }else {
          str = p0.E();
       }
       return str;
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? null: p1.toString();
       p0.O(p1);
       return;
    }
}
