package com.kwai.feature.component.commonfragment.baseeditor.FitsLandscapeSystemWindowLinearLayout;
import com.kwai.feature.component.commonfragment.baseeditor.FitSystemWindowLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.graphics.Rect;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.content.res.Configuration;
import com.yxcorp.utility.n;

public class FitsLandscapeSystemWindowLinearLayout extends FitSystemWindowLinearLayout	// class@0011f5
{
    public boolean c;

    public void FitsLandscapeSystemWindowLinearLayout(Context p0){
       super(p0);
       this.c = false;
    }
    public void FitsLandscapeSystemWindowLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = false;
    }
    public WindowInsets computeSystemWindowInsets(WindowInsets p0,Rect p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FitsLandscapeSystemWindowLinearLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = super.computeSystemWindowInsets(p0, p1);
       obj = (this.c != null || (this.getResources().getConfiguration().orientation == 2 && p1.top == n.A(this.getContext())))? 1: 0;
       if (obj) {
          p1.top = 0;
       }
       return p0;
    }
    public void setForceClearOutLocalInsetsTop(boolean p0){
       this.c = p0;
    }
}
