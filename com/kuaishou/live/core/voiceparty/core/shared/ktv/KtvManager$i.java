package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$i;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KtvManager$i	// class@001432
{
    public KtvManager$f a;

    public void KtvManager$i(){
       super();
    }
    public final KtvManager$f a(){
       KtvManager$i obj = PatchProxy.apply(null, this, KtvManager$i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("inheritContext");
       }
       return obj;
    }
}
