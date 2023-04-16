package com.kuaishou.live.gzone.barrage.b;
import android.view.View$OnTouchListener;
import com.kuaishou.live.gzone.barrage.BarrageView;
import com.kuaishou.live.gzone.barrage.BarrageView$d;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class b implements View$OnTouchListener	// class@001c2f
{
    public final BarrageView$d b;
    public final BarrageView c;

    public void b(BarrageView p0,BarrageView$d p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p1.getAction()) {
          b tc = this.c;
          tc.t = this.b;
          tc.v = p0;
       }
       return true;
    }
}
