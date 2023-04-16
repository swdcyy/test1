package com.yxcorp.gifshow.share.f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.share.exception.ForwardCancelException;
import n80.b;
import java.lang.String;
import f66.i;

public final class f implements g	// class@001b82
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void accept(Object p0){
       if (!p0 instanceof ForwardCancelException) {
          b.C().B("DownloadForwardHelper", p0);
       }
       return;
    }
}
