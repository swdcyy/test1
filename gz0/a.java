package gz0.a;
import t02.a0;
import android.view.View;
import java.lang.Object;
import ekd.m1;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jv1.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import android.graphics.drawable.Drawable;
import lnc.a1;

public abstract class a	// class@0025c2
{
    public final View a;
    public final KwaiImageView b;
    public final LottieAnimationView c;
    public a0 d;

    public void a(a0 p0,View p1){
       super();
       this.d = p0;
       this.a = p1;
       this.c = m1.f(p1, 0x7f0a1d07);
       this.b = m1.f(p1, 0x7f0a1cfe);
    }
    public abstract void a();
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       boolean b = this.d.x.H2();
       a td = this.d;
       a0 e = td.e;
       if (e == null || e.mIsFromLiveMate == null) {
          this.a.setBackground(a1.f(R.drawable.arg_RES_7f08111d));
          return;
       }else if(b){
          this.a.setBackground(a1.f(R.drawable.arg_RES_7f08124b));
       }else if(td.l()){
          this.a.setBackground(a1.f(R.drawable.arg_RES_7f08124a));
       }else {
          this.a.setBackground(a1.f(R.drawable.arg_RES_7f081171));
       }
       return;
    }
}
