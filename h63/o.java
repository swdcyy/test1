package h63.o;
import android.content.DialogInterface$OnClickListener;
import h63.y;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import jga.f$a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import y43.a;
import com.kwai.framework.model.user.User;
import java.lang.String;
import va1.d0;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import erd.g;
import io.reactivex.internal.functions.Functions;
import sfc.a;
import crd.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import e63.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class o implements DialogInterface$OnClickListener	// class@002c93
{
    public final y b;
    public final GifshowActivity c;

    public void o(y p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       o tb = this.b;
       o tc = this.c;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f104f05) {
          f$a uoa = new f$a(tb.q.Q().getUser(), tc.Q2());
          uoa.o(d0.a(tb.q.Q()));
          uoa.q(false);
          FollowHelper.k(uoa.b()).compose(c.c(tb.q.m.b().m(), FragmentEvent.DESTROY)).subscribe(Functions.d(), new a());
          ClientContent$LiveStreamPackage liveStreamPa = tb.r.a();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, k1.class, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "UNFOLLOW_CONFIRM_BUTTON";
             new ClientEvent$UrlPackage().page = 13;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return;
    }
}
