package i8a.g;
import vw6.d;
import e8a.d;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import com.kwai.slide.play.detail.information.caption.CaptionTextView;
import java.util.concurrent.atomic.AtomicReference;
import mrd.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import java.lang.CharSequence;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import koc.c;
import mxb.h0;
import i8a.g$b;
import brd.y;
import java.lang.Throwable;
import i8a.a;
import tkd.b;
import tkd.d;
import nl9.u;
import i8a.c;
import z1.a;
import lnc.u9;
import lnc.a1;
import i8a.g$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.Log;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.View$MeasureSpec;
import android.text.Layout;
import java.lang.Integer;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.TextPaint;
import rnc.i;
import java.lang.Character;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import java.lang.Float;
import android.text.style.ClickableSpan;
import tyc.s4;
import com.yxcorp.gifshow.util.ColorURLSpan;

public class g extends d implements d	// class@0027c8
{
    public final AtomicReference o;
    public final AtomicReference p;
    public final c q;
    public final AtomicInteger r;
    public final CaptionTextView s;
    public final int t;
    public View$OnClickListener u;
    public ClientContent$TagPackage v;
    public ArrayList w;
    public int x;
    public Throwable y;
    public static final int z;

    public void g(QPhoto p0,int p1,int p2,int p3,Boolean p4,boolean p5,CaptionTextView p6,int p7,int p8){
       super(p0, p1, p2, p3, p4, p5);
       this.o = new AtomicReference();
       this.p = new AtomicReference();
       this.q = a.g();
       this.r = new AtomicInteger(0);
       this.s = p6;
       this.x = p7;
       this.t = p8;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       g ts = this.s;
       _monitor_enter(ts);
       if (this.r.get()) {
          _monitor_exit(ts);
          return;
       }else {
          int i = 1;
          this.r.compareAndSet(0, i);
          super.j();
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(this.f.get());
          if (NasaExperimentUtils.H() && (!TextUtils.x(this.g.getCaptionTitle()) && (!TextUtils.x((this.g.getCaptionTitle()).trim()) && this.g.isImageType()))) {
             spannableStr.replace(0, 0, ((((this.g.getCaptionTitle()).replace("\n", " ")).replace("\r", " ")).replace("  ", " ")).trim()+" ");
          }
       label_0090 :
          this.w = c.d(spannableStr);
          this.o.set(new SpannableStringBuilder(spannableStr));
          SpannableStringBuilder spannableStr1 = new SpannableStringBuilder(spannableStr);
          if (h0.g(this.g) || h0.i(this.g)) {
             this.o(spannableStr1);
          }
          this.p.set(spannableStr1);
          this.r.compareAndSet(i, 2);
          spannableStr = this.s(spannableStr1, spannableStr);
          if (spannableStr == null) {
             this.q.onNext(new g$b(i, spannableStr1, null));
          }else {
             this.q.onNext(new g$b(i, spannableStr, spannableStr1));
          }
          this.r.compareAndSet(2, 3);
          _monitor_exit(ts);
          return;
       }
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       super.m();
       this.u = null;
       return;
    }
    public final void o(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "19")) {
          return;
       }
       d.a(-1694791652).KM(this.g, p0, d.a(-1694791652).e7(this.g, p0), new c(this));
       return;
    }
    public final void p(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "13")) {
          return;
       }
       p0.append(" ");
       p0.setSpan(new u9(a1.e(4.00f)), p0.length(), p0.length(), 33);
       p0.append(a1.p(R.string.arg_RES_7f1004d1));
       p0.setSpan(new g$a(this), p0.length(), p0.length(), 33);
       return;
    }
    public String q(){
       String obj = PatchProxy.apply(null, this, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.y != null)? Log.f(this.y): "";
       return obj;
    }
    public int r(){
       Object obj = PatchProxy.apply(null, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.r.get();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       a.c("SlideCaption", this.g, "run");
       this.j();
       return;
    }
    public final SpannableStringBuilder s(SpannableStringBuilder p0,SpannableStringBuilder p1){
       object obj3;
       int b;
       ClickableSpan[] spans1;
       int len;
       float f;
       float f1;
       g og = this;
       SpannableStringBuilder obj = p0;
       Object obj1 = p1;
       g og1 = g.class;
       CharSequence obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, og1, "10");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       int i = -2;
       if (og.s.getLayoutParams() == null) {
          og.s.setLayoutParams(new ViewGroup$LayoutParams(og.x, i));
       }else {
          og.s.getLayoutParams().width = og.x;
       }
       og.s.setText(obj);
       og.s.measure(View$MeasureSpec.makeMeasureSpec(og.x, 0x40000000), View$MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE));
       SpannableStringBuilder spannableStr = null;
       if (og.s.getLineCount() <= og.t) {
          return spannableStr;
       }else {
          i = 1;
          int lineEnd = og.s.getLayout().getLineEnd((og.t - i));
          if ((lineEnd - og.s.getLayout().getLineStart((og.t - i))) > i) {
             if (PatchProxy.isSupport(og1)) {
                Object obj4 = PatchProxy.applyOneRefs(Integer.valueOf(lineEnd), this, og1, "16");
                if (obj4 != PatchProxyResult.class) {
                   len = obj4.intValue();
                label_0127 :
                   lineEnd = lineEnd - len;
                }
             }
             b = 1;
             int i4 = 1;
             for (len = lineEnd - 1; len >= 0 && (lineEnd >= 0 && (lineEnd >= len && og.s.getText().length() >= lineEnd)); len = lineEnd - i4) {
                Object obj5 = PatchProxy.apply(spannableStr, this, og1, "18");
                if (obj5 != PatchProxyResult.class) {
                   f = obj5.floatValue();
                }else {
                   float f2 = og.s.getPaint().measureText(a1.p(0x7f1004d1)) + (float)a1.e(6.00f);
                   f = og.s.getPaint().measureText("бн") + f2;
                   f = f + (float)d.a(-1694791652).vq(og.g);
                }
                if (PatchProxy.isSupport(og1)) {
                   Object obj6 = PatchProxy.applyOneRefs(Integer.valueOf(len), this, og1, "17");
                   if (obj6 != PatchProxyResult.class) {
                      f1 = obj6.floatValue();
                   label_011b :
                      if (f - f1 > 0) {
                         i4 = i4 + i;
                         b = b + 1;
                      }else {
                         break ;
                      }
                   }
                }
                f1 = (float)og.s.getMeasuredWidth() - og.s.getLayout().getPrimaryHorizontal(len);
                goto label_011b ;
             }
          label_0126 :
             len = b;
             goto label_0127 ;
          }
          obj2 = og.s.getText();
          int i1 = lineEnd;
          int i2 = 0;
          while (i1 > 0) {
             lineEnd = i1 - 1;
             if (i.e(obj2.charAt(lineEnd))) {
                char c = obj2.charAt(lineEnd);
                if (PatchProxy.isSupport(og1)) {
                   obj3 = PatchProxy.applyOneRefs(Character.valueOf(c), this, og1, "15");
                   if (obj3 != PatchProxyResult.class) {
                      b = obj3.booleanValue();
                   }else if((Integer.toHexString(c)).compareTo("dc00") >= 0 && (Integer.toHexString(c)).compareTo("dfff") <= 0){
                      b = true;
                   }else {
                      b = false;
                   }
                }else {
                   goto label_015b ;
                }
                if (!b) {
                }else {
                   break ;
                }
             }else {
                break ;
             }
          }
          int i3 = og.s.getText().length();
          if (og.g.getCaptionSearchInfo() != null && (og.g.getCaptionSearchInfo().mCaptionSearchType == 2 || og.g.getCaptionSearchInfo().mCaptionSearchType == 3)) {
             if (PatchProxy.isSupport(og1)) {
                obj = PatchProxy.applyThreeRefs(p1, Integer.valueOf(i1), Integer.valueOf(i3), this, g.class, "11");
                if (obj != PatchProxyResult.class) {
                }else if(h0.g(og.g) || h0.i(og.g)){
                   i3 = p1.length();
                }
                if (i1 <= p1.length() && (i3 <= p1.length() && (i1 <= 0 || i3 <= 0))) {
                   obj = obj1;
                }else {
                   spans1 = obj1.getSpans(i1, i3, ClickableSpan.class);
                   len = spans1.length;
                   for (i = 0; i < len; i = i + 1) {
                      obj1.removeSpan(spans1[i]);
                   }
                   obj = obj1.delete(i1, i3);
                }
                a.c("SlideCaption", og.g, "closeCaption-after-delete, text= "+obj);
                if (!PatchProxy.applyVoidOneRefs(obj, this, og1, "14")) {
                   ColorURLSpan[] spans = obj.getSpans(i2, obj.length(), ColorURLSpan.class);
                   i = spans.length;
                   i = i - 1;
                   while (i >= 0) {
                      obj3 = spans[i];
                      if (TextUtils.x(obj3.b())) {
                         continue ;
                      }
                      int spanStart = obj.getSpanStart(obj3);
                   }
                   if (spannableStr != null && obj.getSpanEnd(spannableStr) >= obj.length()) {
                      obj.append(8203);
                   }
                }
                obj.append("бн");
                a.c("SlideCaption", og.g, "closeCaption-final, textWith...= "+obj);
                this.p(obj);
                if (h0.g(og.g) || h0.i(og.g)) {
                   this.o(obj);
                }
             }else {
                goto label_0228 ;
             }
             return obj;
          }else {
             float textSize = og.s.getTextSize();
             if (PatchProxy.isSupport(og1)) {
                obj = PatchProxy.applyFourRefs(p1, Integer.valueOf(i1), Integer.valueOf(i3), Float.valueOf(textSize), this, g.class, "12");
                if (obj != PatchProxyResult.class) {
                }else if(i1 <= p1.length() && (i3 <= p1.length() && (i1 <= 0 || i3 <= 0))){
                   obj = obj1;
                }else {
                   spans1 = obj1.getSpans(i1, i3, ClickableSpan.class);
                   len = spans1.length;
                   for (; i2 < len; i2 = i2 + 1) {
                      obj1.removeSpan(spans1[i2]);
                   }
                   obj = obj1.delete(i1, i3);
                }
                this.p(obj);
                if (this.g() != null) {
                   s4 os4 = this.g();
                   os4.e(obj, os4.d(), textSize);
                }
             }else {
                goto label_01ca ;
             }
             return obj;
          }
       }
    }
}
