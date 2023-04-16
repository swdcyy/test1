package com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpVC;
import com.kuaishou.live.viewcontroller.ViewController;
import zs1.b;
import ft1.b;
import ps1.e;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpVC$viewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpVC$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserView;
import android.content.Context;
import android.widget.LinearLayout;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor;
import bld.b;
import d61.k;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import nt1.c;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserItemView$a;
import nt1.d;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import nt1.e;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import nt1.f;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserItemView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkTopScoreUserDetailInfo;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.util.ArrayList;
import pu1.d;

public final class LiveMultiPkMvpVC extends ViewController	// class@001635
{
    public final p j;
    public LiveMultiPkMvpTopScoreUserView k;
    public LiveMultiPkMvpTopScoreUserView l;
    public final b m;
    public final b n;
    public final e o;
    public final a p;

    public void LiveMultiPkMvpVC(b p0,b p1,e p2,a p3){
       a.p(p0, "coreModel");
       a.p(p1, "gameModel");
       a.p(p2, "pkDelegate");
       a.p(p3, "skinManager");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.j = new ViewModelLazy(m0.d(LiveMultiPkMvpViewModel.class), new LiveMultiPkMvpVC$$special$$inlined$viewModels$2(new LiveMultiPkMvpVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkMvpVC$viewModel$2(this));
    }
    public void F2(){
       LiveMultiPkMvpVC liveMultiPkM = LiveMultiPkMvpVC.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkM, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0cc6);
       String str = "opponentMvpUserView";
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkM, "3")) {
          LiveMultiPkMvpTopScoreUserView liveMultiPkM2 = this.A2(R.id.live_pk_mvp_top_score_user_self);
          this.k = liveMultiPkM2;
          if (liveMultiPkM2 == null) {
             a.S("selfMvpUserView");
          }
          LiveMultiPkMvpVC tk = this.k;
          if (tk == null) {
             a.S("selfMvpUserView");
          }
          liveMultiPkM2.b(tk.getContext(), this.p, LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.SELF);
          liveMultiPkM2 = this.A2(R.id.live_pk_mvp_top_score_user_opponent);
          this.l = liveMultiPkM2;
          if (liveMultiPkM2 == null) {
             a.S(str);
          }
          tk = this.l;
          if (tk == null) {
             a.S(str);
          }
          liveMultiPkM2.b(tk.getContext(), this.p, LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.OPPONENT);
          b uob = new b();
          uob.l(this.p.f("live_pk_mvp_container_background_start_color", k.b("#66CD5500")), this.p.f("live_pk_mvp_container_background_end_color", k.b("#661E69FF")));
          uob.j(0);
          this.P2().setBackground(uob.a());
       }
       LiveMultiPkMvpViewModel liveMultiPkM1 = PatchProxy.apply(objArray, this, liveMultiPkM, "1");
       if (liveMultiPkM1 == PatchProxyResult.class) {
          liveMultiPkM1 = this.j.getValue();
       }
       if (!PatchProxy.applyVoidOneRefs(liveMultiPkM1, this, liveMultiPkM, "4")) {
          liveMultiPkM = this.k;
          if (liveMultiPkM == null) {
             a.S("selfMvpUserView");
          }
          liveMultiPkM.setScoreUserItemClickListener(new c(liveMultiPkM1));
          liveMultiPkM = this.l;
          if (liveMultiPkM == null) {
             a.S(str);
          }
          liveMultiPkM.setScoreUserItemClickListener(new d(liveMultiPkM1));
          LiveData liveData = Transformations.distinctUntilChanged(liveMultiPkM1.v0());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(this, new e(this));
          liveData = Transformations.distinctUntilChanged(liveMultiPkM1.u0());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(this, new f(this));
       }
       return;
    }
    public final void V2(List p0,LiveMultiPkMvpTopScoreUserView p1,a p2){
       LiveMultiPkMvpTopScoreUserItemView liveMultiPkM1;
       int i2;
       Collection uCollection = p0;
       Object obj = p1;
       Object obj1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveMultiPkMvpVC.class, "5")) {
          return;
       }
       LiveMultiPkMvpTopScoreUserView liveMultiPkM = (!uCollection || p0.isEmpty())? 1: null;
       if (liveMultiPkM) {
          Objects.requireNonNull(p1);
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, LiveMultiPkMvpTopScoreUserView.class, "7")) {
             Iterator iterator = obj.c.iterator();
             while (iterator.hasNext()) {
                iterator.next().a();
             }
             liveMultiPkM = obj.b;
             if (liveMultiPkM != null) {
                liveMultiPkM.setVisibility(0);
                obj.c(obj.b, obj1);
             }
          }
       }else {
          LivePkMessages$PkTopScoreUserDetailInfo[] pkTopScoreUs = new LivePkMessages$PkTopScoreUserDetailInfo[0];
          Object[] objArray = uCollection.toArray(pkTopScoreUs);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          Object[] objArray1 = objArray;
          Objects.requireNonNull(p1);
          if (!PatchProxy.applyVoidTwoRefs(objArray1, obj1, obj, LiveMultiPkMvpTopScoreUserView.class, "5") && !j.h(objArray1)) {
             liveMultiPkM = obj.b;
             if (liveMultiPkM != null) {
                liveMultiPkM.setVisibility(8);
             }
             int i = 0;
             while (i < 3) {
                LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor sELF = LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.SELF;
                if (obj.d == sELF) {
                   liveMultiPkM1 = obj.c.get(i);
                }else {
                   i2 = i - 3;
                   i2 = i2 - 1;
                   liveMultiPkM1 = obj.c.get(i2);
                }
                LiveMultiPkMvpTopScoreUserItemView liveMultiPkM2 = liveMultiPkM1;
                if (liveMultiPkM2 != null) {
                   int i1 = objArray1.length - 1;
                   if (i > i1) {
                      liveMultiPkM2.a();
                   }else if(objArray1[i] != null){
                      UserInfo userInfo = UserInfo.convertFromProto(objArray1[i].userInfo);
                      boolean b = (obj.d == sELF)? true: false;
                      if (!PatchProxy.isSupport(LiveMultiPkMvpTopScoreUserItemView.class) || !PatchProxy.applyVoidThreeRefs(userInfo, Boolean.valueOf(b), p2, liveMultiPkM2, LiveMultiPkMvpTopScoreUserItemView.class, "4")) {
                         liveMultiPkM1 = liveMultiPkM2.d;
                         if (liveMultiPkM1 == null || !TextUtils.n(liveMultiPkM1.mId, userInfo.mId)) {
                            liveMultiPkM2.d = userInfo;
                            if (PatchProxy.isSupport(LiveMultiPkMvpTopScoreUserItemView.class) && (!PatchProxy.applyVoidThreeRefs(userInfo, Boolean.valueOf(b), p2, liveMultiPkM2, LiveMultiPkMvpTopScoreUserItemView.class, "6") && userInfo != null)) {
                               liveMultiPkM2.b.setVisibility(0);
                               g.d(liveMultiPkM2.b, userInfo, HeadImageSize.SMALL);
                               liveMultiPkM2.c.setVisibility(0);
                               if (!PatchProxy.isSupport(LiveMultiPkMvpTopScoreUserItemView.class) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), obj1, liveMultiPkM2, LiveMultiPkMvpTopScoreUserItemView.class, "5") && !liveMultiPkM2.c.getVisibility())) {
                                  if (b) {
                                     i2 = liveMultiPkM2.g - 1;
                                     obj1.d(liveMultiPkM2.c, liveMultiPkM2.e.get(i2));
                                  }else {
                                     i2 = liveMultiPkM2.g - 1;
                                     obj1.d(liveMultiPkM2.c, liveMultiPkM2.f.get(i2));
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             label_0166 :
                i = i + 1;
             }
          }
       }
       return;
    }
}
