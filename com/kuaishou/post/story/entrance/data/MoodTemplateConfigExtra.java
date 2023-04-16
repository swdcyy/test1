package com.kuaishou.post.story.entrance.data.MoodTemplateConfigExtra;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class MoodTemplateConfigExtra implements Serializable	// class@000b33
{
    public int defaultInputTextColorIndex;
    public String extra;
    public int previewLayoutType;
    public String previewTextColor;
    public String stickerColor;
    public int stickerId;
    public double stickerPercentX;
    public double stickerPercentY;
    public int type;

    public void MoodTemplateConfigExtra(){
       super();
       this.type = -1;
       this.previewTextColor = "#80FFFFFF";
       this.previewLayoutType = 1;
       this.stickerId = -1;
       this.stickerPercentX = 0x3fe0000000000000;
       this.stickerPercentY = 0x3fe0000000000000;
       this.stickerColor = "#80FFFFFF";
       this.extra = "";
    }
    public final int getDefaultInputTextColorIndex(){
       return this.defaultInputTextColorIndex;
    }
    public final String getExtra(){
       return this.extra;
    }
    public final int getPreviewLayoutType(){
       return this.previewLayoutType;
    }
    public final String getPreviewTextColor(){
       return this.previewTextColor;
    }
    public final String getStickerColor(){
       return this.stickerColor;
    }
    public final int getStickerId(){
       return this.stickerId;
    }
    public final double getStickerPercentX(){
       return this.stickerPercentX;
    }
    public final double getStickerPercentY(){
       return this.stickerPercentY;
    }
    public final int getType(){
       return this.type;
    }
    public final void setDefaultInputTextColorIndex(int p0){
       this.defaultInputTextColorIndex = p0;
    }
    public final void setExtra(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateConfigExtra.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.extra = p0;
       return;
    }
    public final void setPreviewLayoutType(int p0){
       this.previewLayoutType = p0;
    }
    public final void setPreviewTextColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateConfigExtra.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.previewTextColor = p0;
       return;
    }
    public final void setStickerColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateConfigExtra.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.stickerColor = p0;
       return;
    }
    public final void setStickerId(int p0){
       this.stickerId = p0;
    }
    public final void setStickerPercentX(double p0){
       this.stickerPercentX = p0;
    }
    public final void setStickerPercentY(double p0){
       this.stickerPercentY = p0;
    }
    public final void setType(int p0){
       this.type = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MoodTemplateConfigExtra.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MoodTemplateConfigExtra\(type="+this.type+", stickerId=\'"+this.stickerId+"\', extra=\'"+this.extra+"\'\)";
    }
}
