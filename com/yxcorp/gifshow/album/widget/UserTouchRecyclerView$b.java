package com.yxcorp.gifshow.album.widget.UserTouchRecyclerView$b;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.album.widget.UserTouchRecyclerView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class UserTouchRecyclerView$b implements View$OnTouchListener	// class@001b13
{
    public final UserTouchRecyclerView b;

    public void UserTouchRecyclerView$b(UserTouchRecyclerView p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, UserTouchRecyclerView$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.h(p1, "event");
       int action = p1.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action != 2) {
                if (action == 3) {
                }
             }else {
             label_0031 :
                UserTouchRecyclerView$b tb = this.b;
                tb.d = b;
                tb.c = b;
                tb.e = (int)p1.getX();
                tb.f = (int)p1.getY();
             }
          }else {
          }
       }else {
          goto label_0031 ;
       }
       return false;
    }
}
