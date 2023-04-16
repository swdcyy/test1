package com.google.gson.internal.bind.TypeAdapters$16;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.lang.Boolean;
import com.google.gson.stream.b;

public class TypeAdapters$16 extends TypeAdapter	// class@000590
{

    public void TypeAdapters$16(){
       super();
    }
    public Object read(a p0){
       String str;
       JsonToken jsonToken = p0.J();
       if (jsonToken == JsonToken.NULL) {
          p0.A();
          str = null;
       }else if(jsonToken == JsonToken.BOOLEAN){
          str = Boolean.toString(p0.s());
       }else {
          str = p0.E();
       }
       return str;
    }
    public void write(b p0,Object p1){
       p0.O(p1);
    }
}
