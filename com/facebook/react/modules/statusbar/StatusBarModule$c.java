package com.facebook.react.modules.statusbar.StatusBarModule$c;
import java.lang.Runnable;
import com.facebook.react.modules.statusbar.StatusBarModule;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;

public class StatusBarModule$c implements Runnable	// class@0012e4
{
    public final boolean b;
    public final Activity c;
    public final StatusBarModule d;

    public void StatusBarModule$c(StatusBarModule p0,boolean p1,Activity p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StatusBarModule$c.class, "1")) {
          return;
       }
       if (this.b != null) {
          this.c.getWindow().addFlags(1024);
          this.c.getWindow().clearFlags(2048);
       }else {
          this.c.getWindow().addFlags(2048);
          this.c.getWindow().clearFlags(1024);
       }
       return;
    }
}
