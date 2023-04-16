package com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$c;
import com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout$b;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nfa.a;
import java.lang.StringBuilder;
import q87.c;
import pfa.b;
import com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import pfa.a;
import ofa.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ofa.e;
import android.animation.Animator$AnimatorListener;

public final class SecondFloorControlPresenter$c implements SecondFloorRefreshLayout$b	// class@001002
{
    public final SecondFloorControlPresenter a;

    public void SecondFloorControlPresenter$c(SecondFloorControlPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object[] objArray = null;
       SecondFloorControlPresenter$c obj = PatchProxy.apply(objArray, this, SecondFloorControlPresenter$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray1 = new Object[0];
       a.C().w("SecondFloorControlPresenter", "onActionUp to enter SecondFloor "+this.a.W8(), objArray1);
       if (this.a.W8()) {
          int i = 2;
          SecondFloorControlPresenter.S8(this.a).f(i);
          boolean b = true;
          SecondFloorControlPresenter.P8(this.a).setEnteringSecondFloor(b);
          obj = this.a;
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoid(objArray, obj, SecondFloorControlPresenter.class, "10") && obj.u == null) {
             float[] uofloatArray = new float[i];
             uofloatArray[0] = 0;
             SecondFloorControlPresenter q = obj.q;
             if (q == null) {
                a.S("mRefreshLayout");
             }
             uofloatArray[b] = (float)q.getMeasuredHeight();
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
             q = obj.s;
             if (q == null) {
                a.S("mSecondFloorConfig");
             }
             valueAnimato.setDuration(q.b());
             valueAnimato.addUpdateListener(new d(obj));
             valueAnimato.addListener(new e(obj));
             valueAnimato.start();
          }
       }
       return 0;
    }
    public boolean b(){
       this.a.v = false;
       return false;
    }
}
