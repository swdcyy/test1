package com.yxcorp.gifshow.hotspot.presenter.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import ekd.e0;
import io.reactivex.exceptions.CompositeException;

public final class c implements g	// class@0018e6
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       if (!e0.a) {
          return;
       }
       Throwable[] throwableArr = new Throwable[]{p0};
       throw new CompositeException(throwableArr);
    }
}
