package kshark.lite.LeakTraceReference$ReferenceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LeakTraceReference$ReferenceType extends Enum	// class@001bad
{
    public static final LeakTraceReference$ReferenceType[] $VALUES;
    public static final LeakTraceReference$ReferenceType ARRAY_ENTRY;
    public static final LeakTraceReference$ReferenceType INSTANCE_FIELD;
    public static final LeakTraceReference$ReferenceType LOCAL;
    public static final LeakTraceReference$ReferenceType STATIC_FIELD;

    static {
       LeakTraceReference$ReferenceType referenceTyp1;
       LeakTraceReference$ReferenceType[] referenceTyp = new LeakTraceReference$ReferenceType[]{referenceTyp1,referenceTyp1,referenceTyp1,referenceTyp1};
       referenceTyp1 = new LeakTraceReference$ReferenceType("INSTANCE_FIELD", 0);
       LeakTraceReference$ReferenceType.INSTANCE_FIELD = referenceTyp1;
       referenceTyp1 = new LeakTraceReference$ReferenceType("STATIC_FIELD", 1);
       LeakTraceReference$ReferenceType.STATIC_FIELD = referenceTyp1;
       referenceTyp1 = new LeakTraceReference$ReferenceType("LOCAL", 2);
       LeakTraceReference$ReferenceType.LOCAL = referenceTyp1;
       referenceTyp1 = new LeakTraceReference$ReferenceType("ARRAY_ENTRY", 3);
       LeakTraceReference$ReferenceType.ARRAY_ENTRY = referenceTyp1;
       LeakTraceReference$ReferenceType.$VALUES = referenceTyp;
    }
    public void LeakTraceReference$ReferenceType(String p0,int p1){
       super(p0, p1);
    }
    public static LeakTraceReference$ReferenceType valueOf(String p0){
       return Enum.valueOf(LeakTraceReference$ReferenceType.class, p0);
    }
    public static LeakTraceReference$ReferenceType[] values(){
       return LeakTraceReference$ReferenceType.$VALUES.clone();
    }
}
