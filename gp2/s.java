package gp2.s;
import com.kuaishou.livestream.message.nano.SCTheaterNextEpisodeOrderInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.player.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.TheaterEpisodeOrderInfo;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.TheaterLiveDataSource;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.voiceparty.theater.player.a$d;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.lang.StringBuilder;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kuaishou.live.core.voiceparty.theater.player.a$c;
import com.kuaishou.livestream.message.nano.TheaterEpisodePhotoCdnProto;
import java.util.List;
import com.kuaishou.live.core.voiceparty.d0;
import java.util.Collection;
import com.kuaishou.live.core.voiceparty.theater.player.a$a;
import java.lang.Number;
import java.lang.Math;
import com.google.protobuf.nano.MessageNano;

public final class s	// class@002b84
{
    public final a a;
    public final SCTheaterNextEpisodeOrderInfo b;

    public void s(SCTheaterNextEpisodeOrderInfo p0){
       a$b a;
       TheaterEpisodeInfo photoId;
       TheaterEpisodeInfo liveRelayStr;
       KwaiManifest obj;
       a$d uod1;
       a.p(p0, "msg");
       super();
       this.b = p0;
       a = a.a;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$d uod = PatchProxy.applyOneRefs(p0, a, a$b.class, "1");
       if (uod != patchProxyRe) {
       }else {
          a.p(p0, "info");
          p0 = p0.episodeOrderInfo;
          if (p0 != null) {
             TheaterEpisodeOrderInfo episodeInfo = p0.episodeInfo;
             if (episodeInfo != null) {
                photoId = episodeInfo.photoId;
             label_0030 :
                if (photoId != null) {
                   TheaterEpisodeOrderInfo episodeInfo1 = p0.episodeInfo;
                   TheaterEpisodeInfo type = episodeInfo1.type;
                   int i = 1;
                   if (type != i) {
                      if (type != 2 && type != 3) {
                         if (type == 4) {
                            liveRelayStr = episodeInfo1.liveRelayStream;
                            if (liveRelayStr != null) {
                               try{
                                  obj = PatchProxy.applyOneRefs(liveRelayStr, a, a$b.class, "4");
                                  if (obj != patchProxyRe) {
                                  }else {
                                     liveRelayStr = a.a.h(liveRelayStr, TheaterLiveDataSource.class);
                                     a.o(liveRelayStr, "Gsons.KWAI_GSON.fromJson¡­veDataSource::class.java\)");
                                     obj = liveRelayStr;
                                  }
                                  uod1 = new a$d(photoId, obj);
                               }catch(com.google.gson.JsonSyntaxException e7){
                                  throw new IllegalArgumentException("parseTheaterLiveDataSource failed", e7);
                               }
                            }else {
                               throw new IllegalArgumentException("invalid liveRelayStream".toString());
                            }
                         }else {
                            throw new IllegalArgumentException("OrderInfo has invalid type: ["+type+']');
                         }
                      }else {
                         liveRelayStr = episodeInfo1.manifest;
                         a.o(liveRelayStr, "info.episodeOrderInfo.episodeInfo.manifest");
                         obj = PatchProxy.applyOneRefs(liveRelayStr, a, a$b.class, "3");
                         if (obj != patchProxyRe) {
                         }else {
                            obj = KwaiManifest.from(liveRelayStr);
                         }
                         if (obj != null) {
                            uod1 = new a$c(photoId, obj);
                         }else {
                            throw new IllegalArgumentException("invalid manifest".toString());
                         }
                      }
                      uod = uod1;
                   }else {
                      liveRelayStr = episodeInfo1.mainMvUrl;
                      if (liveRelayStr != null) {
                         List list = d0.v(liveRelayStr);
                         a.o(list, "urls");
                         if (list.isEmpty() ^ i) {
                            uod = new a$a(photoId, list);
                         }else {
                            throw new IllegalArgumentException("mainMvUrl is empty".toString());
                         }
                      }else {
                         throw new IllegalArgumentException("mainMvUrl is null".toString());
                      }
                   }
                }else {
                   throw new IllegalArgumentException("photo id is null".toString());
                }
             }
          }
          photoId = null;
          goto label_0030 ;
       }
       this.a = uod;
       return;
    }
    public final TheaterEpisodeOrderInfo a(){
       return this.b.episodeOrderInfo;
    }
    public final long b(){
       Object obj = PatchProxy.apply(null, this, s.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (long)((double)this.b.photoUrlQueryMaxDelayMillis * Math.random());
    }
    public final String c(){
       SCTheaterNextEpisodeOrderInfo obj = PatchProxy.apply(null, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.theaterId;
       a.o(obj, "msg.theaterId");
       return obj;
    }
    public final String d(){
       SCTheaterNextEpisodeOrderInfo obj = PatchProxy.apply(null, this, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.uniqueId;
       a.o(obj, "msg.uniqueId");
       return obj;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, s.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.toString();
       a.o(obj, "msg.toString\(\)");
       return obj;
    }
}
