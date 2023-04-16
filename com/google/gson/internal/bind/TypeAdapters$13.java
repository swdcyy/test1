package com.google.gson.internal.bind.TypeAdapters$13;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.Double;
import com.google.gson.stream.b;
import java.lang.Number;

public class TypeAdapters$13 extends TypeAdapter	// class@00058d
{

    public void TypeAdapters$13(){
       super();
    }
    public Object read(a p0){
       Double uDouble;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uDouble = null;
       }else {
          uDouble = Double.valueOf(p0.u());
       }
       return uDouble;
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
