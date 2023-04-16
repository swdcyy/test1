package com.yxcorp.gifshow.profile.fragment.RoundCornerLinearLayout$a;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.profile.fragment.RoundCornerLinearLayout;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;

public class RoundCornerLinearLayout$a extends ViewOutlineProvider	// class@001319
{
    public final RoundCornerLinearLayout a;

    public void RoundCornerLinearLayout$a(RoundCornerLinearLayout p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RoundCornerLinearLayout$a.class, "1")) {
          return;
       }
       p1.setRoundRect(new Rect(0, 0, p0.getMeasuredWidth(), p0.getMeasuredHeight()), this.a.b);
       return;
    }
}
