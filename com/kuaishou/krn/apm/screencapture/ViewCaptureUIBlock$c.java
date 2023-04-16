package com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock$c;
import java.lang.Runnable;
import com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock;
import ze.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.System;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Number;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import ek0.d;
import com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock$b;
import java.lang.Throwable;

public final class ViewCaptureUIBlock$c implements Runnable	// class@0007f7
{
    public final ViewCaptureUIBlock b;
    public final m c;

    public void ViewCaptureUIBlock$c(ViewCaptureUIBlock p0,m p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, ViewCaptureUIBlock$c.class, str)) {
          return;
       }
       View view = this.c.p(this.b.d);
       if (view == null) {
          return;
       }
       long l = System.currentTimeMillis();
       ViewCaptureUIBlock$c tb = this.b;
       Objects.requireNonNull(tb);
       Number number = PatchProxy.apply(null, tb, ViewCaptureUIBlock.class, str);
       if (number == PatchProxyResult.class) {
          number = tb.c.getValue();
       }
       ViewCaptureUIBlock$c tb1 = this.b;
       Bitmap uBitmap = tb.b(view, number.intValue(), tb1.e, tb1.f);
       d.e("ScreenCaptureToolbox#ViewCaptureUIBlock execute: captureView cost="+(System.currentTimeMillis() - l)+"ms");
       ViewCaptureUIBlock g = this.b.g;
       if (g != null) {
          g.a(uBitmap);
       }
    label_008d :
       return;
    }
}
