package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel$tagVisibility$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveAudienceMultiLineArenaLineOrderTagViewModel$tagVisibility$1 extends Lambda implements p	// class@00150b
{
    public static final LiveAudienceMultiLineArenaLineOrderTagViewModel$tagVisibility$1 INSTANCE;

    static {
       LiveAudienceMultiLineArenaLineOrderTagViewModel$tagVisibility$1.INSTANCE = new LiveAudienceMultiLineArenaLineOrderTagViewModel$tagVisibility$1();
    }
    public void LiveAudienceMultiLineArenaLineOrderTagViewModel$tagVisibility$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0, p1));
    }
    public final boolean invoke(String p0,LiveMultiLineArenaLiveState p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveAudienceMultiLineArenaLineOrderTagViewModel$tagVisibility$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "text");
       boolean b = (!TextUtils.x(p0) && p1 == LiveMultiLineArenaLiveState.SHOWING)? true: false;
       return b;
    }
}
