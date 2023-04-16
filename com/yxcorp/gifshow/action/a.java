package com.yxcorp.gifshow.action.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import ekd.e0;
import java.lang.String;
import yv8.b;
import io.reactivex.exceptions.CompositeException;

public final class a implements g	// class@00130f
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       if (!e0.a) {
          b.b("RealActionHelper", "addRealAction");
          return;
       }else {
          Throwable[] throwableArr = new Throwable[]{p0};
          throw new CompositeException(throwableArr);
       }
    }
}
