package com.kuaishou.live.core.voiceparty.theater.tube.detail.d;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.d$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import z12.x;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import im8.f;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$d;

public class d extends c	// class@001a0d
{
    public f p;
    public VoicePartyTheaterPhotoWithEpisode q;
    public VoicePartyTheaterTubeDetailFragment$d r;
    public KwaiImageView s;
    public TextView t;
    public static String sLivePresenterClassName = "VoicePartyTheaterTubeDetailItemPresenter";

    public void d(){
       super();
    }
    public void E8(){
       VoicePartyTheaterPhotoWithEpisode mVoicePartyT;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          return;
       }
       this.m8().setOnClickListener(new d$a(this));
       Object[] objArray1 = new Object[]{mVoicePartyT,mVoicePartyT.mEpisodeCoverThumbnailUrls};
       mVoicePartyT = this.q.mVoicePartyTheaterEpisodePhoto;
       if (x.v(objArray1) && this.q.mVoicePartyTheaterEpisodePhoto.mEpisodeCoverThumbnailUrls.size() > 0) {
          this.s.P(this.q.mVoicePartyTheaterEpisodePhoto.mEpisodeCoverThumbnailUrls);
       }else {
          this.s.L(objArray);
       }
       objArray1 = new Object[]{this.q.mVoicePartyTheaterEpisodeInfo};
       if (x.v(objArray1) && !TextUtils.isEmpty(this.q.mVoicePartyTheaterEpisodeInfo.mEpisodeName)) {
          this.t.setText(this.q.mVoicePartyTheaterEpisodeInfo.mEpisodeName);
       }else {
          this.t.setText("");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0d77);
       this.s = m1.f(p0, 0x7f0a0d72);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.x8("ADAPTER_POSITION");
       this.q = this.q8(VoicePartyTheaterPhotoWithEpisode.class);
       this.r = this.q8(VoicePartyTheaterTubeDetailFragment$d.class);
       return;
    }
}
