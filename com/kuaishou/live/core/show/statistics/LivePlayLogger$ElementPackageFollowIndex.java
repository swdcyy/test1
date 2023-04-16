package com.kuaishou.live.core.show.statistics.LivePlayLogger$ElementPackageFollowIndex;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayLogger$ElementPackageFollowIndex extends Enum	// class@001092
{
    public static final LivePlayLogger$ElementPackageFollowIndex[] $VALUES;
    public static final LivePlayLogger$ElementPackageFollowIndex FOLLOW_LIVEPLAY_ANCHOR;
    public static final LivePlayLogger$ElementPackageFollowIndex FOLLOW_LIVEPLAY_EMPTY;
    public static final LivePlayLogger$ElementPackageFollowIndex FOLLOW_LIVEPLAY_PROFILE;
    public static final LivePlayLogger$ElementPackageFollowIndex FOLLOW_LIVEPLAY_REDPACKET;
    public static final LivePlayLogger$ElementPackageFollowIndex FOLLOW_LIVEPLAY_TOP;

    static {
       LivePlayLogger$ElementPackageFollowIndex uElementPack = new LivePlayLogger$ElementPackageFollowIndex("FOLLOW_LIVEPLAY_EMPTY", 0);
       LivePlayLogger$ElementPackageFollowIndex.FOLLOW_LIVEPLAY_EMPTY = uElementPack;
       LivePlayLogger$ElementPackageFollowIndex uElementPack1 = new LivePlayLogger$ElementPackageFollowIndex("FOLLOW_LIVEPLAY_TOP", 1);
       LivePlayLogger$ElementPackageFollowIndex.FOLLOW_LIVEPLAY_TOP = uElementPack1;
       LivePlayLogger$ElementPackageFollowIndex uElementPack2 = new LivePlayLogger$ElementPackageFollowIndex("FOLLOW_LIVEPLAY_PROFILE", 2);
       LivePlayLogger$ElementPackageFollowIndex.FOLLOW_LIVEPLAY_PROFILE = uElementPack2;
       LivePlayLogger$ElementPackageFollowIndex uElementPack3 = new LivePlayLogger$ElementPackageFollowIndex("FOLLOW_LIVEPLAY_ANCHOR", 3);
       LivePlayLogger$ElementPackageFollowIndex.FOLLOW_LIVEPLAY_ANCHOR = uElementPack3;
       LivePlayLogger$ElementPackageFollowIndex uElementPack4 = new LivePlayLogger$ElementPackageFollowIndex("FOLLOW_LIVEPLAY_REDPACKET", 4);
       LivePlayLogger$ElementPackageFollowIndex.FOLLOW_LIVEPLAY_REDPACKET = uElementPack4;
       LivePlayLogger$ElementPackageFollowIndex[] uElementPack5 = new LivePlayLogger$ElementPackageFollowIndex[]{uElementPack,uElementPack1,uElementPack2,uElementPack3,uElementPack4};
       LivePlayLogger$ElementPackageFollowIndex.$VALUES = uElementPack5;
    }
    public void LivePlayLogger$ElementPackageFollowIndex(String p0,int p1){
       super(p0, p1);
    }
    public static LivePlayLogger$ElementPackageFollowIndex valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayLogger$ElementPackageFollowIndex.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayLogger$ElementPackageFollowIndex.class, p0);
    }
    public static LivePlayLogger$ElementPackageFollowIndex[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayLogger$ElementPackageFollowIndex.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayLogger$ElementPackageFollowIndex.$VALUES.clone();
    }
}
