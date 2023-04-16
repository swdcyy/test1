package df2.p;
import u07.u;
import df2.m0;
import java.lang.String;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import wkd.b;
import rfc.a;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import brd.t;
import brd.x;
import a51.c;
import cjd.e;
import erd.o;
import df2.b0;
import sfc.a;
import android.content.Context;
import erd.g;
import crd.b;

public final class p implements u	// class@002502
{
    public final m0 b;
    public final String c;

    public void p(m0 p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       p tb = this.b;
       Objects.requireNonNull(tb);
       b0 uob0 = new b0(tb, this.c);
       b.a(0x4a533fa).a(tb.x.getAnchorUserId(), tb.x.getUserProfile().mProfile.mId, null, null).compose(tb.P8()).map(new e()).subscribe(uob0, new a(tb.w));
    }
}
