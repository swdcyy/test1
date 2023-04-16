package com.yxcorp.gifshow.notice.krn.SocialReactRichTextView;
import ze.s;
import com.yxcorp.gifshow.notice.widget.NoticeTitleTextView;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.text.TextUtils$TruncateAt;
import bg.d;
import android.view.View;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import lnc.a1;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.Spanned;
import yf.t;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import yf.n;
import android.text.Spannable;
import qtb.u;
import java.lang.Math;
import android.os.Build$VERSION;
import java.lang.Boolean;

public class SocialReactRichTextView extends NoticeTitleTextView implements s	// class@00219a
{
    public boolean l;
    public final int m;
    public int n;
    public int o;
    public TextUtils$TruncateAt p;
    public final d q;
    public static final ViewGroup$LayoutParams r;

    static {
       SocialReactRichTextView.r = new ViewGroup$LayoutParams(0, 0);
    }
    public void SocialReactRichTextView(Context p0){
       super(p0);
       this.n = 0;
       this.o = Integer.MAX_VALUE;
       this.p = TextUtils$TruncateAt.END;
       this.q = new d(this);
       this.m = this.getGravity() & 0x800007;
       this.setLinksClickable(true);
       this.setMovementMethod(LinkMovementMethod.getInstance());
       this.setHighlightColor(0);
       this.setClickable(0);
       this.setLongClickable(0);
       this.setLineSpacing((float)a1.e(4.00f), 0x3f800000);
    }
    public boolean hasOverlappingRendering(){
       return false;
    }
    public void invalidateDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialReactRichTextView.class, "3")) {
          return;
       }
       if (this.l != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          while (i < len) {
             if (spans[i].a() == p0) {
                this.invalidate();
             }
             i = i + 1;
          }
       }
       super.invalidateDrawable(p0);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, SocialReactRichTextView.class, "6")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.l != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].d();
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SocialReactRichTextView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.l != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].e();
          }
       }
       return;
    }
    public void onFinishTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, SocialReactRichTextView.class, "7")) {
          return;
       }
       super.onFinishTemporaryDetach();
       if (this.l != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].f();
          }
       }
       return;
    }
    public void onStartTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, SocialReactRichTextView.class, "5")) {
          return;
       }
       super.onStartTemporaryDetach();
       if (this.l != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].g();
          }
       }
       return;
    }
    public int reactTagForTouch(float p0,float p1){
       if (PatchProxy.isSupport(SocialReactRichTextView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, SocialReactRichTextView.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.getId();
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(SocialReactRichTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SocialReactRichTextView.class, "11")) {
          return;
       }
       this.q.b(p0);
       return;
    }
    public void setBorderRadius(float p0){
       if (PatchProxy.isSupport(SocialReactRichTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SocialReactRichTextView.class, "14")) {
          return;
       }
       this.q.d(p0);
       return;
    }
    public void setBorderStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialReactRichTextView.class, "16")) {
          return;
       }
       this.q.f(p0);
       return;
    }
    public void setEllipsizeLocation(TextUtils$TruncateAt p0){
       this.p = p0;
    }
    public void setGravityHorizontal(int p0){
       SocialReactRichTextView tm;
       if (PatchProxy.isSupport(SocialReactRichTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SocialReactRichTextView.class, "8")) {
          return;
       }
       if (!p0) {
          tm = this.m;
       }
       this.setGravity((tm | ((this.getGravity() & 0xf8) & -8388616)));
       return;
    }
    public void setNumberOfLines(int p0){
       if (PatchProxy.isSupport(SocialReactRichTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SocialReactRichTextView.class, "9")) {
          return;
       }
       if (!p0) {
          p0 = Integer.MAX_VALUE;
       }
       this.o = p0;
       int i = 1;
       if (p0 != i) {
          i = false;
       }
       this.setSingleLine(i);
       this.setMaxLines(this.o);
       return;
    }
    public void setText(n p0){
       object oobject;
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialReactRichTextView.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.l = p0.a();
       Spannable spannable = p0.j();
       if (this.l != null && spannable != null) {
          int i = 0;
          u[] spans = spannable.getSpans(i, spannable.length(), u.class);
          int len = spans.length;
          while (i < len) {
             oobject = spans[i];
             if (oobject != null) {
                oobject.i(this);
             }
             i = i + 1;
          }
       }
       if (this.getLayoutParams() == null) {
          this.setLayoutParams(SocialReactRichTextView.r);
       }
       this.setText(spannable);
       float f = p0.e();
       float f1 = p0.g();
       float f2 = p0.f();
       float f3 = p0.d();
       oobject = 0xbf800000;
       if (f - oobject && (f1 - oobject && (f2 - oobject && f3 - oobject))) {
          this.setPadding((int)Math.floor((double)f), (int)Math.floor((double)f1), (int)Math.floor((double)f2), (int)Math.floor((double)f3));
       }
    label_0083 :
       int i1 = p0.k();
       if (this.n != i1) {
          this.n = i1;
       }
       this.setGravityHorizontal(this.n);
       i1 = Build$VERSION.SDK_INT;
       if (i1 >= 23 && this.getBreakStrategy() != p0.l()) {
          this.setBreakStrategy(p0.l());
       }
       if (i1 >= 26 && this.getJustificationMode() != p0.c()) {
          this.setJustificationMode(p0.c());
       }
       this.requestLayout();
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       Spanned obj = PatchProxy.applyOneRefs(p0, this, SocialReactRichTextView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.l != null && this.getText() instanceof Spanned) {
          obj = this.getText();
          int i = 0;
          t[] spans = obj.getSpans(i, obj.length(), t.class);
          int len = spans.length;
          while (i < len) {
             if (spans[i].a() == p0) {
                return true;
             }
             i = i + 1;
          }
       }
       return super.verifyDrawable(p0);
    }
}
