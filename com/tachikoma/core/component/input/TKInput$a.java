package com.tachikoma.core.component.input.TKInput$a;
import android.text.TextWatcher;
import com.tachikoma.core.component.input.TKInput;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.tachikoma.core.component.e;
import com.tachikoma.core.component.input.MenuOptionEditText;
import android.widget.EditText;
import yp8.a;
import jq8.a;
import com.tachikoma.core.component.input.a;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import java.util.HashMap;
import ap8.c;
import sp8.b$a;
import java.lang.CharSequence;
import java.lang.Integer;
import lg.i;
import java.lang.Float;
import ap8.d;
import android.text.TextUtils;
import ap8.e;

public class TKInput$a implements TextWatcher	// class@000d71
{
    public final TKInput b;

    public void TKInput$a(TKInput p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       TKInput$a tb;
       TKInput$a tb1;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKInput$a.class, "3")) {
          return;
       }
       if (!this.b.isSingleLine()) {
          int lineCount = this.b.getView().getLineCount();
          if (lineCount) {
             tb = this.b;
             TKInput mAutoResizeL = tb.mAutoResizeLines;
             if (mAutoResizeL > null && (lineCount < tb.mHeightLines && (lineCount >= tb.mInitialLines && lineCount < mAutoResizeL))) {
                tb.getDomNode().c().b();
                tb = this.b;
                tb.mHeightLines = lineCount;
                tb.mProperty.e(lineCount);
                tb1 = this.b;
                tb1.mProperty.g(tb1.mHeightLines);
             }
          }
       label_004f :
          TKInput$a tb2 = this.b;
          if ((float)(this.b.getView().getLineHeight() * lineCount) - tb2.mInitialHeight > 0) {
             TKInput mAutoResizeL1 = tb2.mAutoResizeLines;
             if (mAutoResizeL1 > null && (lineCount > tb2.mHeightLines && (lineCount > tb2.mInitialLines && lineCount <= mAutoResizeL1))) {
                tb2.getDomNode().c().b();
                this.b.getDomNode().c().y(this.b.mInitialHeight);
                this.b.getDomNode().c().t();
                tb = this.b;
                tb.mHeightLines = lineCount;
                tb.mProperty.e(lineCount);
                tb1 = this.b;
                tb1.mProperty.g(tb1.mHeightLines);
             }
          }
       }
    label_00af :
       tb1 = this.b;
       if (tb1.mIsClickPaste != null) {
          tb1.mIsClickPaste = false;
          TKInput onpasteRef = tb1.onpasteRef;
          if (onpasteRef != null && y.a(onpasteRef.get())) {
             HashMap hashMap = new HashMap();
             hashMap.put("value", this.b.getClipboardContent());
             HashMap hashMap1 = new HashMap();
             hashMap1.put("target", hashMap);
             hashMap1.put("type", "paste");
             tb1 = this.b;
             tb1.onRefCallWithArgs(tb1.onpasteRef, hashMap1);
          }
       }
       this.b.dispatchEvent("input", new c(p0));
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKInput$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKInput$a.class, "1")) {
          return;
       }
       TKInput$a tb = this.b;
       tb.mInitialHeight = (tb.mInitialHeight < 0)? tb.getDomNode().c().d().a: 0;
       TKInput mInitialHeig = this.b.mInitialHeight;
       if (mInitialHeig < 0 || Float.isNaN(mInitialHeig)) {
          tb = this.b;
          tb.mInitialHeight = (float)tb.getView().getMeasuredHeight();
       }
       this.b.dispatchEvent("input", new d(p0));
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       TKInput$a tb;
       if (PatchProxy.isSupport(TKInput$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKInput$a.class, "2")) {
          return;
       }
       p2 = 1;
       p3 = 0;
       if (TextUtils.isEmpty(p0)) {
          tb = this.b;
          if (tb.mHintFontSize - p3 > 0) {
             tb.getView().setTextSize(p2, this.b.mHintFontSize);
          }
       }else {
          tb = this.b;
          if (tb.mFontSize - p3 > 0) {
             tb.getView().setTextSize(p2, this.b.mFontSize);
          }
       }
       tb = this.b;
       if (tb.mIsSetText != null) {
          tb.mIsSetText = false;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("value", p0.toString());
          HashMap hashMap1 = new HashMap();
          hashMap1.put("target", hashMap);
          hashMap1.put("type", "input");
          tb = this.b;
          tb.onRefCallWithArgs(tb.oninputRef, hashMap1);
       }
       this.b.dispatchEvent("input", new e(p0));
       return;
    }
}
