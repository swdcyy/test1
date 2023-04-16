package com.google.gson.internal.bind.TypeAdapters$3;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.lang.Boolean;
import com.google.gson.stream.b;

public class TypeAdapters$3 extends TypeAdapter	// class@0005a8
{

    public void TypeAdapters$3(){
       super();
    }
    public Object read(a p0){
       Boolean uBoolean;
       JsonToken jsonToken = p0.J();
       if (jsonToken == JsonToken.NULL) {
          p0.A();
          uBoolean = null;
       }else if(jsonToken == JsonToken.STRING){
          uBoolean = Boolean.valueOf(Boolean.parseBoolean(p0.E()));
       }else {
          uBoolean = Boolean.valueOf(p0.s());
       }
       return uBoolean;
    }
    public void write(b p0,Object p1){
       p0.L(p1);
    }
}
