package kshark.lite.AndroidReferenceMatchers;
import java.lang.Enum;
import kshark.lite.AndroidReferenceMatchers$REFERENCES;
import java.lang.String;
import kshark.lite.AndroidReferenceMatchers$FINALIZER_WATCHDOG_DAEMON;
import kshark.lite.AndroidReferenceMatchers$MAIN;
import kshark.lite.AndroidReferenceMatchers$LEAK_CANARY_THREAD;
import kshark.lite.AndroidReferenceMatchers$LEAK_CANARY_HEAP_DUMPER;
import kshark.lite.AndroidReferenceMatchers$LEAK_CANARY_INTERNAL;
import kshark.lite.AndroidReferenceMatchers$EVENT_RECEIVER__MMESSAGE_QUEUE;
import kshark.lite.AndroidReferenceMatchers$Companion;
import nsd.u;
import kshark.lite.AndroidReferenceMatchers$Companion$ALWAYS$1;
import java.util.Set;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.util.EnumSet;
import kotlin.jvm.internal.a;
import rtd.n;
import msd.l;
import rtd.r;
import kshark.lite.ReferencePattern$InstanceFieldPattern;
import kshark.lite.ReferencePattern;
import kshark.lite.ReferencePattern$NativeGlobalVariablePattern;
import kshark.lite.ReferencePattern$StaticFieldPattern;
import java.lang.Class;

public abstract class AndroidReferenceMatchers extends Enum	// class@001b7b
{
    public static final AndroidReferenceMatchers[] $VALUES;
    public static final l ALWAYS;
    public static final AndroidReferenceMatchers$Companion Companion;
    public static final AndroidReferenceMatchers EVENT_RECEIVER__MMESSAGE_QUEUE;
    public static final AndroidReferenceMatchers FINALIZER_WATCHDOG_DAEMON;
    public static final AndroidReferenceMatchers LEAK_CANARY_HEAP_DUMPER;
    public static final AndroidReferenceMatchers LEAK_CANARY_INTERNAL;
    public static final AndroidReferenceMatchers LEAK_CANARY_THREAD;
    public static final AndroidReferenceMatchers MAIN;
    public static final AndroidReferenceMatchers REFERENCES;

    static {
       AndroidReferenceMatchers$REFERENCES rEFERENCES;
       AndroidReferenceMatchers$FINALIZER_WATCHDOG_DAEMON uFINALIZER_W;
       AndroidReferenceMatchers$MAIN mAIN;
       AndroidReferenceMatchers$LEAK_CANARY_THREAD lEAK_CANARY_;
       AndroidReferenceMatchers$LEAK_CANARY_HEAP_DUMPER lEAK_CANARY_1;
       AndroidReferenceMatchers$LEAK_CANARY_INTERNAL lEAK_CANARY_2;
       AndroidReferenceMatchers$EVENT_RECEIVER__MMESSAGE_QUEUE uEVENT_RECEI;
       AndroidReferenceMatchers[] uAndroidRefe = new AndroidReferenceMatchers[]{rEFERENCES,uFINALIZER_W,mAIN,lEAK_CANARY_,lEAK_CANARY_1,lEAK_CANARY_2,uEVENT_RECEI};
       rEFERENCES = new AndroidReferenceMatchers$REFERENCES("REFERENCES", 0);
       AndroidReferenceMatchers.REFERENCES = rEFERENCES;
       uFINALIZER_W = new AndroidReferenceMatchers$FINALIZER_WATCHDOG_DAEMON("FINALIZER_WATCHDOG_DAEMON", 1);
       AndroidReferenceMatchers.FINALIZER_WATCHDOG_DAEMON = uFINALIZER_W;
       mAIN = new AndroidReferenceMatchers$MAIN("MAIN", 2);
       AndroidReferenceMatchers.MAIN = mAIN;
       lEAK_CANARY_ = new AndroidReferenceMatchers$LEAK_CANARY_THREAD("LEAK_CANARY_THREAD", 3);
       AndroidReferenceMatchers.LEAK_CANARY_THREAD = lEAK_CANARY_;
       lEAK_CANARY_1 = new AndroidReferenceMatchers$LEAK_CANARY_HEAP_DUMPER("LEAK_CANARY_HEAP_DUMPER", 4);
       AndroidReferenceMatchers.LEAK_CANARY_HEAP_DUMPER = lEAK_CANARY_1;
       lEAK_CANARY_2 = new AndroidReferenceMatchers$LEAK_CANARY_INTERNAL("LEAK_CANARY_INTERNAL", 5);
       AndroidReferenceMatchers.LEAK_CANARY_INTERNAL = lEAK_CANARY_2;
       uEVENT_RECEI = new AndroidReferenceMatchers$EVENT_RECEIVER__MMESSAGE_QUEUE("EVENT_RECEIVER__MMESSAGE_QUEUE", 6);
       AndroidReferenceMatchers.EVENT_RECEIVER__MMESSAGE_QUEUE = uEVENT_RECEI;
       AndroidReferenceMatchers.$VALUES = uAndroidRefe;
       AndroidReferenceMatchers.Companion = new AndroidReferenceMatchers$Companion(null);
       AndroidReferenceMatchers.ALWAYS = AndroidReferenceMatchers$Companion$ALWAYS$1.INSTANCE;
    }
    public void AndroidReferenceMatchers(String p0,int p1){
       super(p0, p1);
    }
    public void AndroidReferenceMatchers(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static final List buildKnownReferences(Set p0){
       return AndroidReferenceMatchers.Companion.a(p0);
    }
    public static final List getAppDefaults(){
       return AndroidReferenceMatchers.Companion.b();
    }
    public static final List getIgnoredReferencesOnly(){
       AndroidReferenceMatchers$Companion companion = AndroidReferenceMatchers.Companion;
       Objects.requireNonNull(companion);
       EnumSet uEnumSet = EnumSet.of(AndroidReferenceMatchers.REFERENCES, AndroidReferenceMatchers.FINALIZER_WATCHDOG_DAEMON, AndroidReferenceMatchers.MAIN, AndroidReferenceMatchers.LEAK_CANARY_THREAD, AndroidReferenceMatchers.EVENT_RECEIVER__MMESSAGE_QUEUE);
       a.o(uEnumSet, "EnumSet.of\(\n          RE¡­_MMESSAGE_QUEUE\n        \)");
       return companion.a(uEnumSet);
    }
    public static final n ignoredInstanceField(String p0,String p1){
       return AndroidReferenceMatchers.Companion.c(p0, p1);
    }
    public static final n ignoredJavaLocal(String p0){
       return AndroidReferenceMatchers.Companion.d(p0);
    }
    public static final r instanceFieldLeak(String p0,String p1,String p2,l p3){
       AndroidReferenceMatchers$Companion companion = AndroidReferenceMatchers.Companion;
       Objects.requireNonNull(companion);
       a.p(p0, "className");
       a.p(p1, "fieldName");
       a.p(p2, "description");
       a.p(p3, "patternApplies");
       return companion.e(new ReferencePattern$InstanceFieldPattern(p0, p1), p2, p3);
    }
    public static final r nativeGlobalVariableLeak(String p0,String p1,l p2){
       AndroidReferenceMatchers$Companion companion = AndroidReferenceMatchers.Companion;
       Objects.requireNonNull(companion);
       a.p(p0, "className");
       a.p(p1, "description");
       a.p(p2, "patternApplies");
       return companion.e(new ReferencePattern$NativeGlobalVariablePattern(p0), p1, p2);
    }
    public static final r staticFieldLeak(String p0,String p1,String p2,l p3){
       AndroidReferenceMatchers$Companion companion = AndroidReferenceMatchers.Companion;
       Objects.requireNonNull(companion);
       a.p(p0, "className");
       a.p(p1, "fieldName");
       a.p(p2, "description");
       a.p(p3, "patternApplies");
       return companion.e(new ReferencePattern$StaticFieldPattern(p0, p1), p2, p3);
    }
    public static AndroidReferenceMatchers valueOf(String p0){
       return Enum.valueOf(AndroidReferenceMatchers.class, p0);
    }
    public static AndroidReferenceMatchers[] values(){
       return AndroidReferenceMatchers.$VALUES.clone();
    }
    public abstract void add$com_kwai_performance_stability_oom_monitor_kshark_lite(List p0);
}
