package n9a.n;
import android.view.View;
import java.lang.Object;
import android.view.ViewParent;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;

public class n	// class@003115
{
    public final View a;
    public final ViewGroup b;
    public LottieAnimationView c;
    public LottieAnimationView d;

    public void n(View p0){
       super();
       this.a = p0;
       this.b = p0.getParent();
    }
    public final LottieAnimationView a(){
       n obj = PatchProxy.apply(null, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       ViewGroup$LayoutParams layoutParams = obj.getLayoutParams();
       LottieAnimationView lottieAnimat = new LottieAnimationView(obj.getContext());
       this.b.addView(lottieAnimat, layoutParams.width, layoutParams.height);
       return lottieAnimat;
    }
}
