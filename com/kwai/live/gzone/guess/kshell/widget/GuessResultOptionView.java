package com.kwai.live.gzone.guess.kshell.widget.GuessResultOptionView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.k1;
import android.widget.TextView;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import ekd.m1;
import com.kwai.live.gzone.guess.bean.ResultOption;
import com.kwai.live.gzone.guess.kshell.widget.GuessResultOptionView$a;
import java.lang.Enum;
import java.lang.CharSequence;

public class GuessResultOptionView extends FrameLayout implements d	// class@000d79
{
    public TextView b;
    public TextView c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;

    public void GuessResultOptionView(Context p0){
       super(p0, null);
    }
    public void GuessResultOptionView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GuessResultOptionView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(boolean p0,int p1){
       if (PatchProxy.isSupport(GuessResultOptionView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, GuessResultOptionView.class, "2")) {
          return;
       }
       if (!PatchProxy.isSupport(GuessResultOptionView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), this, GuessResultOptionView.class, "3")) {
          this.removeAllViews();
          a.c(this.getContext(), R.layout.arg_RES_7f0d0b4e, this);
          this.doBindView(this);
          int i = 8;
          if (k1.h()) {
             this.e.setVisibility(0);
             this.f.setVisibility(i);
             this.g = this.e;
          }else {
             this.e.setVisibility(i);
             this.f.setVisibility(0);
             this.g = this.f;
          }
          this.c.setTextColor(this.getResources().getColorStateList(R.color.arg_RES_7f061471));
          this.g.setVisibility(0);
          this.g.setSelected(0);
       }
       this.setIsDarkStyle(p0);
       this.setPosition(p1);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessResultOptionView.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a1155);
       this.b = m1.f(p0, 0x7f0a2eed);
       this.d = m1.f(p0, 0x7f0a1469);
       this.c = m1.f(p0, 0x7f0a0409);
       this.f = m1.f(p0, 0x7f0a1157);
       return;
    }
    public void setIsDarkStyle(boolean p0){
       if (PatchProxy.isSupport(GuessResultOptionView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuessResultOptionView.class, "8")) {
          return;
       }
       this.g.setEnabled(p0);
       return;
    }
    public void setOption(ResultOption p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessResultOptionView.class, "7")) {
          return;
       }
       int i = GuessResultOptionView$a.a[p0.mKShellGuessResultStatus.ordinal()];
       int i1 = 8;
       if (i != 1) {
          if (i != 2) {
             int i2 = 0x7f1018e6;
             if (i != 3) {
                if (i != 4) {
                   this.g.setVisibility(i1);
                }else {
                   this.g.setText(R.string.arg_RES_7f1022fc);
                   this.g.setSelected(true);
                   this.g.setVisibility(false);
                   objArray = new Object[true];
                   objArray[0] = p0.mDisplayIncome;
                   this.c.setText(String.format(this.getResources().getString(i2), objArray));
                   this.c.setEnabled(true);
                }
             }else {
                this.g.setVisibility(i1);
                objArray = new Object[true];
                objArray[0] = p0.mDisplayIncome;
                this.c.setText(String.format(this.getResources().getString(i2), objArray));
                this.c.setEnabled(false);
             }
          }else {
             this.g.setText(R.string.arg_RES_7f1023f0);
             this.g.setSelected(true);
             this.c.setEnabled(true);
          }
       }else if(p0.mUninvolved == null){
          this.c.setText(R.string.arg_RES_7f1022fd);
       }
       this.g.setVisibility(i1);
       this.g.setSelected(false);
       this.c.setEnabled(true);
       if (p0.mUninvolved != null) {
          this.c.setText(R.string.arg_RES_7f1022f7);
          this.setSelected(false);
       }else {
          this.setSelected(true);
       }
       this.setText(p0.mText);
       return;
    }
    public void setPosition(int p0){
       if (PatchProxy.isSupport(GuessResultOptionView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GuessResultOptionView.class, "6")) {
          return;
       }
       this.d.setBackgroundResource(R.drawable.arg_RES_7f080225);
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(GuessResultOptionView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GuessResultOptionView.class, "5")) {
          return;
       }
       this.d.setSelected(p0);
       this.b.setSelected(p0);
       this.c.setSelected(p0);
       return;
    }
    public final void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuessResultOptionView.class, "4")) {
          return;
       }
       this.b.setText(p0);
       return;
    }
}
