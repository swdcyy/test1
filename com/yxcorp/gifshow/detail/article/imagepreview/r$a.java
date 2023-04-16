package com.yxcorp.gifshow.detail.article.imagepreview.r$a;
import ub.a;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.LinearLayout;
import android.graphics.drawable.Animatable;
import bd.f;

public class r$a extends a	// class@00135c
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r$a.class, "2")) {
          return;
       }
       this.b.r.setVisibility(8);
       this.b.s.setVisibility(0);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, r$a.class, "1")) {
       }else {
          r$a tb = this.b;
          tb.F = true;
          tb.r.setVisibility(8);
          this.b.s.setVisibility(8);
       }
       return;
    }
}
