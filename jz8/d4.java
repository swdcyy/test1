package jz8.d4;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class d4 implements Runnable	// class@0029f2
{
    public final Object b;
    public final Object c;

    public void d4(Object p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ExceptionHandler.handleCaughtException(new IllegalStateException("不能从"+this.b+"到"+this.c));
    }
}
