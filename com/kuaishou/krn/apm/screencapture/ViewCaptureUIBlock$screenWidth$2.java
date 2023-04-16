package com.kuaishou.krn.apm.screencapture.ViewCaptureUIBlock$screenWidth$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.util.DisplayMetrics;
import ze.c;
import java.lang.Integer;

public final class ViewCaptureUIBlock$screenWidth$2 extends Lambda implements a	// class@0007f8
{
    public static final ViewCaptureUIBlock$screenWidth$2 INSTANCE;

    static {
       ViewCaptureUIBlock$screenWidth$2.INSTANCE = new ViewCaptureUIBlock$screenWidth$2();
    }
    public void ViewCaptureUIBlock$screenWidth$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, ViewCaptureUIBlock$screenWidth$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c.d().widthPixels;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
