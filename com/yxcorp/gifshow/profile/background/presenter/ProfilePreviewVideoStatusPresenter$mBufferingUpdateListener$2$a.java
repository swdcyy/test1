package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2$a;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;

public final class ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2$a implements IMediaPlayer$OnBufferingUpdateListener	// class@00126d
{
    public final ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2 a;

    public void ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2$a(ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2 p0){
       this.a = p0;
       super();
    }
    public final void onBufferingUpdate(IMediaPlayer p0,int p1){
       p0.E = (int)((float)(p1 * 10000) / 100.00f);
    }
}
