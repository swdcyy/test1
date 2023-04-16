package com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox$a;
import java.lang.Runnable;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock;
import mi0.b;
import java.lang.StringBuilder;
import com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox;
import java.io.File;
import com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock$b;
import ze.q0;

public final class ScreenCaptureToolbox$a implements Runnable	// class@0007f0
{
    public final UIManagerModule b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public void ScreenCaptureToolbox$a(UIManagerModule p0,int p1,String p2,int p3,int p4,int p5,int p6){
       a.p(p0, "uiManager");
       a.p(p2, "pageId");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ScreenCaptureToolbox$a.class, "1")) {
          return;
       }
       ScreenCaptureToolbox$a tb = this.b;
       ScreenCaptureToolbox$a tc = this.c;
       ScreenCaptureToolbox$a tf = this.f;
       ScreenCaptureToolbox$a tg = this.g;
       StringBuilder str = "";
       String f = ScreenCaptureToolbox.f;
       if (f == null) {
          a.S("baseDir");
       }
       tb.addUIBlock(new ViewCaptureUIBlock(tc, tf, tg, new b(str+f+File.separator+"krnscreenshot", this.d, this.e, this.h)));
       return;
    }
}
