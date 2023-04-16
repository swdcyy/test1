package com.kwai.framework.krn.bridges.viewmanager.KrnReactModalHostView;
import com.facebook.react.views.modal.ReactModalHostView;
import android.content.Context;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import android.os.Build$VERSION;
import android.app.Dialog;
import android.view.Window;
import a2.k;
import ek0.d;
import java.lang.Throwable;
import java.lang.Boolean;
import android.view.View;

public class KrnReactModalHostView extends ReactModalHostView	// class@0015dd
{

    public void KrnReactModalHostView(Context p0){
       super(p0);
    }
    private Activity getCurrentActivity(){
       Object obj = PatchProxy.apply(null, this, KrnReactModalHostView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContext().getCurrentActivity();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, KrnReactModalHostView.class, "1")) {
          return;
       }
       super.c();
       if (Build$VERSION.SDK_INT >= 30) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog == null) {
          return;
       }
       try{
          Activity currentActiv = this.getCurrentActivity();
          if (currentActiv == null || (!currentActiv.isFinishing() && (this.e(currentActiv.getWindow()) && this.e(dialog.getWindow())))) {
             k.a(dialog.getWindow(), true);
             d.e("update react native modal dialog decorView systemUiVisibility to fits system window");
          }
       }catch(java.lang.Exception e0){
          d.c("update react native modal dialog decorView systemUiVisibility error", e0);
       }
    label_0052 :
       return;
    }
    public final boolean e(Window p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnReactModalHostView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       View decorView = p0.getDecorView();
       if (decorView == null) {
          return b;
       }
       int systemUiVisi = decorView.getSystemUiVisibility();
       if ((systemUiVisi & 0x0100) && ((systemUiVisi & 0x0200) && (systemUiVisi & 0x0400))) {
          b = true;
       }
    label_002f :
       return b;
    }
}
