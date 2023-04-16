package com.tachikoma.component.toast.Toast;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import com.tkruntime.v8.V8Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import gx4.c;
import com.tachikoma.core.component.e;
import android.view.View;
import android.widget.Toast;
import android.content.Context;
import iq8.n;
import zp8.a;
import java.lang.CharSequence;

public class Toast extends TKBaseNativeModule	// class@000d2e
{
    public Toast f;

    public void Toast(f p0){
       super(p0);
    }
    public void custom(V8Object p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(Toast.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, Toast.class, "2")) {
          return;
       }
       e nativeModule = this.getNativeModule(p0);
       if (nativeModule == null || nativeModule.getView() == null) {
          a.c("Toast customView is illegal");
          return;
       }else {
          boolean b = ("long").equalsIgnoreCase(p1);
          int i = 17;
          if (("top").equalsIgnoreCase(p2)) {
             i = 48;
          }else if(("bottom").equalsIgnoreCase(p2)){
             i = 80;
          }
          Toast toast = new Toast(this.getContext());
          this.f = toast;
          toast.setView(nativeModule.getView());
          this.f.setGravity(i, 0, n.b(p3));
          this.f.setDuration(b);
          this.f.show();
          return;
       }
    }
    public void hide(){
       if (PatchProxy.applyVoid(null, this, Toast.class, "3")) {
          return;
       }
       Toast tf = this.f;
       if (tf != null) {
          tf.cancel();
       }
       return;
    }
    public void show(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Toast.class, "1")) {
          return;
       }
       Toast toast = Toast.makeText(this.getContext(), p0, ("long").equalsIgnoreCase(p1));
       this.f = toast;
       toast.setText(p0);
       this.f.setGravity(17, 0, 0);
       this.f.show();
       return;
    }
}
