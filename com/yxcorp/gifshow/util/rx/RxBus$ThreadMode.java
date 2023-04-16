package com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RxBus$ThreadMode extends Enum	// class@001341
{
    public static final RxBus$ThreadMode[] $VALUES;
    public static final RxBus$ThreadMode ASYNC;
    public static final RxBus$ThreadMode BACKGROUND;
    public static final RxBus$ThreadMode MAIN;
    public static final RxBus$ThreadMode MAIN_NEXT_RUNNABLE;
    public static final RxBus$ThreadMode POSTING;

    static {
       RxBus$ThreadMode threadMode = new RxBus$ThreadMode("POSTING", 0);
       RxBus$ThreadMode.POSTING = threadMode;
       RxBus$ThreadMode threadMode1 = new RxBus$ThreadMode("MAIN", 1);
       RxBus$ThreadMode.MAIN = threadMode1;
       RxBus$ThreadMode threadMode2 = new RxBus$ThreadMode("MAIN_NEXT_RUNNABLE", 2);
       RxBus$ThreadMode.MAIN_NEXT_RUNNABLE = threadMode2;
       RxBus$ThreadMode threadMode3 = new RxBus$ThreadMode("ASYNC", 3);
       RxBus$ThreadMode.ASYNC = threadMode3;
       RxBus$ThreadMode threadMode4 = new RxBus$ThreadMode("BACKGROUND", 4);
       RxBus$ThreadMode.BACKGROUND = threadMode4;
       RxBus$ThreadMode[] threadModeAr = new RxBus$ThreadMode[]{threadMode,threadMode1,threadMode2,threadMode3,threadMode4};
       RxBus$ThreadMode.$VALUES = threadModeAr;
    }
    public void RxBus$ThreadMode(String p0,int p1){
       super(p0, p1);
    }
    public static RxBus$ThreadMode valueOf(String p0){
       return Enum.valueOf(RxBus$ThreadMode.class, p0);
    }
    public static RxBus$ThreadMode[] values(){
       return RxBus$ThreadMode.$VALUES.clone();
    }
}
