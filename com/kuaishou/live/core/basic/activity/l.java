package com.kuaishou.live.core.basic.activity.l;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;

public final class l implements Runnable	// class@001844
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final void run(){
       LiveResourceFileUtil.e();
    }
}
