package com.yxcorp.gifshow.homebottom.presenter.OppoPreventBurnInCameraPresenter$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.homebottom.presenter.OppoPreventBurnInCameraPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.k1;

public class OppoPreventBurnInCameraPresenter$a implements Runnable	// class@00168f
{
    public final OppoPreventBurnInCameraPresenter b;

    public void OppoPreventBurnInCameraPresenter$a(OppoPreventBurnInCameraPresenter p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInCameraPresenter$a.class, "1")) {
          return;
       }
       OppoPreventBurnInCameraPresenter$a tb = this.b;
       OppoPreventBurnInCameraPresenter q = tb.q;
       if (q != null) {
          float f = (tb.t != null)? 0: (float)tb.s;
          q.setTranslationX(f);
       }
       tb = this.b;
       tb.t = tb.t ^ 0x01;
       k1.r(tb.u, tb.r);
       return;
    }
}
