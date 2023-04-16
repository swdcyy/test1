package com.facebook.react.modules.dialog.DialogModule$b;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnDismissListener;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;

public class DialogModule$b implements DialogInterface$OnClickListener, DialogInterface$OnDismissListener	// class@0012ab
{
    public final Callback b;
    public boolean c;
    public final DialogModule d;

    public void DialogModule$b(DialogModule p0,Callback p1){
       this.d = p0;
       super();
       this.c = false;
       this.b = p1;
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(DialogModule$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, DialogModule$b.class, "1")) {
          return;
       }
       if (this.c == null && this.d.getReactApplicationContext().hasActiveCatalystInstance()) {
          Object[] objArray = new Object[]{"buttonClicked",Integer.valueOf(p1)};
          this.b.invoke(objArray);
          this.c = true;
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogModule$b.class, "2")) {
          return;
       }
       if (this.c == null && this.d.getReactApplicationContext().hasActiveCatalystInstance()) {
          Object[] objArray = new Object[]{"dismissed"};
          this.b.invoke(objArray);
          this.c = true;
       }
       return;
    }
}
