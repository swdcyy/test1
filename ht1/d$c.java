package ht1.d$c;
import w4.j;
import java.io.FileInputStream;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.String;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import ht1.e;
import w4.c;
import android.widget.ImageView;

public final class d$c implements j	// class@002777
{
    public final FileInputStream a;
    public final LottieAnimationView b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public void d$c(FileInputStream p0,LottieAnimationView p1,String p2,boolean p3,boolean p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
       }else {
          this.a.close();
          if (p0 != null) {
             this.b.setComposition(p0);
          }
          this.b.setImageAssetDelegate(new e(this));
          if (this.d != null) {
             this.b.setVisibility(0);
             this.b.s();
             if (this.e != null) {
                this.b.setRepeatCount(-1);
             }
          }
       }
       return;
    }
}
