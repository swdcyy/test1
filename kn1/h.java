package kn1.h;
import android.view.animation.Animation;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding;
import android.view.animation.Transformation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;

public final class h extends Animation	// class@002d74
{
    public final LiveHotSpotDetailBottomNavigatorDataBinding b;
    public final int c;

    public void h(LiveHotSpotDetailBottomNavigatorDataBinding p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void applyTransformation(float p0,Transformation p1){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, h.class, "1")) {
          return;
       }
       String str = "nextTextView";
       float f = 0;
       if (!p0 - f) {
          TextView textView = this.b.b();
          a.o(textView, str);
          textView.setAlpha(f);
       }
       TextView textView1 = this.b.b();
       a.o(textView1, str);
       h tc = this.c;
       float f1 = (float)tc;
       str.width = (int)(f1 - ((float)tc * p0));
       this.b.b().requestLayout();
       return;
    }
    public boolean willChangeBounds(){
       return true;
    }
}
