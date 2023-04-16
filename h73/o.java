package h73.o;
import lg1.a;
import h73.t;
import java.lang.String;
import z1.a;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import com.kuaishou.live.common.core.component.fansgroup.joindialog.LiveAudienceJoinFansGroupDialog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h73.m;
import h73.h;
import h73.i;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import xp5.g;
import erd.g;
import pg1.e;

public final class o implements a	// class@002cbc
{
    public final t a;
    public final int b;
    public final String c;
    public final a d;
    public final a e;
    public final String f;

    public void o(t p0,int p1,String p2,a p3,a p4,String p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final void a(User p0){
       o oo = this;
       o a = oo.a;
       o b = oo.b;
       o c = oo.c;
       o d = oo.d;
       o e = oo.e;
       o f = oo.f;
       t a1 = a.a;
       Objects.requireNonNull(a1);
       if (PatchProxy.applyVoid(null, a1, LiveAudienceJoinFansGroupDialog.class, "7")) {
       }else {
          a1.z.setVisibility(0);
          a1.z.k();
          a1.y.setAlpha(0x3f000000);
          a1.x.setVisibility(8);
       }
       if (p0.isFollowingOrFollowRequesting()) {
          if (a.i(b, "LITE_ROOM_JOIN_FANS_GROUP")) {
             a.b();
             a.f("JoinDialog", (long)b);
          }else {
             a.g(d, new m(a, c), e, f);
          }
       }else {
          h oh = new h(a, p0, b, c, d, e, f);
          a.e.l7(a.c.j0(), a.c.d(), 0, false, v16, new i(a, c));
       }
       return;
    }
}
