package com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import java.io.Serializable;
import java.lang.Object;

public class VoicePartyTheaterEpisodePhoto implements Serializable	// class@001972
{
    public List mEpisodeCoverThumbnailUrls;
    public List mEpisodeMainMvUrls;
    public String mEpisodePhotoId;
    public VoicePartyTheaterPhotoExtParams mExtParams;
    public KwaiManifest mHlsManifest;
    public TheaterLiveDataSource mLiveDataSource;
    public static final long serialVersionUID = 0x6905ea24d9b27046;

    public void VoicePartyTheaterEpisodePhoto(){
       super();
    }
}
