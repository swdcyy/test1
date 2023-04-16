package ltd.k;
import kotlin.Result;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import qrd.j0;

public final class k	// class@001e0a
{
    public static final boolean a;

    static {
       Object obj = Result.constructor-impl(Class.forName("android.os.Build"));
       k.a = Result.isSuccess-impl(obj);
    }
    public static final boolean a(){
       return k.a;
    }
}
