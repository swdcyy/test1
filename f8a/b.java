package f8a.b;
import erd.g;
import f8a.c;
import java.lang.Object;
import d0a.n;
import r1a.g;
import xx9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import e17.i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import mrd.a;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import zic.p0;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.p;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class b implements g	// class@0022e4
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       g og = g.class;
       if (tb.x == null) {
       }else {
          p0 = p0.a;
          if (p0 != null) {
             String str = "photo";
             if (p0 != 3) {
                if (p0 == 4 && tb.t.c()) {
                   c q = tb.q;
                   p0 = tb.p;
                   if (!PatchProxy.applyVoidTwoRefs(q, p0, null, og, "3")) {
                      a.p(q, "fragment");
                      a.p(p0, str);
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "SIMPLIFY_SCREEN_PHOTO_DOWNLOAD";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = w1.f(p0.getEntity());
                      u1.M("", q, 1, uElementPack, uContentPack, null);
                   }
                   if (!tb.p.isAllowPhotoDownload()) {
                      i.a(R.style.arg_RES_7f11066a, 0x7f100ecc);
                   }else {
                      p0 = tb.w;
                      GifshowActivity gifshowActiv = -1;
                      int currentPosit = (p0 != null && !p0.getScrollState())? tb.w.getCurrentPosition(): -1;
                      if (tb.v.i().intValue() > gifshowActiv) {
                         currentPosit = tb.v.i().intValue();
                      }
                      p0.b(tb.getActivity(), tb.p.mEntity, new StatModel("SCALE_CLEAN_CONTROLLER"), currentPosit, null);
                   }
                }
             }else if(tb.t.c()){
                RxBus.f.b(new p(tb.p.getPhotoId(), true));
                c q1 = tb.q;
                p0 = tb.p;
                if (!PatchProxy.applyVoidTwoRefs(q1, p0, null, og, "2")) {
                   a.p(q1, "fragment");
                   a.p(p0, str);
                   ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                   uElementPack1.action2 = "SIMPLIFY_SCREEN_TO_INNER_BUTTON";
                   ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
                   uContentPack1.photoPackage = w1.f(p0.getEntity());
                   u1.M("", q1, 1, uElementPack1, uContentPack1, null);
                }
             }
          }else if(tb.t.c()){
             tb.t.d(new ChangeScreenVisibleEvent(tb.p, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
             g.a(tb.q, tb.p, false, "CLICK");
          }
       }
       return;
    }
}
