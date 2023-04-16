package com.facebook.react.modules.statusbar.StatusBarModule$b;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.bridge.ReactContext;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import android.view.View;
import com.facebook.react.modules.statusbar.StatusBarModule$b$a;
import android.view.View$OnApplyWindowInsetsListener;
import a2.i0;

public class StatusBarModule$b extends GuardedRunnable	// class@0012e3
{
    public final Activity b;
    public final boolean c;
    public final StatusBarModule d;

    public void StatusBarModule$b(StatusBarModule p0,ReactContext p1,Activity p2,boolean p3){
       this.d = p0;
       this.b = p2;
       this.c = p3;
       super(p1);
    }
    public void runGuarded(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StatusBarModule$b.class, "1")) {
          return;
       }
       View decorView = this.b.getWindow().getDecorView();
       if (this.c != null) {
          decorView.setOnApplyWindowInsetsListener(new StatusBarModule$b$a(this));
       }else {
          decorView.setOnApplyWindowInsetsListener(objArray);
       }
       i0.p0(decorView);
       return;
    }
}
