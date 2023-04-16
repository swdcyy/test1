package com.tachikoma.core.component.input.a;
import android.text.InputFilter;
import android.widget.EditText;
import java.lang.Object;
import com.tachikoma.core.component.input.a$a;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import java.lang.Integer;
import android.widget.TextView;
import java.lang.reflect.Field;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.graphics.PorterDuff$Mode;
import java.lang.Boolean;
import android.view.inputmethod.InputMethodManager;
import ap8.a;
import java.lang.Runnable;
import ap8.b;
import java.util.LinkedList;
import android.text.InputFilter$LengthFilter;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.Editable;

public class a	// class@000d7b
{
    public final EditText a;
    public boolean b;
    public a$a c;
    public int d;
    public KeyListener e;
    public static final InputFilter[] f;

    static {
       InputFilter[] inputFilterA = new InputFilter[0];
       a.f = inputFilterA;
    }
    public void a(EditText p0,boolean p1){
       super();
       this.c = new a$a(this, 0);
       this.d = p0.getInputType();
       this.b = p1;
       this.a = p0;
       p0.setPadding(0, 0, 0, 0);
       p0.setInputType((this.d & 0xfe));
       if (p1) {
          p0.setMaxLines(1);
       }else {
          p0.setSingleLine(0);
       }
       if (this.b == null) {
          p0.addTextChangedListener(this.c);
       }
       this.e = p0.getKeyListener();
       return;
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       if (p0.getParent() instanceof ViewGroup) {
          ViewGroup parent = p0.getParent();
          if (Build$VERSION.SDK_INT >= 26) {
             parent.setDefaultFocusHighlightEnabled(false);
          }
          parent.setFocusable(true);
          parent.setFocusableInTouchMode(true);
          parent.requestFocus();
       }
       return;
    }
    public void b(int p0){
       String str = "mEditor";
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       try{
          Field declaredFiel = TextView.class.getDeclaredField("mCursorDrawableRes");
          declaredFiel.setAccessible(true);
          int intx = declaredFiel.getInt(this.a);
          if (!intx) {
             return;
          }
          Drawable drawable = ContextCompat.getDrawable(this.a.getContext(), intx);
          drawable.setColorFilter(p0, PorterDuff$Mode.SRC_IN);
          Drawable[] uDrawableArr = new Drawable[]{drawable,drawable};
          Field declaredFiel1 = TextView.class.getDeclaredField(str);
          declaredFiel1.setAccessible(true);
          Object obj = declaredFiel1.get(this.a);
          Field declaredFiel2 = TextView.class.getDeclaredField(str);
          declaredFiel2.setAccessible(true);
          Class type = declaredFiel2.getType();
          if (Build$VERSION.SDK_INT >= 28) {
             Field declaredFiel3 = type.getDeclaredField("mDrawableForCursor");
             declaredFiel3.setAccessible(true);
             declaredFiel3.set(obj, drawable);
          }else {
             declaredFiel2 = type.getDeclaredField("mCursorDrawable");
             declaredFiel2.setAccessible(true);
             declaredFiel2.set(obj, uDrawableArr);
          }
          return;
       }catch(java.lang.NoSuchFieldException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
    }
    public void c(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "15")) {
          return;
       }
       InputMethodManager systemServic = this.a.getContext().getSystemService("input_method");
       if (p0) {
          this.a.post(new a(this, systemServic));
       }else {
          this.a.post(new b(this, systemServic));
       }
       return;
    }
    public void d(KeyListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       this.a.setKeyListener(p0);
       return;
    }
    public void e(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "18")) {
          return;
       }
       this.a.setLines(p0);
       return;
    }
    public void f(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "11")) {
          return;
       }
       InputFilter[] filters = this.a.getFilters();
       InputFilter[] f = a.f;
       int i = 0;
       if (!p0) {
          if (filters.length > 0) {
             LinkedList linkedList = new LinkedList();
             while (i < filters.length) {
                if (!filters[i] instanceof InputFilter$LengthFilter) {
                   linkedList.add(filters[i]);
                }
                i = i + 1;
             }
             if (!linkedList.isEmpty()) {
                filters = new InputFilter[linkedList.size()];
                f = linkedList.toArray(filters);
             }
          }
       }else {
          int i1 = 1;
          if (filters.length > 0) {
             int i2 = 0;
             InputFilter$LengthFilter lengthFilter = null;
             while (i2 < filters.length) {
                if (filters[i2] instanceof InputFilter$LengthFilter) {
                   filters[i2] = new InputFilter$LengthFilter(p0);
                   lengthFilter = 1;
                }
                i2 = i2 + 1;
             }
             if (lengthFilter == null) {
                f = new InputFilter[(filters.length + i1)];
                System.arraycopy(filters, i, f, i, filters.length);
                filters[filters.length] = new InputFilter$LengthFilter(p0);
                filters = f;
             }
             f = filters;
          }else {
             f = new InputFilter[i1];
             f[i] = new InputFilter$LengthFilter(p0);
          }
       }
       this.a.setFilters(f);
       return;
    }
    public void g(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "19")) {
          return;
       }
       this.a.setMinLines(p0);
       return;
    }
    public void h(String p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "13")) {
          return;
       }
       a ta = this.a;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "14");
       int i = 2;
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          Objects.requireNonNull(p0);
          int i1 = -1;
          switch (p0.hashCode()){
              case 0xc9fa65a8:
                if (p0.equals("search")) {
                   i1 = 0;
                }
                break;
              case 3304:
                if (p0.equals("go")) {
                   i1 = 1;
                }
                break;
              case 0x338af3:
                if (p0.equals("next")) {
                   i1 = 2;
                }
                break;
              case 0x35cf88:
                if (p0.equals("send")) {
                   i1 = 3;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
                i = 3;
              case 1:
                break;
              case 2:
                i = 5;
                break;
              case 3:
                i = 4;
                break;
              default:
                i = 6;
          }
       }
       ta.setImeOptions(i);
       InputMethodManager systemServic = this.a.getContext().getSystemService("input_method");
       if (systemServic != null && systemServic.isActive()) {
          systemServic.restartInput(this.a);
       }
       return;
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.setText(p0);
       if (this.a.hasFocus()) {
          a ta = this.a;
          ta.setSelection(ta.getText().length());
       }
       return;
    }
    public void j(String p0){
       int i;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "4")) {
          return;
       }
       a ta = this.a;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "5");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          Objects.requireNonNull(p0);
          int i1 = -1;
          switch (p0.hashCode()){
              case 0xc258db49:
                if (p0.equals("number")) {
                   i1 = 0;
                }
                break;
              case 0x1c01b:
                if (p0.equals("tel")) {
                   i1 = 1;
                }
                break;
              case 0x5c24b9c:
                if (p0.equals("email")) {
                   i1 = 2;
                }
                break;
              case 0x4889ba9b:
                if (p0.equals("password")) {
                   i1 = 3;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
                i = this.d | 2;
                break;
              case 1:
                i = this.d | 3;
                break;
              case 2:
                i = this.d | 0x20;
                break;
              case 3:
                i = this.d | 0x0080;
                break;
              default:
                i = this.d;
          }
       }
       ta.setInputType(i);
       if (this.b == null) {
          this.a.setSingleLine(false);
       }
       return;
    }
}
