package com.airbnb.lottie.a$f;
import java.util.concurrent.Callable;
import w4.e;
import java.lang.Object;
import w4.m;

public final class a$f implements Callable	// class@000d95
{
    public final e b;

    public void a$f(e p0){
       this.b = p0;
       super();
    }
    public Object call(){
       return new m(this.b);
    }
}
