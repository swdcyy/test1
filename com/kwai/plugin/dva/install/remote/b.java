package com.kwai.plugin.dva.install.remote.b;
import com.kwai.plugin.dva.work.FutureTaskWork;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import asd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import nj7.c;
import com.kwai.plugin.dva.util.a;

public final class b extends FutureTaskWork	// class@001369
{
    public final String i;
    public final int j;

    public void b(Context p0,String p1,int p2){
       a.p(p0, "mContext");
       a.p(p1, "mName");
       super();
       this.i = p1;
       this.j = p2;
    }
    public Object a(c p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.d(c.b(this.i, this.j));
       return null;
    }
}
