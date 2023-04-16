package com.kuaishou.live.gzone.treasurebox.presenter.r$e;
import c77.a$a;
import com.kuaishou.live.gzone.treasurebox.presenter.r;
import java.lang.String;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import r53.a;
import com.kwai.live.gzone.treasure.box.bean.PanelVisibilityType;
import r53.b;
import brd.y;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import m53.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import mrd.a;
import o53.b;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class r$e extends a$a	// class@001c96
{
    public final r b;

    public void r$e(r p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void a(LiveGzoneTabSource p0){
       TreasureBoxCommonModel treasureBoxC = TreasureBoxCommonModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, r$e.class, "1")) {
          return;
       }
       r$e tb = this.b;
       a f = tb.v.f;
       boolean b = true;
       if (f != null) {
          f.c(tb.A, b);
       }
       this.b.V8().b.onNext("subPanelOnSelected");
       int i = 0;
       this.b.m8().setVisibility(i);
       this.b.v.f.p().r(b);
       TreasureBoxCommonModel treasureBoxC1 = this.b.V8();
       Objects.requireNonNull(treasureBoxC1);
       n on = n.class;
       if (!PatchProxy.applyVoid(null, treasureBoxC1, treasureBoxC, "17")) {
          if (!PatchProxy.applyVoid(null, null, on, "3")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action = 0x7645;
             uElementPack1.name = "SHOW_CHEST_POP_UP";
             u1.u0(4, uElementPack1, n.b());
          }
          LiveGzoneTreasureTask liveGzoneTre = b.a(treasureBoxC1.s.i());
          if (liveGzoneTre != null && liveGzoneTre.canShowTask()) {
             n.e(liveGzoneTre.mTaskTitle, liveGzoneTre.mTaskID, liveGzoneTre.mPrizeId, i);
          }
          if (!PatchProxy.applyVoid(null, null, on, "25")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CHEST_PRIZE_RECORD_ENTRANCE";
             u1.u0(6, uElementPack, n.b());
          }
       }
       treasureBoxC1 = this.b.V8();
       Objects.requireNonNull(treasureBoxC1);
       if (!PatchProxy.applyVoid(null, treasureBoxC1, treasureBoxC, "6") && !TextUtils.x(treasureBoxC1.o)) {
          treasureBoxC1.p(treasureBoxC1.o);
          treasureBoxC1.o = null;
          treasureBoxC1.t();
       }
       this.b.X8();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, r$e.class, "2")) {
          return;
       }
       r$e tb = this.b;
       a f = tb.v.f;
       if (f != null) {
          f.c(tb.A, false);
       }
       this.b.m8().setVisibility(8);
       this.b.v.f.p().r(false);
       return;
    }
}
