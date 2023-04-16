package e1a.n;
import java.util.HashSet;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.player.core.b;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uw9.c;
import android.content.SharedPreferences;
import lnc.a1;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.music.MusicStrategy;
import com.kuaishou.android.model.feed.ImageFeed;
import com.kwai.framework.player.core.f;
import java.lang.CharSequence;
import e17.i;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class n	// class@002051
{
    public static final HashSet a;
    public static final n b;

    static {
       n.b = new n();
       n.a = new HashSet();
    }
    public void n(){
       super();
    }
    public static final void a(QPhoto p0,b p1,e0 p2){
       PhotoMeta mMusicStrate;
       HashSet a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, n.class, "1")) {
          return;
       }
       a.p(p1, "player");
       a.p(p2, "iLogPage");
       String str = c.a.getString("musicCopyrightToast", "");
       a.o(str, "DefaultPreferenceHelper.getMusicCopyrightToast\(\)");
       MusicStrategy musicStrateg = null;
       String str1 = (!str.length())? 1: null;
       if (str1) {
          str = a1.p(R.string.arg_RES_7f103711);
          a.o(str, "CommonUtil.string\(R.stri¡­c_copyright_filter_toast\)");
       }
       if (p0 != null) {
          QPhoto mEntity = p0.mEntity;
          if (mEntity instanceof VideoFeed) {
             mMusicStrate = mEntity.mPhotoMeta.mMusicStrategy;
             if (mMusicStrate != null) {
                musicStrateg = mMusicStrate.mIsNeedMuted;
             }
          }else if(mEntity instanceof ImageFeed){
             mMusicStrate = mEntity.mPhotoMeta.mMusicStrategy;
             if (mMusicStrate != null) {
                musicStrateg = mMusicStrate.mIsNeedMuted;
             }
          }
          if (musicStrateg != null) {
             p1.setVolume(0, 0);
             a = n.a;
             if (!a.contains(p0.getPhotoId())) {
                i.e(R.style.arg_RES_7f11066a, str, 3000);
                a.add(p0.getPhotoId());
                n b = n.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidThreeRefs(p0, str, p2, b, n.class, "2")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   i3 oi3 = i3.f();
                   oi3.d("complete_toast_text", str);
                   uElementPack.params = oi3.toString();
                   uElementPack.action2 = "AUDIO_COPYRIGHT_LIMIT_TOAST";
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.photoPackage = w1.f(p0.mEntity);
                   u1.D0("", p2, 0, uElementPack, uContentPack, null);
                }
             }
          }
       }
    label_00c4 :
       return;
    }
}
