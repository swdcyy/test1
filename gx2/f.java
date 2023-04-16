package gx2.f;
import k51.c;
import dx2.p;
import gx2.c;
import gx2.f$a;
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
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.voiceparty.d0;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.library.widget.specific.misc.SpectrumView;
import gx2.f$b;
import qu2.a;
import lnc.a1;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y8c.d;

public class f extends c	// class@002bb7
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
    public static String sLivePresenterClassName = "VoicePartyTheaterPlayListSeriesItemPresenter";

    public void f(p p0,c p1){
       super();
       this.A = new f$a(this);
       this.p = p0;
       this.q = p1;
    }
    public void E8(){
       String str;
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "3")) {
          return;
       }
       f tr = this.r;
       VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem mPlayStatus = tr.mPlayStatus;
       int i = 1;
       int i1 = 0;
       boolean b = (mPlayStatus == 2 || mPlayStatus == 3)? true: false;
       VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem mVoicePartyT = tr.mVoicePartyTheaterPhotoWithEpisode;
       this.t.P(mVoicePartyT.mVoicePartyTheaterEpisodePhoto.mEpisodeCoverThumbnailUrls);
       this.u.setSelected(b);
       this.u.setText(mVoicePartyT.mVoicePartyTheaterEpisodeInfo.mTubeName);
       VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo mEpisodeName = mVoicePartyT.mVoicePartyTheaterEpisodeInfo.mEpisodeName;
       boolean b1 = d0.p(this.r.mAuthor);
       if (this.r.mAuthor != null) {
          str = "";
          String str1 = (b1)? "@": "";
          str = str+str1+this.r.mAuthor.getName();
       }else {
          objArray2 = objArray;
       }
       boolean b2 = TextUtils.x(mEpisodeName);
       this.v.setSelected(b);
       f tv = this.v;
       if (b2) {
          mEpisodeName = str;
       }
       tv.setText(mEpisodeName);
       tr = this.v;
       boolean b3 = (b || (b2 && b1))? true: false;
       tr.setSelected(b3);
       tr = this.v;
       Object[] objArray1 = (!b2)? objArray: this.A;
       tr.setOnClickListener(objArray1);
       tr = this.w;
       if (b2) {
          objArray2 = objArray;
       }
       tr.setText(str);
       tr = this.w;
       b1 = (!b2 && b1)? true: false;
       tr.setSelected(b1);
       tr = this.w;
       if (!b2) {
          objArray = this.A;
       }
       tr.setOnClickListener(objArray);
       tr = this.r;
       if (tr != null) {
          mVoicePartyT = tr.mVoicePartyTheaterPhotoWithEpisode;
          if (mVoicePartyT != null) {
             VoicePartyTheaterPhotoWithEpisode mVoicePartyT1 = mVoicePartyT.mVoicePartyTheaterEpisodeInfo;
             if (mVoicePartyT1 != null) {
                mEpisodeName = mVoicePartyT1.mType;
             label_00c1 :
                if (mEpisodeName != 4) {
                   i = 0;
                }
                tr = this.z;
                b1 = (i)? 0: 8;
                tr.setVisibility(b1);
                if (i) {
                   this.z.a();
                }else {
                   this.z.b();
                }
                this.x.setOnClickListener(new f$b(this));
                if (this.p.d().e()) {
                   this.x.setEnabled((b ^ 0x01));
                   tr = this.x;
                   String str2 = (b)? a1.p(R.string.arg_RES_7f102e6d): a1.p(R.string.arg_RES_7f10510e);
                   tr.setText(str2);
                }else {
                   this.x.setText(R.string.arg_RES_7f102d15);
                }
                tr = this.y;
                if (!b) {
                   i1 = 8;
                }
                tr.setVisibility(i1);
                return;
             }
          }
       }
       mEpisodeName = null;
       goto label_00c1 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       if (this.y.p()) {
          this.y.r();
       }
       this.y.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0d79);
       this.w = m1.f(p0, 0x7f0a0d78);
       this.v = m1.f(p0, 0x7f0a0d73);
       LottieAnimationView lottieAnimat = m1.f(p0, R.id.episode_playing_anim_view);
       this.y = lottieAnimat;
       lottieAnimat.setAnimationFromUrl(c0.a.b("udata/pkg/kwai-client-image/chat_room/voice_party_theater_playing_status_wave.json"));
       this.x = m1.f(p0, 0x7f0a30c8);
       this.u = m1.f(p0, 0x7f0a0d77);
       this.z = m1.f(p0, 0x7f0a0d74);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.r = this.q8(VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem.class);
       this.s = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
