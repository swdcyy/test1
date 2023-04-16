package com.airbnb.lottie.a$a;
import java.util.concurrent.Callable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import w4.m;
import com.airbnb.lottie.network.b;

public final class a$a implements Callable	// class@000d90
{
    public final Context b;
    public final String c;

    public void a$a(Context p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       return b.b(this.b, this.c);
    }
}
