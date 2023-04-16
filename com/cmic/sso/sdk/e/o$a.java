package com.cmic.sso.sdk.e.o$a;
import java.lang.Runnable;
import java.lang.Object;
import com.cmic.sso.sdk.e.o$a$1;
import android.content.Context;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.e.o$a$2;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;

public abstract class o$a implements Runnable	// class@000f6b
{
    public final Thread$UncaughtExceptionHandler a;

    public void o$a(){
       super();
       this.a = new o$a$1(this);
    }
    public void o$a(Context p0,a p1){
       super();
       this.a = new o$a$2(this, p1, p0);
    }
    public static Thread$UncaughtExceptionHandler a(o$a p0){
       return p0.a;
    }
    public abstract void a();
    public void run(){
       Thread.currentThread().setUncaughtExceptionHandler(this.a);
       this.a();
       Thread.currentThread().setUncaughtExceptionHandler(null);
    }
}
