package com.kwai.wake.service.SubProcessService$requestConfig$1$1$2$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import com.kwai.wake.pojo.PkgModel;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;

public final class SubProcessService$requestConfig$1$1$2$1$1$1 extends Lambda implements l	// class@00111e
{
    public final String $currentPkg;

    public void SubProcessService$requestConfig$1$1$2$1$1$1(String p0){
       this.$currentPkg = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(PkgModel p0){
       a.p(p0, "model");
       String pkg = p0.getPkg();
       boolean b = false;
       pkg = (pkg == null || !pkg.length())? 1: null;
       if (!pkg && ((a.g(p0.getPkg(), this.$currentPkg) ^ 1) && p0.isValid())) {
          b = true;
       }
    label_002d :
       return b;
    }
}
