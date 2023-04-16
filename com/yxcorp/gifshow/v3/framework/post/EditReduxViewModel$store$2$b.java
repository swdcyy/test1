package com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$store$2$b;
import msd.p;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$store$2;
import java.lang.Object;
import xvc.b;
import tvc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class EditReduxViewModel$store$2$b implements p	// class@001534
{
    public final EditReduxViewModel$store$2 b;

    public void EditReduxViewModel$store$2$b(EditReduxViewModel$store$2 p0){
       this.b = p0;
       super();
    }
    public Object invoke(Object p0,Object p1){
       e uoe = PatchProxy.applyTwoRefs(p0, p1, this, EditReduxViewModel$store$2$b.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          a.p(p0, "action");
          a.p(p1, "oldState");
          uoe = this.b.this$0.v0(p0, p1);
       }
       return uoe;
    }
}
