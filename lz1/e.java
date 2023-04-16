package lz1.e;
import com.kwai.video.waynelive.LivePlayerController;
import sa1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lz1.e$d;
import lz1.e$c;
import lz1.e$e;
import java.util.concurrent.CopyOnWriteArraySet;
import lz1.e$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import android.os.SystemClock;
import lz1.e$a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import lz1.g;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.Thread;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class e	// class@003093
{
    public final e$d a;
    public final e$c b;
    public final e$e c;
    public final CopyOnWriteArraySet d;
    public e$a e;
    public boolean f;
    public final LivePlayerController g;
    public final b h;

    public void e(LivePlayerController p0,b p1){
       a.p(p0, "livePlayerController");
       a.p(p1, "seiInfoDispatcher");
       super();
       this.g = p0;
       this.h = p1;
       this.a = new e$d(this);
       this.b = new e$c(this);
       this.c = new e$e(this);
       this.d = new CopyOnWriteArraySet();
    }
    public final void a(e$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       a.p(p0, "callback");
       this.d.add(p0);
       return;
    }
    public final void b(Long p0,Long p1){
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "8")) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       e te = this.e;
       if (te != null) {
          long l1 = l - te.b;
          if (p1 != null) {
             if (!te.a() - p1.longValue()) {
                iterator = this.d.iterator();
                while (iterator.hasNext()) {
                   iterator.next().c(p1.longValue(), l1);
                }
             }else {
                iterator = this.d.iterator();
                while (iterator.hasNext()) {
                   iterator.next().d(te.a(), p1.longValue(), l1);
                }
             }
             this.e = null;
          }else if(p0 != null){
             Iterator iterator1 = this.d.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().b(te.a(), l1);
             }
             this.e = new e$a(p0.longValue(), l);
          }
          return;
       }else if(p0 != null){
          this.e = new e$a(p0.longValue(), l);
       }else if(p1 != null){
          iterator = this.d.iterator();
          while (iterator.hasNext()) {
             iterator.next().h(p1.longValue());
          }
       }
       return;
    }
    public final void c(LiveStageProto$LayoutConfig p0,byte[] p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "6")) {
          return;
       }
       long l = g.a.a(p1);
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().i(p0, l);
       }
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, uoe, "7")) {
          b.Z(LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM, "onReceiveSeiChecksum: "+l+" thread:"+Thread.currentThread());
          this.b(null, Long.valueOf(l));
       }
       return;
    }
    public final void d(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "5")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM, "onReceiveTsptChecksum: "+p0+" thread:"+Thread.currentThread());
       this.b(Long.valueOf(p0), null);
       return;
    }
    public final void e(e$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       a.p(p0, "callback");
       this.d.remove(p0);
       return;
    }
}
