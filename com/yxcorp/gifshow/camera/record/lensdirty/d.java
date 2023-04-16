package com.yxcorp.gifshow.camera.record.lensdirty.d;
import erd.g;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController$ResourceStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.resource.Category;
import t16.a;
import boc.b;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import zd9.e;
import java.lang.Runnable;
import ekd.k1;

public final class d implements g	// class@000e17
{
    public final DirtyLensController b;

    public void d(DirtyLensController p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
          DirtyLensController.C = DirtyLensController$ResourceStatus.UNDETECTED;
       }else if(p0.booleanValue()){
          if (!PatchProxy.applyVoid(null, null, DirtyLensController.class, "24")) {
             DirtyLensController$ResourceStatus dOWNLOADING = DirtyLensController$ResourceStatus.DOWNLOADING;
             if (DirtyLensController.C != dOWNLOADING) {
                DirtyLensController.C = dOWNLOADING;
                n.B(Category.DIRTY_LENS, true, false, false, null, new a("record", "pre_download", "dirtyModelResourceType"));
             }
          }
       }else {
          DirtyLensController.C = DirtyLensController$ResourceStatus.DETECTED;
          if (tb.s != null) {
             k1.o(new e(tb));
          }
       }
       return;
    }
}
