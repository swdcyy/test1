package hn1.r;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import java.lang.Object;
import hn1.d0;
import com.kwai.robust.PatchProxyResult;
import mx6.a;
import in1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.d0$c;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import java.lang.Long;
import v5a.a$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController$createPlayerManager$dataSource$1;
import msd.l;
import v5a.a;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import in1.f$b;
import kotlin.jvm.internal.a;
import px6.a;
import wx6.d;
import hn1.w;
import java.util.Objects;
import px6.b;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.listeners.OnPlayerActualPlayingChangedListener;
import hn1.x;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import hn1.y;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import hn1.d0$b;
import hn1.d0$d;
import java.lang.Number;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import im8.f;
import hn1.d0$a;
import java.lang.Boolean;

public final class r implements Observer	// class@00273f
{
    public final LiveHotSpotDetailPhotoPlayerCardViewController b;

    public void r(LiveHotSpotDetailPhotoPlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       d0$c a;
       d0$c uoc1;
       a$b obj2;
       a uoa;
       d0$c uoc2;
       QPhotoPlayerKitDataSource qPhotoPlayer;
       f$b uob;
       w ow;
       x ox;
       y oy;
       a uoa1;
       IWaynePlayer player;
       IWaynePlayer player1;
       Object obj = this;
       LiveHotSpotDetailPhotoPlayerCardViewController obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, r.class, str)) {
       }else {
          String str1 = "2";
          if (obj1 instanceof d0$c) {
             r b = obj.b;
             d0$c uoc = LiveHotSpotDetailPhotoPlayerCardViewController.V2(b);
             a = obj1.a;
             d0$c b1 = obj1.b;
             obj1 = LiveHotSpotDetailPhotoPlayerCardViewController.class;
             if (PatchProxy.isSupport(obj1)) {
                uoc1 = b1;
                p0 = a;
                if (!PatchProxy.applyVoidThreeRefs(uoc, a, Long.valueOf(b1), b, LiveHotSpotDetailPhotoPlayerCardViewController.class, "5")) {
                }
             }else {
                uoc1 = b1;
                p0 = a;
             }
          }else if(obj1 instanceof d0$b){
             obj1 = obj.b.l;
             if (obj1 != null && !PatchProxy.applyVoid(null, obj1, uof, str1)) {
                if (obj1.b != null && obj1.a != null) {
                   uoa = obj1.c.getPlayerKitContext().e(a.class);
                   if (uoa != null) {
                      uoa.pause();
                   }
                }
                obj1.a = false;
             }
          }else if(obj1 instanceof d0$d){
             d0$d a1 = obj1.a;
             LiveHotSpotDetailPhotoPlayerCardViewController l = obj.b.l;
             long l1 = 0;
             if (l != null) {
                Object obj3 = PatchProxy.apply(null, l, uof, "6");
                if (obj3 != patchProxyRe) {
                   l1 = obj3.longValue();
                }else {
                   uoa = l.c.getPlayerKitContext().e(a.class);
                   if (uoa != null) {
                      player1 = uoa.getPlayer();
                      if (player1 != null) {
                         l1 = player1.getCurrentPosition();
                      }
                   }
                }
             }
             a1.set(Long.valueOf(l1));
             obj1 = obj.b.l;
             if (obj1 != null) {
                obj1.a();
             }
             obj.b.l = null;
          }else if(obj1 instanceof d0$a){
             LiveHotSpotDetailPhotoPlayerCardViewController l2 = obj.b.l;
             if (l2 != null) {
                d0$a a2 = obj1.a;
                if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(a2), l2, uof, "3")) {
                   uoa = l2.c.getPlayerKitContext().e(a.class);
                   if (uoa != null) {
                      player1 = uoa.getPlayer();
                      if (player1 != null) {
                         player1.setPlayerMute(a2);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
