package com.airbnb.lottie.b;
import java.util.concurrent.Callable;
import android.util.JsonReader;
import java.lang.String;
import java.lang.Object;
import w4.m;
import com.airbnb.lottie.a;

public final class b implements Callable	// class@000d97
{
    public final JsonReader b;
    public final String c;

    public void b(JsonReader p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       return a.f(this.b, this.c);
    }
}
