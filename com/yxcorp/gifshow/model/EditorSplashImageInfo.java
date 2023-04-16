package com.yxcorp.gifshow.model.EditorSplashImageInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import ekd.b0;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import lnc.r1;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import android.content.Context;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import java.lang.Float;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.r5;
import lnc.u6;
import com.yxcorp.gifshow.model.RectInfo;

public class EditorSplashImageInfo implements Serializable	// class@001e06
{
    public int mEditorSplashType;
    public FlexScreenStatusData mFlexScreenStatusData;
    public RectInfo mMainRectInfo;
    public int mPlayerViewHeight;
    public int mPlayerViewWidth;
    public int mRotation;
    public int mScreenDisplayHeight;
    public int mScreenDisplayWidth;
    public int mScreenRealHeight;
    public RectInfo mSmallRectInfo;
    public String mSplashImageBitmapKey;
    public final String mSplashImageFilePath;
    public int mStatusBarHeight;
    public static final long serialVersionUID = 0x39f1c2784efeeac5;

    public void EditorSplashImageInfo(String p0,String p1){
       super();
       this.mEditorSplashType = 0;
       this.mRotation = 0;
       this.mSplashImageBitmapKey = p0;
       this.mSplashImageFilePath = p1;
    }
    public static void a(b0 p0,EditorSplashImageInfo p1,Activity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, EditorSplashImageInfo.class, "15")) {
          return;
       }
       b0 a = p0.a;
       p0 = p0.b;
       int i = 0;
       if (p1.isLandscape()) {
          a = p0;
          p0 = a;
       }
       if (a != null && p0 != null) {
          i = r1.a(a, p0, (float)n.k(p2), (float)r1.b(p2));
          p1.mPlayerViewWidth = i.b;
          p1.mPlayerViewHeight = i.c;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditorSplashImageInfo", "fillSplashImageParam splashImageWidth:"+a+",splashImageHeight:"+p0+",playerViewSize:"+i+"EditorSplashImageInfo:"+p1, objArray);
       return;
    }
    public static void fillScreenParam(EditorSplashImageInfo p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSplashImageInfo.class, "12")) {
          return;
       }
       p0.mScreenRealHeight = n.w(p1);
       p0.mScreenDisplayHeight = r1.b(p1);
       p0.mStatusBarHeight = n.A(p1);
       p0.mScreenDisplayWidth = n.k(p1);
       Object[] objArray = new Object[0];
       a.D().w("EditorSplashImageInfo", "fillScreenParam mScreenRealHeight:"+p0.mScreenRealHeight+",mScreenDisplayHeight"+p0.mScreenDisplayHeight+",mStatusBarHeight:"+p0.mStatusBarHeight+",mScreenDisplayWidth:"+p0.mScreenDisplayWidth, objArray);
       return;
    }
    public static void fillSplashImageParam(Bitmap p0,String p1,EditorSplashImageInfo p2,Activity p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, EditorSplashImageInfo.class, "13")) {
          return;
       }
       if (BitmapUtil.I(p0)) {
          EditorSplashImageInfo.a(new b0(p0.getWidth(), p0.getHeight()), p2, p3);
       }else if(!TextUtils.x(p1) && b.S(new File(p1))){
          EditorSplashImageInfo.a(BitmapUtil.E(p1), p2, p3);
       }
       return;
    }
    public static EditorSplashImageInfo generateEditorSplashImageInfo(float p0,float p1,b0 p2,int p3,FlexScreenStatusData p4){
       EditorSplashImageInfo obj;
       Size size = null;
       if (PatchProxy.isSupport(EditorSplashImageInfo.class)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),p2,Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, size, EditorSplashImageInfo.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new EditorSplashImageInfo("", "");
       obj.mRotation = p3;
       p3 = 0;
       if (!p0 - p3 || (p1 - p3 && p4 != null)) {
          if (!PatchProxy.isSupport(EditorSplashImageInfo.class) || !PatchProxy.applyVoidFourRefs(p2, obj, Float.valueOf(p0), Float.valueOf(p1), null, EditorSplashImageInfo.class, "14")) {
             b0 a = p2.a;
             p2 = p2.b;
             if (obj.isLandscape()) {
                a = p2;
                p2 = a;
             }
             if (a != null && p2 != null) {
                size = r1.a(a, p2, p0, p1);
                obj.mPlayerViewWidth = size.b;
                obj.mPlayerViewHeight = size.c;
             }
             Object[] objArray1 = new Object[0];
             a.D().w("EditorSplashImageInfo", "fillSplashImageParam splashImageWidth:"+a+",splashImageHeight:"+p2+",playerViewSize:"+size+"EditorSplashImageInfo:"+obj, objArray1);
          }
          obj.setFlexScreenStatusData(p4);
       }
    label_00be :
       return obj;
    }
    public static EditorSplashImageInfo generateEditorSplashImageInfo(Activity p0,Bitmap p1,String p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, EditorSplashImageInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p0 == null) {
          return new EditorSplashImageInfo(obj, obj);
       }
       String str = (p1 != null)? r5.b().c(p1): obj;
       if (p2 != null) {
          obj = p2;
       }
       EditorSplashImageInfo uEditorSplas = new EditorSplashImageInfo(str, obj);
       EditorSplashImageInfo.fillSplashImageParam(p1, p2, uEditorSplas, p0);
       EditorSplashImageInfo.fillScreenParam(uEditorSplas, p0);
       uEditorSplas.setFlexScreenStatusData(u6.a(p0, 0));
       return uEditorSplas;
    }
    public static EditorSplashImageInfo generateEditorSplashImageInfo(Activity p0,b0 p1,int p2){
       EditorSplashImageInfo obj;
       if (PatchProxy.isSupport(EditorSplashImageInfo.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, EditorSplashImageInfo.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new EditorSplashImageInfo("", "");
       obj.mRotation = p2;
       if (p0 == null) {
          return obj;
       }else {
          EditorSplashImageInfo.a(p1, obj, p0);
          EditorSplashImageInfo.fillScreenParam(obj, p0);
          obj.setFlexScreenStatusData(u6.a(p0, 0));
          return obj;
       }
    }
    public static EditorSplashImageInfo generateEditorSplashImageInfoWithBitmap(int p0,Activity p1,Bitmap p2){
       if (PatchProxy.isSupport(EditorSplashImageInfo.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, null, EditorSplashImageInfo.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2 == null || p1 == null) {
          return new EditorSplashImageInfo("", "");
       }else {
          EditorSplashImageInfo uEditorSplas = new EditorSplashImageInfo(r5.b().c(p2), "");
          uEditorSplas.mRotation = p0;
          EditorSplashImageInfo.fillSplashImageParam(p2, "", uEditorSplas, p1);
          EditorSplashImageInfo.fillScreenParam(uEditorSplas, p1);
          uEditorSplas.setFlexScreenStatusData(u6.a(p1, 0));
          return uEditorSplas;
       }
    }
    public static EditorSplashImageInfo generateEditorSplashImageInfoWithBitmap(Activity p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSplashImageInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSplashImageInfo.generateEditorSplashImageInfoWithBitmap(0, p0, p1);
    }
    public static EditorSplashImageInfo generateEditorSplashImageInfoWithBitmap(Activity p0,Bitmap p1,int p2){
       if (PatchProxy.isSupport(EditorSplashImageInfo.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, EditorSplashImageInfo.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null || p0 == null) {
          return new EditorSplashImageInfo("", "");
       }else {
          EditorSplashImageInfo uEditorSplas = new EditorSplashImageInfo(r5.b().c(p1), "");
          uEditorSplas.mEditorSplashType = p2;
          EditorSplashImageInfo.fillScreenParam(uEditorSplas, p0);
          uEditorSplas.setFlexScreenStatusData(u6.a(p0, 0));
          return uEditorSplas;
       }
    }
    public static EditorSplashImageInfo generateEditorSplashImageInfoWithBitmap(Size p0,Activity p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSplashImageInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p1 == null || p0 == null) {
          return new EditorSplashImageInfo(obj, obj);
       }
       EditorSplashImageInfo uEditorSplas = new EditorSplashImageInfo(p0.toString(), obj);
       EditorSplashImageInfo.a(new b0(p0.b, p0.c), uEditorSplas, p1);
       EditorSplashImageInfo.fillScreenParam(uEditorSplas, p1);
       uEditorSplas.setFlexScreenStatusData(u6.a(p1, 0));
       return uEditorSplas;
    }
    public static EditorSplashImageInfo generateEditorSplashImageWithFilePath(Activity p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSplashImageInfo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSplashImageInfo.generateEditorSplashImageWithFilePath(p0, p1, 0);
    }
    public static EditorSplashImageInfo generateEditorSplashImageWithFilePath(Activity p0,String p1,int p2){
       EditorSplashImageInfo obj;
       if (PatchProxy.isSupport(EditorSplashImageInfo.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, EditorSplashImageInfo.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!TextUtils.x(p1) && (!b.S(new File(p1)) || p0 == null)) {
          obj = new EditorSplashImageInfo("", "");
          obj.mEditorSplashType = p2;
       }else {
          obj = new EditorSplashImageInfo("", p1);
          obj.mEditorSplashType = p2;
          EditorSplashImageInfo.fillSplashImageParam(null, p1, obj, p0);
          EditorSplashImageInfo.fillScreenParam(obj, p0);
          obj.setFlexScreenStatusData(u6.a(p0, 0));
       }
       return obj;
    }
    public boolean enableAdjustPosition(){
       boolean b = (this.mScreenDisplayWidth > null && (this.mScreenDisplayHeight > null && (this.mScreenRealHeight > null && (this.mPlayerViewWidth > null && this.mPlayerViewHeight > null))))? true: false;
       return b;
    }
    public int getEditorSplashType(){
       return this.mEditorSplashType;
    }
    public FlexScreenStatusData getFlexScreenStatusData(){
       return this.mFlexScreenStatusData;
    }
    public RectInfo getMainRectInfo(){
       return this.mMainRectInfo;
    }
    public int getPlayerViewHeight(){
       return this.mPlayerViewHeight;
    }
    public int getPlayerViewWidth(){
       return this.mPlayerViewWidth;
    }
    public int getRotation(){
       return this.mRotation;
    }
    public int getScreenDisplayHeight(){
       return this.mScreenDisplayHeight;
    }
    public int getScreenDisplayWidth(){
       return this.mScreenDisplayWidth;
    }
    public int getScreenRealHeight(){
       return this.mScreenRealHeight;
    }
    public RectInfo getSmallRectInfo(){
       return this.mSmallRectInfo;
    }
    public String getSplashImageBitmapKey(){
       return this.mSplashImageBitmapKey;
    }
    public String getSplashImageFilePath(){
       return this.mSplashImageFilePath;
    }
    public int getStatusBarHeight(){
       return this.mStatusBarHeight;
    }
    public boolean isLandscape(){
       EditorSplashImageInfo tmRotation = this.mRotation;
       boolean b = (tmRotation == 90 || tmRotation == 270)? true: false;
       return b;
    }
    public void setEditorSplashType(int p0){
       this.mEditorSplashType = p0;
    }
    public void setFlexScreenStatusData(FlexScreenStatusData p0){
       this.mFlexScreenStatusData = p0;
    }
    public void setMainRectInfo(RectInfo p0){
       this.mMainRectInfo = p0;
    }
    public void setRotation(int p0){
       this.mRotation = p0;
    }
    public void setSmallRectInfo(RectInfo p0){
       this.mSmallRectInfo = p0;
    }
    public void setSplashImageBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSplashImageInfo.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.mSplashImageBitmapKey)) {
          r5.b().d(this.mSplashImageBitmapKey);
       }
       this.mSplashImageBitmapKey = r5.b().c(p0);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditorSplashImageInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EditorSplashImageInfo{mSplashImageBitmapKey=\'"+this.mSplashImageBitmapKey+'''+", mSplashImageFilePath=\'"+this.mSplashImageFilePath+'''+", mScreenRealHeight="+this.mScreenRealHeight+", mScreenDisplayHeight="+this.mScreenDisplayHeight+", mScreenDisplayWidth="+this.mScreenDisplayWidth+", mStatusBarHeight="+this.mStatusBarHeight+", mPlayerViewWidth="+this.mPlayerViewWidth+", mPlayerViewHeight="+this.mPlayerViewHeight+", mEditorSplashType="+this.mEditorSplashType+", mRotation="+this.mRotation+'}';
    }
}
