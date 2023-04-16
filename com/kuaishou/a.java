package com.kuaishou.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class a implements g	// class@000770
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("PostDiskManager", "triggerLowDiskMonitor\(\)", p0);
    }
}
