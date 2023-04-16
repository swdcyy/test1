package com.yxcorp.gifshow.homepage.presenter.m;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.q;
import java.lang.Object;
import i8c.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.reco.FeedMiscPojo;
import java.lang.StringBuilder;
import com.kwai.logger.KwaiLog;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wkd.b;
import tjc.c;
import hn5.y;
import eg5.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import com.yxcorp.gifshow.homepage.presenter.k;
import u07.u;
import yta.d1;
import com.yxcorp.gifshow.homepage.presenter.l;
import u07.a;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.homepage.presenter.p;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class m implements g	// class@0017d1
{
    public final q b;

    public void m(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       q oq = q.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oq, "8")) {
       }else if(!FeedMiscPojo.hasFeedMiscPojoInit()){
          FeedMiscPojo.setFeedMiscPojoInit();
          int i = 1;
          q.r = FeedMiscPojo.isFeedRecommendEnabled() ^ i;
          q.s = FeedMiscPojo.isCommercialRecommendEnabled() ^ i;
          int i1 = 0;
          Object[] objArray = new Object[i1];
          KwaiLog.b("NonPersonalRecommendP", "call tryShowEachDialog\(\) when onStartupFinished\(\) fragment is "+tb.q.getClass(), objArray);
          p0 = null;
          if (!PatchProxy.applyVoid(p0, tb, oq, "3")) {
             p0 = PatchProxy.apply(p0, tb, oq, "4");
             if (p0 != PatchProxyResult.class) {
                i = p0.booleanValue();
             }else if(q.t || (!FeedMiscPojo.hasFeedMiscPojoInit() || (!tb.q.Vg().a() || (b.a(-1608526086).S() || (!q.r || (b.a(0x5cc4db59).a != null || e.a())))))){
                p0 = tb.getActivity();
                if (p0 != null && (!p0.isFinishing() && !tb.P8(p0))) {
                   if (!PatchProxy.applyVoidOneRefs(p0, tb, oq, "9")) {
                      Object[] objArray1 = new Object[i1];
                      KwaiLog.b("NonPersonalRecommendP", "call showFeedRecoDialog\(\)", objArray1);
                      d uod = new d(tb.getActivity());
                      uod.b1(KwaiDialogOption.f);
                      uod.B0(R.drawable.arg_RES_7f080bd1);
                      uod.W0(R.string.arg_RES_7f100f02);
                      uod.s0(k.b);
                      uod.y0(R.string.arg_RES_7f100efc);
                      uod.S0(R.string.arg_RES_7f100f00);
                      uod.Q0(R.string.arg_RES_7f100eff);
                      uod.u0(new d1(tb));
                      uod.t0(l.b);
                      t$a uoa = a.c(uod);
                      uoa.V0(i);
                      uoa.B(i);
                      uoa.A(i);
                      uoa.P(i1);
                      uoa.Y(new p(tb, p0));
                   }
                }
             }
          label_012c :
             i = false;
             if (!i) {
                tb.S8();
             }
          }
       }
       return;
    }
}
