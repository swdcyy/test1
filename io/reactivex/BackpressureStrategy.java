package io.reactivex.BackpressureStrategy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class BackpressureStrategy extends Enum	// class@00118e
{
    public static final BackpressureStrategy[] $VALUES;
    public static final BackpressureStrategy BUFFER;
    public static final BackpressureStrategy DROP;
    public static final BackpressureStrategy ERROR;
    public static final BackpressureStrategy LATEST;
    public static final BackpressureStrategy MISSING;

    static {
       BackpressureStrategy uBackpressur = new BackpressureStrategy("MISSING", 0);
       BackpressureStrategy.MISSING = uBackpressur;
       BackpressureStrategy uBackpressur1 = new BackpressureStrategy("ERROR", 1);
       BackpressureStrategy.ERROR = uBackpressur1;
       BackpressureStrategy uBackpressur2 = new BackpressureStrategy("BUFFER", 2);
       BackpressureStrategy.BUFFER = uBackpressur2;
       BackpressureStrategy uBackpressur3 = new BackpressureStrategy("DROP", 3);
       BackpressureStrategy.DROP = uBackpressur3;
       BackpressureStrategy uBackpressur4 = new BackpressureStrategy("LATEST", 4);
       BackpressureStrategy.LATEST = uBackpressur4;
       BackpressureStrategy[] uBackpressur5 = new BackpressureStrategy[]{uBackpressur,uBackpressur1,uBackpressur2,uBackpressur3,uBackpressur4};
       BackpressureStrategy.$VALUES = uBackpressur5;
    }
    public void BackpressureStrategy(String p0,int p1){
       super(p0, p1);
    }
    public static BackpressureStrategy valueOf(String p0){
       return Enum.valueOf(BackpressureStrategy.class, p0);
    }
    public static BackpressureStrategy[] values(){
       return BackpressureStrategy.$VALUES.clone();
    }
}
