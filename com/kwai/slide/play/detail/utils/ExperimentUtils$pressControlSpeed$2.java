package com.kwai.slide.play.detail.utils.ExperimentUtils$pressControlSpeed$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.d;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class ExperimentUtils$pressControlSpeed$2 extends Lambda implements a	// class@00187f
{
    public static final ExperimentUtils$pressControlSpeed$2 INSTANCE;

    static {
       ExperimentUtils$pressControlSpeed$2.INSTANCE = new ExperimentUtils$pressControlSpeed$2();
    }
    public void ExperimentUtils$pressControlSpeed$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, ExperimentUtils$pressControlSpeed$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (d.M() > 0)? d.M(): f.e("pressControlSpeed");
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
