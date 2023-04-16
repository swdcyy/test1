package com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$openKrnDialog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaKrnUtils$Companion$openKrnDialog$1 extends Lambda implements a	// class@0010d2
{
    public final String $uriString;

    public void TunaKrnUtils$Companion$openKrnDialog$1(String p0){
       this.$uriString = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaKrnUtils$Companion$openKrnDialog$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Uri error: "+this.$uriString;
    }
}
