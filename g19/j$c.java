package g19.j$c;
import qw6.a;
import g19.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.StringBuilder;
import yx.j0;
import g19.p;
import java.util.Objects;
import mxb.c;

public final class j$c implements a	// class@0023c0
{
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
    }
    public void H2(){
       if (PatchProxy.applyVoid(null, this, j$c.class, "1")) {
          return;
       }
       if (j.P8(this.b).r()) {
          QPhoto currentPhoto = j.P8(this.b).getCurrentPhoto();
          Object[] objArray = new Object[0];
          j0.f("MilanoProfileSideAdGapPresenter", currentPhoto+" is appear", objArray);
          p c = p.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(currentPhoto, c, p.class, "1")) {
             if (c.g(currentPhoto)) {
                p.b = 0;
             }
             int b = p.b;
             if (b >= 0) {
                p.b = b + 1;
             }
          }
       }
       return;
    }
    public void N2(){
    }
    public void Q0(){
    }
    public void Q1(){
    }
}
