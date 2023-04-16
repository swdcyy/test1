package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$c;
import qmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import kotlin.jvm.internal.a;
import fmd.a;
import java.lang.Integer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.view.View;
import qmd.i;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.animation.ValueAnimator;
import qmd.p;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import qmd.q;
import android.animation.Animator$AnimatorListener;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import java.util.ArrayList;
import trd.t;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$c$a;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$c$b;
import android.widget.EditText;

public final class NewRelayStickerDrawer$c implements a	// class@000a79
{
    public final NewRelayStickerDrawer a;

    public void NewRelayStickerDrawer$c(NewRelayStickerDrawer p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer$c.class, "4")) {
          return;
       }
       this.a.setCustomButtonEnable(false);
       this.a.mBaseDrawerData.a1(true);
       Object[] objArray = new Object[false];
       a.D().w("NewRelayStickerDrawer", "onKeyboardShown invoked, isCustomButtonEnable = "+this.a.isCustomButtonEnable()+", isInEditMode = true", objArray);
       this.a.innerUpdateView();
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawer$c.class, "3")) {
          return;
       }
       a.p(p0, "userInfoList");
       this.a.mBaseDrawerData.g1(p0);
       this.a.getMController().d(p0, true, true);
       this.a.innerUpdateView();
       return;
    }
    public void c(String p0,int p1){
       Object[] objArray1;
       NewRelayStickerDrawer$c uoc = NewRelayStickerDrawer$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "6")) {
          return;
       }
       String str = "hint";
       a.p(p0, str);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("NewRelayStickerDrawer", "showFriendsInvitingHint invoked with hint = "+p0+", friendsCount = "+p1, objArray);
       NewRelayStickerDrawer$c ta = this.a;
       NewRelayStickerDrawer mRelaySticke = ta.mRelayStickerViewHelper;
       DecorationContainerView containerVie = ta.getContainerView();
       Objects.requireNonNull(containerVie, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2<*, com.yxcorp.gifshow.decoration.widget.BaseDrawer<*>>");
       EditDecorationContainerView t = containerVie.t;
       a.o(t, "\(containerView as EditDe¡­erViewV2\).mDecorationView");
       boolean b = (!t.getVisibility())? true: false;
       Objects.requireNonNull(mRelaySticke);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(b), mRelaySticke, oi, "9")) {
          a.p(p0, str);
          mRelaySticke.a(b);
          if (!PatchProxy.applyVoidOneRefs(p0, mRelaySticke, oi, "18")) {
             if (mRelaySticke.r != null || TextUtils.x(p0)) {
                objArray1 = new Object[i];
                a.D().A(mRelaySticke.a, "innerShowFriendsInvitingHint: is in process, return", objArray1);
             }else {
                i n = mRelaySticke.n;
                if (n != null) {
                   if (!n.getVisibility() && !n.getAlpha() - 0x3f800000) {
                      objArray1 = new Object[i];
                      a.D().A(mRelaySticke.a, "innerShowFriendsInvitingHint: hint has shown, return", objArray1);
                   }else {
                      n.setAlpha(0);
                      n.setVisibility(i);
                      n.setText(p0);
                      ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      a.o(valueAnimato, "animator");
                      valueAnimato.setDuration(mRelaySticke.c);
                      valueAnimato.addUpdateListener(new p(n));
                      valueAnimato.addListener(new q(mRelaySticke));
                      valueAnimato.start();
                      Object[] objArray2 = new Object[i];
                      a.D().w(mRelaySticke.a, "innerShowFriendsInvitingHint: animation started", objArray2);
                      mRelaySticke.r = valueAnimato;
                      k1.m(mRelaySticke.t);
                      k1.r(mRelaySticke.t, mRelaySticke.b);
                   }
                }
             }
          }
       }
       this.a.mBaseDrawerData.b1(p1);
       return;
    }
    public void d(RelayUserInfo p0,boolean p1){
       BaseDrawer mBaseDrawerD;
       NewRelayStickerDrawer$c uoc = NewRelayStickerDrawer$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "2")) {
          return;
       }
       String str = "user";
       a.p(p0, str);
       if (p1) {
          mBaseDrawerD = this.a.mBaseDrawerData;
          Objects.requireNonNull(mBaseDrawerD);
          if (!PatchProxy.applyVoidOneRefs(p0, mBaseDrawerD, NewRelayStickerDrawerData.class, "5")) {
             a.p(p0, str);
             mBaseDrawerD.Q.add(p0);
          }
       }else {
          mBaseDrawerD = this.a.mBaseDrawerData;
          Objects.requireNonNull(mBaseDrawerD);
          if (!PatchProxy.applyVoidOneRefs(p0, mBaseDrawerD, NewRelayStickerDrawerData.class, "6")) {
             a.p(p0, str);
             mBaseDrawerD.Q.remove(p0);
          }
       }
       this.a.getMController().d(t.k(p0), false, p1);
       this.a.innerUpdateView();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer$c.class, "5")) {
          return;
       }
       NewRelayStickerDrawer$c ta = this.a;
       boolean b = false;
       boolean b1 = (ta.getContainerView().P() || this.a.getMController().a())? true: false;
       ta.setCustomButtonEnable(b1);
       this.a.mBaseDrawerData.a1(b);
       Object[] objArray = new Object[b];
       a.D().w("NewRelayStickerDrawer", "onKeyboardHidden invoked, isCustomButtonEnable = "+this.a.isCustomButtonEnable()+", isInEditMode = false", objArray);
       this.a.innerUpdateView();
       k1.r(new NewRelayStickerDrawer$c$a(this), 0);
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewRelayStickerDrawer$c.class, "1")) {
          return;
       }
       a.p(p0, "title");
       Object[] objArray = new Object[0];
       a.D().w("NewRelayStickerDrawer", "onRelayTitleUpdated invoked with title = "+p0, objArray);
       this.a.mBaseDrawerData.h1(p0);
       this.a.innerUpdateView();
       VoteTextView voteTextView = this.a.mRelayStickerViewHelper.f();
       if (voteTextView != null) {
          voteTextView.postDelayed(new NewRelayStickerDrawer$c$b(voteTextView), 10);
       }
       return;
    }
}
