package com.yxcorp.gifshow.camera.record.lensdirty.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController;
import j8c.a;
import java.lang.String;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;

public final class e implements g	// class@000e18
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       a.D().u("DirtyLensController", p0, objArray);
       PostUtils.D("DirtyLensController", "prepareSecondTip error", p0);
    }
}
