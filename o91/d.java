package o91.d;
import o91.c;
import java.lang.Object;
import lp3.e;
import lp3.c;
import lp3.b;
import v71.b;
import x71.c;
import u71.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$EffectType;
import x71.b;
import x71.a;
import u71.c;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import h02.b;

public class d implements c	// class@0034b8
{
    public a b;

    public void d(){
       super();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void d7(b p0,c p1,a p2,int p3,int p4,int p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uod, "1")) {
             return;
          }
       }
       this.b = p2;
       p2.u(p0);
       p2.z(ILiveImageHelper$EffectType.kEffectTypeBeauty, 1);
       this.b.o(p3, p4, p5, p1);
       this.b.y();
       return;
    }
    public void destroy(){
       b.b(this);
    }
    public a hh(c p0,LiveCameraView p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-204054297).Yj(p0, p1);
    }
    public void l2(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d tb = this.b;
       if (tb != null) {
          tb.l2();
       }
       return;
    }
}
