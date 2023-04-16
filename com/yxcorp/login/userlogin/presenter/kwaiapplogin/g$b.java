package com.yxcorp.login.userlogin.presenter.kwaiapplogin.g$b;
import android.view.View$OnTouchListener;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.g;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.Button;

public class g$b implements View$OnTouchListener	// class@001bc9
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, g$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!p1.getAction()) {
          this.b.s.setAlpha(0x3f000000);
       }else if(p1.getAction() == 1){
          this.b.s.setAlpha(0x3f800000);
       }
       return false;
    }
}
