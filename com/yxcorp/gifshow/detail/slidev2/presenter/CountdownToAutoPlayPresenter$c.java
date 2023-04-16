package com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$c;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class CountdownToAutoPlayPresenter$c implements View$OnTouchListener	// class@0018ac
{
    public final CountdownToAutoPlayPresenter b;

    public void CountdownToAutoPlayPresenter$c(CountdownToAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, CountdownToAutoPlayPresenter$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       int action = p1.getAction();
       if (action) {
          if (action == 1) {
             this.b.P8();
          }
       }else {
          this.b.R8();
       }
       return false;
    }
}
