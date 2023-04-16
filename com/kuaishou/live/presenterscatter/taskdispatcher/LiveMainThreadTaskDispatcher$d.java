package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$d;
import pp.c;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveMainThreadTaskDispatcher$d implements c	// class@000d73
{
    public static final LiveMainThreadTaskDispatcher$d b;

    static {
       LiveMainThreadTaskDispatcher$d.b = new LiveMainThreadTaskDispatcher$d();
    }
    public void LiveMainThreadTaskDispatcher$d(){
       super();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       return "LiveMainThreadTaskDispatcher";
    }
}
