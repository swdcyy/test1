package com.yxcorp.gifshow.comment.emotion.detail.e$b;
import ub.a;
import com.yxcorp.gifshow.comment.emotion.detail.e;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.util.Objects;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView;
import java.lang.Integer;

public class e$b extends a	// class@0010c7
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e$b.class, "1")) {
       }else {
          e t = this.b.t;
          int i = a1.e(180.00f);
          int i1 = a1.e(180.00f);
          Objects.requireNonNull(t);
          if (!PatchProxy.isSupport(XfScalableImageView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), Integer.valueOf(i1), p1, t, XfScalableImageView.class, "20")) {
             t.J = i;
             t.K = i1;
             t.L = p1.getWidth();
             t.M = p1.getHeight();
             t.n0();
          }
       }
       return;
    }
}
