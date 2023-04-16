package ffa.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.System;
import com.kwai.framework.model.user.QCurrentUser;

public final class a	// class@0028db
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final String a(String p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       obj = p0+'_'+System.currentTimeMillis()+'_';
       QCurrentUser mE = QCurrentUser.ME;
       mE = (mE != null)? mE.getId(): null;
       return obj+mE;
    }
}
