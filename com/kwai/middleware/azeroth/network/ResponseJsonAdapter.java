package com.kwai.middleware.azeroth.network.ResponseJsonAdapter;
import com.google.gson.b;
import zk.i;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.google.gson.JsonObject;
import java.lang.reflect.ParameterizedType;
import java.lang.String;
import ca7.l;
import x97.p;
import zk.h;
import java.lang.RuntimeException;

public class ResponseJsonAdapter implements b, i	// class@000d5a
{

    public void ResponseJsonAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       object oobject = p1.getActualTypeArguments()[0];
       int i = l.b(p0, "result", 0);
       String str = l.c(p0, "error_msg", null);
       JsonElement jsonElement = l.a(p0, "data");
       if (jsonElement == null) {
       }else {
          p0 = jsonElement;
       }
       String str1 = (oobject == String.class)? p0.toString(): p2.c(p0, oobject);
       return new p(str1, i, str);
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       throw new RuntimeException("Response can\'t to json");
    }
}
