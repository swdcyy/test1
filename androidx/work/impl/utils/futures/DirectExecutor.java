package androidx.work.impl.utils.futures.DirectExecutor;
import java.util.concurrent.Executor;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Runnable;

public final class DirectExecutor extends Enum implements Executor	// class@000a9f
{
    public static final DirectExecutor[] $VALUES;
    public static final DirectExecutor INSTANCE;

    static {
       DirectExecutor uDirectExecu = new DirectExecutor("INSTANCE", 0);
       DirectExecutor.INSTANCE = uDirectExecu;
       DirectExecutor[] uDirectExecu1 = new DirectExecutor[]{uDirectExecu};
       DirectExecutor.$VALUES = uDirectExecu1;
    }
    public void DirectExecutor(String p0,int p1){
       super(p0, p1);
    }
    public static DirectExecutor valueOf(String p0){
       return Enum.valueOf(DirectExecutor.class, p0);
    }
    public static DirectExecutor[] values(){
       return DirectExecutor.$VALUES.clone();
    }
    public void execute(Runnable p0){
       p0.run();
    }
    public String toString(){
       return "DirectExecutor";
    }
}
