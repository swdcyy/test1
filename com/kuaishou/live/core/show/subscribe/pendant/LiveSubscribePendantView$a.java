package com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.util.Objects;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView$b;

public class LiveSubscribePendantView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00114c
{
    public final LiveSubscribePendantView b;

    public void LiveSubscribePendantView$a(LiveSubscribePendantView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSubscribePendantView$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       LiveSubscribePendantView$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveSubscribePendantView.class, "8")) {
          float f = (float)LiveSubscribePendantView.D;
          float f1 = (float)LiveSubscribePendantView.E;
          float[] subscribePen = tb.getSubscribePendantLastPosition();
          if (subscribePen != null && subscribePen.length == 2) {
             f = subscribePen[0];
             f1 = subscribePen[1];
          }
          tb.setX(tb.B(f));
          tb.setY(tb.C(f1));
          LiveSubscribePendantView y = tb.y;
          if (y != null) {
             y.a();
          }
       }
       return;
    }
}
