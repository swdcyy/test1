package aec.g;
import android.view.View$OnClickListener;
import aec.d;
import sx5.i;
import com.kwai.feature.api.social.reminder.push.OpenServiceBarResponse;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import crd.a;
import com.kwai.feature.api.social.reminder.push.SocialPushKt;

public final class g implements View$OnClickListener	// class@000101
{
    public final d b;
    public final i c;
    public final OpenServiceBarResponse d;

    public void g(d p0,i p1,OpenServiceBarResponse p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "1")) {
          return;
       }
       d q = this.b.q;
       if (q == null) {
          a.S("tabHost");
       }
       g td = this.d;
       SocialPushKt.c(q, td.authorityItemId, Boolean.valueOf(td.needReport), this.d.source);
       this.b.R8();
       this.b.P8();
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
}
