package com.kuaishou.live.common.core.basic.arya.d;
import jw4.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager$LiveAryaWrongUsageException;
import d61.m;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class d implements d	// class@000e76
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void a(String p0,String p1,Throwable p2){
       if (p2 != null) {
          m.a(new LiveSnowManager$LiveAryaWrongUsageException(p2));
          LiveLogTag lIVE_ARYA_IN = LiveLogTag.LIVE_ARYA_INSTANCE_MANAGE;
          lIVE_ARYA_IN.appendTag(p0);
          b.y(lIVE_ARYA_IN, p1, p2);
       }else {
          LiveLogTag lIVE_ARYA_IN1 = LiveLogTag.LIVE_ARYA_INSTANCE_MANAGE;
          lIVE_ARYA_IN1.appendTag(p0);
          b.P(lIVE_ARYA_IN1, p1);
       }
       return;
    }
}
