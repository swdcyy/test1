package com.yxcorp.gifshow.media.watermark.a;
import y6b.r;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import lnc.a1;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import nxc.d;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Math;
import android.text.TextPaint;
import android.graphics.Typeface;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import y6b.o;
import android.graphics.Paint$FontMetrics;
import android.text.Layout;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import ekd.k1;
import qkd.b;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import tkd.b;
import tkd.d;
import h69.d;
import com.kwai.video.editorsdk2.EditorSdk2InternalErrorException;
import java.lang.Throwable;
import java.lang.Double;
import java.lang.Integer;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;

public class a implements r	// class@001d2b
{
    public String a;
    public int b;
    public int c;
    public float d;
    public Bitmap e;
    public Bitmap f;
    public d g;
    public final File h;
    public final File i;

    public void a(int p0,int p1,String p2,String p3,String p4){
       super();
       this.d = 0;
       this.h = new File(b.a(-1504323719).o(), "logo_bmp.png");
       this.i = new File(b.a(-1504323719).o(), "label_bmp.png");
       this.b = p0;
       this.c = p1;
       String str = PatchProxy.applyThreeRefs(p2, p3, p4, null, a.class, "2");
       if (str != PatchProxyResult.class) {
       }else if(!TextUtils.isEmpty(p4)){
          str = a1.p(0x7f10516c)+p4;
       }else if(TextUtils.equals(p3, QCurrentUser.me().getId())){
          str = (!TextUtils.isEmpty(p2))? a1.r(R.string.arg_RES_7f10516e, p2): a1.r(R.string.arg_RES_7f10516e, p3);
       }else if(!TextUtils.isEmpty(p2)){
          str = "@"+p2;
       }else {
          str = "@"+p3;
       }
       this.a = str;
       return;
    }
    public boolean a(){
       Bitmap uBitmap;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, uoa, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       this.g = new d();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          this.e = BitmapFactory.decodeResource(a.a().a().getResources(), 0x7f08106d);
          obj = this.c;
          a tb = this.b;
          float f = 750.00f;
          int i = (obj < tb)? 0x44a6c000: 0x443b8000;
          if ((float)Math.max(obj, tb) - f >= 0) {
             f = i;
          }
          float f1 = (float)this.b / f;
          this.d = f1;
          if (!f1) {
             this.d = 0x3f800000;
          }
          String str = "@";
          Paint$FontMetrics obj1 = PatchProxy.apply(objArray, this, uoa, "3");
          if (obj1 != patchProxyRe) {
             uBitmap = obj1;
          }else {
             TextPaint textPaint = new TextPaint(true);
             textPaint.setTypeface(Typeface.defaultFromStyle(true));
             textPaint.setTextSize((this.d * 22.00f));
             textPaint.setTextAlign(Paint$Align.LEFT);
             textPaint.setColor(-1);
             textPaint.setStyle(Paint$Style.FILL);
             textPaint.setShadowLayer((float)o.n, 0, (float)o.p, a1.a(R.color.arg_RES_7f062038));
             obj1 = textPaint.getFontMetrics();
             Bitmap uBitmap1 = Bitmap.createBitmap((int)Layout.getDesiredWidth(this.a, textPaint), (int)((obj1.descent - obj1.ascent) - obj1.leading), Bitmap$Config.ARGB_8888);
             Canvas uCanvas = new Canvas(uBitmap1);
             if ((this.a).startsWith(str)) {
                uCanvas.drawText(str, 0, ((- obj1.ascent) - (obj1.descent / 2.00f)), textPaint);
                uCanvas.drawText((this.a).substring(true), textPaint.measureText(str), (- obj1.ascent), textPaint);
             }else {
                uCanvas.drawText(this.a, 0, (- obj1.ascent), textPaint);
             }
             uBitmap = uBitmap1;
          }
          this.f = uBitmap;
       }
       a tg = this.g;
       long l = k1.t(tg.a);
       try{
          tg.c = l;
          b.q(this.h);
          b.q(this.i);
          BitmapUtil.Q(this.e, this.h.getAbsolutePath(), 100);
          BitmapUtil.Q(this.f, this.i.getAbsolutePath(), 100);
          this.g.b = 7;
          return true;
       }catch(java.io.IOException e0){
          this.g.b = 8;
          return false;
       }
    }
    public EditorSdk2V2$AnimatedSubAsset[] b(EditorSdk2V2$VideoEditorProject p0,boolean p1){
       Object obj1;
       EditorSdk2V2$VideoEditorProject obj2;
       double d;
       double d1;
       Object obj = this;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj1 = p0;
          obj2 = PatchProxy.applyTwoRefs(obj1, Boolean.valueOf(p1), obj, uoa, "4");
          if (obj2 != PatchProxyResult.class) {
             return obj2;
          }
       }else {
          obj1 = p0;
       }
       obj2 = (!EditorSdk2UtilsV2.videoProjectPrivateDataLoaded(p0))? EditorSdk2UtilsV2.loadProject(p0): obj1;
       try{
          if (p1) {
             d = (double)obj2.projectOutputWidth();
             d1 = (double)obj2.projectOutputHeight();
          }else {
             d = (double)d.a(-223655702).H6(obj2);
             d1 = (double)d.a(-223655702).Yy(obj2);
          }
          double computedDura = EditorSdk2UtilsV2.getComputedDuration(obj2);
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2UtilsV2.openAnimatedSubAsset(obj.h.getAbsolutePath());
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub1 = EditorSdk2UtilsV2.openAnimatedSubAsset(obj.i.getAbsolutePath());
          a d2 = obj.d;
          double d3 = (double)d2 * 26.00f;
          double d4 = (double)d2 * 10.00f;
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub2 = this.d(uAnimatedSub, computedDura, d, d1, d3, d3, EditorSdk2UtilsV2.getAnimatedSubAssetHeight(uAnimatedSub1), d4);
          EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub3 = new EditorSdk2V2$AnimatedSubAsset[]{uAnimatedSub2,this.c(uAnimatedSub1, computedDura, d, d1, d3, d3, (int)((float)EditorSdk2UtilsV2.getAnimatedSubAssetHeight(uAnimatedSub) * obj.d), d4)};
          return uAnimatedSub3;
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
          throw new EditorSdk2InternalErrorException("Failed to parse protobuf object", e0);
       }
    }
    public final EditorSdk2V2$AnimatedSubAsset c(EditorSdk2V2$AnimatedSubAsset p0,double p1,double p2,double p3,double p4,double p5,int p6,double p7){
       Minecraft$PropertyKeyFrame obj;
       object oobject = p0;
       double d = p1;
       a uoa = a.class;
       int i = 8;
       int i1 = 7;
       int i2 = 6;
       int i3 = 4;
       int i4 = 3;
       int i5 = 1;
       int i6 = 0;
       int i7 = 2;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i];
          objArray[i6] = oobject;
          objArray[i5] = Double.valueOf(p1);
          objArray[i7] = Double.valueOf(p2);
          objArray[i4] = Double.valueOf(p3);
          objArray[i3] = Double.valueOf(p4);
          objArray[5] = Double.valueOf(p5);
          objArray[i2] = Integer.valueOf(p6);
          objArray[i1] = Double.valueOf(p7);
          obj = PatchProxy.apply(objArray, this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i8 = this;
       }
       int animatedSubA = EditorSdk2UtilsV2.getAnimatedSubAssetWidth(p0);
       int animatedSubA1 = EditorSdk2UtilsV2.getAnimatedSubAssetHeight(p0);
       oobject.setDisplayRange(EditorSdk2Utils.createTimeRange(0, d));
       Minecraft$PropertyKeyFrame propertyKeyF = new Minecraft$PropertyKeyFrame();
       propertyKeyF.setDuration(4.60f);
       propertyKeyF.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
       double d1 = ((p4 + ((double)animatedSubA / 2.00f)) * 100.00f) / p2;
       propertyKeyF.assetTransform().setPositionX(d1);
       double d2 = ((((p5 + (double)p6) + ((double)animatedSubA1 / 2.00f)) + p7) / p3) * 100.00f;
       propertyKeyF.assetTransform().setPositionY(d2);
       propertyKeyF.assetTransform().setOpacity(0);
       Minecraft$PropertyKeyFrame propertyKeyF1 = new Minecraft$PropertyKeyFrame();
       propertyKeyF1.setDuration(0x3fd999999999999a);
       propertyKeyF1.setAssetTransform(propertyKeyF.assetTransform().clone());
       Minecraft$PropertyKeyFrame propertyKeyF2 = new Minecraft$PropertyKeyFrame();
       propertyKeyF2.setAssetTransform(propertyKeyF1.assetTransform().clone());
       propertyKeyF2.assetTransform().setOpacity(100.00f);
       Minecraft$PropertyKeyFrame propertyKeyF3 = new Minecraft$PropertyKeyFrame();
       Minecraft$PropertyKeyFrame propertyKeyF4 = propertyKeyF1;
       propertyKeyF3.setDuration(0x3fe0000000000000);
       propertyKeyF3.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
       propertyKeyF3.assetTransform().setPositionX(((((p2 - (double)(animatedSubA / 2)) - p4) * 100.00f) / p2));
       propertyKeyF3.assetTransform().setPositionY(((((p3 - (double)(animatedSubA1 / 2)) - p5) * 100.00f) / p3));
       obj = new Minecraft$PropertyKeyFrame();
       obj.setDuration(4.10f);
       obj.setAssetTransform(propertyKeyF3.assetTransform().clone());
       Minecraft$PropertyKeyFrame propertyKeyF5 = new Minecraft$PropertyKeyFrame();
       propertyKeyF5.setDuration(0x3fd999999999999a);
       propertyKeyF5.setAssetTransform(obj.assetTransform().clone());
       Minecraft$PropertyKeyFrame propertyKeyF6 = propertyKeyF3;
       propertyKeyF5.assetTransform().setOpacity(0);
       propertyKeyF1 = new Minecraft$PropertyKeyFrame();
       propertyKeyF1.setAssetTransform(propertyKeyF5.assetTransform().clone());
       propertyKeyF1.assetTransform().setOpacity(100.00f);
       propertyKeyF2 = new Minecraft$PropertyKeyFrame();
       propertyKeyF2.setDuration(0x3fe0000000000000);
       propertyKeyF2.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
       propertyKeyF2.assetTransform().setPositionX(d1);
       propertyKeyF2.assetTransform().setPositionY(d2);
       Minecraft$PropertyKeyFrame propertyKeyF7 = new Minecraft$PropertyKeyFrame();
       propertyKeyF7.setDuration(d);
       propertyKeyF7.setAssetTransform(propertyKeyF2.assetTransform().clone());
       Minecraft$PropertyKeyFrame[] propertyKeyF8 = new Minecraft$PropertyKeyFrame[9];
       propertyKeyF8[0] = propertyKeyF;
       propertyKeyF8[1] = propertyKeyF4;
       propertyKeyF8[2] = propertyKeyF2;
       propertyKeyF8[3] = propertyKeyF6;
       propertyKeyF8[4] = obj;
       propertyKeyF8[5] = propertyKeyF5;
       propertyKeyF8[6] = propertyKeyF1;
       propertyKeyF8[7] = propertyKeyF2;
       propertyKeyF8[8] = propertyKeyF7;
       oobject.setKeyFrames(propertyKeyF8);
       return oobject;
    }
    public final EditorSdk2V2$AnimatedSubAsset d(EditorSdk2V2$AnimatedSubAsset p0,double p1,double p2,double p3,double p4,double p5,int p6,double p7){
       Minecraft$PropertyKeyFrame obj1;
       Minecraft$PropertyKeyFrame obj = this;
       object oobject = p0;
       double d = p1;
       a uoa = a.class;
       int i = 8;
       int i1 = 7;
       int i2 = 6;
       int i3 = 5;
       int i4 = 4;
       int i5 = 3;
       int i6 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i];
          objArray[i6] = oobject;
          objArray[1] = Double.valueOf(p1);
          objArray[2] = Double.valueOf(p2);
          objArray[i5] = Double.valueOf(p3);
          objArray[i4] = Double.valueOf(p4);
          objArray[i3] = Double.valueOf(p5);
          objArray[i2] = Integer.valueOf(p6);
          objArray[i1] = Double.valueOf(p7);
          obj1 = PatchProxy.apply(objArray, obj, uoa, "5");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       int i7 = (int)((float)EditorSdk2UtilsV2.getAnimatedSubAssetWidth(p0) * obj.d);
       int i8 = (int)((float)EditorSdk2UtilsV2.getAnimatedSubAssetHeight(p0) * obj.d);
       oobject.setDisplayRange(EditorSdk2Utils.createTimeRange(0, d));
       Minecraft$PropertyKeyFrame propertyKeyF = new Minecraft$PropertyKeyFrame();
       propertyKeyF.setDuration(4.60f);
       propertyKeyF.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
       double d1 = (double)(obj.d * 100.00f);
       propertyKeyF.assetTransform().setScaleX(d1);
       propertyKeyF.assetTransform().setScaleY(d1);
       double d2 = (double)i7;
       double d3 = d2 / 2.00f;
       double d4 = ((p4 + d3) * 100.00f) / p2;
       propertyKeyF.assetTransform().setPositionX(d4);
       double d5 = ((p5 + ((double)i8 / 2.00f)) / p3) * 100.00f;
       propertyKeyF.assetTransform().setPositionY(d5);
       propertyKeyF.assetTransform().setOpacity(0);
       obj = new Minecraft$PropertyKeyFrame();
       obj.setDuration(0x3fd999999999999a);
       obj.setAssetTransform(propertyKeyF.assetTransform().clone());
       Minecraft$PropertyKeyFrame propertyKeyF1 = new Minecraft$PropertyKeyFrame();
       propertyKeyF1.setAssetTransform(obj.assetTransform().clone());
       propertyKeyF1.assetTransform().setOpacity(100.00f);
       Minecraft$PropertyKeyFrame propertyKeyF2 = new Minecraft$PropertyKeyFrame();
       Minecraft$PropertyKeyFrame propertyKeyF3 = propertyKeyF1;
       propertyKeyF2.setDuration(0x3fe0000000000000);
       propertyKeyF2.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
       propertyKeyF2.assetTransform().setScaleX(d1);
       propertyKeyF2.assetTransform().setScaleY(d1);
       Minecraft$PropertyKeyFrame propertyKeyF4 = propertyKeyF;
       double d6 = d5;
       d2 = ((((p2 + d3) - p4) - d2) * 100.00f) / p2;
       propertyKeyF2.assetTransform().setPositionX(d2);
       d = (((((p3 - (double)(i8 / 2)) - p5) - (double)p6) - p7) * 100.00f) / p3;
       propertyKeyF2.assetTransform().setPositionY(d);
       Minecraft$PropertyKeyFrame propertyKeyF5 = new Minecraft$PropertyKeyFrame();
       propertyKeyF5.setDuration(4.10f);
       propertyKeyF5.setAssetTransform(propertyKeyF2.assetTransform().clone());
       propertyKeyF5.assetTransform().setPositionX(d2);
       propertyKeyF5.assetTransform().setPositionY(d);
       Minecraft$PropertyKeyFrame propertyKeyF6 = new Minecraft$PropertyKeyFrame();
       propertyKeyF6.setDuration(0x3fd999999999999a);
       propertyKeyF6.setAssetTransform(propertyKeyF5.assetTransform().clone());
       propertyKeyF6.assetTransform().setOpacity(0);
       propertyKeyF1 = new Minecraft$PropertyKeyFrame();
       propertyKeyF1.setAssetTransform(propertyKeyF6.assetTransform().clone());
       propertyKeyF1.assetTransform().setOpacity(100.00f);
       propertyKeyF = new Minecraft$PropertyKeyFrame();
       propertyKeyF.setDuration(0x3fe0000000000000);
       propertyKeyF.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
       propertyKeyF.assetTransform().setScaleX(d1);
       propertyKeyF.assetTransform().setScaleY(d1);
       propertyKeyF.assetTransform().setPositionX((d4 - ((double)(i7 * 100) / p2)));
       propertyKeyF.assetTransform().setPositionX(d4);
       propertyKeyF.assetTransform().setPositionY(d6);
       obj1 = new Minecraft$PropertyKeyFrame();
       obj1.setDuration(p1);
       obj1.setAssetTransform(propertyKeyF.assetTransform().clone());
       obj1.assetTransform().setPositionX(d4);
       Minecraft$PropertyKeyFrame[] propertyKeyF7 = new Minecraft$PropertyKeyFrame[9];
       propertyKeyF7[0] = propertyKeyF4;
       propertyKeyF7[1] = obj;
       propertyKeyF7[2] = propertyKeyF3;
       propertyKeyF7[3] = propertyKeyF2;
       propertyKeyF7[4] = propertyKeyF5;
       propertyKeyF7[5] = propertyKeyF6;
       propertyKeyF7[6] = propertyKeyF1;
       propertyKeyF7[7] = propertyKeyF;
       propertyKeyF7[8] = obj1;
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = p0;
       uAnimatedSub.setKeyFrames(propertyKeyF7);
       return uAnimatedSub;
    }
    public void recycle(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       BitmapUtil.J(this.e);
       BitmapUtil.J(this.f);
       return;
    }
}
