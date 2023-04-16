package com.yxcorp.gifshow.share.widget.ForwardPageFragment$Companion$heightPerRow$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Integer;

public final class ForwardPageFragment$Companion$heightPerRow$2 extends Lambda implements a	// class@001ce6
{
    public static final ForwardPageFragment$Companion$heightPerRow$2 INSTANCE;

    static {
       ForwardPageFragment$Companion$heightPerRow$2.INSTANCE = new ForwardPageFragment$Companion$heightPerRow$2();
    }
    public void ForwardPageFragment$Companion$heightPerRow$2(){
       super(0);
    }
    public final int invoke(){
       c obj = PatchProxy.apply(null, this, ForwardPageFragment$Companion$heightPerRow$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       return n.c(obj.a(), 150.00f);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
