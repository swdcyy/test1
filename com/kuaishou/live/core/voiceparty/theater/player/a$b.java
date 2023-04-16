package com.kuaishou.live.core.voiceparty.theater.player.a$b;
import java.lang.Object;
import nsd.u;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.player.a$d;
import com.kuaishou.live.core.voiceparty.theater.model.TheaterLiveDataSource;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kuaishou.live.core.voiceparty.theater.player.a$c;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kuaishou.live.core.voiceparty.theater.player.a$a;
import java.util.List;

public final class a$b	// class@0019a5
{

    public void a$b(){
       super();
    }
    public void a$b(u p0){
       super();
    }
    public final a a(int p0,VoicePartyTheaterEpisodePhoto p1){
       VoicePartyTheaterEpisodePhoto obj;
       a$d uod;
       VoicePartyTheaterEpisodePhoto mHlsManifest;
       a$c uoc;
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "photo");
       obj = p1.mEpisodePhotoId;
       if (obj != null) {
          if (p0 != 1) {
             if (p0 != 2 && p0 != 3) {
                if (p0 == 4) {
                   p1 = p1.mLiveDataSource;
                   if (p1 != null) {
                      uod = new a$d(obj, p1);
                   label_0080 :
                      return uod;
                   }else {
                      throw new IllegalArgumentException("Required value was null.".toString());
                   }
                }else {
                   throw new IllegalArgumentException("OrderInfo has invalid type: ["+p0+']');
                }
             }else {
                mHlsManifest = p1.mHlsManifest;
                if (mHlsManifest != null) {
                   uoc = new a$c(obj, mHlsManifest);
                }else {
                   throw new IllegalArgumentException("invalid hlsManifest".toString());
                }
             }
          }else {
             mHlsManifest = p1.mEpisodeMainMvUrls;
             if (mHlsManifest != null) {
                uoc = new a$a(obj, mHlsManifest);
             }else {
                throw new IllegalArgumentException("invalid mainMvUrls".toString());
             }
          }
          uod = uoc;
          goto label_0080 ;
       }else {
          throw new IllegalArgumentException("photo id is null".toString());
       }
    }
}
