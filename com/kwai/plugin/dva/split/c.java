package com.kwai.plugin.dva.split.c;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.kwai.plugin.dva.split.SplitManager$mReadSplitConfigFuture$2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kwai.plugin.dva.split.SplitManager;
import java.util.concurrent.CountDownLatch;

public final class c implements Callable	// class@00138a
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object call(){
       List list = PatchProxy.applyWithListener(null, null, SplitManager$mReadSplitConfigFuture$2.class, "2");
       if (list != PatchProxyResult.class) {
       }else {
          SplitManager.d.await();
          list = SplitManager.c;
          PatchProxy.onMethodExit(SplitManager$mReadSplitConfigFuture$2.class, "2");
       }
       return list;
    }
}
