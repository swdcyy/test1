package com.smile.gifmaker.thread.executor.BaseExecutorCell$ExecutorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class BaseExecutorCell$ExecutorType extends Enum	// class@000fca
{
    public static final BaseExecutorCell$ExecutorType[] $VALUES;
    public static final BaseExecutorCell$ExecutorType ARTERY;
    public static final BaseExecutorCell$ExecutorType DREDGE_DISASTER;
    public static final BaseExecutorCell$ExecutorType DREDGE_EXPANDABLE;
    public static final BaseExecutorCell$ExecutorType DREDGE_NORMAL;
    public static final BaseExecutorCell$ExecutorType FIXED;
    public static final BaseExecutorCell$ExecutorType SERIAL;

    static {
       BaseExecutorCell$ExecutorType uExecutorTyp = new BaseExecutorCell$ExecutorType("ARTERY", 0);
       BaseExecutorCell$ExecutorType.ARTERY = uExecutorTyp;
       BaseExecutorCell$ExecutorType uExecutorTyp1 = new BaseExecutorCell$ExecutorType("DREDGE_NORMAL", 1);
       BaseExecutorCell$ExecutorType.DREDGE_NORMAL = uExecutorTyp1;
       BaseExecutorCell$ExecutorType uExecutorTyp2 = new BaseExecutorCell$ExecutorType("DREDGE_DISASTER", 2);
       BaseExecutorCell$ExecutorType.DREDGE_DISASTER = uExecutorTyp2;
       BaseExecutorCell$ExecutorType uExecutorTyp3 = new BaseExecutorCell$ExecutorType("DREDGE_EXPANDABLE", 3);
       BaseExecutorCell$ExecutorType.DREDGE_EXPANDABLE = uExecutorTyp3;
       BaseExecutorCell$ExecutorType uExecutorTyp4 = new BaseExecutorCell$ExecutorType("SERIAL", 4);
       BaseExecutorCell$ExecutorType.SERIAL = uExecutorTyp4;
       BaseExecutorCell$ExecutorType uExecutorTyp5 = new BaseExecutorCell$ExecutorType("FIXED", 5);
       BaseExecutorCell$ExecutorType.FIXED = uExecutorTyp5;
       BaseExecutorCell$ExecutorType[] uExecutorTyp6 = new BaseExecutorCell$ExecutorType[]{uExecutorTyp,uExecutorTyp1,uExecutorTyp2,uExecutorTyp3,uExecutorTyp4,uExecutorTyp5};
       BaseExecutorCell$ExecutorType.$VALUES = uExecutorTyp6;
    }
    public void BaseExecutorCell$ExecutorType(String p0,int p1){
       super(p0, p1);
    }
    public static BaseExecutorCell$ExecutorType valueOf(String p0){
       return Enum.valueOf(BaseExecutorCell$ExecutorType.class, p0);
    }
    public static BaseExecutorCell$ExecutorType[] values(){
       return BaseExecutorCell$ExecutorType.$VALUES.clone();
    }
}
