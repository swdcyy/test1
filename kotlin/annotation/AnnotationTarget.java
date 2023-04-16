package kotlin.annotation.AnnotationTarget;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AnnotationTarget extends Enum	// class@001821
{
    public static final AnnotationTarget[] $VALUES;
    public static final AnnotationTarget ANNOTATION_CLASS;
    public static final AnnotationTarget CLASS;
    public static final AnnotationTarget CONSTRUCTOR;
    public static final AnnotationTarget EXPRESSION;
    public static final AnnotationTarget FIELD;
    public static final AnnotationTarget FILE;
    public static final AnnotationTarget FUNCTION;
    public static final AnnotationTarget LOCAL_VARIABLE;
    public static final AnnotationTarget PROPERTY;
    public static final AnnotationTarget PROPERTY_GETTER;
    public static final AnnotationTarget PROPERTY_SETTER;
    public static final AnnotationTarget TYPE;
    public static final AnnotationTarget TYPEALIAS;
    public static final AnnotationTarget TYPE_PARAMETER;
    public static final AnnotationTarget VALUE_PARAMETER;

    static {
       AnnotationTarget[] uAnnotationT = new AnnotationTarget[15];
       AnnotationTarget uAnnotationT1 = new AnnotationTarget("CLASS", 0);
       AnnotationTarget.CLASS = uAnnotationT1;
       uAnnotationT[0] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("ANNOTATION_CLASS", 1);
       AnnotationTarget.ANNOTATION_CLASS = uAnnotationT1;
       uAnnotationT[1] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("TYPE_PARAMETER", 2);
       AnnotationTarget.TYPE_PARAMETER = uAnnotationT1;
       uAnnotationT[2] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("PROPERTY", 3);
       AnnotationTarget.PROPERTY = uAnnotationT1;
       uAnnotationT[3] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("FIELD", 4);
       AnnotationTarget.FIELD = uAnnotationT1;
       uAnnotationT[4] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("LOCAL_VARIABLE", 5);
       AnnotationTarget.LOCAL_VARIABLE = uAnnotationT1;
       uAnnotationT[5] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("VALUE_PARAMETER", 6);
       AnnotationTarget.VALUE_PARAMETER = uAnnotationT1;
       uAnnotationT[6] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("CONSTRUCTOR", 7);
       AnnotationTarget.CONSTRUCTOR = uAnnotationT1;
       uAnnotationT[7] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("FUNCTION", 8);
       AnnotationTarget.FUNCTION = uAnnotationT1;
       uAnnotationT[8] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("PROPERTY_GETTER", 9);
       AnnotationTarget.PROPERTY_GETTER = uAnnotationT1;
       uAnnotationT[9] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("PROPERTY_SETTER", 10);
       AnnotationTarget.PROPERTY_SETTER = uAnnotationT1;
       uAnnotationT[10] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("TYPE", 11);
       AnnotationTarget.TYPE = uAnnotationT1;
       uAnnotationT[11] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("EXPRESSION", 12);
       AnnotationTarget.EXPRESSION = uAnnotationT1;
       uAnnotationT[12] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("FILE", 13);
       AnnotationTarget.FILE = uAnnotationT1;
       uAnnotationT[13] = uAnnotationT1;
       uAnnotationT1 = new AnnotationTarget("TYPEALIAS", 14);
       AnnotationTarget.TYPEALIAS = uAnnotationT1;
       uAnnotationT[14] = uAnnotationT1;
       AnnotationTarget.$VALUES = uAnnotationT;
    }
    public void AnnotationTarget(String p0,int p1){
       super(p0, p1);
    }
    public static AnnotationTarget valueOf(String p0){
       return Enum.valueOf(AnnotationTarget.class, p0);
    }
    public static AnnotationTarget[] values(){
       return AnnotationTarget.$VALUES.clone();
    }
}
