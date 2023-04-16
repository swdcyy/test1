package com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$STOP_REASON;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePreviewAutoPlayPresenter$STOP_REASON extends Enum	// class@000df9
{
    public final int type;
    public static final LivePreviewAutoPlayPresenter$STOP_REASON[] $VALUES;
    public static final LivePreviewAutoPlayPresenter$STOP_REASON STOP_BY_FEEDBACK_PANEL;
    public static final LivePreviewAutoPlayPresenter$STOP_REASON STOP_BY_SLIDE_MENU;

    static {
       LivePreviewAutoPlayPresenter$STOP_REASON sTOP_REASON;
       LivePreviewAutoPlayPresenter$STOP_REASON[] sTOP_REASONA = new LivePreviewAutoPlayPresenter$STOP_REASON[]{sTOP_REASON,sTOP_REASON};
       sTOP_REASON = new LivePreviewAutoPlayPresenter$STOP_REASON("STOP_BY_FEEDBACK_PANEL", 0, 1);
       LivePreviewAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_PANEL = sTOP_REASON;
       sTOP_REASON = new LivePreviewAutoPlayPresenter$STOP_REASON("STOP_BY_SLIDE_MENU", 1, 2);
       LivePreviewAutoPlayPresenter$STOP_REASON.STOP_BY_SLIDE_MENU = sTOP_REASON;
       LivePreviewAutoPlayPresenter$STOP_REASON.$VALUES = sTOP_REASONA;
    }
    public void LivePreviewAutoPlayPresenter$STOP_REASON(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static LivePreviewAutoPlayPresenter$STOP_REASON valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePreviewAutoPlayPresenter$STOP_REASON.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePreviewAutoPlayPresenter$STOP_REASON.class, p0);
    }
    public static LivePreviewAutoPlayPresenter$STOP_REASON[] values(){
       Object obj = PatchProxy.apply(null, null, LivePreviewAutoPlayPresenter$STOP_REASON.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePreviewAutoPlayPresenter$STOP_REASON.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
