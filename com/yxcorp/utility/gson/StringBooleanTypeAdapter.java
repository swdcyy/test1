package com.yxcorp.utility.gson.StringBooleanTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.lang.Boolean;
import com.google.gson.stream.b;
import com.google.gson.internal.bind.TypeAdapters;

public class StringBooleanTypeAdapter extends TypeAdapter	// class@0009c4
{

    public void StringBooleanTypeAdapter(){
       super();
    }
    public Object read(a p0){
       Boolean uBoolean;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uBoolean = null;
       }else if(p0.J() == JsonToken.STRING){
          String str = p0.E();
          if (("0").equals(str)) {
             uBoolean = Boolean.FALSE;
          }else if(("1").equals(str)){
             uBoolean = Boolean.TRUE;
          }else {
             uBoolean = Boolean.valueOf(Boolean.parseBoolean(str));
          }
       }else if(p0.J() == JsonToken.NUMBER){
          boolean b = true;
          if (p0.v() != b) {
             b = false;
          }
          uBoolean = Boolean.valueOf(b);
       }else {
          uBoolean = Boolean.valueOf(p0.s());
       }
       return uBoolean;
    }
    public void write(b p0,Object p1){
       TypeAdapters.e.write(p0, p1);
    }
}
