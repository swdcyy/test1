package com.google.gson.Gson$1;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.Double;
import com.google.gson.stream.b;
import java.lang.Number;

public class Gson$1 extends TypeAdapter	// class@00054d
{
    public final Gson a;

    public void Gson$1(Gson p0){
       this.a = p0;
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
       if (p1 == null) {
          p0.u();
       }else {
          Gson.b(p1.doubleValue());
          p0.M(p1);
       }
       return;
    }
}
