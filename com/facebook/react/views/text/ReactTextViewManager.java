package com.facebook.react.views.text.ReactTextViewManager;
import ze.g;
import com.facebook.react.views.text.ReactTextAnchorViewManager;
import com.facebook.react.views.text.ReactTextShadowNode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.x;
import ze.n0;
import android.view.View;
import com.facebook.react.views.text.ReactTextView;
import android.content.Context;
import java.util.Map;
import vd.d;
import java.lang.Number;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Float;
import yf.v;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.Integer;
import android.widget.TextView;
import yf.n;
import android.text.Spannable;
import yf.t;
import ze.z;
import ze.m0;
import com.facebook.react.bridge.ReadableNativeMap;
import yf.r;

public class ReactTextViewManager extends ReactTextAnchorViewManager implements g	// class@001412
{

    public void ReactTextViewManager(){
       super();
    }
    public ReactTextShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ReactTextViewManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactTextShadowNode();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactTextView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactTextViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactTextView(p0);
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       Object obj = PatchProxy.apply(null, this, ReactTextViewManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.e("topTextLayout", d.d("registrationName", "onTextLayout"), "topInlineViewLayout", d.d("registrationName", "onInlineViewLayout"));
    }
    public String getName(){
       return "RCTText";
    }
    public Class getShadowNodeClass(){
       return ReactTextShadowNode.class;
    }
    public final int getTextBreakStrategy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactTextViewManager.class, "6");
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
    public long measure(Context p0,ReadableMap p1,ReadableMap p2,ReadableMap p3,float p4,YogaMeasureMode p5,float p6,YogaMeasureMode p7){
       ReactTextViewManager reactTextVie = ReactTextViewManager.class;
       if (PatchProxy.isSupport(reactTextVie)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4),p5,Float.valueOf(p6),p7};
          p3 = PatchProxy.apply(objArray, this, reactTextVie, "8");
          if (p3 != PatchProxyResult.class) {
             return p3.longValue();
          }
       }
       return v.b(p0, p1, p2, p4, p5, p6, p7);
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ReactTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextViewManager.class, "4")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       p0.q();
       return;
    }
    public void setPadding(View p0,int p1,int p2,int p3,int p4){
       this.setPadding(p0, p1, p2, p3, p4);
    }
    public void setPadding(ReactTextView p0,int p1,int p2,int p3,int p4){
       ReactTextViewManager reactTextVie = ReactTextViewManager.class;
       if (PatchProxy.isSupport(reactTextVie)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, reactTextVie, "9")) {
             return;
          }
       }
       p0.setPadding(p1, p2, p3, p4);
       return;
    }
    public void updateExtraData(View p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(ReactTextView p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextViewManager.class, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (p1.a()) {
          t.h(p1.j(), p0);
       }
       p0.setText(p1);
       return;
    }
    public Object updateState(View p0,z p1,m0 p2){
       return this.updateState(p0, p1, p2);
    }
    public Object updateState(ReactTextView p0,z p1,m0 p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReactTextViewManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ReadableNativeMap state = p2.getState();
       Spannable spannable = v.a(p0.getContext(), state.getMap("attributedString"));
       p0.setSpanned(spannable);
       r or = new r(p1);
       int textBreakStr = this.getTextBreakStrategy(state.getMap("paragraphAttributes").getString("textBreakStrategy"));
       int i = (state.hasKey("mostRecentEventCount"))? state.getInt("mostRecentEventCount"): -1;
       n on = new n(spannable, i, false, or.h(), textBreakStr, 0);
       return state.getMap("paragraphAttributes").getString("textBreakStrategy");
    }
}
