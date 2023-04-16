package io.netty.util.internal.chmv8.ForkJoinPool$EmptyTask;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.lang.Void;

public final class ForkJoinPool$EmptyTask extends ForkJoinTask	// class@00116b
{
    public static final long serialVersionUID = 0x94d6a336567902b1;

    public void ForkJoinPool$EmptyTask(){
       super();
       this.status = 0xf0000000;
    }
    public final boolean exec(){
       return true;
    }
    public Object getRawResult(){
       return this.getRawResult();
    }
    public final Void getRawResult(){
       return null;
    }
    public void setRawResult(Object p0){
       this.setRawResult(p0);
    }
    public final void setRawResult(Void p0){
    }
}
