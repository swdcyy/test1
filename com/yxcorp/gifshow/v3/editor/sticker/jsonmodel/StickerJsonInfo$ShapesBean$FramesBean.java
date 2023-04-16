package com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean$FramesBean;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$Frame;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean$FramesBean$PivotBean;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean$FramesBean$SourceSizeBean;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean$FramesBean$SpriteSourceSizeBean;

public class StickerJsonInfo$ShapesBean$FramesBean implements Serializable	// class@001261
{
    public String filename;
    public StickerJsonInfo$Frame frame;
    public StickerJsonInfo$ShapesBean$FramesBean$PivotBean pivot;
    public boolean rotated;
    public StickerJsonInfo$ShapesBean$FramesBean$SourceSizeBean sourceSize;
    public StickerJsonInfo$ShapesBean$FramesBean$SpriteSourceSizeBean spriteSourceSize;
    public boolean trimmed;
    public static final long serialVersionUID = 0xe76e32317d1fe978;

    public void StickerJsonInfo$ShapesBean$FramesBean(){
       super();
    }
    public String getFilename(){
       return this.filename;
    }
    public StickerJsonInfo$Frame getFrame(){
       return this.frame;
    }
    public StickerJsonInfo$ShapesBean$FramesBean$PivotBean getPivot(){
       return this.pivot;
    }
    public StickerJsonInfo$ShapesBean$FramesBean$SourceSizeBean getSourceSize(){
       return this.sourceSize;
    }
    public StickerJsonInfo$ShapesBean$FramesBean$SpriteSourceSizeBean getSpriteSourceSize(){
       return this.spriteSourceSize;
    }
    public boolean isRotated(){
       return this.rotated;
    }
    public boolean isTrimmed(){
       return this.trimmed;
    }
    public void setFilename(String p0){
       this.filename = p0;
    }
    public void setFrame(StickerJsonInfo$Frame p0){
       this.frame = p0;
    }
    public void setPivot(StickerJsonInfo$ShapesBean$FramesBean$PivotBean p0){
       this.pivot = p0;
    }
    public void setRotated(boolean p0){
       this.rotated = p0;
    }
    public void setSourceSize(StickerJsonInfo$ShapesBean$FramesBean$SourceSizeBean p0){
       this.sourceSize = p0;
    }
    public void setSpriteSourceSize(StickerJsonInfo$ShapesBean$FramesBean$SpriteSourceSizeBean p0){
       this.spriteSourceSize = p0;
    }
    public void setTrimmed(boolean p0){
       this.trimmed = p0;
    }
}
