package kshark.lite.LeakTrace$GcRootType;
import java.lang.Enum;
import java.lang.String;
import kshark.lite.LeakTrace$GcRootType$a;
import nsd.u;
import java.lang.Class;
import java.lang.Object;

public final class LeakTrace$GcRootType extends Enum	// class@001ba6
{
    public final String description;
    public static final LeakTrace$GcRootType[] $VALUES;
    public static final LeakTrace$GcRootType$a Companion;
    public static final LeakTrace$GcRootType JAVA_FRAME;
    public static final LeakTrace$GcRootType JNI_GLOBAL;
    public static final LeakTrace$GcRootType JNI_LOCAL;
    public static final LeakTrace$GcRootType JNI_MONITOR;
    public static final LeakTrace$GcRootType MONITOR_USED;
    public static final LeakTrace$GcRootType NATIVE_STACK;
    public static final LeakTrace$GcRootType STICKY_CLASS;
    public static final LeakTrace$GcRootType THREAD_BLOCK;
    public static final LeakTrace$GcRootType THREAD_OBJECT;

    static {
       LeakTrace$GcRootType[] gcRootTypeAr = new LeakTrace$GcRootType[9];
       LeakTrace$GcRootType gcRootType = new LeakTrace$GcRootType("JNI_GLOBAL", 0, "Global variable in native code");
       LeakTrace$GcRootType.JNI_GLOBAL = gcRootType;
       gcRootTypeAr[0] = gcRootType;
       gcRootType = new LeakTrace$GcRootType("JNI_LOCAL", 1, "Local variable in native code");
       LeakTrace$GcRootType.JNI_LOCAL = gcRootType;
       gcRootTypeAr[1] = gcRootType;
       gcRootType = new LeakTrace$GcRootType("JAVA_FRAME", 2, "Java local variable");
       LeakTrace$GcRootType.JAVA_FRAME = gcRootType;
       gcRootTypeAr[2] = gcRootType;
       gcRootType = new LeakTrace$GcRootType("NATIVE_STACK", 3, "Input or output parameters in native code");
       LeakTrace$GcRootType.NATIVE_STACK = gcRootType;
       gcRootTypeAr[3] = gcRootType;
       gcRootType = new LeakTrace$GcRootType("STICKY_CLASS", 4, "System class");
       LeakTrace$GcRootType.STICKY_CLASS = gcRootType;
       gcRootTypeAr[4] = gcRootType;
       gcRootType = new LeakTrace$GcRootType("THREAD_BLOCK", 5, "Thread block");
       LeakTrace$GcRootType.THREAD_BLOCK = gcRootType;
       gcRootTypeAr[5] = gcRootType;
       gcRootType = new LeakTrace$GcRootType("MONITOR_USED", 6, "Monitor \(anything that called the wait\(\) or notify\(\) methods, or that is synchronized.\)");
       LeakTrace$GcRootType.MONITOR_USED = gcRootType;
       gcRootTypeAr[6] = gcRootType;
       gcRootType = new LeakTrace$GcRootType("THREAD_OBJECT", 7, "Thread object");
       LeakTrace$GcRootType.THREAD_OBJECT = gcRootType;
       gcRootTypeAr[7] = gcRootType;
       gcRootType = new LeakTrace$GcRootType("JNI_MONITOR", 8, "Root JNI monitor");
       LeakTrace$GcRootType.JNI_MONITOR = gcRootType;
       gcRootTypeAr[8] = gcRootType;
       LeakTrace$GcRootType.$VALUES = gcRootTypeAr;
       LeakTrace$GcRootType.Companion = new LeakTrace$GcRootType$a(null);
    }
    public void LeakTrace$GcRootType(String p0,int p1,String p2){
       super(p0, p1);
       this.description = p2;
    }
    public static LeakTrace$GcRootType valueOf(String p0){
       return Enum.valueOf(LeakTrace$GcRootType.class, p0);
    }
    public static LeakTrace$GcRootType[] values(){
       return LeakTrace$GcRootType.$VALUES.clone();
    }
    public final String getDescription(){
       return this.description;
    }
}
