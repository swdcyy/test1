package g82.b;
import android.view.View$OnClickListener;
import g82.v;
import java.lang.Object;
import android.view.View;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LiveSuperFansGroupInfo;
import g82.a;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import g82.o;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import kg1.i;
import mg1.a;
import android.widget.TextView;
import l82.a;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b implements View$OnClickListener	// class@002a95
{
    public final v b;

    public void b(v p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       int i;
       b tb = this.b;
       BaseFragment uBaseFragmen = tb.p.Z2.b();
       v w0 = tb.W0;
       boolean b = true;
       if (w0 != null && w0.mStatus != null) {
          i = 2;
       }else {
          a d = tb.A.d;
          i = (d != null && d.mStatus == b)? 1: 0;
       }
       i.c(uBaseFragmen, b, i, k0.a(tb.Q, o.a).orNull(), tb.p.Z2.a());
       tb.x9("FANS_GROUP_PANEL", null);
       if (!tb.I.getVisibility()) {
          tb.X7(e.g().c(tb.p.Z2.getLiveStreamId(), tb.P).map(new e()).subscribe(Functions.d(), Functions.d()));
          tb.I.setVisibility(8);
       }
       return;
    }
}
