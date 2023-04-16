package com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodeOrderInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import com.kuaishou.livestream.message.nano.TheaterEpisodePhotoCdnProto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.voiceparty.theater.model.a;
import ok.h;
import ok.z;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.kuaishou.livestream.message.nano.TheaterEpisodeOrderInfo;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import fg6.a;
import com.google.gson.Gson;

public class VoicePartyTheaterEpisodeOrderInfo implements Serializable	// class@001970
{
    public VoicePartyTheaterPhotoWithEpisode mEpisodeInfo;
    public String mOrderId;
    public static final long serialVersionUID = 0x2869d165f6e6a3a;

    public void VoicePartyTheaterEpisodeOrderInfo(){
       super();
    }
    public static TheaterEpisodePhotoCdnProto[] a(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyTheaterEpisodeOrderInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return m.s(p0).F(a.b).w(TheaterEpisodePhotoCdnProto.class);
    }
    public static void validate(VoicePartyTheaterEpisodeOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, VoicePartyTheaterEpisodeOrderInfo.class, "1")) {
          return;
       }
       boolean b = false;
       boolean b1 = (p0 != null)? true: false;
       z.a(b1);
       z.a((TextUtils.isEmpty(p0.mOrderId) ^ 1));
       p0 = p0.mEpisodeInfo;
       b1 = (p0 != null)? true: false;
       z.a(b1);
       b1 = (p0.mVoicePartyTheaterEpisodeInfo != null)? true: false;
       z.a(b1);
       if (p0.mVoicePartyTheaterEpisodePhoto != null) {
          b = true;
       }
       z.a(b);
       return;
    }
    public TheaterEpisodeOrderInfo toProto(){
       TheaterEpisodeOrderInfo obj = PatchProxy.apply(null, this, VoicePartyTheaterEpisodeOrderInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TheaterEpisodeOrderInfo();
       obj.episodeOrderId = this.mOrderId;
       VoicePartyTheaterPhotoWithEpisode mVoicePartyT = this.mEpisodeInfo.mVoicePartyTheaterEpisodeInfo;
       TheaterEpisodeInfo theaterEpiso = new TheaterEpisodeInfo();
       theaterEpiso.tubeId = mVoicePartyT.mTubeId;
       theaterEpiso.tubeName = mVoicePartyT.mTubeName;
       theaterEpiso.name = mVoicePartyT.mEpisodeName;
       theaterEpiso.type = mVoicePartyT.mType;
       mVoicePartyT = this.mEpisodeInfo.mVoicePartyTheaterEpisodePhoto;
       theaterEpiso.photoId = mVoicePartyT.mEpisodePhotoId;
       VoicePartyTheaterEpisodePhoto mHlsManifest = mVoicePartyT.mHlsManifest;
       if (mHlsManifest != null) {
          theaterEpiso.manifest = mHlsManifest.getManifestString();
       }
       Gson a = a.a;
       theaterEpiso.liveRelayStream = a.q(mVoicePartyT.mLiveDataSource);
       theaterEpiso.extParams = a.q(mVoicePartyT.mExtParams);
       theaterEpiso.mainMvUrl = VoicePartyTheaterEpisodeOrderInfo.a(mVoicePartyT.mEpisodeMainMvUrls);
       theaterEpiso.coverThumbnailUrl = VoicePartyTheaterEpisodeOrderInfo.a(mVoicePartyT.mEpisodeCoverThumbnailUrls);
       obj.episodeInfo = theaterEpiso;
       return obj;
    }
}
