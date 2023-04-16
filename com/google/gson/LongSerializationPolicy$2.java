package com.google.gson.LongSerializationPolicy$2;
import com.google.gson.LongSerializationPolicy;
import java.lang.String;
import com.google.gson.LongSerializationPolicy$1;
import java.lang.Long;
import com.google.gson.JsonElement;
import zk.g;
import java.lang.Object;

public final class LongSerializationPolicy$2 extends LongSerializationPolicy	// class@00055b
{

    public void LongSerializationPolicy$2(String p0,int p1){
       super(p0, p1, null);
    }
    public JsonElement serialize(Long p0){
       return new g(String.valueOf(p0));
    }
}
