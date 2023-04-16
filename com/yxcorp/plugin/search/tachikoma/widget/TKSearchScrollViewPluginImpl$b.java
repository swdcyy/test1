package com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$b;
import android.view.View$OnAttachStateChangeListener;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKSearchScrollViewPluginImpl$b implements View$OnAttachStateChangeListener	// class@000775
{
    public final View b;
    public final TKSearchScrollViewPluginImpl c;

    public void TKSearchScrollViewPluginImpl$b(TKSearchScrollViewPluginImpl p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollViewPluginImpl$b.class, "1")) {
          return;
       }
       TKSearchScrollViewPluginImpl$b tc = this.c;
       tc.B40(this.b, tc.l);
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
}
