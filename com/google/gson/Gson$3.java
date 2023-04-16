package com.google.gson.Gson$3;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.Long;
import com.google.gson.stream.b;
import java.lang.Number;
import java.lang.String;

public class Gson$3 extends TypeAdapter	// class@00054f
{

    public void Gson$3(){
       super();
    }
    public Object read(a p0){
       Long longx;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          longx = null;
       }else {
          longx = Long.valueOf(p0.x());
       }
       return longx;
    }
    public void write(b p0,Object p1){
       if (p1 == null) {
          p0.u();
       }else {
          p0.O(p1.toString());
       }
       return;
    }
}
