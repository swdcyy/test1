package com.kuaishou.commercial.tach.component.TKMeasuredView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.commercial.tach.component.TKMeasuredView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.tachikoma.core.component.e;
import com.tachikoma.core.component.TKYogaLayout;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class TKMeasuredView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00165d
{
    public final TKMeasuredView b;

    public void TKMeasuredView$a(TKMeasuredView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TKMeasuredView$a.class, "1")) {
          return;
       }
       TKYogaLayout view = this.b.getView();
       if (view != null) {
          view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          if (this.b.mDestroyed == null) {
             view.getViewTreeObserver().addOnGlobalLayoutListener(this);
             this.b.callbackSizeChange();
          }
       }
       return;
    }
}
