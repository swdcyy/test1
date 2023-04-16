package com.yxcorp.gifshow.apm.TabApmTracker$e;
import kg5.a;
import com.yxcorp.gifshow.apm.TabApmTracker;
import java.lang.String;
import java.lang.Object;
import g8c.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t06.b;
import q87.c;

public final class TabApmTracker$e implements a	// class@001b98
{
    public final TabApmTracker a;
    public final String b;
    public final String c;
    public final int d;

    public void TabApmTracker$e(TabApmTracker p0,String p1,String p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TabApmTracker$e.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("TabApmTracker", "监听到实时tab请求结束", objArray);
       this.a.s0(this.b, this.c, this.d);
       PatchProxy.onMethodExit(TabApmTracker$e.class, "1");
       return;
    }
}
