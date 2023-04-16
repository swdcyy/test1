package com.facebook.react.uimanager.h$c;
import java.lang.Runnable;
import com.facebook.react.uimanager.h;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h$c implements Runnable	// class@00134b
{
    public final UIManager b;
    public final int c;
    public final ReadableMap d;
    public final h e;

    public void h$c(h p0,UIManager p1,int p2,ReadableMap p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, h$c.class, "1")) {
          return;
       }
       this.b.synchronouslyUpdateViewOnUIThread(this.c, this.d);
       return;
    }
}
