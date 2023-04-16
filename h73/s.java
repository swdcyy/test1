package h73.s;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import h73.t;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import java.util.HashMap;
import java.util.Map;
import l95.c;
import o07.o;

public class s implements PopupInterface$h	// class@002cc0
{
    public final String b;
    public final t c;

    public void s(t p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       s tc = this.c;
       s tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(tb, tc, t.class, "17") && FansGroupKswitchUtil.b()) {
          b uob = new b(true, "JoinDialog", "SHOW");
          uob.g(tb);
          HashMap hashMap = new HashMap();
          hashMap.put("popupType", "UPGRADE_POPUP");
          uob.d(hashMap);
          c.a(uob);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
