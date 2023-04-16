package com.yxcorp.retrofit.model.ResponseSerializer;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import java.lang.RuntimeException;
import java.lang.String;

public class ResponseSerializer implements i	// class@0013e4
{

    public void ResponseSerializer(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       throw new RuntimeException("Response can\'t to json");
    }
}
