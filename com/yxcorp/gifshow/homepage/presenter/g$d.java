package com.yxcorp.gifshow.homepage.presenter.g$d;
import ub.a;
import com.yxcorp.gifshow.homepage.presenter.g;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class g$d extends a	// class@0017c8
{
    public final g b;

    public void g$d(g p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g$d.class, "1")) {
       }else {
          g y = this.b.y;
          if (y != null) {
             y.setVisibility(0);
          }
       }
       return;
    }
}
