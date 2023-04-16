package com.yxcorp.gifshow.detail.article.imagepreview.r$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.PreviewModel;
import android.graphics.Rect;
import xw9.d;
import android.view.View;
import android.animation.ValueAnimator;

public class r$b implements ViewTreeObserver$OnPreDrawListener	// class@00135d
{
    public final r b;

    public void r$b(r p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       r$b obj = PatchProxy.apply(null, this, r$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.p.getViewTreeObserver().removeOnPreDrawListener(this);
       this.b.t.e(true);
       r$b tb = this.b;
       tb.z = tb.V8(tb.t.g, this.b.X8());
       obj = this.b;
       obj.A = obj.S8(obj.z, obj.p, 0, 255);
       obj = this.b;
       if (obj.v == obj.u) {
          obj.A.start();
       }
       return 0;
    }
}
