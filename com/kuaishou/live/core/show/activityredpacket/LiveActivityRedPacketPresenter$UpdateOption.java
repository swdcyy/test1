package com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$UpdateOption;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveActivityRedPacketPresenter$UpdateOption extends Enum	// class@000931
{
    public static final LiveActivityRedPacketPresenter$UpdateOption[] $VALUES;
    public static final LiveActivityRedPacketPresenter$UpdateOption ADD;
    public static final LiveActivityRedPacketPresenter$UpdateOption REMOVE;

    static {
       LiveActivityRedPacketPresenter$UpdateOption updateOption = new LiveActivityRedPacketPresenter$UpdateOption("ADD", 0);
       LiveActivityRedPacketPresenter$UpdateOption.ADD = updateOption;
       LiveActivityRedPacketPresenter$UpdateOption updateOption1 = new LiveActivityRedPacketPresenter$UpdateOption("REMOVE", 1);
       LiveActivityRedPacketPresenter$UpdateOption.REMOVE = updateOption1;
       LiveActivityRedPacketPresenter$UpdateOption[] updateOption2 = new LiveActivityRedPacketPresenter$UpdateOption[]{updateOption,updateOption1};
       LiveActivityRedPacketPresenter$UpdateOption.$VALUES = updateOption2;
    }
    public void LiveActivityRedPacketPresenter$UpdateOption(String p0,int p1){
       super(p0, p1);
    }
    public static LiveActivityRedPacketPresenter$UpdateOption valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveActivityRedPacketPresenter$UpdateOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveActivityRedPacketPresenter$UpdateOption.class, p0);
    }
    public static LiveActivityRedPacketPresenter$UpdateOption[] values(){
       Object obj = PatchProxy.apply(null, null, LiveActivityRedPacketPresenter$UpdateOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveActivityRedPacketPresenter$UpdateOption.$VALUES.clone();
    }
}
