package com.airbnb.lottie.a$d;
import java.util.concurrent.Callable;
import java.io.InputStream;
import java.lang.String;
import java.lang.Object;
import w4.m;
import com.airbnb.lottie.a;

public final class a$d implements Callable	// class@000d93
{
    public final InputStream b;
    public final String c;

    public void a$d(InputStream p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       return a.e(this.b, this.c);
    }
}
