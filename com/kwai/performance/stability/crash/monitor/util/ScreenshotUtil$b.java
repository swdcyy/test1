package com.kwai.performance.stability.crash.monitor.util.ScreenshotUtil$b;
import java.util.Comparator;
import java.lang.Object;
import android.view.SurfaceView;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.util.g;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class ScreenshotUtil$b implements Comparator	// class@00120e
{

    public void ScreenshotUtil$b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return b.f(g.d(p0, "mSubLayer"), g.d(p1, "mSubLayer"));
    }
}
