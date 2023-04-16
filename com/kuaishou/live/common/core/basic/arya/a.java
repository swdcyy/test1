package com.kuaishou.live.common.core.basic.arya.a;
import com.kwai.video.krtc.AryaInitConfig$AryaSoLoader;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.v0;

public final class a implements AryaInitConfig$AryaSoLoader	// class@000e72
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void loadLibrary(String p0){
       LiveLogTag lIVE_ARYA_SO = LiveLogTag.LIVE_ARYA_SO_LOAD;
       b.Z(lIVE_ARYA_SO, "direct load arya5 so "+p0);
       lIVE_ARYA_SO.b(p0);
    }
}
