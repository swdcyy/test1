package com.yxcorp.gifshow.widget.LiveCoverIconView$LayoutStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCoverIconView$LayoutStyle extends Enum	// class@001874
{
    public static final LiveCoverIconView$LayoutStyle[] $VALUES;
    public static final LiveCoverIconView$LayoutStyle DEFAULT_LAYOUT;
    public static final LiveCoverIconView$LayoutStyle ICON_TEXT_ICON_LAYOUT;
    public static final LiveCoverIconView$LayoutStyle SECOND_LEVEL_ICON_LAYOUT;

    static {
       LiveCoverIconView$LayoutStyle layoutStyle = new LiveCoverIconView$LayoutStyle("DEFAULT_LAYOUT", 0);
       LiveCoverIconView$LayoutStyle.DEFAULT_LAYOUT = layoutStyle;
       LiveCoverIconView$LayoutStyle layoutStyle1 = new LiveCoverIconView$LayoutStyle("SECOND_LEVEL_ICON_LAYOUT", 1);
       LiveCoverIconView$LayoutStyle.SECOND_LEVEL_ICON_LAYOUT = layoutStyle1;
       LiveCoverIconView$LayoutStyle layoutStyle2 = new LiveCoverIconView$LayoutStyle("ICON_TEXT_ICON_LAYOUT", 2);
       LiveCoverIconView$LayoutStyle.ICON_TEXT_ICON_LAYOUT = layoutStyle2;
       LiveCoverIconView$LayoutStyle[] layoutStyleA = new LiveCoverIconView$LayoutStyle[]{layoutStyle,layoutStyle1,layoutStyle2};
       LiveCoverIconView$LayoutStyle.$VALUES = layoutStyleA;
    }
    public void LiveCoverIconView$LayoutStyle(String p0,int p1){
       super(p0, p1);
    }
    public static LiveCoverIconView$LayoutStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCoverIconView$LayoutStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCoverIconView$LayoutStyle.class, p0);
    }
    public static LiveCoverIconView$LayoutStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCoverIconView$LayoutStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCoverIconView$LayoutStyle.$VALUES.clone();
    }
}
