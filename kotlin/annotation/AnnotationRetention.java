package kotlin.annotation.AnnotationRetention;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AnnotationRetention extends Enum	// class@001820
{
    public static final AnnotationRetention[] $VALUES;
    public static final AnnotationRetention BINARY;
    public static final AnnotationRetention RUNTIME;
    public static final AnnotationRetention SOURCE;

    static {
       AnnotationRetention uAnnotationR1;
       AnnotationRetention[] uAnnotationR = new AnnotationRetention[]{uAnnotationR1,uAnnotationR1,uAnnotationR1};
       uAnnotationR1 = new AnnotationRetention("SOURCE", 0);
       AnnotationRetention.SOURCE = uAnnotationR1;
       uAnnotationR1 = new AnnotationRetention("BINARY", 1);
       AnnotationRetention.BINARY = uAnnotationR1;
       uAnnotationR1 = new AnnotationRetention("RUNTIME", 2);
       AnnotationRetention.RUNTIME = uAnnotationR1;
       AnnotationRetention.$VALUES = uAnnotationR;
    }
    public void AnnotationRetention(String p0,int p1){
       super(p0, p1);
    }
    public static AnnotationRetention valueOf(String p0){
       return Enum.valueOf(AnnotationRetention.class, p0);
    }
    public static AnnotationRetention[] values(){
       return AnnotationRetention.$VALUES.clone();
    }
}
