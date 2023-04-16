package gx2.g;
import k51.c;
import dx2.p;
import gx2.c;
import gx2.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import java.lang.CharSequence;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterNormalAuthorInfo;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.library.widget.specific.misc.SpectrumView;
import gx2.g$b;
import qu2.a;
import lnc.a1;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y8c.d;

public class g extends c	// class@002bba
{
    public final View$OnClickListener A;
    public final p p;
    public final c q;
    public VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem r;
    public d s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public LottieAnimationView y;
    public SpectrumView z;
    public static String sLivePresenterClassName = "VoicePartyTheaterPlayListSoloItemPresenter";

    public void g(p p0,c p1){
       super();
       this.A = new g$a(this);
       this.p = p0;
       this.q = p1;
    }
    public void E8(){
       String str;
       VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo mType;
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "3")) {
          return;
       }
       boolean b = this.P8();
       VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem mVoicePartyT = this.r.mVoicePartyTheaterPhotoWithEpisode;
       this.t.P(mVoicePartyT.mVoicePartyTheaterEpisodePhoto.mEpisodeCoverThumbnailUrls);
       this.u.setSelected(b);
       this.u.setText(mVoicePartyT.mVoicePartyTheaterEpisodeInfo.mTubeName);
       VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo mEpisodeName = mVoicePartyT.mVoicePartyTheaterEpisodeInfo.mEpisodeName;
       VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem mNormalAutho = this.r.mNormalAuthorInfo;
       int i = 0;
       mNormalAutho = (mNormalAutho != null && !TextUtils.x(mNormalAutho.mUserLink))? 1: 0;
       if (this.r.mNormalAuthorInfo != null) {
          str = "";
          String str1 = (mNormalAutho)? "@": "";
          str = str+str1+this.r.mNormalAuthorInfo.mUserName;
       }else {
          objArray2 = objArray;
       }
       boolean b1 = TextUtils.x(mEpisodeName);
       this.x.setSelected(b);
       g tx = this.x;
       if (b1) {
          mEpisodeName = str;
       }
       tx.setText(mEpisodeName);
       g tx1 = this.x;
       boolean b2 = (b || (b1 && mNormalAutho))? true: false;
       tx1.setSelected(b2);
       tx1 = this.x;
       Object[] objArray1 = (!b1)? objArray: this.A;
       tx1.setOnClickListener(objArray1);
       tx1 = this.v;
       if (b1) {
          objArray2 = objArray;
       }
       tx1.setText(str);
       tx1 = this.v;
       boolean b3 = (!b1 && mNormalAutho)? true: false;
       tx1.setSelected(b3);
       tx1 = this.v;
       if (!b1) {
          objArray = this.A;
       }
       tx1.setOnClickListener(objArray);
       g tr = this.r;
       if (tr != null) {
          VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem mVoicePartyT1 = tr.mVoicePartyTheaterPhotoWithEpisode;
          if (mVoicePartyT1 != null) {
             VoicePartyTheaterPhotoWithEpisode mVoicePartyT2 = mVoicePartyT1.mVoicePartyTheaterEpisodeInfo;
             if (mVoicePartyT2 != null) {
                mType = mVoicePartyT2.mType;
             label_00c0 :
                tr = (mType == 4)? 1: null;
                tx1 = this.z;
                int i1 = (tr)? 0: 8;
                tx1.setVisibility(i1);
                if (tr) {
                   this.z.a();
                }else {
                   this.z.b();
                }
                this.w.setOnClickListener(new g$b(this));
                if (this.p.d().e()) {
                   this.w.setEnabled((b ^ 0x01));
                   tr = this.w;
                   String str2 = (b)? a1.p(R.string.arg_RES_7f102e6d): a1.p(R.string.arg_RES_7f10510e);
                   tr.setText(str2);
                }else {
                   this.w.setEnabled(true);
                   this.w.setText(R.string.arg_RES_7f102d15);
                }
                g ty = this.y;
                if (!this.P8()) {
                   i = 8;
                }
                ty.setVisibility(i);
                return;
             }
          }
       }
       mType = null;
       goto label_00c0 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       if (this.y.p()) {
          this.y.r();
       }
       this.y.setVisibility(8);
       return;
    }
    public final boolean P8(){
       VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem mPlayStatus = this.r.mPlayStatus;
       boolean b = (mPlayStatus == 2 || mPlayStatus == 3)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0d79);
       this.v = m1.f(p0, 0x7f0a0d78);
       LottieAnimationView lottieAnimat = m1.f(p0, R.id.episode_playing_anim_view);
       this.y = lottieAnimat;
       lottieAnimat.setAnimationFromUrl(c0.a.b("udata/pkg/kwai-client-image/chat_room/voice_party_theater_playing_status_wave.json"));
       this.w = m1.f(p0, 0x7f0a30c8);
       this.u = m1.f(p0, 0x7f0a0d77);
       this.x = m1.f(p0, 0x7f0a0d73);
       this.z = m1.f(p0, 0x7f0a0d74);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.r = this.q8(VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem.class);
       this.s = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
