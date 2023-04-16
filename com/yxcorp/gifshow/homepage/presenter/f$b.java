package com.yxcorp.gifshow.homepage.presenter.f$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.homepage.presenter.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.view.View;

public class f$b implements ViewTreeObserver$OnPreDrawListener	// class@0017c1
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       f$b obj = PatchProxy.apply(null, this, f$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.r.getViewTreeObserver().removeOnPreDrawListener(this);
       obj = this.b;
       obj.P8(obj.r.getMeasuredWidth());
       return true;
    }
}
