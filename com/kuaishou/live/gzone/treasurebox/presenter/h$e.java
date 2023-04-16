package com.kuaishou.live.gzone.treasurebox.presenter.h$e;
import s53.d;
import com.kuaishou.live.gzone.treasurebox.presenter.h;
import java.lang.Object;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import java.lang.Void;
import crd.b;
import n53.c;
import n53.b;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import java.lang.String;
import brd.t;
import cjd.e;
import erd.o;
import p53.f0;
import com.kuaishou.live.gzone.treasurebox.presenter.h$e$a;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import java.lang.Enum;
import r53.a;
import r53.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import s77.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import m53.n;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import j77.e;
import p53.e0;
import ok.h;
import lnc.b9;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;

public class h$e implements d	// class@001c86
{
    public final h a;

    public void h$e(h p0){
       this.a = p0;
       super();
    }
    public static b d(h$e p0,LiveTreasureBoxModel p1,Void p2){
       return p0.e(p1, p2);
    }
    private b e(LiveTreasureBoxModel p0,Void p1){
       return b.b().g(this.a.c9().f(), p0.getPosition()).map(new e()).subscribe(new f0(this, p0), new h$e$a(this, p0));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h$e.class, "3")) {
          return;
       }
       h t = this.a.T;
       if (t != null) {
          t.a();
       }
       return;
    }
    public boolean b(LiveTreasureBoxModel p0){
       LiveTreasureBoxModel$BoxStatus obj = PatchProxy.applyOneRefs(p0, this, h$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.a9("¡¾onTreasureBoxClicked¡¿ #"+p0.getPosition()+" Status:"+p0.getBoxStatus().toString());
       obj = p0.getBoxStatus();
       LiveTreasureBoxModel mType = p0.mType;
       LiveTreasureBoxModel mBoxIndexInA = p0.mBoxIndexInAdapter;
       LiveTreasureBoxModel mSignInBoxLe = p0.mSignInBoxLevel;
       BaseFragment uBaseFragmen = this.a.P.getServiceManager().a.b();
       FeedLogCtx uFeedLogCtx = a.a(this.a.P.getServiceManager().a);
       ClientContent$LiveStreamPackage liveStreamPa = this.a.P.getServiceManager().a.a();
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{obj,Integer.valueOf(mType),Integer.valueOf(mBoxIndexInA),Integer.valueOf(mSignInBoxLe),uBaseFragmen,uFeedLogCtx,liveStreamPa};
          if (PatchProxy.applyVoid(objArray, null, on, "35")) {
          label_00fc :
             LiveTreasureBoxModel$BoxStatus oPENED = LiveTreasureBoxModel$BoxStatus.OPENED;
             if (p0.getBoxStatus() == oPENED && (p0.isGoldBox() && !TextUtils.isEmpty(p0.mJumpUrl))) {
                this.a.d9(p0.mJumpUrl);
                return 1;
             }else if(p0.getBoxStatus() == oPENED && p0.isSignInBox()){
                a v = this.a.P.getServiceManager().v;
                if (v != null) {
                   v.a(null);
                }
                return 1;
             }else if(p0.getBoxStatus() != LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN){
                return 0;
             }else {
                p0.setBoxStatus(LiveTreasureBoxModel$BoxStatus.OPENING);
                h$e ta = this.a;
                ta.U = b9.c(ta.U, new e0(this, p0));
                h$e ta1 = this.a;
                ta1.X7(ta1.U);
                return 1;
             }
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_CHEST_GET";
       i3 oi3 = i3.f();
       oi3.d("chest_status", n.j(obj));
       oi3.c("type", Integer.valueOf(mType));
       oi3.c("index", Integer.valueOf(mBoxIndexInA));
       oi3.c("sign_chest_level", Integer.valueOf(mSignInBoxLe));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setType(1).setLogPage(uBaseFragmen).setElementPackage(uElementPack).setContentPackage(uContentPack);
       u1.B(uClickMetaDa);
       goto label_00fc ;
    }
    public void c(LiveTreasureBoxModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$e.class, "2")) {
          return;
       }
       TreasureBoxCommonModel treasureBoxC = this.a.c9();
       Objects.requireNonNull(treasureBoxC);
       if (!PatchProxy.applyVoidOneRefs(p0, treasureBoxC, TreasureBoxCommonModel.class, "18") && !PatchProxy.applyVoidOneRefs(p0, null, n.class, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x7641;
          uElementPack.index = p0.getPosition();
          uElementPack.name = "SHOW_CHEST_GET";
          uElementPack.value = (double)n.c(p0);
          i3 oi3 = i3.f();
          oi3.c("type", Integer.valueOf(p0.mType));
          oi3.c("index", Integer.valueOf(p0.getPosition()));
          uElementPack.params = oi3.e();
          u1.u0(4, uElementPack, n.b());
       }
       return;
    }
}
