package h52.b;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h52.b$f;
import h52.j;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import o56.a;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import h52.b$d;
import androidx.recyclerview.widget.RecyclerView$n;
import lnc.a1;
import com.yxcorp.plugin.live.widget.CircleHollowOutAvatarRecyclerView;
import android.view.View;
import d61.i;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CoverMeta;
import vb5.a;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import h52.a;
import java.lang.Runnable;
import android.view.ViewGroup;
import j52.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import m52.a;
import e52.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import h52.b$a;
import android.view.View$OnClickListener;
import a2.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h52.b$b;
import android.view.GestureDetector$OnGestureListener;
import h52.b$c;
import androidx.recyclerview.widget.RecyclerView$q;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends c	// class@002c4e
{
    public j p;
    public a q;
    public a r;
    public BaseFragment s;
    public CircleHollowOutAvatarRecyclerView t;
    public KwaiImageView u;
    public static String sLivePresenterClassName = "LivePlayClosedV2AggregationFeedPresenter";

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       b$f uof = new b$f();
       uof.W0(this.p.g);
       this.t.setAdapter(uof);
       this.t.setLayoutManager(new LinearLayoutManager(a.B, 0, 0));
       this.t.addItemDecoration(new b$d(this));
       this.t.setItemOffsetPx(a1.e(8.00f));
       this.t.setHollowOutWidthPx(a1.d(R.dimen.arg_RES_7f0702e3));
       if (!PatchProxy.applyVoid(objArray, this, uob, "5") && (!i.a(this.u) && !q.f(this.p.g))) {
          QPhoto qPhoto = this.p.g.get(0);
          if (qPhoto.getCoverMeta() != null) {
             ImageRequest[] imageRequest = b.e(qPhoto.getCoverMeta(), (qPhoto.getWidth() / 8), (qPhoto.getHeight() / 8), new a(10));
             if (imageRequest.length) {
                d uod = Fresco.newDraweeControllerBuilder();
                uod.y(this.u.getController());
                uod.u(imageRequest);
                AbstractDraweeController uAbstractDra = uod.e();
                this.u.setController(uAbstractDra);
             }
          }
       }
       this.t.post(new a(this));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b ts = this.s;
       if (!PatchProxy.applyVoidOneRefs(ts, null, a.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ENTER_LIVE_MORE_SQUARE";
          u1.L("", ts, 1, uElementPack, null);
       }
       this.q.a();
       this.r.a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a22bd);
       this.u = m1.f(p0, 0x7f0a22bf);
       m1.a(p0, new b$a(this), R.id.live_play_closed_v2_container);
       this.t.addOnItemTouchListener(new b$c(this, new f(this.getContext(), new b$b(this))));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(j.class);
       this.q = this.r8("LIVE_PLAY_CLOSED_V2_CALLBACK");
       this.s = this.r8("LIVE_PLAY_CLOSED_FRAGMENT");
       this.r = this.r8("LIVE_PLAY_CLOSED_V2_AUTO_PLAY_SERVICE");
       return;
    }
}
