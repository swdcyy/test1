package com.kwai.video.clipkit.watermark.ClipWatermark;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.clipkit.watermark.WatermarkText;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Exception;
import java.io.IOException;
import com.kwai.video.clipkit.ClipConstant$WatermarkContentAlign;
import com.kwai.video.clipkit.ClipConstant$WatermarkTextPosition;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.watermark.WatermarkAnimation;
import java.util.List;
import java.lang.Integer;
import java.lang.Float;
import com.kwai.video.clipkit.watermark.WatermarkTextMargin;

public class ClipWatermark	// class@001b05
{
    public int alphaInfo;
    public List animations;
    public int fileHeight;
    public int fileWidth;
    public String path;
    public Point scale;
    public double scaleX;
    public double scaleY;
    public double startTime;
    public WatermarkText text;
    public ClipConstant$WatermarkContentAlign watermarkContentAlign;
    public ClipConstant$WatermarkTextPosition watermarkTextPosition;

    public void ClipWatermark(String p0,String p1){
       super();
       this.scaleX = 0;
       this.scaleY = 0;
       this.path = p0;
       WatermarkText watermarkTex = new WatermarkText();
       this.text = watermarkTex;
       watermarkTex.setText(p1);
       ArrayList uArrayList = new ArrayList();
       try{
          this.animations = uArrayList;
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2UtilsV2.openAnimatedSubAsset(p0);
          this.fileWidth = EditorSdk2UtilsV2.getAnimatedSubAssetWidth(uAnimatedSub);
          this.fileHeight = EditorSdk2UtilsV2.getAnimatedSubAssetWidth(uAnimatedSub);
       }catch(java.io.IOException e4){
          e4.printStackTrace();
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
          e4.printStackTrace();
       }
       this.startTime = 0;
       this.watermarkContentAlign = ClipConstant$WatermarkContentAlign.RIGHT;
       this.watermarkTextPosition = ClipConstant$WatermarkTextPosition.BOTTOM;
       return;
    }
    public static ClipWatermark getGifWatermark(String p0,String p1){
       ClipWatermark obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipWatermark.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipWatermark(p0, p1);
       WatermarkAnimation[] gifAnimation = WatermarkAnimation.getGifAnimations();
       for (int i = 0; i < gifAnimation.length; i++) {
          obj.addAnimation(gifAnimation[i]);
       }
       obj.setTextSize(0x41f00000);
       return obj;
    }
    public void addAnimation(WatermarkAnimation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipWatermark.class, "2")) {
          return;
       }
       this.animations.add(p0);
       return;
    }
    public int getAlphaInfo(){
       return this.alphaInfo;
    }
    public List getAnimations(){
       return this.animations;
    }
    public int getFileHeight(){
       return this.fileHeight;
    }
    public int getFileWidth(){
       return this.fileWidth;
    }
    public String getPath(){
       return this.path;
    }
    public double getScaleX(){
       return this.scaleX;
    }
    public double getScaleY(){
       return this.scaleY;
    }
    public double getStartTime(){
       return this.startTime;
    }
    public ClipConstant$WatermarkContentAlign getWatermarkContentAlign(){
       return this.watermarkContentAlign;
    }
    public WatermarkText getWatermarkText(){
       return this.text;
    }
    public ClipConstant$WatermarkTextPosition getWatermarkTextPosition(){
       return this.watermarkTextPosition;
    }
    public void setAlphaInfo(int p0){
       this.alphaInfo = p0;
    }
    public void setPath(String p0){
       this.path = p0;
    }
    public void setScale(double p0,double p1){
       this.scaleX = p0;
       this.scaleY = p1;
    }
    public void setStartTime(double p0){
       this.startTime = p0;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipWatermark.class, "3")) {
          return;
       }
       this.text.setText(p0);
       return;
    }
    public void setTextColor(int p0){
       ClipWatermark uClipWaterma = ClipWatermark.class;
       if (PatchProxy.isSupport(uClipWaterma) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uClipWaterma, "5")) {
          return;
       }
       this.text.setTextColor(p0);
       return;
    }
    public void setTextSize(float p0){
       ClipWatermark uClipWaterma = ClipWatermark.class;
       if (PatchProxy.isSupport(uClipWaterma) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uClipWaterma, "4")) {
          return;
       }
       this.text.setFontSize(p0);
       return;
    }
    public void setWatermarkContentAlign(ClipConstant$WatermarkContentAlign p0){
       this.watermarkContentAlign = p0;
    }
    public void setWatermarkTextMargin(WatermarkTextMargin p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipWatermark.class, "6")) {
          return;
       }
       if (p0 != null) {
          this.text.getTextMargin().setLeftMargin(p0.getLeftMargin());
          this.text.getTextMargin().setRightMargin(p0.getRightMargin());
          this.text.getTextMargin().setTopMargin(p0.getTopMargin());
          this.text.getTextMargin().setBottomMargin(p0.getBottomMargin());
       }
       return;
    }
    public void setWatermarkTextPosition(ClipConstant$WatermarkTextPosition p0){
       this.watermarkTextPosition = p0;
    }
}
