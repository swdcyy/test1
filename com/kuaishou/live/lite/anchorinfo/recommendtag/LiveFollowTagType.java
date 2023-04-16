package com.kuaishou.live.lite.anchorinfo.recommendtag.LiveFollowTagType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LiveFollowTagType extends Enum	// class@001e6d
{
    public final int mTagType;
    public static final LiveFollowTagType[] $VALUES;
    public static final LiveFollowTagType FAN_GROUP;
    public static final LiveFollowTagType SPECIAL_FOLLOW;
    public static final LiveFollowTagType YOUR_FOLLOW;
    public static final LiveFollowTagType YOUR_FRIEND;

    static {
       LiveFollowTagType liveFollowTa = new LiveFollowTagType("FAN_GROUP", 0, 1);
       LiveFollowTagType.FAN_GROUP = liveFollowTa;
       LiveFollowTagType liveFollowTa1 = new LiveFollowTagType("YOUR_FOLLOW", 1, 2);
       LiveFollowTagType.YOUR_FOLLOW = liveFollowTa1;
       LiveFollowTagType liveFollowTa2 = new LiveFollowTagType("YOUR_FRIEND", 2, 12);
       LiveFollowTagType.YOUR_FRIEND = liveFollowTa2;
       LiveFollowTagType liveFollowTa3 = new LiveFollowTagType("SPECIAL_FOLLOW", 3, 13);
       LiveFollowTagType.SPECIAL_FOLLOW = liveFollowTa3;
       LiveFollowTagType[] liveFollowTa4 = new LiveFollowTagType[]{liveFollowTa,liveFollowTa1,liveFollowTa2,liveFollowTa3};
       LiveFollowTagType.$VALUES = liveFollowTa4;
    }
    public void LiveFollowTagType(String p0,int p1,int p2){
       super(p0, p1);
       this.mTagType = p2;
    }
    public static boolean isFollowTags(int p0){
       LiveFollowTagType[] obj;
       LiveFollowTagType liveFollowTa = LiveFollowTagType.class;
       if (PatchProxy.isSupport(liveFollowTa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, liveFollowTa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = LiveFollowTagType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (obj[i].value() == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static LiveFollowTagType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveFollowTagType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveFollowTagType.class, p0);
    }
    public static LiveFollowTagType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveFollowTagType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveFollowTagType.$VALUES.clone();
    }
    public int value(){
       return this.mTagType;
    }
}
