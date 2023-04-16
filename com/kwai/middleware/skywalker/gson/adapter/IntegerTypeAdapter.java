package com.kwai.middleware.skywalker.gson.adapter.IntegerTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Integer;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import kotlin.jvm.internal.a;
import zsd.u;
import com.google.gson.stream.b;
import java.lang.Number;

public final class IntegerTypeAdapter extends TypeAdapter	// class@000d78
{

    public void IntegerTypeAdapter(){
       super();
    }
    public Object read(a p0){
       try{
          Integer integer = Integer.valueOf(0);
          if (p0 == null) {
          }else if(p0.J() == JsonToken.NULL){
             String str = p0.E();
             if (a.g("", str) || (!u.I1("null", str, true) && !u.I1("0.0", str, true))) {
                a.h(str, "result");
                integer = Integer.valueOf(Integer.parseInt(str));
             }
          }
          return integer;
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
