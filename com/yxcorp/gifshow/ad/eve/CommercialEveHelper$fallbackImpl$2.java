package com.yxcorp.gifshow.ad.eve.CommercialEveHelper$fallbackImpl$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import gm9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifshow.annotation.plugin.a;
import com.smile.gifshow.annotation.plugin.Factory;

public final class CommercialEveHelper$fallbackImpl$2 extends Lambda implements a	// class@001768
{
    public static final CommercialEveHelper$fallbackImpl$2 INSTANCE;

    static {
       CommercialEveHelper$fallbackImpl$2.INSTANCE = new CommercialEveHelper$fallbackImpl$2();
    }
    public void CommercialEveHelper$fallbackImpl$2(){
       super(0);
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, CommercialEveHelper$fallbackImpl$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(c.class).getInstance();
    }
    public Object invoke(){
       return this.invoke();
    }
}
