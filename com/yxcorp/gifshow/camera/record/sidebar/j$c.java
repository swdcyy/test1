package com.yxcorp.gifshow.camera.record.sidebar.j$c;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ScrollView;
import com.yxcorp.gifshow.camera.record.sidebar.SidebarShaderLinearLayout;

public class j$c implements View$OnTouchListener	// class@000f1c
{
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, j$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       j$c tb = this.b;
       j b = tb.B;
       if (b != null) {
          boolean b1 = (tb.o == null && tb.v.getScrollY())? true: false;
          b.b(b1, true);
       }
       return this.b.o;
    }
}
