package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2$a;
import mx6.d;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import kotlin.jvm.internal.a;
import android.widget.SeekBar;
import java.lang.CharSequence;
import android.widget.TextView;
import usd.q;

public final class ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2$a implements d	// class@001271
{
    public final ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2 a;

    public void ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2$a(ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(long p0,long p1){
       ProfilePreviewVideoStatusPresenter a;
       ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2$a omProgressCh = ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2$a.class;
       if (PatchProxy.isSupport(omProgressCh) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, omProgressCh, "1")) {
          return;
       }
       ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       ProfilePreviewVideoStatusPresenter profilePrevi = ProfilePreviewVideoStatusPresenter.class;
       if (!PatchProxy.isSupport(profilePrevi) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this$0, profilePrevi, "13")) {
          profilePrevi = this$0.z;
          String str = "mSeekBar";
          if (profilePrevi == null) {
             a.S(str);
          }
          profilePrevi.setProgress((int)((((float)p0 * 0x3f800000) * (float)0x2710) / (float)p1));
          profilePrevi = this$0.z;
          if (profilePrevi == null) {
             a.S(str);
          }
          profilePrevi.setSecondaryProgress(this$0.E);
          profilePrevi = this$0.y;
          if (profilePrevi == null) {
             a.S("mPlayTime");
          }
          profilePrevi.setText(this$0.k9(p0));
          a = this$0.A;
          if (a == null) {
             a.S("mDuration");
          }
          a.setText(this$0.k9(q.o(p1, 1000)));
       }
       return;
    }
}
