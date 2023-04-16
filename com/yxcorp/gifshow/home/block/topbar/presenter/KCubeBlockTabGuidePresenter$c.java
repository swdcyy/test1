package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$c;
import joc.z;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class KCubeBlockTabGuidePresenter$c extends z	// class@001662
{
    public final KCubeBlockTabGuidePresenter e;

    public void KCubeBlockTabGuidePresenter$c(KCubeBlockTabGuidePresenter p0){
       this.e = p0;
       super();
    }
    public boolean d(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, KCubeBlockTabGuidePresenter$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = true;
       if (p1 != null && (!p1.getActionMasked() || (p1 != null && (p1.getActionMasked() != 2 && (p1 == null || p1.getActionMasked() != b))))) {
          return false;
       }
       KCubeBlockTabGuidePresenter$c te = this.e;
       te.x = b;
       return te.v;
    }
    public boolean f(View p0,MotionEvent p1){
       return false;
    }
}
