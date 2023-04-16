package com.kwai.video.aemonplayer.JavaAttrListJNI;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public abstract class JavaAttrListJNI	// class@0019cc
{

    public void JavaAttrListJNI(){
       super();
    }
    public abstract long native_Create();
    public abstract void native_Destory(long p0);
    public abstract byte[] native_GetByteArrayValue(long p0,String p1);
    public abstract byte[] native_GetByteArrayValueByCode(long p0,long p1);
    public abstract byte[] native_GetByteBufferValue(long p0,String p1);
    public abstract byte[] native_GetByteBufferValueByCode(long p0,long p1);
    public abstract float native_GetFloatValue(long p0,String p1);
    public abstract float native_GetFloatValueByCode(long p0,long p1);
    public abstract int native_GetIntValue(long p0,String p1);
    public abstract int native_GetIntValueByCode(long p0,long p1);
    public abstract long native_GetLongValue(long p0,String p1);
    public abstract long native_GetLongValueByCode(long p0,long p1);
    public abstract Object native_GetObjectValue(long p0,String p1);
    public abstract Object native_GetObjectValueByCode(long p0,long p1);
    public abstract HashMap native_GetStringCodeMap();
    public abstract String native_GetStringValue(long p0,String p1);
    public abstract String native_GetStringValueByCode(long p0,long p1);
    public abstract void native_SetByteBufferValue(long p0,String p1,byte[] p2);
    public abstract void native_SetByteBufferValueByCode(long p0,long p1,byte[] p2);
    public abstract void native_SetFloatValue(long p0,String p1,float p2);
    public abstract void native_SetFloatValueByCode(long p0,long p1,float p2);
    public abstract void native_SetInt64Value(long p0,String p1,long p2);
    public abstract void native_SetInt64ValueByCode(long p0,long p1,long p2);
    public abstract void native_SetIntValue(long p0,String p1,int p2);
    public abstract void native_SetIntValueByCode(long p0,long p1,int p2);
    public abstract void native_SetObjectValue(long p0,String p1,Object p2);
    public abstract void native_SetObjectValueByCode(long p0,long p1,Object p2);
    public abstract void native_SetStringValue(long p0,String p1,String p2);
    public abstract void native_SetStringValueByCode(long p0,long p1,String p2);
}
