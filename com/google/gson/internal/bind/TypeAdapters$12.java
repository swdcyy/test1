package com.google.gson.internal.bind.TypeAdapters$12;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.Float;
import com.google.gson.stream.b;
import java.lang.Number;

public class TypeAdapters$12 extends TypeAdapter	// class@00058c
{

    public void TypeAdapters$12(){
       super();
    }
    public Object read(a p0){
       Float uFloat;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uFloat = null;
       }else {
          uFloat = Float.valueOf((float)p0.u());
       }
       return uFloat;
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
