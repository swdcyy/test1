package com.yxcorp.gifshow.homepage.presenter.g$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.homepage.presenter.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.view.View;

public class g$b implements ViewTreeObserver$OnPreDrawListener	// class@0017c6
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       g$b obj = PatchProxy.apply(null, this, g$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.r.getViewTreeObserver().removeOnPreDrawListener(this);
       obj = this.b;
       obj.R8(obj.r.getMeasuredWidth());
       obj = this.b;
       obj.P8(obj.r.getMeasuredWidth());
       return true;
    }
}
