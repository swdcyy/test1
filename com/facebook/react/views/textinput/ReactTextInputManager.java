package com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.uimanager.BaseViewManager;
import android.text.InputFilter;
import java.lang.String;
import com.facebook.react.views.textinput.ReactEditText;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ze.n0;
import android.view.View;
import com.facebook.react.views.textinput.ReactTextInputManager$g;
import android.text.TextWatcher;
import com.facebook.react.views.textinput.ReactTextInputManager$b;
import android.view.View$OnFocusChangeListener;
import android.widget.EditText;
import com.facebook.react.views.textinput.ReactTextInputManager$c;
import android.widget.TextView$OnEditorActionListener;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import ze.x;
import android.content.Context;
import java.util.Map;
import vd.d;
import vd.d$b;
import com.facebook.react.views.scroll.ScrollEventType;
import yf.n;
import android.text.SpannableStringBuilder;
import com.facebook.react.views.text.TextTransform;
import java.lang.CharSequence;
import android.text.Spannable;
import java.lang.Number;
import java.util.Objects;
import android.graphics.Typeface;
import android.content.res.AssetManager;
import yf.p;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Boolean;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import android.os.Build$VERSION;
import java.lang.Float;
import bg.d;
import lg.d;
import ze.p;
import yf.d;
import android.content.res.ColorStateList;
import com.facebook.react.views.textinput.ReactTextInputManager$a;
import android.view.View$OnLongClickListener;
import android.graphics.drawable.Drawable;
import com.yxcorp.utility.RomUtils;
import android.widget.TextView;
import java.lang.reflect.Field;
import androidx.core.content.ContextCompat;
import android.graphics.PorterDuff$Mode;
import qf.c;
import java.util.LinkedList;
import android.text.InputFilter$LengthFilter;
import java.lang.System;
import com.facebook.react.views.textinput.ReactTextInputManager$d;
import ag.a;
import com.facebook.react.views.textinput.ReactTextInputManager$e;
import ag.m;
import com.facebook.react.views.textinput.ReactTextInputManager$f;
import ag.n;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import android.graphics.drawable.Drawable$ConstantState;
import java.lang.Throwable;
import cb.a;
import androidx.core.graphics.drawable.a;
import yf.t;
import ze.z;
import ze.m0;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableMap;
import yf.v;
import yf.r;

public class ReactTextInputManager extends BaseViewManager	// class@00142f
{
    public static final String[] DRAWABLE_FIELDS;
    public static final String[] DRAWABLE_RESOURCES;
    public static final InputFilter[] EMPTY_FILTERS;
    public static final int[] SPACING_TYPES;
    public static final String TAG;

    static {
       ReactTextInputManager.SPACING_TYPES = new int[5]{8,0,2,1,3};
       InputFilter[] inputFilterA = new InputFilter[0];
       ReactTextInputManager.EMPTY_FILTERS = inputFilterA;
       String[] stringArray = new String[]{"mCursorDrawable","mSelectHandleLeft","mSelectHandleRight","mSelectHandleCenter"};
       ReactTextInputManager.DRAWABLE_FIELDS = stringArray;
       stringArray = new String[]{"mCursorDrawableRes","mTextSelectHandleLeftRes","mTextSelectHandleRightRes","mTextSelectHandleRes"};
       ReactTextInputManager.DRAWABLE_RESOURCES = stringArray;
    }
    public void ReactTextInputManager(){
       super();
    }
    public static void checkPasswordType(ReactEditText p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactTextInputManager.class, "58")) {
          return;
       }
       if ((p0.getStagedInputType() & 0x3002) && (p0.getStagedInputType() & 128)) {
          ReactTextInputManager.updateStagedInputTypeFlag(p0, 128, 16);
       }
       return;
    }
    public static void updateStagedInputTypeFlag(ReactEditText p0,int p1,int p2){
       if (PatchProxy.isSupport(ReactTextInputManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, ReactTextInputManager.class, "59")) {
          return;
       }
       p0.setStagedInputType((((~ p1) & p0.getStagedInputType()) | p2));
       return;
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,ReactEditText p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "61")) {
          return;
       }
       p1.addTextChangedListener(new ReactTextInputManager$g(this, p0, p1));
       p1.setOnFocusChangeListener(new ReactTextInputManager$b(this, p0, p1));
       p1.setOnEditorActionListener(new ReactTextInputManager$c(this, p1, p0));
       return;
    }
    public LayoutShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ReactTextInputManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactTextInputShadowNode();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactEditText createViewInstance(n0 p0){
       ReactEditText obj = PatchProxy.applyOneRefs(p0, this, ReactTextInputManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ReactEditText(p0);
       obj.setInputType((obj.getInputType() & -131073));
       obj.setReturnKeyType("done");
       return obj;
    }
    public Map getCommandsMap(){
       Object obj = PatchProxy.apply(null, this, ReactTextInputManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.e("focusTextInput", Integer.valueOf(1), "blurTextInput", Integer.valueOf(2));
    }
    public Map getExportedCustomBubblingEventTypeConstants(){
       d$b obj = PatchProxy.apply(null, this, ReactTextInputManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       obj.b("topSubmitEditing", d.d("phasedRegistrationNames", d.e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture")));
       obj.b("topEndEditing", d.d("phasedRegistrationNames", d.e("bubbled", "onEndEditing", "captured", "onEndEditingCapture")));
       obj.b("topTextInput", d.d("phasedRegistrationNames", d.e("bubbled", "onTextInput", "captured", "onTextInputCapture")));
       obj.b("topFocus", d.d("phasedRegistrationNames", d.e("bubbled", "onFocus", "captured", "onFocusCapture")));
       obj.b("topBlur", d.d("phasedRegistrationNames", d.e("bubbled", "onBlur", "captured", "onBlurCapture")));
       obj.b("topKeyPress", d.d("phasedRegistrationNames", d.e("bubbled", "onKeyPress", "captured", "onKeyPressCapture")));
       return obj.a();
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       d$b obj = PatchProxy.apply(null, this, ReactTextInputManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       obj.b(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), d.d("registrationName", "onScroll"));
       return obj.a();
    }
    public Map getExportedViewConstants(){
       Object obj = PatchProxy.apply(null, this, ReactTextInputManager.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d("AutoCapitalizationType", d.g("none", Integer.valueOf(0), "characters", Integer.valueOf(4096), "words", Integer.valueOf(8192), "sentences", Integer.valueOf(0x4000)));
    }
    public String getName(){
       return "AndroidTextInput";
    }
    public final n getReactTextUpdate(String p0,int p1,int p2,int p3){
       Object obj;
       if (PatchProxy.isSupport(ReactTextInputManager.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactTextInputManager.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       spannableStr.append(TextTransform.apply(p0, TextTransform.UNSET));
       n on = new n(spannableStr, p1, false, 0, 0, 0, 0, 0, 0, 0, p2, p3);
       return obj;
    }
    public Class getShadowNodeClass(){
       return ReactTextInputShadowNode.class;
    }
    public final int getTextBreakStrategy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactTextInputManager.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       if (p0 != null) {
          if (!p0.equals("balanced")) {
             if (p0.equals("simple")) {
                i = 0;
             }
          }else {
             i = 2;
          }
       }
       return i;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ReactEditText p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextInputManager.class, "57")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, p0, ReactEditText.class, "20") && p0.w != null) {
          p0.w = false;
          p0.setTypeface(p.a(p0.getTypeface(), p0.z, p0.y, p0.x, p0.getContext().getAssets()));
       }
       if (!PatchProxy.applyVoid(objArray, p0, ReactEditText.class, "16") && p0.getInputType() != p0.k) {
          p0.setInputType(p0.k);
          p0.setSelection(p0.getSelectionStart(), p0.getSelectionEnd());
       }
       return;
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactEditText p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(ReactTextInputManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactTextInputManager.class, "6")) {
          return;
       }
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 == 4) {
                   this.receiveCommand(p0, "setTextAndSelection", p2);
                }
             }else {
                this.receiveCommand(p0, "setMostRecentEventCount", p2);
             }
          }else {
             this.receiveCommand(p0, "blur", p2);
          }
       }else {
          this.receiveCommand(p0, "focus", p2);
       }
       return;
    }
    public void receiveCommand(ReactEditText p0,String p1,ReadableArray p2){
       int i1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactTextInputManager.class, "7")) {
          return;
       }
       Objects.requireNonNull(p1);
       int i = 2;
       switch (p1.hashCode()){
           case 0x9ab5c9f6:
             if (p1.equals("blurTextInput")) {
                i1 = 0;
             }else {
             }
             break;
           case 0x2e3067:
             if (p1.equals("blur")) {
                i1 = 1;
             }else {
             }
             break;
           case 0x5d154d8:
             if (p1.equals("focus")) {
                i1 = 2;
             }else {
             }
             break;
           case 0x550e73c4:
             if (p1.equals("setTextAndSelection")) {
                i1 = 3;
             }else {
             }
             break;
           case 0x64c614a5:
             if (p1.equals("focusTextInput")) {
                i1 = 4;
             }else {
             }
             break;
           case 0x6c10b075:
             if (p1.equals("setMostRecentEventCount")) {
                i1 = 5;
             }else {
             }
             break;
           default:
             i1 = -1;
       }
       Object[] objArray = null;
       switch (i1){
           case 0:
           case 1:
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, ReactEditText.class, "22")) {
                p0.clearFocus();
             }
             break;
           case 2:
           case 4:
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, ReactEditText.class, "21")) {
                p0.d = true;
                p0.requestFocus();
                p0.d = false;
             }
             break;
           case 3:
             i1 = p2.getInt(false);
             p0.setMostRecentEventCount(i1);
             if (i1 != -1) {
                String str = p2.getString(true);
                i = p2.getInt(i);
                int intx = p2.getInt(3);
                if (intx == -1) {
                   intx = i;
                }
                n reactTextUpd = this.getReactTextUpdate(str, i1, i, intx);
                if (!PatchProxy.applyVoidOneRefs(reactTextUpd, p0, ReactEditText.class, "23")) {
                   p0.c = true;
                   p0.g(reactTextUpd);
                   p0.c = false;
                }
             }
             break;
           case 5:
             p0.setMostRecentEventCount(p2.getInt(false));
             break;
           default:
       }
    label_00c4 :
       return;
    }
    public void setAllowFontScaling(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "25")) {
          return;
       }
       p0.setAllowFontScaling(p1);
       return;
    }
    public void setAutoCapitalize(ReactEditText p0,Dynamic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "47")) {
          return;
       }
       int i = 0x4000;
       if (p1.getType() == ReadableType.Number) {
          i = p1.asInt();
       }else if(p1.getType() == ReadableType.String){
          String str = p1.asString();
          if (str.equals("none")) {
             i = 0;
          }else if(str.equals("characters")){
             i = 4096;
          }else if(str.equals("words")){
             i = 8192;
          }else {
             boolean b = str.equals("sentences");
          }
       }
       ReactTextInputManager.updateStagedInputTypeFlag(p0, 0x7000, i);
       return;
    }
    public void setAutoCorrect(ReactEditText p0,Boolean p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "44")) {
          return;
       }
       if (p1 != null) {
          i = (p1.booleanValue())? 0x8000: 0x80000;
       }else {
          i = 0;
       }
       ReactTextInputManager.updateStagedInputTypeFlag(p0, 0x88000, i);
       return;
    }
    public final void setAutofillHints(ReactEditText p0,String[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "18")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 26) {
          return;
       }
       p0.setAutofillHints(p1);
       return;
    }
    public void setBlurOnSubmit(ReactEditText p0,Boolean p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "20")) {
          return;
       }
       p0.setBlurOnSubmit(p1);
       return;
    }
    public void setBorderColor(ReactEditText p0,int p1,Integer p2){
       if (PatchProxy.isSupport(ReactTextInputManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactTextInputManager.class, "56")) {
          return;
       }
       float f = Float.NaN;
       float f1 = (p2 == null)? Float.NaN: (float)(p2.intValue() & 0xffffff);
       if (p2 != null) {
          f = (float)(p2.intValue() >> 24);
       }
       p1 = ReactTextInputManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactEditText.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), Float.valueOf(f1), Float.valueOf(f), p0, ReactEditText.class, "46")) {
          p0.A.c(p1, f1, f);
       }
       return;
    }
    public void setBorderRadius(ReactEditText p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactTextInputManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactTextInputManager.class, "52")) {
          return;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       if (!p1) {
          p0.setBorderRadius(p2);
       }else {
          p1--;
          Objects.requireNonNull(p0);
          if (!PatchProxy.isSupport(ReactEditText.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p2), Integer.valueOf(p1), p0, ReactEditText.class, "48")) {
             p0.A.e(p2, p1);
          }
       }
       return;
    }
    public void setBorderStyle(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "53")) {
          return;
       }
       p0.setBorderStyle(p1);
       return;
    }
    public void setBorderWidth(ReactEditText p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactTextInputManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactTextInputManager.class, "55")) {
          return;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       p1 = ReactTextInputManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactEditText.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Float.valueOf(p2), p0, ReactEditText.class, "45")) {
          p0.A.g(p1, p2);
       }
       return;
    }
    public void setCaretHidden(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "31")) {
          return;
       }
       p0.setCursorVisible((p1 ^ 0x01));
       return;
    }
    public void setColor(ReactEditText p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "34")) {
          return;
       }
       if (p1 == null) {
          Context context = p0.getContext();
          ColorStateList uColorStateL = PatchProxy.applyOneRefs(context, null, d.class, "2");
          if (uColorStateL != PatchProxyResult.class) {
          }else {
             uColorStateL = d.a(context, 0x1010098);
          }
          p0.setTextColor(uColorStateL);
       }else {
          p0.setTextColor(p1.intValue());
       }
       return;
    }
    public void setContextMenuHidden(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "32")) {
          return;
       }
       p0.setOnLongClickListener(new ReactTextInputManager$a(this, p1));
       return;
    }
    public void setCursorColor(ReactEditText p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "29")) {
          return;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29) {
          Drawable textCursorDr = p0.getTextCursorDrawable();
          if (textCursorDr != null) {
             p0.setTextCursorDrawable(this.tintDrawable(textCursorDr, p1.intValue()));
          }
          if (!RomUtils.q()) {
             textCursorDr = p0.getTextSelectHandle();
             if (textCursorDr != null) {
                p0.setTextSelectHandle(this.tintDrawable(textCursorDr, p1.intValue()));
             }
             textCursorDr = p0.getTextSelectHandleLeft();
             if (textCursorDr != null) {
                p0.setTextSelectHandleLeft(this.tintDrawable(textCursorDr, p1.intValue()));
             }
             textCursorDr = p0.getTextSelectHandleRight();
             if (textCursorDr != null) {
                p0.setTextSelectHandleRight(this.tintDrawable(textCursorDr, p1.intValue()));
             }
          }
          return;
       }else if(sDK_INT == 28){
          return;
       }else {
          int i = 0;
          while (true) {
             String[] dRAWABLE_RES = ReactTextInputManager.DRAWABLE_RESOURCES;
             if (i >= dRAWABLE_RES.length) {
                return;
             }
             try{
                Field declaredFiel = TextView.class.getDeclaredField(dRAWABLE_RES[i]);
                declaredFiel.setAccessible(true);
                int intx = declaredFiel.getInt(p0);
                if (!intx) {
                   break ;
                }else {
                   Drawable uDrawable = ContextCompat.getDrawable(p0.getContext(), intx).mutate();
                   uDrawable.setColorFilter(p1.intValue(), PorterDuff$Mode.SRC_IN);
                   Field declaredFiel1 = TextView.class.getDeclaredField("mEditor");
                   declaredFiel1.setAccessible(true);
                   Object obj = declaredFiel1.get(p0);
                   Field declaredFiel2 = obj.getClass().getDeclaredField(ReactTextInputManager.DRAWABLE_FIELDS[i]);
                   declaredFiel2.setAccessible(true);
                   if (dRAWABLE_RES[i] == "mCursorDrawableRes") {
                      Drawable[] uDrawableArr = new Drawable[]{uDrawable,uDrawable};
                      declaredFiel2.set(obj, uDrawableArr);
                   }else if(!RomUtils.q()){
                      declaredFiel2.set(obj, uDrawable);
                   }
                   i = i + 1;
                }
             }catch(java.lang.NoSuchFieldException e0){
             }catch(java.lang.IllegalAccessException e0){
             }
          }
          return;
       }
    }
    public void setDisableFullscreenUI(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "50")) {
          return;
       }
       p0.setDisableFullscreenUI(p1);
       return;
    }
    public void setEditable(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "40")) {
          return;
       }
       p0.setEnabled(p1);
       return;
    }
    public void setFontFamily(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "11")) {
          return;
       }
       p0.setFontFamily(p1);
       return;
    }
    public void setFontSize(ReactEditText p0,float p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactTextInp, "10")) {
          return;
       }
       p0.setFontSize(p1);
       return;
    }
    public void setFontStyle(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "14")) {
          return;
       }
       p0.setFontStyle(p1);
       return;
    }
    public void setFontWeight(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "13")) {
          return;
       }
       p0.setFontWeight(p1);
       return;
    }
    public final void setImportantForAutofill(ReactEditText p0,int p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactTextInp, "17")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 26) {
          return;
       }
       p0.setImportantForAutofill(p1);
       return;
    }
    public void setImportantForAutofill(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "16")) {
          return;
       }
       int i = 0;
       if (("no").equals(p1)) {
          i = 2;
       }else if(("noExcludeDescendants").equals(p1)){
          i = 8;
       }else if(("yes").equals(p1)){
          i = 1;
       }else if(("yesExcludeDescendants").equals(p1)){
          i = 4;
       }
       this.setImportantForAutofill(p0, i);
       return;
    }
    public void setIncludeFontPadding(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "15")) {
          return;
       }
       p0.setIncludeFontPadding(p1);
       return;
    }
    public void setInlineImageLeft(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "38")) {
          return;
       }
       p0.setCompoundDrawablesWithIntrinsicBounds(c.a().c(p0.getContext(), p1), 0, 0, 0);
       return;
    }
    public void setInlineImagePadding(ReactEditText p0,int p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactTextInp, "39")) {
          return;
       }
       p0.setCompoundDrawablePadding(p1);
       return;
    }
    public void setKeyboardType(ReactEditText p0,String p1){
       int i2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "48")) {
          return;
       }
       int i = 0;
       int i1 = 1;
       if (("numeric").equalsIgnoreCase(p1)) {
          i2 = 0x3002;
       }else if(("number-pad").equalsIgnoreCase(p1)){
          i2 = 2;
       }else if(("decimal-pad").equalsIgnoreCase(p1)){
          i2 = 8194;
       }else if(("email-address").equalsIgnoreCase(p1)){
          i2 = 33;
       }else if(("phone-pad").equalsIgnoreCase(p1)){
          i2 = 3;
       }else if(("visible-password").equalsIgnoreCase(p1)){
          i2 = 144;
       }else if(p0.getStagedInputType() & 0x7000){
          i2 = 1;
       label_0064 :
          if (!i1) {
             i = 0x3033;
          }
          ReactTextInputManager.updateStagedInputTypeFlag(p0, i, i2);
          ReactTextInputManager.checkPasswordType(p0);
          return;
       }else {
          i2 = 1;
       }
       i1 = 0;
       goto label_0064 ;
    }
    public void setLetterSpacing(ReactEditText p0,float p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactTextInp, "24")) {
          return;
       }
       p0.setLetterSpacingPt(p1);
       return;
    }
    public void setMaxFontSizeMultiplier(ReactEditText p0,float p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactTextInp, "12")) {
          return;
       }
       p0.setMaxFontSizeMultiplier(p1);
       return;
    }
    public void setMaxLength(ReactEditText p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "42")) {
          return;
       }
       InputFilter[] filters = p0.getFilters();
       InputFilter[] eMPTY_FILTER = ReactTextInputManager.EMPTY_FILTERS;
       int i = 0;
       if (p1 == null) {
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
                eMPTY_FILTER = linkedList.toArray(filters);
             }
          }
       }else {
          int i1 = 1;
          if (filters.length > 0) {
             int i2 = 0;
             InputFilter$LengthFilter lengthFilter = null;
             while (i2 < filters.length) {
                if (filters[i2] instanceof InputFilter$LengthFilter) {
                   filters[i2] = new InputFilter$LengthFilter(p1.intValue());
                   lengthFilter = 1;
                }
                i2 = i2 + 1;
             }
             if (lengthFilter == null) {
                eMPTY_FILTER = new InputFilter[(filters.length + i1)];
                System.arraycopy(filters, i, eMPTY_FILTER, i, filters.length);
                filters[filters.length] = new InputFilter$LengthFilter(p1.intValue());
                filters = eMPTY_FILTER;
             }
             eMPTY_FILTER = filters;
          }else {
             eMPTY_FILTER = new InputFilter[i1];
             eMPTY_FILTER[i] = new InputFilter$LengthFilter(p1.intValue());
          }
       }
       p0.setFilters(eMPTY_FILTER);
       return;
    }
    public void setMostRecentEventCount(ReactEditText p0,int p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactTextInp, "30")) {
          return;
       }
       p0.setMostRecentEventCount(p1);
       return;
    }
    public void setMultiline(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "45")) {
          return;
       }
       int i = 0;
       int i1 = (p1)? 0: 0x20000;
       if (p1) {
          i = 0x20000;
       }
       ReactTextInputManager.updateStagedInputTypeFlag(p0, i1, i);
       return;
    }
    public void setNumLines(ReactEditText p0,int p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactTextInp, "41")) {
          return;
       }
       p0.setLines(p1);
       return;
    }
    public void setOnContentSizeChange(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "21")) {
          return;
       }
       if (p1) {
          p0.setContentSizeWatcher(new ReactTextInputManager$d(this, p0));
       }else {
          p0.setContentSizeWatcher(null);
       }
       return;
    }
    public void setOnKeyPress(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "23")) {
          return;
       }
       p0.setOnKeyPress(p1);
       return;
    }
    public void setOnScroll(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "22")) {
          return;
       }
       if (p1) {
          p0.setScrollWatcher(new ReactTextInputManager$e(this, p0));
       }else {
          p0.setScrollWatcher(null);
       }
       return;
    }
    public void setOnSelectionChange(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "19")) {
          return;
       }
       if (p1) {
          p0.setSelectionWatcher(new ReactTextInputManager$f(this, p0));
       }else {
          p0.setSelectionWatcher(null);
       }
       return;
    }
    public void setPadding(View p0,int p1,int p2,int p3,int p4){
       this.setPadding(p0, p1, p2, p3, p4);
    }
    public void setPadding(ReactEditText p0,int p1,int p2,int p3,int p4){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, reactTextInp, "63")) {
             return;
          }
       }
       p0.setPadding(p1, p2, p3, p4);
       return;
    }
    public void setPlaceholder(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "26")) {
          return;
       }
       p0.setHint(p1);
       return;
    }
    public void setPlaceholderTextColor(ReactEditText p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "27")) {
          return;
       }
       if (p1 == null) {
          Context context = p0.getContext();
          ColorStateList uColorStateL = PatchProxy.applyOneRefs(context, null, d.class, "1");
          if (uColorStateL != PatchProxyResult.class) {
          }else {
             uColorStateL = d.a(context, 0x101009a);
          }
          p0.setHintTextColor(uColorStateL);
       }else {
          p0.setHintTextColor(p1.intValue());
       }
       return;
    }
    public void setReturnKeyLabel(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "51")) {
          return;
       }
       p0.setImeActionLabel(p1, 1648);
       return;
    }
    public void setReturnKeyType(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "49")) {
          return;
       }
       p0.setReturnKeyType(p1);
       return;
    }
    public void setSecureTextEntry(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "46")) {
          return;
       }
       int i = 0;
       int i1 = (p1)? 0: 144;
       if (p1) {
          i = 128;
       }
       ReactTextInputManager.updateStagedInputTypeFlag(p0, i1, i);
       ReactTextInputManager.checkPasswordType(p0);
       return;
    }
    public void setSelectTextOnFocus(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "33")) {
          return;
       }
       p0.setSelectAllOnFocus(p1);
       return;
    }
    public void setSelectionColor(ReactEditText p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "28")) {
          return;
       }
       if (p1 == null) {
          p0.setHighlightColor(d.b(p0.getContext()));
       }else {
          p0.setHighlightColor(p1.intValue());
       }
       this.setCursorColor(p0, p1);
       return;
    }
    public void setTextAlign(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "36")) {
          return;
       }
       int i = 1;
       if (("justify").equals(p1)) {
          if (Build$VERSION.SDK_INT >= 26) {
             p0.setJustificationMode(i);
          }
          p0.setGravityHorizontal(3);
       }else if(Build$VERSION.SDK_INT >= 26){
          p0.setJustificationMode(0);
       }
       if (p1 == null || ("auto").equals(p1)) {
          p0.setGravityHorizontal(0);
       }else if(("left").equals(p1)){
          p0.setGravityHorizontal(3);
       }else if(("right").equals(p1)){
          p0.setGravityHorizontal(5);
       }else if(("center").equals(p1)){
          p0.setGravityHorizontal(i);
       }else {
          throw new JSApplicationIllegalArgumentException("Invalid textAlign: "+p1);
       }
       return;
    }
    public void setTextAlignVertical(ReactEditText p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "37")) {
          return;
       }
       if (p1 == null || ("auto").equals(p1)) {
          p0.setGravityVertical(0);
       }else if(("top").equals(p1)){
          p0.setGravityVertical(48);
       }else if(("bottom").equals(p1)){
          p0.setGravityVertical(80);
       }else if(("center").equals(p1)){
          p0.setGravityVertical(16);
       }else {
          throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: "+p1);
       }
       return;
    }
    public void setTextContentType(ReactEditText p0,String p1){
       String[] stringArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "43")) {
          return;
       }
       int i = 2;
       if (p1 == null) {
          this.setImportantForAutofill(p0, i);
       }else {
          String str = "username";
          if (str.equals(p1)) {
             stringArray = new String[]{str};
             this.setAutofillHints(p0, stringArray);
          }else {
             str = "password";
             if (str.equals(p1)) {
                stringArray = new String[]{str};
                this.setAutofillHints(p0, stringArray);
             }else if(("email").equals(p1)){
                stringArray = new String[]{"emailAddress"};
                this.setAutofillHints(p0, stringArray);
             }else {
                str = "name";
                if (str.equals(p1)) {
                   stringArray = new String[]{str};
                   this.setAutofillHints(p0, stringArray);
                }else if(("tel").equals(p1)){
                   stringArray = new String[]{"phone"};
                   this.setAutofillHints(p0, stringArray);
                }else if(("street-address").equals(p1)){
                   stringArray = new String[]{"postalAddress"};
                   this.setAutofillHints(p0, stringArray);
                }else if(("postal-code").equals(p1)){
                   stringArray = new String[]{"postalCode"};
                   this.setAutofillHints(p0, stringArray);
                }else if(("cc-number").equals(p1)){
                   stringArray = new String[]{"creditCardNumber"};
                   this.setAutofillHints(p0, stringArray);
                }else if(("cc-csc").equals(p1)){
                   stringArray = new String[]{"creditCardSecurityCode"};
                   this.setAutofillHints(p0, stringArray);
                }else if(("cc-exp").equals(p1)){
                   stringArray = new String[]{"creditCardExpirationDate"};
                   this.setAutofillHints(p0, stringArray);
                }else if(("cc-exp-month").equals(p1)){
                   stringArray = new String[]{"creditCardExpirationMonth"};
                   this.setAutofillHints(p0, stringArray);
                }else if(("cc-exp-year").equals(p1)){
                   stringArray = new String[]{"creditCardExpirationYear"};
                   this.setAutofillHints(p0, stringArray);
                }else if(("off").equals(p1)){
                   this.setImportantForAutofill(p0, i);
                }else {
                   throw new JSApplicationIllegalArgumentException("Invalid autoCompleteType: "+p1);
                }
             }
          }
       }
       return;
    }
    public void setUnderlineColor(ReactEditText p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "35")) {
          return;
       }
       Drawable background = p0.getBackground();
       if (background.getConstantState() != null) {
          try{
             background = background.mutate();
          }catch(java.lang.NullPointerException e0){
             a.h(ReactTextInputManager.TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e0);
          }
       }
    }
    public void showKeyboardOnFocus(ReactEditText p0,boolean p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextInp, "54")) {
          return;
       }
       p0.setShowSoftInputOnFocus(p1);
       return;
    }
    public final Drawable tintDrawable(Drawable p0,int p1){
       ReactTextInputManager reactTextInp = ReactTextInputManager.class;
       if (PatchProxy.isSupport(reactTextInp)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, reactTextInp, "60");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = a.r(p0);
       a.n(p0, p1);
       return p0;
    }
    public void updateExtraData(View p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(ReactEditText p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextInputManager.class, "9")) {
          return;
       }
       if (p1 instanceof n) {
          int i = (int)p1.e();
          int i1 = (int)p1.g();
          int i2 = (int)p1.f();
          int i3 = (int)p1.d();
          if (i == -1 && (i1 == -1 && (i2 != -1 || i3 != -1))) {
             if (i == -1) {
                i = p0.getPaddingLeft();
             }
             if (i1 == -1) {
                i1 = p0.getPaddingTop();
             }
             if (i2 == -1) {
                i2 = p0.getPaddingRight();
             }
             if (i3 == -1) {
                i3 = p0.getPaddingBottom();
             }
             p0.setPadding(i, i1, i2, i3);
          }
          if (p1.a()) {
             t.h(p1.j(), p0);
          }
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(p1, p0, ReactEditText.class, "24")) {
             p0.E = true;
             p0.g(p1);
             p0.E = false;
          }
          if (p1.i() != -1 && p1.h() != -1) {
             p0.setSelection(p1.i(), p1.h());
          }
       }
    label_0088 :
       return;
    }
    public Object updateState(View p0,z p1,m0 p2){
       return this.updateState(p0, p1, p2);
    }
    public Object updateState(ReactEditText p0,z p1,m0 p2){
       ReadableNativeMap obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReactTextInputManager.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p2.getState();
       ReadableNativeMap map = obj.getMap("attributedString");
       Spannable spannable = v.a(p0.getContext(), map);
       int textBreakStr = this.getTextBreakStrategy(obj.getMap("paragraphAttributes").getString("textBreakStrategy"));
       p0.C = p2;
       int intx = obj.getInt("mostRecentEventCount");
       int i = new r(p1).h();
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{spannable,Integer.valueOf(intx),Boolean.FALSE,Integer.valueOf(i),Integer.valueOf(textBreakStr),Integer.valueOf(0),map};
          on = PatchProxy.apply(objArray, null, on, "1");
          if (on != PatchProxyResult.class) {
          label_008c :
             return on;
          }
       }
       n on1 = new n(spannable, intx, false, i, textBreakStr, 0);
       on.m = map;
       goto label_008c ;
    }
}
