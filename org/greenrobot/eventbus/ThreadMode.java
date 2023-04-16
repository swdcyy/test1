package org.greenrobot.eventbus.ThreadMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ThreadMode extends Enum	// class@002122
{
    public static final ThreadMode[] $VALUES;
    public static final ThreadMode ASYNC;
    public static final ThreadMode BACKGROUND;
    public static final ThreadMode MAIN;
    public static final ThreadMode POSTING;

    static {
       ThreadMode threadMode = new ThreadMode("POSTING", 0);
       ThreadMode.POSTING = threadMode;
       ThreadMode threadMode1 = new ThreadMode("MAIN", 1);
       ThreadMode.MAIN = threadMode1;
       ThreadMode threadMode2 = new ThreadMode("BACKGROUND", 2);
       ThreadMode.BACKGROUND = threadMode2;
       ThreadMode threadMode3 = new ThreadMode("ASYNC", 3);
       ThreadMode.ASYNC = threadMode3;
       ThreadMode[] threadModeAr = new ThreadMode[]{threadMode,threadMode1,threadMode2,threadMode3};
       ThreadMode.$VALUES = threadModeAr;
    }
    public void ThreadMode(String p0,int p1){
       super(p0, p1);
    }
    public static ThreadMode valueOf(String p0){
       return Enum.valueOf(ThreadMode.class, p0);
    }
    public static ThreadMode[] values(){
       return ThreadMode.$VALUES.clone();
    }
}
