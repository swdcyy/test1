package com.kuaishou.live.core.show.quiz.notice.LiveQuizNoticeDialog;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import i2b.a;
import android.content.DialogInterface;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import java.lang.Number;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.yxcorp.utility.n;
import android.os.CountDownTimer;
import lnc.a1;
import cg2.a;
import o02.e;
import p91.m;
import brd.t;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import brd.x;
import cjd.e;
import erd.o;
import fg2.d;
import erd.a;
import com.kuaishou.live.core.show.quiz.notice.a;
import com.kuaishou.live.core.show.quiz.notice.LiveQuizNoticeDialog$a;
import erd.g;
import crd.b;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.lang.CharSequence;

public class LiveQuizNoticeDialog extends LiveSafeDialogFragment implements d	// class@000e2b
{
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public KwaiLoadingView E;
    public KwaiImageView F;
    public View G;
    public View H;
    public View I;
    public View J;
    public View K;
    public View L;
    public View M;
    public View N;
    public ViewGroup O;
    public final a0 s;
    public final View$OnClickListener t;
    public final View$OnClickListener u;
    public final a v;
    public final Context w;
    public CountDownTimer x;
    public TextView y;
    public TextView z;
    public static final int P;

    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizNoticeDialog.class, "1")) {
          return;
       }
       this.y = m1.f(p0, 0x7f0a2444);
       this.z = m1.f(p0, 0x7f0a2440);
       this.A = m1.f(p0, 0x7f0a242e);
       this.B = m1.f(p0, 0x7f0a2445);
       this.C = m1.f(p0, 0x7f0a242f);
       this.D = m1.f(p0, 0x7f0a2430);
       this.E = m1.f(p0, 0x7f0a2428);
       this.F = m1.f(p0, 0x7f0a2438);
       this.G = m1.f(p0, 0x7f0a2439);
       this.H = m1.f(p0, 0x7f0a2433);
       this.I = m1.f(p0, 0x7f0a243e);
       this.J = m1.f(p0, 0x7f0a243f);
       this.K = m1.f(p0, 0x7f0a2473);
       this.L = m1.f(p0, 0x7f0a242b);
       this.M = m1.f(p0, 0x7f0a2431);
       this.O = m1.f(p0, 0x7f0a2432);
       m1.a(p0, this.u, R.id.live_quiz_notice_group_task_jump_btn);
       m1.a(p0, this.t, R.id.live_quiz_notice_revive_card_task_jump_btn);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveQuizNoticeDialog.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.d(this.w, 0x7f0d0d71, p1, false);
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizNoticeDialog.class, "19")) {
          return;
       }
       super.onDismiss(p0);
       this.wh();
       return;
    }
    public void onStart(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveQuizNoticeDialog.class, "4")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, LiveQuizNoticeDialog.class, "5")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             window.setBackgroundDrawable(new ColorDrawable(0));
             window.getDecorView().setPadding(0, 0, 0, 0);
             window.setWindowAnimations(R.style.arg_RES_7f1103bf);
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.gravity = 80;
             attributes.width = -1;
             Object obj = PatchProxy.apply(objArray, this, LiveQuizNoticeDialog.class, "6");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                i = this.s.c.getQuizNoticeTasksAmount();
                if (i) {
                   if (i != 1) {
                      i = (i != 2)? -2: n.c(this.w, 580.00f);
                   }else {
                      i = n.c(this.w, 0x43f38000);
                   }
                }else {
                   i = n.c(this.w, 0x43bf8000);
                }
             }
             attributes.height = i;
             window.setAttributes(attributes);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveQuizNoticeDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveQuizNoticeDialog.class, "8")) {
          int quizNoticeTa = this.s.c.getQuizNoticeTasksAmount();
          int i = 0;
          if (quizNoticeTa != 1) {
             if (quizNoticeTa != 2) {
                if (!PatchProxy.applyVoid(objArray, this, LiveQuizNoticeDialog.class, "9")) {
                   this.K.setVisibility(8);
                   this.H.setVisibility(8);
                   this.G.setVisibility(8);
                   this.I.setVisibility(i);
                }
             }else if(PatchProxy.applyVoid(objArray, this, LiveQuizNoticeDialog.class, "11")){
                this.K.setVisibility(i);
                this.H.setVisibility(i);
                this.G.setVisibility(i);
                this.I.setVisibility(8);
             }
          }else if(PatchProxy.applyVoid(objArray, this, LiveQuizNoticeDialog.class, "10")){
             this.K.setVisibility(i);
             LiveQuizNoticeDialog tH = this.H;
             int i1 = (this.s.c.isQuizGroupEnable())? 0: 8;
             tH.setVisibility(i1);
             tH = this.G;
             if (!this.s.c.isQuizReviveCardEnable()) {
                i = 8;
             }
             tH.setVisibility(i);
             this.I.setVisibility(8);
          }
       }
       this.xh();
       return;
    }
    public final void wh(){
       if (PatchProxy.applyVoid(null, this, LiveQuizNoticeDialog.class, "18")) {
          return;
       }
       LiveQuizNoticeDialog tx = this.x;
       if (tx != null) {
          tx.cancel();
       }
       this.x = null;
       return;
    }
    public final void xh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveQuizNoticeDialog.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveQuizNoticeDialog.class, "12")) {
          this.E.setVisibility(0);
          TextView titleView = this.E.getTitleView();
          titleView.setTextSize(1, 12.00f);
          titleView.setPadding(0, n.c(this.w, 11.00f), 0, 0);
          titleView.setTextColor(a1.a(R.color.arg_RES_7f0604e9));
          this.M.setVisibility(4);
          this.O.setVisibility(8);
       }
       e.l().g(this.s.Z2.getLiveStreamId()).compose(this.ge()).map(new e()).doFinally(new d(this)).subscribe(new a(this), new LiveQuizNoticeDialog$a(this));
       return;
    }
    public void yh(long p0){
       if (PatchProxy.isSupport(LiveQuizNoticeDialog.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveQuizNoticeDialog.class, "17")) {
          return;
       }
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       Locale uS = Locale.US;
       Object[] objArray = new Object[]{Long.valueOf(mILLISECONDS.toMinutes(p0))};
       this.C.setText(String.format(uS, "%02d", objArray));
       Object[] objArray1 = new Object[]{Long.valueOf(mILLISECONDS.toSeconds((p0 % TimeUnit.MINUTES.toMillis(1))))};
       this.D.setText(String.format(uS, "%02d", objArray1));
       return;
    }
}
