package k99.e0$a;
import androidx.viewpager.widget.ViewPager$i;
import k99.e0;
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
import e99.a;
import android.widget.ImageView;

public final class e0$a implements ViewPager$i	// class@002b72
{
    public final e0 b;

    public void e0$a(e0 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       ImageView imageView;
       if (PatchProxy.isSupport(e0$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, e0$a.class, "1")) {
          return;
       }
       e0$a tb = this.b;
       Activity activity = tb.getActivity();
       a.m(activity);
       if (((float)p2 / (float)n.k(activity)) - 0x3f000000 >= 0) {
          p0++;
       }
       tb.b9(p0);
       e0$a tb1 = this.b;
       if (tb1.R8(tb1.V8())) {
          imageView = this.b.W8();
          if (imageView != null) {
             imageView.setVisibility(0);
          }
          tb1 = this.b;
          if (tb1.G == null) {
             tb1.A7();
             tb1.G = true;
          }
       }else {
          imageView = this.b.W8();
          if (imageView != null) {
             imageView.setVisibility(8);
          }
       }
       return;
    }
    public void onPageSelected(int p0){
    }
}
