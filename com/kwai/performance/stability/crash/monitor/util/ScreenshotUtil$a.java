package com.kwai.performance.stability.crash.monitor.util.ScreenshotUtil$a;
import android.view.View;
import android.graphics.Rect;
import android.view.WindowManager$LayoutParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.IBinder;

public final class ScreenshotUtil$a	// class@00120d
{
    public final View a;
    public final Rect b;
    public final WindowManager$LayoutParams c;

    public void ScreenshotUtil$a(View p0,Rect p1,WindowManager$LayoutParams p2){
       a.p(p0, "view");
       a.p(p1, "winFrame");
       a.p(p2, "layoutParams");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final IBinder a(){
       return this.c.token;
    }
}
