package com.facebook.react.views.textinput.ReactTextInputShadowNode;
import lg.e;
import yf.i;
import android.os.Build$VERSION;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import od.a;
import android.widget.EditText;
import ag.j;
import yf.s;
import java.lang.CharSequence;
import bg.b;
import lg.f;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.j;
import yf.n;
import ze.n;
import android.text.Spannable;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import ze.n0;
import android.content.Context;
import android.view.View;
import a2.i0;
import android.view.ViewGroup$LayoutParams;

public class ReactTextInputShadowNode extends i implements e	// class@001431
{
    public int A;
    public EditText B;
    public j C;
    public String D;
    public String E;
    public int F;
    public int G;

    public void ReactTextInputShadowNode(){
       super();
       this.A = -1;
       this.D = null;
       this.E = null;
       this.F = -1;
       this.G = -1;
       int i = (Build$VERSION.SDK_INT < 23)? 0: 1;
       this.i = i;
       this.e();
       return;
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       ReactTextInputShadowNode reactTextInp = ReactTextInputShadowNode.class;
       if (PatchProxy.isSupport(reactTextInp)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Float.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, this, reactTextInp, "3");
          if (p0 != PatchProxyResult.class) {
             return p0.longValue();
          }
       }
       ReactTextInputShadowNode tB = this.B;
       a.c(tB);
       reactTextInp = this.C;
       if (reactTextInp != null) {
          reactTextInp.a(tB);
       }else {
          tB.setTextSize(0, (float)this.b.c());
          i tg = this.g;
          if (tg != -1) {
             tB.setLines(tg);
          }
          if (Build$VERSION.SDK_INT >= 23) {
             i ti = this.i;
             if (tB.getBreakStrategy() != ti) {
                tB.setBreakStrategy(ti);
             }
          }
       }
       tB.setHint(this.d());
       tB.measure(b.a(p1, p2), b.a(p3, p4));
       return f.b(tB.getMeasuredWidth(), tB.getMeasuredHeight());
    }
    public String d(){
       return this.E;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, ReactTextInputShadowNode.class, "1")) {
          return;
       }
       this.setMeasureFunction(this);
       return;
    }
    public boolean isVirtualAnchor(){
       return true;
    }
    public boolean isYogaLeafNode(){
       return true;
    }
    public void onCollectExtraUpdates(j p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ReactTextInputShadowNode.class, "9")) {
          return;
       }
       super.onCollectExtraUpdates(p0);
       if (obj.A != -1) {
          n on = new n(obj.c(obj, obj.D, false, null), obj.A, obj.y, obj.getPadding(false), obj.getPadding(1), obj.getPadding(2), obj.getPadding(3), obj.h, obj.i, obj.k, obj.F, obj.G);
          obj1.h(this.getReactTag(), v2);
       }
       return;
    }
    public void setLocalData(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextInputShadowNode.class, "4")) {
          return;
       }
       a.a(p0 instanceof j);
       this.C = p0;
       this.dirty();
       return;
    }
    public void setMostRecentEventCount(int p0){
       this.A = p0;
    }
    public void setPadding(int p0,float p1){
       ReactTextInputShadowNode reactTextInp = ReactTextInputShadowNode.class;
       if (PatchProxy.isSupport(reactTextInp) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, reactTextInp, "10")) {
          return;
       }
       super.setPadding(p0, p1);
       this.markUpdated();
       return;
    }
    public void setPlaceholder(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextInputShadowNode.class, "6")) {
          return;
       }
       this.E = p0;
       this.markUpdated();
       return;
    }
    public void setSelection(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextInputShadowNode.class, "7")) {
          return;
       }
       int i = -1;
       this.G = i;
       this.F = i;
       if (p0 == null) {
          return;
       }
       String str = "start";
       if (p0.hasKey(str) && p0.hasKey("end")) {
          this.F = p0.getInt(str);
          this.G = p0.getInt("end");
          this.markUpdated();
       }
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextInputShadowNode.class, "5")) {
          return;
       }
       this.D = p0;
       if (p0 != null) {
          if (this.F > p0.length()) {
             this.F = p0.length();
          }
          if (this.G > p0.length()) {
             this.G = p0.length();
          }
       }else {
          this.F = -1;
          this.G = -1;
       }
       this.markUpdated();
       return;
    }
    public void setTextBreakStrategy(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextInputShadowNode.class, "8")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       if (p0 == null || ("simple").equals(p0)) {
          this.i = 0;
       }else if(("highQuality").equals(p0)){
          this.i = 1;
       }else if(("balanced").equals(p0)){
          this.i = 2;
       }else {
          throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: "+p0);
       }
       return;
    }
    public void setThemedContext(n0 p0){
       ReactTextInputShadowNode reactTextInp = ReactTextInputShadowNode.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, reactTextInp, "2")) {
          return;
       }
       super.setThemedContext(p0);
       EditText uEditText = PatchProxy.apply(null, this, reactTextInp, "11");
       if (uEditText != PatchProxyResult.class) {
       }else {
          uEditText = new EditText(this.getThemedContext());
       }
       this.setDefaultPadding(4, (float)i0.H(uEditText));
       this.setDefaultPadding(1, (float)uEditText.getPaddingTop());
       this.setDefaultPadding(5, (float)i0.G(uEditText));
       this.setDefaultPadding(3, (float)uEditText.getPaddingBottom());
       this.B = uEditText;
       uEditText.setPadding(0, 0, 0, 0);
       this.B.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       return;
    }
}
