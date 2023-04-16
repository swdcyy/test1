package com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter$d;
import n77.n;
import o77.g0;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter$a;
import android.view.View$OnDragListener;
import android.widget.ViewFlipper;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter$b;
import erd.g;
import crd.b;
import brd.t;
import o77.h0;
import io.reactivex.internal.functions.Functions;
import java.util.Deque;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntableWinner;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter$LiveTurntableWinnerDefault;
import mrd.a;
import java.lang.Boolean;
import u37.h;
import u37.e;
import y43.a;
import fq5.b;
import cjd.e;
import erd.o;
import o77.j0;
import o77.i0;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.StringBuilder;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import java.lang.CharSequence;
import com.kwai.framework.model.user.User;
import ekd.m1;

public class LiveGzoneTurntableWinnerListPresenter extends PresenterV2	// class@000e59
{
    public Deque p;
    public LiveViewFlipper q;
    public a r;
    public n s;
    public t t;
    public a u;

    public void LiveGzoneTurntableWinnerListPresenter(){
       super();
       this.p = new LinkedList();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableWinnerListPresenter.class, "3")) {
          return;
       }
       this.s.n = new LiveGzoneTurntableWinnerListPresenter$d(this);
       this.q.a(new g0(this));
       this.q.setOnDragListener(new LiveGzoneTurntableWinnerListPresenter$a(this));
       this.S8();
       this.q.addView(a.a(this.getContext(), R.layout.arg_RES_7f0d0b9b));
       this.q.addView(a.a(this.getContext(), R.layout.arg_RES_7f0d0b9b));
       this.q.setVisibility(8);
       LiveGzoneTurntableWinnerListPresenter tt = this.t;
       if (tt != null) {
          this.X7(tt.subscribe(new LiveGzoneTurntableWinnerListPresenter$b(this)));
       }
       tt = this.u;
       if (tt != null) {
          this.X7(tt.subscribe(new h0(this), Functions.e));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableWinnerListPresenter.class, "5")) {
          return;
       }
       this.q.stopFlipping();
       this.p.clear();
       return;
    }
    public void P8(LiveGzoneTurntableWinner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableWinnerListPresenter.class, "10")) {
          return;
       }
       if (this.p.size() == 1 && this.p.getFirst() instanceof LiveGzoneTurntableWinnerListPresenter$LiveTurntableWinnerDefault) {
          this.p.clear();
       }
       if (this.p.size() > 20) {
          this.p.poll();
       }
       this.p.addFirst(p0);
       this.W8();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableWinnerListPresenter.class, "7")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       LiveGzoneTurntableWinnerListPresenter tu = this.u;
       if (tu != null && !tu.i().booleanValue()) {
          return;
       }
       if (this.q.getVisibility()) {
          return;
       }
       if (this.q.getChildCount() <= 1) {
          this.q.stopFlipping();
          return;
       }else if(this.q.isFlipping()){
          return;
       }else {
          this.q.startFlipping();
          return;
       }
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableWinnerListPresenter.class, "4")) {
          return;
       }
       this.X7(e.d().f(this.r.m.getLiveStreamId()).map(new e()).subscribe(new j0(this), new i0(this)));
       return;
    }
    public final void V8(View p0){
       LiveGzoneTurntableWinnerListPresenter liveGzoneTur = LiveGzoneTurntableWinnerListPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveGzoneTur, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Object[] objArray = null;
       TextView obj = PatchProxy.apply(objArray, this, liveGzoneTur, "9");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(!this.p.size()){
          if (this.p.size() == 1) {
             objArray = this.p.peek();
          }else {
             objArray = this.p.pollFirst();
             this.p.offerLast(objArray);
          }
       }
       if (objArray == null) {
          return;
       }else {
          obj = p0.findViewById(R.id.turntable_prize_name);
          TextView textView = p0.findViewById(R.id.turntable_winner_user_name);
          int i = 8;
          textView.setVisibility(i);
          TextView textView1 = p0.findViewById(R.id.turntable_winner_prize_bunch);
          TextView textView2 = p0.findViewById(R.id.turntable_winner_gain);
          if (objArray instanceof LiveGzoneTurntableWinnerListPresenter$LiveTurntableWinnerDefault) {
             textView.setText(R.string.arg_RES_7f104e8e);
             textView1.setVisibility(i);
             obj.setVisibility(i);
             textView2.setVisibility(i);
          }else {
             textView1.setVisibility(0);
             obj.setVisibility(0);
             textView2.setVisibility(0);
             textView1.setText("¡Á"+objArray.mPrize.mBatchSize);
             obj.setText(objArray.mPrize.mName);
             textView.setText(objArray.mUser.mName);
          }
          this.q.requestLayout();
          textView.setVisibility(0);
          return;
       }
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableWinnerListPresenter.class, "6")) {
          return;
       }
       if (!this.p.size()) {
          this.q.setVisibility(8);
          return;
       }else if(this.p.size() == 1){
          this.q.stopFlipping();
       }else {
          this.R8();
       }
       this.V8(this.q.getCurrentView());
       this.q.setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableWinnerListPresenter.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a40cf);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableWinnerListPresenter.class, "1")) {
          return;
       }
       this.r = this.q8(a.class);
       this.s = this.q8(n.class);
       this.t = this.t8("LIVE_GZONE_TURNTABLE_REFRESH_SUBJECT");
       this.u = this.t8("LIVE_GZONE_TURNTABLE_TAB_SELECTED_SUBJECT");
       return;
    }
}
