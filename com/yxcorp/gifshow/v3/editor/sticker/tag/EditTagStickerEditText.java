package com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText$a;
import nsd.u;
import android.content.Context;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build$VERSION;
import android.widget.EditText;
import android.graphics.Typeface;
import stc.b;
import android.text.TextPaint;
import stc.b$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText$b;
import android.text.TextWatcher;
import android.text.InputFilter;
import android.text.InputFilter$LengthFilter;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import android.graphics.Rect;
import bvc.a;
import java.lang.Integer;
import android.graphics.Paint$FontMetrics;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.text.widget.CommonDrawerEditText$b;
import android.graphics.drawable.Drawable;
import huc.t;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText$c;

public class EditTagStickerEditText extends AppCompatEditText	// class@0012b0
{
    public String e;
    public final List f;
    public final Paint g;
    public final RectF h;
    public final EditTagStickerElementData i;
    public HashMap j;
    public static long k;
    public static final EditTagStickerEditText$a l;

    static {
       EditTagStickerEditText.l = new EditTagStickerEditText$a(null);
    }
    public void EditTagStickerEditText(Context p0,EditTagStickerElementData p1){
       a.p(p0, "context");
       a.p(p1, "editTagStickerElementData");
       super(p0);
       this.i = p1;
       this.e = "";
       this.f = new ArrayList();
       Paint paint = new Paint(1);
       this.g = paint;
       this.h = new RectF();
       if (Build$VERSION.SDK_INT >= 28) {
          this.setFallbackLineSpacing(false);
       }
       paint.setTypeface(Typeface.DEFAULT);
       TextPaint paint1 = this.getPaint();
       a.o(paint1, "paint");
       b.e.f(paint1);
       this.c();
       EditTagStickerEditText.f(this, false, 1, null);
       this.b();
       if (!TextUtils.x(p1.E0())) {
          this.setText(p1.E0());
       }else {
          this.d(p1.E0());
       }
       return;
    }
    public static void f(EditTagStickerEditText p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = b.e.d();
       }
       p0.e(p1);
       return;
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerEditText.class, "1")) {
          return;
       }
       a.p(p0, "watcher");
       if (!this.f.contains(p0)) {
          this.f.add(p0);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerEditText.class, "5")) {
          return;
       }
       this.addTextChangedListener(new EditTagStickerEditText$b(this));
       return;
    }
    public final void c(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, EditTagStickerEditText.class, str)) {
          return;
       }
       int i = 2;
       InputFilter[] inputFilterA = new InputFilter[i];
       int i1 = 0;
       inputFilterA[i1] = this.getFilter();
       int i2 = 1;
       inputFilterA[i2] = new InputFilter$LengthFilter(9);
       this.setFilters(inputFilterA);
       this.setIncludeFontPadding(i1);
       this.setBackgroundColor(i1);
       this.setGravity(i2);
       b$a e = b.e;
       this.setTextColor(e.d());
       Objects.requireNonNull(e);
       Rect obj = PatchProxy.apply(objArray, e, b$a.class, str);
       int i3 = (obj != PatchProxyResult.class)? obj.intValue(): a1.a(R.color.arg_RES_7f061d78);
       this.setHintTextColor(i3);
       this.setTextSize(i1, (float)e.b());
       obj = e.e();
       if (a.a) {
          Rect left = obj.left;
          Rect top = obj.top;
          Rect right = obj.right;
          obj = obj.bottom;
          if (!PatchProxy.isSupport(EditTagStickerEditText.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(obj), this, EditTagStickerEditText.class, "4")) {
             i2 = a.b / i;
             this.setPadding((left - i2), top, (right - i2), obj);
          }
       }else {
          this.setPadding(obj.left, obj.top, obj.right, obj.bottom);
       }
       this.setHint(e.a());
       return;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerEditText.class, "6")) {
          return;
       }
       TextPaint paint = this.getPaint();
       a.o(paint, "paint");
       b$a e = b.e;
       paint.setTextSize((float)e.b());
       int i = 0;
       float f = this.getPaint().measureText(p0, i, p0.length());
       paint = this.getPaint();
       a.o(paint, "paint");
       TextPaint paint1 = this.getPaint();
       a.o(paint1, "paint");
       float f1 = paint.getFontMetrics().descent - paint1.getFontMetrics().ascent;
       Rect rect = e.e();
       if (!f) {
          f = e.a();
          f = this.getPaint().measureText(f, i, f.length());
       }
       this.h.set(0, 0, ((f + (float)rect.left) + (float)rect.right), ((f1 + (float)rect.top) + (float)rect.bottom));
       return;
    }
    public final void e(int p0){
       int i;
       if (PatchProxy.isSupport(EditTagStickerEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditTagStickerEditText.class, "7")) {
          return;
       }
       this.g.setTextSize(this.getTextSize());
       float f = this.getPaint().descent() - this.getPaint().ascent();
       float f1 = Math.max((this.g.ascent() - this.getPaint().ascent()), 0);
       if (this.getTextSize() - (float)40 < 0) {
          i = 2;
       }else if(this.getTextSize() - (float)60 < 0){
          i = 4;
       }else {
          i = 6;
       }
       t.c(this, new CommonDrawerEditText$b(p0, (int)f, i, (int)f1));
       return;
    }
    public final RectF getContentRect(){
       return this.h;
    }
    public final EditTagStickerElementData getEditTagStickerElementData(){
       return this.i;
    }
    public final InputFilter getFilter(){
       return EditTagStickerEditText$c.a;
    }
}
