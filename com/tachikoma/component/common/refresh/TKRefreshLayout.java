package com.tachikoma.component.common.refresh.TKRefreshLayout;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;
import com.kwai.library.widget.refresh.RefreshLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class TKRefreshLayout extends CustomRefreshLayout	// class@000ce6
{

    public void TKRefreshLayout(Context p0){
       super(p0);
    }
    public void TKRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void setRefreshView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKRefreshLayout.class, "1")) {
          return;
       }
       this.removeView(this.N);
       this.N = p0;
       p0.setVisibility(8);
       this.N.setLayoutParams(new RefreshLayout$LayoutParams(-1, -2));
       this.addView(this.N);
       return;
    }
}
