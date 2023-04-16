package io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import erd.g;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import cxd.d;

public final class FlowableInternalHelper$RequestMax extends Enum implements g	// class@00123c
{
    public static final FlowableInternalHelper$RequestMax[] $VALUES;
    public static final FlowableInternalHelper$RequestMax INSTANCE;

    static {
       FlowableInternalHelper$RequestMax requestMax = new FlowableInternalHelper$RequestMax("INSTANCE", 0);
       FlowableInternalHelper$RequestMax.INSTANCE = requestMax;
       FlowableInternalHelper$RequestMax[] requestMaxAr = new FlowableInternalHelper$RequestMax[]{requestMax};
       FlowableInternalHelper$RequestMax.$VALUES = requestMaxAr;
    }
    public void FlowableInternalHelper$RequestMax(String p0,int p1){
       super(p0, p1);
    }
    public static FlowableInternalHelper$RequestMax valueOf(String p0){
       return Enum.valueOf(FlowableInternalHelper$RequestMax.class, p0);
    }
    public static FlowableInternalHelper$RequestMax[] values(){
       return FlowableInternalHelper$RequestMax.$VALUES.clone();
    }
    public void accept(d p0){
       p0.request(Long.MAX_VALUE);
    }
    public void accept(Object p0){
       this.accept(p0);
    }
}
