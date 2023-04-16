package com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class LiveTempEnhanceView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0017ad
{
    public final LiveTempEnhanceView b;

    public void LiveTempEnhanceView$a(LiveTempEnhanceView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, LiveTempEnhanceView$a.class, "1")) {
          return;
       }
       this.b.d();
       this.b.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
