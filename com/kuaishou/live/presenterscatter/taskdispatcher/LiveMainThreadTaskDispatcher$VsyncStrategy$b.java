package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$b;
import pp.c;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveMainThreadTaskDispatcher$VsyncStrategy$b implements c	// class@000d69
{
    public static final LiveMainThreadTaskDispatcher$VsyncStrategy$b b;

    static {
       LiveMainThreadTaskDispatcher$VsyncStrategy$b.b = new LiveMainThreadTaskDispatcher$VsyncStrategy$b();
    }
    public void LiveMainThreadTaskDispatcher$VsyncStrategy$b(){
       super();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       return "LiveMainThreadTaskDispatcher.VsyncStrategy";
    }
}
