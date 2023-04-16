package ata.d$c;
import erd.g;
import ata.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tra.b;
import q87.c;
import com.airbnb.lottie.LottieAnimationViewCopy;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import com.yxcorp.gifshow.model.CDNUrl;
import com.airbnb.lottie.LottieAnimationView;
import ata.h;
import w4.c;
import java.util.Objects;
import android.widget.FrameLayout;
import wq6.h;

public final class d$c implements g	// class@0002f9
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       d d;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
       }else {
          String str = "TabLottieViewHelper";
          if (TextUtils.x(p0)) {
             objArray = new Object[0];
             b.C().w(str, "bind lottie from network", objArray);
             d.a(this.b).setAnimationFromUrl(d.b(this.b).mTabLottieUrl[0].mUrl);
          }else {
             d.a(this.b).setAnimationFromJson(p0);
          }
          d.a(this.b).setImageAssetDelegate(new h(this));
          d.a(this.b).s();
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, d.class, "3")) {
             d = p0.d;
             if (d != null) {
                d.setVisibility(0);
                p0.a = true;
                objArray = new Object[0];
                b.C().w(str, "showView", objArray);
             }
          }
          p0 = this.b;
          d.f(p0, p0.k.isSelected(), 0, 2, null);
       }
       return;
    }
}
