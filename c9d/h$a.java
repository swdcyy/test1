package c9d.h$a;
import java.lang.Runnable;
import c9d.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.entity.RecommendResponse$CnyPopup;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import c9d.g;
import w4.j;
import c9d.f;

public class h$a implements Runnable	// class@000504
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       a.i(this.b.c.getContext(), this.b.b.mLottieResource).addListener(new g(this)).addFailureListener(new f(this));
       return;
    }
}
