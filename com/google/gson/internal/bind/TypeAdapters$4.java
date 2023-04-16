package com.google.gson.internal.bind.TypeAdapters$4;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.lang.Boolean;
import com.google.gson.stream.b;

public class TypeAdapters$4 extends TypeAdapter	// class@0005a9
{

    public void TypeAdapters$4(){
       super();
    }
    public Object read(a p0){
       Boolean uBoolean;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uBoolean = null;
       }else {
          uBoolean = Boolean.valueOf(p0.E());
       }
       return uBoolean;
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? "null": p1.toString();
       p0.O(p1);
       return;
    }
}
