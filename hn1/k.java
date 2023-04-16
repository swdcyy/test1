package hn1.k;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Object;
import hn1.b0;
import in1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.b0$b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import in1.c$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import nsd.u;
import hn1.n;
import kotlin.jvm.internal.a;
import in1.h;
import java.util.Collection;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController$createPlayerManager$2;
import in1.g;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController$createPlayerManager$3;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.LivePlayerController;
import hn1.b0$c;
import hn1.b0$a;
import java.lang.Boolean;

public final class k implements Observer	// class@002738
{
    public final LiveHotSpotDetailLivePlayerCardViewController b;
    public final LivePlayTextureView c;

    public void k(LiveHotSpotDetailLivePlayerCardViewController p0,LivePlayTextureView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       c c;
       LiveHotSpotDetailLivePlayerCardViewController k;
       c uoc = c.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, str)) {
       }else {
          String str1 = "2";
          if (p0 instanceof b0$b) {
             k tb = this.b;
             k tc = this.c;
             p0 = p0.a;
             Objects.requireNonNull(tb);
             LiveHotSpotDetailLivePlayerCardViewController liveHotSpotD = LiveHotSpotDetailLivePlayerCardViewController.class;
             if (!PatchProxy.applyVoidTwoRefs(tc, p0, tb, liveHotSpotD, "5")) {
                if (tb.k == null) {
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   c$a obj = PatchProxy.applyTwoRefs(tc, p0, tb, liveHotSpotD, "6");
                   if (obj != patchProxyRe) {
                   }else {
                      obj = new c$a(p0, tc);
                      p0 = PatchProxy.apply(null, obj, c$a.class, str);
                      if (p0 != patchProxyRe) {
                      }else {
                         c = new c(obj.c, obj.d, obj.b, obj.a, null);
                      }
                      obj = p0;
                      p0 = new n(tb);
                      Objects.requireNonNull(obj);
                      if (!PatchProxy.applyVoidOneRefs(p0, obj, uoc, "3")) {
                         a.p(p0, "stateChangeListener");
                         c = obj.c;
                         Objects.requireNonNull(c);
                         if (!PatchProxy.applyVoidOneRefs(p0, c, h.class, str1)) {
                            a.p(p0, "listener");
                            c.b.add(p0);
                         }
                      }
                      p0 = new LiveHotSpotDetailLivePlayerCardViewController$createPlayerManager$2(tb, tc);
                      if (!PatchProxy.applyVoidOneRefs(p0, obj, uoc, "4")) {
                         a.p(p0, "sizeChangeListener");
                         c b = obj.b;
                         Objects.requireNonNull(b);
                         if (!PatchProxy.applyVoidOneRefs(p0, b, g.class, str1)) {
                            a.p(p0, "listener");
                            b.b.add(p0);
                         }
                      }
                      p0 = new LiveHotSpotDetailLivePlayerCardViewController$createPlayerManager$3(tb);
                      if (!PatchProxy.applyVoidOneRefs(p0, obj, uoc, "5")) {
                         a.p(p0, "liveCompletionListener");
                         obj.a.add(p0);
                      }
                   }
                   tb.k = obj;
                }
                p0 = tb.k;
                if (p0 != null && !PatchProxy.applyVoid(null, p0, uoc, str)) {
                   if (!PatchProxy.applyVoid(null, p0, uoc, "14")) {
                      p0.h = false;
                      if (!PatchProxy.applyVoid(null, p0, uoc, "12")) {
                         p0.d.addLivePlayerErrorListener(p0.i);
                         p0.d.addOnVideoSizeChangedListener(p0.b);
                         p0.d.addStateChangeListener(p0.c);
                      }
                   }
                   if (!p0.d.isPlaying()) {
                      p0.d.startPlay();
                   }
                }
             }
          }else if(p0 instanceof b0$c){
             p0 = this.b.k;
             if (p0 != null) {
                p0.a();
             }
             p0.k = null;
          }else if(p0 instanceof b0$a){
             k = this.b.k;
             if (k != null) {
                p0 = p0.a;
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), k, uoc, str1)) {
                   if (p0 != null) {
                      k.d.mute();
                   }else {
                      k.d.unMute();
                   }
                }
             }
          }
       }
       return;
    }
}
