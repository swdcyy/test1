package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedSetting;
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
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedSetting$1;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Number;
import p5a.e;
import de5.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import kf5.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import ve5.e;
import java.util.List;
import com.yxcorp.gifshow.detail.player.panel.config.SpeedElementConfig;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.player.panel.config.SpeedConfig;
import lnc.a1;
import com.kwai.component.photo.detail.slide.negative.operation.SpeedItemModel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import ve5.d;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedSetting$a;
import erd.g;
import crd.b;

public final class OperationSpeedSetting extends w0	// class@00148c
{
    public final QPhoto C;
    public final BaseFragment D;
    public final u E;
    public final a F;
    public final FragmentActivity G;
    public final w H;
    public boolean I;
    public boolean J;

    public void OperationSpeedSetting(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super("speed");
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
       this.T(R.string.arg_RES_7f103ce0);
       this.L(R.drawable.arg_RES_7f080b04);
       this.P(R.drawable.arg_RES_7f080b03);
       this.h = 0x7f061efe;
       this.O(new OperationSpeedSetting$1(this));
    }
    public boolean E(){
       boolean b;
       QCurrentUser obj = PatchProxy.apply(null, this, OperationSpeedSetting.class, "1");
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
    public final float W(){
       OperationSpeedSetting obj = PatchProxy.apply(null, this, OperationSpeedSetting.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.F;
       a.o(obj, "mPlayModule");
       e player = obj.getPlayer();
       float f = 0x3f800000;
       if (player != null) {
          IKwaiMediaPlayer iKwaiMediaPl = player.getIKwaiMediaPlayer();
          if (iKwaiMediaPl != null) {
             f = iKwaiMediaPl.getSpeed(f);
          }
       }
       return f;
    }
    public void d(w0 p0,g p1){
       OperationSpeedSetting operationSpe = OperationSpeedSetting.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, operationSpe, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       RxBus f = RxBus.f;
       ArrayList uArrayList = PatchProxy.apply(null, this, operationSpe, "4");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          float f1 = this.W();
          SpeedElementConfig speedElement = PlayerPanelConfigHelper.a().getSpeedElementConfig();
          if (speedElement != null) {
             List speedConfigs = speedElement.getSpeedConfigs();
             if (speedConfigs != null) {
                ArrayList uArrayList1 = new ArrayList(u.Y(speedConfigs, 10));
                Iterator iterator = speedConfigs.iterator();
                while (iterator.hasNext()) {
                   SpeedConfig speedConfig = iterator.next();
                   String displayName = speedConfig.getDisplayName();
                   if (!speedConfig.getSpeed() - 0x3f800000) {
                      displayName = a1.p(R.string.arg_RES_7f100f07);
                      a.o(displayName, "CommonUtil.string\(R.stri¡­feed_player_speed_normal\)");
                   }
                   float speed = speedConfig.getSpeed();
                   String speedId = speedConfig.getSpeedId();
                   boolean b = (!f1 - speedConfig.getSpeed())? true: false;
                   uArrayList1.add(new SpeedItemModel(displayName, speed, speedId, b));
                }
                uArrayList = uArrayList1;
             }
          }
          uArrayList = CollectionsKt__CollectionsKt.E();
       }
       f.b(new e(uArrayList, (this.I ^ 1)));
       this.I = this.I ^ 1;
       if (!PatchProxy.applyVoid(null, this, operationSpe, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MUTI_SPEED_OPTION_BUTTON";
          String str = (this.I != null)? "UNFOLD": "FOLD";
          i3 oi3 = i3.f();
          oi3.d("button_type", str);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.C.mEntity);
          u1.M("", this.D, 1, uElementPack, uContentPack, null);
       }
       if (this.J == null) {
          this.e(RxBus.f.g(d.class, RxBus$ThreadMode.MAIN).subscribe(new OperationSpeedSetting$a(this, p1)));
          this.J = true;
       }
       return;
    }
    public void onShow(){
       OperationSpeedSetting operationSpe = OperationSpeedSetting.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, operationSpe, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, operationSpe, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MUTI_SPEED_OPTION_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.C.mEntity);
          u1.D0("", this.D, 0, uElementPack, uContentPack, null);
       }
       return;
    }
}
