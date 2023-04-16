package com.kuaishou.live.gzone.v2.imagepreview.n$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kuaishou.live.gzone.v2.imagepreview.n;
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
import a63.d;
import android.view.View;
import android.animation.ValueAnimator;

public class n$b implements ViewTreeObserver$OnPreDrawListener	// class@001cd4
{
    public final n b;

    public void n$b(n p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       n$b obj = PatchProxy.apply(null, this, n$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.p.getViewTreeObserver().removeOnPreDrawListener(this);
       this.b.t.e(true);
       n$b tb = this.b;
       tb.y = tb.W8(tb.t.g, this.b.Z8());
       obj = this.b;
       obj.z = obj.V8(obj.y, obj.p, 0, 255);
       obj = this.b;
       if (obj.v == obj.u) {
          obj.z.start();
       }
       return 0;
    }
}
