package com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import android.widget.EditText;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Typeface;
import bvc.a;
import java.lang.Math;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.text.Editable;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import android.text.TextPaint;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.widget.TextView$BufferType;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.text.Layout;
import rnc.i;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer$b;

public class VoteTextView extends EditText	// class@0012c8
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public EditVoteStickerDrawer$b i;
    public boolean j;
    public int k;
    public boolean l;

    public void VoteTextView(Context p0){
       super(p0, null);
    }
    public void VoteTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoteTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = false;
       this.j = b;
       int i = 2;
       this.k = i;
       this.l = b;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.i6);
          this.b = typedArray.getDimensionPixelSize(3, b);
          this.c = typedArray.getDimensionPixelSize(i, b);
          this.d = typedArray.getDimensionPixelSize(6, b);
          this.e = typedArray.getDimensionPixelSize(5, b);
          int i1 = -1;
          this.f = typedArray.getColor(1, i1);
          this.g = typedArray.getColor(b, i1);
          this.k = typedArray.getInt(4, i);
          typedArray.recycle();
          if (typedArray.getBoolean(7, b) && !PatchProxy.applyVoid(null, this, VoteTextView.class, "11")) {
             Typeface typeface = Typeface.create("sans-serif-medium", b);
             if (typeface == null) {
                typeface = Typeface.DEFAULT;
             }
             this.setTypeface(typeface);
          }
          if (a.a) {
             this.setPadding(Math.max((this.getPaddingLeft() - a.b), b), Math.max((this.getPaddingTop() - a.b), b), Math.max((this.getPaddingRight() - a.b), b), Math.max((this.getPaddingBottom() - a.b), b));
          }
       }
       return;
    }
    public void a(int p0){
       if (PatchProxy.isSupport(VoteTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoteTextView.class, "8")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       if (layoutParams != null && (layoutParams.height != p0 && p0)) {
          layoutParams.height = p0;
          this.setLayoutParams(layoutParams);
       }
    label_0028 :
       return;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(VoteTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoteTextView.class, "7")) {
          return;
       }
       if (p0) {
          this.setTextSize(0, (float)p0);
       }
       return;
    }
    public final void c(Editable p0,boolean p1){
       if (PatchProxy.isSupport(VoteTextView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, VoteTextView.class, "6")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          int i = 0;
          int i1 = 1;
          while (i < p0.length()) {
             if (p0.charAt(i) == 10) {
                if (p1 && (i1 && this.k > 1)) {
                   i1 = 0;
                }else {
                   int i2 = i + 1;
                   p0.delete(i, i2);
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public final CharSequence d(Editable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoteTextView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c(p0, false);
       return p0;
    }
    public ContextMenu$ContextMenuInfo getContextMenuInfo(){
       Object obj = PatchProxy.apply(null, this, VoteTextView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getContextMenuInfo();
    }
    public boolean getHasResetLayout(){
       return this.j;
    }
    public CharSequence getTextWithoutBreakChar(){
       Object obj = PatchProxy.apply(null, this, VoteTextView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(new SpannableStringBuilder(this.getText()));
    }
    public int getTwoLineHeight(){
       return this.c;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(VoteTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, VoteTextView.class, "9")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (!PatchProxy.applyVoid(null, this, VoteTextView.class, "10")) {
          LinearGradient linearGradie = -1;
          if (this.f != linearGradie && this.g != linearGradie) {
             LinearGradient linearGradie1 = new LinearGradient((float)this.getPaddingLeft(), 0, (float)(this.getWidth() - this.getPaddingRight()), 0, this.f, this.g, Shader$TileMode.CLAMP);
             this.getPaint().setShader(linearGradie);
          }
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(VoteTextView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, VoteTextView.class, "3")) {
          return;
       }
       if (this.h == null) {
          this.setText(p0);
       }
       return;
    }
    public void setEndEllipseAvailability(boolean p0){
       this.l = p0;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       int i;
       int i1;
       SpannableStringBuilder spannableStr;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoteTextView.class, "2")) {
          return;
       }
       boolean b = true;
       this.h = b;
       if (a.a) {
          this.setWidth(this.getMaxWidth());
          i = (this.getMaxWidth() - this.getCompoundPaddingLeft()) - this.getCompoundPaddingRight();
          i1 = a.b * 2;
       }else {
          i = Math.max(this.getWidth(), this.getMaxWidth()) - this.getCompoundPaddingLeft();
          i1 = this.getCompoundPaddingRight();
       }
       int i2 = i - i1;
       if (this.getWidth() > 0 && (i2 > 0 && !TextUtils.isEmpty(p0))) {
          if (!p0 instanceof Editable) {
             spannableStr = new SpannableStringBuilder(p0);
          }
          SpannableStringBuilder spannableStr1 = spannableStr;
          this.c(spannableStr1, b);
          this.b(this.d);
          StaticLayout staticLayout = new StaticLayout(spannableStr1, this.getPaint(), i2, Layout$Alignment.ALIGN_CENTER, 0x3f800000, 0, false);
          if (v12.getLineCount() > this.k) {
             float lineWidth = v12.getLineWidth(0);
             float lineWidth1 = (this.k > b)? v12.getLineWidth(b): 0;
             i1 = (int)(lineWidth + lineWidth1);
             while (StaticLayout.getDesiredWidth(this.d(new SpannableStringBuilder(spannableStr1)), this.getPaint()) - (float)i1 > 0) {
                int i3 = spannableStr1.length() - b;
                int i4 = i3 - 1;
                if (i.b(spannableStr1.subSequence(i4, spannableStr1.length()))) {
                   i3 = i4;
                }
                spannableStr1.delete(i3, spannableStr1.length());
             }
             if (this.l != null && spannableStr1.length() > 0) {
                spannableStr1.replace((spannableStr1.length() - b), spannableStr1.length(), "...");
             }
          }
       label_00dd :
          if (v12.getLineCount() > b && this.k > b) {
             i1 = v12.getLineEnd(0) - b;
             if (spannableStr1.charAt(i1) != 10) {
                spannableStr1.insert((i1 + b), String.valueOf(10));
             }
          }
          i = Math.min(this.getSelectionEnd(), spannableStr1.length());
          if (v12.getLineCount() > b && this.k > b) {
             this.b(this.e);
             this.a(this.c);
          }else {
             this.b(this.d);
             this.a(this.b);
          }
          VoteTextView ti = this.i;
          if (ti != null) {
             ti.a(v12.getLineCount());
          }
          this.j = b;
       }else if(TextUtils.isEmpty(p0)){
          this.b(this.d);
          this.a(this.b);
          VoteTextView ti1 = this.i;
          if (ti1 != null) {
             ti1.a(b);
          }
          this.j = b;
       }
       i = -1;
       if (a.a) {
          this.setGravity(17);
       }else if(TextUtils.isEmpty(spannableStr)){
          b = 0x800003;
       }
       this.setGravity((b | 0x10));
       super.setText(spannableStr, p1);
       if (i != -1 && this.isCursorVisible()) {
          this.setSelection(i);
       }
       this.h = false;
       return;
    }
    public void setVoteViewLineSizeListener(EditVoteStickerDrawer$b p0){
       this.i = p0;
    }
}
