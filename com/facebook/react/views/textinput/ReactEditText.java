package com.facebook.react.views.textinput.ReactEditText;
import android.widget.EditText;
import android.text.method.QwertyKeyListener;
import android.content.Context;
import bg.d;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import od.a;
import android.view.inputmethod.InputMethodManager;
import com.facebook.react.views.textinput.ReactEditText$b;
import yf.s;
import android.os.Build$VERSION;
import android.graphics.Paint;
import com.facebook.react.views.textinput.ReactEditText$a;
import a2.a;
import a2.i0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import android.text.TextWatcher;
import java.util.ArrayList;
import com.facebook.react.views.textinput.ReactEditText$c;
import android.widget.TextView;
import android.os.IBinder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.text.SpannableStringBuilder;
import android.text.Editable;
import yf.k;
import java.lang.Integer;
import yf.n;
import android.text.Spannable;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.JavaOnlyMap;
import ag.a;
import com.facebook.react.bridge.ReactContext;
import ag.j;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import yf.t;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ag.c;
import android.graphics.Rect;
import ag.n;
import android.view.KeyEvent;
import ag.m;
import android.view.MotionEvent;
import android.view.ViewParent;
import yf.p;
import android.graphics.Typeface;
import android.text.method.KeyListener;

public class ReactEditText extends EditText	// class@001426
{
    public d A;
    public JavaOnlyMap B;
    public m0 C;
    public boolean D;
    public boolean E;
    public final InputMethodManager b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ArrayList i;
    public ReactEditText$c j;
    public int k;
    public boolean l;
    public Boolean m;
    public boolean n;
    public String o;
    public n p;
    public a q;
    public m r;
    public final ReactEditText$b s;
    public boolean t;
    public boolean u;
    public s v;
    public boolean w;
    public String x;
    public int y;
    public int z;
    public static final KeyListener F;

    static {
       ReactEditText.F = QwertyKeyListener.getInstanceForFullKeyboard();
    }
    public void ReactEditText(Context p0){
       super(p0);
       this.t = false;
       this.u = false;
       this.w = false;
       this.x = null;
       this.y = -1;
       this.z = -1;
       this.B = null;
       this.C = null;
       this.D = false;
       this.E = false;
       this.setFocusableInTouchMode(false);
       this.A = new d(this);
       Object systemServic = this.getContext().getSystemService("input_method");
       a.c(systemServic);
       this.b = systemServic;
       this.e = this.getGravity() & 0x800007;
       this.f = this.getGravity() & 0x70;
       this.g = 0;
       this.h = 0;
       this.c = false;
       this.d = false;
       this.m = null;
       this.n = false;
       this.i = null;
       this.j = null;
       this.k = this.getInputType();
       this.s = new ReactEditText$b();
       this.r = null;
       this.v = new s();
       this.a();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 26 && sDK_INT <= 27) {
          this.setLayerType(1, null);
       }
       i0.s0(this, new ReactEditText$a(this));
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ReactEditText.class, "54")) {
          return;
       }
       this.setTextSize(0, (float)this.v.c());
       float f = this.v.d();
       if (!Float.isNaN(f)) {
          this.setLetterSpacing(f);
       }
       return;
    }
    public void addTextChangedListener(TextWatcher p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactEditText.class, "8")) {
          return;
       }
       if (this.i == null) {
          this.i = new ArrayList();
          super.addTextChangedListener(this.getTextWatcherDelegator());
       }
       this.i.add(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ReactEditText.class, "29")) {
          return;
       }
       this.b.hideSoftInputFromWindow(this.getWindowToken(), 0);
       return;
    }
    public int c(){
       int i = this.g + 1;
       this.g = i;
       return i;
    }
    public void clearFocus(){
       if (PatchProxy.applyVoid(null, this, ReactEditText.class, "6")) {
          return;
       }
       this.setFocusableInTouchMode(false);
       super.clearFocus();
       this.b();
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, ReactEditText.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getInputType() & 0x20000)? true: false;
       return b;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, ReactEditText.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getInputType() & 0x0090)? true: false;
       return b;
    }
    public final void f(SpannableStringBuilder p0){
       Editable uEditable;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, ReactEditText.class, "26")) {
          return;
       }
       Object[] spans = this.getText().getSpans(0, this.length(), Object.class);
       int i = 0;
       while (i < spans.length) {
          if (spans[i] instanceof k) {
             this.getText().removeSpan(spans[i]);
          }
          int i1 = 33;
          boolean i2 = this.getText().getSpanFlags(spans[i]) & i1;
          if (i2 == i1) {
             object oobject = spans[i];
             int spanStart = this.getText().getSpanStart(spans[i]);
             int spanEnd = this.getText().getSpanEnd(spans[i]);
             int spanFlags = this.getText().getSpanFlags(spans[i]);
             this.getText().removeSpan(spans[i]);
             Editable text = this.getText();
             if (PatchProxy.isSupport(ReactEditText.class)) {
                uEditable = text;
                Object obj1 = PatchProxy.applyFourRefs(text, p0, Integer.valueOf(spanStart), Integer.valueOf(spanEnd), null, ReactEditText.class, "27");
                if (obj1 != PatchProxyResult.class) {
                   i2 = obj1.booleanValue();
                }else if(spanStart > p0.length() || spanEnd > p0.length()){
                   i2 = spanStart;
                   while (true) {
                      if (i2 < spanEnd) {
                         if (uEditable.charAt(i2) == obj.charAt(i2)) {
                            i2 = i2 + 1;
                         }
                      }else {
                         i2 = true;
                      }
                   }
                }
                i2 = false;
             }else {
                uEditable = text;
                goto label_009a ;
             }
             if (i2) {
                obj.setSpan(oobject, spanStart, spanEnd, spanFlags);
             }
          }
          i = i + 1;
          uEditable = null;
       }
       return;
    }
    public void g(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactEditText.class, "25")) {
          return;
       }
       if (this.e() && TextUtils.equals(this.getText(), p0.j())) {
          return;
       }
       int i = p0.b();
       this.h = i;
       if (i < this.g) {
          return;
       }
       n m = p0.m;
       if (m != null) {
          this.B = JavaOnlyMap.deepClone(m);
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(p0.j());
       this.f(spannableStr);
       this.l = p0.a();
       this.D = true;
       if (!p0.j().length()) {
          this.setText(null);
       }else {
          this.getText().replace(false, this.length(), spannableStr);
       }
       this.D = false;
       if (Build$VERSION.SDK_INT >= 23 && this.getBreakStrategy() != p0.l()) {
          this.setBreakStrategy(p0.l());
       }
       return;
    }
    public boolean getBlurOnSubmit(){
       ReactEditText obj = PatchProxy.apply(null, this, ReactEditText.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.m;
       if (obj == null) {
          return (this.d() ^ 0x01);
       }
       return obj.booleanValue();
    }
    public boolean getDisableFullscreenUI(){
       return this.n;
    }
    public String getReturnKeyType(){
       return this.o;
    }
    public int getStagedInputType(){
       return this.k;
    }
    public final ReactEditText$c getTextWatcherDelegator(){
       Object obj = PatchProxy.apply(null, this, ReactEditText.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.j == null) {
          this.j = new ReactEditText$c(this);
       }
       return this.j;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReactEditText.class, "33")) {
          return;
       }
       ReactEditText tq = this.q;
       if (tq != null) {
          tq.a();
       }
       if (!PatchProxy.applyVoid(objArray, this, ReactEditText.class, "34") && this.C == null) {
          this.getContext().getNativeModule(UIManagerModule.class).setViewLocalData(this.getId(), new j(this));
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, ReactEditText.class, "37")) {
          return;
       }
       ReactEditText to = this.o;
       int i = 5;
       if (to != null) {
          Objects.requireNonNull(to);
          int i1 = -1;
          switch (to.hashCode()){
              case 0xb413baf7:
                if (to.equals("previous")) {
                   i1 = 0;
                }
                break;
              case 0xc9fa65a8:
                if (to.equals("search")) {
                   i1 = 1;
                }
                break;
              case 3304:
                if (to.equals("go")) {
                   i1 = 2;
                }
                break;
              case 0x2f2382:
                if (to.equals("done")) {
                   i1 = 3;
                }
                break;
              case 0x338af3:
                if (to.equals("next")) {
                   i1 = 4;
                }
                break;
              case 0x33af38:
                if (to.equals("none")) {
                   i1 = 5;
                }
                break;
              case 0x35cf88:
                if (to.equals("send")) {
                   i1 = 6;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
                i = 7;
                break;
              case 1:
                i = 3;
                break;
              case 2:
                i = 2;
                break;
              case 3:
             label_007c :
                i = 6;
                break;
              case 4:
                break;
              case 5:
                i = 1;
                break;
              case 6:
                i = 4;
                break;
              default:
                goto label_007c ;
          }
       }else {
          goto label_007c ;
       }
       if (this.n != null) {
          this.setImeOptions((0x2000000 | i));
       }else {
          this.setImeOptions(i);
       }
       return;
    }
    public void invalidateDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactEditText.class, "39")) {
          return;
       }
       if (this.l != null) {
          Editable text = this.getText();
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
    public boolean isLayoutRequested(){
       return false;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ReactEditText.class, "42")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.l != null) {
          Editable text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].d();
          }
       }
       return;
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       ReactContext obj = PatchProxy.applyOneRefs(p0, this, ReactEditText.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getContext();
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       if (inputConnect != null && this.u != null) {
          inputConnect = new c(inputConnect, obj, this);
       }
       if (this.d() && this.getBlurOnSubmit()) {
          p0.imeOptions = p0.imeOptions & -1073741825;
       }
       return inputConnect;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ReactEditText.class, "40")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.l != null) {
          Editable text = this.getText();
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
       if (PatchProxy.applyVoid(null, this, ReactEditText.class, "43")) {
          return;
       }
       super.onFinishTemporaryDetach();
       if (this.l != null) {
          Editable text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].f();
          }
       }
       return;
    }
    public void onFocusChanged(boolean p0,int p1,Rect p2){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, ReactEditText.class, "12")) {
          return;
       }
       super.onFocusChanged(p0, p1, p2);
       if (p0) {
          ReactEditText tp = this.p;
          if (tp != null) {
             tp.a(this.getSelectionStart(), this.getSelectionEnd());
          }
       }
       return;
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       if (PatchProxy.isSupport(ReactEditText.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ReactEditText.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 66 && !this.d()) {
          this.b();
          return true;
       }else {
          return super.onKeyUp(p0, p1);
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ReactEditText.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ReactEditText.class, "1")) {
             return;
          }
       }
       this.h();
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactEditText.class, "4")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       ReactEditText tr = this.r;
       if (tr != null) {
          tr.onScrollChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void onSelectionChanged(int p0,int p1){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactEditText.class, "11")) {
          return;
       }
       super.onSelectionChanged(p0, p1);
       if (this.p != null && this.hasFocus()) {
          this.p.a(p0, p1);
       }
       return;
    }
    public void onStartTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, ReactEditText.class, "41")) {
          return;
       }
       super.onStartTemporaryDetach();
       if (this.l != null) {
          Editable text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].g();
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactEditText.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action == 2 && this.t != null) {
             action = -1;
             if (!this.canScrollVertically(action) && (!this.canScrollVertically(1) && (!this.canScrollHorizontally(action) && !this.canScrollHorizontally(1)))) {
                this.getParent().requestDisallowInterceptTouchEvent(false);
             }
          label_0043 :
             this.t = false;
          }
       }else {
          this.t = true;
          this.getParent().requestDisallowInterceptTouchEvent(1);
       }
       return super.onTouchEvent(p0);
    }
    public void removeTextChangedListener(TextWatcher p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactEditText.class, "9")) {
          return;
       }
       ReactEditText ti = this.i;
       if (ti != null) {
          ti.remove(p0);
          if (this.i.isEmpty()) {
             this.i = null;
             super.removeTextChangedListener(this.getTextWatcherDelegator());
          }
       }
       return;
    }
    public boolean requestFocus(int p0,Rect p1){
       if (PatchProxy.isSupport(ReactEditText.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ReactEditText.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (this.isFocused()) {
          return b;
       }else if(this.d == null){
          return false;
       }else {
          this.setFocusableInTouchMode(b);
          boolean b1 = super.requestFocus(p0, p1);
          if (this.getShowSoftInputOnFocus()) {
             p1 = PatchProxy.apply(null, this, ReactEditText.class, "28");
             if (p1 != PatchProxyResult.class) {
                p1.booleanValue();
             }else {
                this.b.showSoftInput(this, false);
             }
          }
          return b1;
       }
    }
    public void setAllowFontScaling(boolean p0){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactEditText.class, "51")) {
          return;
       }
       if (this.v.b() != p0) {
          this.v.j(p0);
          this.a();
       }
       return;
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactEditText.class, "44")) {
          return;
       }
       this.A.b(p0);
       return;
    }
    public void setBlurOnSubmit(Boolean p0){
       this.m = p0;
    }
    public void setBorderRadius(float p0){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactEditText.class, "47")) {
          return;
       }
       this.A.d(p0);
       return;
    }
    public void setBorderStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactEditText.class, "49")) {
          return;
       }
       this.A.f(p0);
       return;
    }
    public void setContentSizeWatcher(a p0){
       this.q = p0;
    }
    public void setDisableFullscreenUI(boolean p0){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactEditText.class, "14")) {
          return;
       }
       this.n = p0;
       this.i();
       return;
    }
    public void setFontFamily(String p0){
       this.x = p0;
       this.w = true;
    }
    public void setFontSize(float p0){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactEditText.class, "52")) {
          return;
       }
       this.v.k(p0);
       this.a();
       return;
    }
    public void setFontStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactEditText.class, "19")) {
          return;
       }
       int i = p.c(p0);
       if (i != this.z) {
          this.z = i;
          this.w = true;
       }
       return;
    }
    public void setFontWeight(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactEditText.class, "18")) {
          return;
       }
       int i = p.e(p0);
       if (i != this.y) {
          this.y = i;
          this.w = true;
       }
       return;
    }
    public void setGravityHorizontal(int p0){
       ReactEditText te;
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactEditText.class, "35")) {
          return;
       }
       if (!p0) {
          te = this.e;
       }
       this.setGravity((te | ((this.getGravity() & 0xf8) & -8388616)));
       return;
    }
    public void setGravityVertical(int p0){
       ReactEditText tf;
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactEditText.class, "36")) {
          return;
       }
       if (!p0) {
          tf = this.f;
       }
       this.setGravity((tf | (this.getGravity() & 0x8f)));
       return;
    }
    public void setInputType(int p0){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactEditText.class, "17")) {
          return;
       }
       super.setInputType(p0);
       this.k = p0;
       super.setTypeface(super.getTypeface());
       if (this.d()) {
          this.setSingleLine(false);
       }
       ReactEditText ts = this.s;
       ts.a = p0;
       this.setKeyListener(ts);
       return;
    }
    public void setLetterSpacingPt(float p0){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactEditText.class, "50")) {
          return;
       }
       this.v.l(p0);
       this.a();
       return;
    }
    public void setMaxFontSizeMultiplier(float p0){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactEditText.class, "53")) {
          return;
       }
       if (p0 - this.v.h()) {
          this.v.m(p0);
          this.a();
       }
       return;
    }
    public void setMostRecentEventCount(int p0){
       this.h = p0;
    }
    public void setOnKeyPress(boolean p0){
       this.u = p0;
    }
    public void setReturnKeyType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactEditText.class, "15")) {
          return;
       }
       this.o = p0;
       this.i();
       return;
    }
    public void setScrollWatcher(m p0){
       this.r = p0;
    }
    public void setSelection(int p0,int p1){
       if (PatchProxy.isSupport(ReactEditText.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactEditText.class, "10")) {
          return;
       }
       if (this.h < this.g) {
          return;
       }
       super.setSelection(p0, p1);
       return;
    }
    public void setSelectionWatcher(n p0){
       this.p = p0;
    }
    public void setStagedInputType(int p0){
       this.k = p0;
    }
    public boolean verifyDrawable(Drawable p0){
       Editable obj = PatchProxy.applyOneRefs(p0, this, ReactEditText.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.l != null) {
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
