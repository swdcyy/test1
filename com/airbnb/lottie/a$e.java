package com.airbnb.lottie.a$e;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import java.lang.String;
import java.lang.Object;
import w4.m;
import com.airbnb.lottie.a;

public final class a$e implements Callable	// class@000d94
{
    public final ZipInputStream b;
    public final String c;

    public void a$e(ZipInputStream p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       return a.k(this.b, this.c);
    }
}
