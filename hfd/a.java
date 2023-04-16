package hfd.a;
import n3d.a;
import hfd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.String;
import ekd.j0;
import u99.b;
import u99.f;
import com.kwai.robust.PatchProxyResult;
import igc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import w99.g;
import v5a.g;
import aa9.b;
import com.kwai.framework.player.core.f;
import tcd.c;
import java.lang.StringBuilder;
import android.os.SystemClock;
import w99.f;

public final class a implements a	// class@000f7d
{
    public final b b;
    public final GifshowActivity c;

    public void a(b p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       boolean b;
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 == 1025) {
          tc.s(tb.I);
          boolean i = -1;
          if (p1 == i && p2 != null) {
             long l = 0;
             tb.B.a(j0.b(p2, "KEY_VIDEO_STATE_EVENT_ID", i), j0.c(p2, "KEY_DETAIL_PAGE_PAUSE", l));
             long l1 = j0.c(p2, "KEY_DETAIL_FIRST_FRAME_TIME", l);
             if (l1 - l) {
                tb.C.h(l1);
             }else {
                b x = tb.x;
                if (x != null) {
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   Object[] objArray = null;
                   b obj = PatchProxy.apply(objArray, x, b.class, "16");
                   if (obj != patchProxyRe) {
                      i = obj.booleanValue();
                   }else if(x.a() != null){
                      obj = x.a;
                      if (obj != null) {
                         i = obj.f().isAudioRenderingStart();
                      }else {
                         x = x.b;
                         Objects.requireNonNull(x);
                         Object obj1 = PatchProxy.apply(objArray, x, c.class, "32");
                         if (obj1 != patchProxyRe) {
                            i = obj1.booleanValue();
                         }else {
                            b = x.k.isAudioRenderingStart();
                            x.e("isAudioRenderingStart : "+b);
                            i = b;
                         }
                      }
                   }else {
                      i = false;
                   }
                   if (i) {
                      tb.C.h(SystemClock.elapsedRealtime());
                   }
                }
             }
          }
          tb.A.d(p0, p1, p2);
       }
       return;
    }
}
