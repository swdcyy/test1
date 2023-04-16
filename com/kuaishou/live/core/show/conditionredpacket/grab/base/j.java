package com.kuaishou.live.core.show.conditionredpacket.grab.base.j;
import b62.j0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import lnc.a1;
import android.view.View;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import android.widget.TextView;
import t45.d;
import brd.z;
import brd.t;
import b62.y;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u52.t;
import j62.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackRollUserInfo;
import i62.t$c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult;
import qk.m;
import b62.x;
import ok.h;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import ekd.q;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import b62.g0;
import java.util.List;
import g9c.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.e;
import android.view.View$OnTouchListener;
import java.util.concurrent.TimeUnit;
import b62.w;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import mrd.a;

public class j extends j0	// class@000a8c
{
    public a M;
    public boolean N;
    public LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult O;
    public ValueAnimator P;
    public LinearLayoutManager Q;
    public g0 R;
    public static String sLivePresenterClassName = "LiveConditionRedPacketLuckyUsersPresenter";

    public void j(){
       super();
       this.N = false;
    }
    public void E8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "2")) {
          return;
       }
       super.E8();
       if (this.M == null) {
          this.N = true;
       }
       if (!PatchProxy.applyVoid(objArray, this, oj, "4")) {
          this.z.getLayoutParams().height = (this.N != null || this.P8())? a1.e(187.00f): a1.e(135.00f);
       }
    label_0047 :
       int i = 8;
       this.z.setVisibility(i);
       if (!PatchProxy.applyVoid(objArray, this, oj, "5")) {
          this.E.setVisibility(0);
          this.E.k();
          this.B.setVisibility(i);
          if (this.N == null) {
             if (!PatchProxy.applyVoid(objArray, this, oj, "7")) {
                this.X7(this.M.observeOn(d.a).subscribe(new y(this)));
             }
          }else if(PatchProxy.applyVoid(objArray, this, oj, "6")){
             j0 tq = this.q;
             SCLiveConditionRedPackRollUserInfo sCLiveCondit = this.p.c.h(tq.a, tq.b);
             Object obj = PatchProxy.applyOneRefs(sCLiveCondit, this, oj, "13");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else if(sCLiveCondit == null){
                objArray = new LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult();
                objArray.mDisplayMaxWinnerCountMessage = "";
                objArray.mLuckyUsers = m.t(sCLiveCondit.rollUser).F(new x(this)).B();
             }
             this.O = objArray;
             if (objArray != null) {
                this.S8();
                if (!q.f(this.O.mLuckyUsers)) {
                   this.W8();
                }else {
                   this.V8();
                }
             }
          }
       }
       return;
    }
    public void J8(){
       j oj = j.class;
       if (PatchProxy.applyVoid(null, this, oj, "3")) {
          return;
       }
       if (this.N != null && !PatchProxy.applyVoid(null, this, oj, "11")) {
          oj = this.P;
          if (oj != null && oj.isRunning()) {
             this.P.cancel();
             this.P = null;
          }
          this.z.setAdapter(null);
       }
       if (this.E.n()) {
          this.E.a();
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       if (this.E.getVisibility() != 8) {
          this.E.a();
          this.E.setVisibility(8);
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, j.class, "12")) {
          return;
       }
       this.z.setVisibility(8);
       this.R8(8);
       this.x.setVisibility(8);
       this.B.setVisibility(0);
       return;
    }
    public final void W8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "9")) {
          return;
       }
       this.B.setVisibility(8);
       this.z.setVisibility(0);
       this.R8(0);
       LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext(), 1, 0);
       this.Q = linearLayout;
       this.z.setLayoutManager(linearLayout);
       g0 og0 = new g0(this.p, this.q, (this.N ^ 0x01), (TextUtils.x(this.O.mDisplayMaxWinnerCountMessage) ^ 0x01), this.O.mDisplayMaxWinnerCountMessage);
       this.R = linearLayout;
       this.z.setAdapter(linearLayout);
       this.R.W0(this.O.mLuckyUsers);
       this.R.k0();
       if (this.N != null) {
          this.z.setOnTouchListener(e.b);
          this.z.setNestedScrollingEnabled(0);
          if (!PatchProxy.applyVoid(objArray, this, oj, "10")) {
             int[] ointArray = new int[]{0x2710};
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
             this.P = valueAnimato;
             valueAnimato.setDuration(TimeUnit.HOURS.toMillis(1));
             this.P.addUpdateListener(new w(this));
             this.P.start();
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       super.j8();
       this.M = this.t8("FetchGrabResult");
       return;
    }
}
