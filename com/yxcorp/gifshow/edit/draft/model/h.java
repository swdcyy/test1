package com.yxcorp.gifshow.edit.draft.model.h;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Object;
import java.io.File;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.a0;
import com.yxcorp.gifshow.edit.draft.model.v;
import java.util.concurrent.Callable;
import brd.z;
import brd.t;

public final class h implements o	// class@001aff
{
    public final DraftFileManager b;

    public void h(DraftFileManager p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       a0 uoa0 = PatchProxy.applyOneRefs(p0, tb, DraftFileManager.class, "27");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          uoa0 = a0.y(new v(tb, p0)).T(tb.c);
       }
       return uoa0.d0();
    }
}
