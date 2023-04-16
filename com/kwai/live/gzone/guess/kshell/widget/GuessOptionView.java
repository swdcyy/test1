package com.kwai.live.gzone.guess.kshell.widget.GuessOptionView;
import ml8.d;
import com.kwai.live.gzone.guess.kshell.widget.GuessOptionBaseView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.k1;
import android.widget.TextView;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import com.kwai.live.gzone.guess.bean.UserBetOption;
import com.kwai.live.gzone.guess.bean.BetOption;
import java.lang.Long;
import android.content.res.Resources;
import java.lang.CharSequence;
import com.kwai.live.gzone.guess.kshell.widget.GuessOptionView$a;
import java.lang.Enum;
import ekd.m1;
import java.lang.Boolean;
import android.content.res.ColorStateList;
import com.kwai.live.gzone.guess.kshell.widget.GuessOptionBaseView$a;
import com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;

public class GuessOptionView extends GuessOptionBaseView implements d	// class@000d75
{
    public TextView b;
    public TextView c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    public ViewStub h;
    public KShellGuessQuestionStatus i;
    public View j;
    public boolean k;
    public GuessOptionBaseView$a l;
    public int m;
    public boolean n;
    public boolean o;

    public void GuessOptionView(Context p0){
       super(p0, null);
    }
    public void GuessOptionView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GuessOptionView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = true;
       this.o = true;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(GuessOptionView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuessOptionView.class, "2")) {
          return;
       }
       if (!PatchProxy.isSupport(GuessOptionView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuessOptionView.class, "3")) {
          this.removeAllViews();
          a.c(this.getContext(), R.layout.arg_RES_7f0d0b49, this);
          this.doBindView(this);
          if (k1.h()) {
             this.e.setVisibility(0);
             this.f.setVisibility(8);
             this.g = this.e;
          }else {
             this.e.setVisibility(8);
             this.f.setVisibility(0);
             this.g = this.f;
          }
          this.d(KShellGuessQuestionStatus.UNKNOWN);
          this.n = true;
       }
       this.m = p0;
       this.setDarkStyle(this.o);
       this.setPosition(p0);
       return;
    }
    public void c(BetOptionInfo p0,UserBetOption p1,KShellGuessQuestionStatus p2){
       UserBetOption userBetOptio;
       Object[] objArray;
       String str;
       Object[] objArray2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GuessOptionView.class, "13")) {
          return;
       }
       this.i = p2;
       int i = 0;
       if (p1 != null) {
          this.e(p2, KShellGuessQuestionStatus.USER_INVOLVED);
          p1 = p1.mDisplayAmount;
          userBetOptio = p1.mAmount;
       }else {
          this.e(p2, KShellGuessQuestionStatus.USER_UNINVOLVED);
          String str1 = "";
          userBetOptio = i;
       }
       if (p0 == null) {
          return;
       }else {
          BetOptionInfo mBetOption = p0.mBetOption;
          if (mBetOption == null) {
             return;
          }else {
             this.setText(mBetOption.mContent);
             p0 = p0.mOptionOdds;
             if (!PatchProxy.isSupport(GuessOptionView.class) || !PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(userBetOptio), p1, this, GuessOptionView.class, "6")) {
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
                this.c.setText(str);
             }
             return;
          }
       }
    }
    public final void d(KShellGuessQuestionStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessOptionView.class, "10")) {
          return;
       }
       int i = GuessOptionView$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                this.setEnabled(true);
                this.setSelected(false);
             }
          }else {
             this.setEnabled(true);
             this.setSelected(true);
          }
       }else if(this.i == KShellGuessQuestionStatus.PAPER_GUESS_CUT_OFF){
          this.setEnabled(false);
       }else {
          this.setEnabled(true);
       }
       this.setSelected(false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessOptionView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a2eed);
       this.e = m1.f(p0, 0x7f0a1155);
       this.f = m1.f(p0, 0x7f0a1157);
       this.d = m1.f(p0, 0x7f0a1469);
       this.c = m1.f(p0, 0x7f0a0409);
       return;
    }
    public final void e(KShellGuessQuestionStatus p0,KShellGuessQuestionStatus p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GuessOptionView.class, "9")) {
          return;
       }
       if (p0 == KShellGuessQuestionStatus.PAPER_GUESSING) {
          this.setClickable(true);
       }else {
          this.setClickable(false);
       }
       this.d(p1);
       return;
    }
    public final void setDarkStyle(boolean p0){
       if (PatchProxy.isSupport(GuessOptionView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuessOptionView.class, "8")) {
          return;
       }
       this.k = p0;
       this.g.setEnabled(p0);
       if (!PatchProxy.applyVoid(null, this, GuessOptionView.class, "4")) {
          ColorStateList colorStateLi = this.getResources().getColorStateList(R.color.arg_RES_7f061470);
          if (this.k != null) {
             this.b.setTextColor(this.getResources().getColorStateList(R.color.arg_RES_7f06143b));
          }else {
             this.b.setTextColor(colorStateLi);
          }
          colorStateLi = this.getResources().getColorStateList(R.color.arg_RES_7f06146f);
          if (this.k != null) {
             this.c.setTextColor(this.getResources().getColorStateList(R.color.arg_RES_7f06143b));
          }else {
             this.c.setTextColor(colorStateLi);
          }
       }
       return;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(GuessOptionView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuessOptionView.class, "12")) {
          return;
       }
       super.setEnabled(p0);
       this.d.setEnabled(p0);
       this.b.setEnabled(p0);
       this.c.setEnabled(p0);
       GuessOptionView tl = this.l;
       if (tl != null) {
          tl.a(p0, this.m);
       }
       return;
    }
    public final void setPosition(int p0){
       if (PatchProxy.isSupport(GuessOptionView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuessOptionView.class, "7")) {
          return;
       }
       GuessOptionView tm = this.m;
       if (tm != 3) {
          if (tm == 5) {
             if (this.k != null) {
                this.d.setBackgroundResource(R.drawable.arg_RES_7f081272);
             }else {
                this.d.setBackgroundResource(R.drawable.arg_RES_7f080226);
             }
          }
       }else if(this.k != null){
          this.d.setBackgroundResource(R.drawable.arg_RES_7f081270);
       }else {
          this.d.setBackgroundResource(R.drawable.arg_RES_7f080224);
       }
       return;
    }
    public void setResultStatus(KShellGuessResultStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessOptionView.class, "14")) {
          return;
       }
       int i = GuessOptionView$a.b[p0.ordinal()];
       int i1 = 8;
       boolean b = true;
       int i2 = 0;
       if (i != b) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   this.g.setVisibility(i1);
                }
             }else {
                this.g.setVisibility(i2);
                this.g.setText(this.getResources().getText(R.string.arg_RES_7f1022fa));
                this.g.setSelected(i2);
             }
          }else {
             this.g.setVisibility(i2);
             this.g.setText(this.getResources().getText(R.string.arg_RES_7f1022fc));
             this.g.setSelected(b);
          }
       }else {
          this.g.setVisibility(i1);
          this.g.setText(this.getResources().getText(R.string.arg_RES_7f1022fb));
          this.g.setSelected(i2);
       }
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(GuessOptionView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuessOptionView.class, "11")) {
          return;
       }
       this.d.setSelected(p0);
       this.b.setSelected(p0);
       this.c.setSelected(p0);
       GuessOptionView tl = this.l;
       if (tl != null) {
          tl.b(p0, this.m);
       }
       return;
    }
    public void setStateListener(GuessOptionBaseView$a p0){
       this.l = p0;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessOptionView.class, "5")) {
          return;
       }
       this.b.setText(p0);
       return;
    }
}
