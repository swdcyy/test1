package com.kuaishou.edit.draft.DynamicStickerParam$b;
import z30.w;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.DynamicStickerParam;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.DynamicStickerParam$a;
import com.kuaishou.edit.draft.Frame$b;
import com.kuaishou.edit.draft.Frame;
import java.util.List;
import java.util.Collections;

public final class DynamicStickerParam$b extends GeneratedMessageLite$Builder implements w	// class@001771
{

    public void DynamicStickerParam$b(){
       super(DynamicStickerParam.DEFAULT_INSTANCE);
    }
    public void DynamicStickerParam$b(DynamicStickerParam$a p0){
       super(DynamicStickerParam.DEFAULT_INSTANCE);
    }
    public DynamicStickerParam$b a(Frame$b p0){
       this.copyOnWrite();
       this.instance.addFrames(p0);
       return this;
    }
    public DynamicStickerParam$b b(int p0){
       this.copyOnWrite();
       this.instance.setAnimatedSubAssetFileType(p0);
       return this;
    }
    public DynamicStickerParam$b c(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableRecyclePlay(p0);
       return this;
    }
    public DynamicStickerParam$b d(double p0){
       this.copyOnWrite();
       this.instance.setFrameRate(p0);
       return this;
    }
    public int getAnimatedSubAssetFileType(){
       return this.instance.getAnimatedSubAssetFileType();
    }
    public boolean getDisableRecyclePlay(){
       return this.instance.getDisableRecyclePlay();
    }
    public double getFrameRate(){
       return this.instance.getFrameRate();
    }
    public Frame getFrames(int p0){
       return this.instance.getFrames(p0);
    }
    public int getFramesCount(){
       return this.instance.getFramesCount();
    }
    public List getFramesList(){
       return Collections.unmodifiableList(this.instance.getFramesList());
    }
}
