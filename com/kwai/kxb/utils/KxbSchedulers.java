package com.kwai.kxb.utils.KxbSchedulers;
import com.kwai.kxb.utils.KxbSchedulers$IO$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import brd.z;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KxbSchedulers	// class@00080e
{
    public static final p a;
    public static final KxbSchedulers b;

    static {
       KxbSchedulers.b = new KxbSchedulers();
       KxbSchedulers.a = s.c(KxbSchedulers$IO$2.INSTANCE);
    }
    public void KxbSchedulers(){
       super();
    }
    public final z a(){
       Object obj = PatchProxy.apply(null, this, KxbSchedulers.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KxbSchedulers.a.getValue();
    }
}
