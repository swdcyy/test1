package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement$a;
import qp7.y0;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.rightactionbar.like.b;
import w4.e;

public class AdLikeElement$a extends y0	// class@001724
{
    public final AdLikeElement a;

    public void AdLikeElement$a(AdLikeElement p0){
       this.a = p0;
       super();
    }
    public void a(){
       PatchProxy.applyVoid(null, this, AdLikeElement$a.class, "3");
    }
    public void b(){
       PatchProxy.applyVoid(null, this, AdLikeElement$a.class, "4");
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, AdLikeElement$a.class, "2")) {
          return;
       }
       AdLikeElement$a ta = this.a;
       LikeAnimationEnum sTOP = LikeAnimationEnum.STOP;
       ta.y = sTOP;
       ta.E().j(sTOP, null);
       return;
    }
    public void h(){
       PatchProxy.applyVoid(null, this, AdLikeElement$a.class, "1");
    }
}
