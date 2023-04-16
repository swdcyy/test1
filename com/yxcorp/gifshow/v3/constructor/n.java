package com.yxcorp.gifshow.v3.constructor.n;
import erd.g;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$PostConstructEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.c;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import qoc.k0;
import com.yxcorp.gifshow.v3.constructor.p;
import crd.b;
import crd.a;

public final class n implements g	// class@000d4d
{
    public final WorkspaceConstructor b;
    public final c c;

    public void n(WorkspaceConstructor p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidTwoRefs(p0, tc, tb, WorkspaceConstructor.class, "8")) {
       }else {
          int i = 0;
          if (!tc.D()) {
             Object[] objArray = new Object[i];
             a.D().A("WorkspaceConstructor", "Post construct event "+p0+" happened after draft completed editing.", objArray);
          }else {
             tb.e.c(DraftFileManager.E().j0(tc, i).subscribe(new k0(tb, p0), p.b));
          }
       }
       return;
    }
}
