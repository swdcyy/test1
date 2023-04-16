package com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import rvc.e;
import com.google.common.collect.ImmutableMap;

public final class TransitionEffect$a	// class@001514
{

    public void TransitionEffect$a(){
       super();
    }
    public void TransitionEffect$a(u p0){
       super();
    }
    public final TransitionEffect a(int p0){
       TransitionEffect$a uoa = TransitionEffect$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       TransitionEffect transitionEf = e.a.a(p0);
       if (transitionEf == null) {
          transitionEf = this.b();
       }
       return transitionEf;
    }
    public final TransitionEffect b(){
       return TransitionEffect.DEFAULT_EFFECT;
    }
    public final ImmutableMap c(){
       return TransitionEffect.TRANSITION_MAP;
    }
}
