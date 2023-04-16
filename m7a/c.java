package m7a.c;
import m7a.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import xx9.a;
import lnc.a1;
import m7a.c$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.widget.popup.a;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import uw9.o;
import q87.c;

public class c implements a	// class@002f6a
{
    public final RecreationHotAreaHelper a;

    public void c(RecreationHotAreaHelper p0){
       this.a = p0;
       super();
    }
    public void onClickEvent(int p0,int p1,String p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c.class, "1")) {
          return;
       }
       if (this.a.h.c()) {
          this.a.b();
          return;
       }else {
          p1.j = p.o(this.a.a(a1.p(0x7f10507a), new c$a(this, p2), p0, p1, 0x7f081e15, 3000));
          this.a.h("PHOTO");
          Object[] objArray = new Object[0];
          o.C().w("RecreationHotAreaHelper", "click video area, photo.....", objArray);
          return;
       }
    }
}
