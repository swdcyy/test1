package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$e;
import mhc.v;
import java.lang.String;
import mhc.x;
import nsd.u;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.IllegalAccessException;

public final class ForwardGridSectionFragment$e extends v	// class@001cc8
{
    public final String h;

    public void ForwardGridSectionFragment$e(String p0,x p1){
       this.h = p0;
       super(p1, 0, 0, null, null, false, 62, null);
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ForwardGridSectionFragment$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       throw new IllegalAccessException("Converted operation should not invoke execute\(...\)");
    }
    public int S0(){
       return 0;
    }
}
