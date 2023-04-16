package com.kwai.live.gzone.floatbar.LivePlayerFloatItem;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayerFloatItem extends Enum	// class@000cf4
{
    public final int mLayoutResId;
    public final boolean mShouldGoneWhenContainerHide;
    public final boolean mShowInVerticalVideo;
    public static final LivePlayerFloatItem[] $VALUES;
    public static final LivePlayerFloatItem ACTIVE_ORIENTATION;
    public static final LivePlayerFloatItem COMPETITION_DIVERSION;
    public static final LivePlayerFloatItem COMPETITION_TITLE;
    public static final LivePlayerFloatItem QUALITY;

    static {
       LivePlayerFloatItem livePlayerFl = new LivePlayerFloatItem("QUALITY", 0, 0x7f0a2329, false, false);
       LivePlayerFloatItem.QUALITY = v6;
       LivePlayerFloatItem livePlayerFl1 = new LivePlayerFloatItem("ACTIVE_ORIENTATION", 1, 0x7f0a2328, false, false);
       LivePlayerFloatItem.ACTIVE_ORIENTATION = livePlayerFl;
       LivePlayerFloatItem livePlayerFl2 = new LivePlayerFloatItem("COMPETITION_DIVERSION", 2, 0x7f0a1ec0, false, true);
       LivePlayerFloatItem.COMPETITION_DIVERSION = v1;
       livePlayerFl1 = new LivePlayerFloatItem("COMPETITION_TITLE", 3, 0x7f0a1ecd, false, true);
       LivePlayerFloatItem.COMPETITION_TITLE = v2;
       LivePlayerFloatItem[] livePlayerFl3 = new LivePlayerFloatItem[]{v6,livePlayerFl,v1,v2};
       LivePlayerFloatItem.$VALUES = livePlayerFl3;
    }
    public void LivePlayerFloatItem(String p0,int p1,int p2,boolean p3,boolean p4){
       super(p0, p1);
       this.mLayoutResId = p2;
       this.mShowInVerticalVideo = p3;
       this.mShouldGoneWhenContainerHide = p4;
    }
    public static LivePlayerFloatItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerFloatItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayerFloatItem.class, p0);
    }
    public static LivePlayerFloatItem[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayerFloatItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayerFloatItem.$VALUES.clone();
    }
    public int getLayoutResId(){
       return this.mLayoutResId;
    }
    public boolean shouldGoneWhenContainerHide(){
       return this.mShouldGoneWhenContainerHide;
    }
    public boolean showInVerticalVideo(){
       return this.mShowInVerticalVideo;
    }
}
