package com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$ScrollSpeed;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCommentLinearLayoutManager$ScrollSpeed extends Enum	// class@000e47
{
    public static final LiveCommentLinearLayoutManager$ScrollSpeed[] $VALUES;
    public static final LiveCommentLinearLayoutManager$ScrollSpeed IMMEDIATELY;
    public static final LiveCommentLinearLayoutManager$ScrollSpeed NORMAL;
    public static final LiveCommentLinearLayoutManager$ScrollSpeed SLOW;

    static {
       LiveCommentLinearLayoutManager$ScrollSpeed scrollSpeed = new LiveCommentLinearLayoutManager$ScrollSpeed("IMMEDIATELY", 0);
       LiveCommentLinearLayoutManager$ScrollSpeed.IMMEDIATELY = scrollSpeed;
       LiveCommentLinearLayoutManager$ScrollSpeed scrollSpeed1 = new LiveCommentLinearLayoutManager$ScrollSpeed("NORMAL", 1);
       LiveCommentLinearLayoutManager$ScrollSpeed.NORMAL = scrollSpeed1;
       LiveCommentLinearLayoutManager$ScrollSpeed scrollSpeed2 = new LiveCommentLinearLayoutManager$ScrollSpeed("SLOW", 2);
       LiveCommentLinearLayoutManager$ScrollSpeed.SLOW = scrollSpeed2;
       LiveCommentLinearLayoutManager$ScrollSpeed[] scrollSpeedA = new LiveCommentLinearLayoutManager$ScrollSpeed[]{scrollSpeed,scrollSpeed1,scrollSpeed2};
       LiveCommentLinearLayoutManager$ScrollSpeed.$VALUES = scrollSpeedA;
    }
    public void LiveCommentLinearLayoutManager$ScrollSpeed(String p0,int p1){
       super(p0, p1);
    }
    public static LiveCommentLinearLayoutManager$ScrollSpeed valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommentLinearLayoutManager$ScrollSpeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommentLinearLayoutManager$ScrollSpeed.class, p0);
    }
    public static LiveCommentLinearLayoutManager$ScrollSpeed[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommentLinearLayoutManager$ScrollSpeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommentLinearLayoutManager$ScrollSpeed.$VALUES.clone();
    }
}
