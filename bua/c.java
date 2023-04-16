package bua.c;
import bua.d;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import x99.s0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import lv5.c;
import lv5.b;
import bua.a;
import bua.b;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;

public class c extends d	// class@000473
{

    public void c(CardStyle p0){
       super(false, p0);
    }
    public void R8(boolean p0,CardStyle p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "1")) {
          return;
       }
       this.U7(new s0());
       this.U7(d.a(-242212848).nm(p1));
       if (CardStyle.isV6Bottom(p1.mBottomType)) {
          return;
       }
       if (p0) {
          this.U7(new a());
       }else {
          this.U7(new b(p1));
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(c.class, null);
       return objectsByTag;
    }
}
