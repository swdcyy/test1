package com.yxcorp.gifshow.v3.editor.text.widget.CommonDrawerEditText;
import androidx.appcompat.widget.AppCompatEditText;
import android.content.Context;
import juc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.graphics.Paint;
import huc.t;
import android.widget.EditText;
import com.yxcorp.gifshow.v3.editor.text.widget.CommonDrawerEditText$a;
import android.view.ActionMode$Callback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.text.TextPaint;
import android.graphics.Typeface;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvc.a;
import android.text.TextWatcher;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.text.widget.CommonDrawerEditText$b;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import bvc.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.Exception;

public class CommonDrawerEditText extends AppCompatEditText	// class@00150c
{
    public boolean e;
    public String f;
    public final List g;
    public final Paint h;
    public final b i;
    public HashMap j;

    public void CommonDrawerEditText(Context p0,b p1){
       a.p(p0, "context");
       a.p(p1, "textDrawer");
       super(p0);
       this.i = p1;
       this.f = "";
       this.g = new ArrayList();
       int i = 1;
       Paint paint = new Paint(i);
       this.h = paint;
       if (t.a()) {
          this.setLongClickable(false);
          this.setTextIsSelectable(false);
          this.setCustomSelectionActionModeCallback(new CommonDrawerEditText$a());
       }
       if (!PatchProxy.applyVoid(null, this, CommonDrawerEditText.class, "1")) {
          f.e();
          this.setIncludeFontPadding(false);
          this.setBackgroundColor(false);
          TextDrawConfigParam textDrawConf = p1.r();
          InputFilter$LengthFilter[] lengthFilter = new InputFilter$LengthFilter[i];
          lengthFilter[0] = new InputFilter$LengthFilter(textDrawConf.k);
          this.setFilters(lengthFilter);
          int i1 = textDrawConf.q();
          if (i1 == i) {
             this.setGravity(i);
          }else if(i1 == 2){
             this.setGravity(5);
          }else {
             this.setGravity(3);
          }
          this.setTextColor(textDrawConf.t());
          TextPaint paint1 = this.getPaint();
          a.o(paint1, "paint");
          paint1.setColor(textDrawConf.t());
          if (textDrawConf.w == null) {
             this.setHintTextColor(textDrawConf.v);
          }
          if (textDrawConf.h() > 0) {
             this.setTextSize(false, (float)textDrawConf.h());
          }
          a.o(textDrawConf, "drawConfigParam");
          this.b(textDrawConf);
          this.setTypeface(p1.c);
          p1.f = this.getPaint();
          if (!TextUtils.x(textDrawConf.g())) {
             this.setHint(textDrawConf.g());
          }
          this.a();
          if (!PatchProxy.applyVoid(null, this, CommonDrawerEditText.class, "10")) {
             this.addTextChangedListener(new a(this));
          }
       }
       paint.setTypeface(Typeface.DEFAULT);
       return;
    }
    public final void a(){
       int i;
       if (PatchProxy.applyVoid(null, this, CommonDrawerEditText.class, "6")) {
          return;
       }
       this.h.setTextSize(this.getTextSize());
       float f = this.getPaint().descent() - this.getPaint().ascent();
       float f1 = Math.max((this.h.ascent() - this.getPaint().ascent()), 0);
       if (this.getTextSize() - (float)40 < 0) {
          i = 2;
       }else if(this.getTextSize() - (float)60 < 0){
          i = 4;
       }else {
          i = 6;
       }
       t.c(this, new CommonDrawerEditText$b(this.getCursorColor(), (int)f, i, (int)f1));
       return;
    }
    public final void b(TextDrawConfigParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonDrawerEditText.class, "2")) {
          return;
       }
       a.p(p0, "drawConfigParam");
       Rect rect = p0.w();
       if (a.a) {
          Rect left = rect.left;
          Rect top = rect.top;
          Rect right = rect.right;
          rect = rect.bottom;
          if (!PatchProxy.isSupport(CommonDrawerEditText.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(rect), this, CommonDrawerEditText.class, "3")) {
             int i = this.i.r().q();
             int b = a.b;
             if (i != 1) {
                if (i != 2) {
                   this.setPadding(left, top, Math.max((right - b), 0), rect);
                }else {
                   this.setPadding(Math.max((left - b), 0), top, right, rect);
                }
             }else {
                b = b / 2;
                this.setPadding((left - b), top, (right - b), rect);
             }
          }
       }else {
          this.setPadding(rect.left, rect.top, rect.right, rect.bottom);
       }
       return;
    }
    public int getCursorColor(){
       Object obj = PatchProxy.apply(null, this, CommonDrawerEditText.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.r().y;
    }
    public final boolean getSelfDrawBackground(){
       return this.e;
    }
    public final b getTextDrawer(){
       return this.i;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Field obj = PatchProxy.applyOneRefs(p0, this, CommonDrawerEditText.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       if (p0.getAction() || (t.a() && !PatchProxy.applyVoid(null, this, CommonDrawerEditText.class, "5"))) {
          try{
             obj = TextView.class.getDeclaredField("mEditor");
             a.o(obj, "TextView::class.java.getDeclaredField\(\"mEditor\"\)");
             obj.setAccessible(true);
             Object obj1 = obj.get(this);
             a.o(obj1, "editorField.get\(this\)");
             Class uClass = Class.forName("android.widget.Editor");
             Field declaredFiel = uClass.getDeclaredField("mInsertionControllerEnabled");
             a.o(declaredFiel, "editorClass.getDeclaredF¡­ertionControllerEnabled\"\)");
             declaredFiel.setAccessible(true);
             Boolean fALSE = Boolean.FALSE;
             declaredFiel.set(obj1, fALSE);
             Field declaredFiel1 = uClass.getDeclaredField("mSelectionControllerEnabled");
             a.o(declaredFiel1, "editorClass.getDeclaredF¡­ectionControllerEnabled\"\)");
             declaredFiel1.setAccessible(true);
             declaredFiel1.set(obj1, fALSE);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public final void setSelfDrawBackground(boolean p0){
       this.e = p0;
    }
}
