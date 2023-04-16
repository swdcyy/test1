package com.yxcorp.gifshow.notice.krn.SocialReactRichTextViewManager;
import ze.g;
import com.facebook.react.uimanager.BaseViewManager;
import com.yxcorp.gifshow.notice.krn.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.x;
import ze.n0;
import android.view.View;
import com.yxcorp.gifshow.notice.krn.SocialReactRichTextView;
import android.content.Context;
import java.util.Map;
import vd.d;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Float;
import java.lang.Number;
import yf.v;
import java.util.Objects;
import android.text.TextUtils$TruncateAt;
import android.widget.TextView;
import java.lang.Integer;
import bg.d;
import lg.d;
import ze.p;
import lnc.a1;
import java.lang.Boolean;
import yf.n;

public class SocialReactRichTextViewManager extends BaseViewManager implements g	// class@00219b
{
    public static final int[] SPACING_TYPES;

    static {
       SocialReactRichTextViewManager.SPACING_TYPES = new int[5]{8,0,2,1,3};
    }
    public void SocialReactRichTextViewManager(){
       super();
    }
    public m createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, SocialReactRichTextViewManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public SocialReactRichTextView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SocialReactRichTextViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SocialReactRichTextView(p0);
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       Object obj = PatchProxy.apply(null, this, SocialReactRichTextViewManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.e("topLinkClick", d.d("registrationName", "onLinkClick"), "topParseBlock", d.d("registrationName", "parseBlock"));
    }
    public String getName(){
       return "RNRichText";
    }
    public Class getShadowNodeClass(){
       return m.class;
    }
    public long measure(Context p0,ReadableMap p1,ReadableMap p2,ReadableMap p3,float p4,YogaMeasureMode p5,float p6,YogaMeasureMode p7){
       SocialReactRichTextViewManager socialReactR = SocialReactRichTextViewManager.class;
       if (PatchProxy.isSupport(socialReactR)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4),p5,Float.valueOf(p6),p7};
          p3 = PatchProxy.apply(objArray, this, socialReactR, "15");
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
    public void onAfterUpdateTransaction(SocialReactRichTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialReactRichTextViewManager.class, "4")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, p0, SocialReactRichTextView.class, "10")) {
          if (p0.o != Integer.MAX_VALUE) {
             objArray = p0.p;
          }
          p0.setEllipsize(objArray);
       }
       return;
    }
    public void setBorderColor(SocialReactRichTextView p0,int p1,Integer p2){
       if (PatchProxy.isSupport(SocialReactRichTextViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, SocialReactRichTextViewManager.class, "11")) {
          return;
       }
       float f = Float.NaN;
       float f1 = (p2 == null)? Float.NaN: (float)(p2.intValue() & 0xffffff);
       if (p2 != null) {
          f = (float)(p2.intValue() >> 24);
       }
       p1 = SocialReactRichTextViewManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(SocialReactRichTextView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), Float.valueOf(f1), Float.valueOf(f), p0, SocialReactRichTextView.class, "13")) {
          p0.q.c(p1, f1, f);
       }
       return;
    }
    public void setBorderRadius(SocialReactRichTextView p0,int p1,float p2){
       if (PatchProxy.isSupport(SocialReactRichTextViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, SocialReactRichTextViewManager.class, "13")) {
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
          if (!PatchProxy.isSupport(SocialReactRichTextView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p2), Integer.valueOf(p1), p0, SocialReactRichTextView.class, "15")) {
             p0.q.e(p2, p1);
          }
       }
       return;
    }
    public void setBorderStyle(SocialReactRichTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialReactRichTextViewManager.class, "7")) {
          return;
       }
       p0.setBorderStyle(p1);
       return;
    }
    public void setBorderWidth(SocialReactRichTextView p0,int p1,float p2){
       if (PatchProxy.isSupport(SocialReactRichTextViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, SocialReactRichTextViewManager.class, "12")) {
          return;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       p1 = SocialReactRichTextViewManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(SocialReactRichTextView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Float.valueOf(p2), p0, SocialReactRichTextView.class, "12")) {
          p0.q.g(p1, p2);
       }
       return;
    }
    public void setEllipsizeMode(SocialReactRichTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialReactRichTextViewManager.class, "5")) {
          return;
       }
       if (p1 == null || p1.equals("tail")) {
          p0.setEllipsizeLocation(TextUtils$TruncateAt.END);
       }else if(p1.equals("head")){
          p0.setEllipsizeLocation(TextUtils$TruncateAt.START);
       }else if(p1.equals("middle")){
          p0.setEllipsizeLocation(TextUtils$TruncateAt.MIDDLE);
       }else if(p1.equals("clip")){
          p0.setEllipsizeLocation(null);
       }
       return;
    }
    public void setLineSpacing(SocialReactRichTextView p0,float p1){
       SocialReactRichTextViewManager socialReactR = SocialReactRichTextViewManager.class;
       if (PatchProxy.isSupport(socialReactR) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, socialReactR, "8")) {
          return;
       }
       if (p1 >= 0) {
          p0.setLineSpacing((float)a1.e(p1), p0.getLineSpacingMultiplier());
       }
       return;
    }
    public void setLineSpacingMultiplier(SocialReactRichTextView p0,float p1){
       SocialReactRichTextViewManager socialReactR = SocialReactRichTextViewManager.class;
       if (PatchProxy.isSupport(socialReactR) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, socialReactR, "9")) {
          return;
       }
       if (p1 >= 0) {
          p0.setLineSpacing(p0.getLineSpacingExtra(), p1);
       }
       return;
    }
    public void setLineSpacingMultiplier(SocialReactRichTextView p0,boolean p1){
       SocialReactRichTextViewManager socialReactR = SocialReactRichTextViewManager.class;
       if (PatchProxy.isSupport(socialReactR) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, socialReactR, "10")) {
          return;
       }
       p0.setIncludeFontPadding(p1);
       return;
    }
    public void setNumberOfLines(SocialReactRichTextView p0,int p1){
       SocialReactRichTextViewManager socialReactR = SocialReactRichTextViewManager.class;
       if (PatchProxy.isSupport(socialReactR) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, socialReactR, "6")) {
          return;
       }
       p0.setNumberOfLines(p1);
       return;
    }
    public void setPadding(View p0,int p1,int p2,int p3,int p4){
       this.setPadding(p0, p1, p2, p3, p4);
    }
    public void setPadding(SocialReactRichTextView p0,int p1,int p2,int p3,int p4){
       SocialReactRichTextViewManager socialReactR = SocialReactRichTextViewManager.class;
       if (PatchProxy.isSupport(socialReactR)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, socialReactR, "16")) {
             return;
          }
       }
       p0.setPadding(p1, p2, p3, p4);
       return;
    }
    public void updateExtraData(View p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(SocialReactRichTextView p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialReactRichTextViewManager.class, "2")) {
          return;
       }
       p0.setText(p1);
       return;
    }
}
