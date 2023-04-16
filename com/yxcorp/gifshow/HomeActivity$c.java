package com.yxcorp.gifshow.HomeActivity$c;
import o07.b;
import java.lang.Object;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t;
import u07.t$a;
import kzc.d;
import java.lang.StringBuilder;
import k2b.u1;

public class HomeActivity$c implements b	// class@0012e8
{

    public void HomeActivity$c(){
       super();
    }
    public void c(Activity p0,c p1){
    }
    public void e(Activity p0,c p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, HomeActivity$c.class, "1")) {
          return;
       }
       if (p1 instanceof t) {
          t$a uoa = p1.b0();
          if (uoa instanceof d) {
             u1.R("popup_exception", "dialog_id="+uoa.d(), 14);
          }
       }
       PatchProxy.onMethodExit(HomeActivity$c.class, "1");
       return;
    }
    public void h(Activity p0,c p1){
    }
}
