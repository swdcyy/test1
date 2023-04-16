package com.kwai.social.config.utils.ArchConfigUtil;
import com.kwai.social.config.utils.ArchConfigUtil$enableFollowPluginMonitorDoubleCheck$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class ArchConfigUtil	// class@00189d
{
    public static final p a;
    public static final ArchConfigUtil b;

    static {
       ArchConfigUtil.b = new ArchConfigUtil();
       ArchConfigUtil.a = s.c(ArchConfigUtil$enableFollowPluginMonitorDoubleCheck$2.INSTANCE);
    }
    public void ArchConfigUtil(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, ArchConfigUtil.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = ArchConfigUtil.a.getValue();
       }
       return obj.booleanValue();
    }
}
