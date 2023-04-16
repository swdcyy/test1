package com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl$mTkManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.tachikoma.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EasyTkImpl$mTkManager$2 extends Lambda implements a	// class@0017ff
{
    public static final EasyTkImpl$mTkManager$2 INSTANCE;

    static {
       EasyTkImpl$mTkManager$2.INSTANCE = new EasyTkImpl$mTkManager$2();
    }
    public void EasyTkImpl$mTkManager$2(){
       super(0);
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, EasyTkImpl$mTkManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
