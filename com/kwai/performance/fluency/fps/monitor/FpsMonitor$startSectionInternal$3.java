package com.kwai.performance.fluency.fps.monitor.FpsMonitor$startSectionInternal$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import android.view.Window;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;

public final class FpsMonitor$startSectionInternal$3 extends Lambda implements a	// class@001065
{
    public final String $section;
    public final Window $window;

    public void FpsMonitor$startSectionInternal$3(String p0,Window p1){
       this.$section = p0;
       this.$window = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       FpsMonitor.INSTANCE.stopSectionInternal(this.$section, this.$window, true);
    }
}
