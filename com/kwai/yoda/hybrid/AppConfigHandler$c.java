package com.kwai.yoda.hybrid.AppConfigHandler$c;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Arrays;
import kotlin.TypeCastException;

public final class AppConfigHandler$c implements o	// class@00126b
{
    public static final AppConfigHandler$c b;

    static {
       AppConfigHandler$c.b = new AppConfigHandler$c();
    }
    public void AppConfigHandler$c(){
       super();
    }
    public Object apply(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, AppConfigHandler$c.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          a.q(p0, "list");
          String[] stringArray = new String[0];
          p0 = p0.toArray(stringArray);
          if (p0 != null) {
             str = Arrays.toString(p0);
             a.h(str, "java.util.Arrays.toString\(this\)");
          }else {
             throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
          }
       }
       return str;
    }
}
