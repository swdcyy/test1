package com.facebook.react.modules.statusbar.StatusBarModule$d;
import java.lang.Runnable;
import com.facebook.react.modules.statusbar.StatusBarModule;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import android.view.View;

public class StatusBarModule$d implements Runnable	// class@0012e5
{
    public final Activity b;
    public final String c;
    public final StatusBarModule d;

    public void StatusBarModule$d(StatusBarModule p0,Activity p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StatusBarModule$d.class, "1")) {
          return;
       }
       View decorView = this.b.getWindow().getDecorView();
       int systemUiVisi = decorView.getSystemUiVisibility();
       systemUiVisi = (("dark-content").equals(this.c))? systemUiVisi | 0x2000: systemUiVisi & 0xdfff;
       decorView.setSystemUiVisibility(systemUiVisi);
       return;
    }
}
