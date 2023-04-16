package com.yxcorp.gifshow.util.CPU;
import java.lang.String;
import ekd.v0;
import java.lang.Object;
import android.content.Context;

public abstract class CPU	// class@001331
{

    static {
       "core".b("core");
    }
    public void CPU(){
       super();
    }
    public static native String getClock(Context p0,byte[] p1,int p2);
    public static native String getMagic(Context p0,int p1);
}
