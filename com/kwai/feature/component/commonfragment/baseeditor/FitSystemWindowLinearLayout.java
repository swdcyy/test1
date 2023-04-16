package com.kwai.feature.component.commonfragment.baseeditor.FitSystemWindowLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.utility.n;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.WindowInsets;
import android.os.Build$VERSION;
import android.graphics.Insets;
import android.view.View;

public class FitSystemWindowLinearLayout extends LinearLayout	// class@0011f4
{
    public final int b;

    public void FitSystemWindowLinearLayout(Context p0){
       super(p0);
       this.b = n.c(this.getContext(), (float)a.t().a("keyboardHeightBarrierDp", 50));
    }
    public void FitSystemWindowLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = n.c(this.getContext(), (float)a.t().a("keyboardHeightBarrierDp", 50));
    }
    public void FitSystemWindowLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = n.c(this.getContext(), (float)a.t().a("keyboardHeightBarrierDp", 50));
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, FitSystemWindowLinearLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getPaddingBottom() < this.b)? true: false;
       return b;
    }
    public WindowInsets onApplyWindowInsets(WindowInsets p0){
       Insets obj = PatchProxy.applyOneRefs(p0, this, FitSystemWindowLinearLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (Build$VERSION.SDK_INT >= 29) {
          obj = p0.getSystemGestureInsets().bottom;
       }
       super.onApplyWindowInsets(p0);
       if (this.getFitsSystemWindows() && (obj > null && (this.a() && this.getPaddingBottom() >= obj))) {
          this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), (this.getPaddingBottom() - obj));
       }
    label_0047 :
       return p0;
    }
}
