package kshark.lite.AndroidReferenceMatchers$REFERENCES;
import kshark.lite.AndroidReferenceMatchers;
import java.lang.String;
import nsd.u;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import java.lang.Class;
import rtd.n;
import kshark.lite.AndroidReferenceMatchers$Companion;
import java.util.Collection;
import java.lang.ref.SoftReference;
import java.lang.ref.PhantomReference;

public final class AndroidReferenceMatchers$REFERENCES extends AndroidReferenceMatchers	// class@001b7a
{

    public void AndroidReferenceMatchers$REFERENCES(String p0,int p1){
       super(p0, p1, null);
    }
    public void add$com_kwai_performance_stability_oom_monitor_kshark_lite(List p0){
       a.p(p0, "references");
       AndroidReferenceMatchers$Companion companion = AndroidReferenceMatchers.Companion;
       String name = WeakReference.class.getName();
       a.o(name, "WeakReference::class.java.name");
       p0.add(companion.c(name, "referent"));
       p0.add(companion.c("leakcanary.KeyedWeakReference", "referent"));
       name = SoftReference.class.getName();
       a.o(name, "SoftReference::class.java.name");
       p0.add(companion.c(name, "referent"));
       name = PhantomReference.class.getName();
       a.o(name, "PhantomReference::class.java.name");
       p0.add(companion.c(name, "referent"));
       p0.add(companion.c("java.lang.ref.Finalizer", "prev"));
       p0.add(companion.c("java.lang.ref.Finalizer", "element"));
       p0.add(companion.c("java.lang.ref.Finalizer", "next"));
       p0.add(companion.c("java.lang.ref.FinalizerReference", "prev"));
       p0.add(companion.c("java.lang.ref.FinalizerReference", "element"));
       p0.add(companion.c("java.lang.ref.FinalizerReference", "next"));
       p0.add(companion.c("sun.misc.Cleaner", "prev"));
       p0.add(companion.c("sun.misc.Cleaner", "next"));
    }
}
