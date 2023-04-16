package com.yxcorp.gifshow.camera.record.lensdirty.c;
import io.reactivex.i;
import java.lang.Object;
import brd.c0;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController$ResourceStatus;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import java.lang.Boolean;

public final class c implements i	// class@000e16
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(c0 p0){
       DirtyLensController.C = DirtyLensController$ResourceStatus.DETECTING;
       Category dIRTY_LENS = Category.DIRTY_LENS;
       boolean b = (!p.h(dIRTY_LENS) || !dIRTY_LENS.checkFileValid())? true: false;
       p0.onSuccess(Boolean.valueOf(b));
       return;
    }
}
