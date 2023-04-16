package oe1.m;
import android.view.View$OnTouchListener;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import android.os.Handler;

public final class m implements View$OnTouchListener	// class@0034d6
{
    public final LiveComboCommentView b;

    public void m(LiveComboCommentView p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       m tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.applyOneRefs(p1, tb, LiveComboCommentView.class, "6");
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tb.j != null){
          int action = p1.getAction();
          int i = 66;
          if (!action) {
             if (tb.m == null) {
                tb.i = System.currentTimeMillis();
                tb.m = b;
                tb.p.removeMessages(i);
                tb.p.sendEmptyMessageDelayed(i, 200);
             }
          }else if(action == b || action == 3){
             tb.p.removeMessages(i);
             tb.i = 0;
             tb.m = false;
          }
       }
       if (tb.j == null || tb.m == null) {
          b = false;
       }
       return b;
    }
}
