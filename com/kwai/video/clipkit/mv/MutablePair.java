package com.kwai.video.clipkit.mv.MutablePair;
import java.lang.Object;

public class MutablePair	// class@001acb
{
    public Object mFirst;
    public Object mSecond;

    public void MutablePair(Object p0,Object p1){
       super();
       this.mFirst = p0;
       this.mSecond = p1;
    }
    public Object getFirst(){
       return this.mFirst;
    }
    public Object getSecond(){
       return this.mSecond;
    }
    public void setFirst(Object p0){
       this.mFirst = p0;
    }
    public void setSecond(Object p0){
       this.mSecond = p0;
    }
}
