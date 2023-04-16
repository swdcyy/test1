package com.facebook.react.views.scroll.ScrollEventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.views.scroll.ScrollEventType$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class ScrollEventType extends Enum	// class@0013ec
{
    public static final ScrollEventType[] $VALUES;
    public static final ScrollEventType BEGIN_DRAG;
    public static final ScrollEventType END_DRAG;
    public static final ScrollEventType MOMENTUM_BEGIN;
    public static final ScrollEventType MOMENTUM_END;
    public static final ScrollEventType SCROLL;

    static {
       ScrollEventType scrollEventT = new ScrollEventType("BEGIN_DRAG", 0);
       ScrollEventType.BEGIN_DRAG = scrollEventT;
       ScrollEventType scrollEventT1 = new ScrollEventType("END_DRAG", 1);
       ScrollEventType.END_DRAG = scrollEventT1;
       ScrollEventType scrollEventT2 = new ScrollEventType("SCROLL", 2);
       ScrollEventType.SCROLL = scrollEventT2;
       ScrollEventType scrollEventT3 = new ScrollEventType("MOMENTUM_BEGIN", 3);
       ScrollEventType.MOMENTUM_BEGIN = scrollEventT3;
       ScrollEventType scrollEventT4 = new ScrollEventType("MOMENTUM_END", 4);
       ScrollEventType.MOMENTUM_END = scrollEventT4;
       ScrollEventType[] scrollEventT5 = new ScrollEventType[]{scrollEventT,scrollEventT1,scrollEventT2,scrollEventT3,scrollEventT4};
       ScrollEventType.$VALUES = scrollEventT5;
    }
    public void ScrollEventType(String p0,int p1){
       super(p0, p1);
    }
    public static String getJSEventName(ScrollEventType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ScrollEventType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = ScrollEventType$a.a[p0.ordinal()];
       if (i == 1) {
          return "topScrollBeginDrag";
       }
       if (i == 2) {
          return "topScrollEndDrag";
       }
       if (i == 3) {
          return "topScroll";
       }
       if (i == 4) {
          return "topMomentumScrollBegin";
       }
       if (i == 5) {
          return "topMomentumScrollEnd";
       }
       throw new IllegalArgumentException("Unsupported ScrollEventType: "+p0);
    }
    public static ScrollEventType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ScrollEventType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ScrollEventType.class, p0);
    }
    public static ScrollEventType[] values(){
       Object obj = PatchProxy.apply(null, null, ScrollEventType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScrollEventType.$VALUES.clone();
    }
}
