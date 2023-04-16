package com.kwai.plugin.dva.install.remote.a;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import com.kwai.plugin.dva.install.remote.InnerInstallWork;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import zsd.u;

public final class a implements FilenameFilter	// class@001368
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean accept(File p0,String p1){
       boolean b;
       p0 = PatchProxy.applyTwoRefsWithListener(p0, p1, null, InnerInstallWork.class, "8");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else {
          a.o(p1, "name");
          b = u.H1(p1, ".so", false, 2, null);
          PatchProxy.onMethodExit(InnerInstallWork.class, "8");
       }
       return b;
    }
}
