package d5c.w0;
import d5c.t0;
import com.yxcorp.gifshow.profile.fragment.UserProfilePhotoFragment;
import java.lang.Class;
import z2c.a;
import java.lang.Object;
import android.util.SparseArray;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment;
import com.yxcorp.gifshow.profile.artical.ProfileArticleFragment;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment;
import com.yxcorp.gifshow.profile.fragment.UserMentionedMeTabFragment;
import z2c.b;
import ok.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class w0 extends t0	// class@002117
{

    public void w0(){
       SparseArray b;
       super();
       this.z.put(1, a.c(UserProfilePhotoFragment.class));
       this.z.put(4, a.c(ProfileMusicFragment.class));
       this.z.put(8, a.c(ProfileArticleFragment.class));
       this.z.put(14, a.c(ProfileAcFunFragment.class));
       this.z.put(19, a.c(UserMentionedMeTabFragment.class));
       int i = b.b.size();
       int i1 = 0;
       while (i1 < i) {
          b = b.b;
          a uoa = b.valueAt(i1);
          this.z.put(b.keyAt(i1), uoa);
          x ox = uoa.b();
          if (ox != null) {
             this.U7(ox.get());
          }
          i1 = i1 + 1;
       }
       return;
    }
}
