package ox0.j;
import erd.g;
import ox0.l;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import rd1.c0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rd1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class j implements g	// class@0035bf
{
    public final l b;
    public final boolean c;
    public final boolean d;
    public final Activity e;
    public final String[] f;

    public void j(l p0,boolean p1,boolean p2,Activity p3,String[] p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       l g;
       l f;
       String str;
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       j te = this.e;
       j tf = this.f;
       c0 uoc0 = c0.class;
       c0.J(tb.f, p0.booleanValue(), "ANCHOR");
       if (p0.booleanValue()) {
          p0 = tb.h;
          boolean b = true;
          int i = (tc != null)? 2: 1;
          p0.jd(i, b, null);
          if (tc != null) {
             g = tb.g;
             f = tb.f;
             if (!PatchProxy.isSupport(uoc0) || !PatchProxy.applyVoidThreeRefs(g, f, Boolean.valueOf(td), null, c0.class, "35")) {
                str = (td != null)? "CLICK_AUDIENCE_CHAT_ACCEPTED_VIDEO": "CLICK_AUDIENCE_CHAT_INVITE_VIDEO";
                c0.O(str, "", g, f);
             }
          }else {
             g = tb.g;
             f = tb.f;
             if (!PatchProxy.isSupport(uoc0) || !PatchProxy.applyVoidThreeRefs(g, f, Boolean.valueOf(td), null, c0.class, "36")) {
                str = (td != null)? "CLICK_AUDIENCE_CHAT_ACCEPTED_VOICE": "CLICK_AUDIENCE_CHAT_INVITE_VOICE";
                c0.O(str, "", g, f);
             }
          }
       }else {
          PermissionUtils.n(te, tf);
          tb.h.p9(3);
       }
       return;
    }
}
