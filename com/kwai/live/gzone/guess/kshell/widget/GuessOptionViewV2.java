package com.kwai.live.gzone.guess.kshell.widget.GuessOptionViewV2;
import ml8.d;
import com.kwai.live.gzone.guess.kshell.widget.GuessOptionBaseView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r57.c;
import android.view.View$OnClickListener;
import java.lang.Integer;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import com.kwai.live.gzone.guess.bean.UserBetOption;
import com.kwai.live.gzone.guess.bean.BetOption;
import java.lang.Long;
import android.content.res.Resources;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.live.gzone.guess.kshell.widget.GuessOptionViewV2$a;
import java.lang.Enum;
import ekd.m1;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;

public class GuessOptionViewV2 extends GuessOptionBaseView implements d	// class@000d77
{
    public View$OnClickListener b;
    public View$OnClickListener c;
    public boolean d;
    public TextView e;
    public TextView f;
    public View g;
    public TextView h;
    public KShellGuessQuestionStatus i;
    public boolean j;
    public int k;

    public void GuessOptionViewV2(Context p0){
       super(p0, null);
    }
    public void GuessOptionViewV2(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GuessOptionViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = true;
       if (PatchProxy.applyVoid(null, this, GuessOptionViewV2.class, "2")) {
       }else {
          c uoc = new c(this);
          this.b = uoc;
          this.setOnClickListener(uoc);
       }
       return;
    }
    public void a(boolean p0){
       this.j = p0;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(GuessOptionViewV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuessOptionViewV2.class, "3")) {
          return;
       }
       if (!PatchProxy.isSupport(GuessOptionViewV2.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuessOptionViewV2.class, "4")) {
          this.removeAllViews();
          a.c(this.getContext(), R.layout.arg_RES_7f0d0b4a, this);
          this.doBindView(this);
          this.d(KShellGuessQuestionStatus.UNKNOWN);
       }
       this.k = p0;
       this.setPosition(p0);
       return;
    }
    public void c(BetOptionInfo p0,UserBetOption p1,KShellGuessQuestionStatus p2){
       UserBetOption userBetOptio;
       Object[] objArray;
       String str;
       Object[] objArray2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GuessOptionViewV2.class, "12")) {
          return;
       }
       this.i = p2;
       int i = 0;
       if (p1 != null) {
          this.e(p2, KShellGuessQuestionStatus.USER_INVOLVED);
          p1 = p1.mDisplayAmount;
          userBetOptio = p1.mAmount;
       }else if(this.j != null){
          this.e(p2, KShellGuessQuestionStatus.USER_INVOLVED_REVERSE);
       }else {
          this.e(p2, KShellGuessQuestionStatus.USER_UNINVOLVED);
       }
       String str1 = "";
       userBetOptio = i;
       if (p0 == null) {
          return;
       }else {
          BetOptionInfo mBetOption = p0.mBetOption;
          if (mBetOption == null) {
             return;
          }else {
             this.setText(mBetOption.mContent);
             p0 = p0.mOptionOdds;
             if (!PatchProxy.isSupport(GuessOptionViewV2.class) || !PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(userBetOptio), p1, this, GuessOptionViewV2.class, "6")) {
                int i1 = 0x7f1022f8;
                if (!userBetOptio - i) {
                   objArray = new Object[]{p0};
                   str = String.format(this.getResources().getString(i1), objArray);
                }else {
                   Object[] objArray1 = new Object[]{String.format(this.getResources().getString(i1), objArray2),String.format(this.getResources().getString(0x7f1022e5), objArray)};
                   objArray2 = new Object[]{p0};
                   objArray = new Object[]{p1};
                   str = String.format("%s %s", objArray1);
                }
                this.f.setText(str);
             }
             return;
          }
       }
    }
    public final void d(KShellGuessQuestionStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessOptionViewV2.class, "9")) {
          return;
       }
       boolean b = (p0 == KShellGuessQuestionStatus.USER_INVOLVED)? true: false;
       this.setSelected(b);
       if (this.i == KShellGuessQuestionStatus.PAPER_GUESSING) {
          int i = GuessOptionViewV2$a.a[p0.ordinal()];
          if (i != 1 && i != 2) {
             if (i != 3) {
                if (i == 4) {
                   this.setEnabled(true);
                }
             }else {
                this.setEnabled(false);
             }
          }else {
             this.setEnabled(true);
          }
       }else {
          this.setEnabled(false);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessOptionViewV2.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a2eed);
       this.h = m1.f(p0, 0x7f0a1155);
       this.g = m1.f(p0, 0x7f0a1469);
       this.f = m1.f(p0, 0x7f0a0409);
       return;
    }
    public final void e(KShellGuessQuestionStatus p0,KShellGuessQuestionStatus p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GuessOptionViewV2.class, "8")) {
          return;
       }
       this.d(p1);
       return;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(GuessOptionViewV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuessOptionViewV2.class, "11")) {
          return;
       }
       super.setEnabled(true);
       this.d = p0;
       float f = (p0)? 0x3f800000: 0x3f000000;
       this.setAlpha(f);
       return;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessOptionViewV2.class, "13")) {
          return;
       }
       if (p0 == this.b) {
          super.setOnClickListener(p0);
       }else {
          this.c = p0;
       }
       return;
    }
    public final void setPosition(int p0){
       if (PatchProxy.isSupport(GuessOptionViewV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuessOptionViewV2.class, "7")) {
          return;
       }
       GuessOptionViewV2 tk = this.k;
       if (tk != 3) {
          if (tk == 5) {
             this.g.setBackgroundResource(R.drawable.arg_RES_7f081273);
             this.h.getBackground().setAlpha(51);
          }
       }else {
          this.g.setBackgroundResource(R.drawable.arg_RES_7f081271);
          this.h.getBackground().setAlpha(66);
       }
       return;
    }
    public void setResultStatus(KShellGuessResultStatus p0){
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(GuessOptionViewV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuessOptionViewV2.class, "10")) {
          return;
       }
       if (p0) {
          this.h.setVisibility(0);
       }else {
          this.h.setVisibility(8);
       }
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessOptionViewV2.class, "5")) {
          return;
       }
       this.e.setText(p0);
       return;
    }
}
