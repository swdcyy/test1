package com.yxcorp.gifshow.share.operation.a;
import erd.g;
import java.lang.Object;
import uo7.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.exception.ForwardToastException;
import lnc.a1;
import java.io.IOException;
import java.lang.Exception;

public final class a implements g	// class@001c01
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       throw new ForwardToastException(a1.p(0x7f1043cb), new IOException("no permission to save poster"));
    }
}
