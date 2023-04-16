package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVC;
import si1.f;
import wi1.a;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVC$viewModel$2;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVC$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVC$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;
import android.content.Context;
import android.app.Activity;
import d61.y;
import lnc.a1;
import android.widget.FrameLayout;
import android.view.View;
import ti1.h;
import ti1.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ti1.b;
import ti1.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import ti1.d;
import ti1.e;
import ti1.f;
import ti1.g;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView$b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$a;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$g;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$f;
import java.util.Objects;
import hf3.a;
import v51.a;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefreshRoomVipInfo;
import lf3.g;
import ih1.j;
import hh1.i;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import si1.e;
import ul1.a;
import java.lang.Integer;
import ch1.c;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$d;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveVipGradeNavigationVC extends f	// class@0011eb
{
    public e j;
    public final p k;
    public final a l;
    public final k m;

    public void LiveVipGradeNavigationVC(a p0,k p1){
       a.p(p0, "vipGradeModel");
       a.p(p1, "anchorInfo");
       super();
       this.l = p0;
       this.m = p1;
       this.k = new ViewModelLazy(m0.d(LiveVipGradeNavigationVM.class), new LiveVipGradeNavigationVC$$special$$inlined$viewModels$2(new LiveVipGradeNavigationVC$$special$$inlined$viewModels$1(this)), new LiveVipGradeNavigationVC$viewModel$2(this));
    }
    public void F2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVipGradeNavigationVC.class, "4")) {
          return;
       }
       LiveAudienceGiftBoxVipGradeBarView liveAudience = new LiveAudienceGiftBoxVipGradeBarView(this.D2());
       liveAudience.setIsLandscape(y.d(this.B2()));
       int i = 0;
       liveAudience.setPadding(i, i, a1.d(R.dimen.arg_RES_7f07034b), i);
       this.R2(liveAudience);
       h oh = new h(liveAudience);
       LiveVipGradeNavigationVM liveVipGrade = this.X2();
       if (!PatchProxy.applyVoidTwoRefs(this, liveVipGrade, oh, h.class, "1")) {
          a.p(this, "lifecycleOwner");
          a.p(liveVipGrade, "viewModel");
          liveVipGrade.c.observe(this, new a(oh));
          liveVipGrade.d.observe(this, new b(oh));
          liveVipGrade.w0().observe(this, new c(oh));
          LiveDataOperators.c(liveVipGrade.u0(), liveVipGrade.g).observe(this, new d(oh));
          liveVipGrade.h.observe(this, new e(oh));
          liveVipGrade.v0().observe(this, new f(oh));
          oh.a.setVipGradeOnClickListener(new g(liveVipGrade));
       }
       this.l.e("[LiveVipGradeVM][requestData]", i, 0);
       this.X2().x0(new LiveVipGradeNavigationVM$a$a(this.m.get()));
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       this.X2().x0(new LiveVipGradeNavigationVM$a$g(qCurrentUser.isLogined()));
       this.X2().x0(LiveVipGradeNavigationVM$a$f.a);
       LiveVipGradeNavigationVC tl = this.l;
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoid(objArray, tl, a.class, "3")) {
          tl.l.u().u0(939, SCLiveGiftPanelRefreshRoomVipInfo.class, tl.i);
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVipGradeNavigationVC.class, "5")) {
          return;
       }
       LiveVipGradeNavigationVC tl = this.l;
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoid(objArray, tl, a.class, "4")) {
          tl.l.u().o(939, tl.i);
          a j = tl.j;
          Objects.requireNonNull(j);
          if (!PatchProxy.applyVoid(objArray, j, j.class, "3")) {
             j.b = objArray;
             j.a.clear();
          }
       }
       b.Z(LiveLogTag.LIVE_VIP_GRADE, "[LiveVipGradeNavigationVC][onDestroy]");
       return;
    }
    public void V2(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVipGradeNavigationVC.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.j = p0;
       return;
    }
    public void W2(a p0,int p1){
       GiftPanelItem mLiveVipGrad;
       LiveVipGradeNavigationVC liveVipGrade = LiveVipGradeNavigationVC.class;
       if (PatchProxy.isSupport(liveVipGrade) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveVipGrade, "2")) {
          return;
       }
       if (p0 != null) {
          c uoc = p0.b();
          if (uoc != null) {
             uoc = uoc.g;
             if (uoc != null) {
                mLiveVipGrad = uoc.mLiveVipGradeScore;
             label_0026 :
                int i = (int)(mLiveVipGrad * (long)p1);
                this.X2().x0(new LiveVipGradeNavigationVM$a$c(i));
                this.X2().x0(new LiveVipGradeNavigationVM$a$d(i));
                return;
             }
          }
       }
       mLiveVipGrad = 0;
       goto label_0026 ;
    }
    public final LiveVipGradeNavigationVM X2(){
       Object obj = PatchProxy.apply(null, this, LiveVipGradeNavigationVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
}
