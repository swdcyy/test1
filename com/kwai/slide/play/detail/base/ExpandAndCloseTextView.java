package com.kwai.slide.play.detail.base.ExpandAndCloseTextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.StringBuilder;
import java.lang.String;
import lnc.a1;
import android.content.Context;
import com.kwai.slide.play.detail.base.ExpandAndCloseTextView$a;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.text.SpannableString;
import com.kwai.robust.PatchProxyResult;
import android.text.Layout;
import java.lang.CharSequence;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.text.style.ForegroundColorSpan;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import android.text.style.ClickableSpan;
import com.kwai.slide.play.detail.base.ExpandAndCloseTextView$b;
import android.widget.TextView$BufferType;
import android.text.TextUtils;

public class ExpandAndCloseTextView extends AppCompatTextView	// class@00179d
{
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String l;
    public ExpandAndCloseTextView$b m;
    public boolean n;
    public ClickableSpan o;
    public static String p = "...";
    public static String q = "Õ¹¿ª";
    public static String r;

    static {
       ExpandAndCloseTextView.r = " "+a1.p(0x7f1045f0);
    }
    public void ExpandAndCloseTextView(Context p0){
       super(p0);
       this.f = false;
       this.g = false;
       this.h = false;
       this.i = false;
       this.n = false;
       this.o = new ExpandAndCloseTextView$a(this);
    }
    public void ExpandAndCloseTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = false;
       this.g = false;
       this.h = false;
       this.i = false;
       this.n = false;
       this.o = new ExpandAndCloseTextView$a(this);
    }
    public void ExpandAndCloseTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = false;
       this.g = false;
       this.h = false;
       this.i = false;
       this.n = false;
       this.o = new ExpandAndCloseTextView$a(this);
    }
    public void onDraw(Canvas p0){
       SpannableString spannableStr;
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandAndCloseTextView.class, "2")) {
          return;
       }
       if (this.h == null && !PatchProxy.applyVoid(null, this, ExpandAndCloseTextView.class, "3")) {
          ExpandAndCloseTextView tl = this.l;
          if (this.f != null) {
             spannableStr = this.p(tl);
          }else if(this.g != null){
             SpannableString spannableStr1 = PatchProxy.applyOneRefs(tl, this, ExpandAndCloseTextView.class, "5");
             if (spannableStr1 != PatchProxyResult.class) {
             }else {
                String str = tl+ExpandAndCloseTextView.q;
                if (this.q(str).getLineCount() <= this.j) {
                   spannableStr1 = new SpannableString(tl);
                }else {
                   SpannableString spannableStr2 = new SpannableString(str);
                   spannableStr2.setSpan(this.o, (str.length() - (ExpandAndCloseTextView.q).length()), str.length(), 33);
                   spannableStr = spannableStr2;
                }
             }
             spannableStr = spannableStr1;
          }else {
             spannableStr = this.p(tl);
          }
          this.setUpdateText(spannableStr);
          this.setMovementMethod(LinkMovementMethod.getInstance());
       }
       super.onDraw(p0);
       this.h = true;
       this.i = false;
       return;
    }
    public final SpannableString p(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExpandAndCloseTextView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (this.q(p0+ExpandAndCloseTextView.r).getLineCount() <= this.j)? p0+ExpandAndCloseTextView.r: this.r(p0);
       int i = p0.length() - (ExpandAndCloseTextView.r).length();
       int i1 = p0.length();
       SpannableString spannableStr = new SpannableString(p0);
       if (this.n != null || this.f != null) {
          spannableStr.setSpan(this.o, i, i1, 33);
       }
       if (this.k != null) {
          spannableStr.setSpan(new ForegroundColorSpan(a1.a(this.k)), i, i1, 33);
       }
       return spannableStr;
    }
    public final Layout q(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExpandAndCloseTextView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       StaticLayout staticLayout = new StaticLayout(p0, this.getPaint(), ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()), Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, false);
       return obj;
    }
    public final String r(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, ExpandAndCloseTextView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0+ExpandAndCloseTextView.p+ExpandAndCloseTextView.r;
       Layout layout = this.q(obj);
       ExpandAndCloseTextView tj = this.j;
       if (layout.getLineCount() <= tj) {
          return obj;
       }
       int lineEnd = layout.getLineEnd(tj);
       if (lineEnd == -1) {
          return "";
       }
       if (p0.length() < lineEnd) {
          lineEnd = p0.length();
       }
       return this.r(p0.substring(0, (lineEnd - 1)));
    }
    public void setClickableSpan(ClickableSpan p0){
       this.o = p0;
       this.n = true;
    }
    public void setFoldColor(int p0){
       this.k = p0;
    }
    public void setFoldText(String p0){
       ExpandAndCloseTextView.q = p0;
    }
    public void setFolderSpanClickListener(ExpandAndCloseTextView$b p0){
       this.m = p0;
    }
    public void setForbidFold(boolean p0){
       this.f = p0;
    }
    public void setMaxLines(int p0){
       this.j = p0;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExpandAndCloseTextView.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(this.l) || this.i == null) {
          this.h = false;
          this.l = String.valueOf(p0);
       }
       super.setText(p0, p1);
       return;
    }
    public void setUnfoldText(String p0){
       ExpandAndCloseTextView.r = p0;
    }
    public final void setUpdateText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandAndCloseTextView.class, "4")) {
          return;
       }
       this.i = true;
       this.setText(p0);
       return;
    }
}
