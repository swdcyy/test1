package com.yxcorp.gifshow.v3.editor.text.drawerlayout.SingleEditTextDrawerLayout;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import com.yxcorp.gifshow.v3.editor.text.widget.CommonDrawerEditText;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.widget.EditText;
import juc.b;
import com.yxcorp.gifshow.v3.editor.text.drawerlayout.TextBackgroundLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import qvc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import android.graphics.Canvas;
import juc.c;
import juc.c$a;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import android.graphics.Rect;
import android.text.Layout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam;
import java.lang.CharSequence;
import android.text.TextPaint;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import java.lang.Math;
import android.view.MotionEvent;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import android.graphics.Typeface;

public class SingleEditTextDrawerLayout extends TextDrawerLayout	// class@0013bd
{
    public final TextBackgroundLayout d;
    public final CommonDrawerEditText e;
    public HashMap f;

    public void SingleEditTextDrawerLayout(CommonDrawerEditText p0){
       a.p(p0, "mEditText");
       Context context = p0.getContext();
       a.o(context, "mEditText.context");
       super(context, p0.getTextDrawer());
       this.e = p0;
       Context context1 = p0.getContext();
       a.o(context1, "mEditText.context");
       TextBackgroundLayout textBackgrou = new TextBackgroundLayout(context1, p0.getTextDrawer(), (p0.getSelfDrawBackground() ^ 0x01));
       this.d = textBackgrou;
       textBackgrou.addView(p0, new FrameLayout$LayoutParams(-1, -1));
       this.addView(textBackgrou, new RelativeLayout$LayoutParams(-1, -1));
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleEditTextDrawerLayout.class, "6")) {
          return;
       }
       String str = "watcher";
       a.p(p0, str);
       SingleEditTextDrawerLayout te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(p0, te, CommonDrawerEditText.class, "8")) {
          a.p(p0, str);
          if (!te.g.contains(p0)) {
             te.g.add(p0);
          }
       }
       return;
    }
    public void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleEditTextDrawerLayout.class, "9")) {
          return;
       }
       a.p(p0, "canvas");
       c$a.a(this.getTextDrawer(), p0, false, 2, null);
       Rect rect = this.getTextDrawer().r().w();
       p0.save();
       p0.translate((float)rect.left, (float)rect.top);
       this.e.getLayout().draw(p0);
       p0.restore();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, SingleEditTextDrawerLayout.class, "10")) {
          return;
       }
       this.d.invalidate();
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, SingleEditTextDrawerLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.isEnabled();
    }
    public void e(String p0){
       TextPaint paint;
       Layout$Alignment aLIGN_NORMAL;
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleEditTextDrawerLayout.class, "8")) {
          return;
       }
       a.p(p0, "text");
       this.getTextDrawer().q().n(p0);
       int i = 1;
       b uob = (!p0.length())? 1: null;
       if (uob) {
          this.getTextDrawer().q().k(p0);
          String[] stringArray = new String[0];
          this.getTextDrawer().q().m(stringArray);
          return;
       }else {
          TextDrawConfigParam textDrawConf = this.getTextDrawer().r();
          this.getTextDrawer().a(p0);
          p0 = this.getTextDrawer().q().b();
          int i1 = (this.getTextDrawer().q().g() - textDrawConf.w().left) - textDrawConf.w().right;
          if (this.getTextDrawer().r().g0() <= 0) {
             paint = this.e.getPaint();
             a.o(paint, "mEditText.paint");
             TextPaint paint1 = this.e.getPaint();
             a.o(paint1, "mEditText.paint");
             paint.setTextSize((paint1.getTextSize() * this.getTextDrawer().q().c()));
          }
          TextPaint paint2 = this.e.getPaint();
          int i2 = textDrawConf.q();
          if (i2 != i) {
             aLIGN_NORMAL = (i2 != 2)? Layout$Alignment.ALIGN_NORMAL: Layout$Alignment.ALIGN_OPPOSITE;
          }else {
             aLIGN_NORMAL = Layout$Alignment.ALIGN_CENTER;
          }
          StaticLayout staticLayout = new StaticLayout(p0, paint2, i1, aLIGN_NORMAL, 0x3f800000, 0, false);
          int i3 = Math.min(v12.getLineCount(), textDrawConf.f());
          String[] stringArray1 = new String[i3];
          for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
             stringArray1[i4] = "";
          }
          i4 = 0;
          String str = "null cannot be cast to non-null type java.lang.String";
          while (i4 < i3) {
             Objects.requireNonNull(p0, str);
             str = p0.substring(v12.getLineStart(i4), v12.getLineEnd(i4));
             a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             stringArray1[i4] = str;
             i4 = i4 + 1;
          }
          Objects.requireNonNull(p0, str);
          p0 = p0.substring(0, v12.getLineEnd((i3 - i)));
          a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          this.getTextDrawer().q().k(p0);
          this.getTextDrawer().q().m(stringArray1);
          if (this.getTextDrawer().r().g0() <= 0) {
             TextPaint paint3 = this.e.getPaint();
             a.o(paint3, "mEditText.paint");
             TextPaint paint4 = this.e.getPaint();
             a.o(paint4, "mEditText.paint");
             paint3.setTextSize((paint4.getTextSize() / this.getTextDrawer().q().c()));
          }
          return;
       }
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleEditTextDrawerLayout.class, "7")) {
          return;
       }
       String str = "watcher";
       a.p(p0, str);
       SingleEditTextDrawerLayout te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(p0, te, CommonDrawerEditText.class, "9")) {
          a.p(p0, str);
          te.g.remove(p0);
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, SingleEditTextDrawerLayout.class, "11")) {
          return;
       }
       MotionEvent motionEvent = MotionEvent.obtain(0, 0, 3, 0, 0, 0);
       a.o(motionEvent, "event");
       this.e.onTouchEvent(motionEvent);
       return;
    }
    public EditText getFocusEditText(){
       return this.e;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, SingleEditTextDrawerLayout.class, "4")) {
          return;
       }
       Editable text = this.e.getText();
       if (text != null) {
          this.e.setSelection(text.length());
       }
       return;
    }
    public void i(Typeface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleEditTextDrawerLayout.class, "5")) {
          return;
       }
       a.p(p0, "typeface");
       TextPaint paint = this.e.getPaint();
       a.o(paint, "mEditText.paint");
       paint.setTypeface(p0);
       this.e.a();
       this.e(String.valueOf(this.e.getText()));
       String str = this.getTextDrawer().q().b();
       this.e.setText(str);
       this.e.setSelection(Math.min(this.e.getSelectionStart(), str.length()));
       return;
    }
    public void setAcceptEvent(boolean p0){
       if (PatchProxy.isSupport(SingleEditTextDrawerLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SingleEditTextDrawerLayout.class, "1")) {
          return;
       }
       if (!p0) {
          this.e.clearFocus();
          this.e.setFocusable(false);
          this.e.setFocusableInTouchMode(false);
       }
       this.e.setEnabled(p0);
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleEditTextDrawerLayout.class, "3")) {
          return;
       }
       a.p(p0, "text");
       this.e.setText(p0);
       return;
    }
}
