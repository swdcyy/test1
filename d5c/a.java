package d5c.a;
import d5c.t0;
import com.yxcorp.gifshow.profile.fragment.MyProfilePhotoFragment;
import java.lang.Class;
import z2c.a;
import java.lang.Object;
import android.util.SparseArray;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment;
import com.yxcorp.gifshow.profile.artical.ProfileArticleFragment;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment;
import z2c.b;
import ok.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends t0	// class@0020e6
{

    public void a(){
       SparseArray a;
       super();
       this.z.put(1, a.c(MyProfilePhotoFragment.class));
       this.z.put(2, a.c(MyProfilePhotoFragment.class));
       this.z.put(3, a.c(MyProfilePhotoFragment.class));
       this.z.put(4, a.c(ProfileMusicFragment.class));
       this.z.put(8, a.c(ProfileArticleFragment.class));
       this.z.put(14, a.c(ProfileAcFunFragment.class));
       this.z.put(19, a.c(MyProfilePhotoFragment.class));
       int i = b.a.size();
       int i1 = 0;
       while (i1 < i) {
          a = b.a;
          a uoa = a.valueAt(i1);
          this.z.put(a.keyAt(i1), uoa);
          x ox = uoa.b();
          if (ox != null) {
             this.U7(ox.get());
          }
          i1 = i1 + 1;
       }
       return;
    }
}
