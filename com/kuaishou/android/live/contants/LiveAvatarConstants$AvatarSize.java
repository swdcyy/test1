package com.kuaishou.android.live.contants.LiveAvatarConstants$AvatarSize;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAvatarConstants$AvatarSize extends Enum	// class@0007c2
{
    public final int mDefaultSize;
    public static final LiveAvatarConstants$AvatarSize[] $VALUES;
    public static final LiveAvatarConstants$AvatarSize BIG;
    public static final LiveAvatarConstants$AvatarSize EXTRA_BIG;
    public static final LiveAvatarConstants$AvatarSize MIDDLE;
    public static final LiveAvatarConstants$AvatarSize SMALL;

    static {
       LiveAvatarConstants$AvatarSize uAvatarSize = new LiveAvatarConstants$AvatarSize("SMALL", 0, 60);
       LiveAvatarConstants$AvatarSize.SMALL = uAvatarSize;
       LiveAvatarConstants$AvatarSize uAvatarSize1 = new LiveAvatarConstants$AvatarSize("MIDDLE", 1, 90);
       LiveAvatarConstants$AvatarSize.MIDDLE = uAvatarSize1;
       LiveAvatarConstants$AvatarSize uAvatarSize2 = new LiveAvatarConstants$AvatarSize("BIG", 2, 200);
       LiveAvatarConstants$AvatarSize.BIG = uAvatarSize2;
       LiveAvatarConstants$AvatarSize uAvatarSize3 = new LiveAvatarConstants$AvatarSize("EXTRA_BIG", 3, 300);
       LiveAvatarConstants$AvatarSize.EXTRA_BIG = uAvatarSize3;
       LiveAvatarConstants$AvatarSize[] uAvatarSizeA = new LiveAvatarConstants$AvatarSize[]{uAvatarSize,uAvatarSize1,uAvatarSize2,uAvatarSize3};
       LiveAvatarConstants$AvatarSize.$VALUES = uAvatarSizeA;
    }
    public void LiveAvatarConstants$AvatarSize(String p0,int p1,int p2){
       super(p0, p1);
       this.mDefaultSize = p2;
    }
    public static LiveAvatarConstants$AvatarSize valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAvatarConstants$AvatarSize.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAvatarConstants$AvatarSize.class, p0);
    }
    public static LiveAvatarConstants$AvatarSize[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAvatarConstants$AvatarSize.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAvatarConstants$AvatarSize.$VALUES.clone();
    }
    public int getSize(){
       return this.mDefaultSize;
    }
}
