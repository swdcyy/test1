package hz0.b$d;
import jk1.c;
import hz0.b;
import java.lang.Object;
import jk1.d;
import com.kwai.framework.model.user.UserInfo;
import jk1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ug1.r;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import i81.g;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$BizType;
import java.lang.Integer;
import lnc.a1;

public class b$d implements c	// class@0027cd
{
    public final b a;

    public void b$d(b p0){
       this.a = p0;
       super();
    }
    public void a(d p0,UserInfo p1){
       b.e(this, p0, p1);
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "2")) {
          return;
       }
       this.a.F.b("LIVE_GIFT_BOX_PANEL");
       LiveBulletinLayoutManager liveBulletin = this.a.p.i7();
       if (liveBulletin != null) {
          liveBulletin.d(LiveBulletinLayoutManager$BizType.GIFT_BOX_PANEL);
       }
       return;
    }
    public void d(){
       b.c(this);
    }
    public void e(int p0,int p1){
       b$d uod = b$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       this.a.F.a("LIVE_GIFT_BOX_PANEL", p1);
       LiveBulletinLayoutManager liveBulletin = this.a.p.i7();
       if (liveBulletin != null) {
          liveBulletin.b(LiveBulletinLayoutManager$BizType.GIFT_BOX_PANEL, (p1 + a1.d(R.dimen.arg_RES_7f070783)));
       }
       return;
    }
    public void f(d p0){
       b.b(this, p0);
    }
}
