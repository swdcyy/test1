package javax.annotation.meta.When;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class When extends Enum	// class@0016b5
{
    public static final When[] $VALUES;
    public static final When ALWAYS;
    public static final When MAYBE;
    public static final When NEVER;
    public static final When UNKNOWN;

    static {
       When when = new When("ALWAYS", 0);
       When.ALWAYS = when;
       When when1 = new When("UNKNOWN", 1);
       When.UNKNOWN = when1;
       When when2 = new When("MAYBE", 2);
       When.MAYBE = when2;
       When when3 = new When("NEVER", 3);
       When.NEVER = when3;
       When[] whenArray = new When[]{when,when1,when2,when3};
       When.$VALUES = whenArray;
    }
    public void When(String p0,int p1){
       super(p0, p1);
    }
    public static When valueOf(String p0){
       return Enum.valueOf(When.class, p0);
    }
    public static When[] values(){
       return When.$VALUES.clone();
    }
}
