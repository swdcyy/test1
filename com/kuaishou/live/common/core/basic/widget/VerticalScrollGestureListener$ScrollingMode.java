package com.kuaishou.live.common.core.basic.widget.VerticalScrollGestureListener$ScrollingMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VerticalScrollGestureListener$ScrollingMode extends Enum	// class@000f36
{
    public static final VerticalScrollGestureListener$ScrollingMode[] $VALUES;
    public static final VerticalScrollGestureListener$ScrollingMode HORIZONTAL;
    public static final VerticalScrollGestureListener$ScrollingMode NONE;
    public static final VerticalScrollGestureListener$ScrollingMode VERTICAL;

    static {
       VerticalScrollGestureListener$ScrollingMode scrollingMod = new VerticalScrollGestureListener$ScrollingMode("NONE", 0);
       VerticalScrollGestureListener$ScrollingMode.NONE = scrollingMod;
       VerticalScrollGestureListener$ScrollingMode scrollingMod1 = new VerticalScrollGestureListener$ScrollingMode("VERTICAL", 1);
       VerticalScrollGestureListener$ScrollingMode.VERTICAL = scrollingMod1;
       VerticalScrollGestureListener$ScrollingMode scrollingMod2 = new VerticalScrollGestureListener$ScrollingMode("HORIZONTAL", 2);
       VerticalScrollGestureListener$ScrollingMode.HORIZONTAL = scrollingMod2;
       VerticalScrollGestureListener$ScrollingMode[] scrollingMod3 = new VerticalScrollGestureListener$ScrollingMode[]{scrollingMod,scrollingMod1,scrollingMod2};
       VerticalScrollGestureListener$ScrollingMode.$VALUES = scrollingMod3;
    }
    public void VerticalScrollGestureListener$ScrollingMode(String p0,int p1){
       super(p0, p1);
    }
    public static VerticalScrollGestureListener$ScrollingMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VerticalScrollGestureListener$ScrollingMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VerticalScrollGestureListener$ScrollingMode.class, p0);
    }
    public static VerticalScrollGestureListener$ScrollingMode[] values(){
       Object obj = PatchProxy.apply(null, null, VerticalScrollGestureListener$ScrollingMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VerticalScrollGestureListener$ScrollingMode.$VALUES.clone();
    }
}
