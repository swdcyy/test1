package com.google.gson.Gson$2;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.Float;
import com.google.gson.stream.b;
import java.lang.Number;

public class Gson$2 extends TypeAdapter	// class@00054e
{
    public final Gson a;

    public void Gson$2(Gson p0){
       this.a = p0;
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
       if (p1 == null) {
          p0.u();
       }else {
          Gson.b((double)p1.floatValue());
          p0.M(p1);
       }
       return;
    }
}
