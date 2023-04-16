package com.yxcorp.gifshow.detail.nonslide.toolbar.ToolbarAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ToolbarAction extends Enum	// class@0015ea
{
    public static final ToolbarAction[] $VALUES;
    public static final ToolbarAction BACK;
    public static final ToolbarAction COLLECT;
    public static final ToolbarAction COMMENT;
    public static final ToolbarAction DOWNLOAD;
    public static final ToolbarAction FOLLOW;
    public static final ToolbarAction FORWARD;
    public static final ToolbarAction FORWARD_PRIVACY;
    public static final ToolbarAction LIKE;
    public static final ToolbarAction MORE;
    public static final ToolbarAction NAME;
    public static final ToolbarAction REPORT;
    public static final ToolbarAction SEARCH;

    static {
       ToolbarAction toolbarActio = new ToolbarAction("BACK", 0);
       ToolbarAction.BACK = toolbarActio;
       ToolbarAction toolbarActio1 = new ToolbarAction("LIKE", 1);
       ToolbarAction.LIKE = toolbarActio1;
       ToolbarAction toolbarActio2 = new ToolbarAction("COLLECT", 2);
       ToolbarAction.COLLECT = toolbarActio2;
       ToolbarAction toolbarActio3 = new ToolbarAction("REPORT", 3);
       ToolbarAction.REPORT = toolbarActio3;
       ToolbarAction toolbarActio4 = new ToolbarAction("MORE", 4);
       ToolbarAction.MORE = toolbarActio4;
       ToolbarAction toolbarActio5 = new ToolbarAction("FORWARD", 5);
       ToolbarAction.FORWARD = toolbarActio5;
       ToolbarAction toolbarActio6 = new ToolbarAction("FORWARD_PRIVACY", 6);
       ToolbarAction.FORWARD_PRIVACY = toolbarActio6;
       ToolbarAction toolbarActio7 = new ToolbarAction("DOWNLOAD", 7);
       ToolbarAction.DOWNLOAD = toolbarActio7;
       ToolbarAction toolbarActio8 = new ToolbarAction("COMMENT", 8);
       ToolbarAction.COMMENT = toolbarActio8;
       ToolbarAction toolbarActio9 = new ToolbarAction("FOLLOW", 9);
       ToolbarAction.FOLLOW = toolbarActio9;
       ToolbarAction toolbarActio10 = new ToolbarAction("NAME", 10);
       ToolbarAction.NAME = toolbarActio10;
       ToolbarAction toolbarActio11 = new ToolbarAction("SEARCH", 11);
       ToolbarAction.SEARCH = toolbarActio11;
       ToolbarAction[] toolbarActio12 = new ToolbarAction[12];
       toolbarActio12[0] = toolbarActio;
       toolbarActio12[1] = toolbarActio1;
       toolbarActio12[2] = toolbarActio2;
       toolbarActio12[3] = toolbarActio3;
       toolbarActio12[4] = toolbarActio4;
       toolbarActio12[5] = toolbarActio5;
       toolbarActio12[6] = toolbarActio6;
       toolbarActio12[7] = toolbarActio7;
       toolbarActio12[8] = toolbarActio8;
       toolbarActio12[9] = toolbarActio9;
       toolbarActio12[10] = toolbarActio10;
       toolbarActio12[11] = toolbarActio11;
       ToolbarAction.$VALUES = toolbarActio12;
    }
    public void ToolbarAction(String p0,int p1){
       super(p0, p1);
    }
    public static ToolbarAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ToolbarAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ToolbarAction.class, p0);
    }
    public static ToolbarAction[] values(){
       Object obj = PatchProxy.apply(null, null, ToolbarAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ToolbarAction.$VALUES.clone();
    }
}
