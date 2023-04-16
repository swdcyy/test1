package com.yxcorp.gifshow.follow.stagger.presenter.j;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import ekd.e0;
import io.reactivex.exceptions.CompositeException;

public final class j implements g	// class@001215
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
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
