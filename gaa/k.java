package gaa.k;
import java.lang.Runnable;
import gaa.s;
import java.lang.Object;
import android.app.Activity;
import lnc.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import cq.a;
import java.lang.String;
import q87.c;
import java.io.File;
import qkd.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import tl8.d;
import com.kuaishou.android.model.music.Music;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.android.model.music.MusicType;
import q16.a$a;
import com.kwai.feature.post.api.core.model.RecreationParam$a;
import com.kwai.feature.post.api.core.model.RecreationParam;
import org.json.JSONObject;
import e16.b;
import java.lang.Boolean;
import android.os.Parcelable;
import org.parceler.b;
import com.kwai.feature.post.api.music.data.MusicSource;
import tkd.b;
import tkd.d;
import r16.a;
import q16.a;
import android.content.Context;
import android.content.Intent;
import r16.d;
import q46.t;
import gaa.g;
import n3d.a;
import e17.i;

public final class k implements Runnable	// class@00243b
{
    public final s b;

    public void k(s p0){
       this.b = p0;
    }
    public final void run(){
       s b;
       User mName;
       k tb = this.b;
       if (a1.i(tb.a) && tb.a.b3()) {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "EditMusicDownloadDispatcher";
          if (tb.g == null) {
             if (tb.j == null || !b.S(new File(tb.j))) {
                i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
             }else {
                b = tb.b;
                if (b != null && (b.getEntity() != null && tb.b.getEntity().a(User.class) != null)) {
                   mName = tb.b.getEntity().a(User.class).mName;
                }else if(TextUtils.x(tb.c.mArtistName)){
                   mName = tb.c.mArtist;
                }else {
                   mName = tb.c.mArtistName;
                }
                if (!TextUtils.x(mName)) {
                   mName = "@"+mName;
                }
                String displayName = tb.c.getDisplayName();
                String str1 = "";
                if (displayName != null) {
                   displayName = displayName.replaceAll("\\\(O\\d+\\\)", str1);
                }
                s b1 = tb.b;
                if (b1 != null) {
                   str1 = b1.getBizId();
                }
                boolean b2 = (tb.b != null && tb.c.mType == MusicType.SOUNDTRACK)? true: false;
                Object[] objArray1 = new Object[i];
                a.D().w(str, "originUserName = "+mName+", originVideoCaption = "+displayName+", originPhotoId = "+str1+", mTopColor = "+tb.e+", mBottomColor = "+tb.f+", mMusicFilePath = "+tb.j+", mMusicCoverPath = "+tb.k+", mMusicStartMills = "+0+", mMusicPlayDuration = "+tb.i+", mMusic.mId = "+tb.c.mId+", mSoundWavePath = "+tb.l+", isSoundTrack = "+b2, objArray1);
                a$a uoa = new a$a();
                RecreationParam$a uoa1 = new RecreationParam$a();
                uoa1.g(tb.e);
                uoa1.d(tb.f);
                uoa1.f(mName);
                uoa1.h(displayName);
                uoa1.e(str1);
                uoa1.h = tb.k;
                uoa1.i = tb.l;
                uoa1.b(b2);
                RecreationParam recreationPa = uoa1.a();
                uoa.a0("music_recreation").m(Boolean.TRUE).K(tb.c).N(b.c(tb.c)).P(MusicSource.TAG).M(b.a(tb.c, 0, tb.i, false).toString()).Q(i).L((int)tb.i).h(tb.j).i(tb.m).X(recreationPa);
                Intent intent = d.a(0x14d6f666).NX(tb.a, uoa.f());
                if (tb.r != null) {
                   intent.putExtra("discard_current_post_session", true);
                }
                t.a(intent, "fullScreenPreview");
                tb.a.t1(intent, 291, g.b);
             }
          }
       }
       return;
    }
}
