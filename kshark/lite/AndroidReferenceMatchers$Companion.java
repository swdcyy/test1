package kshark.lite.AndroidReferenceMatchers$Companion;
import java.lang.Object;
import nsd.u;
import java.util.Set;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kshark.lite.AndroidReferenceMatchers;
import java.lang.Class;
import java.util.EnumSet;
import rtd.n;
import kshark.lite.ReferencePattern$InstanceFieldPattern;
import kshark.lite.ReferencePattern;
import kshark.lite.ReferencePattern$JavaLocalPattern;
import msd.l;
import rtd.r;
import kshark.lite.AndroidReferenceMatchers$Companion$libraryLeak$1;

public final class AndroidReferenceMatchers$Companion	// class@001b73
{

    public void AndroidReferenceMatchers$Companion(){
       super();
    }
    public void AndroidReferenceMatchers$Companion(u p0){
       super();
    }
    public final List a(Set p0){
       a.p(p0, "referenceMatchers");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().add$com_kwai_performance_stability_oom_monitor_kshark_lite(uArrayList);
       }
       return uArrayList;
    }
    public final List b(){
       EnumSet uEnumSet = EnumSet.allOf(AndroidReferenceMatchers.class);
       a.o(uEnumSet, "EnumSet.allOf\(AndroidRef¡­enceMatchers::class.java\)");
       return AndroidReferenceMatchers.Companion.a(uEnumSet);
    }
    public final n c(String p0,String p1){
       a.p(p0, "className");
       a.p(p1, "fieldName");
       return new n(new ReferencePattern$InstanceFieldPattern(p0, p1));
    }
    public final n d(String p0){
       a.p(p0, "threadName");
       return new n(new ReferencePattern$JavaLocalPattern(p0));
    }
    public final r e(ReferencePattern p0,String p1,l p2){
       return new r(p0, p1, new AndroidReferenceMatchers$Companion$libraryLeak$1(p2));
    }
}
