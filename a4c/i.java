package a4c.i;
import android.view.View$OnClickListener;
import a4c.j;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import nf6.i;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicRankModelV2;
import java.lang.String;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import y3c.y;
import s1c.r0;
import java.util.Objects;
import y3c.y$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MusicBillboardPackage;
import k2b.u1;

public final class i implements View$OnClickListener	// class@000073
{
    public final j b;
    public final int c;

    public void i(j p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       r0 b;
       i tb = this.b;
       i tc = this.c;
       tb.getActivity().startActivity(b.a(0x66dce92a).a(tb.getActivity(), w0.f(tb.p.mMusicRankModelV2.mKwaiUrl)));
       y$a a = y.a;
       j p = tb.p;
       b = tb.q.b;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(y$a.class) || !PatchProxy.applyVoidFourRefs(p, null, b, Integer.valueOf(tc), a, y$a.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x7931;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (b != null) {
             uContentPack.profilePackage = a.c(b);
          }
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          if (p != null) {
             uContentPack.musicDetailPackage = a.b(p, tc);
             uContentWrap.musicBillboardPackage = a.a(p);
          }
          u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       }
       return;
    }
}
