package ao2.k;
import ao2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i33.d;
import java.util.List;
import com.kuaishou.android.live.log.b;
import org.greenrobot.eventbus.a;
import vs5.f;
import com.kwai.feature.api.live.service.basic.event.LivePlayControlEvent$LivePlayControlSource;
import android.app.Activity;
import com.kuaishou.live.core.show.yoda.model.JsOpenLiveQuizLiveParams;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import os5.l;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.show.yoda.model.DeleteSubscribeParams;
import f55.g;
import com.kuaishou.live.core.show.subscribe.edit.detail.e;
import ao2.d;
import ur.k;
import ok.x;
import ao2.g;
import com.kuaishou.live.core.show.subscribe.edit.detail.e$a;
import com.kuaishou.live.core.show.yoda.model.SubscribeLiveParams;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import ao2.j;
import java.lang.Runnable;
import com.kuaishou.live.core.show.subscribe.dosubscribe.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import lnc.m5;
import z12.u;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import z12.s;
import u07.u;
import u07.f;
import z12.t;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import ao2.a;
import com.kuaishou.live.core.show.yoda.model.CreateSubscribeParams;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.core.show.subscribe.edit.o;
import ao2.e;
import ao2.f;
import ao2.k$a;
import tk2.e;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import com.kuaishou.live.core.show.yoda.model.RelatePhotoParams;
import ao2.c;
import z1.a;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribeChoosePhotoContainerFragment;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import bo2.a;
import xk2.a;
import ao2.h;
import ps5.b;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;

public class k implements b	// class@0002a3
{

    public void k(){
       super();
    }
    public void D5(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       b.P(d.r0, "stopLivePlay");
       a.d().k(new f(LivePlayControlEvent$LivePlayControlSource.LiveBridgeModuleImpl));
       return;
    }
    public void U(Activity p0,JsOpenLiveQuizLiveParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "3")) {
          return;
       }
       b.P(d.r0, "openLiveQuizLive");
       if (p1 != null && p1.mLiveStreamFeed != null) {
          if (!p0 instanceof GifshowActivity) {
             return;
          }else {
             d.a(-1492894991).tP(p0, p1.mSourceUrl, 10, p1.mLiveStreamFeed);
          }
       }
       return;
    }
    public void Z9(Activity p0,DeleteSubscribeParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "8")) {
          return;
       }
       b.P(d.r0, "deleteSubscribe");
       new e(new d(p0), k.b, k.b, k.b).d(p1.mSubscribeId, new g(p2));
       return;
    }
    public void c5(Activity p0,SubscribeLiveParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "7")) {
          return;
       }
       b.P(d.r0, "unsubscribeLive");
       if (!p0 instanceof RxFragmentActivity) {
          return;
       }
       b.a(p0, new j(p1, p0, p2));
       return;
    }
    public int g2(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       boolean b = m5.b(p0);
       if (!b && p0 instanceof GifshowActivity) {
          b.P(d.r0, "showLiveReservationNotificationPopupView");
          if (!PatchProxy.applyVoidOneRefs(p0, null, u.class, "1")) {
             d uod = new d(p0);
             uod.Z0(13);
             uod.b1(KwaiDialogOption.e);
             uod.V0(true);
             uod.B0(R.drawable.arg_RES_7f0805d2);
             uod.W0(R.string.arg_RES_7f104070);
             uod.y0(R.string.arg_RES_7f103af5);
             uod.S0(R.string.arg_RES_7f1013a6);
             uod.u0(new s(p0));
             t$a uoa = f.d(uod);
             uoa.Y(new t());
          }
       }
       return b;
    }
    public String getNameSpace(){
       return a.a(this);
    }
    public void q7(Activity p0,CreateSubscribeParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "4")) {
          return;
       }
       b.P(d.r0, "showSubscribeEditDialog");
       if (!p0 instanceof FragmentActivity) {
          return;
       }
       o oo = new o(new MutableLiveData(), new e(p0), super(p0), k.b, k.b);
       v6.a(new k$a(this, p2));
       SubscribeDialogParams subscribeDia = new SubscribeDialogParams();
       subscribeDia.f = true;
       subscribeDia.b = p1.mSource;
       subscribeDia.g = true;
       v6.o(subscribeDia);
       return;
    }
    public void x2(Activity p0,RelatePhotoParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "5")) {
          return;
       }
       b.P(d.r0, "showSubscribeSelectPhotoDialog");
       if (!p0 instanceof FragmentActivity) {
          return;
       }
       LiveAnchorSubscribeChoosePhotoContainerFragment.Eh(p1.mSubscribeId, p1.mSource, true, new c(p2)).show(p0.getSupportFragmentManager(), "LiveSubscribeChoosePhotoFragment");
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       b.P(d.r0, "closeLiveFloatingWindow");
       RxBus.f.b(new a());
       return;
    }
    public void za(Activity p0,SubscribeLiveParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "6")) {
          return;
       }
       b.P(d.r0, "subscribeLive");
       if (!p0 instanceof RxFragmentActivity) {
          return;
       }
       a uoa = new a();
       uoa.mSource = p1.mSource;
       uoa.mSubscribeId = p1.mSubscribeId;
       j.o(uoa, p0, new h(p2, p1), true);
       return;
    }
}
