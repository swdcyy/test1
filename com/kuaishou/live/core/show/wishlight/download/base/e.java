package com.kuaishou.live.core.show.wishlight.download.base.e;
import com.kuaishou.live.core.show.wishlight.download.base.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import lnc.a1;
import en2.i;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t45.d;
import com.kuaishou.live.core.show.wishlight.download.base.d;
import java.lang.Runnable;
import crd.b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public class e implements a	// class@0012a7
{
    public final String a;
    public long b;
    public final boolean c;
    public final boolean d;
    public int e;
    public int f;
    public final List g;
    public z h;
    public static final List i;
    public static final int j;

    static {
       e.i = LiveLogTag.LIVE_AVATAR.appendTag("DownLoader");
       e.j = a1.e(70.00f);
    }
    public void e(i p0){
       super();
       this.b = 5000;
       int j = e.j;
       this.e = j;
       this.f = j;
       this.g = new CopyOnWriteArrayList();
       this.h = b.b(c.f("LiveAvatarDownLoaderThread"));
       this.a = p0.a;
       this.c = p0.e;
       this.d = p0.f;
       if (p0.c()) {
          this.b = p0.c();
       }
       if (p0.d()) {
          this.e = p0.d();
       }
       if (p0.b()) {
          this.f = p0.b();
       }
       return;
    }
    public void a(CDNUrl[] p0,a$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       d.c.d(new d(this, p0, p1));
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next().get();
          if (uob != null) {
             uob.dispose();
          }
       }
       this.g.clear();
       return;
    }
}
