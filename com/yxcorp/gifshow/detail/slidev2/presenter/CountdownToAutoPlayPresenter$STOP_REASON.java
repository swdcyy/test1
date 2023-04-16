package com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$STOP_REASON;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CountdownToAutoPlayPresenter$STOP_REASON extends Enum	// class@0018a9
{
    public final int type;
    public static final CountdownToAutoPlayPresenter$STOP_REASON[] $VALUES;
    public static final CountdownToAutoPlayPresenter$STOP_REASON STOP_BY_FEEDBACK_PANEL;
    public static final CountdownToAutoPlayPresenter$STOP_REASON STOP_BY_SLIDE_MENU;

    static {
       CountdownToAutoPlayPresenter$STOP_REASON sTOP_REASON;
       CountdownToAutoPlayPresenter$STOP_REASON[] sTOP_REASONA = new CountdownToAutoPlayPresenter$STOP_REASON[]{sTOP_REASON,sTOP_REASON};
       sTOP_REASON = new CountdownToAutoPlayPresenter$STOP_REASON("STOP_BY_FEEDBACK_PANEL", 0, 1);
       CountdownToAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_PANEL = sTOP_REASON;
       sTOP_REASON = new CountdownToAutoPlayPresenter$STOP_REASON("STOP_BY_SLIDE_MENU", 1, 2);
       CountdownToAutoPlayPresenter$STOP_REASON.STOP_BY_SLIDE_MENU = sTOP_REASON;
       CountdownToAutoPlayPresenter$STOP_REASON.$VALUES = sTOP_REASONA;
    }
    public void CountdownToAutoPlayPresenter$STOP_REASON(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static CountdownToAutoPlayPresenter$STOP_REASON valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CountdownToAutoPlayPresenter$STOP_REASON.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CountdownToAutoPlayPresenter$STOP_REASON.class, p0);
    }
    public static CountdownToAutoPlayPresenter$STOP_REASON[] values(){
       Object obj = PatchProxy.apply(null, null, CountdownToAutoPlayPresenter$STOP_REASON.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CountdownToAutoPlayPresenter$STOP_REASON.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
