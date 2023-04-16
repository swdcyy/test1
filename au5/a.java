package au5.a;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;

public final class a	// class@0003ab
{

    public static final String a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = (p0 == null)? "": String.valueOf(System.identityHashCode(p0));
       return str;
    }
}
