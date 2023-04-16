package lz1.b;
import msd.r;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.collection.LruCache;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lz1.b$a;
import java.lang.StringBuilder;
import nsd.u;

public final class b	// class@00308a
{
    public final LruCache a;
    public final r b;

    public void b(r p0){
       a.p(p0, "doReportAction");
       super();
       this.b = p0;
       this.a = new LruCache(20);
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return SystemClock.elapsedRealtime();
    }
    public final void b(int p0,Long p1,Long p2,Long p3){
       boolean b;
       String obj;
       b$a obj1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, b.class, "1")) {
          return;
       }
       b = true;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p1 != null){
             obj1 = p1;
          }else {
             obj1 = p2;
          }
          if (!obj1) {
             b.B(LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM, "shouldReport checksum is null");
          }else {
             obj1 = this.a.get(obj1);
             if (obj1 != null) {
                StringBuilder str1 = null;
                if (!p0) {
                   if (obj1.b - str1 > 0) {
                   }
                }else if(obj1.c - str1 <= 0){
                }
             }
          }
       }else {
          goto label_003c ;
       }
       obj = " tspt:";
       String str = " sei: ";
       if (!b) {
          b.Z(LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM, "ignore report errorType: "+p0+str+p1+obj+p2);
          return;
       }else {
          LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_SEI_CHECKSUM;
          b.Z(lIVE_AUDIENC, "reportError errorType: "+p0+str+p1+obj+p2);
          this.b.invoke(Integer.valueOf(p0), p1, p2, p3);
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "2")) {
             if (p1 == null) {
                p1 = p2;
             }
             if (p1 == null) {
                b.B(lIVE_AUDIENC, "cacheReportStatus record checksum is null");
             }else {
                b$a uoa = this.a.get(p1);
                if (uoa == null) {
                   b$a uoa1 = new b$a(p1.longValue(), 0, 0, 6, null);
                   this.a.put(p1, uoa);
                }
                if (!p0) {
                   uoa.b = this.a();
                }else {
                   uoa.c = this.a();
                }
             }
          }
          return;
       }
    }
}
