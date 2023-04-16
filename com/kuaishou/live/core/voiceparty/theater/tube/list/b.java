package com.kuaishou.live.core.voiceparty.theater.tube.list.b;
import k51.c;
import dx2.p;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import java.util.List;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.theater.tube.list.b$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.tube.TubeInfo;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.theater.tube.list.b$b;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterNormalAuthorInfo;
import com.kuaishou.live.core.voiceparty.theater.tube.list.b$c;
import android.view.View;
import com.kwai.library.widget.specific.misc.SpectrumView;
import com.kuaishou.live.core.voiceparty.theater.tube.list.b$d;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import qu2.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.f;
import java.lang.Integer;
import dx2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SearchResultPackage;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import d61.c0;

public class b extends c	// class@001a32
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public LottieAnimationView u;
    public SpectrumView v;
    public final p w;
    public final a$a x;
    public VoicePartyTheaterTubeFeedWithEpisodes y;
    public f z;
    public static String sLivePresenterClassName = "VoicePartyTheaterTubeSoloItemPresenter";

    public void b(p p0,a$a p1){
       super();
       this.w = p0;
       this.x = p1;
    }
    public void E8(){
       boolean b;
       boolean b1;
       int i4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       VoicePartyTheaterTubeFeedWithEpisodes mEpisodes = this.y.mEpisodes;
       int i = 0;
       int i1 = (mEpisodes != null)? mEpisodes.size(): 0;
       VoicePartyTheaterPhotoWithEpisode voicePartyTh = (i1 > 0)? mEpisodes.get(i): objArray;
       int i2 = 1;
       String str = "";
       if (voicePartyTh != null) {
          this.p.P(voicePartyTh.mVoicePartyTheaterEpisodePhoto.mEpisodeCoverThumbnailUrls);
          this.q.setText(voicePartyTh.mVoicePartyTheaterEpisodeInfo.mEpisodeName);
          if (i1 > i2) {
             this.p.setOnClickListener(new b$a(this));
             this.s.setText(a1.q(R.string.arg_RES_7f105112, (int)this.y.mTube.mTotalEpisodeCount));
          }else {
             this.p.setOnClickListener(new b$b(this, voicePartyTh));
             this.s.setText(str);
          }
       }else {
          this.q.setText(str);
          this.s.setText(str);
          this.p.setOnClickListener(objArray);
       }
       VoicePartyTheaterTubeInfo mNormalAutho = this.y.mTube.mNormalAuthorInfo;
       if (mNormalAutho != null) {
          this.r.setText(mNormalAutho.mUserName);
          this.r.setOnClickListener(new b$c(this, mNormalAutho));
       }else {
          this.r.setText(str);
          this.r.setOnClickListener(objArray);
       }
       b ty = this.y;
       if (ty != null) {
          mEpisodes = ty.mTube;
          if (mEpisodes != null) {
             mNormalAutho = mEpisodes.mTubeType;
          label_00ab :
             b = (mNormalAutho == 4)? true: false;
             b tv = this.v;
             int i3 = (b)? 0: 8;
             tv.setVisibility(i3);
             if (b) {
                this.v.a();
             }else {
                this.v.b();
             }
             this.t.setOnClickListener(new b$d(this));
             String obj = PatchProxy.apply(objArray, this, uob, "5");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else {
                obj = this.w.e();
                b ty1 = this.y;
                if (ty1 != null) {
                   VoicePartyTheaterTubeFeedWithEpisodes mTube = ty1.mTube;
                   if (mTube != null) {
                      objArray = mTube.mTubeId;
                   }
                }
                if (obj == null || !TextUtils.n(obj, objArray)) {
                   i2 = 0;
                }
                b1 = i2;
             }
             this.t.setEnabled((b1 ^ 0x01));
             tv = this.t;
             if (PatchProxy.isSupport(uob)) {
                Object obj1 = PatchProxy.applyTwoRefs(Boolean.valueOf(b), Boolean.valueOf(b1), this, uob, "4");
                if (obj1 != patchProxyRe) {
                   i4 = obj1.intValue();
                }else if(b1){
                   i4 = 0x7f102e6d;
                }else if(!this.w.d().e()){
                   i4 = 0x7f102d16;
                }else if(b){
                   i4 = 0x7f102e6c;
                }else {
                   i4 = 0x7f10510e;
                }
             }else {
                goto label_0125 ;
             }
             tv.setText(i4);
             this.m8().setSelected(b1);
             b tu = this.u;
             if (!b1) {
                i = 8;
             }
             tu.setVisibility(i);
             this.x.g(this.y, this.z.get());
             return;
          }
       }
       mNormalAutho = null;
       goto label_00ab ;
    }
    public a P8(CharSequence p0){
       a obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       ClientContent$SearchResultPackage searchResult = new ClientContent$SearchResultPackage();
       searchResult.name = this.y.mTube.mName;
       searchResult.position = this.z.get().intValue() + 1;
       searchResult.contentId = this.y.mTube.mTubeId;
       obj.i = searchResult;
       if (p0 != null) {
          obj.g = p0.toString();
       }
       obj.a = this.z.get().intValue();
       obj.b = this.y;
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d79);
       this.r = m1.f(p0, 0x7f0a0d73);
       this.t = m1.f(p0, 0x7f0a30c8);
       this.q = m1.f(p0, 0x7f0a0d77);
       this.s = m1.f(p0, 0x7f0a0d71);
       LottieAnimationView lottieAnimat = m1.f(p0, R.id.episode_playing_anim_view);
       this.u = lottieAnimat;
       lottieAnimat.setAnimationFromUrl(c0.a.b("udata/pkg/kwai-client-image/chat_room/voice_party_theater_playing_status_wave.json"));
       this.v = m1.f(p0, 0x7f0a0d74);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.y = this.q8(VoicePartyTheaterTubeFeedWithEpisodes.class);
       this.z = this.x8("ADAPTER_POSITION");
       return;
    }
}
