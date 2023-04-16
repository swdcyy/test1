package com.kwai.feature.platform.misc.openedappstat.a;
import o2b.a$a;
import java.lang.Object;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$OpenedAppStatEvent;
import com.kwai.feature.platform.misc.openedappstat.OpenedAppStatInitModule;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import k2b.u1;

public final class a implements a$a	// class@0012bf
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(Object p0){
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.openedAppStatEvent = p0;
       u1.j0(statPackage);
    }
}
