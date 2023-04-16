package com.yxcorp.gifshow.detail.common.rightactionbar.like.LikeElement$a;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.rightactionbar.like.LikeElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.rightactionbar.like.b;
import w4.e;
import android.view.View;
import androidx.fragment.app.Fragment;
import g9a.f;
import qp7.d;
import com.kwai.slide.play.detail.rightactionbar.like.a;

public class LikeElement$a extends y0	// class@0014a3
{
    public final LikeElement a;

    public void LikeElement$a(LikeElement p0){
       this.a = p0;
       super();
    }
    public void a(){
       PatchProxy.applyVoid(null, this, LikeElement$a.class, "3");
    }
    public void b(){
       PatchProxy.applyVoid(null, this, LikeElement$a.class, "4");
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LikeElement$a.class, "2")) {
          return;
       }
       LikeElement$a ta = this.a;
       LikeAnimationEnum sTOP = LikeAnimationEnum.STOP;
       ta.z = sTOP;
       ta.E().j(sTOP, objArray);
       if (this.a.A.getView() instanceof f && this.a.C() != null) {
          this.a.A.getView().t2(this.a.C().f);
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LikeElement$a.class, "1")) {
          return;
       }
       if (this.a.A.getView() instanceof f && this.a.C() != null) {
          this.a.A.getView().J1(this.a.C().f);
       }
       return;
    }
}
