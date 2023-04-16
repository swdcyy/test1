package com.kwai.video.ksspark.model.ReplaceableAsset;
import java.lang.String;
import java.lang.Object;

public class ReplaceableAsset	// class@000934
{
    public long assetID;
    public String cloudEffectReturnMediaType;
    public String cloudEffectServiceType;
    public double fixPlayBackPtsStart;
    public int height;
    public String path;
    public double playBackPtsStart;
    public double renderPosDuration;
    public double scaleX;
    public double scaleY;
    public int width;

    public void ReplaceableAsset(long p0,int p1,int p2,double p3,double p4,double p5,double p6,String p7){
       super();
       this.assetID = p0;
       this.width = p1;
       this.height = p2;
       this.playBackPtsStart = p3;
       this.renderPosDuration = p4;
       this.scaleX = p5;
       this.scaleY = p6;
       this.path = p7;
    }
    public long getAssetID(){
       return this.assetID;
    }
    public String getCloudEffectReturnMediaType(){
       return this.cloudEffectReturnMediaType;
    }
    public String getCloudEffectServiceType(){
       return this.cloudEffectServiceType;
    }
    public double getFixPlayBackPtsStart(){
       return this.fixPlayBackPtsStart;
    }
    public int getHeight(){
       return this.height;
    }
    public String getPath(){
       return this.path;
    }
    public double getPlayBackPtsStart(){
       return this.playBackPtsStart;
    }
    public double getRenderPosDuration(){
       return this.renderPosDuration;
    }
    public double getScaleX(){
       return this.scaleX;
    }
    public double getScaleY(){
       return this.scaleY;
    }
    public int getWidth(){
       return this.width;
    }
    public void setAssetID(long p0){
       this.assetID = p0;
    }
    public void setFixPlayBackPtsStart(double p0){
       this.fixPlayBackPtsStart = p0;
    }
    public void setHeight(int p0){
       this.height = p0;
    }
    public void setPath(String p0){
       this.path = p0;
    }
    public void setPlayBackPtsStart(double p0){
       this.playBackPtsStart = p0;
    }
    public void setRenderPosDuration(double p0){
       this.renderPosDuration = p0;
    }
    public void setScaleX(double p0){
       this.scaleX = p0;
    }
    public void setScaleY(double p0){
       this.scaleY = p0;
    }
    public void setWidth(int p0){
       this.width = p0;
    }
}
