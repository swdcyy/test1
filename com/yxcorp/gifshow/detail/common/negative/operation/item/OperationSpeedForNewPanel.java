package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedForNewPanel;
import mf5.w0;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import sz9.u;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import sz9.w;
import sz9.w$b;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedForNewPanel$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import kf5.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import ve5.d;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedForNewPanel$a;
import erd.g;
import crd.b;

public final class OperationSpeedForNewPanel extends w0	// class@001489
{
    public final QPhoto C;
    public final BaseFragment D;
    public final u E;
    public final a F;
    public final FragmentActivity G;
    public final w H;
    public boolean I;

    public void OperationSpeedForNewPanel(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super("new_speed");
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       this.C = mPhoto;
       this.D = p0.b;
       a.o(mPhoto, "mPhoto");
       this.E = new u(PlayerPanelConfigHelper.a(), mPhoto);
       this.F = p0.j;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       this.G = a;
       this.H = w.i.a(a);
       this.w = new OperationSpeedForNewPanel$1(this);
    }
    public boolean E(){
       boolean b;
       QCurrentUser obj = PatchProxy.apply(null, this, OperationSpeedForNewPanel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.E.l()) {
          obj = QCurrentUser.ME;
          a.o(obj, "QCurrentUser.ME");
          if (obj.isLogined()) {
             b = true;
          label_002c :
             return b;
          }
       }
       b = false;
       goto label_002c ;
    }
    public void d(w0 p0,g p1){
       OperationSpeedForNewPanel operationSpe = OperationSpeedForNewPanel.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, operationSpe, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       if (!PatchProxy.applyVoid(null, this, operationSpe, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MUTI_SPEED_OPTION_BAR";
          i3 oi3 = i3.f();
          oi3.d("muti_speed_option", this.x);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.C.mEntity);
          u1.M("", this.D, 1, uElementPack, uContentPack, null);
       }
       p1.a();
       return;
    }
    public void onShow(){
       OperationSpeedForNewPanel operationSpe = OperationSpeedForNewPanel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, operationSpe, "3")) {
          return;
       }
       if (this.I == null) {
          this.e(RxBus.f.g(d.class, RxBus$ThreadMode.MAIN).subscribe(new OperationSpeedForNewPanel$a(this)));
          this.I = true;
       }
       if (!PatchProxy.applyVoid(objArray, this, operationSpe, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MUTI_SPEED_OPTION_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.C.mEntity);
          u1.D0("", this.D, 0, uElementPack, uContentPack, null);
       }
       return;
    }
}
