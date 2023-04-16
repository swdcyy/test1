package com.yxcorp.gifshow.decoration.widget.DecorationContainerView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.f$a;
import com.yxcorp.gifshow.decoration.widget.f;

public class DecorationContainerView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0012b3
{
    public final DecorationContainerView b;

    public void DecorationContainerView$a(DecorationContainerView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, DecorationContainerView$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       DecorationContainerView q = this.b.q;
       q.a(q.g());
       return;
    }
}
