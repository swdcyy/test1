package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ToolbarStyle extends Enum	// class@001ba4
{
    public static final ToolbarStyle[] $VALUES;
    public static final ToolbarStyle SCROLL_SENSITIVE;
    public static final ToolbarStyle WHITE_SOLID;

    static {
       ToolbarStyle toolbarStyle = new ToolbarStyle("SCROLL_SENSITIVE", 0);
       ToolbarStyle.SCROLL_SENSITIVE = toolbarStyle;
       ToolbarStyle toolbarStyle1 = new ToolbarStyle("WHITE_SOLID", 1);
       ToolbarStyle.WHITE_SOLID = toolbarStyle1;
       ToolbarStyle[] toolbarStyle2 = new ToolbarStyle[]{toolbarStyle,toolbarStyle1};
       ToolbarStyle.$VALUES = toolbarStyle2;
    }
    public void ToolbarStyle(String p0,int p1){
       super(p0, p1);
    }
    public static ToolbarStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ToolbarStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ToolbarStyle.class, p0);
    }
    public static ToolbarStyle[] values(){
       Object obj = PatchProxy.apply(null, null, ToolbarStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ToolbarStyle.$VALUES.clone();
    }
}
