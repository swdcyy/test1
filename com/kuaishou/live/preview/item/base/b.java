package com.kuaishou.live.preview.item.base.b;
import d61.k0$a;
import java.lang.Object;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.live.preview.item.base.LiveGrootPreviewBaseFragment;
import java.lang.Long;

public final class b implements k0$a	// class@000d7c
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final Object get(Object p0){
       return Long.valueOf(p0.mFeedDispatchTimestampMs);
    }
}
