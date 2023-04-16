package com.kuaishou.live.common.core.component.share.LiveShareSubBiz$AnchorSubBiz;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveShareSubBiz$AnchorSubBiz extends Enum implements LiveShareSubBiz	// class@001772
{
    public String mValue;
    public static final LiveShareSubBiz$AnchorSubBiz[] $VALUES;
    public static final LiveShareSubBiz$AnchorSubBiz COURSE_LIVE;
    public static final LiveShareSubBiz$AnchorSubBiz NORMAL_LIVE;

    static {
       LiveShareSubBiz$AnchorSubBiz uAnchorSubBi = new LiveShareSubBiz$AnchorSubBiz("COURSE_LIVE", 0, "LIVE_STREAM_COURSE");
       LiveShareSubBiz$AnchorSubBiz.COURSE_LIVE = uAnchorSubBi;
       LiveShareSubBiz$AnchorSubBiz uAnchorSubBi1 = new LiveShareSubBiz$AnchorSubBiz("NORMAL_LIVE", 1, "LIVE_STREAM");
       LiveShareSubBiz$AnchorSubBiz.NORMAL_LIVE = uAnchorSubBi1;
       LiveShareSubBiz$AnchorSubBiz[] uAnchorSubBi2 = new LiveShareSubBiz$AnchorSubBiz[]{uAnchorSubBi,uAnchorSubBi1};
       LiveShareSubBiz$AnchorSubBiz.$VALUES = uAnchorSubBi2;
    }
    public void LiveShareSubBiz$AnchorSubBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveShareSubBiz$AnchorSubBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveShareSubBiz$AnchorSubBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveShareSubBiz$AnchorSubBiz.class, p0);
    }
    public static LiveShareSubBiz$AnchorSubBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LiveShareSubBiz$AnchorSubBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveShareSubBiz$AnchorSubBiz.$VALUES.clone();
    }
    public String getValue(){
       return this.mValue;
    }
}
