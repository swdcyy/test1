package ee9.k;
import z3b.f;
import ee9.l;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import hc9.e;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.q;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import w46.b;
import z3b.e;

public class k implements f	// class@00212c
{
    public final l a;

    public void k(l p0){
       this.a = p0;
       super();
    }
    public void b(MagicBaseConfig p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       int i = 0;
       if (!p0.isMagicFace()) {
          objArray = new Object[i];
          a.D().A("MagicDownloadBoxController", "checkMagicFace, wrong type ,This should not happen", objArray);
          return;
       }else if(!p0.equals(this.a.q.f())){
          objArray = new Object[i];
          a.D().A("MagicDownloadBoxController", "checkMagicFace, magic is changed", objArray);
          return;
       }else {
          this.a.h2();
          Object[] objArray1 = new Object[i];
          a.D().w("MagicDownloadBoxController", "default magic emoji download finish", objArray1);
          d h = this.a.h;
          if (h != null && h.R()) {
             this.a.q.d(5, p0);
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w("MagicDownloadBoxController", "discard default magic emoji", objArray2);
             this.a.q.d(7, p0);
          }
          return;
       }
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "1")) {
          return;
       }
       int i = 0;
       if (!p0.equals(this.a.q.f())) {
          Object[] objArray = new Object[i];
          a.D().A("MagicDownloadBoxController", "checkMagicFace, magic is changed", objArray);
          return;
       }else {
          this.a.h2();
          int i1 = 0x7f110668;
          int i2 = (PostExperimentUtils.p())? 0x7f100de1: 0x7f100de0;
          i.d(i1, a1.p(i2));
          Object[] objArray1 = new Object[i];
          a.D().u("MagicDownloadBoxController", p1, objArray1);
          this.a.q.c(null, i);
          return;
       }
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
       e.d(this, p0, p1, p2);
    }
}
