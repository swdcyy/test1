package com.sina.weibo.sdk.a.c$c;
import java.lang.Comparable;
import java.util.concurrent.FutureTask;
import com.sina.weibo.sdk.a.c;
import com.sina.weibo.sdk.a.c$d;
import java.util.concurrent.Callable;

public abstract class c$c extends FutureTask implements Comparable	// class@000b95
{
    public final c Q;
    public int priority;

    public void c$c(c p0,c$d p1){
       this.Q = p0;
       super(p1);
       this.priority = p1.priority;
    }
}
