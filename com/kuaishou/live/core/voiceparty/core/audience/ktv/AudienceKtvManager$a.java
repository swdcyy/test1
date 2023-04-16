package com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$a;
import cp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$d;

public final class AudienceKtvManager$a extends KtvManager$b implements a	// class@0013b8
{
    public boolean d;

    public void AudienceKtvManager$a(){
       super();
    }
    public Boolean i(){
       Object[] objArray = null;
       KtvManager$b obj = PatchProxy.apply(objArray, this, AudienceKtvManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj instanceof KtvManager$f) {
          objArray = Boolean.valueOf(obj.m());
       }else if(obj instanceof KtvManager$d){
          objArray = Boolean.valueOf(obj.n());
       }
       return objArray;
    }
    public boolean j(){
       return this.d;
    }
}
