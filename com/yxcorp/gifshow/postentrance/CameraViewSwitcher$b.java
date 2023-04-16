package com.yxcorp.gifshow.postentrance.CameraViewSwitcher$b;
import android.view.View$OnLongClickListener;
import msd.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class CameraViewSwitcher$b implements View$OnLongClickListener	// class@000fff
{
    public final l b;

    public void CameraViewSwitcher$b(l p0){
       this.b = p0;
       super();
    }
    public final boolean onLongClick(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraViewSwitcher$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.invoke(p0);
       return true;
    }
}
