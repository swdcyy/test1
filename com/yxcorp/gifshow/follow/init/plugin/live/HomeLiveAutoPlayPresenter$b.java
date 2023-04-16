package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$b;
import s99.m;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import java.lang.Object;
import s99.l;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import vw5.a;
import kotlin.jvm.internal.a;
import tw5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import t99.w;
import t99.w$a;

public final class HomeLiveAutoPlayPresenter$b implements m	// class@0010bc
{
    public final HomeLiveAutoPlayPresenter a;

    public void HomeLiveAutoPlayPresenter$b(HomeLiveAutoPlayPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return l.b(this);
    }
    public void b(){
       l.c(this);
    }
    public boolean c(int p0,View p1){
       a obj;
       HomeLiveAutoPlayPresenter$b uob = HomeLiveAutoPlayPresenter$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.a.p == 5) {
          obj = d.a(-680793205);
          a.o(obj, "localPlugin");
          if (obj.az().a()) {
             c uoc = obj.az();
             a.o(uoc, "localPlugin.animatedStrategyProvider");
             return a.g(uoc.b(), this.a.Y8().getPhotoId());
          }else if(obj.Sh() > 0){
             return AutoPlayCardPlayChecker.ITEM_VERTICAL_PERCENT.checkPlay(this.a.y, ((float)obj.Sh() / 100.00f));
          }
       }
       HomeLiveAutoPlayPresenter$b ta = this.a;
       boolean b = (ta.p == 1)? AutoPlayCardPlayChecker.ITEM_VERTICAL_PERCENT.checkPlay(ta.y, 0x3f000000): AutoPlayCardPlayChecker.BOTTOM_HALF_TOP_HALF.checkPlay(null, null, ta.y);
       return b;
    }
    public void d(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLiveAutoPlayPresenter$b.class, "4")) {
          return;
       }
       this.a.l9();
       View[] viewArray = new View[]{this.a.W8()};
       n.Z(0, viewArray);
       View[] viewArray1 = new View[]{this.a.A};
       n.Z(8, viewArray1);
       return;
    }
    public void e(int p0,int p1,int p2,View p3,LivePlayTextureView p4,KwaiImageView p5){
       object oobject = p3;
       HomeLiveAutoPlayPresenter$b uob = HomeLiveAutoPlayPresenter$b.class;
       int i = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),oobject,p4,p5};
          if (!PatchProxy.applyVoid(objArray, this, uob, "2")) {
          label_0035 :
             a.p(oobject, "playView");
             HomeLiveAutoPlayPresenter$b ta = this.a;
             if (ta.p != i) {
                w.a.e(p0, p1, oobject, p4, p5, ta.A, ta.z);
             }
          }
       }else {
          goto label_0035 ;
       }
       return;
    }
    public void f(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLiveAutoPlayPresenter$b.class, "3")) {
          return;
       }
       this.a.a9();
       View[] viewArray = new View[]{this.a.W8()};
       n.Z(4, viewArray);
       View[] viewArray1 = new View[]{this.a.A};
       n.Z(4, viewArray1);
       return;
    }
}
