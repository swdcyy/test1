package com.kwai.kxb.utils.KxbSchedulers$IO$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import brd.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.KxbManager;
import gu6.k;

public final class KxbSchedulers$IO$2 extends Lambda implements a	// class@00080d
{
    public static final KxbSchedulers$IO$2 INSTANCE;

    static {
       KxbSchedulers$IO$2.INSTANCE = new KxbSchedulers$IO$2();
    }
    public void KxbSchedulers$IO$2(){
       super(0);
    }
    public final z invoke(){
       Object obj = PatchProxy.apply(null, this, KxbSchedulers$IO$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KxbManager.g.d().c();
    }
    public Object invoke(){
       return this.invoke();
    }
}
