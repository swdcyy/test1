package com.yxcorp.gifshow.postentrance.CameraViewSwitcher$e;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;

public final class CameraViewSwitcher$e implements CameraViewSwitcher$d	// class@001003
{

    public void CameraViewSwitcher$e(){
       super();
    }
    public void a(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraViewSwitcher$e.class, "1")) {
          return;
       }
       a.p(p0, "previousView");
       a.p(p1, "nextView");
       n.Y(p0, 8, false);
       n.Y(p1, false, false);
       p1.setAlpha(0x3f800000);
       return;
    }
}
