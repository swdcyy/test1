package com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$b;
import erd.g;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ooc.g;
import xvc.g;

public final class EditReduxViewModel$b implements g	// class@00152e
{
    public final EditReduxViewModel b;

    public void EditReduxViewModel$b(EditReduxViewModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditReduxViewModel$b.class, "1")) {
       }else {
          this.b.x0(p0.getFirst(), p0.getSecond());
       }
       return;
    }
}
