package com.kuaishou.live.core.voiceparty.micseats.pendant.EmptyPendantViewController$bindingMediaStyle$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.NoWhenBranchMatchedException;
import java.lang.Integer;

public final class EmptyPendantViewController$bindingMediaStyle$2 extends Lambda implements l	// class@0015f8
{
    public static final EmptyPendantViewController$bindingMediaStyle$2 INSTANCE;

    static {
       EmptyPendantViewController$bindingMediaStyle$2.INSTANCE = new EmptyPendantViewController$bindingMediaStyle$2();
    }
    public void EmptyPendantViewController$bindingMediaStyle$2(){
       super(1);
    }
    public final int invoke(boolean p0){
       int i;
       if (PatchProxy.isSupport(EmptyPendantViewController$bindingMediaStyle$2.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, EmptyPendantViewController$bindingMediaStyle$2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          i = 0x7f082507;
       }else if(p0 == true){
          i = 0x7f082509;
       }else {
          throw new NoWhenBranchMatchedException();
       }
       return i;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0.booleanValue()));
    }
}
