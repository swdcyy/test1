package com.yxcorp.gifshow.activity.share.presenter.o1;
import java.util.concurrent.Callable;
import java.lang.Object;
import f66.i;
import jq.a;
import java.lang.String;
import q87.c;
import android.util.Pair;
import java.lang.Boolean;

public final class o1 implements Callable	// class@00141b
{
    public static final o1 b;

    static {
       o1.b = new o1();
    }
    public void o1(){
       super();
    }
    public final Object call(){
       Object[] objArray = new Object[0];
       a.b().A("SharePreviewAnimation", "fillDragBitmapObservable£º time out, return null", objArray);
       return new Pair(Boolean.TRUE, null);
    }
}
