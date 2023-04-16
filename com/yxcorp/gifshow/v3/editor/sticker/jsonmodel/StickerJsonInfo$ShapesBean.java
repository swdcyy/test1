package com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$FrameRate;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean$MetaBean;

public class StickerJsonInfo$ShapesBean implements Serializable	// class@001264
{
    public int disableLoopAnimation;
    public String firstFrameImageName;
    public StickerJsonInfo$FrameRate frameRate;
    public List frames;
    public String imageName;
    public boolean isOutputSequenceImage;
    public StickerJsonInfo$ShapesBean$MetaBean meta;
    public int resourceHeight;
    public int resourceWidth;
    public String sequenceImageName;
    public static final long serialVersionUID = 0xe5e1a70669cf9035;

    public void StickerJsonInfo$ShapesBean(){
       super();
    }
    public boolean disableLoopAnimation(){
       boolean b = (this.disableLoopAnimation != null)? true: false;
       return b;
    }
    public String getFirstFrameImageName(){
       return this.firstFrameImageName;
    }
    public StickerJsonInfo$FrameRate getFrameRate(){
       return this.frameRate;
    }
    public List getFrames(){
       return this.frames;
    }
    public String getImageName(){
       return this.imageName;
    }
    public StickerJsonInfo$ShapesBean$MetaBean getMeta(){
       return this.meta;
    }
    public int getResourceHeight(){
       return this.resourceHeight;
    }
    public int getResourceWidth(){
       return this.resourceWidth;
    }
    public String getSequenceImageName(){
       return this.sequenceImageName;
    }
    public boolean isOutputSequenceImage(){
       return this.isOutputSequenceImage;
    }
    public void setDisableLoopAnimation(int p0){
       this.disableLoopAnimation = p0;
    }
    public void setFirstFrameImageName(String p0){
       this.firstFrameImageName = p0;
    }
    public void setFrameRate(StickerJsonInfo$FrameRate p0){
       this.frameRate = p0;
    }
    public void setFrames(List p0){
       this.frames = p0;
    }
    public void setImageName(String p0){
       this.imageName = p0;
    }
    public void setIsOutputSequenceImage(boolean p0){
       this.isOutputSequenceImage = p0;
    }
    public void setMeta(StickerJsonInfo$ShapesBean$MetaBean p0){
       this.meta = p0;
    }
    public void setResourceHeight(int p0){
       this.resourceHeight = p0;
    }
    public void setResourceWidth(int p0){
       this.resourceWidth = p0;
    }
    public void setSequenceImageName(String p0){
       this.sequenceImageName = p0;
    }
}
