package com.kwai.middleware.resourcemanager.cache.type.Result$SOURCE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Result$SOURCE extends Enum	// class@000f41
{
    public static final Result$SOURCE[] $VALUES;
    public static final Result$SOURCE CACHE;
    public static final Result$SOURCE NET;

    static {
       Result$SOURCE sOURCE;
       Result$SOURCE[] sOURCEArray = new Result$SOURCE[]{sOURCE,sOURCE};
       sOURCE = new Result$SOURCE("CACHE", 0);
       Result$SOURCE.CACHE = sOURCE;
       sOURCE = new Result$SOURCE("NET", 1);
       Result$SOURCE.NET = sOURCE;
       Result$SOURCE.$VALUES = sOURCEArray;
    }
    public void Result$SOURCE(String p0,int p1){
       super(p0, p1);
    }
    public static Result$SOURCE valueOf(String p0){
       return Enum.valueOf(Result$SOURCE.class, p0);
    }
    public static Result$SOURCE[] values(){
       return Result$SOURCE.$VALUES.clone();
    }
}
