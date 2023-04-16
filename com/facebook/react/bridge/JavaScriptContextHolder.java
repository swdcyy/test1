package com.facebook.react.bridge.JavaScriptContextHolder;
import java.lang.Object;

public class JavaScriptContextHolder	// class@0011f6
{
    public long mContext;

    public void JavaScriptContextHolder(long p0){
       super();
       this.mContext = p0;
    }
    public synchronized void clear(){
       this.mContext = 0;
    }
    public long get(){
       return this.mContext;
    }
}
