package com.yxcorp.gifshow.comment.emotion.detail.e$a;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView$c;
import com.yxcorp.gifshow.comment.emotion.detail.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.utility.n;

public class e$a implements XfScalableImageView$c	// class@0010c6
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void onClick(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$a.class, "1")) {
          return;
       }
       e$a ta = this.a;
       Objects.requireNonNull(ta);
       View[] obj = PatchProxy.apply(objArray, ta, e.class, "10");
       if (obj != PatchProxyResult.class) {
          obj.booleanValue();
       }else {
          int i = 4;
          int i1 = 2;
          int i2 = 1;
          if (ta.P8()) {
             obj = new View[i];
             obj[0] = ta.v;
             obj[i2] = ta.u;
             obj[i1] = ta.w;
             obj[3] = ta.x;
          }else {
             obj = new View[i1];
             obj[0] = ta.v;
             obj[i2] = ta.u;
          }
          if (ta.u.getVisibility()) {
             i = 0;
          }
          n.Z(i, obj);
       }
       return;
    }
}
