package com.kwai.performance.fluency.fps.monitor.FpsMonitor$stopSectionInternal$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import ye7.a;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;

public final class FpsMonitor$stopSectionInternal$2 extends Lambda implements a	// class@001066
{
    public final a $afterUpload;
    public final a $fpsEvent;
    public final boolean $isDumpAvailable;
    public final boolean $manualCalled;
    public final String $section;

    public void FpsMonitor$stopSectionInternal$2(String p0,a p1,boolean p2,boolean p3,a p4){
       this.$section = p0;
       this.$fpsEvent = p1;
       this.$manualCalled = p2;
       this.$isDumpAvailable = p3;
       this.$afterUpload = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       FpsMonitor.INSTANCE.uploadFpsEvent(this.$section, this.$fpsEvent, this.$manualCalled, this.$isDumpAvailable, this.$afterUpload);
    }
}
