package com.google.gson.LongSerializationPolicy$1;
import com.google.gson.LongSerializationPolicy;
import java.lang.String;
import java.lang.Long;
import com.google.gson.JsonElement;
import zk.g;
import java.lang.Number;

public final class LongSerializationPolicy$1 extends LongSerializationPolicy	// class@00055a
{

    public void LongSerializationPolicy$1(String p0,int p1){
       super(p0, p1, null);
    }
    public JsonElement serialize(Long p0){
       return new g(p0);
    }
}
