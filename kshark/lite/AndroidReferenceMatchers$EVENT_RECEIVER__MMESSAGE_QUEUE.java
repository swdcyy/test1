package kshark.lite.AndroidReferenceMatchers$EVENT_RECEIVER__MMESSAGE_QUEUE;
import kshark.lite.AndroidReferenceMatchers;
import java.lang.String;
import nsd.u;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import rtd.n;
import kshark.lite.AndroidReferenceMatchers$Companion;
import java.util.Collection;

public final class AndroidReferenceMatchers$EVENT_RECEIVER__MMESSAGE_QUEUE extends AndroidReferenceMatchers	// class@001b74
{

    public void AndroidReferenceMatchers$EVENT_RECEIVER__MMESSAGE_QUEUE(String p0,int p1){
       super(p0, p1, null);
    }
    public void add$com_kwai_performance_stability_oom_monitor_kshark_lite(List p0){
       a.p(p0, "references");
       p0.add(AndroidReferenceMatchers.Companion.c("android.view.Choreographer$FrameDisplayEventReceiver", "mMessageQueue"));
    }
}