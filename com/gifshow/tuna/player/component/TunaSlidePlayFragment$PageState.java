package com.gifshow.tuna.player.component.TunaSlidePlayFragment$PageState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TunaSlidePlayFragment$PageState extends Enum	// class@0015e4
{
    public static final TunaSlidePlayFragment$PageState[] $VALUES;
    public static final TunaSlidePlayFragment$PageState ERROR;
    public static final TunaSlidePlayFragment$PageState LOADING;
    public static final TunaSlidePlayFragment$PageState SUCCESS;

    static {
       TunaSlidePlayFragment$PageState pageState = new TunaSlidePlayFragment$PageState("LOADING", 0);
       TunaSlidePlayFragment$PageState.LOADING = pageState;
       TunaSlidePlayFragment$PageState pageState1 = new TunaSlidePlayFragment$PageState("ERROR", 1);
       TunaSlidePlayFragment$PageState.ERROR = pageState1;
       TunaSlidePlayFragment$PageState pageState2 = new TunaSlidePlayFragment$PageState("SUCCESS", 2);
       TunaSlidePlayFragment$PageState.SUCCESS = pageState2;
       TunaSlidePlayFragment$PageState[] pageStateArr = new TunaSlidePlayFragment$PageState[]{pageState,pageState1,pageState2};
       TunaSlidePlayFragment$PageState.$VALUES = pageStateArr;
    }
    public void TunaSlidePlayFragment$PageState(String p0,int p1){
       super(p0, p1);
    }
    public static TunaSlidePlayFragment$PageState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TunaSlidePlayFragment$PageState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TunaSlidePlayFragment$PageState.class, p0);
    }
    public static TunaSlidePlayFragment$PageState[] values(){
       Object obj = PatchProxy.apply(null, null, TunaSlidePlayFragment$PageState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TunaSlidePlayFragment$PageState.$VALUES.clone();
    }
}
