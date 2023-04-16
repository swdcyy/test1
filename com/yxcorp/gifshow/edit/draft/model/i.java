package com.yxcorp.gifshow.edit.draft.model.i;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Object;
import java.io.File;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.edit.draft.model.w;
import io.reactivex.g;
import brd.z;

public final class i implements o	// class@001b00
{
    public final DraftFileManager b;
    public final long c;

    public void i(DraftFileManager p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       t ot;
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       if (PatchProxy.isSupport(uDraftFileMa)) {
          ot = PatchProxy.applyTwoRefs(Long.valueOf(tc), p0, tb, uDraftFileMa, "25");
          if (ot != PatchProxyResult.class) {
          label_0031 :
             return ot;
          }
       }
       ot = t.create(new w(tb, p0, tc)).subscribeOn(tb.c);
       goto label_0031 ;
    }
}
