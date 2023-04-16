package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2$a;

public final class ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2 extends Lambda implements a	// class@00126e
{
    public final ProfilePreviewVideoStatusPresenter this$0;

    public void ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2(ProfilePreviewVideoStatusPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final IMediaPlayer$OnBufferingUpdateListener invoke(){
       Object obj = PatchProxy.apply(null, this, ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
