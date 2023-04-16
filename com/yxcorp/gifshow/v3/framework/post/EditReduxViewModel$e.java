package com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$e;
import xvc.m;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.Object;
import xvc.g;
import tvc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class EditReduxViewModel$e implements m	// class@001531
{
    public final EditReduxViewModel a;

    public void EditReduxViewModel$e(EditReduxViewModel p0){
       this.a = p0;
       super();
    }
    public Object a(Object p0,Object p1){
       e uoe = PatchProxy.applyTwoRefs(p0, p1, this, EditReduxViewModel$e.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          a.o(p0, "from");
          a.o(p1, "old");
          uoe = this.a.w0(p0, p1);
       }
       return uoe;
    }
}
