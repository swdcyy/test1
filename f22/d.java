package f22.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.b;

public final class d implements PopupInterface$h	// class@002846
{
    public final AutoInviteFriendsGuidingPanel b;

    public void d(AutoInviteFriendsGuidingPanel p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       AutoInviteFriendsGuidingPanel b = this.b.b;
       if (b != null) {
          b.dispose();
       }
       return;
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
