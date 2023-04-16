package com.facebook.react.views.modal.ReactModalHostView$a;
import android.content.DialogInterface$OnKeyListener;
import com.facebook.react.views.modal.ReactModalHostView;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import od.a;
import com.facebook.react.views.modal.ReactModalHostView$b;
import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import android.app.Activity;

public class ReactModalHostView$a implements DialogInterface$OnKeyListener	// class@0013cc
{
    public final ReactModalHostView b;

    public void ReactModalHostView$a(ReactModalHostView p0){
       this.b = p0;
       super();
    }
    public boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(ReactModalHostView$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactModalHostView$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p2.getAction() == 1) {
          if (p1 == 4) {
             a.d(this.b.j, "setOnRequestCloseListener must be called by the manager");
             this.b.j.a(p0);
             return true;
          }else {
             Activity currentActiv = this.b.getContext().getCurrentActivity();
             if (currentActiv != null) {
                return currentActiv.onKeyUp(p1, p2);
             }
          }
       }
       return false;
    }
}
