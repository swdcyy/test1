package com.tachikoma.core.component.input.TKInput;
import com.tachikoma.core.component.e;
import gx4.f;
import com.tachikoma.core.component.input.TKInput$a;
import com.tachikoma.core.component.input.TKInput$b;
import com.tachikoma.core.component.input.TKInput$c;
import com.tachikoma.core.component.input.TKInput$d;
import com.tachikoma.core.component.input.a;
import android.view.View;
import android.widget.EditText;
import com.tachikoma.core.component.input.MenuOptionEditText;
import android.text.TextWatcher;
import android.view.View$OnKeyListener;
import android.view.View$OnFocusChangeListener;
import android.widget.TextView$OnEditorActionListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import com.tachikoma.core.component.input.MenuOptionEditText$a;
import android.content.ClipboardManager;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import android.content.ClipData;
import android.content.ClipData$Item;
import java.lang.CharSequence;
import java.util.Objects;
import android.text.Editable;
import com.tachikoma.core.component.input.TKInput$f;
import com.tachikoma.core.component.input.TKInput$g;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.tachikoma.core.component.input.TKInput$e;
import java.lang.Runnable;
import iq8.x;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import com.tachikoma.core.bridge.c;
import iq8.p;
import java.lang.Integer;
import android.text.TextUtils;
import android.widget.TextView;
import wo8.b;
import java.lang.Float;
import com.tkruntime.v8.V8Value;
import android.text.method.KeyListener;
import java.util.HashMap;
import java.lang.Number;
import android.os.Build$VERSION;

public class TKInput extends e	// class@000d78
{
    public ClipboardManager A;
    public ClipboardManager$OnPrimaryClipChangedListener B;
    public TextWatcher C;
    public View$OnKeyListener D;
    public View$OnFocusChangeListener E;
    public TextView$OnEditorActionListener F;
    public boolean autofocus;
    public boolean focused;
    public int mAutoResizeLines;
    public float mFontSize;
    public int mHeightLines;
    public float mHintFontSize;
    public float mInitialHeight;
    public int mInitialLines;
    public boolean mIsClickCopy;
    public boolean mIsClickCut;
    public boolean mIsClickPaste;
    public boolean mIsSetText;
    public String mOnEditorActionText;
    public final a mProperty;
    public int maxlength;
    public V8Function onFocus;
    public JsValueRef onFocusRef;
    public V8Function onblur;
    public JsValueRef onblurRef;
    public V8Function onchange;
    public JsValueRef onchangeRef;
    public V8Function oncopy;
    public JsValueRef oncopyRef;
    public V8Function oncut;
    public JsValueRef oncutRef;
    public V8Function onfocus;
    public JsValueRef onfocusRef;
    public V8Function oninput;
    public JsValueRef oninputRef;
    public V8Function onpaste;
    public JsValueRef onpasteRef;
    public String placeholder;
    public boolean readonly;
    public String returntype;
    public String text;
    public String types;
    public String v;
    public String value;
    public String w;
    public String x;
    public int y;
    public MenuOptionEditText$a z;

    public void TKInput(f p0){
       super(p0);
       this.mOnEditorActionText = "";
       this.mAutoResizeLines = 0;
       this.mInitialHeight = 0xbf800000;
       this.y = -1;
       this.mIsSetText = false;
       this.mFontSize = 0xbf800000;
       this.mHintFontSize = 0xbf800000;
       this.C = new TKInput$a(this);
       this.D = new TKInput$b(this);
       this.E = new TKInput$c(this);
       this.F = new TKInput$d(this);
       this.mProperty = new a(this.getView(), this.isSingleLine());
       this.getView().addTextChangedListener(this.C);
       this.getView().setOnKeyListener(this.D);
       this.getView().setOnFocusChangeListener(this.E);
       this.getView().setOnEditorActionListener(this.F);
    }
    public void blur(){
       if (PatchProxy.applyVoid(null, this, TKInput.class, "27")) {
          return;
       }
       this.setFocused(false);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, TKInput.class, "23")) {
          return;
       }
       this.mProperty.i("");
       return;
    }
    public void clearFocus(){
       if (PatchProxy.applyVoid(null, this, TKInput.class, "24")) {
          return;
       }
       this.mProperty.c(false);
       return;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public MenuOptionEditText createViewInstance(Context p0){
       MenuOptionEditText obj = PatchProxy.applyOneRefs(p0, this, TKInput.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MenuOptionEditText(p0);
       obj.setBackground(null);
       return obj;
    }
    public void destroyOnUIThread(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKInput.class, "4")) {
          return;
       }
       if (this.isTargetViewExist()) {
          this.getView().removeTextChangedListener(this.C);
          this.getView().setOnKeyListener(objArray);
          this.getView().setOnEditorActionListener(objArray);
          if (this.z != null) {
             this.getView().setMenuOptionListener(objArray);
          }
       }
       TKInput tA = this.A;
       if (tA != null) {
          TKInput tB = this.B;
          if (tB != null) {
             ClipboardInterceptor.removePrimaryClipChangedListener(tA, tB);
          }
       }
       return;
    }
    public void focus(){
       if (PatchProxy.applyVoid(null, this, TKInput.class, "26")) {
          return;
       }
       this.setFocused(true);
       return;
    }
    public String getClipboardContent(){
       Object obj = PatchProxy.apply(null, this, TKInput.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (ClipboardInterceptor.getPrimaryClip(this.A) != null && (ClipboardInterceptor.getPrimaryClip(this.A).getItemCount() > 0 && (ClipboardInterceptor.getPrimaryClip(this.A).getItemAt(0) != null && ClipboardInterceptor.getPrimaryClip(this.A).getItemAt(0).getText() != null))) {
          return ClipboardInterceptor.getPrimaryClip(this.A).getItemAt(0).getText().toString();
       }
       return "";
    }
    public String getText(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       TKInput obj = PatchProxy.apply(objArray, this, TKInput.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mProperty;
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(objArray, obj, a.class, "2");
       if (str != patchProxyRe) {
       }else {
          str = obj.a.getText().toString();
       }
       return str;
    }
    public boolean isSingleLine(){
       return true;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, TKInput.class, "44")) {
          return;
       }
       if (this.z == null) {
          this.z = new TKInput$f(this);
          this.getView().setMenuOptionListener(this.z);
       }
       if (this.B == null) {
          this.B = new TKInput$g(this);
          ClipboardManager systemServic = this.getContext().getSystemService("clipboard");
          this.A = systemServic;
          ClipboardInterceptor.addPrimaryClipChangedListener(systemServic, this.B);
       }
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKInput tKInput = TKInput.class;
       if (PatchProxy.isSupport(tKInput) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKInput, "3")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKInput$e(this));
       }
       return;
    }
    public void onRefCall(JsValueRef p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "40")) {
          return;
       }
       if (p0 != null && y.a(p0.get())) {
          Object[] objArray = new Object[0];
          p0.get().call(null, objArray);
       }
    label_002f :
       return;
    }
    public void onRefCallWithArgs(JsValueRef p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKInput.class, "41")) {
          return;
       }
       if (p0 != null && y.a(p0.get())) {
          Object[] objArray = new Object[]{p1};
          p0.get().call(null, objArray);
       }
    label_0032 :
       return;
    }
    public void setAutoFocus(boolean p0){
       TKInput tKInput = TKInput.class;
       if (PatchProxy.isSupport(tKInput) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKInput, "1")) {
          return;
       }
       this.autofocus = p0;
       this.setFocused(p0);
       return;
    }
    public void setAutoResizeLines(int p0){
       this.mAutoResizeLines = p0;
       TKInput ty = this.y;
       if (ty > null && p0 > ty) {
          this.mAutoResizeLines = ty;
       }
       return;
    }
    public void setColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "12")) {
          return;
       }
       Integer integer = Integer.valueOf(p.c(p0, this.getJSContext()));
       if (integer == null) {
          return;
       }
       TKInput tmProperty = this.mProperty;
       int i = integer.intValue();
       Objects.requireNonNull(tmProperty);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tmProperty, uoa, "6")) {
          tmProperty.a.setTextColor(i);
       }
       return;
    }
    public void setCursorColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "14")) {
          return;
       }
       Integer integer = Integer.valueOf(p.c(p0, this.getJSContext()));
       if (integer == null) {
          return;
       }
       this.mProperty.b(integer.intValue());
       return;
    }
    public void setFocused(boolean p0){
       TKInput tKInput = TKInput.class;
       if (PatchProxy.isSupport(tKInput) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKInput, "10")) {
          return;
       }
       this.focused = p0;
       if (this.getView().isFocused() && p0) {
          return;
       }
       this.mProperty.c(this.focused);
       return;
    }
    public void setFontFamily(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "16")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !p0.equals(this.v)) {
          this.v = p0;
          b.a(this.getView(), p0, this.w, this.x, this.getRootDir());
       }
       return;
    }
    public void setFontSize(float p0){
       TKInput tKInput = TKInput.class;
       if (PatchProxy.isSupport(tKInput) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKInput, "19")) {
          return;
       }
       if (!this.mFontSize - p0) {
          return;
       }
       this.mFontSize = p0;
       if (!TextUtils.isEmpty(this.getText())) {
          this.getView().setTextSize(1, p0);
       }
       return;
    }
    public void setFontStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "18")) {
          return;
       }
       TKInput tx = this.x;
       if (tx != null && tx.equals(p0)) {
          return;
       }
       this.x = p0;
       b.a(this.getView(), this.v, this.w, p0, this.getRootDir());
       return;
    }
    public void setFontWeight(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "17")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !p0.equals(this.w)) {
          this.w = p0;
          b.a(this.getView(), this.v, p0, this.x, this.getRootDir());
       }
       return;
    }
    public void setInitialLines(int p0){
       TKInput tKInput = TKInput.class;
       if (PatchProxy.isSupport(tKInput) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKInput, "42")) {
          return;
       }
       this.mInitialLines = p0;
       this.mProperty.e(p0);
       this.mProperty.g(p0);
       return;
    }
    public void setMaxLength(int p0){
       TKInput tKInput = TKInput.class;
       if (PatchProxy.isSupport(tKInput) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKInput, "21")) {
          return;
       }
       this.mProperty.f(p0);
       return;
    }
    public void setMaxLines(int p0){
       this.y = p0;
       if (p0 > 0 && this.mAutoResizeLines > p0) {
          this.mAutoResizeLines = p0;
       }
       return;
    }
    public void setOnFocus(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "25")) {
          return;
       }
       y.c(this.onFocusRef);
       this.onFocus = p0;
       this.onFocusRef = y.b(p0, this);
       return;
    }
    public void setPlaceholder(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "9")) {
          return;
       }
       this.placeholder = p0;
       TKInput tmProperty = this.mProperty;
       Objects.requireNonNull(tmProperty);
       if (!PatchProxy.applyVoidOneRefs(p0, tmProperty, a.class, "3")) {
          tmProperty.a.setHint(p0);
       }
       return;
    }
    public void setPlaceholderColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "13")) {
          return;
       }
       Integer integer = Integer.valueOf(p.c(p0, this.getJSContext()));
       if (integer == null) {
          return;
       }
       TKInput tmProperty = this.mProperty;
       int i = integer.intValue();
       Objects.requireNonNull(tmProperty);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tmProperty, uoa, "7")) {
          tmProperty.a.setHintTextColor(i);
       }
       return;
    }
    public void setPlaceholderFontSize(float p0){
       TKInput tKInput = TKInput.class;
       if (PatchProxy.isSupport(tKInput) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKInput, "20")) {
          return;
       }
       this.mHintFontSize = p0;
       if (TextUtils.isEmpty(this.getText())) {
          this.getView().setTextSize(1, p0);
       }
       return;
    }
    public void setReadOnly(boolean p0){
       TKInput tKInput = TKInput.class;
       if (PatchProxy.isSupport(tKInput) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKInput, "29")) {
          return;
       }
       this.readonly = p0;
       if (p0) {
          this.getView().removeTextChangedListener(this.C);
          this.getView().setOnKeyListener(null);
          this.getView().setOnFocusChangeListener(null);
          this.getView().setOnEditorActionListener(null);
          this.mProperty.d(null);
          this.getView().setTextIsSelectable(true);
       }else {
          this.getView().addTextChangedListener(this.C);
          this.getView().setOnKeyListener(this.D);
          this.getView().setOnFocusChangeListener(this.E);
          this.getView().setOnEditorActionListener(this.F);
          TKInput tmProperty = this.mProperty;
          tmProperty.d(tmProperty.e);
       }
       return;
    }
    public void setReturnKeyType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "22")) {
          return;
       }
       this.mProperty.h(p0);
       return;
    }
    public void setStyle(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "2")) {
          return;
       }
       this.takeControlOfPaddingSet(p0);
       super.setStyle(p0);
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "8")) {
          return;
       }
       this.text = p0;
       this.mIsSetText = true;
       this.mProperty.i(p0);
       return;
    }
    public void setTextAlign(String p0){
       a a;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "15")) {
          return;
       }
       TKInput tmProperty = this.mProperty;
       Objects.requireNonNull(tmProperty);
       a uoa = a.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tmProperty, uoa, "9")) {
          a = tmProperty.a;
          Object obj = PatchProxy.applyOneRefs(p0, tmProperty, uoa, "10");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             Objects.requireNonNull(p0);
             if (!p0.equals("center")) {
                if (!p0.equals("right")) {
                   i = (tmProperty.b != null)? 19: 3;
                }else if(tmProperty.b != null){
                   i = 21;
                }else {
                   i = 5;
                }
             }else if(tmProperty.b != null){
                i = 17;
             }else {
                i = 1;
             }
          }
          a.setGravity(i);
       }
       return;
    }
    public void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "11")) {
          return;
       }
       this.mProperty.j(p0);
       return;
    }
    public void setTypes(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "30")) {
          return;
       }
       this.types = p0;
       this.mProperty.j(p0);
       return;
    }
    public void setValue(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "28")) {
          return;
       }
       this.value = p0;
       this.mIsSetText = true;
       this.mProperty.i(p0);
       return;
    }
    public void setmaxlength(int p0){
       TKInput tKInput = TKInput.class;
       if (PatchProxy.isSupport(tKInput) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKInput, "31")) {
          return;
       }
       this.maxlength = p0;
       this.mProperty.f(p0);
       return;
    }
    public void setonblur(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "34")) {
          return;
       }
       y.c(this.onblurRef);
       this.onblurRef = y.b(p0, this);
       this.onblur = p0;
       return;
    }
    public void setonchange(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "36")) {
          return;
       }
       y.c(this.onchangeRef);
       this.onchangeRef = y.b(p0, this);
       this.onchange = p0;
       return;
    }
    public void setoncopy(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "37")) {
          return;
       }
       this.m();
       y.c(this.oncopyRef);
       this.oncopyRef = y.b(p0, this);
       this.oncopy = p0;
       return;
    }
    public void setoncut(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "38")) {
          return;
       }
       this.m();
       y.c(this.oncutRef);
       this.oncutRef = y.b(p0, this);
       this.oncut = p0;
       return;
    }
    public void setonfocus(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "33")) {
          return;
       }
       y.c(this.onfocusRef);
       this.onfocusRef = y.b(p0, this);
       this.onfocus = p0;
       return;
    }
    public void setoninput(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "35")) {
          return;
       }
       y.c(this.oninputRef);
       this.oninputRef = y.b(p0, this);
       this.oninput = p0;
       return;
    }
    public void setonpaste(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "39")) {
          return;
       }
       this.m();
       y.c(this.onpasteRef);
       this.onpasteRef = y.b(p0, this);
       this.onpaste = p0;
       return;
    }
    public void setreturntype(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput.class, "32")) {
          return;
       }
       this.returntype = p0;
       this.mProperty.h(p0);
       return;
    }
    public boolean supportAsyncPrepareView(){
       boolean sDK_INT = Build$VERSION.SDK_INT;
       sDK_INT = (sDK_INT != 27 && (sDK_INT != 30 && sDK_INT != 25))? true: false;
       return sDK_INT;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKInput.class, "5")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.onFocusRef);
       y.c(this.onfocusRef);
       y.c(this.onblurRef);
       y.c(this.oninputRef);
       y.c(this.onchangeRef);
       y.c(this.oncopyRef);
       y.c(this.oncutRef);
       y.c(this.onpasteRef);
       return;
    }
}
