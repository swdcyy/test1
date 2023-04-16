package io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable;
import erd.o;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import brd.e0;
import cxd.b;
import io.reactivex.internal.operators.single.SingleToFlowable;

public final class SingleInternalHelper$ToFlowable extends Enum implements o	// class@00146a
{
    public static final SingleInternalHelper$ToFlowable[] $VALUES;
    public static final SingleInternalHelper$ToFlowable INSTANCE;

    static {
       SingleInternalHelper$ToFlowable toFlowable = new SingleInternalHelper$ToFlowable("INSTANCE", 0);
       SingleInternalHelper$ToFlowable.INSTANCE = toFlowable;
       SingleInternalHelper$ToFlowable[] toFlowableAr = new SingleInternalHelper$ToFlowable[]{toFlowable};
       SingleInternalHelper$ToFlowable.$VALUES = toFlowableAr;
    }
    public void SingleInternalHelper$ToFlowable(String p0,int p1){
       super(p0, p1);
    }
    public static SingleInternalHelper$ToFlowable valueOf(String p0){
       return Enum.valueOf(SingleInternalHelper$ToFlowable.class, p0);
    }
    public static SingleInternalHelper$ToFlowable[] values(){
       return SingleInternalHelper$ToFlowable.$VALUES.clone();
    }
    public b apply(e0 p0){
       return new SingleToFlowable(p0);
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}
