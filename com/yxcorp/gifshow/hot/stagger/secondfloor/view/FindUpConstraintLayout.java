package com.yxcorp.gifshow.hot.stagger.secondfloor.view.FindUpConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yxcorp.gifshow.hot.stagger.secondfloor.view.FindUpConstraintLayout$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import xva.a;
import android.view.View;

public final class FindUpConstraintLayout extends ConstraintLayout	// class@0018de
{
    public a B;
    public static final FindUpConstraintLayout$a C;

    static {
       FindUpConstraintLayout.C = new FindUpConstraintLayout$a(null);
    }
    public void FindUpConstraintLayout(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void FindUpConstraintLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void FindUpConstraintLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Integer obj = PatchProxy.applyOneRefs(p0, this, FindUpConstraintLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = (p0 != null)? Integer.valueOf(p0.getAction()): null;
       if (obj != null && obj.intValue() == 1) {
          FindUpConstraintLayout tB = this.B;
          if (tB != null) {
             tB.a();
          }
       }
       return super.onTouchEvent(p0);
    }
    public final void setUpActionListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FindUpConstraintLayout.class, "2")) {
          return;
       }
       a.p(p0, "upActionListener");
       this.B = p0;
       return;
    }
}
