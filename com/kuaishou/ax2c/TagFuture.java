package com.kuaishou.ax2c.TagFuture;
import java.util.concurrent.FutureTask;
import java.lang.Runnable;
import java.lang.Object;
import java.util.concurrent.Callable;

public class TagFuture extends FutureTask	// class@000fc2
{
    public String mTag;

    public void TagFuture(Runnable p0,Object p1){
       super(p0, p1);
    }
    public void TagFuture(Callable p0){
       super(p0);
    }
}
