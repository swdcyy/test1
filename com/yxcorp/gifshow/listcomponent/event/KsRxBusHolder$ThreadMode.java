package com.yxcorp.gifshow.listcomponent.event.KsRxBusHolder$ThreadMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsRxBusHolder$ThreadMode extends Enum	// class@001a68
{
    public static final KsRxBusHolder$ThreadMode[] $VALUES;
    public static final KsRxBusHolder$ThreadMode ASYNC;
    public static final KsRxBusHolder$ThreadMode BACKGROUND;
    public static final KsRxBusHolder$ThreadMode MAIN;
    public static final KsRxBusHolder$ThreadMode MAIN_NEXT_RUNNABLE;
    public static final KsRxBusHolder$ThreadMode POSTING;

    static {
       KsRxBusHolder$ThreadMode threadMode = new KsRxBusHolder$ThreadMode("POSTING", 0);
       KsRxBusHolder$ThreadMode.POSTING = threadMode;
       KsRxBusHolder$ThreadMode threadMode1 = new KsRxBusHolder$ThreadMode("MAIN", 1);
       KsRxBusHolder$ThreadMode.MAIN = threadMode1;
       KsRxBusHolder$ThreadMode threadMode2 = new KsRxBusHolder$ThreadMode("MAIN_NEXT_RUNNABLE", 2);
       KsRxBusHolder$ThreadMode.MAIN_NEXT_RUNNABLE = threadMode2;
       KsRxBusHolder$ThreadMode threadMode3 = new KsRxBusHolder$ThreadMode("ASYNC", 3);
       KsRxBusHolder$ThreadMode.ASYNC = threadMode3;
       KsRxBusHolder$ThreadMode threadMode4 = new KsRxBusHolder$ThreadMode("BACKGROUND", 4);
       KsRxBusHolder$ThreadMode.BACKGROUND = threadMode4;
       KsRxBusHolder$ThreadMode[] threadModeAr = new KsRxBusHolder$ThreadMode[]{threadMode,threadMode1,threadMode2,threadMode3,threadMode4};
       KsRxBusHolder$ThreadMode.$VALUES = threadModeAr;
    }
    public void KsRxBusHolder$ThreadMode(String p0,int p1){
       super(p0, p1);
    }
    public static KsRxBusHolder$ThreadMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsRxBusHolder$ThreadMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsRxBusHolder$ThreadMode.class, p0);
    }
    public static KsRxBusHolder$ThreadMode[] values(){
       Object obj = PatchProxy.apply(null, null, KsRxBusHolder$ThreadMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsRxBusHolder$ThreadMode.$VALUES.clone();
    }
}
