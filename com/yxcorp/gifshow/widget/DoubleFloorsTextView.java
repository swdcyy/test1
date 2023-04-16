package com.yxcorp.gifshow.widget.DoubleFloorsTextView;
import android.widget.FrameLayout;
import android.content.Context;
import com.yxcorp.gifshow.widget.d;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import android.view.View;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatTextView;
import com.yxcorp.utility.TextUtils;
import android.graphics.Paint;
import android.text.TextPaint;
import java.lang.Number;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import ak5.j;
import tyc.a1;
import java.lang.Boolean;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.TextView$BufferType;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.graphics.Typeface;

public class DoubleFloorsTextView extends FrameLayout	// class@00181a
{
    public SizeAdjustableTextView b;
    public SizeAdjustableTextView c;
    public d d;
    public ColorStateList e;
    public ColorStateList f;

    public void DoubleFloorsTextView(Context p0){
       super(p0);
       this.d = new d();
    }
    public void DoubleFloorsTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new d();
    }
    public void DoubleFloorsTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new d();
    }
    public void a(float p0,float p1){
       if (PatchProxy.isSupport(DoubleFloorsTextView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, DoubleFloorsTextView.class, "2")) {
          return;
       }
       this.b.setAlpha(p0);
       this.c.setAlpha(p1);
       return;
    }
    public final void b(View p0,int p1){
       if (PatchProxy.isSupport(DoubleFloorsTextView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, DoubleFloorsTextView.class, "15")) {
          return;
       }
       if (!p0 instanceof EmojiTextView) {
          return;
       }
       this.d.f(p1);
       KSTextDisplayHandler kSTextDispla = p0.getKSTextDisplayHandler();
       if (kSTextDispla == null) {
          return;
       }
       kSTextDispla.s(p1);
       return;
    }
    public CharSequence getHint(){
       Object obj = PatchProxy.apply(null, this, DoubleFloorsTextView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getHint();
    }
    public ColorStateList getHintTextColors(){
       Object obj = PatchProxy.apply(null, this, DoubleFloorsTextView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getHintTextColors();
    }
    public String getText(){
       String obj = PatchProxy.apply(null, this, DoubleFloorsTextView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.x(this.b.getText()))? "": this.b.getText().toString();
       return obj;
    }
    public ColorStateList getTextColors(){
       Object obj = PatchProxy.apply(null, this, DoubleFloorsTextView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getTextColors();
    }
    public Paint getTextPaint(){
       Object obj = PatchProxy.apply(null, this, DoubleFloorsTextView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getPaint();
    }
    public float getTextSize(){
       Object obj = PatchProxy.apply(null, this, DoubleFloorsTextView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.b.getTextSize();
    }
    public void onFinishInflate(){
       a1 uoa1;
       if (PatchProxy.applyVoid(null, this, DoubleFloorsTextView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a3e4f);
       this.c = this.findViewById(0x7f0a3dfc);
       this.e = this.b.getTextColors();
       this.f = this.c.getTextColors();
       if (j.o().t()) {
          int i = 3;
          if (this.b instanceof EmojiTextView) {
             uoa1 = new a1(this.b);
             uoa1.o(i);
             this.b.setKSTextDisplayHandler(uoa1);
          }
          if (this.c instanceof EmojiTextView) {
             uoa1 = new a1(this.c);
             uoa1.o(i);
             this.c.setKSTextDisplayHandler(uoa1);
          }
       }
       return;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(DoubleFloorsTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DoubleFloorsTextView.class, "11")) {
          return;
       }
       this.b.setEnabled(p0);
       this.c.setEnabled(p0);
       return;
    }
    public void setFakeBoldText(boolean p0){
       if (PatchProxy.isSupport(DoubleFloorsTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DoubleFloorsTextView.class, "5")) {
          return;
       }
       this.c.getPaint().setFakeBoldText(p0);
       this.b.getPaint().setFakeBoldText(p0);
       return;
    }
    public void setHint(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DoubleFloorsTextView.class, "8")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.b.setHint(p0);
          this.c.setHint(p0);
       }
       return;
    }
    public void setHintTextColor(ColorStateList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DoubleFloorsTextView.class, "18")) {
          return;
       }
       this.b.setHintTextColor(p0);
       return;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DoubleFloorsTextView.class, "4")) {
          return;
       }
       if (!p0 instanceof Spannable) {
          SpannableString spannableStr = new SpannableString(p0);
          if (!TextUtils.x(p0)) {
             this.d.a(spannableStr);
          }
          this.c.setText(spannableStr, TextView$BufferType.SPANNABLE);
          this.b.setText(spannableStr, TextView$BufferType.SPANNABLE);
       }else {
          this.c.setText(p0);
          this.b.setText(p0);
       }
       return;
    }
    public void setTypeface(Typeface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DoubleFloorsTextView.class, "10")) {
          return;
       }
       this.b.setTypeface(p0);
       this.c.setTypeface(p0);
       return;
    }
    public void setUserLinkColor(int p0){
       if (PatchProxy.isSupport(DoubleFloorsTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DoubleFloorsTextView.class, "12")) {
          return;
       }
       this.b(this.b, p0);
       this.b(this.c, p0);
       return;
    }
}
