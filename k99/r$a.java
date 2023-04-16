package k99.r$a;
import androidx.viewpager.widget.ViewPager$i;
import k99.r;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import tp7.a;
import com.yxcorp.gifshow.entity.QPhoto;
import nsd.u;
import android.widget.TextView;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import java.lang.CharSequence;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.b0;

public final class r$a implements ViewPager$i	// class@002b8e
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(r$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, r$a.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       a.m(activity);
       p1.I = (((float)p2 / (float)n.k(activity)) - 0x3f000000 >= 0)? p0 + 1: p0;
       r$a tb = this.b;
       a uoa = new a(tb.I, r.S8(tb).getAtlasListSize(), false, 0, 12, null);
       tb.a9((p0 + 1));
       uoa = r.V8(this.b).getAdapter();
       a.m(uoa);
       a.o(uoa, "mPhotosPagerView.adapter!!");
       r.W8(this.b).setText(String.valueOf((this.b.I + 1))+"/"+uoa.j());
       this.b.Z8();
       r s = this.b.s;
       a.m(s);
       if (s.mFromSlidePlayPhotoClick != null) {
          String photoId = r.S8(this.b).getPhotoId();
          a.o(photoId, "mPhoto.photoId");
          b0 uob0 = new b0(photoId, p0, 0, false, 0, 28, null);
          RxBus.f.b(String.valueOf((this.b.I + 1))+"/"+uoa.j());
       }
       return;
    }
    public void onPageSelected(int p0){
    }
}
