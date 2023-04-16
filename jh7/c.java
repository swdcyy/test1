package jh7.c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;
import yf7.h;

public abstract class c implements Runnable	// class@0029f8
{
    public Object b;

    public void c(){
       super();
    }
    public void c(Object p0){
       super();
       this.b = p0;
    }
    public static void c(Runnable p0){
       p0.run();
       return;
    }
    public Object a(){
       return this.b;
    }
    public abstract void b();
    public void run(){
       this.b();
       return;
    }
}
