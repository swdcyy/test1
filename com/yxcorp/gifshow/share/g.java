package com.yxcorp.gifshow.share.g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.share.exception.ForwardCancelException;
import n80.b;
import java.lang.String;
import f66.i;

public final class g implements g	// class@001b95
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void accept(Object p0){
       if (!p0 instanceof ForwardCancelException) {
          b.C().B("DownloadForwardHelper", p0);
       }
       return;
    }
}
