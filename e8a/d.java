package e8a.d;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import k9a.c;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.atomic.AtomicReference;
import uw9.o;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import q87.c;
import com.yxcorp.gifshow.util.ColorURLSpan;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import lnc.a1;

public class d extends b	// class@00209f
{
    public final c n;

    public void d(QPhoto p0,int p1,int p2,int p3,Boolean p4,boolean p5){
       super(p0, p1, p2, p3, p4, p5);
       this.n = new c(p0);
    }
    public t c(){
       String caption;
       CharSequence obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       boolean b = (this.f.get() != null)? true: false;
       o oo = o.C();
       StringBuilder str = "getCaption--photoId = "+this.g.getPhotoId()+"--cache = "+b+" "+this.g.getUserName()+" caption: ";
       obj = (b)? this.f.get(): this.g.getCaption();
       Object[] objArray = new Object[i];
       oo.w("FeatureCaptionManager", str+obj, objArray);
       return super.c();
    }
    public void h(ColorURLSpan p0,ActivityInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       int i = a1.a(R.color.arg_RES_7f061c32);
       int i1 = a1.a(R.color.arg_RES_7f061bf1);
       ActivityInfo mColor = p1.mColor;
       if (mColor != null) {
          i = mColor;
       }
       p1 = p1.mPressedColor;
       if (p1 != null) {
          i1 = p1;
       }
       p0.g(i);
       p0.l(i1);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("FeatureCaptionManager", "parseCaption--photoId = "+this.g.getPhotoId(), objArray);
       super.j();
       return;
    }
    public c n(){
       return this.n;
    }
}
