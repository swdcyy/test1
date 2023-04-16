package kotlin.internal.RequireKotlinVersionKind;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RequireKotlinVersionKind extends Enum	// class@001879
{
    public static final RequireKotlinVersionKind[] $VALUES;
    public static final RequireKotlinVersionKind API_VERSION;
    public static final RequireKotlinVersionKind COMPILER_VERSION;
    public static final RequireKotlinVersionKind LANGUAGE_VERSION;

    static {
       RequireKotlinVersionKind requireKotli1;
       RequireKotlinVersionKind[] requireKotli = new RequireKotlinVersionKind[]{requireKotli1,requireKotli1,requireKotli1};
       requireKotli1 = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
       RequireKotlinVersionKind.LANGUAGE_VERSION = requireKotli1;
       requireKotli1 = new RequireKotlinVersionKind("COMPILER_VERSION", 1);
       RequireKotlinVersionKind.COMPILER_VERSION = requireKotli1;
       requireKotli1 = new RequireKotlinVersionKind("API_VERSION", 2);
       RequireKotlinVersionKind.API_VERSION = requireKotli1;
       RequireKotlinVersionKind.$VALUES = requireKotli;
    }
    public void RequireKotlinVersionKind(String p0,int p1){
       super(p0, p1);
    }
    public static RequireKotlinVersionKind valueOf(String p0){
       return Enum.valueOf(RequireKotlinVersionKind.class, p0);
    }
    public static RequireKotlinVersionKind[] values(){
       return RequireKotlinVersionKind.$VALUES.clone();
    }
}
