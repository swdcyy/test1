package com.airbnb.lottie.ex.a$c;
import java.util.concurrent.Callable;
import a5.e;
import java.lang.Object;
import a5.k;

public final class a$c implements Callable	// class@000da1
{
    public final e b;

    public void a$c(e p0){
       this.b = p0;
       super();
    }
    public Object call(){
       return new k(this.b);
    }
}
