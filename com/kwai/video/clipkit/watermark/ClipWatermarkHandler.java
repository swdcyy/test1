package com.kwai.video.clipkit.watermark.ClipWatermarkHandler;
import com.kwai.video.clipkit.ClipExportHandler;
import android.content.Context;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.util.List;
import java.lang.String;
import com.kwai.video.clipkit.watermark.ClipWatermark;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.clipkit.watermark.WatermarkSize;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import java.lang.Double;
import com.kwai.video.clipkit.ClipConstant$WatermarkTextPosition;
import com.kwai.video.clipkit.watermark.WatermarkText;
import com.kwai.video.clipkit.watermark.WatermarkTextMargin;
import java.lang.Math;
import com.kwai.video.clipkit.ClipConstant$WatermarkContentAlign;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.File;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import android.graphics.Bitmap;
import java.lang.Float;
import java.lang.Integer;
import android.text.TextPaint;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.clipkit.watermark.WatermarkAnimation;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import android.graphics.Point;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.util.ArrayList;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.clipkit.ClipExportException;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import java.io.IOException;
import com.kwai.video.clipkit.watermark.ClipWatermarkHandler$1;
import com.kwai.video.clipkit.ClipConstant$WatermarkPosition;
import java.lang.Enum;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.util.HashMap;
import java.util.Locale;

public class ClipWatermarkHandler extends ClipExportHandler	// class@001b07
{
    public double mScaleX;
    public double mScaleY;
    public List mWatermarkInfos;

    public void ClipWatermarkHandler(Context p0,EditorSdk2V2$VideoEditorProject p1,EditorSdk2$ExportOptions p2,List p3,String p4){
       super(p0, p1, p4, p2, 0);
       this.mWatermarkInfos = p3;
    }
    public final Minecraft$PropertyKeyFrame[] adjustPosition(ClipWatermark p0,Minecraft$PropertyKeyFrame[] p1,WatermarkSize p2){
       double d6;
       float f1;
       int i = p1;
       Minecraft$PropertyKeyFrame[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ClipWatermarkHandler.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Minecraft$PropertyKeyFrame[i.length];
       for (int i1 = 0; i1 < i.length; i1 = i1 + 1) {
          obj[i1] = new Minecraft$PropertyKeyFrame();
          obj[i1].setDuration(i[i1].duration());
          obj[i1].setAssetTransform(i[i1].assetTransform().clone());
          double d = 100.00f;
          double d1 = i[i1].assetTransform().scaleY() / d;
          double d2 = i[i1].assetTransform().scaleX() / d;
          double d3 = p2.getSubAssetHeight() * d1;
          double d4 = p2.getHeight().doubleValue() * d1;
          d1 = p2.getSubAssetWidth() * d2;
          double d5 = p2.getWidth().doubleValue() * d2;
          if (p0.getWatermarkTextPosition() == ClipConstant$WatermarkTextPosition.TOP) {
             float f = p0.getWatermarkText().getTextMargin().getBottomMargin() / 750.00f;
             d6 = d1;
             d2 = (double)f * Math.min(p2.getProjectHeight(), p2.getProjectWidth());
             d3 = d3 + d2;
             d3 = d3 / 2.00f;
             d3 = d3 / p2.getProjectHeight();
             d3 = d3 * 100.00f;
             double d7 = obj[i1].assetTransform().positionY() - d3;
             obj[i1].assetTransform().setPositionY(d7);
             d4 = d4 + d2;
             d4 = d4 / 2.00f;
             d4 = d4 / p2.getProjectHeight();
             d4 = d4 * 100.00f;
             d7 = i[i1].assetTransform().positionY() + d4;
             i[i1].assetTransform().setPositionY(d7);
          }else {
             d6 = d1;
             f1 = p0.getWatermarkText().getTextMargin().getTopMargin() / 750.00f;
             d1 = (double)f1 * Math.min(p2.getProjectHeight(), p2.getProjectWidth());
             d3 = d3 + d1;
             d3 = d3 / 2.00f;
             d3 = d3 / p2.getProjectHeight();
             d3 = d3 * 100.00f;
             d2 = obj[i1].assetTransform().positionY() + d3;
             obj[i1].assetTransform().setPositionY(d2);
             d4 = d4 + d1;
             d4 = d4 / 2.00f;
             d4 = d4 / p2.getProjectHeight();
             d4 = d4 * 100.00f;
             d2 = i[i1].assetTransform().positionY() - d4;
             i[i1].assetTransform().setPositionY(d2);
          }
          if (p0.getWatermarkContentAlign() == ClipConstant$WatermarkContentAlign.RIGHT) {
             f1 = p0.getWatermarkText().getTextMargin().getRightMargin() / 750.00f;
             d1 = (double)f1 * Math.min(p2.getProjectHeight(), p2.getProjectWidth());
             d = d5 + d1;
             if (d6 - d >= 0) {
                d3 = d6 - d5;
                d1 = d1 * 2.00f;
                d3 = d3 - d1;
                d3 = d3 / 2.00f;
                d3 = d3 / p2.getProjectWidth();
                d3 = d3 * 100.00f;
                d2 = obj[i1].assetTransform().positionX() + d3;
                obj[i1].assetTransform().setPositionX(d2);
             }else {
                d1 = d1 * 2.00f;
                d5 = d5 + d1;
                d5 = d5 - d6;
                d5 = d5 / 2.00f;
                d5 = d5 / p2.getProjectWidth();
                d5 = d5 * 100.00f;
                d2 = i[i1].assetTransform().positionX() + d5;
                i[i1].assetTransform().setPositionX(d2);
             }
          }else if(p0.getWatermarkContentAlign() == ClipConstant$WatermarkContentAlign.LEFT){
             f1 = p0.getWatermarkText().getTextMargin().getLeftMargin() / 750.00f;
             d1 = (double)f1 * Math.min(p2.getProjectHeight(), p2.getProjectWidth());
             d = d5 + d1;
             if (d6 - d >= 0) {
                d3 = d6 - d5;
                d1 = d1 * 2.00f;
                d3 = d3 - d1;
                d3 = d3 / 2.00f;
                d3 = d3 / p2.getProjectWidth();
                d3 = d3 * 100.00f;
                d2 = obj[i1].assetTransform().positionX() - d3;
                obj[i1].assetTransform().setPositionX(d2);
             }else {
                d1 = d1 * 2.00f;
                d5 = d5 + d1;
                d5 = d5 - d6;
                d5 = d5 / 2.00f;
                d5 = d5 / p2.getProjectWidth();
                d5 = d5 * 100.00f;
                d2 = i[i1].assetTransform().positionX() - d5;
                i[i1].assetTransform().setPositionX(d2);
             }
          }else {
             f1 = p0.getWatermarkText().getTextMargin().getLeftMargin() / 750.00f;
             d1 = (double)f1 * Math.min(p2.getProjectHeight(), p2.getProjectWidth());
             float f2 = p0.getWatermarkText().getTextMargin().getRightMargin() / 750.00f;
             d = (double)f2 * Math.min(p2.getProjectHeight(), p2.getProjectWidth());
             d1 = d1 - d;
             d1 = d1 / 2.00f;
             d1 = d1 / p2.getProjectWidth();
             d1 = d1 * 100.00f;
             double d8 = obj[i1].assetTransform().positionX() + d1;
             obj[i1].assetTransform().setPositionX(d8);
          }
          obj[i1].setTiming(i[i1].timing());
       }
       return obj;
    }
    public final void closeQuietly(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipWatermarkHandler.class, "17")) {
          return;
       }
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public final void closeQuietly(OutputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipWatermarkHandler.class, "16")) {
          return;
       }
       this.closeQuietly(p0);
       return;
    }
    public final boolean deleteQuietly(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipWatermarkHandler.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (p0.exists()) {
          try{
             p0.delete();
             KSClipLog.i("ClipExportHandler", "deleteQuietly delete "+p0.getAbsolutePath());
          }catch(java.lang.Exception e0){
             return e0;
          }
       }
       return true;
    }
    public final Bitmap fromText(float p0,String p1,int p2){
       TextPaint obj;
       if (PatchProxy.isSupport(ClipWatermarkHandler.class)) {
          obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), p1, Integer.valueOf(p2), this, ClipWatermarkHandler.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new TextPaint(1);
       obj.setTextAlign(Paint$Align.LEFT);
       obj.setTextSize(p0);
       obj.setColor(p2);
       obj.setStyle(Paint$Style.FILL);
       Paint$FontMetricsInt fontMetricsI = obj.getFontMetricsInt();
       p2 = (int)obj.measureText(p1);
       int i = fontMetricsI.descent - fontMetricsI.ascent;
       KSClipLog.i("ClipExportHandler", "watermark fromText width "+p2+" height "+i);
       Bitmap uBitmap = Bitmap.createBitmap(p2, i, Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(uBitmap);
       uCanvas.drawText(p1, 0, (float)(fontMetricsI.leading - fontMetricsI.ascent), obj);
       uCanvas.save();
       return uBitmap;
    }
    public final Minecraft$PropertyKeyFrame[] generateDynamicWatermark(ClipWatermark p0,WatermarkSize p1,EditorSdk2V2$AnimatedSubAsset p2){
       float f1;
       double d5;
       int i1;
       List list;
       double d6;
       double d7;
       ClipWatermarkHandler uClipWaterma = this;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ClipWatermarkHandler.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List animations = p0.getAnimations();
       Minecraft$PropertyKeyFrame[] propertyKeyF = new Minecraft$PropertyKeyFrame[(animations.size() * 2)];
       ClipConstant$WatermarkTextPosition watermarkTex = null;
       int i = 0;
       while (i < animations.size()) {
          Object obj1 = animations.get(i);
          double d = uClipWaterma.mScaleX - 0x3ff0000000000000;
          double d1 = obj1.getScaleX() + d;
          double d2 = uClipWaterma.mScaleY - 0x3ff0000000000000;
          d = obj1.getScaleY() + d2;
          obj1.setScale(d1, d);
          d2 = p1.getSubAssetWidth() * obj1.getScaleX();
          d1 = p1.getSubAssetHeight() * obj1.getScaleY();
          d = p1.getWidth().doubleValue() * obj1.getScaleX();
          double d3 = p1.getHeight().doubleValue() * obj1.getScaleY();
          double d4 = watermarkTex;
          float f = 750.00f;
          if (p0.getWatermarkTextPosition() == ClipConstant$WatermarkTextPosition.TOP) {
             f1 = p0.getWatermarkText().getTextMargin().getBottomMargin() / f;
             d5 = (double)f1;
             i1 = i;
             list = animations;
             d6 = Math.min(p1.getProjectHeight(), p1.getProjectWidth());
          }else {
             i1 = i;
             list = animations;
             f1 = p0.getWatermarkText().getTextMargin().getTopMargin() / 750.00f;
             d5 = (double)f1;
             d6 = Math.min(p1.getProjectHeight(), p1.getProjectWidth());
          }
          d5 = d5 * d6;
          d3 = d3 + d5;
          if (p0.getWatermarkContentAlign() == ClipConstant$WatermarkContentAlign.RIGHT) {
             f1 = p0.getWatermarkText().getTextMargin().getRightMargin() / 750.00f;
             d5 = (double)f1;
             d6 = Math.min(p1.getProjectHeight(), p1.getProjectWidth());
          }else if(p0.getWatermarkContentAlign() == ClipConstant$WatermarkContentAlign.LEFT){
             f1 = p0.getWatermarkText().getTextMargin().getLeftMargin() / 750.00f;
             d5 = (double)f1;
             d6 = Math.min(p1.getProjectHeight(), p1.getProjectWidth());
          }else {
             float f2 = 750.00f;
             f1 = p0.getWatermarkText().getTextMargin().getRightMargin() / f2;
             d7 = d1;
             d6 = (double)f1 * Math.min(p1.getProjectHeight(), p1.getProjectWidth());
             d = d + d6;
             float f3 = p0.getWatermarkText().getTextMargin().getLeftMargin() / f2;
             d1 = (double)f3 * Math.min(p1.getProjectHeight(), p1.getProjectWidth());
             d = d + d1;
          label_00f5 :
             double d8 = d;
             double duration = obj1.getDuration();
             Minecraft$PropertyKeyFrame propertyKeyF1 = new Minecraft$PropertyKeyFrame();
             propertyKeyF1.setDuration(duration);
             propertyKeyF1.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
             d7 = d7 + d3;
             Minecraft$PropertyKeyFrame propertyKeyF2 = propertyKeyF1;
             Minecraft$PropertyKeyFrame[] propertyKeyF3 = propertyKeyF;
             Minecraft$PropertyKeyFrame propertyKeyF4 = new Minecraft$PropertyKeyFrame();
             double d9 = d7;
             d4 = duration;
             Minecraft$PropertyKeyFrame propertyKeyF5 = propertyKeyF1;
             Object obj2 = obj1;
             this.setKeyFramePosition(obj1, propertyKeyF2, Math.max(d2, d8), d9, p1.getProjectWidth(), p1.getProjectHeight());
             propertyKeyF5.assetTransform().setOpacity((double)obj2.getOpacity().x);
             double d10 = obj2.getScaleX() * 100.00f;
             propertyKeyF5.assetTransform().setScaleX(d10);
             d10 = obj2.getScaleY() * 100.00f;
             propertyKeyF5.assetTransform().setScaleY(d10);
             propertyKeyF4.setDuration(0);
             propertyKeyF4.setAssetTransform(propertyKeyF5.assetTransform().clone());
             this.setKeyFramePosition(obj2, propertyKeyF4, Math.max(d2, d8), d9, p1.getProjectWidth(), p1.getProjectHeight());
             propertyKeyF4.assetTransform().setOpacity((double)obj2.getOpacity().y);
             Minecraft$PropertyKeyFrame propertyKeyF6 = propertyKeyF5;
             propertyKeyF6.setTiming(obj2.getTiming());
             propertyKeyF4.setTiming(obj2.getTiming());
             i = i1 * 2;
             propertyKeyF3[i] = propertyKeyF6;
             i = i + 1;
             propertyKeyF3[i] = propertyKeyF4;
             duration = d4 + d4;
             i = i1 + 1;
             uClipWaterma = this;
             propertyKeyF = propertyKeyF3;
             animations = list;
          }
          d5 = d5 * d6;
          d = d + d5;
          d7 = d1;
          goto label_00f5 ;
       }
       p2.setDisplayRange(EditorSdk2Utils.createTimeRange(p0.getStartTime(), watermarkTex));
       return propertyKeyF;
    }
    public final EditorSdk2V2$AnimatedSubAsset[] generateWatermark(EditorSdk2V2$VideoEditorProject p0,List p1){
       double d1;
       WatermarkSize obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipWatermarkHandler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (EditorSdk2UtilsV2.videoProjectPrivateDataLoaded(p0)) {
          p0 = EditorSdk2UtilsV2.loadProject(p0);
       }
       obj = new WatermarkSize();
       p0.setProjectOutputWidth(this.mExportOptions.width());
       p0.setProjectOutputHeight(this.mExportOptions.height());
       obj.setProjectWidth((double)EditorSdk2UtilsV2.getComputedWidth(p0));
       obj.setProjectHeight((double)EditorSdk2UtilsV2.getComputedHeight(p0));
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = 0;
       while (i1 < p1.size()) {
          ClipWatermark uClipWaterma = p1.get(i1);
          String str = null;
          if (uClipWaterma.getScaleX() - str && uClipWaterma.getScaleY() - str) {
             this.mScaleX = uClipWaterma.getScaleX();
             this.mScaleY = uClipWaterma.getScaleY();
          }else {
             double d2 = (double)Math.min(p0.projectOutputWidth(), p0.projectOutputHeight()) / 720.00f;
             this.mScaleX = d2;
             this.mScaleY = d2;
          }
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2UtilsV2.openAnimatedSubAsset(uClipWaterma.getPath());
          obj.setSubAssetWidth((double)EditorSdk2UtilsV2.getAnimatedSubAssetWidth(uAnimatedSub));
          obj.setSubAssetHeight((double)EditorSdk2UtilsV2.getAnimatedSubAssetHeight(uAnimatedSub));
          String[] stringArray = new String[]{"mp4"};
          if (this.matchFileType(uClipWaterma.getPath(), stringArray)) {
             uAnimatedSub.setAlphaInfo(uClipWaterma.getAlphaInfo());
             double d = 2.00f;
             if (uClipWaterma.getAlphaInfo() == Double.MIN_VALUE) {
                d1 = obj.getSubAssetWidth() / d;
                obj.setSubAssetWidth(d1);
             }else if(uClipWaterma.getAlphaInfo() == -101632822732513220000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f){
                d1 = obj.getProjectHeight() / d;
                obj.setSubAssetHeight(d1);
             }
          }
          EditorSdk2V2$AnimatedSubAsset textAsset = this.getTextAsset(uClipWaterma, obj);
          uAnimatedSub.setKeyFrames(this.generateDynamicWatermark(uClipWaterma, obj, uAnimatedSub));
          Minecraft$PropertyKeyFrame[] propertyKeyF = uAnimatedSub.keyFrames().toNormalArray();
          uArrayList.add(uAnimatedSub);
          if (textAsset != null) {
             textAsset.setKeyFrames(this.adjustPosition(uClipWaterma, propertyKeyF, obj));
             textAsset.setDisplayRange(uAnimatedSub.displayRange());
             uArrayList.add(textAsset);
          }
          i1 = i1 + 1;
       }
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1 = new EditorSdk2V2$AnimatedSubAsset[uArrayList.size()];
       for (; i < uArrayList.size(); i = i + 1) {
          uAnimatedSub1[i] = uArrayList.get(i);
       }
       return uAnimatedSub1;
    }
    public final EditorSdk2V2$AnimatedSubAsset getTextAsset(ClipWatermark p0,WatermarkSize p1){
       EditorSdk2V2$AnimatedSubAsset obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipWatermarkHandler.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (!TextUtils.isEmpty(p0.getWatermarkText().getText())) {
          float fontSize = p0.getWatermarkText().getFontSize();
          File uFile = new File(this.mApplicationContext.getFilesDir(), "Size_"+fontSize+"_watermark_label_bmp.png");
          Bitmap uBitmap = this.fromText(fontSize, p0.getWatermarkText().getText(), p0.getWatermarkText().getTextColor());
          int i = -100005;
          if (uBitmap == null) {
             this.notifyErrorCallback("getTextAsset", new ClipExportException(101, i, "text to bitmap failed"));
          }else if(!this.save(uBitmap, uFile)){
             this.notifyErrorCallback("getTextAsset", new ClipExportException(101, i, "bitmap to file failed"));
          }else {
             obj = EditorSdk2UtilsV2.openAnimatedSubAsset(uFile.getAbsolutePath());
             p1.setWidth(Double.valueOf((double)EditorSdk2UtilsV2.getAnimatedSubAssetWidth(obj)));
             p1.setHeight(Double.valueOf((double)EditorSdk2UtilsV2.getAnimatedSubAssetHeight(obj)));
          }
       }
       return obj;
    }
    public final boolean isJpgFile(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, this, ClipWatermarkHandler.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new String[]{"jpg","jpeg"};
       return this.matchFileType(p0, obj);
    }
    public final boolean matchFileType(String p0,String[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipWatermarkHandler.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.isEmpty(p0)) {
          p0 = this.toLowerCase(p0);
          int len = p1.length;
          int i = 0;
          while (i < len) {
             if (p0.endsWith(this.toLowerCase(p1[i]))) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public boolean run(){
       ClipExportHandler obj = PatchProxy.apply(null, this, ClipWatermarkHandler.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mProject;
       obj.setAnimatedSubAssets(this.generateWatermark(obj, this.mWatermarkInfos));
       if (this.mIsCancel == null) {
          return super.run();
       }
       KSClipLog.d("ClipExportHandler", "cancel,run return false");
       return false;
    }
    public boolean save(Bitmap p0,File p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipWatermarkHandler.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          this.deleteQuietly(p1);
          this.saveToFile(p0, p1.getAbsolutePath(), 100);
          return true;
       }catch(java.io.IOException e0){
          return false;
       }
    }
    public final void saveToFile(Bitmap p0,String p1,int p2){
       Bitmap$CompressFormat jPEG;
       if (PatchProxy.isSupport(ClipWatermarkHandler.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ClipWatermarkHandler.class, "11")) {
          return;
       }
       if (this.isJpgFile(this.toUpperCase(p1))) {
          jPEG = Bitmap$CompressFormat.JPEG;
       }else {
          String[] stringArray = new String[]{"png"};
          if (this.matchFileType(p1, stringArray)) {
             jPEG = Bitmap$CompressFormat.PNG;
          }else {
             throw new IOException("Unknown file extension");
          }
       }
       FileOutputStream uFileOutputS = new FileOutputStream(p1);
       p0.compress(jPEG, p2, uFileOutputS);
       this.closeQuietly(uFileOutputS);
       return;
    }
    public final void setKeyFramePosition(WatermarkAnimation p0,Minecraft$PropertyKeyFrame p1,double p2,double p3,double p4,double p5){
       double d = p4;
       double d1 = p5;
       ClipWatermarkHandler uClipWaterma = ClipWatermarkHandler.class;
       int i = 4;
       if (PatchProxy.isSupport(uClipWaterma)) {
          Object[] objArray = new Object[]{p0,p1,Double.valueOf(p2),Double.valueOf(p3),Double.valueOf(p4),Double.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uClipWaterma, "3")) {
             return;
          }
       }else {
          int i2 = this;
       }
       d = 100.00f;
       double d2 = (((p2 / 2.00f) + ((((double)p0.getMarginX() * 0x3ff0000000000000) / 750.00f) * Math.min(d1, d))) / d) * d;
       double d3 = (((p3 / 2.00f) + ((((double)p0.getMarginY() * 0x3ff0000000000000) / 750.00f) * Math.min(d1, d))) / d1) * d;
       int i1 = ClipWatermarkHandler$1.$SwitchMap$com$kwai$video$clipkit$ClipConstant$WatermarkPosition[p0.getWatermarkPosition().ordinal()];
       if (i1 != 1) {
          if (i1 != 2) {
             if (i1 != 3) {
                if (i1 != 4) {
                   p1.assetTransform().setPositionX((d - d2));
                   p1.assetTransform().setPositionY((d - d3));
                }else {
                   p1.assetTransform().setPositionX(d2);
                   p1.assetTransform().setPositionY((d - d3));
                }
             }else {
                p1.assetTransform().setPositionX((d - d2));
                p1.assetTransform().setPositionY(d3);
             }
          }else {
             p1.assetTransform().setPositionX(d2);
             p1.assetTransform().setPositionY(d3);
          }
       }else {
          p1.assetTransform().setPositionX(50.00f);
          p1.assetTransform().setPositionY(50.00f);
       }
       return;
    }
    public void setSessionId(String p0,ClipEditExtraInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipWatermarkHandler.class, "1")) {
          return;
       }
       if (p1 == null) {
          p1 = new ClipEditExtraInfo();
       }
       if (p1.appMap == null) {
          p1.appMap = new HashMap();
       }
       p1.appMap.put("videoType", String.valueOf(10));
       super.setSessionId(p0, p1);
       return;
    }
    public final String toLowerCase(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipWatermarkHandler.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          p0 = p0.toLowerCase(Locale.US);
       }
       return p0;
    }
    public final String toUpperCase(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipWatermarkHandler.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          p0 = p0.toUpperCase(Locale.US);
       }
       return p0;
    }
}
