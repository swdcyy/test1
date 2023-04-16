package kshark.lite.LeakTraceObject$ObjectType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LeakTraceObject$ObjectType extends Enum	// class@001bab
{
    public static final LeakTraceObject$ObjectType[] $VALUES;
    public static final LeakTraceObject$ObjectType ARRAY;
    public static final LeakTraceObject$ObjectType CLASS;
    public static final LeakTraceObject$ObjectType INSTANCE;

    static {
       LeakTraceObject$ObjectType objectType;
       LeakTraceObject$ObjectType[] objectTypeAr = new LeakTraceObject$ObjectType[]{objectType,objectType,objectType};
       objectType = new LeakTraceObject$ObjectType("CLASS", 0);
       LeakTraceObject$ObjectType.CLASS = objectType;
       objectType = new LeakTraceObject$ObjectType("ARRAY", 1);
       LeakTraceObject$ObjectType.ARRAY = objectType;
       objectType = new LeakTraceObject$ObjectType("INSTANCE", 2);
       LeakTraceObject$ObjectType.INSTANCE = objectType;
       LeakTraceObject$ObjectType.$VALUES = objectTypeAr;
    }
    public void LeakTraceObject$ObjectType(String p0,int p1){
       super(p0, p1);
    }
    public static LeakTraceObject$ObjectType valueOf(String p0){
       return Enum.valueOf(LeakTraceObject$ObjectType.class, p0);
    }
    public static LeakTraceObject$ObjectType[] values(){
       return LeakTraceObject$ObjectType.$VALUES.clone();
    }
}
