package com.tachikoma.core.component.TKYogaLayout;
import com.tachikoma.core.yoga.layout.YogaLayout;
import android.content.Context;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.tachikoma.core.component.TKYogaLayout$a;
import android.view.ViewGroup;

public class TKYogaLayout extends YogaLayout	// class@000d57
{
    public TKYogaLayout$a l;

    public void TKYogaLayout(Context p0){
       super(p0);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       TKYogaLayout obj = PatchProxy.applyOneRefs(p0, this, TKYogaLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.l;
       if (obj != null) {
          return obj.dispatchTouchEvent(p0);
       }
       return super.dispatchTouchEvent(p0);
    }
    public void g(){
       this.l = null;
    }
}
