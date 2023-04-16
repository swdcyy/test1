package com.kuaishou.live.core.voiceparty.micseats.pendant.EmptyPendantViewController$bindingVideoStyle$2;
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

public final class EmptyPendantViewController$bindingVideoStyle$2 extends Lambda implements l	// class@0015f9
{
    public static final EmptyPendantViewController$bindingVideoStyle$2 INSTANCE;

    static {
       EmptyPendantViewController$bindingVideoStyle$2.INSTANCE = new EmptyPendantViewController$bindingVideoStyle$2();
    }
    public void EmptyPendantViewController$bindingVideoStyle$2(){
       super(1);
    }
    public final int invoke(boolean p0){
       int i;
       if (PatchProxy.isSupport(EmptyPendantViewController$bindingVideoStyle$2.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, EmptyPendantViewController$bindingVideoStyle$2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          i = 0x7f080514;
       }else if(p0 == true){
          i = 0x7f080586;
       }else {
          throw new NoWhenBranchMatchedException();
       }
       return i;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0.booleanValue()));
    }
}
