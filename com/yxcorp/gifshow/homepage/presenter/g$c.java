package com.yxcorp.gifshow.homepage.presenter.g$c;
import ub.a;
import com.yxcorp.gifshow.homepage.presenter.g;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class g$c extends a	// class@0017c7
{
    public final g b;

    public void g$c(g p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g$c.class, "1")) {
       }else if(p1 != null && (p1.getWidth() <= 0 || p1.getHeight() <= 0)){
          g$c tb = this.b;
          tb.C = p1;
          tb.P8(tb.r.getMeasuredWidth());
       }
       return;
    }
}
