package com.google.gson.LongSerializationPolicy;
import java.lang.Enum;
import com.google.gson.LongSerializationPolicy$1;
import java.lang.String;
import com.google.gson.LongSerializationPolicy$2;
import java.lang.Class;
import java.lang.Object;
import java.lang.Long;
import com.google.gson.JsonElement;

public abstract class LongSerializationPolicy extends Enum	// class@00055c
{
    public static final LongSerializationPolicy[] $VALUES;
    public static final LongSerializationPolicy DEFAULT;
    public static final LongSerializationPolicy STRING;

    static {
       LongSerializationPolicy$1 u1 = new LongSerializationPolicy$1("DEFAULT", 0);
       LongSerializationPolicy.DEFAULT = u1;
       LongSerializationPolicy$2 u2 = new LongSerializationPolicy$2("STRING", 1);
       LongSerializationPolicy.STRING = u2;
       LongSerializationPolicy[] longSerializ = new LongSerializationPolicy[]{u1,u2};
       LongSerializationPolicy.$VALUES = longSerializ;
    }
    public void LongSerializationPolicy(String p0,int p1){
       super(p0, p1);
    }
    public void LongSerializationPolicy(String p0,int p1,LongSerializationPolicy$1 p2){
       super(p0, p1);
    }
    public static LongSerializationPolicy valueOf(String p0){
       return Enum.valueOf(LongSerializationPolicy.class, p0);
    }
    public static LongSerializationPolicy[] values(){
       return LongSerializationPolicy.$VALUES.clone();
    }
    public abstract JsonElement serialize(Long p0);
}
