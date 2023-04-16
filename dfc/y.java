package dfc.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import j9c.b;
import dub.z;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.i;
import com.yxcorp.gifshow.reminder.news.data.d;
import bdc.b;
import sy6.a;

public class y extends PresenterV2	// class@0021bd
{
    public a p;
    public b q;

    public void y(){
       super();
    }
    public void E8(){
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, oy, "4")) {
          int i = -8;
          Boolean uBoolean = b.c(i, Boolean.class);
          if (uBoolean != null && uBoolean.booleanValue()) {
             z.d("NewsSlidePlay", i, 0, objArray);
          }
       }
       oy = this.p;
       if (oy instanceof SlidePlayViewModel) {
       }else {
          Object[] objArray1 = objArray;
       }
       d uod = (oy != null && oy.X0() instanceof d)? oy.X0(): objArray;
       if (uod != null) {
          objArray = uod.p;
       }
       this.q = objArray;
       if (objArray != null) {
          objArray.c();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y.class, "3")) {
          return;
       }
       y tq = this.q;
       if (tq != null) {
          tq.e();
          this.q = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       return;
    }
}
