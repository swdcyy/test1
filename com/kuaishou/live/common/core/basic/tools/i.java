package com.kuaishou.live.common.core.basic.tools.i;
import java.lang.Runnable;
import com.kuaishou.live.common.core.basic.tools.g$c$a;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.download.DownloadManager;
import brd.t;
import t45.d;
import brd.z;
import va1.n;
import erd.a;
import va1.o;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;

public final class i implements Runnable	// class@000ef6
{
    public final g$c$a b;
    public final DownloadTask c;

    public void i(g$c$a p0,DownloadTask p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       DownloadManager.n().d(tc);
       o oo = new o(tb, tc);
       t.just(tc).observeOn(d.c).doOnDispose(new n(tb)).subscribe(oo, h.b);
    }
}
