package b4d.u0;
import erd.g;
import b4d.v0;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import android.view.View;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.c3$a;
import com.yxcorp.gifshow.model.CDNUrl;
import jl5.i;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.ViewTreeObserver;
import b4d.w0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class u0 implements g	// class@000392
{
    public final v0 b;

    public void u0(v0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u0 tb = this.b;
       Objects.requireNonNull(tb);
       Pair first = p0.first;
       Pair pair = p0.second;
       p0 = v0.class;
       if (PatchProxy.applyVoidTwoRefs(first, pair, tb, p0, "9")) {
       }else if(pair == null){
          boolean b = false;
          tb.y = b;
          Object obj = null;
          tb.r.apply(obj);
          if (tb.I != null) {
             tb.z.setVisibility(b);
             tb.B.setVisibility(b);
             tb.B.setAlpha(0x3f800000);
             CDNUrl[] uCDNUrlArray = i.a(pair);
             tb.R8(pair, tb.A, uCDNUrlArray, obj);
             tb.q.apply(pair);
          }else {
             v0 b1 = tb.B;
             if (b1 != null) {
                b1.setVisibility(b);
                tb.B.setAlpha(0);
             }
             p0 = PatchProxy.applyOneRefs(first, tb, p0, "10");
             if (p0 != PatchProxyResult.class) {
             }else if(first instanceof ImageView){
                p0 = first.getDrawable().mutate();
             }else {
             label_0077 :
                first.getLocationInWindow(tb.F);
                int width = first.getWidth();
                int height = first.getHeight();
                int visibility = tb.z.getVisibility();
                if (visibility == 8) {
                   v0 z = tb.z;
                   z.setVisibility(b);
                   w0 ow0 = new w0(tb, width, height, obj, pair);
                   tb.z.getViewTreeObserver().addOnGlobalLayoutListener(v7);
                }else {
                   tb.Y8(tb.F, width, height, obj, pair);
                }
             }
             obj = p0;
             goto label_0077 ;
          }
       }
       return;
    }
}
