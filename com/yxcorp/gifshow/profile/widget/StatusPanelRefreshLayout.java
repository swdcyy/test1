package com.yxcorp.gifshow.profile.widget.StatusPanelRefreshLayout;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;

public final class StatusPanelRefreshLayout extends CustomRefreshLayout	// class@001605
{

    public void StatusPanelRefreshLayout(Context p0){
       super(p0);
    }
    public void StatusPanelRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(StatusPanelRefreshLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, StatusPanelRefreshLayout.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = (this.isEnabled() && (p2 & 0x02))? true: false;
       return b;
    }
}