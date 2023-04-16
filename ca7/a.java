package ca7.a;
import android.content.Context;
import tb7.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.pm.ApplicationInfo;

public final class a	// class@000513
{

    public static boolean a(Context p0){
       a.q(p0, "$this$isAppDebuggable");
       boolean b = (p0.getApplicationInfo().flags & 0x02)? true: false;
       return b;
    }
}
