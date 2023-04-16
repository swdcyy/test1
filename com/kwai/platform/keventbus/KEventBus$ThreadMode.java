package com.kwai.platform.keventbus.KEventBus$ThreadMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KEventBus$ThreadMode extends Enum	// class@001283
{
    public static final KEventBus$ThreadMode[] $VALUES;
    public static final KEventBus$ThreadMode ASYNC;
    public static final KEventBus$ThreadMode BACKGROUND;
    public static final KEventBus$ThreadMode MAIN;
    public static final KEventBus$ThreadMode MAIN_NEXT_RUNNABLE;
    public static final KEventBus$ThreadMode POSTING;

    static {
       KEventBus$ThreadMode threadMode;
       KEventBus$ThreadMode[] threadModeAr = new KEventBus$ThreadMode[]{threadMode,threadMode,threadMode,threadMode,threadMode};
       threadMode = new KEventBus$ThreadMode("POSTING", 0);
       KEventBus$ThreadMode.POSTING = threadMode;
       threadMode = new KEventBus$ThreadMode("MAIN", 1);
       KEventBus$ThreadMode.MAIN = threadMode;
       threadMode = new KEventBus$ThreadMode("MAIN_NEXT_RUNNABLE", 2);
       KEventBus$ThreadMode.MAIN_NEXT_RUNNABLE = threadMode;
       threadMode = new KEventBus$ThreadMode("ASYNC", 3);
       KEventBus$ThreadMode.ASYNC = threadMode;
       threadMode = new KEventBus$ThreadMode("BACKGROUND", 4);
       KEventBus$ThreadMode.BACKGROUND = threadMode;
       KEventBus$ThreadMode.$VALUES = threadModeAr;
    }
    public void KEventBus$ThreadMode(String p0,int p1){
       super(p0, p1);
    }
    public static KEventBus$ThreadMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KEventBus$ThreadMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KEventBus$ThreadMode.class, p0);
    }
    public static KEventBus$ThreadMode[] values(){
       Object obj = PatchProxy.apply(null, null, KEventBus$ThreadMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KEventBus$ThreadMode.$VALUES.clone();
    }
}
