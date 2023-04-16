package com.kwai.performance.stability.crash.monitor.internal.AnrHandler$getAnrReason$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.stability.crash.monitor.internal.AnrHandler;
import java.lang.String;

public final class AnrHandler$getAnrReason$1 extends Lambda implements a	// class@0011dd
{
    public final File $reasonFile;

    public void AnrHandler$getAnrReason$1(File p0){
       this.$reasonFile = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       AnrHandler.r.f(null, this.$reasonFile);
    }
}
