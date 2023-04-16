package com.kwai.framework.exceptionhandler.ExceptionClues$remove$$inlined$synchronized$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.exceptionhandler.Clue;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class ExceptionClues$remove$$inlined$synchronized$lambda$1 extends Lambda implements l	// class@00153b
{
    public final String $key$inlined;

    public void ExceptionClues$remove$$inlined$synchronized$lambda$1(String p0){
       this.$key$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Clue p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, ExceptionClues$remove$$inlined$synchronized$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(ExceptionClues$remove$$inlined$synchronized$lambda$1.class, "1");
       return a.g(p0.getKey(), this.$key$inlined);
    }
}
