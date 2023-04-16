package com.kuaishou.live.core.voiceparty.theater.creation.playsource.a;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.theater.creation.playsource.EpisodeListTheaterPlaySource;
import fg6.a;
import java.lang.Class;
import java.lang.Object;
import com.google.gson.Gson;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.yxcorp.gifshow.tube.TubeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import com.kuaishou.live.core.voiceparty.theater.creation.playsource.PlayListTheaterPlaySource;

public final class a	// class@00196d
{

    public static EpisodeListTheaterPlaySource a(String p0){
       return a.a.h(p0, EpisodeListTheaterPlaySource.class);
    }
    public static EpisodeListTheaterPlaySource b(VoicePartyTheaterTubeInfo p0,VoicePartyTheaterPhotoWithEpisode p1){
       if (p0 != null && p1 != null) {
          VoicePartyTheaterPhotoWithEpisode mVoicePartyT = p1.mVoicePartyTheaterEpisodeInfo;
          if (mVoicePartyT != null) {
             return new EpisodeListTheaterPlaySource(p0.mTubeId, mVoicePartyT.mEpisodeNumber, p1.mVoicePartyTheaterEpisodePhoto.mEpisodePhotoId, p0.mTubeType);
          }
       }
       return null;
    }
    public static PlayListTheaterPlaySource c(String p0){
       return new PlayListTheaterPlaySource(p0);
    }
}
