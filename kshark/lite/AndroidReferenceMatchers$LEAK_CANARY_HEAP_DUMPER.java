package kshark.lite.AndroidReferenceMatchers$LEAK_CANARY_HEAP_DUMPER;
import kshark.lite.AndroidReferenceMatchers;
import java.lang.String;
import nsd.u;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import rtd.n;
import kshark.lite.AndroidReferenceMatchers$Companion;
import java.util.Collection;

public final class AndroidReferenceMatchers$LEAK_CANARY_HEAP_DUMPER extends AndroidReferenceMatchers	// class@001b76
{

    public void AndroidReferenceMatchers$LEAK_CANARY_HEAP_DUMPER(String p0,int p1){
       super(p0, p1, null);
    }
    public void add$com_kwai_performance_stability_oom_monitor_kshark_lite(List p0){
       a.p(p0, "references");
       p0.add(AndroidReferenceMatchers.Companion.c("leakcanary.internal.AndroidHeapDumper", "resumedActivity"));
    }
}