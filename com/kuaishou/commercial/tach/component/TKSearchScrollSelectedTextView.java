package com.kuaishou.commercial.tach.component.TKSearchScrollSelectedTextView;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.content.Context;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vx4.n;
import com.tkruntime.v8.V8Function;
import java.lang.Number;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.kuaishou.commercial.tach.component.TKSearchScrollSelectedTextView$a;
import java.lang.Runnable;
import iq8.x;
import java.lang.Integer;
import iq8.p;
import com.tkruntime.v8.V8Object;
import gx4.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tachikoma.core.component.text.TKSpan;
import java.lang.CharSequence;
import java.util.Objects;
import lnc.a1;

public class TKSearchScrollSelectedTextView extends e	// class@001665
{
    public boolean canScroll;
    public boolean canSelect;
    public V8Function getClipText;
    public V8Function scrolled;
    public boolean v;

    public void TKSearchScrollSelectedTextView(f p0){
       super(p0);
       this.getView();
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public TextView createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKSearchScrollSelectedTextView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-252254383).b(p0);
    }
    public void didLeavePage(){
       if (PatchProxy.applyVoid(null, this, TKSearchScrollSelectedTextView.class, "11")) {
          return;
       }
       d.a(-252254383).Yh(this.getView());
       return;
    }
    public void getClipTextCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollSelectedTextView.class, "12")) {
          return;
       }
       d.a(-252254383).u60(this.getView(), p0);
       return;
    }
    public float getLargestDepth(){
       Object obj = PatchProxy.apply(null, this, TKSearchScrollSelectedTextView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return d.a(-252254383).u50(this.getView());
    }
    public void getScrolledCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollSelectedTextView.class, "13")) {
          return;
       }
       d.a(-252254383).kM(this.getView(), p0);
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKSearchScrollSelectedTextView tKSearchScro = TKSearchScrollSelectedTextView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKSearchScro, "16")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          d.a(-252254383).A10(this.getView());
       }else {
          x.f(new TKSearchScrollSelectedTextView$a(this));
       }
       return;
    }
    public void scrollToOffset(int p0,int p1){
       TKSearchScrollSelectedTextView tKSearchScro = TKSearchScrollSelectedTextView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, tKSearchScro, "3")) {
          return;
       }
       d.a(-252254383).An(this.getView(), p0, p1);
       return;
    }
    public void setAdjustFontSizeWithSystemChange(boolean p0){
       this.v = p0;
    }
    public void setCanScroll(boolean p0){
       TKSearchScrollSelectedTextView tKSearchScro = TKSearchScrollSelectedTextView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKSearchScro, "14")) {
          return;
       }
       d.a(-252254383).lM(this.getView(), p0);
       return;
    }
    public void setCanSelect(boolean p0){
       TKSearchScrollSelectedTextView tKSearchScro = TKSearchScrollSelectedTextView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKSearchScro, "15")) {
          return;
       }
       d.a(-252254383).ed(this.getView(), p0);
       return;
    }
    public void setColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollSelectedTextView.class, "6")) {
          return;
       }
       this.getView().setTextColor(p.b(p0));
       return;
    }
    public void setFontSize(int p0){
       TKSearchScrollSelectedTextView tKSearchScro = TKSearchScrollSelectedTextView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKSearchScro, "7")) {
          return;
       }
       if (this.v != null) {
          this.getView().setTextSize(2, (float)p0);
       }else {
          this.getView().setTextSize(1, (float)p0);
       }
       return;
    }
    public void setHasScrollToOffset(){
       if (PatchProxy.applyVoid(null, this, TKSearchScrollSelectedTextView.class, "5")) {
          return;
       }
       d.a(-252254383).O00(this.getView());
       return;
    }
    public void setSpan(String p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKSearchScrollSelectedTextView.class, "4")) {
          return;
       }
       TKSpan nativeModule = this.getNativeModule(p1);
       if (nativeModule == null) {
          return;
       }
       d.a(-252254383).aJ(this.getView(), nativeModule.getSpannableString(p0, this.getView()));
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollSelectedTextView.class, "2")) {
          return;
       }
       d.a(-252254383).aJ(this.getView(), p0);
       return;
    }
    public void setTextAlign(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSearchScrollSelectedTextView.class, "9")) {
          return;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xaeb2cc55:
             if (p0.equals("center")) {
                i = 0;
             }
             break;
           case 0x32a007:
             if (p0.equals("left")) {
                i = 1;
             }
             break;
           case 0x677c21c:
             if (p0.equals("right")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.getView().setGravity(17);
             break;
           case 1:
             this.getView().setGravity(3);
             break;
           case 2:
             this.getView().setGravity(5);
             break;
           default:
       }
       return;
    }
    public void setTextLineSpace(int p0){
       TKSearchScrollSelectedTextView tKSearchScro = TKSearchScrollSelectedTextView.class;
       if (PatchProxy.isSupport(tKSearchScro) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKSearchScro, "8")) {
          return;
       }
       this.getView().setLineSpacing((float)a1.e((float)p0), 0x3f800000);
       return;
    }
}
