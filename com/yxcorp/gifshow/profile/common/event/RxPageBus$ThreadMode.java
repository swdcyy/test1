package com.yxcorp.gifshow.profile.common.event.RxPageBus$ThreadMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RxPageBus$ThreadMode extends Enum	// class@0012d1
{
    public static final RxPageBus$ThreadMode[] $VALUES;
    public static final RxPageBus$ThreadMode ASYNC;
    public static final RxPageBus$ThreadMode MAIN;
    public static final RxPageBus$ThreadMode MAIN_NEXT_RUNNABLE;
    public static final RxPageBus$ThreadMode POSTING;

    static {
       RxPageBus$ThreadMode threadMode = new RxPageBus$ThreadMode("POSTING", 0);
       RxPageBus$ThreadMode.POSTING = threadMode;
       RxPageBus$ThreadMode threadMode1 = new RxPageBus$ThreadMode("MAIN", 1);
       RxPageBus$ThreadMode.MAIN = threadMode1;
       RxPageBus$ThreadMode threadMode2 = new RxPageBus$ThreadMode("MAIN_NEXT_RUNNABLE", 2);
       RxPageBus$ThreadMode.MAIN_NEXT_RUNNABLE = threadMode2;
       RxPageBus$ThreadMode threadMode3 = new RxPageBus$ThreadMode("ASYNC", 3);
       RxPageBus$ThreadMode.ASYNC = threadMode3;
       RxPageBus$ThreadMode[] threadModeAr = new RxPageBus$ThreadMode[]{threadMode,threadMode1,threadMode2,threadMode3};
       RxPageBus$ThreadMode.$VALUES = threadModeAr;
    }
    public void RxPageBus$ThreadMode(String p0,int p1){
       super(p0, p1);
    }
    public static RxPageBus$ThreadMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RxPageBus$ThreadMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RxPageBus$ThreadMode.class, p0);
    }
    public static RxPageBus$ThreadMode[] values(){
       Object obj = PatchProxy.apply(null, null, RxPageBus$ThreadMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RxPageBus$ThreadMode.$VALUES.clone();
    }
}
