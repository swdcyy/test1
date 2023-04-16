package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$STOP_REASON;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdAutoPlayPresenter$STOP_REASON extends Enum	// class@001589
{
    public final int type;
    public static final AdAutoPlayPresenter$STOP_REASON[] $VALUES;
    public static final AdAutoPlayPresenter$STOP_REASON STOP_BY_COMMENT;
    public static final AdAutoPlayPresenter$STOP_REASON STOP_BY_COMMERCIAL_CONVERT;
    public static final AdAutoPlayPresenter$STOP_REASON STOP_BY_FEEDBACK_MASK;
    public static final AdAutoPlayPresenter$STOP_REASON STOP_BY_FEEDBACK_PANEL;
    public static final AdAutoPlayPresenter$STOP_REASON STOP_BY_FEEDBACK_SUBMENU;
    public static final AdAutoPlayPresenter$STOP_REASON STOP_BY_SHARE_PANEL;
    public static final AdAutoPlayPresenter$STOP_REASON STOP_BY_SLIDE_MENU;

    static {
       AdAutoPlayPresenter$STOP_REASON sTOP_REASON;
       AdAutoPlayPresenter$STOP_REASON[] sTOP_REASONA = new AdAutoPlayPresenter$STOP_REASON[]{sTOP_REASON,sTOP_REASON,sTOP_REASON,sTOP_REASON,sTOP_REASON,sTOP_REASON,sTOP_REASON};
       sTOP_REASON = new AdAutoPlayPresenter$STOP_REASON("STOP_BY_FEEDBACK_PANEL", 0, 1);
       AdAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_PANEL = sTOP_REASON;
       sTOP_REASON = new AdAutoPlayPresenter$STOP_REASON("STOP_BY_SHARE_PANEL", 1, 2);
       AdAutoPlayPresenter$STOP_REASON.STOP_BY_SHARE_PANEL = sTOP_REASON;
       sTOP_REASON = new AdAutoPlayPresenter$STOP_REASON("STOP_BY_COMMENT", 2, 3);
       AdAutoPlayPresenter$STOP_REASON.STOP_BY_COMMENT = sTOP_REASON;
       sTOP_REASON = new AdAutoPlayPresenter$STOP_REASON("STOP_BY_SLIDE_MENU", 3, 4);
       AdAutoPlayPresenter$STOP_REASON.STOP_BY_SLIDE_MENU = sTOP_REASON;
       sTOP_REASON = new AdAutoPlayPresenter$STOP_REASON("STOP_BY_COMMERCIAL_CONVERT", 4, 5);
       AdAutoPlayPresenter$STOP_REASON.STOP_BY_COMMERCIAL_CONVERT = sTOP_REASON;
       sTOP_REASON = new AdAutoPlayPresenter$STOP_REASON("STOP_BY_FEEDBACK_MASK", 5, 6);
       AdAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_MASK = sTOP_REASON;
       sTOP_REASON = new AdAutoPlayPresenter$STOP_REASON("STOP_BY_FEEDBACK_SUBMENU", 6, 7);
       AdAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_SUBMENU = sTOP_REASON;
       AdAutoPlayPresenter$STOP_REASON.$VALUES = sTOP_REASONA;
    }
    public void AdAutoPlayPresenter$STOP_REASON(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static AdAutoPlayPresenter$STOP_REASON valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdAutoPlayPresenter$STOP_REASON.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AdAutoPlayPresenter$STOP_REASON.class, p0);
    }
    public static AdAutoPlayPresenter$STOP_REASON[] values(){
       Object obj = PatchProxy.apply(null, null, AdAutoPlayPresenter$STOP_REASON.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdAutoPlayPresenter$STOP_REASON.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
