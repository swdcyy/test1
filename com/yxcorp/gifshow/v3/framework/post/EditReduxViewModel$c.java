package com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$c;
import tvc.c;
import tvc.a;
import tvc.e;
import xvc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class EditReduxViewModel$c extends c	// class@00152f
{

    public void EditReduxViewModel$c(){
       super();
    }
    public e b(a p0,e p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EditReduxViewModel$c.class, "1");
       if (obj != PatchProxyResult.class) {
          p1 = obj;
       }else {
          a.p(p0, "action");
          a.p(p1, "oldState");
       }
       return p1;
    }
}
