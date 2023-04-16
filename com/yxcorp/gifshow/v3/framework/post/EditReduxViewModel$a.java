package com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$a;
import erd.g;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ooc.g;
import xvc.g;

public final class EditReduxViewModel$a implements g	// class@00152d
{
    public final EditReduxViewModel b;

    public void EditReduxViewModel$a(EditReduxViewModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditReduxViewModel$a.class, "1")) {
       }else {
          this.b.x0(p0.getFirst(), p0.getSecond());
       }
       return;
    }
}
