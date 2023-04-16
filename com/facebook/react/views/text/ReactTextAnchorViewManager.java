package com.facebook.react.views.text.ReactTextAnchorViewManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.text.ReactTextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Float;
import bg.d;
import lg.d;
import ze.p;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import android.content.Context;
import yf.d;

public abstract class ReactTextAnchorViewManager extends BaseViewManager	// class@00140a
{
    public static final int[] SPACING_TYPES;

    static {
       ReactTextAnchorViewManager.SPACING_TYPES = new int[5]{8,0,2,1,3};
    }
    public void ReactTextAnchorViewManager(){
       super();
    }
    public void setAdjustFontSizeToFit(ReactTextView p0,boolean p1){
       ReactTextAnchorViewManager reactTextAnc = ReactTextAnchorViewManager.class;
       if (PatchProxy.isSupport(reactTextAnc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextAnc, "3")) {
          return;
       }
       p0.setAdjustFontSizeToFit(p1);
       return;
    }
    public void setBorderColor(ReactTextView p0,int p1,Integer p2){
       if (PatchProxy.isSupport(ReactTextAnchorViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactTextAnchorViewManager.class, "10")) {
          return;
       }
       float f = Float.NaN;
       float f1 = (p2 == null)? Float.NaN: (float)(p2.intValue() & 0xffffff);
       if (p2 != null) {
          f = (float)(p2.intValue() >> 24);
       }
       p1 = ReactTextAnchorViewManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactTextView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), Float.valueOf(f1), Float.valueOf(f), p0, ReactTextView.class, "22")) {
          p0.o.c(p1, f1, f);
       }
       return;
    }
    public void setBorderRadius(ReactTextView p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactTextAnchorViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactTextAnchorViewManager.class, "7")) {
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
          if (!PatchProxy.isSupport(ReactTextView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p2), Integer.valueOf(p1), p0, ReactTextView.class, "24")) {
             p0.o.e(p2, p1);
          }
       }
       return;
    }
    public void setBorderStyle(ReactTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextAnchorViewManager.class, "8")) {
          return;
       }
       p0.setBorderStyle(p1);
       return;
    }
    public void setBorderWidth(ReactTextView p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactTextAnchorViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactTextAnchorViewManager.class, "9")) {
          return;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       p1 = ReactTextAnchorViewManager.SPACING_TYPES[p1];
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ReactTextView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Float.valueOf(p2), p0, ReactTextView.class, "21")) {
          p0.o.g(p1, p2);
       }
       return;
    }
    public void setDataDetectorType(ReactTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextAnchorViewManager.class, "13")) {
          return;
       }
       int i = -1;
       switch (p1.hashCode()){
           case 0xb8e4ba57:
             if (p1.equals("phoneNumber")) {
                i = 0;
             }
             break;
           case 0x179a1:
             if (p1.equals("all")) {
                i = 3;
             }
             break;
           case 0x32affa:
             if (p1.equals("link")) {
                i = 1;
             }
             break;
           case 0x33af38:
             if (p1.equals("none")) {
                i = 4;
             }
             break;
           case 0x5c24b9c:
             if (p1.equals("email")) {
                i = 2;
             }
             break;
           default:
       }
    label_004a :
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   p0.setLinkifyMask(0);
                }else {
                   p0.setLinkifyMask(15);
                }
             }else {
                p0.setLinkifyMask(2);
             }
          }else {
             p0.setLinkifyMask(1);
          }
       }else {
          p0.setLinkifyMask(4);
       }
       return;
    }
    public void setDisabled(ReactTextView p0,boolean p1){
       ReactTextAnchorViewManager reactTextAnc = ReactTextAnchorViewManager.class;
       if (PatchProxy.isSupport(reactTextAnc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextAnc, "12")) {
          return;
       }
       p0.setEnabled((p1 ^ 0x01));
       return;
    }
    public void setEllipsizeMode(ReactTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextAnchorViewManager.class, "2")) {
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
       }else {
          throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: "+p1);
       }
       return;
    }
    public void setIncludeFontPadding(ReactTextView p0,boolean p1){
       ReactTextAnchorViewManager reactTextAnc = ReactTextAnchorViewManager.class;
       if (PatchProxy.isSupport(reactTextAnc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextAnc, "11")) {
          return;
       }
       p0.setIncludeFontPadding(p1);
       return;
    }
    public void setNotifyOnInlineViewLayout(ReactTextView p0,boolean p1){
       ReactTextAnchorViewManager reactTextAnc = ReactTextAnchorViewManager.class;
       if (PatchProxy.isSupport(reactTextAnc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextAnc, "14")) {
          return;
       }
       p0.setNotifyOnInlineViewLayout(p1);
       return;
    }
    public void setNumberOfLines(ReactTextView p0,int p1){
       ReactTextAnchorViewManager reactTextAnc = ReactTextAnchorViewManager.class;
       if (PatchProxy.isSupport(reactTextAnc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactTextAnc, "1")) {
          return;
       }
       p0.setNumberOfLines(p1);
       return;
    }
    public void setSelectable(ReactTextView p0,boolean p1){
       ReactTextAnchorViewManager reactTextAnc = ReactTextAnchorViewManager.class;
       if (PatchProxy.isSupport(reactTextAnc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactTextAnc, "5")) {
          return;
       }
       p0.setTextIsSelectable(p1);
       return;
    }
    public void setSelectionColor(ReactTextView p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextAnchorViewManager.class, "6")) {
          return;
       }
       if (p1 == null) {
          p0.setHighlightColor(d.b(p0.getContext()));
       }else {
          p0.setHighlightColor(p1.intValue());
       }
       return;
    }
    public void setTextAlignVertical(ReactTextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactTextAnchorViewManager.class, "4")) {
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
}
