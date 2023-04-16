package io.reactivex.internal.functions.Functions$u;
import erd.a;
import java.util.concurrent.Future;
import java.lang.Object;

public final class Functions$u implements a	// class@0011c3
{
    public final Future b;

    public void Functions$u(Future p0){
       super();
       this.b = p0;
    }
    public void run(){
       this.b.get();
    }
}
