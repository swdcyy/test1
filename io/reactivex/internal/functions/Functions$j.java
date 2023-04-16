package io.reactivex.internal.functions.Functions$j;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.util.ArrayList;

public final class Functions$j implements Callable	// class@0011c0
{
    public final int b;

    public void Functions$j(int p0){
       super();
       this.b = p0;
    }
    public Object call(){
       return new ArrayList(this.b);
    }
}
