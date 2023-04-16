package com.kwai.middleware.skywalker.gson.adapter.DoubleTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Double;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import kotlin.jvm.internal.a;
import zsd.u;
import com.google.gson.stream.b;
import java.lang.Number;

public final class DoubleTypeAdapter extends TypeAdapter	// class@000d77
{

    public void DoubleTypeAdapter(){
       super();
    }
    public Object read(a p0){
       try{
          Double uDouble = Double.valueOf(0);
          if (p0 == null) {
          }else if(p0.J() == JsonToken.NULL){
             String str = p0.E();
             if (!a.g("", str) && !u.I1("null", str, true)) {
                a.h(str, "result");
                uDouble = Double.valueOf(Double.parseDouble(str));
             }
          }
          return uDouble;
       }catch(java.lang.Exception e0){
       }
    }
    public void write(b p0,Object p1){
       if (p0 != null) {
          p0.M(p1);
       }
       return;
    }
}
