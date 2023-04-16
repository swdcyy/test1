package com.kuaishou.tuna_core.boot.TunaCodBootTask$execute$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaCodBootTask$execute$1 extends Lambda implements a	// class@001089
{
    public final boolean $isPlugin;

    public void TunaCodBootTask$execute$1(boolean p0){
       this.$isPlugin = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaCodBootTask$execute$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "cod is plugin: "+this.$isPlugin;
    }
}
