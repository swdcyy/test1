package com.kuaishou.live.core.basic.liveslide.urihandler.LiveSlideUriHandler;
import com.kwai.platform.krouter.handler.activity.AbstractActivityHandler;
import xh7.b;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import xh7.a;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity;

public class LiveSlideUriHandler extends AbstractActivityHandler	// class@00083f
{

    public void LiveSlideUriHandler(){
       super();
    }
    public Intent e(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSlideUriHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.Z(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER, " Scheme use new live slide container!");
       return new Intent(p0.b(), LiveSlideActivity.u3());
    }
}
