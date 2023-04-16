package com.yxcorp.gifshow.v3.mixed.timeline.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class b implements g	// class@001564
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("MixTimeline", "mDragStatus", p0);
    }
}
