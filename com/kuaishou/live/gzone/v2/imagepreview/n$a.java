package com.kuaishou.live.gzone.v2.imagepreview.n$a;
import ub.a;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.model.PreviewModel;
import h61.a;
import android.graphics.drawable.Animatable;
import bd.f;

public class n$a extends a	// class@001cd3
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n$a.class, "2")) {
          return;
       }
       this.b.r.setVisibility(8);
       this.b.s.setVisibility(0);
       a.c(0, this.b.t.d);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n$a.class, "1")) {
       }else {
          n$a tb = this.b;
          tb.E = true;
          tb.r.setVisibility(8);
          this.b.s.setVisibility(8);
          a.c(true, this.b.t.d);
       }
       return;
    }
}
