package com.kuaishou.live.core.show.activityredpacket.mvvm.viewbinding.LiveActivityRedPacketFragmentViewBinding$bindViewModel$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOutsideBottomTipView;
import java.util.Objects;
import d61.k;
import java.lang.Integer;

public final class LiveActivityRedPacketFragmentViewBinding$bindViewModel$2 extends Lambda implements l	// class@000964
{
    public static final LiveActivityRedPacketFragmentViewBinding$bindViewModel$2 INSTANCE;

    static {
       LiveActivityRedPacketFragmentViewBinding$bindViewModel$2.INSTANCE = new LiveActivityRedPacketFragmentViewBinding$bindViewModel$2();
    }
    public void LiveActivityRedPacketFragmentViewBinding$bindViewModel$2(){
       super(1);
    }
    public final int invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketFragmentViewBinding$bindViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "it");
       Objects.requireNonNull(LiveActivityRedPacketOutsideBottomTipView.k);
       return k.c(p0, LiveActivityRedPacketOutsideBottomTipView.h);
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
