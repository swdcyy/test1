package com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public final class KnownTypeAdapters$g	// class@000ffb
{

    public static boolean a(a p0,boolean p1){
       JsonToken jsonToken = p0.J();
       if (jsonToken == JsonToken.NULL) {
          p0.A();
          return p1;
       }else {
          boolean b = false;
          if (jsonToken == JsonToken.STRING) {
             String str = p0.E();
             if (("0").equals(str)) {
                return b;
             }else if(("1").equals(str)){
                return true;
             }else {
                return Boolean.parseBoolean(str);
             }
          }else if(jsonToken == JsonToken.NUMBER){
             if (p0.v() == 1) {
                b = true;
             }
             return b;
          }else {
             return p0.s();
          }
       }
    }
}
