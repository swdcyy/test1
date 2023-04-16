package com.kuaishou.live.core.show.activityredpacket.mvvm.viewbinding.LiveActivityRedPacketFragmentPrepareOpenViewBinding$bindViewModel$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabBottomTipView;
import java.util.Objects;
import d61.k;
import java.lang.Integer;

public final class LiveActivityRedPacketFragmentPrepareOpenViewBinding$bindViewModel$1 extends Lambda implements l	// class@000963
{
    public static final LiveActivityRedPacketFragmentPrepareOpenViewBinding$bindViewModel$1 INSTANCE;

    static {
       LiveActivityRedPacketFragmentPrepareOpenViewBinding$bindViewModel$1.INSTANCE = new LiveActivityRedPacketFragmentPrepareOpenViewBinding$bindViewModel$1();
    }
    public void LiveActivityRedPacketFragmentPrepareOpenViewBinding$bindViewModel$1(){
       super(1);
    }
    public final int invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketFragmentPrepareOpenViewBinding$bindViewModel$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "it");
       Objects.requireNonNull(LiveActivityRedPacketGrabBottomTipView.j);
       return k.c(p0, LiveActivityRedPacketGrabBottomTipView.g);
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
