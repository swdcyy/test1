package com.kwai.live.gzone.accompanyplay.edit.v$d;
import s77.b;
import com.kwai.live.gzone.accompanyplay.edit.v;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import e17.s;

public class v$d implements b	// class@000c1d
{
    public final v a;

    public void v$d(v p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "1")) {
       }else if(!p0.booleanValue()){
          s.a(R.string.arg_RES_7f103cee);
       }
       return;
    }
}
